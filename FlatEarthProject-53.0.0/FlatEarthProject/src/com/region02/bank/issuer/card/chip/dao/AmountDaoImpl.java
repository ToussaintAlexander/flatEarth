package com.region02.bank.issuer.card.chip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chip.model.AmountBean;

public class AmountDaoImpl implements AmountDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AmountBean amount){

			String sql 
			
				= "INSERT INTO AMOUNT_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						
						+ ",CURRENCY_CODE_APPLICATION"
						+ ",CURRENCY_CONVERSION_FACTOR"
						+ ",CURRENCY_EXPONENT_APPLICATION"
						
						+ ",SECONDARY_APPL_CURRENCY_CODE"
						
						+ ",CONSECUT_DOM_OFFLINE_CTR"
						+ ",CONSECUT_DOM_OFFLINE_LWR_LMT"
						+ ",CONSECUT_DOM_OFFLINE_UPR_LMT"
						
						+ ",CONSECUT_INTL_OFFLINE_CTR"
						+ ",CONSECUT_INTL_OFFLINE_LWR_LMT"
						+ ",CONSECUT_INTL_OFFLINE_UPR_LMT"
						
						+ ",CUM_TOT_DOM_TRANS_AMOUNT"
						+ ",CUM_TOT_DOM_TRANS_AMT_LWR_LMT"
						+ ",CUM_TOT_DOM_TRANS_AMT_UPR_LMT"

						+ ",CUM_TOT_INTL_TRANS_AMOUNT"
						+ ",CUM_TOT_INTL_TRANS_AMT_LWR_LMT"
						+ ",CUM_TOT_INTL_TRANS_AMT_UPR_LMT"
						
						+ ",ENCRYPTED_PIN"
						+ ",PIN_TRY_COUNTER"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	amount.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	amount.getPrimaryAccountNumberSeq()			+	"'"
						
						+ "('"	+	amount.getCurrencyCodeApplication()			+	"'"
						+ "('"	+	amount.getSecondaryApplCurrencyCode()		+	"'"
						+ "('"	+	amount.getCurrencyConversionFactor()		+	"'"
						+ "('"	+	amount.getCurrencyExponentApplication()		+	"'"
						
						+ "('"	+	amount.getConsecutDomOfflineCtr()			+	"'"
						+ "('"	+	amount.getConsecutDomOfflineCtr()			+	"'"
						+ "('"	+	amount.getConsecutDomOfflineCtr()			+	"'"
						
						+ "('"	+	amount.getConsecutIntlOfflineCtr()			+	"'"
						+ "('"	+	amount.getConsecutIntlOfflineLwrLmt()		+	"'"
						+ "('"	+	amount.getConsecutIntlOfflineUprLmt()		+	"'"						

						+ "('"	+	amount.getCumTotDomTransAmount()			+	"'"
						+ "('"	+	amount.getCumTotDomTransAmtLwrLmt()			+	"'"
						+ "('"	+	amount.getCumTotDomTransAmtUprLmt()			+	"'"

						+ "('"	+	amount.getCumTotIntlTransAmount()			+	"'"
						+ "('"	+	amount.getCumTotIntlTransAmtLwrLmt()		+	"'"
						+ "('"	+	amount.getCumTotIntlTransAmtUprLmt()		+	"'"
						
						+ "('"	+	amount.getEncryptedPin()					+	"'"
						+ "('"	+	amount.getPinTryCounter()					+	"'"
						
