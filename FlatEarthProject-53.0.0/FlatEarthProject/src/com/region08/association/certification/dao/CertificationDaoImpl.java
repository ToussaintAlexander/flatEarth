package com.region08.association.certification.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.certification.model.CertificationBean;

public class CertificationDaoImpl implements CertificationDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CertificationBean certification){

			String sql 
			
				= "INSERT INTO CERTIFICATION_TABLE "
						+ "("
						+ " PROCESSOR_NAME"
						+ ",PROCESSOR_NUMBER"
						+ ",PROJECT_MANAGER"
						+ ",TELEPHONE_NUMBER1"
						+ ",EMAIL_ADDRESS1"
						+ ",PROCESSOR_TESTER"
						+ ",TELEPHONE_NUMBER2"
						+ ",EMAIL_ADDRESS2"
						
						+ ",TEST_DATES1"
						+ ",TEST_TIME1"
						+ ",TEST_DATES2"
						+ ",TEST_TIME2"
						+ ",TEST_DATES3"
						+ ",TEST_TIME3"

						+ ",NEW_PROCESSOR"
						+ ",PROCESSOR_UPGRADE"
						+ ",DISASTER_RECOVERY"
						+ ",CONNECTIVITY_ONLY"
						+ ",KEY_ENCRYPTION_KEY"
						+ ",FRAUD_SYSTEM"

						+ ",CVV1"
						+ ",CVV2"
						+ ",ICVV"
						+ ",DCVV"

						+ ",PIN_VALIDATION"
						+ ",PINLESS_BILL_PAY"
						+ ",ECOMMERCE_SUPPORTED"
						+ ",ACCOUNT_TO_ACCOUNT"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	certification.getProcessorName()		+	"'"
						+ ",'"	+	certification.getProcessorNumber()		+	"'"
						+ ",'"	+	certification.getProjectManager()		+	"'"
						+ ",'"	+	certification.getTelephoneNumber1()		+	"'"
						+ ",'"	+	certification.getEmailAddress1()		+	"'"
						+ ",'"	+	certification.getProcessorTester()		+	"'"
						+ ",'"	+	certification.getTelephoneNumber2()		+	"'"
						+ ",'"	+	certification.getEmailAddress2()		+	"'"
						
						+ ",'"	+	certification.getTestDates1()			+	"'"
						+ ",'"	+	certification.getTestTime1()			+	"'"
						+ ",'"	+	certification.getTestDates2()			+	"'"
						+ ",'"	+	certification.getTestTime2()			+	"'"
						+ ",'"	+	certification.getTestDates3()			+	"'"
						+ ",'"	+	certification.getTestTime3()			+	"'"
						
						+ ",'"	+	certification.getNewProcessor()			+	"'"
						+ ",'"	+	certification.getProcessorUpgrade()		+	"'"
						+ ",'"	+	certification.getDisasterRecovery()		+	"'"
						+ ",'"	+	certification.getConnectivityOnly()		+	"'"
						+ ",'"	+	certification.getKeyEncryptionKey()		+	"'"
						+ ",'"	+	certification.getFraudSystem()			+	"'"
						
						+ ",'"	+	certification.getcVV1()					+	"'"
						+ ",'"	+	certification.getcVV2()					+	"'"
						+ ",'"	+	certification.getiCVV()					+	"'"
						+ ",'"	+	certification.getdCVV()					+	"'"
						
						+ ",'"	+	certification.getPinValidation()		+	"'"
						+ ",'"	+	certification.getPinlessBillPay()		+	"'"
						+ ",'"	+	certification.geteCommerceSupported()	+	"'"
						+ ",'"	+	certification.getAccountToAccount()		+	"'"
						
