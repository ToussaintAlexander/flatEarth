package com.main.execute.simulation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.main.execute.simulation.model.SimulationBean;

public class SimulationDaoImpl implements SimulationDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(SimulationBean simulation){

			String sql 
			
				= "INSERT INTO SIMULATION_TABLE "
						+ "("
						+ " PRIMARY_ACCCOUNT_NUMBER"
						+ ",TRANSACTION_TYPE"
						+ ",ACCOUNT_FROM_TYPE"
						+ ",ACCOUNT_TO_TYPE"
						+ ",TRANSACTION_AMOUNT"
						+ ",EXPIRATION_DATE"
						+ ",MERCHANT_CATEGORY_CODE"
						+ ",ACQUIRE_INST_COUNTRY_CODE"
						+ ",FORWARD_INST_COUNTRY_CODE"
						+ ",TRANSACTION_ENTRY_MODE"
						+ ",PIN_ENTRY_MODE"
						+ ",POS_CONDITION_CODE"
						+ ",TRANSACTION_FEE_AMOUNT"
						+ ",RESPONSE_CODE"
						+ ",TRANSACTION_CURRENCY_CODE"
						+ ",ACCOUNT_TYPE"
						+ ",AMOUNT_TYPE"
						+ ",CURRENCY_CODE"
						+ ",ACCOUNT_ENTRY"
						+ ",AMOUNT"						
						+ ",NETWORK_MANAGEMENT_CODE"	
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	simulation.getPrimaryAccountNumber()	+	"'"
						+ ",'"	+	simulation.getTransactionType()			+	"'"
						+ ",'"	+	simulation.getAccountFromType()			+	"'"
						+ ",'"	+	simulation.getAccountToType()			+	"'"
						+ ",'"	+	simulation.getTransactionAmount()		+	"'"
						+ ",'"	+	simulation.getExpirationDate()			+	"'"
						+ ",'"	+	simulation.getMerchantCategoryCode()	+	"'"
						+ ",'"	+	simulation.getAcquireInstCountryCode()	+	"'"
						+ ",'"	+	simulation.getForwardInstCountryCode()	+	"'"
						+ ",'"	+	simulation.getTransactionEntryMode()	+	"'"
						+ ",'"	+	simulation.getPinEntryMode()			+	"'"
						+ ",'"	+	simulation.getPOSConditionCode()		+	"'"
						+ ",'"	+	simulation.getTransactionFeeAmount()	+	"'"
						+ ",'"	+	simulation.getResponseCode()			+	"'"
						+ ",'"	+	simulation.getTransactionCurrencyCode()	+	"'"
						+ ",'"	+	simulation.getAccountType()				+	"'"
						+ ",'"	+	simulation.getAmountType()				+	"'"
						+ ",'"	+	simulation.getCurrencyCode()			+	"'"
						+ ",'"	+	simulation.getAccountEntry()			+	"'"
						+ ",'"	+	simulation.getAmount()					+	"'"
						+ ",'"	+	simulation.getNetworkManagementCode()	+	"'"
						