						+ "('"	+	amount.getCreateUser()						+	"'"
						+ "('"	+	amount.getCreateTimestamp()					+	"'"
						+ "('"	+	amount.getModifyUser()						+	"'"
						+ "('"	+	amount.getModifyTimestamp()					+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AmountBean amount){
	
	String sql =
			
			" UPDATE AMOUNT_TABLE " 	+
			
			"    SET CURRENCY_CODE_APPLICATION 			= '"  	+ amount.getCurrencyCodeApplication()		+	"'"	+
			"      , CURRENCY_CONVERSION_FACTOR 		= '"  	+ amount.getCurrencyConversionFactor()		+	"'"	+
			"      , CURRENCY_EXPONENT_APPLICATION 		= '"  	+ amount.getCurrencyExponentApplication()	+	"'"	+
			
			"      , SECONDARY_APPL_CURRENCY_CODE 		= '"  	+ amount.getSecondaryApplCurrencyCode()		+	"'"	+
			
			"      , CONSECUT_DOM_OFFLINE_CTR 			= '"  	+ amount.getConsecutDomOfflineCtr()			+	"'"	+
			"      , CONSECUT_DOM_OFFLINE_LWR_LMT 		= '"  	+ amount.getConsecutDomOfflineLwrLmt()		+	"'"	+
			"      , CONSECUT_DOM_OFFLINE_UPR_LMT 		= '"  	+ amount.getConsecutDomOfflineUprLmt()		+	"'"	+

			"      , CONSECUT_INTL_OFFLINE_CTR 			= '"  	+ amount.getConsecutIntlOfflineCtr()		+	"'"	+
			"      , CONSECUT_INTL_OFFLINE_LWR_LMT 		= '"  	+ amount.getConsecutIntlOfflineLwrLmt()		+	"'"	+
			"      , CONSECUT_INTL_OFFLINE_UPR_LMT 		= '"  	+ amount.getConsecutIntlOfflineUprLmt()		+	"'"	+

			"      , CUM_TOT_DOM_TRANS_AMOUNT 			= '"  	+ amount.getCumTotDomTransAmount()			+	"'"	+
			"      , CUM_TOT_DOM_TRANS_AMT_LWR_LMT 		= '"  	+ amount.getCumTotDomTransAmtLwrLmt()		+	"'"	+
			"      , CUM_TOT_DOM_TRANS_AMT_UPR_LMT 		= '"  	+ amount.getCumTotDomTransAmtUprLmt()		+	"'"	+

			"      , CUM_TOT_INTL_TRANS_AMOUNT 			= '"  	+ amount.getCumTotIntlTransAmount()			+	"'"	+
			"      , CUM_TOT_INTL_TRANS_AMT_LWR_LMT 	= '"  	+ amount.getCumTotIntlTransAmtLwrLmt()		+	"'"	+
			"      , CUM_TOT_INTL_TRANS_AMT_UPR_LMT		= '"  	+ amount.getCumTotIntlTransAmtUprLmt()		+	"'"	+

			"      , ENCRYPTED_PIN 						= '"  	+ amount.getEncryptedPin()					+	"'"	+
			"      , PIN_TRY_COUNTER 					= '"  	+ amount.getPinTryCounter()					+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ amount.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ amount.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 								= "		+ amount.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM AMOUNT_TABLE "
			+ "WHERE ID 			=  "	+	id	+	"";
	
	return template.update(sql);
	
}

@Override
public AmountBean selectAmountById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM AMOUNT_TABLE "
		+ " WHERE ID 		= ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<AmountBean>(AmountBean.class));
	
}

@Override
public List<AmountBean> select(){
	
	return template.query( "SELECT * from AMOUNT_TABLE"
						 ,new RowMapper<AmountBean>(){
		
		public AmountBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AmountBean amount = new AmountBean();
			
			amount.setId							(rs.getInt(1));
			
			amount.setPrimaryAccountNumber			(rs.getString(2));
			amount.setPrimaryAccountNumberSeq		(rs.getInt(3));
			
			amount.setCurrencyCodeApplication		(rs.getInt(4));
			amount.setCurrencyConversionFactor		(rs.getInt(5));
			amount.setCurrencyExponentApplication	(rs.getInt(6));
			
			amount.setSecondaryApplCurrencyCode		(rs.getInt(7)); 
			
			amount.setConsecutDomOfflineCtr			(rs.getByte(8));
			amount.setConsecutDomOfflineLwrLmt		(rs.getByte(9));
			amount.setConsecutDomOfflineUprLmt		(rs.getByte(10));
			
			amount.setConsecutIntlOfflineCtr		(rs.getByte(11));
			amount.setConsecutIntlOfflineLwrLmt		(rs.getByte(12));
			amount.setConsecutIntlOfflineUprLmt		(rs.getByte(13));
			
			amount.setCumTotDomTransAmount			(rs.getBigDecimal(14));
			amount.setCumTotDomTransAmtLwrLmt		(rs.getBigDecimal(15));
			amount.setCumTotDomTransAmtUprLmt		(rs.getBigDecimal(16));
			
			amount.setCumTotIntlTransAmount			(rs.getBigDecimal(17));
			amount.setCumTotIntlTransAmtLwrLmt		(rs.getBigDecimal(18));
			amount.setCumTotIntlTransAmtUprLmt		(rs.getBigDecimal(19));
			
			amount.setEncryptedPin					(rs.getInt(20));
			amount.setPinTryCounter					(rs.getByte(21));
			
			amount.setCreateUser					(rs.getString(22));
			amount.setCreateTimestamp				(rs.getTimestamp(23));
			amount.setModifyUser					(rs.getString(24));
			amount.setModifyTimestamp				(rs.getTimestamp(25));
			
			return amount;
			
		}
	});
  }
}
