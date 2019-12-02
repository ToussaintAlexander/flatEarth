package com.region02.bank.issuer.card.chip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chip.model.KeysBean;

public class KeysDaoImpl implements KeysDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(KeysBean keys){

			String sql 
			
				= "INSERT INTO KEYS_TABLE "
						+ "("
						+ " PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						
						+ ",PIN_ENCIPHER_PUBLIC_KEY_CERT"
						+ ",PIN_ENCIPHER_PUBLIC_KEY_EXP"
						+ ",PIN_ENCIPHER_PUBLIC_KEY_REMAIN"
						
						+ ",PUBLIC_KEY_CERTIFICATE"
						+ ",PUBLIC_KEY_INDEX"
						+ ",PUBLIC_KEY_EXPONENT"				
						+ ",PUBLIC_KEY_REMAINDER"
						
						+ ",DYNAMIC_NUMBER"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	keys.getPrimaryAccountNumber()			+	"'"
						+ "('"	+	keys.getPrimaryAccountNumberSeq()		+	"'"
						
						+ "('"	+	keys.getPinEncipherPublicKeyCert()		+	"'"
						+ "('"	+	keys.getPinEncipherPublicKeyExp()		+	"'"
						+ "('"	+	keys.getPinEncipherPublicKeyRemain()	+	"'"
						
						+ "('"	+	keys.getPublicKeyCertificate()			+	"'"
						+ "('"	+	keys.getPublicKeyIndex()				+	"'"
						+ "('"	+	keys.getPublicKeyExponent()				+	"'"						
						+ "('"	+	keys.getPublicKeyRemainder()			+	"'"
						
						+ "('"	+	keys.getDynamicNumber()					+	"'"
						
						+ "('"	+	keys.getCreateUser()					+	"'"
						+ "('"	+	keys.getCreateTimestamp()				+	"'"
						+ "('"	+	keys.getModifyUser()					+	"'"
						+ "('"	+	keys.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(KeysBean integrated){
	
	String sql =
			
			" UPDATE KEYS_TABLE " 	+
			
			"      , PRIMARY_ACCOUNT_NUMBER 			= '"  	+ integrated.getPrimaryAccountNumber()			+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 		= '"  	+ integrated.getPrimaryAccountNumberSeq()		+	"'"	+
			
			"      , ICC_PIN_ENCIPHER_PUBLIC_KEY_CERT	= '"  	+ integrated.getPinEncipherPublicKeyCert()		+	"'"	+
			"      , ICC_PIN_ENCIPHER_PUBLIC_KEY_EXP 	= '"  	+ integrated.getPinEncipherPublicKeyExp()		+	"'"	+
			"      , ICC_PIN_ENCIPHER_PUBLIC_KEY_REMAIN = '"  	+ integrated.getPinEncipherPublicKeyRemain()	+	"'"	+
			
			"      , ICC_PUBLIC_KEY_CERTIFICATE 		= '"  	+ integrated.getPublicKeyCertificate()			+	"'"	+
			"      , ICC_PUBLIC_KEY_INDEX 				= '"  	+ integrated.getPublicKeyIndex()				+	"'"	+	
			"      , ICC_PUBLIC_KEY_EXPONENT 			= '"  	+ integrated.getPublicKeyExponent()				+	"'"	+						
			"      , ICC_PUBLIC_KEY_REMAINDER 			= '"  	+ integrated.getPublicKeyRemainder()			+	"'"	+
			
			"      , ICC_DYNAMIC_NUMBER 				= '"  	+ integrated.getDynamicNumber()					+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ integrated.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ integrated.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 								= "		+ integrated.getId()							+ 	"";	
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM KEYS_TABLE "
			+ "WHERE ID 	= "	+	id			+	"";
	
	return template.update(sql);
	
}

@Override
public KeysBean selectKeysById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM KEYS_TABLE "
		+ " WHERE ID 	 =  ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<KeysBean>(KeysBean.class));
	
}

@Override
public List<KeysBean> select(){
	
	return template.query( "SELECT * FROM KEYS_TABLE "
						 ,new RowMapper<KeysBean>(){
		
		public KeysBean mapRow(ResultSet rs, int row) throws SQLException {
			
			KeysBean keys = new KeysBean();
			
			keys.setId								(rs.getInt(1));
			keys.setPrimaryAccountNumber			(rs.getString(2));
			keys.setPrimaryAccountNumberSeq			(rs.getInt(3));
			
			keys.setPinEncipherPublicKeyCert		(rs.getByte(4));
			keys.setPinEncipherPublicKeyExp			(rs.getByte(5));
			keys.setPinEncipherPublicKeyRemain		(rs.getByte(6));
			
			keys.setPublicKeyCertificate			(rs.getLong(7));
			keys.setPublicKeyIndex					(rs.getByte(8));
			keys.setPublicKeyExponent				(rs.getByte(9));
			keys.setPublicKeyRemainder				(rs.getByte(10));
			
			keys.setDynamicNumber					(rs.getByte(11));
			
			keys.setCreateUser						(rs.getString(12));
			keys.setCreateTimestamp					(rs.getTimestamp(13));
			keys.setModifyUser						(rs.getString(14));
			keys.setModifyTimestamp					(rs.getTimestamp(15));
			
			return keys;
			
		}
	});
  }
}
