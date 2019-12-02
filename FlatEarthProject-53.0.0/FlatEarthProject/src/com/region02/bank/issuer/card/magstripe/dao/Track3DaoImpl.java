package com.region02.bank.issuer.card.magstripe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.magstripe.model.Track3Bean;

public class Track3DaoImpl implements Track3Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(Track3Bean track){

			String sql 
			
				= "INSERT INTO TRACK3_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
					    	
					 	+ ",START_SENTINEL" 
					 	+ ",FORMAT_CODE" 
//					 	+ ",PRIMARY_ACCOUNT_NUMBER"
					 	+ ",FIELD_SEPARATOR" 
						+ ",COUNTRY_CODE"
						+ ",CURRENCY_CODE"
						+ ",CURRENCY_EXPONENT"
						+ ",AMOUNT_AUTHORIZED_PER_CYCLE"
						+ ",AMOUNT_REMAINING_THIS_CYCLE"
						+ ",CYCLE_BEGIN_YEAR"
						+ ",CYCLE_BEGIN_DAY"
						+ ",CYCLE_LENGTH"
						+ ",RETRY_COUNT"
						+ ",PIN_CONTROL_PARAMETERS"
						+ ",INTERCHANGE_CONTROLS"
						+ ",PAN_SERVICE_RSTRICTION"
						+ ",SAN1_SERVICE_RSTRICTION"
						+ ",SAN2_SERVICE_RSTRICTION"
					 	+ ",EXPIRATION_DATE_YEAR"
					 	+ ",EXPIRATION_DATE_MONTH"
					 	+ ",CARD_SEQUENCE_NUMBER"
					 	+ ",CARD_SECURITY_NUMBER"
					 	+ ",RELAY_MARKER"
					 	+ ",CRYPTOGRAPHIC_CHECK_DIGITS"
					 	+ ",END_SENTINEL"
					 	+ ",LONG_REDUNDANCY_CHECK"
					    	
					   	+ ",CREATE_USER"
					   	+ ",CREATE_TIMESTAMP"
					   	+ ",MODIFY_USER"
					   	+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	track.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	track.getPrimaryAccountNumberSeq()		+	"'"
						
						+ "('"	+	track.getStartSentinel()				+	"'"
						+ "('"	+	track.getFormatCode()					+	"'"
//						+ "('"	+	track.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	track.getFieldSeparator()				+	"'"
						+ "('"	+	track.getCountryCode()					+	"'"
						+ "('"	+	track.getCurrencyCode()					+	"'"
						+ "('"	+	track.getCurrencyExponent()				+	"'"
						+ "('"	+	track.getAmountAuthorizedPerCycle()		+	"'"
						+ "('"	+	track.getAmountRemainingThisCycle()		+	"'"
						+ "('"	+	track.getCycleBeginYear()				+	"'"
						+ "('"	+	track.getCycleBeginDay()				+	"'"
						+ "('"	+	track.getCycleLength()					+	"'"						
						+ "('"	+	track.getRetryCount()					+	"'"
						+ "('"	+	track.getPinControlParameters()			+	"'"
						+ "('"	+	track.getInterchangeControls()			+	"'"
						+ "('"	+	track.getPanServiceRestriction()		+	"'"
						+ "('"	+	track.getSan1ServiceRestriction()		+	"'"											
						+ "('"	+	track.getSan2ServiceRestriction()		+	"'"
						+ "('"	+	track.getExpirationDateYear()			+	"'"
						+ "('"	+	track.getExpirationDateMonth()			+	"'"
						+ "('"	+	track.getCardSequenceNumber()			+	"'"
						+ "('"	+	track.getCardSecurityNumber()			+	"'"
						+ "('"	+	track.getRelayMarker()					+	"'"
						+ "('"	+	track.getCryptographicCheckDigits()		+	"'"
						+ "('"	+	track.getEndSentinel()					+	"'"
						+ "('"	+	track.getLongRedundancyCheck()			+	"'"
						
