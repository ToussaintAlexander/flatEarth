package com.region09.processor.issuer.knowledge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.knowledge.model.CardVerificationBean;

public class CardVerificationDaoImpl implements CardVerificationDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CardVerificationBean cardVerification){

			String sql 
			
				= "INSERT INTO CARD_VERIFICATION_TABLE "
						+ "("
						+ " LOW_BIN_RANGE_NUMBER"
						+ ",HIGH_BIN_RANGE_NUMBER"
						+ ",CVV1"
						+ ",CVV2"
						+ ",ICVV"
						+ ",DCVV"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	
						+			cardVerification.getLowBinRangeNumber()		+	"'"
						+ ",'"	+	cardVerification.getHighBinRangeNumber()	+	"'"
						+ ",'"	+	cardVerification.getcVV2()					+	"'"	
						+ ",'"	+	cardVerification.getcVV2()					+	"'"
						+ ",'"	+	cardVerification.getiCVV()					+	"'"
						+ ",'"	+	cardVerification.getdCVV()					+	"'"
						+ ",'"	+	cardVerification.getCreateUser()			+	"'"
						+ ",'"	+	cardVerification.getCreateTimestamp()		+	"'"
						+ ",'"	+	cardVerification.getModifyUser()			+	"'"
						+ ",'"	+	cardVerification.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CardVerificationBean cardVerification){
	
	String sql =
			
			" UPDATE CARD_VERIFICATION_TABLE 	   " 	+
			
			"    SET LOW_BIN_RANGE_NUMBER 	= '" 	+ cardVerification.getLowBinRangeNumber() 	+	"'"	+
			"      , HIGH_BIN_RANGE_NUMBER 	= '"  	+ cardVerification.getHighBinRangeNumber()	+	"'"	+
			"      , CVV1 					= '"  	+ cardVerification.getcVV1()	 			+	"'"	+
			"      , CVV2 					= '"  	+ cardVerification.getcVV2()	 			+	"'"	+
			"      , ICVV 					= '"  	+ cardVerification.getiCVV()		 		+	"'"	+
			"      , DCVV 					= '"  	+ cardVerification.getdCVV() 				+	"'"	+
			
			"      , MODIFY_USER			= '" 	+ cardVerification.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ cardVerification.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 					= "		+ cardVerification.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CARD_VERIFICATION_TABLE " 	+
			"  WHERE ID = "								+
			         id									+
			"";
	
	return template.update(sql);
	
}

@Override
public CardVerificationBean selectCardVerificationById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CARD_VERIFICATION_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<CardVerificationBean>(CardVerificationBean.class));
	
}

@Override
public List<CardVerificationBean> select(){
	
	return template.query( "SELECT * FROM CARD_VERIFICATION_TABLE"
						 ,new RowMapper<CardVerificationBean>(){
		
		public CardVerificationBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CardVerificationBean cardVerification = new CardVerificationBean();
			
			cardVerification.setId					(rs.getInt(1));
			
			cardVerification.setLowBinRangeNumber	(rs.getString(2));
			cardVerification.setHighBinRangeNumber	(rs.getString(3));
			cardVerification.setcVV1				(rs.getShort(4));
			cardVerification.setcVV2				(rs.getShort(5));
			cardVerification.setiCVV				(rs.getShort(6));
			cardVerification.setdCVV				(rs.getShort(7));
			
			cardVerification.setCreateUser			(rs.getString(8));
			cardVerification.setCreateTimestamp		(rs.getTimestamp(9));
			cardVerification.setModifyUser			(rs.getString(10));
			cardVerification.setModifyTimestamp		(rs.getTimestamp(11));
			
			return cardVerification;
			
		}
	});
  }
}
