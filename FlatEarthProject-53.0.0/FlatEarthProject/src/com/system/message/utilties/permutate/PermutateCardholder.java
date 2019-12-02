package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

public class PermutateCardholder {

	private final static int CARDHOLDER_ID_METHOD	= 60;	//	60.5
	private final static int FORM_FACTOR_INDICATOR	= 55;	// 	9F6E
	
	static List<CodeBean> cardholderIdMethodList 	= new ArrayList<CodeBean>();
	static List<CodeBean> formFactorIndicatorList 	= new ArrayList<CodeBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectCountryCode(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE (CODE_FIELD = 55 AND CODE_VALUE = '9F6E') OR (CODE_FIELD = 60 AND CODE_SUBFIELD = 5) ORDER BY ID";
        
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
    	
			if (code.getCodeField() == CARDHOLDER_ID_METHOD)
				cardholderIdMethodList.add(code);
			
			if (code.getCodeField() == FORM_FACTOR_INDICATOR)
				formFactorIndicatorList.add(code);
		}
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i, int j) {
	
		String answer =
		
				cardholderIdMethodList.get(i).getCodeName() + "   " + formFactorIndicatorList.get(j).getCodeName();				 

		return answer;
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display()
	{
		
		int count = 0;
		
		for (int i = 0; i < cardholderIdMethodList.size(); i++) {
			
			for (int j = 0; j < formFactorIndicatorList.size(); j++) {
			
				System.out.println(++count + ". " + formatString(i,j));
			
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
		
		List<CodeBean> codeList = new PermutateCardholder().selectCountryCode (jdbcTemplate);
		
		new PermutateCardholder().load ( codeList );
		
		System.out.println();
		System.out.println(cardholderIdMethodList.size());
		System.out.println(formFactorIndicatorList.size());
		System.out.println();
		
		new PermutateCardholder().display ();
		
		System.out.println();
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
	}
	
}
