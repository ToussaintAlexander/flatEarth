package com.region05.merchant.retailer.invoice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region05.merchant.retailer.invoice.model.InvoicePart1Bean;

public class InvoicePart1DaoImpl implements InvoicePart1Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(InvoicePart1Bean invoicePart1){

			String sql 
			
				= "INSERT INTO INVOICE_PART1_TABLE "
						+ "("
						+ ",IDENTIFIER"
						+ ",CATEGORY_CODE"
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
						+ "values"
						+ "('"	+	invoicePart1.getIdentifier()		+	"'"
						+ ",'"	+	invoicePart1.getCategoryCode()		+	"'"
						+ ",'"	+	invoicePart1.getName()				+	"'"
						+ ",'"	+	invoicePart1.getStreet()			+	"'"
						+ ",'"	+	invoicePart1.getCity()				+	"'"
						+ ",'"	+	invoicePart1.getState()				+	"'"
						+ ",'"	+	invoicePart1.getCountry()			+	"'"
						+ ",'"	+	invoicePart1.getZipCode()			+	"'"
						+ ",'"	+	invoicePart1.getPhoneNumber()		+	"'"
						+ ",'"	+	invoicePart1.getCreateUser()		+	"'"
						+ ",'"	+	invoicePart1.getCreateTimestamp()	+	"'"
						+ ",'"	+	invoicePart1.getModifyUser()		+	"'"
						+ ",'"	+	invoicePart1.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(InvoicePart1Bean invoicePart1){
	
	String sql =
			
			" UPDATE INVOICE_PART1_TABLE " 	+
			
			"    SET IDENTIFIER 		= '"  	+ invoicePart1.getIdentifier()			+	"'"	+
			"      , CATEGORY_CODE 		= '"  	+ invoicePart1.getCategoryCode()		+	"'"	+
			"	   , NAME 				= '" 	+ invoicePart1.getName() 				+	"'"	+
			"      , STREET 			= '"  	+ invoicePart1.getStreet()			 	+	"'"	+
			"      , CITY				= '" 	+ invoicePart1.getCity()  				+	"'"	+
			"      , STATE				= '" 	+ invoicePart1.getState()  				+	"'"	+
			"      , COUNTRY			= '" 	+ invoicePart1.getCountry()  			+	"'"	+
			"      , ZIP_CODE			= '" 	+ invoicePart1.getZipCode()  			+	"'"	+
			"      , PHONE_NUMBER		= '" 	+ invoicePart1.getPhoneNumber()  		+	"'"	+
			"      , CREATE_USER		= '" 	+ invoicePart1.getCreateUser()  		+	"'"	+
			"      , CREATE_TIMESTAMP	= '" 	+ invoicePart1.getCreateTimestamp()  	+	"'"	+
			"      , MODIFY_USER		= '" 	+ invoicePart1.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ invoicePart1.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ invoicePart1.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM INVOICE_PART1_TABLE "
			+ "WHERE ID = "
			+id
			+" ";
	
	return template.update(sql);
	
}

@Override
public InvoicePart1Bean selectInvoicePart1ById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM INVOICE_PART1_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<InvoicePart1Bean>(InvoicePart1Bean.class));
	
}

@Override
public List<InvoicePart1Bean> select(){
	
	return template.query( "SELECT * FROM INVOICE_PART1_TABLE"
						 ,new RowMapper<InvoicePart1Bean>(){
		
		public InvoicePart1Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			InvoicePart1Bean invoicePart1 = new InvoicePart1Bean();
			
			invoicePart1.setId				(rs.getInt(1));
			invoicePart1.setIdentifier		(rs.getString(2));
			invoicePart1.setCategoryCode	(rs.getString(3));
			invoicePart1.setName			(rs.getString(4));
			invoicePart1.setStreet			(rs.getString(5));
			invoicePart1.setCity			(rs.getString(6));
			invoicePart1.setState			(rs.getString(7));
			invoicePart1.setCountry			(rs.getString(8));
			invoicePart1.setZipCode			(rs.getString(9));
			invoicePart1.setPhoneNumber		(rs.getString(10));
			invoicePart1.setCreateUser		(rs.getString(11));
			invoicePart1.setCreateTimestamp	(rs.getTimestamp(12));
			invoicePart1.setModifyUser		(rs.getString(13));
			invoicePart1.setModifyTimestamp	(rs.getTimestamp(14));
			
			return invoicePart1;
			
		}
	});
  }
}
