package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

public class PermutateCountryCode {

	private final static int PAN_EXTENDED_COUNTRY_CODE 			= 20;
	private final static int TRANSACTION_CURRENCY_CODE 			= 49;	 
	private final static int TERMINAL_COUNTRY_CODE 				= 55;	//CODE_VALUE= 9F1A 
	private final static int ACQUIRING_INSTITUTION_COUNTRY_CODE = 19;	 
	private final static int SERVICE_RESTRICTION_CODE 			= 40;
	
	static List<CodeBean> panExtendedCountryCodeList 			= new ArrayList<CodeBean>();
    static List<CodeBean> transactionCurrencyCodeList 			= new ArrayList<CodeBean>();
    static List<CodeBean> terminalCountryCodeList 				= new ArrayList<CodeBean>();
    static List<CodeBean> acquiringInstitutionCountryCodeList 	= new ArrayList<CodeBean>();
    static List<CodeBean> serviceRestrictionCodeList 			= new ArrayList<CodeBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectCountryCode(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE CODE_FIELD IN ( 19, 20, 40, 49 ) OR  (CODE_FIELD = 55 AND CODE_VALUE = '9F1A') ORDER BY ID";
        
        List<CodeBean> codeList = jdbcTemplate.query(sqlSelect, new RowMapper<CodeBean>() {

            public CodeBean mapRow(ResultSet result, int rowNum) throws SQLException {
            	
            	CodeBean code = new CodeBean();
            	
                code.setId				(result.getInt			("ID"));
                code.setCodeField		(result.getInt			("CODE_FIELD"));
                code.setCodeSubfield	(result.getInt			("CODE_SUBFIELD"));
                code.setCodeValue		(result.getString		("CODE_VALUE"));
                code.setCodeName		(result.getString		("CODE_NAME"));
                code.setDescription		(result.getString		("DESCRIPTION"));
                code.setCreateUser		(result.getString		("CREATE_USER"));
                code.setCreateTimestamp	(result.getTimestamp	("CREATE_TIMESTAMP"));
                code.setModifyUser		(result.getString		("MODIFY_USER"));
                code.setModifyTimestamp	(result.getTimestamp	("MODIFY_TIMESTAMP"));
                
                return code;
                
            }
         
        });
         
        return codeList;
        
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void load(List<CodeBean> codeList) {
		
		for (CodeBean code : codeList) {
    	
			if (code.getCodeField() == PAN_EXTENDED_COUNTRY_CODE) {
				panExtendedCountryCodeList.add(code);
				System.out.println("pan = " + code.getCodeValue());
			}
			
			if (code.getCodeField() == TRANSACTION_CURRENCY_CODE) {
				transactionCurrencyCodeList.add(code);
				System.out.println("trn = " + code.getCodeField() + " " + code.getCodeValue());
			}
			
			if (code.getCodeField() == TERMINAL_COUNTRY_CODE) {
				terminalCountryCodeList.add(code);
				System.out.println("trm = " + code.getCodeField() + " " + code.getCodeValue());
			}
			
			if (code.getCodeField() == ACQUIRING_INSTITUTION_COUNTRY_CODE) {
				acquiringInstitutionCountryCodeList.add(code);
				System.out.println("acq = " + code.getCodeValue());
			}
			
			if (code.getCodeField() == SERVICE_RESTRICTION_CODE) {
				serviceRestrictionCodeList.add(code);
				System.out.println("srv = " + code.getCodeValue());
			}
    	
		}
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i, int j, int k, int l, int m) {
	
		String answer =
		
				panExtendedCountryCodeList.get(i).getCodeName()				+
				";"															+
				transactionCurrencyCodeList.get(j).getCodeName()			+
				";"															+
				terminalCountryCodeList.get(k).getCodeName()				+
				";"															+
				acquiringInstitutionCountryCodeList.get(l).getCodeName()	+
				";"															+
				serviceRestrictionCodeList.get(m).getCodeName();

		return answer;
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display()
	{
		for (int i = 0; i < panExtendedCountryCodeList.size(); i++) {
			
			for (int j = 0; j < transactionCurrencyCodeList.size(); j++) {
				
				for (int k = 0; k < terminalCountryCodeList.size(); k++) {
					
					for (int l = 0; l < acquiringInstitutionCountryCodeList.size(); l++) {
						
						for (int m = 0; m < serviceRestrictionCodeList.size(); m++) {	
							
								System.out.println(formatString(i,j,k,l,m));
								
						}
					}
					
				}
				
			}
			
		}

	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static void main(String[] args) {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriver(new oracle.jdbc.driver.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("secret");
		     
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<CodeBean> codeList = new PermutateCountryCode().selectCountryCode (jdbcTemplate);
		
		new PermutateCountryCode().load ( codeList );
		
		//System.out.println(panExtendedCountryCodeList.size());
		//System.out.println(transactionCurrencyCodeList.size());
		//System.out.println(terminalCountryCodeList.size());
		//System.out.println(acquiringInstitutionCountryCodeList.size());
		//System.out.println(serviceRestrictionCodeList.size());
		
		new PermutateCountryCode().display ();
		
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
	}
	
}
