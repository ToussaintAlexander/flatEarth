package com.region02.bank.issuer.card.magstripe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.magstripe.model.Track1Bean;

public class Track1DaoImpl implements Track1Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(Track1Bean track){

			String sql 
			
				= "INSERT INTO TRACK1_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
					    	
					 	+ ",START_SENTINEL" 	
					 	+ ",FORMAT_CODE" 	
//					 	+ ",PRIMARY_ACCOUNT_NUMBER" 
					 	+ ",FIELD_SEPARATOR_1" 
					 	+ ",FULL_NAME" 
					 	+ ",FIELD_SEPARATOR_2" 
					 	+ ",EXPIRATION_DATE_YEAR"
					 	+ ",EXPIRATION_DATE_MONTH"
					 	+ ",SERVICE_CODE"
					 	+ ",PIN_VALIDATION_KEY_INDEX"
					 	+ ",PIN_VERIFICATION_VALUE"
					 	+ ",CARD_VERIFICATION_VALUE"
					 	+ ",END_SENTINEL"
					 	+ ",LONG_REDUNDANCY_CHECK"
					    	
					   	+ ",CREATE_USER"
					   	+ ",CREATE_TIMESTAMP"
					   	+ ",MODIFY_USER"
					   	+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	track.getPrimaryAccountNumber()		+	"'"
						+ "('"	+	track.getPrimaryAccountNumberSeq()	+	"'"
						
						+ "('"	+	track.getStartSentinel()			+	"'"
						+ "('"	+	track.getFormatCode()				+	"'"
						+ "('"	+	track.getFieldSeparator1()			+	"'"
						+ "('"	+	track.getFullName()					+	"'"
						+ "('"	+	track.getFieldSeparator2()			+	"'"
//						+ "('"	+	track.getPrimaryAccountNumber()		+	"'"
						+ "('"	+	track.getExpirationDateYear()		+	"'"
						+ "('"	+	track.getExpirationDateMonth()		+	"'"
						+ "('"	+	track.getServiceCode()				+	"'"
						+ "('"	+	track.getPinValidationKeyIndex()	+	"'"
						+ "('"	+	track.getPinVerificationValue()		+	"'"
						+ "('"	+	track.getCardVerificationValue()	+	"'"
						+ "('"	+	track.getEndSentinel()				+	"'"
						+ "('"	+	track.getLongRedundancyCheck()		+	"'"
						
						+ "('"	+	track.getCreateUser()				+	"'"
						+ "('"	+	track.getCreateTimestamp()			+	"'"
						+ "('"	+	track.getModifyUser()				+	"'"
						+ "('"	+	track.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(Track1Bean track){
	
	String sql =
			
			" UPDATE TRACK1_TABLE " 						+
			
			"    SET START_SENTINEL 			= '"  	+ track.getStartSentinel()				+	"'"	+
			"      , FORMAT_CODE 				= '"  	+ track.getFormatCode()					+	"'"	+
			
//			"      , PRIMARY_ACCOUNT_NUMBER		= '"  	+ track.getPrimaryAccountNumber()		+	"'"	+
			
			"      , FIELD_SEPARATOR1 			= '"  	+ track.getFieldSeparator1()			+	"'"	+
			"      , FULL_NAME 					= '"  	+ track.getFullName()					+	"'"	+
			"      , FIELD_SEPARATOR2 			= '"  	+ track.getFieldSeparator2()			+	"'"	+
			
			"      , EXPIRATION_DATE_YEAR 		= '"  	+ track.getExpirationDateYear()			+	"'"	+
			"      , EXPIRATION_DATE_MONTH 		= '"  	+ track.getExpirationDateMonth()		+	"'"	+
			"      , SERVICE_CODE 				= '"  	+ track.getServiceCode()				+	"'"	+
			"      , PIN_VALIDATION_KEY_INDEX 	= '"  	+ track.getPinValidationKeyIndex()		+	"'"	+
			"      , PIN_VERIFICATION_VALUE 	= '"  	+ track.getPinVerificationValue()		+	"'"	+
			"      , CARD_VERIFICATION_VALUE 	= '"  	+ track.getCardVerificationValue()		+	"'"	+
			"      , END_SENTINEL 				= '"  	+ track.getEndSentinel()				+	"'"	+
			"      , LONG_REDUNDANCY_CHECK 		= '"  	+ track.getLongRedundancyCheck()		+	"'"	+
			
			"      , MODIFY_USER				= '" 	+ track.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ track.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 						=  "	+ track.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TRACK1_TABLE "
			+ "WHERE ID 		= "	+	id			+	""; 
	
	return template.update(sql);
	
}

@Override
public Track1Bean selectTrackById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TRACK1_TABLE "
		+ " WHERE ID 	 = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<Track1Bean>(Track1Bean.class));
	
}

@Override
public List<Track1Bean> select(){
	
	return template.query( "SELECT * from TRACK1_TABLE "
						 ,new RowMapper<Track1Bean>(){
		
		public Track1Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			Track1Bean track = new Track1Bean();
			
			track.setId							(rs.getInt(1));
			track.setPrimaryAccountNumber		(rs.getString(2));
			track.setPrimaryAccountNumberSeq	(rs.getInt(3));
			
			track.setStartSentinel				(rs.getString(4).charAt(0));
			track.setFormatCode					(rs.getString(5).charAt(0));

//			track.setPrimaryAccountNumber		(rs.getString(2));
			
			track.setFieldSeparator1			(rs.getString(6).charAt(0));
			track.setFullName					(rs.getString(7));
			track.setFieldSeparator2			(rs.getString(8).charAt(0));
			
			track.setExpirationDateYear			(rs.getInt(9));
			track.setExpirationDateMonth		(rs.getInt(10));
			track.setServiceCode				(rs.getInt(11));
			track.setPinValidationKeyIndex		(rs.getInt(12));
			track.setPinVerificationValue		(rs.getInt(13));
			track.setCardVerificationValue		(rs.getInt(14));
			track.setEndSentinel				(rs.getString(15).charAt(0));
			track.setLongRedundancyCheck		(rs.getString(16).charAt(0));
			
			track.setCreateUser					(rs.getString(17));
			track.setCreateTimestamp			(rs.getTimestamp(18));
			track.setModifyUser					(rs.getString(19));
			track.setModifyTimestamp			(rs.getTimestamp(20));
			
			return track;
			
		}
	});
  }
}
