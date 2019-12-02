package com.region06.bank.acquirer.client.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region06.bank.acquirer.client.model.AcquirerBean;

public class AcquirerDaoImpl implements AcquirerDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AcquirerBean acquirer){

			String sql 
			
				= "INSERT INTO ACQUIRER_TABLE "
						+ "("
						+ " INTL_BANK_ACCOUNT_NUMBER"
						+ " BANK_IDENTIFIER_CODE"
						+ " BANK_IDENTIFICATION_NUMBER"
						+ " NAME"
						+ ",STREET"
						+ ",CITY"
						+ ",STATE"
						+ ",COUNTRY"
						+ ",ZIP_CODE"
						+ ",PHONE_NUMBER"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	acquirer.getIntlBankAccountNumber()		+	"'"
						+ ",'"	+	acquirer.getBankIdentifierCode()		+	"'"
						+ ",'"	+	acquirer.getBankIdentificationNumber()	+	"'"
						+ ",'"	+	acquirer.getName()						+	"'"
						+ ",'"	+	acquirer.getStreet()					+	"'"
						+ ",'"	+	acquirer.getCity()						+	"'"
						+ ",'"	+	acquirer.getState()						+	"'"
						+ ",'"	+	acquirer.getCountry()					+	"'"
						+ ",'"	+	acquirer.getZipCode()					+	"'"
						+ ",'"	+	acquirer.getPhoneNumber()				+	"'"
						+ ",'"	+	acquirer.getCreateUser()				+	"'"
						+ ",'"	+	acquirer.getCreateTimestamp()			+	"'"
						+ ",'"	+	acquirer.getModifyUser()				+	"'"
						+ ",'"	+	acquirer.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AcquirerBean acquirer){
	
	String sql =
			
			" UPDATE ACQUIRER_TABLE " 	+
			
			"    SET INTL_BANK_ACCOUNT_NUMBER 	= '" 	+ acquirer.getIntlBankAccountNumber() 		+	"'"	+
			"      , BANK_IDENTIFIER_CODE 		= '"  	+ acquirer.getBankIdentifierCode()			+	"'"	+
			"      , BANK_IDENTIFICATION_NUMBER = '"  	+ acquirer.getBankIdentificationNumber()	+	"'"	+
			"      , NAME 						= '" 	+ acquirer.getName() 						+	"'"	+
			"      , STREET 					= '"  	+ acquirer.getStreet()			 			+	"'"	+
			"      , CITY						= '" 	+ acquirer.getCity()  						+	"'"	+
			"      , STATE						= '" 	+ acquirer.getState()  						+	"'"	+
			"      , COUNTRY					= '" 	+ acquirer.getCountry()  					+	"'"	+
			"      , ZIP_CODE					= '" 	+ acquirer.getZipCode()  					+	"'"	+
			"      , PHONE_NUMBER				= '" 	+ acquirer.getPhoneNumber()  				+	"'"	+
			"      , MODIFY_USER				= '" 	+ acquirer.getModifyUser()  				+	"'"	+
			"      , MODIFY_TIMESTAMP			= '" 	+ acquirer.getModifyTimestamp()  			+	"'"	+	
			
			"  WHERE ID 						= "		+ acquirer.getId()							+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM ACQUIRER_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public AcquirerBean selectAcquirerById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM ACQUIRER_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<AcquirerBean>(AcquirerBean.class));
	
}

@Override
public List<AcquirerBean> select(){
	
	return template.query( "SELECT * from ACQUIRER_TABLE"
						 ,new RowMapper<AcquirerBean>(){
		
		public AcquirerBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AcquirerBean acquirer = new AcquirerBean();
			
			acquirer.setId							(rs.getInt("ID"));
			acquirer.setIntlBankAccountNumber		(rs.getString("INTL_BANK_ACCOUNT_NUMBER"));
			acquirer.setBankIdentifierCode			(rs.getString("BANK_IDENTIFIER_CODE"));
			acquirer.setBankIdentificationNumber	(rs.getInt("BANK_IDENTIFICATION_NUMBER"));
			acquirer.setName						(rs.getString("NAME"));
			acquirer.setStreet						(rs.getString("STREET"));
			acquirer.setCity						(rs.getString("CITY"));
			acquirer.setState						(rs.getString("STATE"));
			acquirer.setCountry						(rs.getString("COUNTRY"));
			acquirer.setZipCode						(rs.getString("ZIP_CODE"));
			acquirer.setPhoneNumber					(rs.getString("PHONE_NUMBER"));
			acquirer.setCreateUser					(rs.getString("CREATE_USER"));
			acquirer.setCreateTimestamp				(rs.getTimestamp("CREATE_TIMESTAMP"));
			acquirer.setModifyUser					(rs.getString("MODIFY_USER"));
			acquirer.setModifyTimestamp				(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return acquirer;
			
		}
	});
  }
}
