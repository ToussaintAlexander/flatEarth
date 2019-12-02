package com.region01.cardholder.statement.savings.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.savings.model.SavingsDetailBean;

public class SavingsDetailDaoImpl implements SavingsDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SavingsDetailBean savings){

			String sql 
			
				= "INSERT INTO SAVINGS_DETAIL_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ" 
						+ ",CLOSING_DATE"
						+ ",BANK_NAME"
						+ ",ASSOCIATION_NAME"
						+ ",TRANSACTION_DATE"
						+ ",POSTING_DATE"
						+ ",REFERENCE_NUMBER"
						+ ",PRODUCT_DESCRIPTION"
						+ ",CREDIT_AMOUNT"
						+ ",CHARGE_AMOUNT"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	savings.getPrimaryAccountNumber()		+	"'"
						+ ",'"	+	savings.getPrimaryAccountNumberSeq()	+	"'"
						+ ",'"	+	savings.getClosingDate()				+	"'"
						+ ",'"	+	savings.getBankName()					+	"'"
						+ ",'"	+	savings.getAssociationName()			+	"'"
						+ ",'"	+	savings.getTransactionDate()			+	"'"
						+ ",'"	+	savings.getPostingDate()				+	"'"
						+ ",'"	+	savings.getReferenceNumber()			+	"'"
						+ ",'"	+	savings.getProductDescription()			+	"'"
						+ ",'"	+	savings.getCreditAmount()				+	"'"
						+ ",'"	+	savings.getChargeAmount()				+	"'"
						+ ",'"	+	savings.getCreateUser()					+	"'"
						+ ",'"	+	savings.getCreateTimestamp()			+	"'"
						+ ",'"	+	savings.getModifyUser()					+	"'"
						+ ",'"	+	savings.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SavingsDetailBean savings){
	
	String sql =
			
			" UPDATE SAVINGS_DETAIL_TABLE 	   		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ savings.getPrimaryAccountNumber() 	+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 	= '"  	+ savings.getPrimaryAccountNumberSeq()	+	"'"	+
			"      , CLOSING_DATE 					= '"  	+ savings.getClosingDate()				+	"'"	+
			"      , BANK_NAME 						= '"  	+ savings.getBankName() 				+	"'"	+
			"      , ASSOCIATION_NAME 				= '"  	+ savings.getAssociationName() 			+	"'"	+
			"      , TRANSACTION_DATE 				= '"  	+ savings.getTransactionDate() 			+	"'"	+
			"      , POSTING_DATE 					= '"  	+ savings.getPostingDate() 				+	"'"	+
			"      , REFERENCE_NUMBER 				= '"  	+ savings.getReferenceNumber() 			+	"'"	+
			"      , PRODUCT_DESCRIPTION 			= '"  	+ savings.getProductDescription()	 	+	"'"	+
			"      , CREDIT_AMOUNT 					= '"  	+ savings.getCreditAmount() 			+	"'"	+
			"      , CHARGE_AMOUNT 					= '"  	+ savings.getChargeAmount() 			+	"'"	+
			"      , MODIFY_USER					= '" 	+ savings.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ savings.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 							=  "	+ savings.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM SAVINGS_DETAIL_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public SavingsDetailBean selectSavingsDetailById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM SAVINGS_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<SavingsDetailBean>(SavingsDetailBean.class));
	
}

@Override
public List<SavingsDetailBean> select(){
	
	return template.query( "SELECT * FROM SAVINGS_DETAIL_TABLE WHERE ID < 11"
			     ,new RowMapper<SavingsDetailBean>(){
		
		public SavingsDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SavingsDetailBean savings = new SavingsDetailBean();
			
			savings.setId						(rs.getInt(1));
			savings.setPrimaryAccountNumber		(rs.getString(2));
			savings.setPrimaryAccountNumberSeq	(rs.getInt(3));
			savings.setClosingDate				(rs.getDate(4));
			savings.setBankName					(rs.getString(5));
			savings.setAssociationName			(rs.getString(6));
			savings.setTransactionDate			(rs.getDate(7));
			savings.setPostingDate				(rs.getDate(8));
			savings.setReferenceNumber			(rs.getString(9));
			savings.setProductDescription		(rs.getString(10));
			savings.setCreditAmount				(rs.getInt(11));
			savings.setChargeAmount				(rs.getInt(12));
			savings.setCreateUser				(rs.getString(13));
			savings.setCreateTimestamp			(rs.getTimestamp(14));
			savings.setModifyUser				(rs.getString(15));
			savings.setModifyTimestamp			(rs.getTimestamp(16));
			
			return savings;
			
		}
	});
  }
}
