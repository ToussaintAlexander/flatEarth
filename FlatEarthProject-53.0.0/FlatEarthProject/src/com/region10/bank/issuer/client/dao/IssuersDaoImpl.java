package com.region10.bank.issuer.client.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region10.bank.issuer.client.model.IssuersBean;

public class IssuersDaoImpl implements IssuersDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(IssuersBean issuers){

			String sql 
			
				= "INSERT INTO ISSUERS_TABLE "
						+ "("
						+ " INTL_BANK_ACCOUNT_NUMBER"
						+ " BANK_IDENTIFIER_CODE"
						+ " BANK_IDENTIFICATION_NUMBER"
						+ " NAME"
						+ ",STREET"
						+ ",CITY"
						+ ",STATE"
						+ ",COUNTRY"
						+ ",ZIP_CODE"
						+ ",PHONE_NUMBER"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	issuers.getIntlBankAccountNumber()		+	"'"
						+ ",'"	+	issuers.getBankIdentifierCode()			+	"'"
						+ ",'"	+	issuers.getBankIdentificationNumber()	+	"'"
						+ ",'"	+	issuers.getName()						+	"'"
						+ ",'"	+	issuers.getStreet()						+	"'"
						+ ",'"	+	issuers.getCity()						+	"'"
						+ ",'"	+	issuers.getState()						+	"'"
						+ ",'"	+	issuers.getCountry()					+	"'"
						+ ",'"	+	issuers.getZipCode()					+	"'"
						+ ",'"	+	issuers.getPhoneNumber()				+	"'"
						+ ",'"	+	issuers.getCreateUser()					+	"'"
						+ ",'"	+	issuers.getCreateTimestamp()			+	"'"
						+ ",'"	+	issuers.getModifyUser()					+	"'"
						+ ",'"	+	issuers.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(IssuersBean issuers){
	
	String sql =
			
			" UPDATE ACQUIRER_TABLE " 	+
					
			"    SET INTL_BANK_ACCOUNT_NUMBER 	= '" 	+ issuers.getIntlBankAccountNumber() 	+	"'"	+
			"      , BANK_IDENTIFIER_CODE 		= '"  	+ issuers.getBankIdentifierCode()		+	"'"	+
			"      , BANK_IDENTIFICATION_NUMBER = '"  	+ issuers.getBankIdentificationNumber()	+	"'"	+
			"      , NAME 						= '" 	+ issuers.getName() 					+	"'"	+
			"      , STREET 					= '"  	+ issuers.getStreet()			 		+	"'"	+
			"      , CITY						= '" 	+ issuers.getCity()  					+	"'"	+
			"      , STATE						= '" 	+ issuers.getState()  					+	"'"	+
			"      , COUNTRY					= '" 	+ issuers.getCountry()  				+	"'"	+
			"      , ZIP_CODE					= '" 	+ issuers.getZipCode()  				+	"'"	+
			"      , PHONE_NUMBER				= '" 	+ issuers.getPhoneNumber()  			+	"'"	+
			"      , MODIFY_USER				= '" 	+ issuers.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ issuers.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 						= "		+ issuers.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM ISSUERS_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public IssuersBean selectIssuersById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM ISSUERS_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<IssuersBean>(IssuersBean.class));
	
}

@Override
public List<IssuersBean> select(){
	
	return template.query( "SELECT * FROM ISSUERS_TABLE"
						 ,new RowMapper<IssuersBean>(){
		
		public IssuersBean mapRow(ResultSet rs, int row) throws SQLException {
			
			IssuersBean issuers = new IssuersBean();
			
			issuers.setId						(rs.getInt("ID"));
			issuers.setIntlBankAccountNumber	(rs.getString("INTL_BANK_ACCOUNT_NUMBER"));
			issuers.setBankIdentifierCode		(rs.getString("BANK_IDENTIFIER_CODE"));
			issuers.setBankIdentificationNumber	(rs.getInt("BANK_IDENTIFICATION_NUMBER"));
			issuers.setName						(rs.getString("NAME"));
			issuers.setStreet					(rs.getString("STREET"));
			issuers.setCity						(rs.getString("CITY"));
			issuers.setState					(rs.getString("STATE"));
			issuers.setCountry					(rs.getString("COUNTRY"));
			issuers.setZipCode					(rs.getString("ZIP_CODE"));
			issuers.setPhoneNumber				(rs.getString("PHONE_NUMBER"));
			issuers.setCreateUser				(rs.getString("CREATE_USER"));
			issuers.setCreateTimestamp			(rs.getTimestamp("CREATE_TIMESTAMP"));
			issuers.setModifyUser				(rs.getString("MODIFY_USER"));
			issuers.setModifyTimestamp			(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return issuers;
			
		}
	});
  }
}
