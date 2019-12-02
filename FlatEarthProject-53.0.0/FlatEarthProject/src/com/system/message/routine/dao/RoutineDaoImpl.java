package com.system.message.routine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.message.routine.model.RoutineBean;

public class RoutineDaoImpl implements RoutineDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RoutineBean subroutine){

			String sql 
			
				= "INSERT INTO SUBROUTINE_TABLE "
						+ "("
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
						+ "('"	+	subroutine.getName()			+	"'"
						+ ",'"	+	subroutine.getStreet()			+	"'"
						+ ",'"	+	subroutine.getCity()			+	"'"
						+ ",'"	+	subroutine.getState()			+	"'"
						+ ",'"	+	subroutine.getCountry()			+	"'"
						+ ",'"	+	subroutine.getZipCode()			+	"'"
						+ ",'"	+	subroutine.getPhoneNumber()		+	"'"
						+ ",'"	+	subroutine.getCreateUser()		+	"'"
						+ ",'"	+	subroutine.getCreateTimestamp()	+	"'"
						+ ",'"	+	subroutine.getModifyUser()		+	"'"
						+ ",'"	+	subroutine.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(RoutineBean subroutine){
	
	String sql =
			
			" UPDATE SUBROUTINE_TABLE " 	+
			
			"    SET NAME 				= '" 	+ subroutine.getName() 				+	"'"	+
			"      , STREET 			= '"  	+ subroutine.getStreet()			+	"'"	+
			"      , CITY				= '" 	+ subroutine.getCity()  			+	"'"	+
			"      , STATE				= '" 	+ subroutine.getState()  			+	"'"	+
			"      , COUNTRY			= '" 	+ subroutine.getCountry()  			+	"'"	+
			"      , ZIP_CODE			= '" 	+ subroutine.getZipCode()  			+	"'"	+
			"      , PHONE_NUMBER		= '" 	+ subroutine.getPhoneNumber()  		+	"'"	+
			"      , MODIFY_USER		= '" 	+ subroutine.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ subroutine.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ subroutine.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM SUBROUTINE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public RoutineBean selectRoutineById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM SUBROUTINE_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RoutineBean>(RoutineBean.class));
	
}

@Override
public List<RoutineBean> select(){
	
	return template.query( "SELECT * from SUBROUTINE_TABLE"
						 ,new RowMapper<RoutineBean>(){
		
		public RoutineBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RoutineBean subroutine = new RoutineBean();
			
			subroutine.setId				(rs.getInt("ID"));
			subroutine.setName				(rs.getString("NAME"));
			subroutine.setStreet			(rs.getString("STREET"));
			subroutine.setCity				(rs.getString("CITY"));
			subroutine.setState				(rs.getString("STATE"));
			subroutine.setCountry			(rs.getString("COUNTRY"));
			subroutine.setZipCode			(rs.getString("ZIP_CODE"));
			subroutine.setPhoneNumber		(rs.getString("PHONE_NUMBER"));
			subroutine.setCreateUser		(rs.getString("CREATE_USER"));
			subroutine.setCreateTimestamp	(rs.getTimestamp("CREATE_TIMESTAMP"));
			subroutine.setModifyUser		(rs.getString("MODIFY_USER"));
			subroutine.setModifyTimestamp	(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return subroutine;
			
		}
	});
  }
}
