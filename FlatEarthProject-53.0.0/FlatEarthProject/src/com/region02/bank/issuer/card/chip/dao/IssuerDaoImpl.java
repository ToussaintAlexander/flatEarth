package com.region02.bank.issuer.card.chip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region02.bank.issuer.card.chip.model.IssuerBean;

public class IssuerDaoImpl implements IssuerDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(IssuerBean issuer){

			String sql 
			
				= "INSERT INTO ISSUER_TABLE 			"
						+ "(							"
						+ ",PRIMARY_ACCOUNT_NUMBER		"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ	"
						
						+ " INTL_BANK_ACCOUNT_NUMBER	"
						+ " BANK_IDENTIFIER_CODE		"
						+ " BANK_IDENTIFICATION_NUMBER	"
						
						+ " MERCHANT_CATEGORY_CODE		"
						+ " MERCHANT_IDENTIFIER			"
						
						+ ",COUNTRY_CODE				"
						
						+ ",ACTION_CODE_DEFAULT			"
						+ ",ACTION_CODE_DENIAL			"
						+ ",ACTION_CODE_ONLINE			"
						
						+ ",PUBLIC_KEY_CERTIFICATE		"
						+ ",PUBLIC_KEY_EXPONENT			"
						+ ",PUBLIC_KEY_REMAINDER		"
						
						+ ",CREATE_USER					"
						+ ",CREATE_TIMESTAMP			"
						+ ",MODIFY_USER					"
						+ ",MODIFY_TIMESTAMP			"
						+ ") 							"
						+ "VALUES						"
						+ "('"	+	issuer.getPrimaryAccountNumber()		+	"'"
						+ "('"	+	issuer.getPrimaryAccountNumberSeq()		+	"'"
						
						+ "('"	+	issuer.getIntlBankAccountNumber()		+	"'"
						+ "('"	+	issuer.getBankIdentifierCode()			+	"'"
						+ "('"	+	issuer.getBankIdentificationNumber()	+	"'"
						
						+ "('"	+	issuer.getMerchantCategoryCode()		+	"'"	
						+ "('"	+	issuer.getMerchantIdentifier()			+	"'"	
						
						+ "('"	+	issuer.getCountryCode()					+	"'"	
						
						+ "('"	+	issuer.getPublicKeyCertificate()		+	"'"
						+ "('"	+	issuer.getPublicKeyExponent()			+	"'"
						+ "('"	+	issuer.getPublicKeyRemainder()			+	"'"
						
						+ "('"	+	issuer.getActionCodeDefault()			+	"'"
						+ "('"	+	issuer.getActionCodeDenial()			+	"'"
						+ "('"	+	issuer.getActionCodeOnline()			+	"'"
						
						+ "('"	+	issuer.getCreateUser()					+	"'"
						+ "('"	+	issuer.getCreateTimestamp()				+	"'"
						+ "('"	+	issuer.getModifyUser()					+	"'"
						+ "('"	+	issuer.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(IssuerBean issuer){
	
	String sql =
			
			" UPDATE ISSUER_TABLE " 						+
			
			"    SET INTL_BANK_ACCOUNT_NUMBER 		= '"  	+ issuer.getIntlBankAccountNumber()		+	"'"	+
			"      , BANK_IDENTIFIER_CODE 			= '"  	+ issuer.getBankIdentifierCode()		+	"'"	+
			"      , BANK_IDENTIFICATION_NUMBER 	= '"  	+ issuer.getBankIdentificationNumber()	+	"'"	+
			
			"      , MERCHANT_CATEGORY_CODE 		= '"  	+ issuer.getMerchantCategoryCode()		+	"'"	+
			"      , MERCHANT_IDENTIFIER 			= '"  	+ issuer.getMerchantIdentifier()		+	"'"	+
			
			"      , COUNTRY_CODE 					= '"  	+ issuer.getCountryCode()				+	"'"	+
			
			"      , ACTION_CODE_DEFAULT 			= '"  	+ issuer.getActionCodeDefault()			+	"'"	+
			"      , ACTION_CODE_DENIAL 			= '"  	+ issuer.getActionCodeDenial()			+	"'"	+
			"      , ACTION_CODE_ONLINE 			= '"  	+ issuer.getActionCodeOnline()			+	"'"	+
			
			"      , PUBLIC_KEY_CERTIFICATE 		= '"  	+ issuer.getPublicKeyCertificate()		+	"'"	+
			"      , PUBLIC_KEY_EXPONENT 			= '"  	+ issuer.getPublicKeyExponent()			+	"'"	+
			"      , PUBLIC_KEY_REMAINDER 			= '"  	+ issuer.getPublicKeyRemainder()		+	"'"	+
			
			"      , MODIFY_USER					= '" 	+ issuer.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ issuer.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ issuer.getPrimaryAccountNumber()		+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM ISSUER_TABLE "
			+ "WHERE ID 	= "	+	id			+	"";
	
	return template.update(sql);
	
}

@Override
public IssuerBean selectIssuerById(int id){
	
	String sql 
	
		= " SELECT * "
		+ "   FROM ISSUER_TABLE "
		+ "  WHERE ID 	  = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<IssuerBean>(IssuerBean.class));
	
}

@Override
public List<IssuerBean> select(){
	
	return template.query( "SELECT * FROM ISSUER_TABLE "
						 ,new RowMapper<IssuerBean>(){
		
		public IssuerBean mapRow(ResultSet rs, int row) throws SQLException {
			
			IssuerBean issuer = new IssuerBean();
			
			issuer.setId						(rs.getInt(1));
			issuer.setPrimaryAccountNumber		(rs.getString(2));
			issuer.setPrimaryAccountNumberSeq	(rs.getInt(3));
			
			issuer.setIntlBankAccountNumber		(rs.getString(4));
			issuer.setBankIdentifierCode		(rs.getString(5));
			issuer.setBankIdentificationNumber	(rs.getInt(6));
 			
			issuer.setMerchantCategoryCode		(rs.getString(7));
			issuer.setMerchantIdentifier		(rs.getString(8)); 
			
			issuer.setCountryCode				(rs.getString(9));	
			
			issuer.setActionCodeDefault			(rs.getShort(10));	
			issuer.setActionCodeDenial			(rs.getShort(11));	
			issuer.setActionCodeOnline			(rs.getShort(12));	
		
			issuer.setPublicKeyCertificate		(rs.getString(13));	
			issuer.setPublicKeyExponent			(rs.getByte(14));	
			issuer.setPublicKeyRemainder		(rs.getInt(15));	
 			
			issuer.setCreateUser				(rs.getString(16));
			issuer.setCreateTimestamp			(rs.getTimestamp(17));
			issuer.setModifyUser				(rs.getString(18));
			issuer.setModifyTimestamp			(rs.getTimestamp(19));
			
			return issuer;
			
		}
	});
  }
}
