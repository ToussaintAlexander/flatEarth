package com.system.message.utilties.permutate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.region03.merchant.product.model.ProductBean;

public class PermutateProduct {

	List<ProductBean> productList 	= new ArrayList<ProductBean>();
	
	/************************************************************************************
	 ************************************************************************************
	 */	
	public List<ProductBean> selectProduct(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM PRODUCT_TABLE ORDER BY ID";
        
        List<ProductBean> productList = jdbcTemplate.query(sqlSelect, new RowMapper<ProductBean>() {

            public ProductBean mapRow(ResultSet result, int rowNum) throws SQLException {
            	
            	ProductBean product = new ProductBean();
            	
                product.setId				(result.getInt			("ID"));
                product.setCode				(result.getInt			("CODE"));
                product.setCategory			(result.getInt			("CATEGORY"));
                product.setSeq				(result.getInt			("SEQ"));
                product.setProductName		(result.getString		("PRODUCT_NAME"));
                product.setDescription		(result.getString		("DESCRIPTION"));
                product.setGender			(result.getString		("GENDER"));
                product.setSeason			(result.getString		("SEASON"));
                product.setFrequency		(result.getInt			("FREQUENCY"));
                product.setSupplier			(result.getInt			("SUPPLIER"));
                product.setUnitSize			(result.getInt			("UNIT_SIZE"));
                product.setUnitPrice		(result.getInt			("UNIT_PRICE"));               
                product.setDiscount			(result.getInt			("DISCOUNT"));
                product.setUnitWeight		(result.getInt			("UNIT_WEIGHT"));
                product.setPicture			(result.getInt			("PICTURE"));
                product.setNotes			(result.getString		("NOTES"));
                
                product.setCreateUser		(result.getString		("CREATE_USER"));
                product.setCreateTimestamp	(result.getTimestamp	("CREATE_TIMESTAMP"));
                product.setModifyUser		(result.getString		("MODIFY_USER"));
                product.setModifyTimestamp	(result.getTimestamp	("MODIFY_TIMESTAMP"));
                
                return product;
                
            }
         
        });
         
        return productList;
        
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public void display(List<ProductBean> productList)
	{
		for (int i = 0; i < productList.size(); i++) {
		
			System.out.format	("Product = %2d  %2d  %2d  %2d  %-25s  %-20s\n"	
											, i
											, productList.get(i).getCode()
											, productList.get(i).getCategory()
											, productList.get(i).getSeq()	
											, productList.get(i).getProductName()
											, productList.get(i).getDescription()
						);
			
		}
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */	
	public static void main(String[] args) {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriver(new oracle.jdbc.driver.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("secret");
		     
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<ProductBean> productList = new PermutateProduct().selectProduct (jdbcTemplate);
		
		System.out.println(productList.size());
		
		new PermutateProduct().display (productList);
		
		System.out.println();
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
		 
	}
	
}
