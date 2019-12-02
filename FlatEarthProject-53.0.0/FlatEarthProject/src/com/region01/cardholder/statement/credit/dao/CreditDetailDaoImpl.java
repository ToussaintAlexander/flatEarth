package com.region01.cardholder.statement.credit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.credit.model.CreditDetailBean;

public class CreditDetailDaoImpl implements CreditDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CreditDetailBean credit){

			String sql 
			
				= "INSERT INTO CREDIT_DETAIL_TABLE "
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
						+ "('"	+	credit.getPrimaryAccountNumber()		+	"'"
						+ ",'"	+	credit.getPrimaryAccountNumberSeq()		+	"'"
						+ ",'"	+	credit.getClosingDate()					+	"'"
						+ ",'"	+	credit.getBankName()					+	"'"
						+ ",'"	+	credit.getAssociationName()				+	"'"
						+ ",'"	+	credit.getTransactionDate()				+	"'"
						+ ",'"	+	credit.getPostingDate()					+	"'"
						+ ",'"	+	credit.getReferenceNumber()				+	"'"
						+ ",'"	+	credit.getProductDescription()			+	"'"
						+ ",'"	+	credit.getCreditAmount()				+	"'"
						+ ",'"	+	credit.getChargeAmount()				+	"'"
						+ ",'"	+	credit.getCreateUser()					+	"'"
						+ ",'"	+	credit.getCreateTimestamp()				+	"'"
						+ ",'"	+	credit.getModifyUser()					+	"'"
						+ ",'"	+	credit.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CreditDetailBean credit){
	
	String sql =
			
			" UPDATE CREDIT_DETAIL_TABLE 	   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ credit.getPrimaryAccountNumber() 		+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 	= '"  	+ credit.getPrimaryAccountNumberSeq()	+	"'"	+
			"      , CLOSING_DATE 					= '"  	+ credit.getClosingDate()				+	"'"	+
			"      , BANK_NAME 						= '"  	+ credit.getBankName() 					+	"'"	+
			"      , ASSOCIATION_NAME 				= '"  	+ credit.getAssociationName() 			+	"'"	+
			"      , TRANSACTION_DATE 				= '"  	+ credit.getTransactionDate() 			+	"'"	+
			"      , POSTING_DATE 					= '"  	+ credit.getPostingDate() 				+	"'"	+
			"      , REFERENCE_NUMBER 				= '"  	+ credit.getReferenceNumber() 			+	"'"	+
			"      , PRODUCT_DESCRIPTION 			= '"  	+ credit.getProductDescription()	 	+	"'"	+
			"      , CREDIT_AMOUNT 					= '"  	+ credit.getCreditAmount() 				+	"'"	+
			"      , CHARGE_AMOUNT 					= '"  	+ credit.getChargeAmount() 				+	"'"	+
			"      , MODIFY_USER					= '" 	+ credit.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ credit.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							=  "	+ credit.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CREDIT_DETAIL_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public CreditDetailBean selectCreditDetailById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CREDIT_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CreditDetailBean>(CreditDetailBean.class));
	
}

@Override
public List<CreditDetailBean> select(){
	
	return template.query( "SELECT * FROM CREDIT_DETAIL_TABLE WHERE ID < 11"
			     ,new RowMapper<CreditDetailBean>(){
		
		public CreditDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CreditDetailBean credit = new CreditDetailBean();
			
			credit.setId						(rs.getInt(1));
			credit.setPrimaryAccountNumber		(rs.getString(2));
			credit.setPrimaryAccountNumberSeq	(rs.getInt(3));
			credit.setClosingDate				(rs.getDate(4));
			credit.setBankName					(rs.getString(5));
			credit.setAssociationName			(rs.getString(6));
			credit.setTransactionDate			(rs.getDate(7));
			credit.setPostingDate				(rs.getDate(8));
			credit.setReferenceNumber			(rs.getString(9));
			credit.setProductDescription		(rs.getString(10));
			credit.setCreditAmount				(rs.getInt(11));
			credit.setChargeAmount				(rs.getInt(12));
			credit.setCreateUser				(rs.getString(13));
			credit.setCreateTimestamp			(rs.getTimestamp(14));
			credit.setModifyUser				(rs.getString(15));
			credit.setModifyTimestamp			(rs.getTimestamp(16));
			
			return credit;
			
		}
	});
  }
}
