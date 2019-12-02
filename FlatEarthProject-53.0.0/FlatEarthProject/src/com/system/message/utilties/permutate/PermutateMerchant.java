package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.system.language.code.model.CodeBean;

public class PermutateMerchant {

	private final static int MERCHANT_CATEGORY_CODE	= 18;
	
	static List<CodeBean> merchantCategoryCodeList 	= new ArrayList<CodeBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<CodeBean> selectCountryCode(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CODE_TABLE  WHERE CODE_FIELD = 18 ORDER BY ID";
        
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
    	
			if (code.getCodeField() == MERCHANT_CATEGORY_CODE)
				merchantCategoryCodeList.add(code);
    	
		}
		
    }
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static String formatString (int i) {
	
		String answer =
		
				merchantCategoryCodeList.get(i).getCodeValue() + "   " + merchantCategoryCodeList.get(i).getCodeName();				 

		return answer;
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display()
	{
		for (int i = 0; i < merchantCategoryCodeList.size(); i++) {
			
			System.out.println(formatString(i));
								
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
		
		List<CodeBean> codeList = new PermutateMerchant().selectCountryCode (jdbcTemplate);
		
		new PermutateMerchant().load ( codeList );
		
		System.out.println(merchantCategoryCodeList.size());
		
		new PermutateMerchant().display ();
		
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
	}
	
}
