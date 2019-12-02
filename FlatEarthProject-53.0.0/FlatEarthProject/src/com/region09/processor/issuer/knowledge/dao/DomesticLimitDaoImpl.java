package com.region09.processor.issuer.knowledge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region09.processor.issuer.knowledge.model.DomesticLimitBean;

public class DomesticLimitDaoImpl implements DomesticLimitDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(DomesticLimitBean domesticLimit){

			String sql 
			
				= "INSERT INTO DOMESTIC_LIMIT_TABLE "
						+ "("
						+ " LOW_BIN_RANGE_NUMBER"
						+ ",HIGH_BIN_RANGE_NUMBER"
						+ ",BIN_LENGTH"
						+ ",ACCOUNT_NUMBER_LENGTH"
						
						+ ",SINGLE_MAXIMUM_ADV_AMOUNT"
						+ ",SINGLE_MAXIMUM_ATM_AMOUNT"
						+ ",SINGLE_MAXIMUM_BCK_AMOUNT"
						+ ",SINGLE_MAXIMUM_POS_AMOUNT"
						
						+ ",DAILY_MAXIMUM_ADV_AMOUNT"
						+ ",DAILY_MAXIMUM_ATM_AMOUNT"
						+ ",DAILY_MAXIMUM_BCK_AMOUNT"
						+ ",DAILY_MAXIMUM_POS_AMOUNT"

						+ ",DAILY_MAXIMUM_ADV_NUMBER"
						+ ",DAILY_MAXIMUM_ATM_NUMBER"
						+ ",DAILY_MAXIMUM_BCK_NUMBER"
						+ ",DAILY_MAXIMUM_POS_NUMBER"

						+ ",DAILY_MAXIMUM_DECLINES"
						+ ",DAILY_MAXIMUM_BAD_PINS"		
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	domesticLimit.getLowBinRangeNumber()		+	"'"
						+ ",'"	+	domesticLimit.getHighBinRangeNumber()		+	"'"
						+ ",'"	+	domesticLimit.getBinLength()				+	"'"
						+ ",'"	+	domesticLimit.getAccountNumberLength()		+	"'"
						
						+ ",'"	+	domesticLimit.getSingleMaximumAdvAmount()	+	"'"
						+ ",'"	+	domesticLimit.getSingleMaximumAtmAmount()	+	"'"
						+ ",'"	+	domesticLimit.getSingleMaximumBckAmount()	+	"'"
						+ ",'"	+	domesticLimit.getSingleMaximumPosAmount()	+	"'"
						
						+ ",'"	+	domesticLimit.getDailyMaximumAdvAmount()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumAtmAmount()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumBckAmount()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumPosAmount()	+	"'"
						
						+ ",'"	+	domesticLimit.getDailyMaximumAdvNumber()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumAtmNumber()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumBckNumber()	+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumPosNumber()	+	"'"
						
						+ ",'"	+	domesticLimit.getDailyMaximumDeclines()		+	"'"
						+ ",'"	+	domesticLimit.getDailyMaximumBadPins()		+	"'"
						
