package com.region02.bank.issuer.card.chip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chip.model.ApplicationBean;

public class ApplicationDaoImpl implements ApplicationDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ApplicationBean application){

			String sql 
			
				= "INSERT INTO APPLICATION_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						
						+ ",APPLICATION_EFFECTIVE_DATE"
						+ ",APPLICATION_EXPIRATION_DATE"
						+ ",APPLICATION_USAGE_CONTROL"
						+ ",APPLICATION_VERSION_NUMBER"
						+ ",APPLICATION_CRYPTOGRAM"
						+ ",CRYPTOGRAM_INFORMATON_DATA"
						+ ",UNPREDICTABLE_NUMBER"
						+ ",LAST_ONLINE_APPL_TRANS_COUNTER"
						+ ",APPLICATION_TRANSACTION_COUNTER"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	application.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	application.getPrimaryAccountNumberSeq()		+	"'"
						
						+ "('"	+	application.getEffectiveDate()		+	"'"
						+ "('"	+	application.getExpirationDate()		+	"'"
						+ "('"	+	application.getUsageControl()		+	"'"
						+ "('"	+	application.getVersionNumber()		+	"'"
						+ "('"	+	application.getCryptogram()			+	"'"
						+ "('"	+	application.getCryptogramInformationData()		+	"'"
						+ "('"	+	application.getUnpredictableNumber()			+	"'"
						+ "('"	+	application.getLastOnlineApplTransCounter()		+	"'"
						+ "('"	+	application.getApplicationTransCounter()		+	"'"
						
						+ "('"	+	application.getCreateUser()						+	"'"
						+ "('"	+	application.getCreateTimestamp()				+	"'"
						+ "('"	+	application.getModifyUser()						+	"'"
						+ "('"	+	application.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ApplicationBean application){
	
	String sql =
			
			" UPDATE APPLICATION_TABLE " 	+
			
			"    SET APPLICATION_EFFECTIVE_DATE 		= '"  	+ application.getEffectiveDate()		+	"'"	+
			"      , APPLICATION_EXPIRATION_DATE 		= '"  	+ application.getExpirationDate()	+	"'"	+
			"      , APPLICATION_USAGE_CONTROL 			= '"  	+ application.getUsageControl()		+	"'"	+
			"      , APPLICATION_VERSION_NUMBER 		= '"  	+ application.getVersionNumber()		+	"'"	+
			"      , APPLICATION_CRYPTOGRAM				= '"  	+ application.getCryptogram()		+	"'"	+
			"      , CRYPTOGRAM_INFORMATON_DATA 		= '"  	+ application.getCryptogramInformationData()	+	"'"	+
			"      , UNPREDICTABLE_NUMBER 				= '"  	+ application.getUnpredictableNumber()			+	"'"	+
			"      , LAST_ONLINE_APPL_TRANS_COUNTER 	= '"  	+ application.getLastOnlineApplTransCounter()	+	"'"	+
			"      , APPLICATION_TRANSACTION_COUNTER 	= '"  	+ application.getApplicationTransCounter()		+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ application.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ application.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 								= "		+ application.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE from APPLICATION_TABLE "
			+ "WHERE ID 	= "	+	id	+	"";
	
	return template.update(sql);
	
}

@Override
public ApplicationBean selectApplicationById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM APPLICATION_TABLE "
		+ " WHERE ID 		= ? ";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ApplicationBean>(ApplicationBean.class));
	
}

@Override
public List<ApplicationBean> select(){
	
	return template.query( "SELECT * FROM APPLICATION_TABLE "
						 ,new RowMapper<ApplicationBean>(){
		
		public ApplicationBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ApplicationBean application = new ApplicationBean();
			
			application.setId							(rs.getInt(1));
			application.setPrimaryAccountNumber			(rs.getString(2));
			application.setPrimaryAccountNumberSeq		(rs.getInt(3));
			application.setVersionNumber				(rs.getByte(4));
			application.setUsageControl					(rs.getByte(5));
			application.setCryptogram					(rs.getInt(6));
			application.setUnpredictableNumber			(rs.getInt(7));
			application.setCryptogramInformationData	(rs.getByte(8));
			application.setLastOnlineApplTransCounter	(rs.getByte(9));
			application.setApplicationTransCounter		(rs.getByte(10));
			application.setEffectiveDate				(rs.getDate(11));
			application.setExpirationDate				(rs.getDate(12));
			application.setCreateUser					(rs.getString(13));
			application.setCreateTimestamp				(rs.getTimestamp(14));
			application.setModifyUser					(rs.getString(15));
			application.setModifyTimestamp				(rs.getTimestamp(16));
			
			return application;
			
		}
	});
  }
}
