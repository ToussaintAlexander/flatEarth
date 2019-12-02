package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

public class PermutateTerminal {

	private final static int TERMINAL_TYPE_CODE 				= 0;	//	Subfield=0
	private final static int TERMINAL_ENTRY_CAPABILITY 			= 1;	//	Subfield=1	 
	private final static int CHIP_CONDITION_CODE 				= 2;	//	Subfield=2 
	private final static int CHIP_AUTHENTICATON_INDICATOR		= 3;	//	Subfield=3;	Chip Authentication Reliability Indicator 
	private final static int MOTO_COMMERCE_INDICATOR			= 4;	//  Subfield=4;	Mail Order/Telephone Order/Electronic Commerce Indicator
	private final static int CARDHOLDER_ID_METHOD				= 5;	//  Subfield=5;	Cardholder ID Method
	private final static int PARTIAL_AUTHORIZATION_INDICATOR	= 6;	//  Subfield=6;	Partial Authorization / Balance Indicator
	
	static List<CodeBean> terminalTypeCodeList 					= new ArrayList<CodeBean>();
    static List<CodeBean> terminalEntryCapability 				= new ArrayList<CodeBean>();
    static List<CodeBean> chipConditionCode 					= new ArrayList<CodeBean>();
    static List<CodeBean> chipAuthenticationIndicator			= new ArrayList<CodeBean>();
    static List<CodeBean> motoCommerceIndicator 				= new ArrayList<CodeBean>();
    static List<CodeBean> cardholderIdMethod 					= new ArrayList<CodeBean>();
    static List<CodeBean> partialAuthorizationIndicator			= new ArrayList<CodeBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectCountryCode(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE CODE_FIELD = 60 ORDER BY ID";
        
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
    	
			if (code.getCodeSubfield() == TERMINAL_TYPE_CODE) {
				terminalTypeCodeList.add(code);
				//System.out.println("terminalTypeCode = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == TERMINAL_ENTRY_CAPABILITY) {
				terminalEntryCapability.add(code);
				//System.out.println("terminalEntryCapability = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == CHIP_CONDITION_CODE) {
				chipConditionCode.add(code);
				//System.out.println("chipConditionCode = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == CHIP_AUTHENTICATON_INDICATOR) {
				chipAuthenticationIndicator.add(code);
				//System.out.println("chipAuthenticationIndicator = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == MOTO_COMMERCE_INDICATOR) {
				motoCommerceIndicator.add(code);
				//System.out.println("motoCommerceIndicator = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == CARDHOLDER_ID_METHOD) {
				cardholderIdMethod.add(code);
				//System.out.println("cardholderIdMethod = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
			
			if (code.getCodeSubfield() == PARTIAL_AUTHORIZATION_INDICATOR) {
				partialAuthorizationIndicator.add(code);
				//System.out.println("partialAuthorizationIndicator = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			}
    	
		}
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i, int j, int k, int l, int m, int n, int o) {
	
		String answer =
		
				terminalTypeCodeList.get(i).getCodeName()			+
				";"													+
				terminalEntryCapability.get(j).getCodeName()		+
				";"													+
				chipConditionCode.get(k).getCodeName()				+
				";"													+
				chipAuthenticationIndicator.get(l).getCodeName()	+
				";"													+
				motoCommerceIndicator.get(m).getCodeName()			+
				";"													+
				cardholderIdMethod.get(n).getCodeName() 			+
				";"													+
				partialAuthorizationIndicator.get(o).getCodeName();
		
		return answer;
		
	}
	/************************************************************************************
	 * 15,360
	 ************************************************************************************
	 */	
	public void display()
	{
		int count = 0;
		
		for (int i = 0; i < terminalTypeCodeList.size(); i++) {
			
			for (int j = 0; j < terminalEntryCapability.size(); j++) {
				
				for (int k = 0; k < chipConditionCode.size(); k++) {
					
					for (int l = 0; l < chipAuthenticationIndicator.size(); l++) {
						
						for (int m = 0; m < motoCommerceIndicator.size(); m++) {	
							
							for (int n = 0; n < cardholderIdMethod.size(); n++) {	
								
								for (int o = 0; o < partialAuthorizationIndicator.size(); o++) {	
							
									System.out.println(++count + ". " + formatString(i, j, k, l, m, n, o));
									
								}
								
							}
								
						}
					}
					
				}
				
			}
			
		}

	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static void displaySize () {
		
		System.out.println();
		System.out.println("terminalTypeCode 				= " + terminalTypeCodeList.size());
		System.out.println("terminalEntryCapability 		= " + terminalEntryCapability.size());
		System.out.println("chipConditionCode 				= " + chipConditionCode.size());
		System.out.println("chipAuthenticationIndicator		= " + chipAuthenticationIndicator.size());
		System.out.println("motoCommerceIndicator 			= " + motoCommerceIndicator.size());
		System.out.println("cardholderIdMethod 				= " + cardholderIdMethod.size());
		System.out.println("partialAuthorizationIndicator 	= " + partialAuthorizationIndicator.size());
		System.out.println();
		
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
		
		List<CodeBean> codeList = new PermutateTerminal().selectCountryCode (jdbcTemplate);
		
		new PermutateTerminal().load ( codeList );
		
		new PermutateTerminal().display ();
		
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
		
		displaySize ();
		
	}
	
}
