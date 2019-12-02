package com.region06.bank.acquirer.master.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region06.bank.acquirer.master.model.AcquirerMasterFileBean;

public class AcquirerMasterFileDaoImpl implements AcquirerMasterFileDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AcquirerMasterFileBean file){

			String sql 
			
				= "INSERT INTO ACQUIRER_MASTER_FILE_TABLE "
						+ "("
						+ ",INTL_BANK_ACCOUNT_NUMBER"
						+ ",BANK_IDENTIFIER_CODE"
						+ ",BANK_IDENTIFICATION_NUMBER"
						+ ",MERCHANT_IDENTIFIER"
						+ ",MERCHANT_CATEOGRY_CODE"
						+ " ACQUIRER_IDENTIFIER"
//						+ " MERCHANT_IDENTIFIER"
						+ " TERMINAL_IDENTIFICATION"						
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
						+ "('"	+	file.getIntlBankAccountNumber()			+	"'"
						+ ",'"	+	file.getBankIdentifierCode()			+	"'"
						+ ",'"	+	file.getBankIdentificationNumber()		+	"'"
						+ ",'"	+	file.getMerchantIdentifier()			+	"'"
						+ ",'"	+	file.getMerchantCategoryCode()			+	"'"
						+ ",'"	+	file.getAcquirerIdentifier()			+	"'"
//						+ ",'"	+	file.getMerchantIdentifier()			+	"'"
						+ ",'"	+	file.getTerminalIdentification()		+	"'"
						+ ",'"	+	file.getInterfaceDeviceSerialNumber()	+	"'"
						+ ",'"	+	file.getTerminalType()					+	"'"
						+ ",'"	+	file.getTerminalCountryCode()			+	"'"
						+ ",'"	+	file.getCountryCode()					+	"'"
						+ ",'"	+	file.getCurrencyCode()					+	"'"
						+ ",'"	+	file.getFormFactorIndicator()			+	"'"
						+ ",'"	+	file.getPointofServiceEntryMode()		+	"'"
						+ ",'"	+	file.getTransactionType()				+	"'"
						+ ",'"	+	file.getTransactionDate()				+	"'"
						+ ",'"	+	file.getTransactionTime()				+	"'"
						
						+ ",'"	+	file.getCreateUser()					+	"'"
						+ ",'"	+	file.getCreateTimestamp()				+	"'"
						+ ",'"	+	file.getModifyUser()					+	"'"
						+ ",'"	+	file.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AcquirerMasterFileBean file){
	
	String sql =
			
			" UPDATE ACQUIRER_MASTER_FILE_TABLE " 			+
					
			"    SET INTL_BANK_ACCOUNT_NUMBER 		= '" 	+ file.getIntlBankAccountNumber() 		+	"'"	+
			"      , BANK_IDENTIFIER_CODE 			= '"  	+ file.getBankIdentifierCode()			+	"'"	+
			"      , BANK_IDENTIFICATION_NUMBER 	= '"  	+ file.getBankIdentificationNumber()	+	"'"	+
			"      , MERCHANT_IDENTIFIER 			= '" 	+ file.getMerchantIdentifier() 			+	"'"	+
			"      , MERCHANT_CATEOGRY_CODE 		= '"  	+ file.getMerchantCategoryCode()		+	"'"	+
			"      , ACQUIRER_IDENTIFIER 			= '"  	+ file.getAcquirerIdentifier()			+	"'"	+
//			"      , MERCHANT_IDENTIFIER 			= '"  	+ file.getMerchantIdentifier()			+	"'"	+
			"      , TERMINAL_IDENTIFICATION 		= '" 	+ file.getTerminalIdentification() 		+	"'"	+
			"      , INTERFACE_DEVICE_SERIAL_NUMBER	= '"  	+ file.getInterfaceDeviceSerialNumber()	+	"'"	+
			"      , TERMINAL_TYPE					= '" 	+ file.getTerminalType()  				+	"'"	+
			"      , TERMINAL_COUNTRY_CODE			= '" 	+ file.getTerminalCountryCode()  		+	"'"	+	
			"      , COUNTRY_CODE 					= '"  	+ file.getCountryCode()					+	"'"	+
			"      , CURRENCY_CODE 					= '"  	+ file.getCurrencyCode()				+	"'"	+
			"      , FORM_FACTOR_INDICATOR 			= '" 	+ file.getFormFactorIndicator() 		+	"'"	+
			"      , POINT_OF_SERVICE_ENTRY_MODE 	= '"  	+ file.getPointofServiceEntryMode()		+	"'"	+
			"      , TRANSACTON_TYPE				= '" 	+ file.getTransactionType()  			+	"'"	+
			"      , TRANSACTION_DATE				= '" 	+ file.getTransactionDate()  			+	"'"	+	
			"      , TRANSACTION_TIME				= '" 	+ file.getTransactionTime()  			+	"'"	+	
			"      , MODIFY_USER					= '" 	+ file.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ file.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ file.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM ACQUIRER_MASTER_FILE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public AcquirerMasterFileBean selectAcquirerMasterFileById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM ACQUIRER_MASTER_FILE_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<AcquirerMasterFileBean>(AcquirerMasterFileBean.class));
	
}

