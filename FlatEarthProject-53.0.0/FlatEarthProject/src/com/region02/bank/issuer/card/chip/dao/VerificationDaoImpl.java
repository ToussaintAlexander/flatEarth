package com.region02.bank.issuer.card.chip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chip.model.VerificationBean;

public class VerificationDaoImpl implements VerificationDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(VerificationBean verification){

			String sql 
			
				= "INSERT INTO VERIFICATION_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						
						+ ",CARDHOLDER_VERIFICATION_METHOD"
						+ ",CARDHOLDER_VERIFICATION_STATUS"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	verification.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	verification.getPrimaryAccountNumberSeq()		+	"'"
						
						+ "('"	+	verification.getCardhldrVerificationMethod()	+	"'"
						+ "('"	+	verification.getCardhldrVerificationStatus()	+	"'"
						
						+ "('"	+	verification.getCreateUser()					+	"'"
						+ "('"	+	verification.getCreateTimestamp()				+	"'"
						+ "('"	+	verification.getModifyUser()					+	"'"
						+ "('"	+	verification.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(VerificationBean verification){
	
	String sql =
			
			" UPDATE VERIFICATION_TABLE " 	+
			
			"    SET CARDHOLDER_VERIFICATION_METHOD		= '"  	+ verification.getCardhldrVerificationMethod()	+	"'"	+
			"      , CARDHOLDER_VERIFICATION_STATUS 	= '"  	+ verification.getCardhldrVerificationStatus()	+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ verification.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ verification.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 								= "		+ verification.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM VERIFICATION_TABLE "
			+ "WHERE ID 	= "	+	id			+	"";
	
	return template.update(sql);
	
}

@Override
public VerificationBean selectVerificationById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM VERIFICATION_TABLE "
		+ " WHERE ID 	 = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<VerificationBean>(VerificationBean.class));
	
}

@Override
public List<VerificationBean> select(){
	
	return template.query( "SELECT * FROM VERIFICATION_TABLE "
						 ,new RowMapper<VerificationBean>(){
		
		public VerificationBean mapRow(ResultSet rs, int row) throws SQLException {
			
			VerificationBean verification = new VerificationBean();
			
			verification.setId								(rs.getInt(1));
			verification.setPrimaryAccountNumber			(rs.getString(2));
			verification.setPrimaryAccountNumberSeq			(rs.getInt(3));
			
			verification.setCardhldrVerificationMethod		(rs.getShort(4));
			verification.setCardhldrVerificationStatus		(rs.getByte(5));
			
			verification.setCreateUser						(rs.getString(6));
			verification.setCreateTimestamp					(rs.getTimestamp(7));
			verification.setModifyUser						(rs.getString(8));
			verification.setModifyTimestamp					(rs.getTimestamp(9));
			
			return verification;
			
		}
	});
  }
}