						+ ",'"	+	domesticLimit.getCreateUser()				+	"'"
						+ ",'"	+	domesticLimit.getCreateTimestamp()			+	"'"
						+ ",'"	+	domesticLimit.getModifyUser()				+	"'"
						+ ",'"	+	domesticLimit.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(DomesticLimitBean domesticLimit){
	
	String sql =
			
			" UPDATE DOMESTIC_LIMIT_TABLE 	   " 			+
			
			"    SET LOW_BIN_RANGE_NUMBER 			= '" 	+ 	domesticLimit.getLowBinRangeNumber() 		+	"'"	+
			"      , HIGH_BIN_RANGE_NUMBER 			= '"  	+ 	domesticLimit.getHighBinRangeNumber()	 	+	"'"	+
			"      , BIN_LENGTH 					= '"  	+	domesticLimit.getLowBinRangeNumber()		+	"'"	+
			"      , ACCOUNT_NUMBER_LENGTH 			= '"  	+	domesticLimit.getHighBinRangeNumber()		+	"'"	+
			
			"      , SINGLE_MAXIMUM_ADV_AMOUNT 		= '"  	+	domesticLimit.getSingleMaximumAdvAmount()	+	"'"	+
			"      , SINGLE_MAXIMUM_ATM_AMOUNT 		= '"  	+	domesticLimit.getSingleMaximumAtmAmount()	+	"'"	+
			"      , SINGLE_MAXIMUM_BCK_AMOUNT 		= '"  	+	domesticLimit.getSingleMaximumBckAmount()	+	"'"	+
			"      , SINGLE_MAXIMUM_POS_AMOUNT 		= '"  	+	domesticLimit.getSingleMaximumPosAmount()	+	"'"	+
						
			"      , DAILY_MAXIMUM_ADV_AMOUNT 		= '"  	+	domesticLimit.getDailyMaximumAdvAmount()	+	"'"	+
			"      , DAILY_MAXIMUM_ATM_AMOUNT 		= '"  	+	domesticLimit.getDailyMaximumAtmAmount()	+	"'"	+
			"      , DAILY_MAXIMUM_BCK_AMOUNT 		= '"  	+	domesticLimit.getDailyMaximumBckAmount()	+	"'"	+
			"      , DAILY_MAXIMUM_POS_AMOUNT 		= '"  	+	domesticLimit.getDailyMaximumPosAmount()	+	"'"	+
						
			"      , DAILY_MAXIMUM_ADV_NUMBER 		= '"  	+	domesticLimit.getDailyMaximumAdvNumber()	+	"'"	+
			"      , DAILY_MAXIMUM_ATM_NUMBER 		= '"  	+	domesticLimit.getDailyMaximumAtmNumber()	+	"'"	+
			"      , DAILY_MAXIMUM_BCK_NUMBER 		= '"  	+	domesticLimit.getDailyMaximumBckNumber()	+	"'"	+
			"      , DAILY_MAXIMUM_POS_NUMBER 		= '"  	+	domesticLimit.getDailyMaximumPosNumber()	+	"'"	+
						
			"      , DAILY_MAXIMUM_DECLINES 		= '"  	+	domesticLimit.getDailyMaximumDeclines()		+	"'"	+
			"      , DAILY_MAXIMUM_BAD_PINS 		= '"  	+	domesticLimit.getDailyMaximumBadPins()		+	"'"	+
			
			
			"      , MODIFY_USER					= '" 	+ 	domesticLimit.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP				= '" 	+ 	domesticLimit.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 							= "		+ 	domesticLimit.getId()						+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM DOMESTIC_LIMIT_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public DomesticLimitBean selectDomesticLimitById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM DOMESTIC_LIMIT_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<DomesticLimitBean>(DomesticLimitBean.class));
	
}

@Override
public List<DomesticLimitBean> select(){
	
	return template.query( "SELECT * from DOMESTIC_LIMIT_TABLE"
						 ,new RowMapper<DomesticLimitBean>(){
		
		public DomesticLimitBean mapRow(ResultSet rs, int row) throws SQLException {
			
			DomesticLimitBean domesticLimit = new DomesticLimitBean();
			
			domesticLimit.setId							(rs.getInt(1));
			
			domesticLimit.setLowBinRangeNumber			(rs.getString(2));
			domesticLimit.setHighBinRangeNumber			(rs.getString(3));
			domesticLimit.setBinLength					(rs.getInt(4));
			domesticLimit.setAccountNumberLength		(rs.getInt(5));
			
			domesticLimit.setSingleMaximumAdvAmount		(rs.getBigDecimal(6));
			domesticLimit.setSingleMaximumAtmAmount		(rs.getBigDecimal(7));
			domesticLimit.setSingleMaximumBckAmount		(rs.getBigDecimal(8));
			domesticLimit.setSingleMaximumPosAmount		(rs.getBigDecimal(9));
						
			domesticLimit.setDailyMaximumAdvAmount		(rs.getBigDecimal(11));
			domesticLimit.setDailyMaximumAtmAmount		(rs.getBigDecimal(12));
			domesticLimit.setDailyMaximumBckAmount		(rs.getBigDecimal(13));
			domesticLimit.setDailyMaximumPosAmount		(rs.getBigDecimal(14));
						
			domesticLimit.setDailyMaximumAdvNumber		(rs.getInt(16));
			domesticLimit.setDailyMaximumAtmNumber		(rs.getInt(17));
			domesticLimit.setDailyMaximumBckNumber		(rs.getInt(18));
			domesticLimit.setDailyMaximumPosNumber		(rs.getInt(19));
						
			domesticLimit.setDailyMaximumDeclines		(rs.getInt(21));
			domesticLimit.setDailyMaximumBadPins		(rs.getInt(22));
			
			domesticLimit.setCreateUser					(rs.getString(23));
			domesticLimit.setCreateTimestamp			(rs.getTimestamp(24));
			domesticLimit.setModifyUser					(rs.getString(25));
			domesticLimit.setModifyTimestamp			(rs.getTimestamp(26));
			
			return domesticLimit;
			
		}
	});
  }
}
