package com.region02.bank.issuer.card.chipcard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chipcard.model.ChipCardBean;

public class ChipCardDaoImpl implements ChipCardDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ChipCardBean chipCard){

			String sql 
			
				= "INSERT INTO CHIP_CARD_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						
						+ ",ASSOCIATION_NAME"
						+ ",BANK_NAME"
						+ ",BRAND_NAME"
						
						+ ",CARDHOLDER_FIRST_NAME"
						+ ",CARDHOLDER_MIDDLE_NAME"
						+ ",CARDHOLDER_LAST_NAME"
						
						+ ",CARD_EXPIRATION_DATE"
						+ ",CARD_VERIFICATION_VALUE"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	chipCard.getPrimaryAccountNumber()		+	"'"
						+ "('"	+	chipCard.getPrimaryAccountNumberSeq()	+	"'"
						
						+ "('"	+	chipCard.getAssociationName()			+	"'"
						+ "('"	+	chipCard.getBankName()					+	"'"
						+ "('"	+	chipCard.getBrandName()					+	"'"
						
						+ "('"	+	chipCard.getCardholderFirstName()		+	"'"
						+ "('"	+	chipCard.getCardholderMiddleName()		+	"'"
						+ "('"	+	chipCard.getCardholderLastName()		+	"'"
						
						+ "('"	+	chipCard.getCardExpirationDate()		+	"'"
						+ "('"	+	chipCard.getCardVerificationValue()		+	"'"
						
						+ "('"	+	chipCard.getCreateUser()				+	"'"
						+ "('"	+	chipCard.getCreateTimestamp()			+	"'"
						+ "('"	+	chipCard.getModifyUser()				+	"'"
						+ "('"	+	chipCard.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ChipCardBean chipCard){
	
	String sql =
			
			" UPDATE CHIP_CARD_TABLE " 	+
			
			"    SET ASSOCIATION_NAME 			= '"  	+ chipCard.getAssociationName()			+	"'"	+
			"      , BANK_NAME 					= '"  	+ chipCard.getBankName()				+	"'"	+
			"      , BRAND_NAME 				= '"  	+ chipCard.getBrandName()				+	"'"	+
			"      , CARDHOLDER_FIRST_NAME 		= '"  	+ chipCard.getCardholderFirstName()		+	"'"	+
			"      , CARDHOLDER_MIDDLE_NAME 	= '"  	+ chipCard.getCardholderMiddleName()	+	"'"	+
			"      , CARDHOLDER_LAST_NAME 		= '"  	+ chipCard.getCardholderLastName()		+	"'"	+
			"      , CARD_EXPIRATION_DATE 		= '"  	+ chipCard.getCardExpirationDate()		+	"'"	+
			"      , CARD_VERIFICATION_VALUE 	= '"  	+ chipCard.getCardVerificationValue()	+	"'"	+
			
			"      , MODIFY_USER				= '" 	+ chipCard.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ chipCard.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE PRIMARY_ACCOUNT_NUMBER 	= "		+ chipCard.getPrimaryAccountNumber()	+	"'"	+	
			"    AND PRIMARY_ACCOUNT_NUMBER_SEQ	= "		+ chipCard.getPrimaryAccountNumberSeq()	+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CHIP_CARD_TABLE "
			+ "WHERE ID 	= "	+	id		+	"";
	
	return template.update(sql);
	
}

@Override
public ChipCardBean selectChipCardById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CHIP_CARD_TABLE "
		+ " WHERE ID 	 = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ChipCardBean>(ChipCardBean.class));
	
}

@Override
public List<ChipCardBean> select(){
	
	return template.query( "SELECT * FROM CHIP_CARD_TABLE"
						 ,new RowMapper<ChipCardBean>(){
		
		public ChipCardBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ChipCardBean chipCard = new ChipCardBean();
			
			chipCard.setId						(rs.getInt(1));
			chipCard.setPrimaryAccountNumber	(rs.getString(2));
			chipCard.setPrimaryAccountNumberSeq	(rs.getInt(3));
			
			chipCard.setAssociationName			(rs.getString(4));
			chipCard.setBankName				(rs.getString(5));
			chipCard.setBrandName				(rs.getString(6));
			
			chipCard.setCardholderFirstName		(rs.getString(7));
			chipCard.setCardholderMiddleName	(rs.getString(8));
			chipCard.setCardholderLastName		(rs.getString(9));
			
			chipCard.setCardExpirationDate		(rs.getDate(10));
			chipCard.setCardVerificationValue	(rs.getInt(11));
			
			chipCard.setCreateUser				(rs.getString(12));
			chipCard.setCreateTimestamp			(rs.getTimestamp(13));
			chipCard.setModifyUser				(rs.getString(14));
			chipCard.setModifyTimestamp			(rs.getTimestamp(15));
			
			return chipCard;
			
		}
	});
  }
}
