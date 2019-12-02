package com.region01.cardholder.statement.credit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.credit.model.CreditChargeBean;

public class CreditChargeDaoImpl implements CreditChargeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CreditChargeBean charge){

			String sql 
			
				= "INSERT INTO CREDIT_CHARGE_TABLE "
						+ "("
						+ " PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ" 
						+ ",CLOSING_DATE"
						+ ",BANK_NAME"
						+ ",ASSOCIATION_NAME"
						+ ",PURCHASE_APR"
						+ ",PURCHASE_FCR"
						+ ",PURCHASE_ADB"
						+ ",ADVANCE_APR"
						+ ",ADVANCE_FCR"
						+ ",ADVANCE_ADB"  	
						+ ",COMPOSITE_APR"
						+ ",TOTAL_FEES_CHARGED"
						+ ",PURCHASE_VARIABLE_APR"
						+ ",PURCHASE_BALANCE_SUBJECT"
						+ ",PURCHASE_DAYS_BILLING_CYCLE"
						+ ",PURCHASE_INTEREST_CHARGE"	
						+ ",ADVANCE_VARIABLE_APR"
						+ ",ADVANCE_BALANCE_SUBJECT"
						+ ",ADVANCE_DAYS_BILLING_CYCLE"
						+ ",ADVANCE_INTEREST_CHARGE"  
						+ ",TOTAL_FEES_CHARGED_YTD"
						+ ",TOTAL_INTEREST_CHARGED_YTD"
						+ ",CLEARTEXT_PIN"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	charge.getPrimaryAccountNumber()			+	"'"
						+ ",'"	+	charge.getPrimaryAccountNumberSeq()			+	"'"
						+ ",'"	+	charge.getClosingDate()						+	"'"
						+ ",'"	+	charge.getBankName()						+	"'"
						+ ",'"	+	charge.getAssociationName()					+	"'"
						+ ",'"	+	charge.getPurchaseAPR()						+	"'"
						+ ",'"	+	charge.getPurchaseFCR()						+	"'"
						+ ",'"	+	charge.getPurchaseADB()						+	"'"
						+ ",'"	+	charge.getAdvanceAPR()						+	"'"
						+ ",'"	+	charge.getAdvanceFCR()						+	"'"
						+ ",'"	+	charge.getAdvanceADB()						+	"'"
						+ ",'"	+	charge.getCompositeAPR()					+	"'"
						+ ",'"	+	charge.getTotalFeesChargedThisPeriod()		+	"'"
						+ ",'"	+	charge.getPurchaseVariableAPR()				+	"'"
						+ ",'"	+	charge.getPurchaseBalanceSubject()			+	"'"
						+ ",'"	+	charge.getPurchaseDaysInBillingCycle()		+	"'"
						+ ",'"	+	charge.getPurchaseInterestCharge()			+	"'"
						+ ",'"	+	charge.getCashAdvanceVariableAPR()			+	"'"
						+ ",'"	+	charge.getCashAdvanceBalanceSubject()		+	"'"
						+ ",'"	+	charge.getCashAdvanceDaysInBillingCycle()	+	"'"
						+ ",'"	+	charge.getCashAdvanceInterestCharge()		+	"'"
						+ ",'"	+	charge.getTotalFeesChargedYTD()				+	"'"
						+ ",'"	+	charge.getTotalInterestChargedYTD()			+	"'"
						+ ",'"	+	charge.getCreateUser()						+	"'"
						+ ",'"	+	charge.getCreateTimestamp()					+	"'"
						+ ",'"	+	charge.getModifyUser()						+	"'"
						+ ",'"	+	charge.getModifyTimestamp()					+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CreditChargeBean charge){
	
	String sql =
			
			" UPDATE CREDIT_CHARGE_TABLE 	  		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ charge.getPrimaryAccountNumber() 			+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 	= '"  	+ charge.getPrimaryAccountNumberSeq()	 	+	"'"	+
			"      , CLOSING_DATE 					= '"  	+ charge.getClosingDate()					+	"'"	+
			"      , BANK_NAME 						= '"  	+ charge.getBankName() 						+	"'"	+
			"      , ASSOCIATION_NAME 				= '"  	+ charge.getAssociationName() 				+	"'"	+
			"      , PURCHASE_APR 					= '"  	+ charge.getPurchaseAPR() 					+	"'"	+
			"      , PURCHASE_FCR 					= '"  	+ charge.getPurchaseFCR() 					+	"'"	+
			"      , PURCHASE_ADB 					= '"  	+ charge.getPurchaseADB() 					+	"'"	+
			"      , ADVANCE_APR 					= '"  	+ charge.getAdvanceAPR()	 				+	"'"	+
			"      , ADVANCE_FCR 					= '"  	+ charge.getAdvanceFCR() 					+	"'"	+
			"      , ADVANCE_ADB 					= '"  	+ charge.getAdvanceADB() 					+	"'"	+
			"      , COMPOSITE_APR 					= '"  	+ charge.getCompositeAPR() 					+	"'"	+
			"      , TOTAL_FEES_CHARGED 			= '"  	+ charge.getTotalFeesChargedThisPeriod() 	+	"'"	+
			"      , PURCHASE_VARIABLE_APR 			= '"  	+ charge.getPurchaseVariableAPR() 			+	"'"	+
			"      , PURCHASE_BALANCE_SUBJECT 		= '"  	+ charge.getPurchaseBalanceSubject() 		+	"'"	+
			"      , PURCHASE_DAYS_BILLING_CYCLE 	= '"  	+ charge.getPurchaseDaysInBillingCycle() 	+	"'"	+
			"      , PURCHASE_INTEREST_CHARGE 		= '"  	+ charge.getPurchaseInterestCharge() 		+	"'"	+
			"      , ADVANCE_VARIABLE_APR 			= '"  	+ charge.getCashAdvanceVariableAPR() 		+	"'"	+
			"      , ADVANCE_BALANCE_SUBJECT 		= '"  	+ charge.getCashAdvanceBalanceSubject() 	+	"'"	+
			"      , ADVANCE_DAYS_BILLING_CYCLE 	= '"  	+ charge.getCashAdvanceDaysInBillingCycle() +	"'"	+
			"      , ADVANCE_INTEREST_CHARGE 		= '"  	+ charge.getCashAdvanceInterestCharge() 	+	"'"	+
			"      , TOTAL_FEES_CHARGED_YTD 		= '"  	+ charge.getTotalFeesChargedYTD() 			+	"'"	+
			"      , TOTAL_INTEREST_CHARGED_YTD 	= '"  	+ charge.getTotalInterestChargedYTD() 		+	"'"	+
			
			"      , MODIFY_USER					= '" 	+ charge.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ charge.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 							= "	+ charge.getId()								+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CREDIT_CHARGE_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public CreditChargeBean selectCreditChargeById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CREDIT_CHARGE_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CreditChargeBean>(CreditChargeBean.class));
	
}

