package com.region01.cardholder.statement.checking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.statement.checking.model.CheckingChargeBean;

public class CheckingChargeDaoImpl implements CheckingChargeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CheckingChargeBean charge){

			String sql 
			
				= "INSERT INTO CHECKING_CHARGE_TABLE "
						+ "("
						+ " PRIMARY_ACCOUNT_NUMBER"
						+ ",PRIMARY_ACCOUNT_NUMBER_SEQ" 
						+ ",CLOSING_DATE"
						+ ",BANK_NAME"
						+ ",ASSOCIATION_NAME"

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

						+ ",'"	+	charge.getCreateUser()						+	"'"
						+ ",'"	+	charge.getCreateTimestamp()					+	"'"
						+ ",'"	+	charge.getModifyUser()						+	"'"
						+ ",'"	+	charge.getModifyTimestamp()					+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CheckingChargeBean charge){
	
	String sql =
			
			" UPDATE CHECKING_CHARGE_TABLE 	  		   " 	+
			
			"    SET PRIMARY_ACCOUNT_NUMBER 		= '" 	+ charge.getPrimaryAccountNumber() 			+	"'"	+
			"      , PRIMARY_ACCOUNT_NUMBER_SEQ 	= '"  	+ charge.getPrimaryAccountNumberSeq()	 	+	"'"	+
			"      , CLOSING_DATE 					= '"  	+ charge.getClosingDate()					+	"'"	+
			"      , BANK_NAME 						= '"  	+ charge.getBankName() 						+	"'"	+
			"      , ASSOCIATION_NAME 				= '"  	+ charge.getAssociationName() 				+	"'"	+
			
			"      , MODIFY_USER					= '" 	+ charge.getModifyUser()  					+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ charge.getModifyTimestamp()  				+	"'"	+	
			
			"  WHERE ID 							= "	+ charge.getId()								+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CHECKING_CHARGE_TABLE " +
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public CheckingChargeBean selectCheckingChargeById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CHECKING_CHARGE_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CheckingChargeBean>(CheckingChargeBean.class));
	
}

@Override
public List<CheckingChargeBean> select(){
	
	return template.query( "SELECT * FROM CHECKING_CHARGE_TABLE WHERE ID < 11"
			     ,new RowMapper<CheckingChargeBean>(){
		
		public CheckingChargeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CheckingChargeBean charge = new CheckingChargeBean();
			
			charge.setId							(rs.getInt(1));
			
			charge.setPrimaryAccountNumber			(rs.getString(2));			 
			charge.setPrimaryAccountNumberSeq		(rs.getInt(3));			 
			charge.setClosingDate					(rs.getDate(4));						 
			charge.setBankName						(rs.getString(5));						 
			charge.setAssociationName				(rs.getString(6));	
			
			charge.setCreateUser					(rs.getString(25));
			charge.setCreateTimestamp				(rs.getTimestamp(26));
			charge.setModifyUser					(rs.getString(27));
			charge.setModifyTimestamp				(rs.getTimestamp(28));
			
			return charge;
			
		}
	});
  }
}
