package com.region01.cardholder.statement.checking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.checking.model.CheckingDetailBean;

public class CheckingDetailDaoImpl implements CheckingDetailDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CheckingDetailBean checking){

			String sql 
			
				= "INSERT INTO CHECKING_DETAIL_TABLE "
						+ "("
						+ " PRIMARY_ACCOUNT_NUMBER"
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
						+ "('"	+	checking.getPrimaryAccountNumber()		+	"'"
						+ ",'"	+	checking.getPrimaryAccountNumberSeq()	+	"'"
						+ ",'"	+	checking.getClosingDate()				+	"'"
						+ ",'"	+	checking.getBankName()					+	"'"
						+ ",'"	+	checking.getAssociationName()			+	"'"
						+ ",'"	+	checking.getTransactionDate()			+	"'"
						+ ",'"	+	checking.getPostingDate()				+	"'"
						+ ",'"	+	checking.getReferenceNumber()			+	"'"
						+ ",'"	+	checking.getProductDescription()		+	"'"
						+ ",'"	+	checking.getCreditAmount()				+	"'"
						+ ",'"	+	checking.getChargeAmount()				+	"'"
						+ ",'"	+	checking.getCreateUser()				+	"'"
						+ ",'"	+	checking.getCreateTimestamp()			+	"'"
						+ ",'"	+	checking.getModifyUser()				+	"'"
						+ ",'"	+	checking.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CheckingDetailBean checking){
	
	String sql =
			
			" UPDATE CHECKING_DETAIL_TABLE 	  		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ checking.getPrimaryAccountNumber()	+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 	= '"  	+ checking.getPrimaryAccountNumberSeq()	+	"'"	+
			"      , CLOSING_DATE 					= '"  	+ checking.getClosingDate()				+	"'"	+
			"      , BANK_NAME 						= '"  	+ checking.getBankName() 				+	"'"	+
			"      , ASSOCIATION_NAME 				= '"  	+ checking.getAssociationName() 		+	"'"	+
			"      , TRANSACTION_DATE 				= '"  	+ checking.getTransactionDate() 		+	"'"	+
			"      , POSTING_DATE 					= '"  	+ checking.getPostingDate() 			+	"'"	+
			"      , REFERENCE_NUMBER 				= '"  	+ checking.getReferenceNumber() 		+	"'"	+
			"      , PRODUCT_DESCRIPTION 			= '"  	+ checking.getProductDescription()	 	+	"'"	+
			"      , CREDIT_AMOUNT 					= '"  	+ checking.getCreditAmount() 			+	"'"	+
			"      , CHARGE_AMOUNT 					= '"  	+ checking.getChargeAmount() 			+	"'"	+			
			"      , MODIFY_USER					= '" 	+ checking.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ checking.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 							= "		+ checking.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CHECKING_DETAIL_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public CheckingDetailBean selectCheckingDetailById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CHECKING_DETAIL_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CheckingDetailBean>(CheckingDetailBean.class));
	
}

@Override
public List<CheckingDetailBean> select(){
	
	return template.query( "SELECT * FROM CHECKING_DETAIL_TABLE WHERE ID < 11"
			     ,new RowMapper<CheckingDetailBean>(){
		
		public CheckingDetailBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CheckingDetailBean checking = new CheckingDetailBean();
			
			checking.setId							(rs.getInt(1));
			
			checking.setPrimaryAccountNumber		(rs.getString(2));			 
			checking.setPrimaryAccountNumberSeq		(rs.getInt(3));			 
			checking.setClosingDate					(rs.getDate(4));						 
			checking.setBankName					(rs.getString(5));						 
			checking.setAssociationName				(rs.getString(6));	
			checking.setTransactionDate				(rs.getDate(7));
			checking.setPostingDate					(rs.getDate(8));
			checking.setReferenceNumber				(rs.getString(9));
			checking.setProductDescription			(rs.getString(10));
			checking.setCreditAmount				(rs.getInt(11));
			checking.setChargeAmount				(rs.getInt(12));			
			checking.setCreateUser					(rs.getString(13));
			checking.setCreateTimestamp				(rs.getTimestamp(14));
			checking.setModifyUser					(rs.getString(15));
			checking.setModifyTimestamp				(rs.getTimestamp(16));
			
			return checking;
			
		}
	});
  }
}
