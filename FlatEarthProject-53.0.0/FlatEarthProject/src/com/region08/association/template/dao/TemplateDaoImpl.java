package com.region08.association.template.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.template.model.TemplateBean;

public class TemplateDaoImpl implements TemplateDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(TemplateBean templates){

			String sql 
			
				= "INSERT INTO TEMPLATE_TABLE "
						+ "("
						+ " PROCESSING_CODE"
						+ ",POINT_OF_SERVICE_ENTRY_MODE"
						+ ",POINT_OF_SERVICE_CONDITON_CODE"
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",MERCHANT_TYPE"
						+ ",EXPIRATION_DATE"
						+ ",TRACK2_DATA"
						+ ",TRANSACTION_AMOUNT"
						+ ",ADDITIONAL_AMOUNTS"
						+ ",PERSONAL_IDENTIFICATION_NUMBER"
						+ ",RESPONSE_CODE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	templates.getProcessingCode()				+	"'"
						+ ",'"	+	templates.getPointOfServiceEntryMode()		+	"'"
						+ ",'"	+	templates.getPointOfServiceConditionCode()	+	"'"
						+ ",'"	+	templates.getPrimaryAccountNumber()			+	"'"
						+ ",'"	+	templates.getMerchantType()					+	"'"
						+ ",'"	+	templates.getExpirationDate()				+	"'"
						+ ",'"	+	templates.getTrack2Data()					+	"'"
						+ ",'"	+	templates.getTransactionAmount()			+	"'"
						+ ",'"	+	templates.getAdditionalAmounts()			+	"'"
						+ ",'"	+	templates.getPersonalIdentificationNumber()	+	"'"
						+ ",'"	+	templates.getResponseCode()					+	"'"
						
						+ ",'"	+	templates.getCreateUser()					+	"'"
						+ ",'"	+	templates.getCreateTimestamp()				+	"'"
						+ ",'"	+	templates.getModifyUser()					+	"'"
						+ ",'"	+	templates.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(TemplateBean templates){
	
	String sql =
			
			" UPDATE TEMPLATE_TABLE " 							+
			
			"    SET PROCESSING_CODE 					= '" 	+ templates.getProcessingCode() 				+	"'"	+
			"      , POINT_OF_SERVICE_ENTRY_MODE 		= '"  	+ templates.getPointOfServiceEntryMode()		+	"'"	+
			"      , POINT_OF_SERVICE_CONDITON_CODE		= '" 	+ templates.getPointOfServiceConditionCode()  	+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER				= '" 	+ templates.getPrimaryAccountNumber()  			+	"'"	+
			"      , MERCHANT_TYPE						= '" 	+ templates.getMerchantType()  					+	"'"	+
			"      , EXPIRATION_DATE					= '" 	+ templates.getExpirationDate()  				+	"'"	+
			"      , TRACK2_DATA						= '" 	+ templates.getTrack2Data()  					+	"'"	+
			"      , TRANSACTION_AMOUNT					= '" 	+ templates.getTransactionAmount()  			+	"'"	+
			"      , ADDITIONAL_AMOUNTS					= '" 	+ templates.getAdditionalAmounts()  			+	"'"	+
			"      , PERSONAL_IDENTIFICATION_NUMBER		= '" 	+ templates.getPersonalIdentificationNumber()  	+	"'"	+
			"      , RESPONSE_CODE						= '" 	+ templates.getResponseCode()  					+	"'"	+
			
			"      , MODIFY_USER						= '" 	+ templates.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP					= '" 	+ templates.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 								= "		+ templates.getId()								+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM TEMPLATE_TABLE "
			+ "WHERE ID = "
			+ id
			+ "";
	
	return template.update(sql);
	
}

@Override
public TemplateBean selectTemplatesById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM TEMPLATE_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<TemplateBean>(TemplateBean.class));
	
}

@Override
public List<TemplateBean> select(){
	
	return template.query( "SELECT * FROM TEMPLATE_TABLE"
						 ,new RowMapper<TemplateBean>(){
		
		public TemplateBean mapRow(ResultSet rs, int row) throws SQLException {
			
			TemplateBean templates = new TemplateBean();
			
			templates.setId								(rs.getInt(1));
			templates.setProcessingCode					(rs.getString(2));
			templates.setPointOfServiceEntryMode		(rs.getString(3));
			templates.setPointOfServiceConditionCode	(rs.getByte(4));
			templates.setPrimaryAccountNumber			(rs.getString(5));
			templates.setMerchantType					(rs.getShort(6));
			templates.setExpirationDate					(rs.getDate(7));
			templates.setTrack2Data						(rs.getString(8));
			templates.setTransactionAmount				(rs.getLong(9));
			templates.setAdditionalAmounts				(rs.getString(10));
			templates.setPersonalIdentificationNumber	(rs.getShort(11));
			templates.setResponseCode					(rs.getString(12));			
			templates.setCreateUser						(rs.getString(13));
			templates.setCreateTimestamp				(rs.getTimestamp(14));
			templates.setModifyUser						(rs.getString(15));
			templates.setModifyTimestamp				(rs.getTimestamp(16));
			
			return templates;
			
		}
	});
  }
}