						+ ",'"	+	certification.getCreateUser()			+	"'"
						+ ",'"	+	certification.getCreateTimestamp()		+	"'"
						+ ",'"	+	certification.getModifyUser()			+	"'"
						+ ",'"	+	certification.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CertificationBean certification){
	
	String sql =
			
			" UPDATE CERTIFICATION_TABLE " 	+
			
			"    SET PROCESSOR_NAME 		= '" 	+ certification.getProcessorName() 		+	"'"	+
			"      , PROCESSOR_NUMBER 		= '" 	+ certification.getProcessorNumber() 	+	"'"	+
			"      , PROJECT_MANAGER 		= '" 	+ certification.getProjectManager() 	+	"'"	+
			"      , TELEPHONE_NUMBER1 		= '" 	+ certification.getTelephoneNumber1() 	+	"'"	+
			"      , EMAIL_ADDRESS1 		= '" 	+ certification.getEmailAddress1() 		+	"'"	+
			"      , PROCESSOR_TESTER 		= '" 	+ certification.getProcessorTester() 	+	"'"	+
			"      , TELEPHONE_NUMBER2		= '" 	+ certification.getTelephoneNumber2() 	+	"'"	+
			"      , EMAIL_ADDRESS2 		= '" 	+ certification.getEmailAddress2() 		+	"'"	+
						
			"      , TEST_DATES1 			= '" 	+ certification.getTestDates1() 		+	"'"	+
			"      , TEST_TIME1 			= '" 	+ certification.getTestTime1() 			+	"'"	+
			"      , TEST_DATES2 			= '" 	+ certification.getTestDates2() 		+	"'"	+
			"      , TEST_TIME2 			= '" 	+ certification.getTestTime2() 			+	"'"	+
			"      , TEST_DATES3 			= '" 	+ certification.getTestDates3() 		+	"'"	+
			"      , TEST_TIME3 			= '" 	+ certification.getTestTime3() 			+	"'"	+
						
			"      , NEW_PROCESSOR 			= '" 	+ certification.getNewProcessor() 		+	"'"	+
			"      , PROCESSOR_UPGRADE 		= '" 	+ certification.getProcessorUpgrade() 	+	"'"	+
			"      , DISASTER_RECOVERY 		= '" 	+ certification.getDisasterRecovery() 	+	"'"	+
			"      , CONNECTIVITY_ONLY 		= '" 	+ certification.getConnectivityOnly() 	+	"'"	+
			"      , KEY_ENCRYPTION_KEY 	= '" 	+ certification.getKeyEncryptionKey() 	+	"'"	+
			"      , FRAUD_SYSTEM 			= '" 	+ certification.getFraudSystem() 		+	"'"	+
						
			"      , CVV1 					= '" 	+ certification.getcVV1() 				+	"'"	+
			"      , CVV2 					= '" 	+ certification.getcVV2() 				+	"'"	+
			"      , ICVV 					= '" 	+ certification.getiCVV() 				+	"'"	+
			"      , DCVV 					= '" 	+ certification.getdCVV() 				+	"'"	+
						
			"      , PIN_VALIDATION 		= '" 	+ certification.getPinValidation() 		+	"'"	+
			"      , PINLESS_BILL_PAY 		= '" 	+ certification.getPinlessBillPay() 	+	"'"	+
			"      , ECOMMERCE_SUPPORTED 	= '" 	+ certification.geteCommerceSupported() +	"'"	+
			"      , ACCOUNT_TO_ACCOUNT 	= '" 	+ certification.getAccountToAccount() 	+	"'"	+	
			
			"      , MODIFY_USER			= '" 	+ certification.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ certification.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 					= "		+ certification.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CERTIFICATION_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public CertificationBean selectCertificationById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM CERTIFICATION_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<CertificationBean>(CertificationBean.class));
	
}

@Override
public List<CertificationBean> select(){
	
	return template.query( "SELECT * FROM CERTIFICATION_TABLE"
						 ,new RowMapper<CertificationBean>(){
		
		public CertificationBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CertificationBean certification = new CertificationBean();
			
			certification.setId					(rs.getInt("ID"));

			certification.setProcessorName		(rs.getString("PROCESSOR_NAME"));
			certification.setProcessorNumber	(rs.getInt("PROCESSOR_NUMBER"));
			certification.setProjectManager		(rs.getString("PROJECT_MANAGER"));
			certification.setTelephoneNumber1	(rs.getString("TELEPHONE_NUMBER1"));
			certification.setEmailAddress1		(rs.getString("EMAIL_ADDRESS1"));
			certification.setProcessorTester	(rs.getString("PROCESSOR_TESTER"));
			certification.setTelephoneNumber2	(rs.getString("TELEPHONE_NUMBER2"));
			certification.setEmailAddress2		(rs.getString("EMAIL_ADDRESS2"));
						
			certification.setTestDates1			(rs.getDate("TEST_DATES1"));
			certification.setTestTime1			(rs.getTimestamp("TEST_TIME1"));
			certification.setTestDates2			(rs.getDate("TEST_DATES2"));
			certification.setTestTime2			(rs.getTimestamp("TEST_TIME2"));
			certification.setTestDates3			(rs.getDate("TEST_DATES3"));
			certification.setTestTime3			(rs.getTimestamp("TEST_TIME3"));
						
			certification.setNewProcessor		(rs.getInt("NEW_PROCESSOR"));
			certification.setProcessorUpgrade	(rs.getInt("PROCESSOR_UPGRADE"));
			certification.setDisasterRecovery	(rs.getInt("DISASTER_RECOVERY"));
			certification.setConnectivityOnly	(rs.getInt("CONNECTIVITY_ONLY"));
			certification.setKeyEncryptionKey	(rs.getInt("KEY_ENCRYPTION_KEY"));
			certification.setFraudSystem		(rs.getInt("FRAUD_SYSTEM"));
						
			certification.setcVV1				(rs.getInt("CVV1"));
			certification.setcVV2				(rs.getInt("CVV2"));
			certification.setiCVV				(rs.getInt("ICVV"));
			certification.setdCVV				(rs.getInt("DCVV"));
						
			certification.setPinValidation		(rs.getInt("PIN_VALIDATION"));
			certification.setPinlessBillPay		(rs.getInt("PINLESS_BILL_PAY"));
			certification.seteCommerceSupported	(rs.getInt("ECOMMERCE_SUPPORTED"));
			certification.setAccountToAccount	(rs.getInt("ACCOUNT_TO_ACCOUNT"));
			
			certification.setCreateUser			(rs.getString("CREATE_USER"));
			certification.setCreateTimestamp	(rs.getTimestamp("CREATE_TIMESTAMP"));
			certification.setModifyUser			(rs.getString("MODIFY_USER"));
			certification.setModifyTimestamp	(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return certification;
			
		}
	});
  }
}
