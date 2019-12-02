package com.region03.merchant.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region03.merchant.product.model.ProductBean;

public class ProductDaoImpl implements ProductDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ProductBean product){

			String sql 
			
				= "INSERT INTO PRODUCT_TABLE "
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
						+ "('"	+	product.getCode()				+	"'"
						+ ",'"	+	product.getCategory()			+	"'"
						+ ",'"	+	product.getSeq()				+	"'"
						+ ",'"	+	product.getProductName()		+	"'"
						+ ",'"	+	product.getDescription()		+	"'"
						+ ",'"	+	product.getGender()				+	"'"
						+ ",'"	+	product.getSeason()				+	"'"
						+ ",'"	+	product.getFrequency()			+	"'"
						+ ",'"	+	product.getSupplier()			+	"'"
						+ ",'"	+	product.getUnitsInStock()		+	"'"
						+ ",'"	+	product.getUnitSize()			+	"'"
						+ ",'"	+	product.getUnitPrice()			+	"'"
						+ ",'"	+	product.getUnitWeight()			+	"'"
						+ ",'"	+	product.getDiscount()			+	"'"
						+ ",'"	+	product.getPicture()			+	"'"
						+ ",'"	+	product.getNotes()				+	"'"
						+ ",'"	+	product.getCreateUser()			+	"'"
						+ ",'"	+	product.getCreateTimestamp()	+	"'"
						+ ",'"	+	product.getModifyUser()			+	"'"
						+ ",'"	+	product.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ProductBean product){
	
	String sql =
			
			" UPDATE PRODUCT_TABLE 	   	   " 	+
			
			"    SET CODE 				= '" 	+ product.getCode() 			+	"'"	+
			"      , CATEGORY_ID 		= '" 	+ product.getCategory() 		+	"'"	+
			"      , SEQ 		 		= '" 	+ product.getSeq() 				+	"'"	+
			"      , PRODUCT_NAME 		= '" 	+ product.getProductName() 		+	"'"	+
			"      , DESCRIPTION 		= '" 	+ product.getDescription() 		+	"'"	+
			"      , GENDER 			= '" 	+ product.getGender() 			+	"'"	+
			"      , SEASON 			= '" 	+ product.getSeason() 			+	"'"	+
			"      , FREQUENCY 			= '" 	+ product.getFrequency() 		+	"'"	+
			"      , SUPPLIER 			= '" 	+ product.getSupplier() 		+	"'"	+
			"      , UNITS_IN_STOCK		= '" 	+ product.getUnitsInStock() 	+	"'"	+
			"      , UNIT_SIZE 			= '" 	+ product.getUnitSize() 		+	"'"	+
			"      , UNIT_PRICE 		= '" 	+ product.getUnitPrice() 		+	"'"	+
			"      , UNIT_WEIGHT 		= '" 	+ product.getUnitWeight() 		+	"'"	+
			"      , DISCOUNT 			= '" 	+ product.getDiscount() 		+	"'"	+
			"      , PICTURE 			= '" 	+ product.getPicture() 			+	"'"	+
			"      , NOTES 				= '" 	+ product.getNotes() 			+	"'"	+
			"      , MODIFY_USER		= '" 	+ product.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ product.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ product.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM PRODUCT_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public ProductBean selectProductById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM PRODUCT_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<ProductBean>(ProductBean.class));
	
}

@Override
public List<ProductBean> select(){
	
	return template.query( "SELECT * FROM PRODUCT_TABLE WHERE ID < 11"
						 ,new RowMapper<ProductBean>(){
		
		public ProductBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ProductBean product = new ProductBean();
			
			product.setId					(rs.getInt(1));
			product.setCode					(rs.getInt(2));
			product.setCategory				(rs.getInt(3));
			product.setSeq					(rs.getInt(4));
			product.setProductName			(rs.getString(5));
			product.setDescription			(rs.getString(6));
			product.setGender				(rs.getString(7));
			product.setSeason				(rs.getString(8));
			product.setFrequency			(rs.getInt(9));
			product.setSupplier				(rs.getInt(10));
			product.setUnitsInStock			(rs.getInt(11));
			product.setUnitSize				(rs.getInt(12));
			product.setUnitPrice			(rs.getInt(13));
			product.setUnitWeight			(rs.getInt(14));
			product.setDiscount				(rs.getInt(15));
			product.setPicture				(rs.getInt(16));
			product.setNotes				(rs.getString(17));
			product.setCreateUser			(rs.getString(18));
			product.setCreateTimestamp		(rs.getTimestamp(19));
			product.setModifyUser			(rs.getString(20));
			product.setModifyTimestamp		(rs.getTimestamp(21));
			
			return product;
			
		}
	});
  }
}
