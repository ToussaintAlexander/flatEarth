package com.region04.merchant.terminal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region04.merchant.terminal.model.TransactionBean;

public class TransactionDaoImpl implements TransactionDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(TransactionBean transaction){

			String sql 
			
				= "INSERT INTO TRANSACTION_TABLE "
						+ "("
						+ " ACQUIRER_IDENTIFIER"
						+ ",MERCHANT_IDENTIFIER"
						+ ",TERMINAL_IDENTIFICATION"
						+ ",STATUS_INFORMATION"
						+ ",FORM_FACTOR_INDICATOR"
						+ ",POINT_OF_SERVICE_ENTRY_MODE"
						+ ",TRANSACTION_PIN"
						+ ",TRANSACTON_TYPE"
						+ ",TRANSACTION_DATE"
						+ ",TRANSACTION_TIME"
						+ ",COUNTRY_CODE"
						+ ",CURRENCY_CODE"
						+ ",CURRENCY_EXPONENT"
						+ ",REFERENCE_CURRENCY_CODE"
						+ ",REFERENCE_CURRENCY_EXPONENT"
						+ ",TRANSACTION_CERTIFICATE"
						+ ",AUTHORIZATION_RESPONSE_CODE"
						+ ",SEQUENCE_COUNTER"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	transaction.getAcquirerIdentifier()				+	"'"
						+ ",'"	+	transaction.getMerchantIdentifier()				+	"'"
						+ ",'"	+	transaction.getTerminalIdentification()			+	"'"
						+ ",'"	+	transaction.getStatusInformation()				+	"'"
						+ ",'"	+	transaction.getFormFactorIndicator()			+	"'"
						+ ",'"	+	transaction.getPointofServiceEntryMode()		+	"'"
						+ ",'"	+	transaction.getTransactionPIN()					+	"'"
						+ ",'"	+	transaction.getTransactionType()				+	"'"
						+ ",'"	+	transaction.getTransactionDate()				+	"'"
						+ ",'"	+	transaction.getTransactionTime()				+	"'"
						+ ",'"	+	transaction.getCountryCode()					+	"'"
						+ ",'"	+	transaction.getCurrencyCode()					+	"'"
						+ ",'"	+	transaction.getCurrencyExponent()				+	"'"
						+ ",'"	+	transaction.getReferenceCurrencyCode()			+	"'"	
						+ ",'"	+	transaction.getReferenceCurrencyExponent()		+	"'"
						+ ",'"	+	transaction.getTransactionCertificate()			+	"'"
						+ ",'"	+	transaction.getAuthorizationResponseCode()		+	"'"
						+ ",'"	+	transaction.getSequenceCounter()				+	"'"
						
						+ ",'"	+	transaction.getCreateUser()						+	"'"
						+ ",'"	+	transaction.getCreateTimestamp()				+	"'"
						+ ",'"	+	transaction.getModifyUser()						+	"'"
						+ ",'"	+	transaction.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(TransactionBean transaction){
	
	String sql =
			
			" UPDATE TRANSACTION_TABLE " 						+
			
			"    SET ACQUIRER_IDENTIFIER				= '" 	+	transaction.getAcquirerIdentifier()			+	"'"	+
			"      , MERCHANT_IDENTIFIER				= '" 	+	transaction.getMerchantIdentifier()			+	"'"	+
			"      , TERMINAL_IDENTIFICATION			= '" 	+	transaction.getTerminalIdentification()		+	"'"	+
			"      , STATUS_INFORMATION					= '" 	+	transaction.getStatusInformation()			+	"'"	+
			"      , FORM_FACTOR_INDICATOR				= '" 	+	transaction.getFormFactorIndicator()		+	"'"	+
			"      , POINT_OF_SERVICE_ENTRY_MODE		= '" 	+	transaction.getPointofServiceEntryMode()	+	"'"	+
			"      , TRANSACTION_PIN					= '" 	+	transaction.getTransactionPIN()				+	"'"	+
			"      , TRANSACTON_TYPE					= '" 	+	transaction.getTransactionType()			+	"'"	+
			"      , TRANSACTION_DATE					= '" 	+	transaction.getTransactionDate()			+	"'"	+
			"      , TRANSACTION_TIME					= '" 	+	transaction.getTransactionTime()			+	"'"	+
			"      , COUNTRY_CODE						= '" 	+	transaction.getCountryCode()				+	"'"	+
			"      , CURRENCY_CODE						= '" 	+	transaction.getCurrencyCode()				+	"'"	+
			"      , CURRENCY_EXPONENT					= '" 	+	transaction.getCurrencyExponent()			+	"'"	+
			"      , REFERENCE_CURRENCY_CODE			= '" 	+	transaction.getReferenceCurrencyCode()		+	"'"	+
			"      , REFERENCE_CURRENCY_EXPONENT		= '" 	+	transaction.getReferenceCurrencyExponent()	+	"'"	+
			"      , TRANSACTION_CERTIFICATE			= '" 	+	transaction.getTransactionCertificate()		+	"'"	+
			"      , AUTHORIZATION_RESPONSE_CODE		= '" 	+	transaction.getAuthorizationResponseCode()	+	"'"	+
			"      , SEQUENCE_COUNTER					= '" 	+	transaction.getSequenceCounter()			+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ 	transaction.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ 	transaction.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 								= "		+ 	transaction.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TRANSACTION_TABLE "
			+ "WHERE ID = "
			+ id
			+ "";
	
	return template.update(sql);
	
}

@Override
public TransactionBean selectTransactionById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TRANSACTION_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<TransactionBean>(TransactionBean.class));
	
}

@Override
public List<TransactionBean> select(){
	
	return template.query( "SELECT * FROM TRANSACTION_TABLE"
						 ,new RowMapper<TransactionBean>(){
		
		public TransactionBean mapRow(ResultSet rs, int row) throws SQLException {
			
			TransactionBean transaction = new TransactionBean();
			
			transaction.setId								(rs.getInt(1));
			
			transaction.setAcquirerIdentifier				(rs.getInt(2));
			transaction.setMerchantIdentifier				(rs.getString(3));
			transaction.setTerminalIdentification			(rs.getString(4));
			transaction.setStatusInformation				(rs.getShort(5));
			transaction.setFormFactorIndicator				(rs.getInt(6));
			transaction.setPointofServiceEntryMode			(rs.getInt(7));
			transaction.setTransactionPIN					(rs.getInt(8));
			transaction.setTransactionType					(rs.getInt(9));
			transaction.setTransactionDate					(rs.getInt(10));
			transaction.setTransactionTime					(rs.getInt(11));
			transaction.setCountryCode						(rs.getInt(12));
			transaction.setCurrencyCode						(rs.getInt(13));
			transaction.setCurrencyExponent					(rs.getInt(14));
			transaction.setReferenceCurrencyCode			(rs.getInt(15));
			transaction.setReferenceCurrencyExponent		(rs.getInt(16));
			transaction.setTransactionCertificate			(rs.getInt(17));
			transaction.setAuthorizationResponseCode		(rs.getString(18));
			transaction.setSequenceCounter					(rs.getInt(19));
			
			transaction.setCreateUser						(rs.getString(20));
			transaction.setCreateTimestamp					(rs.getTimestamp(21));
			transaction.setModifyUser						(rs.getString(22));
			transaction.setModifyTimestamp					(rs.getTimestamp(23));
			
			return transaction;
			
		}
	});
  }
}
