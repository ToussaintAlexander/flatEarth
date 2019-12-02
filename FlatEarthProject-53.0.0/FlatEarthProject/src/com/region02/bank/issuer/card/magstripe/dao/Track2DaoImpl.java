package com.region02.bank.issuer.card.magstripe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.magstripe.model.Track2Bean;

public class Track2DaoImpl implements Track2Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(Track2Bean track){

			String sql 
			
				= "INSERT INTO TRACK2_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
					    	
					 	+ ",START_SENTINEL" 
//					 	+ ",PRIMARY_ACCOUNT_NUMBER"
					 	+ ",FIELD_SEPARATOR" 
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
//						+ "('"	+	track.getPrimaryAccountNumberSeq()	+	"'"
						+ "('"	+	track.getFieldSeparator()			+	"'"
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
public int update(Track2Bean track){
	
	String sql =
			
			" UPDATE CARD_TABLE " 	+
			
			"    SET START_SENTINEL 			= '"  	+ track.getStartSentinel()				+	"'"	+
//			"      , PRIMARY_ACCOUNT_NUMBER		= '"  	+ track.getPrimaryAccountNumber()		+	"'"	+
			"      , FIELD_SEPARATOR 			= '"  	+ track.getFieldSeparator()				+	"'"	+
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
			
			"  WHERE ID 						= "		+ track.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TRACK2_TABLE "
			+ "WHERE ID 		= "	+	id	 +	"";
	
	return template.update(sql);
	
}

@Override
public Track2Bean selectTrackById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TRACK2_TABLE "
		+ " WHERE ID 	 = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<Track2Bean>(Track2Bean.class));
	
}

@Override
public List<Track2Bean> select(){
	
	return template.query( "SELECT * from TRACK2_TABLE "
						 ,new RowMapper<Track2Bean>(){
		
		public Track2Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			Track2Bean track = new Track2Bean();
			
			track.setId							(rs.getInt(1));
			track.setPrimaryAccountNumber		(rs.getString(2));
			track.setPrimaryAccountNumberSeq	(rs.getInt(3));
			
			track.setStartSentinel				(rs.getString(4).charAt(0));
//			track.setPrimaryAccountNumber		(rs.getString(2));
			track.setFieldSeparator				(rs.getString(5).charAt(0));
			track.setExpirationDateYear			(rs.getInt(6));
			track.setExpirationDateMonth		(rs.getInt(7));
			track.setServiceCode				(rs.getInt(8));
			track.setPinValidationKeyIndex		(rs.getInt(9));
			track.setPinVerificationValue		(rs.getInt(10));
			track.setCardVerificationValue		(rs.getInt(11));
			track.setEndSentinel				(rs.getString(12).charAt(0));
			track.setLongRedundancyCheck		(rs.getString(13).charAt(0));
			
			track.setCreateUser					(rs.getString(14));
			track.setCreateTimestamp			(rs.getTimestamp(15));
			track.setModifyUser					(rs.getString(16));
			track.setModifyTimestamp			(rs.getTimestamp(17));
			
			return track;
			
		}
	});
  }
}