@Override
public List<AcquirerMasterFileBean> select(){
	
	return template.query( "SELECT * FROM ACQUIRER_MASTER_FILE_TABLE"
						 ,new RowMapper<AcquirerMasterFileBean>(){
		
		public AcquirerMasterFileBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AcquirerMasterFileBean file = new AcquirerMasterFileBean();
			
			file.setId							(rs.getInt("ID"));
			file.setIntlBankAccountNumber		(rs.getString("INTL_BANK_ACCOUNT_NUMBER"));
			file.setBankIdentifierCode			(rs.getString("BANK_IDENTIFIER_CODE"));
			file.setBankIdentificationNumber	(rs.getInt("BANK_IDENTIFICATION_NUMBER"));
			file.setMerchantIdentifier			(rs.getString("MERCHANT_IDENTIFIER"));
			file.setMerchantCategoryCode		(rs.getString("MERCHANT_CATEGORY_CODE"));
			file.setAcquirerIdentifier			(rs.getLong("ACQUIRER_IDENTIFIER"));
//			file.setMerchantIdentifier			(rs.getString("MERCHANT_IDENTIFIER"));
			file.setTerminalIdentification		(rs.getString("TERMINAL_IDENTIFICATION"));
			file.setInterfaceDeviceSerialNumber	(rs.getString("INTERFACE_DEVICE_SERIAL_NUMBER"));
			file.setTerminalType				(rs.getInt("TERMINAL_TYPE"));
			file.setTerminalCountryCode			(rs.getInt("TERMINAL_COUNTRY_CODE"));
			file.setCountryCode					(rs.getInt("COUNTRY_CODE"));
			file.setCurrencyCode				(rs.getInt("CURRENCY_CODE"));
			file.setFormFactorIndicator			(rs.getInt("FORM_FACTOR_INDICATOR"));
			file.setPointofServiceEntryMode		(rs.getInt("POINT_OF_SERVICE_ENTRY_MODE"));
			file.setTransactionType				(rs.getInt("TRANSACTON_TYPE"));
			file.setTransactionDate				(rs.getInt("TRANSACTION_DATE"));
			file.setTransactionTime				(rs.getInt("TRANSACTION_TIME"));
			
			file.setCreateUser					(rs.getString("CREATE_USER"));
			file.setCreateTimestamp				(rs.getTimestamp("CREATE_TIMESTAMP"));
			file.setModifyUser					(rs.getString("MODIFY_USER"));
			file.setModifyTimestamp				(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return file;
			
		}
	});
  }
}