						+ ",'"	+	simulation.getCreateUser()				+	"'"
						+ ",'"	+	simulation.getCreateTimestamp()			+	"'"
						+ ",'"	+	simulation.getModifyUser()				+	"'"
						+ ",'"	+	simulation.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(SimulationBean simulation){
	
	String sql =
			
			" UPDATE SIMULATION_TABLE 	   			   " 	+
			
			"    SET PRIMARY_ACCCOUNT_NUMBER 		= '"  	+	simulation.getPrimaryAccountNumber()	+	"'"	+
			"      , TRANSACTION_TYPE 				= '"  	+	simulation.getTransactionType()			+	"'"	+
			"      , ACCOUNT_FROM_TYPE 				= '"  	+	simulation.getAccountFromType()			+	"'"	+
			"      , ACCOUNT_TO_TYPE 				= '"  	+	simulation.getAccountToType()			+	"'"	+
			"      , TRANSACTION_AMOUNT 			= '"  	+	simulation.getTransactionAmount()		+	"'"	+
			"      , EXPIRATION_DATE 				= '"  	+	simulation.getExpirationDate()			+	"'"	+
			"      , MERCHANT_CATEGORY_CODE 		= '"  	+	simulation.getMerchantCategoryCode()	+	"'"	+
			"      , ACQUIRE_INST_COUNTRY_CODE 		= '"  	+	simulation.getAcquireInstCountryCode()	+	"'"	+
			"      , FORWARD_INST_COUNTRY_CODE 		= '"  	+	simulation.getForwardInstCountryCode()	+	"'"	+
			"      , TRANSACTION_ENTRY_MODE 		= '"  	+	simulation.getTransactionEntryMode()	+	"'"	+
			"      , PIN_ENTRY_MODE 				= '"  	+	simulation.getPinEntryMode()			+	"'"	+
			"      , POS_CONDITION_CODE 			= '"  	+	simulation.getPOSConditionCode()		+	"'"	+
			"      , TRANSACTION_FEE_AMOUNT 		= '"  	+	simulation.getTransactionFeeAmount()	+	"'"	+
			"      , RESPONSE_CODE 					= '"  	+	simulation.getResponseCode()			+	"'"	+
			"      , TRANSACTION_CURRENCY_CODE 		= '"  	+	simulation.getTransactionCurrencyCode()	+	"'"	+
			"      , ACCOUNT_TYPE 					= '"  	+	simulation.getAccountType()				+	"'"	+
			"      , AMOUNT_TYPE 					= '"  	+	simulation.getAmountType()				+	"'"	+
			"      , CURRENCY_CODE 					= '"  	+	simulation.getCurrencyCode()			+	"'"	+
			"      , AMOUNT 						= '"  	+	simulation.getAmount()					+	"'"	+
			"      , NETWORK_MANAGEMENT_CODE 		= '"  	+	simulation.getNetworkManagementCode()	+	"'"	+
			
			"      , MODIFY_USER					= '" 	+ simulation.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ simulation.getModifyTimestamp()  			+	"'"	+	
			
			" WHERE ID 								= "		+ simulation.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM SIMULATION_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public SimulationBean selectSimulationById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM SIMULATION_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<SimulationBean>(SimulationBean.class));
	
}

@Override
public List<SimulationBean> select(){
	
	return template.query( "SELECT * FROM SIMULATION_TABLE WHERE ID < 11"
			     ,new RowMapper<SimulationBean>(){
		
		public SimulationBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SimulationBean simulation = new SimulationBean();
			
			simulation.setId						(rs.getInt(1));
			
			simulation.setPrimaryAccountNumber		(rs.getString(2));
			simulation.setTransactionType			(rs.getString(3));
			simulation.setAccountFromType			(rs.getString(4));
			simulation.setAccountToType				(rs.getString(5));
			simulation.setTransactionAmount			(rs.getLong(6));
			simulation.setExpirationDate			(rs.getString(7));
			simulation.setMerchantCategoryCode		(rs.getString(8));
			simulation.setAcquireInstCountryCode	(rs.getString(9));
			simulation.setForwardInstCountryCode	(rs.getString(10));
			simulation.setTransactionEntryMode		(rs.getString(11));
			simulation.setPinEntryMode				(rs.getString(12));
			simulation.setPOSConditionCode			(rs.getString(13));
			simulation.setTransactionFeeAmount		(rs.getString(14));
			simulation.setResponseCode				(rs.getString(15));
			simulation.setTransactionCurrencyCode	(rs.getString(16));
			simulation.setAccountType				(rs.getString(17));
			simulation.setAmountType				(rs.getString(18));
			simulation.setCurrencyCode				(rs.getString(19));
			simulation.setAccountEntry				(rs.getString(20));
			simulation.setAmount					(rs.getString(21));
			simulation.setNetworkManagementCode		(rs.getString(22));
			
			simulation.setCreateUser				(rs.getString(23));
			simulation.setCreateTimestamp			(rs.getTimestamp(24));
			simulation.setModifyUser				(rs.getString(25));
			simulation.setModifyTimestamp			(rs.getTimestamp(26));
			
			return simulation;
			
		}
	});
  }
}
