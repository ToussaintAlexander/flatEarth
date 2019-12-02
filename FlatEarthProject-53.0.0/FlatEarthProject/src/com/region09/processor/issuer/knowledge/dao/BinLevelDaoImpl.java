package com.region09.processor.issuer.knowledge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.knowledge.model.BinLevelBean;

public class BinLevelDaoImpl implements BinLevelDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(BinLevelBean binLevel){

			String sql 
			
				= "INSERT INTO BIN_LEVEL_TABLE "
						+ "("
						+ " LOW_BIN_LEVEL_NUMBER"
						+ ",HIGH_BIN_LEVEL_NUMBER"
						+ ",BIN_LENGTH"
						+ ",ACCOUNT_NUMBER_LENGTH"
						+ ",CARD_TYPE"
						+ ",CARD_SUBTYPE"
						+ ",PRODUCT_GROUP"
						+ ",PRODUCT_TYPE"
						+ ",COUNTRY_CODE"
						+ ",CURRENCY_CODE"
						+ ",ATM_OVERDRAFT_SWITCH"
						+ ",POS_OVERDRAFT_SWITCH"
						+ ",CHECKING_SWITCH"
						+ ",SAVINGS_SWITCH"
						+ ",RANGE_LEVEL_ALL"
						+ ",PARTIAL_AUTHORIZATION"
						+ ",DERIVIATION_TYPE"
						+ ",EXPIRATION_DATE"
						+ ",PRODUCTION_DATE"
						+ ",CERTIFICATION_DATE"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	binLevel.getLowBinRangeNumber()		+	"'"
						+ ",'"	+	binLevel.getHighBinRangeNumber()	+	"'"
						+ ",'"	+	binLevel.getBinLength()				+	"'"
						+ ",'"	+	binLevel.getAccountNumberLength()	+	"'"
						+ ",'"	+	binLevel.getCardType()				+	"'"
						+ ",'"	+	binLevel.getCardSubtype()			+	"'"
						+ ",'"	+	binLevel.getProductGroup()			+	"'"
						+ ",'"	+	binLevel.getProductType()			+	"'"
						+ ",'"	+	binLevel.getCountryCode()			+	"'"
						+ ",'"	+	binLevel.getCurrencyCode()			+	"'"
						+ ",'"	+	binLevel.isAtmOverdraftSwitch()		+	"'"
						+ ",'"	+	binLevel.isPosOverdraftSwitch()		+	"'"
						+ ",'"	+	binLevel.isCheckingSwitch()			+	"'"
						+ ",'"	+	binLevel.isSavingsSwitch()			+	"'"
						+ ",'"	+	binLevel.getRangeLevelAll()			+	"'"
						+ ",'"	+	binLevel.isPartialAuthorization()	+	"'"
						+ ",'"	+	binLevel.getDeriviationType()		+	"'"
						+ ",'"	+	binLevel.getExpirationDate()		+	"'"
						+ ",'"	+	binLevel.getExpirationDate()		+	"'"
						+ ",'"	+	binLevel.getProductionDate()		+	"'"
						+ ",'"	+	binLevel.getCertificationDate()		+	"'"
						
