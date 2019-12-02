package com.region04.merchant.terminal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region04.merchant.terminal.model.TerminalBean;

public class TerminalDaoImpl implements TerminalDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(TerminalBean terminal){

			String sql 
			
				= "INSERT INTO TERMINAL_TABLE "
						+ "("
						+ " ACQUIRER_IDENTIFIER"
						+ " MERCHANT_IDENTIFIER"
						+ " TERMINAL_IDENTIFICATION"
						+ " MERCHANT_CATEGORY_CODE"
						+ ",MERCHANT_NAME_AND_LOCATION"
						+ ",INTERFACE_DEVICE_SERIAL_NUMBER"
						+ ",TERMINAL_TYPE"
						+ ",TERMINAL_COUNTRY_CODE"
						+ ",TERMINAL_CAPABILITIES"
						+ ",KERNEL_4_READER_CAPABILITIES"
						+ ",ADDITIONAL_TERM_CAPABILITIES"
						+ ",TERMINAL_TRANS_QUALIFIER"
						+ ",VLP_TERM_SUPPORT_INDICATOR"
						+ ",VLP_TERM_TRANSACTION_LIMIT"
						+ ",TERMINAL_FLOOR_LIMIT"
						+ ",ACTION_CODE_DEFAULT"
						+ ",ACTION_CODE_DECLINE"
						+ ",ACTION_CODE_ONLINE"
						+ ",RISK_MANAGEMENT_DATA"
						+ ",VERIFICATION_RESULTS"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	terminal.getAcquirerIdentifier()			+	"'"
						+ ",'"	+	terminal.getMerchantIdentifier()			+	"'"
						+ ",'"	+	terminal.getTerminalIdentification()		+	"'"
						+ ",'"	+	terminal.getMerchantCategoryCode()			+	"'"
						+ ",'"	+	terminal.getMerchantNameAndLocation()		+	"'"
						+ ",'"	+	terminal.getInterfaceDeviceSerialNumber()	+	"'"
						+ ",'"	+	terminal.getTerminalType()					+	"'"
						+ ",'"	+	terminal.getTerminalCountryCode()			+	"'"
						+ ",'"	+	terminal.getTerminalCapabilities()			+	"'"
						+ ",'"	+	terminal.getKernel4ReaderCapabilities()		+	"'"
						+ ",'"	+	terminal.getAdditionalTermCapabilities()	+	"'"
						+ ",'"	+	terminal.getTerminalTransQualifiers()		+	"'"
						+ ",'"	+	terminal.getvLPTermSupportIndicator()		+	"'"
						+ ",'"	+	terminal.getvLPTermTransactionLimit()		+	"'"
						+ ",'"	+	terminal.getTerminalFloorLimit()			+	"'"						
						+ ",'"	+	terminal.getActionCodeDefault()				+	"'"		
						+ ",'"	+	terminal.getActionCodeDecline()				+	"'"	
						+ ",'"	+	terminal.getActionCodeOnline()				+	"'"		
						+ ",'"	+	terminal.getRiskManagementData()			+	"'"		
						+ ",'"	+	terminal.getVerificationResults()			+	"'"		
						