						+ "('"	+	track.getCreateUser()					+	"'"
						+ "('"	+	track.getCreateTimestamp()				+	"'"
						+ "('"	+	track.getModifyUser()					+	"'"
						+ "('"	+	track.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(Track3Bean track){
	
	String sql =
			
			" UPDATE TRACK3_TABLE " 						+
			
			"    SET START_SENTINEL 				= '"  	+ 	track.getStartSentinel()				+	"'"	+
			"      , FIELD_SEPARATOR 				= '"  	+ 	track.getFieldSeparator()				+	"'"	+
			
			"      , START_SENTINEL 				= '"  	+	track.getStartSentinel()				+	"'"	+
			"      , FORMAT_CODE 					= '"  	+	track.getFormatCode()					+	"'"	+
//			"      , PRIMARY_ACCOUNT_NUMBER 		= '"  	+	track.getPrimaryAccountNumber()			+	"'"	+
			"      , FIELD_SEPARATOR 				= '"  	+	track.getFieldSeparator()				+	"'"	+
			"      , COUNTRY_CODE 					= '"  	+	track.getCountryCode()					+	"'"	+
			"      , CURRENCY_CODE 					= '"  	+	track.getCurrencyCode()					+	"'"	+
			"      , CURRENCY_EXPONENT 				= '"  	+	track.getCurrencyExponent()				+	"'"	+
			"      , AMOUNT_AUTHORIZED_PER_CYCLE 	= '"  	+	track.getAmountAuthorizedPerCycle()		+	"'"	+
			"      , AMOUNT_REMAINING_THIS_CYCLE 	= '"  	+	track.getAmountRemainingThisCycle()		+	"'"	+
			"      , CYCLE_BEGIN_YEAR 				= '"  	+	track.getCycleBeginYear()				+	"'"	+
			"      , CYCLE_BEGIN_DAY 				= '"  	+	track.getCycleBeginDay()				+	"'"	+
			"      , CYCLE_LENGTH 					= '"  	+	track.getCycleLength()					+	"'"	+					
			"      , RETRY_COUNT 					= '"  	+	track.getRetryCount()					+	"'"	+
			"      , PIN_CONTROL_PARAMETERS 		= '"  	+	track.getPinControlParameters()			+	"'"	+
			"      , INTERCHANGE_CONTROLS 			= '"  	+	track.getInterchangeControls()			+	"'"	+
			"      , PAN_SERVICE_RSTRICTION 		= '"  	+	track.getPanServiceRestriction()		+	"'"	+
			"      , SAN1_SERVICE_RSTRICTION 		= '"  	+	track.getSan1ServiceRestriction()		+	"'"	+										
			"      , SAN2_SERVICE_RSTRICTION 		= '"  	+	track.getSan2ServiceRestriction()		+	"'"	+
			"      , EXPIRATION_DATE_YEAR 			= '"  	+	track.getExpirationDateYear()			+	"'"	+
			"      , EXPIRATION_DATE_MONTH 			= '"  	+	track.getExpirationDateMonth()			+	"'"	+
			"      , CARD_SEQUENCE_NUMBER 			= '"  	+	track.getCardSequenceNumber()			+	"'"	+
			"      , CARD_SECURITY_NUMBER 			= '"  	+	track.getCardSecurityNumber()			+	"'"	+
			"      , RELAY_MARKER 					= '"  	+	track.getRelayMarker()					+	"'"	+
			"      , CRYPTOGRAPHIC_CHECK_DIGITS 	= '"  	+	track.getCryptographicCheckDigits()		+	"'"	+
			"      , END_SENTINEL 					= '"  	+	track.getEndSentinel()					+	"'"	+
			"      , LONG_REDUNDANCY_CHECK 			= '"  	+	track.getLongRedundancyCheck()			+	"'"	+
			
			"      , MODIFY_USER					= '" 	+ track.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ track.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 							=  "	+ track.getId()								+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TRACK3_TABLE "
			+ "WHERE ID 		= "	+	id			+	"";
	
	return template.update(sql);
	
}

@Override
public Track3Bean selectTrackById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TRACK3_TABLE "
		+ " WHERE ID 	 = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<Track3Bean>(Track3Bean.class));
	
}

@Override
public List<Track3Bean> select(){
	
	return template.query( "SELECT * FROM TRACK3_TABLE "
						 ,new RowMapper<Track3Bean>(){
		
		public Track3Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			Track3Bean track = new Track3Bean();
			
			track.setId							(rs.getInt(1));
			track.setPrimaryAccountNumber		(rs.getString(2));
			track.setPrimaryAccountNumberSeq	(rs.getInt(3));
			
			track.setStartSentinel				(rs.getString(4).charAt(0));

			track.setFormatCode					(rs.getString(5).charAt(0));
//			track.setPrimaryAccountNumber		(rs.getInt(1));
			track.setFieldSeparator				(rs.getString(6).charAt(0));
			track.setCountryCode				(rs.getInt(7));
			track.setCurrencyCode				(rs.getInt(8));
			track.setCurrencyExponent			(rs.getInt(9));
			track.setAmountAuthorizedPerCycle	(rs.getInt(10));
			track.setAmountRemainingThisCycle	(rs.getInt(11));
			track.setCycleBeginYear				(rs.getInt(12));
			track.setCycleBeginDay				(rs.getInt(13));
			track.setCycleLength				(rs.getInt(14));					
			track.setRetryCount					(rs.getInt(15));
			track.setPinControlParameters		(rs.getString(16));
			track.setInterchangeControls		(rs.getInt(17));
			track.setPanServiceRestriction		(rs.getInt(18));
			track.setSan1ServiceRestriction		(rs.getInt(19));										
			track.setSan2ServiceRestriction		(rs.getInt(20));
			track.setExpirationDateYear			(rs.getInt(21));
			track.setExpirationDateMonth		(rs.getInt(22));
			track.setCardSequenceNumber			(rs.getInt(23));
			track.setCardSecurityNumber			(rs.getInt(24));
			track.setRelayMarker				(rs.getString(25).charAt(0));
			track.setCryptographicCheckDigits	(rs.getInt(26));
			track.setEndSentinel				(rs.getString(27).charAt(0));
			track.setLongRedundancyCheck		(rs.getString(28).charAt(0));
			
			track.setCreateUser					(rs.getString(29));
			track.setCreateTimestamp			(rs.getTimestamp(30));
			track.setModifyUser					(rs.getString(31));
			track.setModifyTimestamp			(rs.getTimestamp(32));
			
			return track;
			
		}
	});
  }
}
