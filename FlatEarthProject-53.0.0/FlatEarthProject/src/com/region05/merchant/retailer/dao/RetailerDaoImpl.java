package com.region05.merchant.retailer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region05.merchant.retailer.model.RetailerBean;

public class RetailerDaoImpl implements RetailerDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RetailerBean retailer){

			String sql 
			
				= "INSERT INTO RETAILER_TABLE "
						+ "("
						+ " NAME"
						+ ",IDENTIFIER"
						+ ",CATEGORY_CODE"
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
						+ "values"
						+ "('"	+	retailer.getName()				+	"'"
						+ ",'"	+	retailer.getIdentifier()		+	"'"
						+ ",'"	+	retailer.getCategoryCode()		+	"'"
						+ ",'"	+	retailer.getStreet()			+	"'"
						+ ",'"	+	retailer.getCity()				+	"'"
						+ ",'"	+	retailer.getState()				+	"'"
						+ ",'"	+	retailer.getCountry()			+	"'"
						+ ",'"	+	retailer.getZipCode()			+	"'"
						+ ",'"	+	retailer.getPhoneNumber()		+	"'"
						+ ",'"	+	retailer.getCreateUser()		+	"'"
						+ ",'"	+	retailer.getCreateTimestamp()	+	"'"
						+ ",'"	+	retailer.getModifyUser()		+	"'"
						+ ",'"	+	retailer.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RetailerBean retailer){
	
	String sql =
			
			" UPDATE RETAILER_TABLE " 	+
			
			"    SET NAME 				= '" 	+ retailer.getName() 				+	"'"	+
			"      , IDENTIFIER 		= '"  	+ retailer.getIdentifier()			+	"'"	+
			"      , CATEGORY_CODE 		= '"  	+ retailer.getCategoryCode()		+	"'"	+
			"      , STREET 			= '"  	+ retailer.getStreet()			 	+	"'"	+
			"      , CITY				= '" 	+ retailer.getCity()  				+	"'"	+
			"      , STATE				= '" 	+ retailer.getState()  				+	"'"	+
			"      , COUNTRY			= '" 	+ retailer.getCountry()  			+	"'"	+
			"      , ZIP_CODE			= '" 	+ retailer.getZipCode()  			+	"'"	+
			"      , PHONE_NUMBER		= '" 	+ retailer.getPhoneNumber()  		+	"'"	+
			"      , CREATE_USER		= '" 	+ retailer.getCreateUser()  		+	"'"	+
			"      , CREATE_TIMESTAMP	= '" 	+ retailer.getCreateTimestamp()  	+	"'"	+
			"      , MODIFY_USER		= '" 	+ retailer.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ retailer.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ retailer.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM RETAILER_TABLE "
			+ "WHERE ID = "
			+id
			+" ";
	
	return template.update(sql);
	
}

@Override
public RetailerBean selectRetailerById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM RETAILER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RetailerBean>(RetailerBean.class));
	
}

@Override
public List<RetailerBean> select(){
	
	return template.query( "SELECT * FROM RETAILER_TABLE"
						 ,new RowMapper<RetailerBean>(){
		
		public RetailerBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RetailerBean retailer = new RetailerBean();
			
			retailer.setId				(rs.getInt(1));
			retailer.setIdentifier		(rs.getString(2));
			retailer.setCategoryCode	(rs.getString(3));
			retailer.setName			(rs.getString(4));
			retailer.setStreet			(rs.getString(5));
			retailer.setCity			(rs.getString(6));
			retailer.setState			(rs.getString(7));
			retailer.setCountry			(rs.getString(8));
			retailer.setZipCode			(rs.getString(9));
			retailer.setPhoneNumber		(rs.getString(10));
			retailer.setCreateUser		(rs.getString(11));
			retailer.setCreateTimestamp	(rs.getTimestamp(12));
			retailer.setModifyUser		(rs.getString(13));
			retailer.setModifyTimestamp	(rs.getTimestamp(14));
			
			return retailer;
			
		}
	});
  }
}