						+ ",'"	+	binLevel.getCreateUser()			+	"'"
						+ ",'"	+	binLevel.getCreateTimestamp()		+	"'"
						+ ",'"	+	binLevel.getModifyUser()			+	"'"
						+ ",'"	+	binLevel.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(BinLevelBean binLevel){
	
	String sql =
			
			" UPDATE BIN_LEVEL_TABLE 	   " 			+
			
			"    SET LOW_BIN_LEVEL_NUMBER 		= '" 	+ 	binLevel.getLowBinRangeNumber() 	+	"'"	+
			"      , HIGH_BIN_LEVEL_NUMBER 		= '"  	+ 	binLevel.getHighBinRangeNumber()	+	"'"	+
			"      , BIN_LENGTH 				= '"  	+	binLevel.getBinLength()				+	"'"	+
			"      , ACCOUNT_NUMBER_LENGTH 		= '"  	+	binLevel.getAccountNumberLength()	+	"'"	+
			"      , CARD_TYPE 					= '"  	+	binLevel.getCardType()				+	"'"	+
			"      , CARD_SUBTYPE 				= '"  	+	binLevel.getCardSubtype()			+	"'"	+
			"      , PRODUCT_GROUP 				= '"  	+	binLevel.getProductGroup()			+	"'"	+
			"      , PRODUCT_TYPE 				= '"  	+	binLevel.getProductType()			+	"'"	+
			"      , COUNTRY_CODE 				= '"  	+	binLevel.getCountryCode()			+	"'"	+
			"      , CURRENCY_CODE 				= '"  	+	binLevel.getCurrencyCode()			+	"'"	+
			"      , ATM_OVERDRAFT_SWITCH 		= '"  	+	binLevel.isAtmOverdraftSwitch()		+	"'"	+
			"      , POS_OVERDRAFT_SWITCH 		= '"  	+	binLevel.isPosOverdraftSwitch()		+	"'"	+
			"      , CHECKING_SWITCH 			= '"  	+	binLevel.isCheckingSwitch()			+	"'"	+
			"      , SAVINGS_SWITCH 			= '"  	+	binLevel.isSavingsSwitch()			+	"'"	+
			"      , RANGE_LEVEL_ALL 			= '"  	+	binLevel.getRangeLevelAll()			+	"'"	+
			"      , PARTIAL_AUTHORIZATION 		= '"  	+	binLevel.isPartialAuthorization()	+	"'"	+
			"      , DERIVIATION_TYPE 			= '"  	+	binLevel.getDeriviationType()		+	"'"	+
			"      , EXPIRATION_DATE 			= '"  	+	binLevel.getExpirationDate()		+	"'"	+
			"      , PRODUCTION_DATE 			= '"  	+	binLevel.getProductionDate()		+	"'"	+
			"      , CERTIFICATION_DATE 		= '"  	+	binLevel.getCertificationDate()		+	"'"	+
			
			"      , MODIFY_USER				= '" 	+ 	binLevel.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ 	binLevel.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 						= "		+ 	binLevel.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM BIN_LEVEL_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public BinLevelBean selectBinLevelById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM BIN_LEVEL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<BinLevelBean>(BinLevelBean.class));
	
}

@Override
public List<BinLevelBean> select(){
	
	return template.query( "SELECT * from BIN_LEVEL_TABLE"
						 ,new RowMapper<BinLevelBean>(){
		
		public BinLevelBean mapRow(ResultSet rs, int row) throws SQLException {
			
			BinLevelBean binLevel = new BinLevelBean();
			
			binLevel.setId						(rs.getInt(1));
			
			binLevel.setLowBinRangeNumber		(rs.getString(2));
			binLevel.setHighBinRangeNumber		(rs.getString(3));
			binLevel.setBinLength				(rs.getInt(4));
			binLevel.setAccountNumberLength		(rs.getInt(5));
			binLevel.setCardType				(rs.getString(6));
			binLevel.setCardSubtype				(rs.getString(7));
			binLevel.setProductGroup			(rs.getString(8));
			binLevel.setProductType				(rs.getString(9));
			binLevel.setCountryCode				(rs.getString(10));
			binLevel.setCurrencyCode			(rs.getString(11));
			binLevel.setAtmOverdraftSwitch		(rs.getBoolean(12));
			binLevel.setPosOverdraftSwitch		(rs.getBoolean(13));
			binLevel.setCheckingSwitch			(rs.getBoolean(14));
			binLevel.setSavingsSwitch			(rs.getBoolean(15));
			binLevel.setRangeLevelAll			(rs.getString(16));
			binLevel.setPartialAuthorization	(rs.getBoolean(17));
			binLevel.setDeriviationType			(rs.getString(18));
			binLevel.setExpirationDate			(rs.getDate(19));
			binLevel.setProductionDate			(rs.getDate(20));
			binLevel.setCertificationDate		(rs.getDate(21));
			
			binLevel.setCreateUser				(rs.getString(22));
			binLevel.setCreateTimestamp			(rs.getTimestamp(23));
			binLevel.setModifyUser				(rs.getString(24));
			binLevel.setModifyTimestamp			(rs.getTimestamp(25));
			
			return binLevel;
			
		}
	});
  }
}
