package com.region10.bank.issuer.master.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region10.bank.issuer.master.model.IssuerMasterFileBean;

public class IssuerMasterFileDaoImpl implements IssuerMasterFileDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(IssuerMasterFileBean file){

			String sql 
			
				= "INSERT INTO ISSUER_MASTER_FILE_TABLE "
						+ "("
						+ " INTL_BANK_ACCOUNT_NUMBER"
						+ ",BANK_IDENTIFIER_CODE"
						+ ",BANK_IDENTIFICATION_NUMBER"
						+ ",FIRST_NAME"
						+ ",MIDDLE_NAME"
						+ ",LAST_NAME"
						+ ",SOCIAL_SECURITY"
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						+ ",ASSOCIATION_NAME"
						+ ",BANK_NAME"
						+ ",BRAND_NAME"
						+ ",CARD_EXPIRATION_DATE"
						+ ",CARD_VERIFICATION_VALUE"						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	file.getIntlBankAccountNumber()		+	"'"
						+ ",'"	+	file.getBankIdentifierCode()		+	"'"
						+ ",'"	+	file.getBankIdentificationNumber()	+	"'"
						+ ",'"	+	file.getFirstName()					+	"'"
						+ ",'"	+	file.getMiddleName()				+	"'"
						+ ",'"	+	file.getLastName()					+	"'"
						+ ",'"	+	file.getSocialSecurity()			+	"'"
						+ ",'"	+	file.getPrimaryAccountNumber()		+	"'"
						+ ",'"	+	file.getPrimaryAccountNumberSeq()	+	"'"
						+ ",'"	+	file.getAssociationName()			+	"'"
						+ ",'"	+	file.getBankName()					+	"'"
						+ ",'"	+	file.getBrandName()					+	"'"
						+ ",'"	+	file.getCardExpirationDate()		+	"'"
						+ ",'"	+	file.getCardVerificationValue()		+	"'"					
						+ ",'"	+	file.getCreateUser()				+	"'"
						+ ",'"	+	file.getCreateTimestamp()			+	"'"
						+ ",'"	+	file.getModifyUser()				+	"'"
						+ ",'"	+	file.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(IssuerMasterFileBean file){
	
	String sql =
			
			" UPDATE ISSUER_MASTER_FILE_TABLE " 		+
					
			"    SET INTL_BANK_ACCOUNT_NUMBER 	= '" 	+ file.getIntlBankAccountNumber() 		+	"'"	+
			"      , BANK_IDENTIFIER_CODE 		= '"  	+ file.getBankIdentifierCode()			+	"'"	+
			"      , BANK_IDENTIFICATION_NUMBER = '"  	+ file.getBankIdentificationNumber()	+	"'"	+
			"      , FIRST_NAME 				= '" 	+ file.getFirstName() 					+	"'"	+
			"      , MIDDLE_NAME 				= '"  	+ file.getMiddleName()			 		+	"'"	+
			"      , LAST_NAME					= '" 	+ file.getLastName()  					+	"'"	+
			"      , SOCIAL_SECURITY			= '" 	+ file.getSocialSecurity()  			+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER		= '" 	+ file.getPrimaryAccountNumber()  		+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ = '"  	+ file.getPrimaryAccountNumberSeq()		+	"'"	+
			"      , ASSOCIATION_NAME 			= '"  	+ file.getAssociationName()				+	"'"	+
			"      , BANK_NAME 					= '" 	+ file.getBankName() 					+	"'"	+
			"      , BRAND_NAME 				= '"  	+ file.getBrandName()			 		+	"'"	+
			"      , CARD_EXPIRATION_DATE		= '" 	+ file.getCardExpirationDate()  		+	"'"	+
			"      , CARD_VERIFICATION_VALUE	= '" 	+ file.getCardVerificationValue()  		+	"'"	+
			"      , MODIFY_USER				= '" 	+ file.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ file.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 						= "		+ file.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM ISSUER_MASTER_FILE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public IssuerMasterFileBean selectIssuerMasterFileById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM ISSUER_MASTER_FILE_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<IssuerMasterFileBean>(IssuerMasterFileBean.class));
	
}

@Override
public List<IssuerMasterFileBean> select(){
	
	return template.query( "SELECT * FROM ISSUER_MASTER_FILE_TABLE"
						 ,new RowMapper<IssuerMasterFileBean>(){
		
		public IssuerMasterFileBean mapRow(ResultSet rs, int row) throws SQLException {
			
			IssuerMasterFileBean file = new IssuerMasterFileBean();
			
			file.setId							(rs.getInt("ID"));
			file.setIntlBankAccountNumber		(rs.getString("INTL_BANK_ACCOUNT_NUMBER"));
			file.setBankIdentifierCode			(rs.getString("BANK_IDENTIFIER_CODE"));
			file.setBankIdentificationNumber	(rs.getInt("BANK_IDENTIFICATION_NUMBER"));
			file.setFirstName					(rs.getString("FIRST_NAME"));
			file.setMiddleName					(rs.getString("MIDDLE_NAME"));
			file.setLastName					(rs.getString("LAST_NAME"));
			file.setSocialSecurity				(rs.getString("SOCIAL_SECURITY"));
			file.setPrimaryAccountNumber		(rs.getString("PRIMARY_ACCOUNT_NUMBER"));
			file.setPrimaryAccountNumberSeq		(rs.getInt("PRIMARY_ACCOUNT_NUMBER_SEQ"));
			file.setAssociationName				(rs.getString("ASSOCIATION_NAME"));
			file.setBankName					(rs.getString("BANK_NAME"));
			file.setBrandName					(rs.getString("BRAND_NAME"));
			file.setCardExpirationDate			(rs.getDate("CARD_EXPIRATION_DATE"));
			file.setCardVerificationValue		(rs.getInt("CARD_VERIFICATION_VALUE"));			
			file.setCreateUser					(rs.getString("CREATE_USER"));
			file.setCreateTimestamp				(rs.getTimestamp("CREATE_TIMESTAMP"));
			file.setModifyUser					(rs.getString("MODIFY_USER"));
			file.setModifyTimestamp				(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return file;
			
		}
	});
  }
}
