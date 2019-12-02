package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

// https://developer.moneris.com/More/Testing/CAVV%20Result%20Codes
// https://en.wikipedia.org/wiki/3-D_Secure

public class PermutateCard {
	
	private final static int ADDRESS_VERIFICATION_RESULT_CODE 			= 2;	 
	private final static int CVV_ICVV_DCVV_RESULTS_CODE 				= 5;	 
	private final static int CVV2_RESULTS_CODE   						= 10;	 
	private final static int CARD_AUTHENTICATION_VERIFICATION_VALUE 	= 13;
//	private final static int EXPIRATION_DATE 							= 14;
//	private final static int PERSONAL_IDENTIFICATION_NUMBER 			= 52;
	
	private final String CREATE_USER = "TALEXAND";
	private Timestamp CREATE_TIMESTAMP = null;
	private final String MODIFY_USER = "TALEXAND";
	private Timestamp MODIFY_TIMESTAMP = null;
	
	static List<CodeBean> addressVerificationResultCode 				= new ArrayList<CodeBean>();
    static List<CodeBean> cvvDcvvResultsCode 							= new ArrayList<CodeBean>();
    static List<CodeBean> cvv2ResultsCode 								= new ArrayList<CodeBean>();
    static List<CodeBean> cardAuthenticationVerificationValue 			= new ArrayList<CodeBean>();
    static List<CodeBean> expirationDate 								= new ArrayList<CodeBean>();
    static List<CodeBean> personalIdentificationNumber 					= new ArrayList<CodeBean>();
    
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectCountryCode(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE WHERE CODE_FIELD IN ( 14, 52 ) OR  (CODE_FIELD = 44 AND CODE_SUBFIELD IN ( 2, 5, 10, 13 )) ORDER BY ID";
        
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
	 *	Placeholder	-1	0	+1
		
		Expiration Date		-1 = Before Expiration		0 = Expiration Date		+1 = After Expiration
		Personal ID Nbr		-1 = Not Match				0 = Missing				+1 = Match
			
	 ************************************************************************************
	 */	
	public void loadPlacedholders() {
	
			CodeBean code1 = new CodeBean(1, 14, -1, " ", "Before Expiration"	, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
			CodeBean code2 = new CodeBean(2, 14,  0, " ", "Expiration Date"		, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
			CodeBean code3 = new CodeBean(3, 14,  1, " ", "After Expiration"	, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		 
			expirationDate.add(code1);
			expirationDate.add(code2);
			expirationDate.add(code3);
		 
			CodeBean code4 = new CodeBean(1, 52, -1, " ", "No Match"	, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
			CodeBean code5 = new CodeBean(2, 52,  0, " ", "Missing"		, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
			CodeBean code6 = new CodeBean(3, 52,  1, " ", "Yes Match"	, "Description Placeholder", CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
			
			personalIdentificationNumber.add(code4);
			personalIdentificationNumber.add(code5);
			personalIdentificationNumber.add(code6);
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void load(List<CodeBean> codeList) {
		
		for (CodeBean code : codeList) {
    	
			System.out.println("Answer = " + code.getCodeField() + " " + code.getCodeSubfield() + " " + code.getCodeValue());
			
			if (code.getCodeSubfield() == ADDRESS_VERIFICATION_RESULT_CODE)
				addressVerificationResultCode.add(code);
			if (code.getCodeSubfield() == CVV_ICVV_DCVV_RESULTS_CODE)
				cvvDcvvResultsCode.add(code);
			if (code.getCodeSubfield() == CVV2_RESULTS_CODE)
				cvv2ResultsCode.add(code);
			if (code.getCodeSubfield() == CARD_AUTHENTICATION_VERIFICATION_VALUE)
				cardAuthenticationVerificationValue.add(code);
			
		}
		
		loadPlacedholders ();
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i, int j, int k, int l, int m, int n) {
	
		String answer =
		
				addressVerificationResultCode.get(i).getCodeName()			+
				";"															+
				cvvDcvvResultsCode.get(j).getCodeName()						+
				";"															+
				cvv2ResultsCode.get(k).getCodeName()						+
				";"															+
				cardAuthenticationVerificationValue.get(l).getCodeName()	+
				";"															+
				expirationDate.get(m).getCodeName()							+
				";"															+
				personalIdentificationNumber.get(n).getCodeName();

		return answer;
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display()
	{
		int count = 0;
		
		for (int i = 0; i < addressVerificationResultCode.size(); i++) {
			
			for (int j = 0; j < cvvDcvvResultsCode.size(); j++) {
				
				for (int k = 0; k < cvv2ResultsCode.size(); k++) {
					
					for (int l = 0; l < cardAuthenticationVerificationValue.size(); l++) {
						
						for (int m = 0; m < expirationDate.size(); m++) {	
							
							for (int n = 0; m < personalIdentificationNumber.size(); m++) {
							
								System.out.println("Card = " + ++count + " " + formatString(i,j,k,l,m,n));
								
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
		
		List<CodeBean> codeList = new PermutateCard().selectCountryCode (jdbcTemplate);
		
		new PermutateCard().load ( codeList );
		
		new PermutateCard().display ();
		
		System.out.println();
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
		
		System.out.println();
		System.out.println("AVS  = " + addressVerificationResultCode.size());
		System.out.println("CVV  = " + cvvDcvvResultsCode.size());
		System.out.println("CVV2 = " + cvv2ResultsCode.size());
		System.out.println("CAVV = " + cardAuthenticationVerificationValue.size());
		System.out.println("EXP  = " + expirationDate.size());
		System.out.println("PIN  = " + personalIdentificationNumber.size());
		System.out.println();
		
	}
	
}
