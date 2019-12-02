package com.region05.merchant.retailer.invoice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region05.merchant.retailer.invoice.model.InvoicePart2Bean;

public class InvoicePart2DaoImpl implements InvoicePart2Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(InvoicePart2Bean invoicePart2){

			String sql 
			
				= "INSERT INTO INVOICE_PART2_TABLE "
						+ "("
						+ " ACQUIRER_IDENTIFIER"
						+ ",MERCHANT_IDENTIFIER"
						+ ",TERMINAL_IDENTIFICATION"
						+ ",INTERFACE_DEVICE_SERIAL_NUMBER"
						+ ",TERMINAL_TYPE"
						+ ",TERMINAL_COUNTRY_CODE"
						+ ",COUNTRY_CODE"
						+ ",CURRENCY_CODE"
						+ ",FORM_FACTOR_INDICATOR"
						+ ",POINT_OF_SERVICE_ENTRY_MODE"
						+ ",TRANSACTON_TYPE"
						+ ",TRANSACTION_DATE"
						+ ",TRANSACTION_TIME"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	invoicePart2.getAcquirerIdentifier()			+	"'"
						+ ",'"	+	invoicePart2.getMerchantIdentifier()			+	"'"
						+ ",'"	+	invoicePart2.getTerminalIdentification()		+	"'"
						+ ",'"	+	invoicePart2.getInterfaceDeviceSerialNumber()	+	"'"
						+ ",'"	+	invoicePart2.getTerminalType()					+	"'"
						+ ",'"	+	invoicePart2.getTerminalCountryCode()			+	"'"						
						+ ",'"	+	invoicePart2.getCountryCode()					+	"'"
						+ ",'"	+	invoicePart2.getCurrencyCode()					+	"'"
						+ ",'"	+	invoicePart2.getFormFactorIndicator()			+	"'"
						+ ",'"	+	invoicePart2.getPointofServiceEntryMode()		+	"'"
						+ ",'"	+	invoicePart2.getTransactionType()				+	"'"
						+ ",'"	+	invoicePart2.getTransactionDate()				+	"'"
						+ ",'"	+	invoicePart2.getTransactionTime()				+	"'"
						
						+ ",'"	+	invoicePart2.getCreateUser()					+	"'"
						+ ",'"	+	invoicePart2.getCreateTimestamp()				+	"'"
						+ ",'"	+	invoicePart2.getModifyUser()					+	"'"
						+ ",'"	+	invoicePart2.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(InvoicePart2Bean invoicePart2){
	
	String sql =
			
			" UPDATE INVOICE_PART2_TABLE " 					+
			
			"    SET ACQUIRER_IDENTIFIER 			= '" 	+ invoicePart2.getAcquirerIdentifier() 			+	"'"	+
			"      , MERCHANT_IDENTIFIER 			= '"  	+ invoicePart2.getMerchantIdentifier()			+	"'"	+
			"      , TERMINAL_IDENTIFICATION 		= '"  	+ invoicePart2.getTerminalIdentification()		+	"'"	+		 
			"      , INTERFACE_DEVICE_SERIAL_NUMBER = '"  	+ invoicePart2.getInterfaceDeviceSerialNumber()	+	"'"	+	 
			"      , TERMINAL_TYPE 					= '"  	+ invoicePart2.getTerminalType()				+	"'"	+				 
			"      , TERMINAL_COUNTRY_CODE 			= '"  	+ invoicePart2.getTerminalCountryCode()			+	"'"	+		 						
			"      , COUNTRY_CODE 					= '"  	+ invoicePart2.getCountryCode()					+	"'"	+ 
			"      , CURRENCY_CODE 					= '"  	+ invoicePart2.getCurrencyCode()				+	"'"	+
			"      , FORM_FACTOR_INDICATOR 			= '"  	+ invoicePart2.getFormFactorIndicator()			+	"'"	+ 
			"      , POINT_OF_SERVICE_ENTRY_MODE 	= '"  	+ invoicePart2.getPointofServiceEntryMode()		+	"'"	+ 
			"      , TRANSACTON_TYPE 				= '"  	+ invoicePart2.getTransactionType()				+	"'"	+ 
			"      , TRANSACTION_DATE 				= '"  	+ invoicePart2.getTransactionDate()				+	"'"	+ 
			"      , TRANSACTION_TIME 				= '"  	+ invoicePart2.getTransactionTime()				+	"'"	+ 
			"      , MODIFY_USER					= '" 	+ invoicePart2.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ invoicePart2.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ invoicePart2.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM INVOICE_PART2_TABLE "
			+ "WHERE ID = "
			+ id
			+ "";
	
	return template.update(sql);
	
}

@Override
public InvoicePart2Bean selectInvoicePart2ById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM INVOICE_PART2_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<InvoicePart2Bean>(InvoicePart2Bean.class));
	
}

@Override
public List<InvoicePart2Bean> select(){
	
	return template.query( "SELECT * FROM INVOICE_PART2_TABLE"
						 ,new RowMapper<InvoicePart2Bean>(){
		
		public InvoicePart2Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			InvoicePart2Bean invoicePart2 = new InvoicePart2Bean();
			
			invoicePart2.setId							(rs.getInt(1));
			
			invoicePart2.setAcquirerIdentifier			(rs.getInt(2));
			invoicePart2.setMerchantIdentifier			(rs.getString(3));
			invoicePart2.setTerminalIdentification		(rs.getString(4));
			invoicePart2.setInterfaceDeviceSerialNumber	(rs.getString(5));
			invoicePart2.setTerminalType				(rs.getInt(6));		 
			invoicePart2.setTerminalCountryCode			(rs.getInt(7));				
			invoicePart2.setCountryCode					(rs.getInt(8));
			invoicePart2.setCurrencyCode				(rs.getInt(9));
			invoicePart2.setFormFactorIndicator			(rs.getInt(10));
			invoicePart2.setPointofServiceEntryMode		(rs.getInt(11));
			invoicePart2.setTransactionType				(rs.getInt(12));
			invoicePart2.setTransactionDate				(rs.getInt(13));
			invoicePart2.setTransactionTime				(rs.getInt(14));
			
			invoicePart2.setCreateUser					(rs.getString(15));
			invoicePart2.setCreateTimestamp				(rs.getTimestamp(16));
			invoicePart2.setModifyUser					(rs.getString(17));
			invoicePart2.setModifyTimestamp				(rs.getTimestamp(18));
			
			return invoicePart2;
			
		}
	});
  }
}
