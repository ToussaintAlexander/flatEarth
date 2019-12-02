package com.region08.association.scheme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.scheme.model.SchemeBean;

public class SchemeDaoImpl implements SchemeDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert (SchemeBean scheme){

			String sql 
			
				= "insert into SCHEME_TABLE "
						+ "(				"
						+ " company			"
						+ ",type_held		"
						+ ",symbol			"
						+ ",industry		"
						+ ",founded			"
						+ ",founder			"
						+ ",city			"
						+ ",state			"
						+ ",country			"
						+ ",area_served		"
						+ ",key_people		"
						+ ",products		"
						+ ",revenue			"
						+ ",operating_income"
						+ ",net_income		"
						+ ",total_assets	"
						+ ",total_equity	"
						+ ",total_employees	"
						+ ",website			"
						+ ",create_user		"
						+ ",create_timestamp"
						+ ",modify_user		"
						+ ",modify_timestamp"
						+ ") 				"
						+ "values"
						+ "('"
						+ "  "	+	scheme.getCompany()			+	"'"
						+ ",'"	+	scheme.getTypeHeld()		+	"'"
						+ ",'"	+	scheme.getSymbol()			+	"'"
						+ ",'"	+	scheme.getIndustry()		+	"'"
						+ ",'"	+	scheme.getFounded()			+	"'"
						+ ",'"	+	scheme.getFounder()			+	"'"
						+ ",'"	+	scheme.getCity()			+	"'"
						+ ",'"	+	scheme.getState()			+	"'"
						+ ",'"	+	scheme.getCountry()			+	"'"
						+ ",'"	+	scheme.getAreaServed()		+	"'"
						+ ",'"	+	scheme.getKeyPeople()		+	"'"
						+ ",'"	+	scheme.getRevenue()			+	"'"
						+ ",'"	+	scheme.getOperatingIncome()	+	"'"						
						+ ",'"	+	scheme.getNetIncome()		+	"'"
						+ ",'"	+	scheme.getTotalAssets()		+	"'"
						+ ",'"	+	scheme.getTotalEquity()		+	"'"
						+ ",'"	+	scheme.getTotalEmployees()	+	"'"
						+ ",'"	+	scheme.getWebsite()			+	"'"							
						+ ",'"	+	scheme.getCreateUser()		+	"'"
						+ ",'"	+	scheme.getCreateTimestamp()	+	"'"
						+ ",'"	+	scheme.getModifyUser()		+	"'"
						+ ",'"	+	scheme.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update (SchemeBean scheme){
	
	String sql =
			
			" UPDATE SCHEME_TABLE " 											+
			
			"    SET company 			= '" 	+ scheme.getCompany() 			+	"'"	+
			"      , type_held 			= '"  	+ scheme.getTypeHeld()			+	"'"	+
			"      , symbol 			= '"  	+ scheme.getSymbol()			+	"'"	+
			"      , industry 			= '"  	+ scheme.getIndustry()			+	"'"	+			
			"      , founded 			= '"  	+ scheme.getFounded()			+	"'"	+
			"      , founder 			= '"  	+ scheme.getFounder()			+	"'"	+
			"      , city				= '" 	+ scheme.getCity()  			+	"'"	+
			"      , state				= '" 	+ scheme.getState()  			+	"'"	+
			"      , country			= '" 	+ scheme.getCountry()  			+	"'"	+
			"      , area_served		= '" 	+ scheme.getAreaServed()  		+	"'"	+
			"      , key_people			= '" 	+ scheme.getKeyPeople()  		+	"'"	+
			"      , products 			= '"  	+ scheme.getProducts()			+	"'"	+
			"      , revenue			= '" 	+ scheme.getRevenue()  			+	"'"	+
			"      , operating_income	= '" 	+ scheme.getOperatingIncome()  	+	"'"	+
			"      , net_income			= '" 	+ scheme.getNetIncome()  		+	"'"	+
			"      , total_assets		= '" 	+ scheme.getTotalAssets()  		+	"'"	+
			"      , total_equity		= '" 	+ scheme.getTotalEquity()  		+	"'"	+			
			"      , total_employees	= '" 	+ scheme.getTotalEmployees()  	+	"'"	+
			"      , website			= '" 	+ scheme.getWebsite()  			+	"'"	+				
			"      , create_user		= '" 	+ scheme.getCreateUser()  		+	"'"	+
			"      , create_timestamp	= '" 	+ scheme.getCreateTimestamp()  	+	"'"	+
			"      , modify_user		= '" 	+ scheme.getModifyUser()  		+	"'"	+
			"      , modify_timestamp	= '" 	+ scheme.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE id 				= "		+ scheme.getId()				+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete (int id){
	
	String sql =
			
			"delete from SCHEME_TABLE "
			+ "where id = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public SchemeBean selectSchemeById(int id){
	
	String sql 
	
		= "select * "
		+ "from SCHEME_TABLE "
		+ "where id = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<SchemeBean>(SchemeBean.class));
	
}

@Override
public List<SchemeBean> select(){
	
	return template.query( "select * from SCHEME_TABLE order by id"
						 ,new RowMapper<SchemeBean>(){
		
		public SchemeBean mapRow(ResultSet rs, int row) throws SQLException {
			
			SchemeBean scheme = new SchemeBean();
			
			scheme.setId				(rs.getInt(1));
			scheme.setCompany			(rs.getString(2));
			scheme.setTypeHeld			(rs.getString(3));
			scheme.setSymbol			(rs.getString(4));
			scheme.setIndustry			(rs.getString(5));
			scheme.setFounded			(rs.getInt(6));
			scheme.setFounder			(rs.getString(7));
			scheme.setCity				(rs.getString(8));
			scheme.setState				(rs.getString(9));
			scheme.setCountry			(rs.getString(10));
			scheme.setAreaServed		(rs.getString(11));
			scheme.setKeyPeople			(rs.getString(12));
			scheme.setProducts			(rs.getString(13));
			scheme.setRevenue			(rs.getLong(14));
			scheme.setOperatingIncome	(rs.getLong(15));
			scheme.setNetIncome			(rs.getLong(16));
			scheme.setTotalAssets		(rs.getLong(17));			
			scheme.setTotalEquity		(rs.getLong(18));
			scheme.setTotalEmployees	(rs.getInt(19));
			scheme.setWebsite			(rs.getString(20));					
			scheme.setCreateUser		(rs.getString(21));
			scheme.setCreateTimestamp	(rs.getTimestamp(22));
			scheme.setModifyUser		(rs.getString(23));
			scheme.setModifyTimestamp	(rs.getTimestamp(24));
			
			return scheme;
			
		}
	});
  }
}
