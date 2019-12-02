package com.system.configuration.address.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.configuration.address.model.AddressBean;

public class AddressDaoImpl implements AddressDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(AddressBean address){

			String sql 
			
				= "insert into ADDRESS_TABLE "
						+ "("
						+ ",street"
						+ ",city"
						+ ",state"
						+ ",country"
						+ ",zip_code"
						+ ",phone_number"
						+ ",create_user"
						+ ",create_timestamp"
						+ ",modify_user"
						+ ",modify_timestamp"
						+ ") "
						+ "values"
						+ "('"	+	address.getStreet()				+	"'"
						+ ",'"	+	address.getCity()				+	"'"
						+ ",'"	+	address.getState()				+	"'"
						+ ",'"	+	address.getCountry()			+	"'"
						+ ",'"	+	address.getZipCode()			+	"'"
						+ ",'"	+	address.getPhoneNumber()		+	"'"
						+ ",'"	+	address.getCreateUser()			+	"'"
						+ ",'"	+	address.getCreateTimestamp()	+	"'"
						+ ",'"	+	address.getModifyUser()			+	"'"
						+ ",'"	+	address.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(AddressBean address){
	
	String sql =
			
			" UPDATE ACQUIRER_TABLE " 			+
			
			"    SET street 			= '"  	+ address.getStreet()			+	"'"	+
			"      , city				= '" 	+ address.getCity()  			+	"'"	+
			"      , state				= '" 	+ address.getState()  			+	"'"	+
			"      , country			= '" 	+ address.getCountry()  		+	"'"	+
			"      , zip_code			= '" 	+ address.getZipCode()  		+	"'"	+
			"      , phone_number		= '" 	+ address.getPhoneNumber()  	+	"'"	+
			"      , create_user		= '" 	+ address.getCreateUser()  		+	"'"	+
			"      , create_timestamp	= '" 	+ address.getCreateTimestamp()  +	"'"	+
			"      , modify_user		= '" 	+ address.getModifyUser()  		+	"'"	+
			"      , modify_timestamp	= '" 	+ address.getModifyTimestamp()  +	"'"	+	
			
			"  WHERE id 				= "		+ address.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"delete from ADDRESS_TABLE "
			+ "where id = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public AddressBean getAddressById(int id){
	
	String sql 
	
		= "select * "
		+ "from ADDRESS_TABLE "
		+ "where id = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<AddressBean>(AddressBean.class));
	
}

@Override
public List<AddressBean> select(){
	
	return template.query( "select * from ADDRESS_TABLE"
						 ,new RowMapper<AddressBean>(){
		
		public AddressBean mapRow(ResultSet rs, int row) throws SQLException {
			
			AddressBean address = new AddressBean();
			
			address.setId				(rs.getInt(1));
			address.setStreet			(rs.getString(2));
			address.setCity				(rs.getString(3));
			address.setState			(rs.getString(4));
			address.setCountry			(rs.getString(5));
			address.setZipCode			(rs.getString(6));
			address.setPhoneNumber		(rs.getString(7)); 
			address.setCreateUser		(rs.getString(8));
			address.setCreateTimestamp	(rs.getTimestamp(9));
			address.setModifyUser		(rs.getString(10));
			address.setModifyTimestamp	(rs.getTimestamp(11));
			
			return address;
			
		}
	});
  }
}