@Override
public List<CreditChargeBean> select(){
	
	return template.query( "SELECT * FROM CREDIT_CHARGE_TABLE WHERE ID < 11"
			     ,new RowMapper<CreditChargeBean>(){
		
		public CreditChargeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CreditChargeBean charge = new CreditChargeBean();
			
			charge.setId							(rs.getInt(1));
			
			charge.setPrimaryAccountNumber			(rs.getString(2));			 
			charge.setPrimaryAccountNumberSeq		(rs.getInt(3));			 
			charge.setClosingDate					(rs.getDate(4));						 
			charge.setBankName						(rs.getString(5));						 
			charge.setAssociationName				(rs.getString(6));					 
			charge.setPurchaseAPR					(rs.getInt(7));						 
			charge.setPurchaseFCR					(rs.getInt(8));						 
			charge.setPurchaseADB					(rs.getInt(19));						 
			charge.setAdvanceAPR					(rs.getInt(10));						 
			charge.setAdvanceFCR					(rs.getInt(11));						 
			charge.setAdvanceADB					(rs.getInt(12));						 
			charge.setCompositeAPR					(rs.getInt(13));					 
			charge.setTotalFeesChargedThisPeriod	(rs.getInt(14));		 
			charge.setPurchaseVariableAPR			(rs.getInt(15));				 
			charge.setPurchaseBalanceSubject		(rs.getInt(16));			 
			charge.setPurchaseDaysInBillingCycle	(rs.getInt(17));		 
			charge.setPurchaseInterestCharge		(rs.getInt(18));			 
			charge.setCashAdvanceVariableAPR		(rs.getInt(19));			 
			charge.setCashAdvanceBalanceSubject		(rs.getInt(20));		 
			charge.setCashAdvanceDaysInBillingCycle	(rs.getInt(21));	 
			charge.setCashAdvanceInterestCharge		(rs.getInt(22));		 
			charge.setTotalFeesChargedYTD			(rs.getInt(23));				 
			charge.setTotalInterestChargedYTD		(rs.getInt(24));			 
			
			charge.setCreateUser					(rs.getString(25));
			charge.setCreateTimestamp				(rs.getTimestamp(26));
			charge.setModifyUser					(rs.getString(27));
			charge.setModifyTimestamp				(rs.getTimestamp(28));
			
			return charge;
			
		}
	});
  }
}
