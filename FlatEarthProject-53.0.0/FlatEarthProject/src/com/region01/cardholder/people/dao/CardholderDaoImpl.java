package com.region01.cardholder.people.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region01.cardholder.people.model.CardholderBean;

public class CardholderDaoImpl implements CardholderDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(CardholderBean cardholder){

			String sql 
			
				= "INSERT INTO CARDHOLDER_TABLE "
						+ "("
						+ " FIRST_NAME"
						+ ",MIDDLE_NAME"
						+ ",LAST_NAME"
						+ ",SOCIAL_SECURITY"
						+ ",COMPANY"
						+ ",DEPARTMENT"
						+ ",TITLE"
						+ ",SALARY"
						+ ",AGE"
						+ ",MARITAL_STATUS"
						+ ",DATE_OF_BIRTH"
						+ ",EDUCATION"
						+ ",INTERESTS"
						+ ",USER_NAME"
						+ ",USER_ID"
						+ ",SECRET"
						+ ",CLEARTEXT_PIN"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	cardholder.getFirstName()		+	"'"
						+ ",'"	+	cardholder.getMiddleName()		+	"'"
						+ ",'"	+	cardholder.getLastName()		+	"'"
						+ ",'"	+	cardholder.getSocialSecurity()	+	"'"
						+ ",'"	+	cardholder.getCompany()			+	"'"
						+ ",'"	+	cardholder.getDepartment()		+	"'"
						+ ",'"	+	cardholder.getTitle()			+	"'"
						+ ",'"	+	cardholder.getSalary()			+	"'"
						+ ",'"	+	cardholder.getAge()				+	"'"
						+ ",'"	+	cardholder.getMaritalStatus()	+	"'"
						+ ",'"	+	cardholder.getDateOfBirth()		+	"'"
						+ ",'"	+	cardholder.getEducation()		+	"'"
						+ ",'"	+	cardholder.getInterests()		+	"'"
						+ ",'"	+	cardholder.getUserName()		+	"'"
						+ ",'"	+	cardholder.getUserId()			+	"'"
						+ ",'"	+	cardholder.getSecret()			+	"'"
						+ ",'"	+	cardholder.getClearTextPin()	+	"'"
						+ ",'"	+	cardholder.getCreateUser()		+	"'"
						+ ",'"	+	cardholder.getCreateTimestamp()	+	"'"
						+ ",'"	+	cardholder.getModifyUser()		+	"'"
						+ ",'"	+	cardholder.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(CardholderBean cardholder){
	
	String sql =
			
			" UPDATE CARDHOLDER_TABLE 	   " 	+
			
			"    SET FIRST_NAME 		= '" 	+ cardholder.getFirstName() 		+	"'"	+
			"      , MIDDLE_NAME 		= '"  	+ cardholder.getMiddleName()	 	+	"'"	+
			"      , LAST_NAME 			= '"  	+ cardholder.getLastName()			+	"'"	+
			"      , SOCIAL_SECURITY 	= '"  	+ cardholder.getSocialSecurity() 	+	"'"	+
			"      , COMPANY 			= '"  	+ cardholder.getCompany() 			+	"'"	+
			"      , DEPARTMENT 		= '"  	+ cardholder.getDepartment() 		+	"'"	+
			"      , TITLE 				= '"  	+ cardholder.getTitle() 			+	"'"	+
			"      , SALARY 			= '"  	+ cardholder.getSalary() 			+	"'"	+
			"      , AGE 				= '"  	+ cardholder.getAge()	 			+	"'"	+
			"      , MARITAL_STATUS 	= '"  	+ cardholder.getMaritalStatus() 	+	"'"	+
			"      , DATE_OF_BIRTH 		= '"  	+ cardholder.getDateOfBirth() 		+	"'"	+
			"      , EDUCATION 			= '"  	+ cardholder.getEducation() 		+	"'"	+
			"      , INTERESTS 			= '"  	+ cardholder.getInterests() 		+	"'"	+
			"      , USER_NAME 			= '"  	+ cardholder.getUserName() 			+	"'"	+
			"      , USER_ID 			= '"  	+ cardholder.getUserId() 			+	"'"	+
			"      , SECRET 			= '"  	+ cardholder.getSecret() 			+	"'"	+
			"      , CLEARTEXT_PIN 		= '"  	+ cardholder.getClearTextPin() 		+	"'"	+
			"      , MODIFY_USER		= '" 	+ cardholder.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ cardholder.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "	+ cardholder.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM CARDHOLDER_TABLE " 	+
			"  WHERE ID = "						+
			         id							+
			"";
	
	return template.update(sql);
	
}

@Override
public CardholderBean selectCardholderById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM CARDHOLDER_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
				      , new Object[]{id}
				      , new BeanPropertyRowMapper<CardholderBean>(CardholderBean.class));
	
}

@Override
public List<CardholderBean> select(int minimumRowNumber, int maximumRowNumber){
	
	String sql =  
		    "  SELECT * FROM "									+
		    "( SELECT a.*, ROWNUM rnum FROM "					+	
		    "( SELECT * FROM CARDHOLDER_TABLE "					+
		    "  ORDER BY ID, rowid) a " 							+
		    "  WHERE rownum <= " + maximumRowNumber 			+ 
		    " ) " 												+
		    "  WHERE rnum   >= " + minimumRowNumber				+ 
		    " ";

	return template.query( sql,new RowMapper<CardholderBean>(){
		
		public CardholderBean mapRow(ResultSet rs, int row) throws SQLException {
			
			CardholderBean cardholder = new CardholderBean();
			
			cardholder.setId				(rs.getInt(1));
			cardholder.setFirstName			(rs.getString(2));
			cardholder.setMiddleName		(rs.getString(3));
			cardholder.setLastName			(rs.getString(4));
			cardholder.setSocialSecurity	(rs.getString(5));
			cardholder.setCompany			(rs.getString(6));
			cardholder.setDepartment		(rs.getString(7));
			cardholder.setTitle				(rs.getString(8));
			cardholder.setSalary			(rs.getBigDecimal(9));
			cardholder.setAge				(rs.getInt(10));
			cardholder.setMaritalStatus		(rs.getString(11));
			cardholder.setDateOfBirth		(rs.getDate(12));
			cardholder.setEducation			(rs.getString(13));
			cardholder.setInterests			(rs.getString(14));
			cardholder.setUserName			(rs.getString(15));
			cardholder.setUserId			(rs.getString(16));
			cardholder.setSecret			(rs.getString(17));
			cardholder.setClearTextPin		(rs.getInt(18));
			cardholder.setCreateUser		(rs.getString(19));
			cardholder.setCreateTimestamp	(rs.getTimestamp(20));
			cardholder.setModifyUser		(rs.getString(21));
			cardholder.setModifyTimestamp	(rs.getTimestamp(22));
			
			return cardholder;
			
		}
	});
  }
}