						+ ",'"	+	terminal.getCreateUser()					+	"'"
						+ ",'"	+	terminal.getCreateTimestamp()				+	"'"
						+ ",'"	+	terminal.getModifyUser()					+	"'"
						+ ",'"	+	terminal.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(TerminalBean terminal){
	
	String sql =
			
			" UPDATE TERMINAL_TABLE " 							+
			
			"    SET ACQUIRER_IDENTIFIER 				= '" 	+ terminal.getAcquirerIdentifier() 				+	"'"	+
			"      , MERCHANT_IDENTIFIER 				= '"  	+ terminal.getMerchantIdentifier()			 	+	"'"	+
			"      , TERMINAL_IDENTIFICATION 			= '"  	+ terminal.getTerminalIdentification()			+	"'"	+
			"      , MERCHANT_CATEGORY_CODE				= '" 	+ terminal.getMerchantCategoryCode()  			+	"'"	+
			"      , MERCHANT_NAME_AND_LOCATION			= '" 	+ terminal.getMerchantNameAndLocation()  		+	"'"	+
			"      , INTERFACE_DEVICE_SERIAL_NUMBER		= '" 	+ terminal.getInterfaceDeviceSerialNumber()  	+	"'"	+
			"      , TERMINAL_TYPE						= '" 	+ terminal.getTerminalType()  					+	"'"	+
			"      , TERMINAL_COUNTRY_CODE				= '" 	+ terminal.getTerminalCountryCode()  			+	"'"	+
			"      , TERMINAL_CAPABILITIES				= '" 	+ terminal.getTerminalCapabilities()  			+	"'"	+
			"      , KERNEL_4_READER_CAPABILITIES		= '" 	+ terminal.getKernel4ReaderCapabilities()  		+	"'"	+
			"      , ADDITIONAL_TERM_CAPABILITIES		= '" 	+ terminal.getAdditionalTermCapabilities()  	+	"'"	+
			"      , TERMINAL_TRANS_QUALIFIER			= '" 	+ terminal.getTerminalTransQualifiers()  		+	"'"	+				
			"      , VLP_TERM_SUPPORT_INDICATOR			= '" 	+ terminal.getvLPTermSupportIndicator()  		+	"'"	+
			"      , VLP_TERM_TRANSACTION_LIMIT			= '" 	+ terminal.getvLPTermTransactionLimit()  		+	"'"	+
			"      , TERMINAL_FLOOR_LIMIT				= '" 	+ terminal.getTerminalFloorLimit()  			+	"'"	+
			"      , ACTION_CODE_DEFAULT				= '" 	+ terminal.getActionCodeDefault()  				+	"'"	+
			"      , ACTION_CODE_DECLINE				= '" 	+ terminal.getActionCodeDecline()  				+	"'"	+
			"      , ACTION_CODE_ONLINE					= '" 	+ terminal.getActionCodeOnline()  				+	"'"	+
			"      , RISK_MANAGEMENT_DATA				= '" 	+ terminal.getRiskManagementData()  			+	"'"	+
			"      , VERIFICATION_RESULTS				= '" 	+ terminal.getVerificationResults()  			+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ terminal.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ terminal.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 								= "		+ terminal.getId()								+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TERMINAL_TABLE "
			+ "WHERE ID = "
			+ id
			+ "";
	
	return template.update(sql);
	
}

@Override
public TerminalBean selectTerminalById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TERMINAL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<TerminalBean>(TerminalBean.class));
	
}

@Override
public List<TerminalBean> select(){
	
	return template.query( "SELECT * FROM TERMINAL_TABLE"
						 ,new RowMapper<TerminalBean>(){
		
		public TerminalBean mapRow(ResultSet rs, int row) throws SQLException {
			
			TerminalBean terminal = new TerminalBean();
			
			terminal.setId								(rs.getInt(1));
			
			terminal.setAcquirerIdentifier				(rs.getInt(2));
			terminal.setMerchantIdentifier				(rs.getString(3));
			terminal.setTerminalIdentification			(rs.getString(4));
			terminal.setMerchantCategoryCode			(rs.getInt(5));
			terminal.setMerchantNameAndLocation			(rs.getString(6));
			terminal.setInterfaceDeviceSerialNumber		(rs.getString(7));
			terminal.setTerminalType					(rs.getInt(8));
			terminal.setTerminalCountryCode				(rs.getInt(9));
			terminal.setTerminalCapabilities			(rs.getInt(10));
			terminal.setKernel4ReaderCapabilities		(rs.getInt(11));
			terminal.setAdditionalTermCapabilities		(rs.getInt(12));
			terminal.setTerminalTransQualifiers			(rs.getInt(13));
			terminal.setvLPTermSupportIndicator			(rs.getInt(14));
			terminal.setvLPTermTransactionLimit			(rs.getInt(15));
			terminal.setTerminalFloorLimit				(rs.getInt(16));		
			terminal.setActionCodeDefault				(rs.getInt(17));	
			terminal.setActionCodeDecline				(rs.getInt(18));
			terminal.setActionCodeOnline				(rs.getInt(19));
			terminal.setRiskManagementData				(rs.getInt(20));	
			terminal.setVerificationResults				(rs.getInt(21));
			
			terminal.setCreateUser						(rs.getString(22));
			terminal.setCreateTimestamp					(rs.getTimestamp(23));
			terminal.setModifyUser						(rs.getString(24));
			terminal.setModifyTimestamp					(rs.getTimestamp(25));
			
			return terminal;
			
		}
	});
  }
}
