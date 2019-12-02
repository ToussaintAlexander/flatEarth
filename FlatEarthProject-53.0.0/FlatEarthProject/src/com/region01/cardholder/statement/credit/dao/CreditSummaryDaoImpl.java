package com.region01.cardholder.statement.credit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.credit.model.CreditSummaryBean;

public class CreditSummaryDaoImpl implements CreditSummaryDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CreditSummaryBean credit){

			String sql 
			
				= "INSERT INTO CREDIT_SUMMARY_TABLE "
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
						+ "('"	+	credit.getPrimaryAccountNumber()		+	"'"
						+ ",'"	+	credit.getPrimaryAccountNumberSeq()		+	"'"
						+ ",'"	+	credit.getClosingDate()					+	"'"
						+ ",'"	+	credit.getBankName()					+	"'"
						+ ",'"	+	credit.getAssociationName()				+	"'"
						+ ",'"	+	credit.getCreditLine()					+	"'"
						+ ",'"	+	credit.getAvailableCredit()				+	"'"
						+ ",'"	+	credit.getPreviousBalance()				+	"'"
						+ ",'"	+	credit.getCredits()						+	"'"
						+ ",'"	+	credit.getPayments()					+	"'"
						+ ",'"	+	credit.getPurchases()					+	"'"
						+ ",'"	+	credit.getCharges()						+	"'"
						+ ",'"	+	credit.getCashAdvances()				+	"'"
						+ ",'"	+	credit.getFinanceCharge()				+	"'"
						+ ",'"	+	credit.getNewBalance()					+	"'"
						+ ",'"	+	credit.getCreateUser()					+	"'"
						+ ",'"	+	credit.getCreateTimestamp()				+	"'"
						+ ",'"	+	credit.getModifyUser()					+	"'"
						+ ",'"	+	credit.getModifyTimestamp()				+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CreditSummaryBean credit){
	
	String sql =
			
			" UPDATE CREDIT_SUMMARY_TABLE 	   		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ 	credit.getPrimaryAccountNumber()		+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ		= '" 	+	credit.getPrimaryAccountNumberSeq()		+	"'"	+
			"      , CLOSING_DATE					= '" 	+	credit.getClosingDate()					+	"'"	+
			"      , BANK_NAME						= '" 	+	credit.getBankName()					+	"'"	+
			"      , ASSOCIATION_NAME				= '" 	+	credit.getAssociationName()				+	"'"	+
			"      , CREDIT_LINE					= '" 	+	credit.getCreditLine()					+	"'"	+
			"      , AVAILABLE_CREDIT				= '" 	+	credit.getAvailableCredit()				+	"'"	+
			"      , PREVIOUS_BALANCE				= '" 	+	credit.getPreviousBalance()				+	"'"	+
			"      , CREDITS						= '" 	+	credit.getCredits()						+	"'"	+
			"      , PAYMENTS						= '" 	+	credit.getPayments()					+	"'"	+
			"      , PURCHASES						= '" 	+	credit.getPurchases()					+	"'"	+
			"      , CHARGES						= '" 	+	credit.getCharges()						+	"'"	+
			"      , CASH_ADVANCES					= '" 	+	credit.getCashAdvances()				+	"'"	+
			"      , FINANACE_CHARGE				= '" 	+	credit.getFinanceCharge()				+	"'"	+
			"      , NEW_BALANCE					= '" 	+	credit.getNewBalance()					+	"'"	+
			"      , MODIFY_USER					= '" 	+ 	credit.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ 	credit.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 							= "		+ 	credit.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CREDIT_SUMMARY_TABLE " 	+
			"  WHERE ID = "							+
			         id								+
			"";
	
	return template.update(sql);
	
}

@Override
public CreditSummaryBean selectCreditSummaryById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CREDIT_SUMMARY_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CreditSummaryBean>(CreditSummaryBean.class));
	
}

@Override
public List<CreditSummaryBean> select(){
	
	return template.query( "SELECT * FROM CREDIT_SUMMARY_TABLE WHERE ID < 11"
			     ,new RowMapper<CreditSummaryBean>(){
		
		public CreditSummaryBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CreditSummaryBean credit = new CreditSummaryBean();
			
			credit.setId						(rs.getInt(1));
			
			credit.setPrimaryAccountNumber		(rs.getString(2));
			credit.setPrimaryAccountNumberSeq	(rs.getInt(3));
			credit.setClosingDate				(rs.getDate(4));
			credit.setBankName					(rs.getString(5));
			credit.setAssociationName			(rs.getString(6));
			credit.setCreditLine				(rs.getInt(7));
			credit.setAvailableCredit			(rs.getInt(8));
			credit.setPreviousBalance			(rs.getInt(9));
			credit.setCredits					(rs.getInt(10));
			credit.setPayments					(rs.getInt(11));
			credit.setPurchases					(rs.getInt(12));
			credit.setCharges					(rs.getInt(13));
			credit.setCashAdvances				(rs.getInt(14));
			credit.setFinanceCharge				(rs.getInt(15));
			credit.setNewBalance				(rs.getInt(16));
			
			credit.setCreateUser				(rs.getString(17));
			credit.setCreateTimestamp			(rs.getTimestamp(18));
			credit.setModifyUser				(rs.getString(19));
			credit.setModifyTimestamp			(rs.getTimestamp(20));
			
			return credit;
			
		}
	});
  }
}
