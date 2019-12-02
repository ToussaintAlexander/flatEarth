package com.region01.cardholder.statement.savings.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.savings.model.SavingsSummaryBean;

public class SavingsSummaryDaoImpl implements SavingsSummaryDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SavingsSummaryBean savings){

			String sql 
			
				= "INSERT INTO SAVINGS_SUMMARY_TABLE "
						+ "("
						+ ",PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ"
						+ ",CLOSING_DATE"
						+ ",BANK_NAME"
						+ ",ASSOCIATION_NAME"
						+ ",CREDIT_LINE"
						+ ",AVAILABLE_CREDIT"
						+ ",PREVIOUS_BALANCE"
						+ ",CREDITS"
						+ ",PAYMENTS"
						+ ",PURCHASES"
						+ ",CHARGES"
						+ ",CASH_ADVANCES"
						+ ",FINANACE_CHARGE"
						+ ",NEW_BALANCE"
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
						+ ",'"	+	savings.getCreditLine()					+	"'"
						+ ",'"	+	savings.getAvailableCredit()			+	"'"
						+ ",'"	+	savings.getPreviousBalance()			+	"'"
						+ ",'"	+	savings.getCredits()					+	"'"
						+ ",'"	+	savings.getPayments()					+	"'"
						+ ",'"	+	savings.getPurchases()					+	"'"
						+ ",'"	+	savings.getCharges()					+	"'"
						+ ",'"	+	savings.getCashAdvances()				+	"'"
						+ ",'"	+	savings.getFinanceCharge()				+	"'"
						+ ",'"	+	savings.getNewBalance()					+	"'"
						+ ",'"	+	savings.getCreateUser()					+	"'"
						+ ",'"	+	savings.getCreateTimestamp()			+	"'"
						+ ",'"	+	savings.getModifyUser()					+	"'"
						+ ",'"	+	savings.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SavingsSummaryBean savings){
	
	String sql =
			
			" UPDATE SAVINGS_SUMMARY_TABLE 	   		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ 	savings.getPrimaryAccountNumber()		+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ		= '" 	+	savings.getPrimaryAccountNumberSeq()	+	"'"	+
			"      , CLOSING_DATE					= '" 	+	savings.getClosingDate()				+	"'"	+
			"      , BANK_NAME						= '" 	+	savings.getBankName()					+	"'"	+
			"      , ASSOCIATION_NAME				= '" 	+	savings.getAssociationName()			+	"'"	+
			"      , CREDIT_LINE					= '" 	+	savings.getCreditLine()					+	"'"	+
			"      , AVAILABLE_CREDIT				= '" 	+	savings.getAvailableCredit()			+	"'"	+
			"      , PREVIOUS_BALANCE				= '" 	+	savings.getPreviousBalance()			+	"'"	+
			"      , CREDITS						= '" 	+	savings.getCredits()					+	"'"	+
			"      , PAYMENTS						= '" 	+	savings.getPayments()					+	"'"	+
			"      , PURCHASES						= '" 	+	savings.getPurchases()					+	"'"	+
			"      , CHARGES						= '" 	+	savings.getCharges()					+	"'"	+
			"      , CASH_ADVANCES					= '" 	+	savings.getCashAdvances()				+	"'"	+
			"      , FINANACE_CHARGE				= '" 	+	savings.getFinanceCharge()				+	"'"	+
			"      , NEW_BALANCE					= '" 	+	savings.getNewBalance()					+	"'"	+
			"      , MODIFY_USER					= '" 	+ 	savings.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ 	savings.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ 	savings.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM SAVINGS_SUMMARY_TABLE " 	+
			"  WHERE ID = "							+
			         id								+
			"";
	
	return template.update(sql);
	
}

@Override
public SavingsSummaryBean selectSavingsSummaryById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM SAVINGS_SUMMARY_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<SavingsSummaryBean>(SavingsSummaryBean.class));
	
}

@Override
public List<SavingsSummaryBean> select(){
	
	return template.query( "SELECT * FROM SAVINGS_SUMMARY_TABLE WHERE ID < 11"
			     ,new RowMapper<SavingsSummaryBean>(){
		
		public SavingsSummaryBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SavingsSummaryBean savings = new SavingsSummaryBean();
			
			savings.setId						(rs.getInt(1));
			
			savings.setPrimaryAccountNumber		(rs.getString(2));
			savings.setPrimaryAccountNumberSeq	(rs.getInt(3));
			savings.setClosingDate				(rs.getDate(4));
			savings.setBankName					(rs.getString(5));
			savings.setAssociationName			(rs.getString(6));
			savings.setCreditLine				(rs.getInt(7));
			savings.setAvailableCredit			(rs.getInt(8));
			savings.setPreviousBalance			(rs.getInt(9));
			savings.setCredits					(rs.getInt(10));
			savings.setPayments					(rs.getInt(11));
			savings.setPurchases				(rs.getInt(12));
			savings.setCharges					(rs.getInt(13));
			savings.setCashAdvances				(rs.getInt(14));
			savings.setFinanceCharge			(rs.getInt(15));
			savings.setNewBalance				(rs.getInt(16));
			
			savings.setCreateUser				(rs.getString(17));
			savings.setCreateTimestamp			(rs.getTimestamp(18));
			savings.setModifyUser				(rs.getString(19));
			savings.setModifyTimestamp			(rs.getTimestamp(20));
			
			return savings;
			
		}
	});
  }
}
