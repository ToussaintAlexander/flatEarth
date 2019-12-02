package com.region04.merchant.terminal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region04.merchant.terminal.model.CurrencyBean;

public class CurrencyDaoImpl implements CurrencyDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CurrencyBean currency){

			String sql 
			
				= "INSERT INTO CURRENCY_TABLE "
						+ "("
						+ " ACQUIRER_IDENTIFIER"
						+ ",MERCHANT_IDENTIFIER"
						+ ",TERMINAL_IDENTIFICATION"
						+ ",ACCOUNT_TYPE"
						+ ",AMOUNT_AUTHORIZED"
						+ ",AMOUNT_OTHER"
						+ ",AMOUNT_REFERENCE_CURRENCY"
						+ ",CODE_TRANS_REFERENCE_CODE"
						+ ",EXPONENT_TRANS_REFERENCE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	currency.getAcquirerIdentifier()		+	"'"
						+ ",'"	+	currency.getMerchantIdentifier()		+	"'"
						+ ",'"	+	currency.getTerminalIdentification()	+	"'"
						+ ",'"	+	currency.getAccountType()				+	"'"
						+ ",'"	+	currency.getAmountAuthorized()			+	"'"
						+ ",'"	+	currency.getAmountOther()				+	"'"
						+ ",'"	+	currency.getAmountReferenceCurrency()	+	"'"
						+ ",'"	+	currency.getCodeTransReferenceCode()	+	"'"
						+ ",'"	+	currency.getExponentTransReference()	+	"'"
						+ ",'"	+	currency.getCreateUser()				+	"'"
						+ ",'"	+	currency.getCreateTimestamp()			+	"'"
						+ ",'"	+	currency.getModifyUser()				+	"'"
						+ ",'"	+	currency.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CurrencyBean currency){
	
	String sql =
			
			" UPDATE CURRENCY_TABLE " 	+
			
			"    SET ACQUIRER_IDENTIFIER 			= '" 	+ currency.getAcquirerIdentifier() 			+	"'"	+
			"      , MERCHANT_IDENTIFIER 			= '"  	+ currency.getMerchantIdentifier()			+	"'"	+
			"      , TERMINAL_IDENTIFICATION		= '" 	+ currency.getTerminalIdentification()  	+	"'"	+
			"      , ACCOUNT_TYPE					= '" 	+ currency.getAccountType()  				+	"'"	+
			"      , AMOUNT_AUTHORIZED				= '" 	+ currency.getAmountAuthorized()  			+	"'"	+
			"      , AMOUNT_OTHER					= '" 	+ currency.getAmountOther()  				+	"'"	+
			"      , AMOUNT_REFERENCE_CURRENCY		= '" 	+ currency.getAmountReferenceCurrency()  	+	"'"	+
			"      , CODE_TRANS_REFERENCE_CODE		= '" 	+ currency.getCodeTransReferenceCode()  	+	"'"	+
			"      , EXPONENT_TRANS_REFERENCE		= '" 	+ currency.getExponentTransReference()  	+	"'"	+

			"      , MODIFY_USER					= '" 	+ currency.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ currency.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ currency.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CURRENCY_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public CurrencyBean selectCurrencyById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CURRENCY_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<CurrencyBean>(CurrencyBean.class));
	
}

@Override
public List<CurrencyBean> select(){
	
	return template.query( "SELECT * FROM CURRENCY_TABLE"
						 ,new RowMapper<CurrencyBean>(){
		
		public CurrencyBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CurrencyBean currency = new CurrencyBean();
			
			currency.setId							(rs.getInt(1));
			currency.setAcquirerIdentifier			(rs.getInt(2));
			currency.setMerchantIdentifier			(rs.getString(3));
			currency.setTerminalIdentification		(rs.getString(4));
			currency.setAccountType					(rs.getInt(5));
			currency.setAmountAuthorized			(rs.getInt(6));
			currency.setAmountOther					(rs.getInt(7));
			currency.setAmountReferenceCurrency		(rs.getInt(8));
			currency.setCodeTransReferenceCode		(rs.getInt(9));
			currency.setExponentTransReference		(rs.getInt(10));
			
			currency.setCreateUser					(rs.getString(11));
			currency.setCreateTimestamp				(rs.getTimestamp(12));
			currency.setModifyUser					(rs.getString(13));
			currency.setModifyTimestamp				(rs.getTimestamp(14));
			
			return currency;
			
		}
	});
  }
}
