package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

public class PermutateTransaction {

	private final static int PROCESSING_CODE 					=  3;
	private final static int TRANSACTION_TYPE 					=  0;	 
	private final static int ACCOUNT_FROM_TYPE 					=  1;	 
	private final static int ACCOUNT_TO_TYPE 					=  2;	 
	
	private final static int POINT_OF_SERVICE_ENTRY_MODE 		= 22;
	private final static int TRANSACTION_ENTRY_MODE 			=  0;
	private final static int PIN_ENTRY_MODE 					=  1;
	
	private final static int POINT_OF_SERVICE_CONDITION_CODE 	= 25;
	
	static List<CodeBean> transactionTypeList 				= new ArrayList<CodeBean>();
    static List<CodeBean> accountFromTypeList 				= new ArrayList<CodeBean>();
    static List<CodeBean> accountToTypeList 				= new ArrayList<CodeBean>();
    static List<CodeBean> transactionEntryMode 				= new ArrayList<CodeBean>();
    static List<CodeBean> pinEntryMode 						= new ArrayList<CodeBean>();
    static List<CodeBean> pointOfServiceConditionCodeList 	= new ArrayList<CodeBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectTransaction(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE CODE_FIELD IN ( 3, 22, 25 ) ORDER BY ID";
        
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
	public List<CodeBean> select(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE CODE_FIELD IN ( 3, 22, 25 ) ORDER BY ID";
        
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
    	
			if (code.getCodeField() == PROCESSING_CODE && code.getCodeSubfield() == TRANSACTION_TYPE)
				transactionTypeList.add(code);
			if (code.getCodeField() == PROCESSING_CODE && code.getCodeSubfield() == ACCOUNT_FROM_TYPE)
				accountFromTypeList.add(code);
			if (code.getCodeField() == PROCESSING_CODE && code.getCodeSubfield() == ACCOUNT_TO_TYPE)
				accountToTypeList.add(code);
       	
			if (code.getCodeField() == POINT_OF_SERVICE_ENTRY_MODE && code.getCodeSubfield() == TRANSACTION_ENTRY_MODE)
				transactionEntryMode.add(code);
			if (code.getCodeField() == POINT_OF_SERVICE_ENTRY_MODE && code.getCodeSubfield() == PIN_ENTRY_MODE)
				pinEntryMode.add(code);
    	
			if (code.getCodeField() == POINT_OF_SERVICE_CONDITION_CODE)
				pointOfServiceConditionCodeList.add(code);
			
		}
		
		System.out.println(codeList);
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i, int j, int k, int l, int m, int n) {
	
		String answer = null;
		
		String s1 =
		
				"0100/0110" 								+	
				"  "										+
				transactionTypeList.get(i).getCodeName()	+
				";"											+
				accountFromTypeList.get(j).getCodeName()	+
				";"											+
				accountToTypeList.get(k).getCodeName()		+
				";"											+
				transactionEntryMode.get(l).getCodeName()	+
				";"											+
				pinEntryMode.get(m).getCodeName()			+
				";"											+
				pointOfServiceConditionCodeList.get(n).getCodeName();

		String s2 =
		
				"0100/0110" 								+	
				"  "										+
				transactionTypeList.get(i).getCodeName()	+
				";"											+
				accountFromTypeList.get(j).getCodeName()	+
				";"											+
				accountToTypeList.get(k).getCodeName()		+
				";"											+
				transactionEntryMode.get(l).getCodeName()	+
				";"											+
				pinEntryMode.get(m).getCodeName();

		String s3 =
				
				"0100/0110" 								+	
				"  "										+
				transactionTypeList.get(i).getCodeName()	+
				";"											+
				accountFromTypeList.get(j).getCodeName()	+
				";"											+
				accountToTypeList.get(k).getCodeName()		+
				";"											+
				transactionEntryMode.get(l).getCodeName();

		String s4 =
				
				"0100/0110" 								+	
				"  "										+
				transactionTypeList.get(i).getCodeName()	+
				";"											+
				accountFromTypeList.get(j).getCodeName()	+
				";"											+
				accountToTypeList.get(k).getCodeName();
		
		if (s1.length() < 101)
			answer = s1;
		else if (s2.length() < 101)
			answer = s2;
		else if (s3.length() < 101)
			answer = s3;
		else if (s4.length() < 101)
			answer = s4;
		
		return answer;
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display()
	{
		for (int i = 0; i < transactionTypeList.size(); i++) {
			
			for (int j = 0; j < accountFromTypeList.size(); j++) {
				
				for (int k = 0; k < accountToTypeList.size(); k++) {
					
					for (int l = 0; l < transactionEntryMode.size(); l++) {
						
						for (int m = 0; m < pinEntryMode.size(); m++) {	
						
							for (int n = 0; n < pointOfServiceConditionCodeList.size(); n++) {
							
								System.out.println(formatString(i,j,k,l,m,n));		   
								
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
	public static void main(String[] args) {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriver(new oracle.jdbc.driver.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("secret");
		     
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<CodeBean> codeList = new PermutateTransaction().selectTransaction (jdbcTemplate);
		
		new PermutateTransaction().load ( codeList );
		
		new PermutateTransaction().display ();
		
		System.out.println("0100/0110  1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
	}
	
}
