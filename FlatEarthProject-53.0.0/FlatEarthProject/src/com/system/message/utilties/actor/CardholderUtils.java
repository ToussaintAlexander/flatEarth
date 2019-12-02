package com.system.message.utilties.actor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class CardholderUtils {

	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void select(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM CARDHOLDER_NAME_TABLE ORDER BY ID";
        
        List<CardholderNameBean> cardholderNameList = jdbcTemplate.query(sqlSelect, new RowMapper<CardholderNameBean>() {
 
            public CardholderNameBean mapRow(ResultSet result, int rowNum) throws SQLException {
            	
            	CardholderNameBean cardholderName = new CardholderNameBean();
            	
                cardholderName.setId				(result.getInt			("ID"));
                cardholderName.setFirstName			(result.getString		("FIRST_NAME"));
                cardholderName.setLastName			(result.getString		("LAST_NAME"));
                cardholderName.setNationality		(result.getString		("NATIONALITY"));
                cardholderName.setCreateUser		(result.getString		("CREATE_USER"));
                cardholderName.setCreateTimestamp	(result.getTimestamp	("CREATE_TIMESTAMP"));
                cardholderName.setModifyUser		(result.getString		("MODIFY_USER"));
                cardholderName.setModifyTimestamp	(result.getTimestamp	("MODIFY_TIMESTAMP"));
                 
                return cardholderName;
            }
             
        });
         
        for (CardholderNameBean cardholderName : cardholderNameList) {
            System.out.println(cardholderName.getFirstName() 		+
            				  "  "									+
            				   cardholderName.getLastName()  		+
            				  "  "									+
            				   cardholderName.getNationality());
        }
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public static void main(String[] args) {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriver(new oracle.jdbc.driver.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("secret");
		     
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		new CardholderUtils().select (jdbcTemplate);
		
	}
	
}
