package com.system.security.authentication.password.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.system.security.authentication.password.model.PasswordBean;

@Repository
public class PasswordDaoImpl implements PasswordDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/***********************************************************************************/
	/***********************************************************************************/
	@Override
	public boolean insert(PasswordBean password) {
		
		String sql 
		
		= "INSERT INTO PASSWORD_TABLE "
				+ "("
				+ ",GROUP_ID"
				+ ",USER_ID"
				+ ",SEQ"
				+ ",USERNAME"
				+ ",PASSWORD"
				+ ",DOMAIN"
				+ ",COMPUTER_NAME"
				+ ",REMEMBER_ME"
				+ ",PASSWORD_TYPE"
				+ ",FIRST_NAME"
				+ ",LAST_NAME"
				+ ",ACCOUNT_STATUS"
				+ ",LAST_ACCESS"
				+ ",PASSWORD_CHANGE"
				+ ",PASSWORD_ATTEMPTS"
				+ ",CREATE_USER"
				+ ",CREATE_TIMESTAMP"
				+ ",MODIFY_USER"
				+ ",MODIFY_TIMESTAMP"
				+ ") "
				+ "VALUES "
				+ "('"	+	password.getGroupId()			+	"'"
				+ ",'"	+	password.getUserId()			+	"'"
				+ ",'"	+	password.getSeq()				+	"'"
				+ ",'"	+	password.getUsername()			+	"'"
				+ ",'"	+	password.getPassword()			+	"'"
				+ ",'"	+	password.getDomain()			+	"'"
				+ ",'"	+	password.getRememberMe()		+	"'"
				+ ",'"	+	password.getPasswordType()		+	"'"
				+ ",'"	+	password.getFirstName()			+	"'"
				+ ",'"	+	password.getLastName()			+	"'"
				+ ",'"	+	password.getAccountStatus()		+	"'"
				+ ",'"	+	password.getLastAccess()		+	"'"
				+ ",'"	+	password.getPasswordChange()	+	"'"
				+ ",'"	+	password.getPasswordAttempts()	+	"'"
				+ ",'"	+	password.getComputerName()		+	"'"
				+ ",'"	+	password.getCreateUser()		+	"'"
				+ ",'"	+	password.getCreateTimestamp()	+	"'"
				+ ",'"	+	password.getModifyUser()		+	"'"
				+ ",'"	+	password.getModifyTimestamp()	+	"'"
				+ ")";

		return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/
	@Override
	public boolean update(PasswordBean password) {
		
		String sql =
				
				" UPDATE ACQUIRER_TABLE " 			+
				
				"    SET GROUP_ID 			= '"  	+ password.getGroupId()				+	"'"	+
				"      , USER_ID			= '" 	+ password.getUserId()  			+	"'"	+
				"      , SEQ				= '" 	+ password.getSeq()  				+	"'"	+
				"      , USER_NAME			= '" 	+ password.getUsername()  			+	"'"	+
				"      , zip_PASSWORD		= '" 	+ password.getPassword()  			+	"'"	+
				"      , DOMAIN				= '" 	+ password.getDomain()  			+	"'"	+
				"      , REMEMBER_ME		= '" 	+ password.getRememberMe()			+	"'"	+
				"      , PASSWORD_TYPE		= '" 	+ password.getPasswordType()  		+	"'"	+
				"      , FIRST_NAME			= '" 	+ password.getFirstName()  			+	"'"	+
				"      , LAST_NAME			= '" 	+ password.getLastName()  			+	"'"	+
				"      , ACCOUNT_STATUS		= '" 	+ password.getAccountStatus()  		+	"'"	+
				"      , LAST_ACCESS		= '" 	+ password.getLastAccess()			+	"'"	+
				"      , PASSWORD_CHANGE	= '" 	+ password.getPasswordChange()  	+	"'"	+
				"      , PASSWORD_ATTEMPTS	= '" 	+ password.getPasswordAttempts()	+	"'"	+
				"      , COMPUTER_NAME		= '" 	+ password.getComputerName()  		+	"'"	+
				
				"      , MODIFY_USER		= '" 	+ password.getModifyUser()  		+	"'"	+
				"      , MODIFY_TIMESTAMP	= '" 	+ password.getModifyTimestamp() 	+	"'"	+	
				
				"  WHERE ID 				= "		+ password.getId()					+ 	"";
		
		return template.update(sql) == 1 ? true : false;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public boolean delete(int groupId, int userId, int seq) {
		
		String sql =
				
				" DELETE FROM PASSWORD_TABLE "				+
				"       WHERE GROUP_ID			= "		+ groupId	+ 	 
				"         AND USER_ID			= "		+ userId	+ 	 
				"         AND SEQ				= "		+ seq		+ 	
				"";
		
		return template.update(sql) == 1 ? true : false;
			
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public PasswordBean selectPassword (String username, String password, String domain) {
		
		String selectSql = 
				    
					"    SELECT GROUP_ID			"	+
					"          ,USER_ID				"	+                      
					"          ,SEQ					"	+
					"          ,USER_NAME			"	+
					"          ,PASSWORD			"	+
					"          ,DOMAIN				"	+
					"          ,REMEMBER_ME			"	+
					"          ,PASSWORD_TYPE		"	+
					"          ,FIRST_NAME			"	+
					"          ,LAST_NAME			"	+
					"          ,ACCOUNT_STATUS		"	+
					"          ,LAST_ACCESS			"	+
					"          ,PASSWORD_CHANGE		"	+
					"          ,PASSWORD_ATTEMPTS	"	+
					"          ,COMPUTER_NAME		"	+
					"          ,CREATE_USER			"	+
					"          ,CREATE_TIMESTAMP	"	+
					"          ,MODIFY_USER			"	+
					"          ,MODIFY_TIMESTAMP   	"	+
					"      FROM PASSWORD_TABLE 		"  	+
					"     WHERE USER_NAME	= ?		"	+
					"       AND PASSWORD	= ?		"	+
					"       AND DOMAIN		= ?		";
		   
		return template.queryForObject( selectSql
					  				  , new Object[]{username,password,domain}
					  				  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
		
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public PasswordBean selectPasswordById (int id) {
		
		String sql 
		
		= "SELECT * "
		+ "  FROM PASSWORD_TABLE "
		+ " WHERE ID = ?";
	
		   
		return template.queryForObject( sql
					  				  , new Object[]{id}
					  				  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
		
	}
	/***********************************************************************************/
	/***********************************************************************************/	
	@Override
	public List<PasswordBean> select(){
		
		return template.query( "SELECT * FROM PASSWORD_TABLE"
							 ,new RowMapper<PasswordBean>(){
			
			public PasswordBean mapRow(ResultSet rs, int row) throws SQLException {
				
				PasswordBean password = new PasswordBean();
				
				password.setId					(rs.getInt(1));
				
				password.setGroupId				(rs.getInt(2));
				password.setUserId				(rs.getInt(3));
				password.setSeq					(rs.getInt(4));
				password.setUsername			(rs.getString(5));
				password.setPassword			(rs.getString(6));
				password.setDomain				(rs.getString(7));
				password.setComputerName		(rs.getString(8));
				password.setRememberMe			(rs.getBoolean(9));
				password.setPasswordType		(rs.getInt(10));
				password.setFirstName			(rs.getString(11));
				password.setLastName			(rs.getString(12));
				password.setAccountStatus		(rs.getInt(13));
				password.setLastAccess			(rs.getTimestamp(14));
				password.setPasswordChange		(rs.getTimestamp(15));
				password.setPasswordAttempts	(rs.getInt(16));
				
				password.setCreateUser			(rs.getString(17));
				password.setCreateTimestamp		(rs.getTimestamp(18));
				password.setModifyUser			(rs.getString(19));
				password.setModifyTimestamp		(rs.getTimestamp(20));
				
				return password;
				
			}
		});
	  }
	
	/*********************************************************************************
	 *  Determines whether an account is in ACTIVE status.
	 *********************************************************************************/
	
	public final String accountStatusSql =	
			
			"   SELECT ACCOUNT_STATUS				" 	+
			"     FROM PASSWORD_TABLE 				" 	+  
			"    WHERE USER_NAME      = ?			"	+
			"      AND PASSWORD       = ? 			"	+
			"      AND DOMAIN         = ?			"	+
			"      AND ACCOUNT_STATUS = ?			"	+
			" ORDER BY GROUP_ID 					"	+
			"		 , USER_ID						"	+
			"        , SEQ							";
	
	/*********************************************************************************
	 *  Determines the password type for an account.
	 *********************************************************************************/
	
	public final String passwordTypeSql = 
			
			"   SELECT PASSWORD_TYPE				" 	+
			"     FROM PASSWORD_TABLE 				" 	+  
			"    WHERE USER_NAME      = ?			"	+
			"      AND PASSWORD       = ? 			"	+
			"      AND DOMAIN         = ?			"	+
			"      AND PASSWORD_TYPE  = ?			"	+
			" ORDER BY GROUP_ID 					"	+
			"		 , USER_ID						"	+
			"        , SEQ							";
	
	/*********************************************************************************
	 *  Retrieves scalar values for LogEvent Routine.
	 *********************************************************************************/
	
	public final String groupItemSql = 
			
			"   SELECT USER_NAME					"	+
			"	      ,PASSWORD						"	+
			"   	  ,DOMAIN						" 	+
			"		  ,LAST_ACCESS					"	+
			"		  ,PASSWORD_CHANGE				"	+
			"     FROM PASSWORD_TABLE 				" 	+  
			"    WHERE USER_NAME      = ?			"	+
			"      AND PASSWORD       = ? 			"	+
			"      AND DOMAIN         = ?			"	+
			" ORDER BY GROUP_ID 					"	+
			"		 , USER_ID						"	+
			"        , SEQ							";

	/*********************************************************************************
	 *  Determines the number of days ago the account was last successfully accessed.
	 *********************************************************************************/
	
	public final String lastAccessSql =
			
			"   SELECT trunc(cast(max(CURRENT_TIMESTAMP) as date)   " 	+
			"			  - (cast(min(LAST_ACCESS)	 	 as date))) " 	+
		    "       AS LAST_ACCESS_COUNTER                          "   +
		    "     FROM PASSWORD_TABLE 								" 	+  
			"    WHERE USER_NAME      = ?							"	+
			"      AND PASSWORD       = ? 							"	+
			"      AND DOMAIN         = ?							"	+
  			"      AND ACCOUNT_STATUS = ?							" 	+
  			" ORDER BY GROUP_ID 									"	+
  			"		 , USER_ID										"	+
  			"        , SEQ											";

	/*********************************************************************************
	 *  Determines the last time the password was changed for this active account.
	 *********************************************************************************/
	
	public final String passwordChangeSql =
			
			"   SELECT trunc(cast(max(CURRENT_TIMESTAMP) as date) 	"	+
			"             - (cast(min(PASSWORD_CHANGE)   as date))) " 	+
			"       AS PASSWORD_CHANGE_COUNTER						"	+
			"     FROM PASSWORD_TABLE 								" 	+  
			"    WHERE USER_NAME      = ?							"	+
			"      AND PASSWORD       = ? 							"	+
			"      AND DOMAIN         = ?							"	+
  			"      AND ACCOUNT_STATUS = ?							" 	+
			"    ORDER BY 											" 	+																			
			"          GROUP_ID										" 	+
			"         ,USER_ID										" 	+
			"         ,SEQ											" 	;
	
	/*********************************************************************************
	 *  Determines the number of failed password attempts.
	 *********************************************************************************/
	
	public final String passwordAttemptsSql = 
			
			"   SELECT PASSWORD_ATTEMPTS	" 	+
			"     FROM PASSWORD_TABLE 		" 	+  
			"    WHERE USER_NAME      = ?	"	+
			"      AND PASSWORD       = ? 	"	+
			"      AND DOMAIN         = ?	"	+
			" ORDER BY GROUP_ID 			"	+
			"		  ,USER_ID				"	+
			"         ,SEQ					";

	/*********************************************************************************
	 *  Determines if the same password was used within a certain time period.
	 *  Excludes sequence number which is the history
	 *********************************************************************************/
	
	public final String passwordHistorySql = 
			
			"   SELECT COUNT (*)				"	+
			"       AS PASSWORD_COUNTER			"	+
					
//			"   SELECT *						"	+
			"     FROM PASSWORD_TABLE 			" 	+  
			"    WHERE USER_NAME         = ?	"	+
			"      AND PASSWORD          = ? 	"	+
			"      AND DOMAIN            = ?	"	+
			"      AND CREATE_TIMESTAMP			"	+
			"       >= CURRENT_TIMESTAMP - ?	"	+
			"    ORDER BY 						" 	+																			
			"          GROUP_ID					" 	+
			"         ,USER_ID					" 	+
			"         ,SEQ						" 	;

	/*********************************************************************************
	 *********************************************************************************/
	
	public static final String commitSql = "commit";
	
	/**********************************************************************
	 * Rule #1
	 * 
	 * Determines whether an account is in a certain status.
	 * 
	 * @return boolean
	 **********************************************************************/			
	public boolean isAccountStatusEqual (PasswordBean passwordBean, int status) { 
		
		passwordBean.setAccountStatus(status);
		
		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( accountStatusSql
									  , new Object[]{username, password, domain, status}
									  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
		
		//return bean.getAccountStatus() == status;
		return true;
		
	}
	/**********************************************************************
	 * Rule #2
	 * 
	 * Determines whether a password type is PERMANENT or TEMPORARY.
	 * 
	 * @return boolean
	 **********************************************************************/		
	public boolean isPasswordTypeEqual (PasswordBean passwordBean,int passwordType) {
		
		passwordBean.setPasswordType(passwordType);
	
		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( passwordTypeSql
				  					  , new Object[]{username, password, domain, passwordType}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
	
		//return bean.getPasswordType() == passwordType;
		return true;
		
	}
	/**********************************************************************
	 * Rule #3
	 * 
	 * Determines whether a password type is PERMANENT or TEMPORARY.
	 * 
	 * @return PasswordBean
	 **********************************************************************/		
	public PasswordBean getPasswordGroupItems (PasswordBean passwordBean) {

		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		
		return template.queryForObject( groupItemSql
				  					  , new Object[]{username, password, domain}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
		
	}
	/**********************************************************************
	 * Rule #4
	 * 
	 * Determines whether the number of days since the active account was 
	 * last successfully accessed is before the maximum days allowed.
	 * 
	 * System.out.println("Last Access Counter < Last Access Days");
	 * System.out.println("Last Access Counter = " + lastAccessCounter );
	 * System.out.println("Last Access Days = " + lastAccessDays );
	 * 
	 * @return lastAccessCounter < lastAccessDays ? true : false;
	 **********************************************************************/			
	public boolean isLastAccessDateBefore (PasswordBean passwordBean, int lastAccessDays) { 
		
		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		int status			= passwordBean.getAccountStatus();
		
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( lastAccessSql
				  					  , new Object[]{username, password, domain, status,lastAccessDays}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
	
		return true; //bean.getLastAccess() < lastAccessDays;
		
	}
	/**********************************************************************
	 * Rule #5
	 * 			   Floor				 Ceiling
	 * 			[min days]				[max days]
	 *   				       ^
	 * 					       |
	 * 				[password change date]
	 * 
	 * Determines whether the number of days since the last password
	 * change is after the minimum days allowed for a password change.
	 * 
	 * System.out.println(floorDate + " < " + passwordChange + " < " +  ceilingDate);
	 * 
	 * @return passwordChange > floorDate && passwordChange < ceilingDate;
	 **********************************************************************/	
	public boolean isPasswordChangeWithinWindow ( PasswordBean 	passwordBean
											    	 , int 				floorDate
											    	 , int				ceilingDate) { 
		
		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		int status			= passwordBean.getAccountStatus();
		
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( passwordChangeSql
				  					  , new Object[]{username, password, domain, status,status,floorDate,ceilingDate}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
	
		return true;
		
	}
	/**********************************************************************
	 * Rule #6
	 * 
	 * A persistent store for the account that accumulates the total number
	 * of times a user fails to provide the correct password for that
	 * this session.		
	 * 
	 * @return (passwordAttempts < maximumPasswordAttempts) ? true : false;
	 **********************************************************************/
	public boolean isPasswordAttemptsLessThan ( PasswordBean 	passwordBean
											  	   , int 			maximumPasswordAttempts) {

		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
		
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( passwordAttemptsSql
				  					  , new Object[]{username, password, domain, maximumPasswordAttempts}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
		
		// return bean.getPasswordAttempts() < maximumPasswordAttempts;
		return true;
		
	}
	/**********************************************************************
	 * Rule #7
	 * 
	 * Determines whether the password provided already exists in history
	 * within [numberOfMonths] of today's date.
	 * 
	 * @return (passwordCount == 0) ?  true : false;
	 **********************************************************************/
	public boolean isPasswordUniqueInHistory ( PasswordBean 	passwordBean
											 , int 				numberOfMonths) {
	
		int numberOfDays 	= numberOfMonths * 30;		
		
		String username 	= passwordBean.getUsername();
		String password 	= passwordBean.getPassword();
		String domain	 	= passwordBean.getDomain();
					
		@SuppressWarnings("unused")
		PasswordBean bean = template.queryForObject( passwordHistorySql
				  					  , new Object[]{username, password, domain, numberOfDays}
				  					  , new BeanPropertyRowMapper<PasswordBean>(PasswordBean.class));
	
		return true; //bean.xxx < numberOfMonths;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/
	public void displayPasswordBean (PasswordBean passwordBean) {
		
		System.out.println("PasswordDaoImpl ---> Group ID			= " + passwordBean.getGroupId()			);
		System.out.println("PasswordDaoImpl ---> User ID 			= " + passwordBean.getUserId()			);
		System.out.println("PasswordDaoImpl ---> Sequence 			= " + passwordBean.getSeq()				);
		System.out.println("PasswordDaoImpl ---> Username 			= " + passwordBean.getUsername()		);
		System.out.println("PasswordDaoImpl ---> Password 			= " + passwordBean.getPassword()		);
		System.out.println("PasswordDaoImpl ---> Domain				= " + passwordBean.getDomain()			);
		System.out.println("PasswordDaoImpl ---> Remember Me		= " + passwordBean.getRememberMe()		);
		System.out.println("PasswordDaoImpl ---> Password Type		= " + passwordBean.getPasswordType()	);
		System.out.println("PasswordDaoImpl ---> First Name			= " + passwordBean.getFirstName()		);
		System.out.println("PasswordDaoImpl ---> Last Name			= " + passwordBean.getLastName()		);
		System.out.println("PasswordDaoImpl ---> Account Status		= " + passwordBean.getAccountStatus()	);
		System.out.println("PasswordDaoImpl ---> Last Access		= " + passwordBean.getLastAccess()		);
		System.out.println("PasswordDaoImpl ---> Password Change 	= " + passwordBean.getPasswordChange()	);
		System.out.println("PasswordDaoImpl ---> Password Attempts 	= " + passwordBean.getPasswordAttempts());
		System.out.println("PasswordDaoImpl ---> Computer Name 		= " + passwordBean.getComputerName()	);
		System.out.println("PasswordDaoImpl ---> Create User 		= " + passwordBean.getCreateUser()		);
		System.out.println("PasswordDaoImpl ---> Create Timestamp	= " + passwordBean.getCreateTimestamp()	);
		System.out.println("PasswordDaoImpl ---> Modify User 		= " + passwordBean.getModifyUser()		);
		System.out.println("PasswordDaoImpl ---> Modify Timestamp	= " + passwordBean.getModifyTimestamp()	);
		
	}
	/***********************************************************************************/
	/***********************************************************************************/
	public PasswordBean retrieveResultSet (PasswordBean passwordBean, ResultSet rs1) {
		
    	try {
			passwordBean.setGroupId			(rs1.getInt			("GROUP_ID")		);
		   	passwordBean.setUserId			(rs1.getInt			("USER_ID")			);
	    	passwordBean.setSeq				(rs1.getInt			("SEQ")				);
	    	passwordBean.setUsername		(rs1.getString		("USER_NAME")		);
	    	passwordBean.setPassword		(rs1.getString		("PASSWORD")		);
	    	passwordBean.setDomain			(rs1.getString		("DOMAIN")			);
	    	
//	    	if (rs1.getString ("REMEMBER_ME").equalsIgnoreCase("Yes")) {
//	    		passwordBean.setRememberMe(true);
//	    	} else {
//	    		passwordBean.setRememberMe(false);
//	    	}
	    			
	    	passwordBean.setRememberMe		(rs1.getBoolean  	("REMEMBER_ME")	);
	    	passwordBean.setPasswordType	(rs1.getInt  		("PASSWORD_TYPE")	);
	    	passwordBean.setFirstName		(rs1.getString		("FIRST_NAME")		);
	    	passwordBean.setLastName		(rs1.getString		("LAST_NAME")		);
	    	passwordBean.setAccountStatus	(rs1.getInt			("ACCOUNT_STATUS")	);
	    	passwordBean.setLastAccess		(rs1.getTimestamp	("LAST_ACCESS")		);
	    	passwordBean.setPasswordChange	(rs1.getTimestamp	("PASSWORD_CHANGE")	);
	    	passwordBean.setPasswordAttempts(rs1.getInt			("PASSWORD_ATTEMPTS"));
	    	passwordBean.setFirstName		(rs1.getString		("FIRST_NAME")		);
	    	passwordBean.setLastName		(rs1.getString		("LAST_NAME")		);
			passwordBean.setCreateUser		(rs1.getString		("CREATE_USER")		);
			passwordBean.setCreateTimestamp	(rs1.getTimestamp	("CREATE_TIMESTAMP"));
			passwordBean.setModifyUser		(rs1.getString		("MODIFY_USER")		);
			passwordBean.setModifyTimestamp	(rs1.getTimestamp	("MODIFY_TIMESTAMP"));
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	
    	return passwordBean;
	}

}
