package com.region05.merchant.retailer.invoice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region05.merchant.retailer.invoice.model.InvoicePart3Bean;

public class InvoicePart3DaoImpl implements InvoicePart3Dao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(InvoicePart3Bean invoicePart3){

			String sql 
			
				= "INSERT INTO INVOICE_PART3_TABLE "
						+ "("
						+ " CODE"
						+ ",CATEGORY"
						+ " SEQ"
						+ ",PRODUCT_NAME"
						+ ",DESCRIPTION"
						+ ",GENDER"
						+ ",SEASON"
						+ ",FREQUENCY"
						+ ",SUPPLIER"
						+ ",UNITS_IN_STOCK"
						+ ",UNIT_SIZE"
						+ ",UNIT_PRICE"
						+ ",UNIT_WEIGHT"
						+ ",DISCOUNT"
						+ ",PICTURE"
						+ ",NOTES"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	invoicePart3.getCode()				+	"'"
						+ ",'"	+	invoicePart3.getCategory()			+	"'"
						+ ",'"	+	invoicePart3.getSeq()				+	"'"
						+ ",'"	+	invoicePart3.getProductName()		+	"'"
						+ ",'"	+	invoicePart3.getDescription()		+	"'"
						+ ",'"	+	invoicePart3.getGender()				+	"'"
						+ ",'"	+	invoicePart3.getSeason()				+	"'"
						+ ",'"	+	invoicePart3.getFrequency()			+	"'"
						+ ",'"	+	invoicePart3.getSupplier()			+	"'"
						+ ",'"	+	invoicePart3.getUnitsInStock()		+	"'"
						+ ",'"	+	invoicePart3.getUnitSize()			+	"'"
						+ ",'"	+	invoicePart3.getUnitPrice()			+	"'"
						+ ",'"	+	invoicePart3.getUnitWeight()			+	"'"
						+ ",'"	+	invoicePart3.getDiscount()			+	"'"
						+ ",'"	+	invoicePart3.getPicture()			+	"'"
						+ ",'"	+	invoicePart3.getNotes()				+	"'"
						+ ",'"	+	invoicePart3.getCreateUser()			+	"'"
						+ ",'"	+	invoicePart3.getCreateTimestamp()	+	"'"
						+ ",'"	+	invoicePart3.getModifyUser()			+	"'"
						+ ",'"	+	invoicePart3.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(InvoicePart3Bean invoicePart3){
	
	String sql =
			
			" UPDATE INVOICE_PART3_TABLE 	   	   " 	+
			
			"    SET CODE 				= '" 	+ invoicePart3.getCode() 			+	"'"	+
			"      , CATEGORY_ID 		= '" 	+ invoicePart3.getCategory() 		+	"'"	+
			"      , SEQ 		 		= '" 	+ invoicePart3.getSeq() 				+	"'"	+
			"      , PRODUCT_NAME 		= '" 	+ invoicePart3.getProductName() 		+	"'"	+
			"      , DESCRIPTION 		= '" 	+ invoicePart3.getDescription() 		+	"'"	+
			"      , GENDER 			= '" 	+ invoicePart3.getGender() 			+	"'"	+
			"      , SEASON 			= '" 	+ invoicePart3.getSeason() 			+	"'"	+
			"      , FREQUENCY 			= '" 	+ invoicePart3.getFrequency() 		+	"'"	+
			"      , SUPPLIER 			= '" 	+ invoicePart3.getSupplier() 		+	"'"	+
			"      , UNITS_IN_STOCK		= '" 	+ invoicePart3.getUnitsInStock() 	+	"'"	+
			"      , UNIT_SIZE 			= '" 	+ invoicePart3.getUnitSize() 		+	"'"	+
			"      , UNIT_PRICE 		= '" 	+ invoicePart3.getUnitPrice() 		+	"'"	+
			"      , UNIT_WEIGHT 		= '" 	+ invoicePart3.getUnitWeight() 		+	"'"	+
			"      , DISCOUNT 			= '" 	+ invoicePart3.getDiscount() 		+	"'"	+
			"      , PICTURE 			= '" 	+ invoicePart3.getPicture() 			+	"'"	+
			"      , NOTES 				= '" 	+ invoicePart3.getNotes() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ invoicePart3.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ invoicePart3.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ invoicePart3.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM INVOICE_PART3_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public InvoicePart3Bean selectInvoicePart3ById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM INVOICE_PART3_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<InvoicePart3Bean>(InvoicePart3Bean.class));
	
}

@Override
public List<InvoicePart3Bean> select(){
	
	return template.query( "SELECT * FROM INVOICE_PART3_TABLE WHERE ID < 11"
						 ,new RowMapper<InvoicePart3Bean>(){
		
		public InvoicePart3Bean mapRow(ResultSet rs, int row) throws SQLException {
			
			InvoicePart3Bean invoicePart3 = new InvoicePart3Bean();
			
			invoicePart3.setId					(rs.getInt(1));
			invoicePart3.setCode				(rs.getInt(2));
			invoicePart3.setCategory			(rs.getInt(3));
			invoicePart3.setSeq					(rs.getInt(4));
			invoicePart3.setProductName			(rs.getString(5));
			invoicePart3.setDescription			(rs.getString(6));
			invoicePart3.setGender				(rs.getString(7));
			invoicePart3.setSeason				(rs.getString(8));
			invoicePart3.setFrequency			(rs.getInt(9));
			invoicePart3.setSupplier			(rs.getInt(10));
			invoicePart3.setUnitsInStock		(rs.getInt(11));
			invoicePart3.setUnitSize			(rs.getInt(12));
			invoicePart3.setUnitPrice			(rs.getInt(13));
			invoicePart3.setUnitWeight			(rs.getInt(14));
			invoicePart3.setDiscount			(rs.getInt(15));
			invoicePart3.setPicture				(rs.getInt(16));
			invoicePart3.setNotes				(rs.getString(17));
			invoicePart3.setCreateUser			(rs.getString(18));
			invoicePart3.setCreateTimestamp		(rs.getTimestamp(19));
			invoicePart3.setModifyUser			(rs.getString(20));
			invoicePart3.setModifyTimestamp		(rs.getTimestamp(21));
			
			return invoicePart3;
			
		}
	});
  }
}
