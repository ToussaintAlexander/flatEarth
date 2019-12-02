package com.main.testing.feature.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.main.testing.feature.model.FeatureBean;

public class FeatureDaoImpl implements FeatureDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(FeatureBean feature){

			String sql 
			
				= "INSERT INTO FEATURE_TABLE "
						+ "("
						+ " UNKNOWN_PARAMETER"
						+ ",INDEPENDENT_VARIABLE"
						+ ",DEPENDENT_VARIABLE"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	feature.getUnknownParameter()		+	"'"
						+ ",'"	+	feature.getIndependentVariable()	+	"'"
						+ ",'"	+	feature.getDependentVariable()		+	"'"
						+ ",'"	+	feature.getCreateUser()				+	"'"
						+ ",'"	+	feature.getCreateTimestamp()		+	"'"
						+ ",'"	+	feature.getModifyUser()				+	"'"
						+ ",'"	+	feature.getModifyTimestamp()		+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(FeatureBean feature){
	
	String sql =
			
			" UPDATE FEATURE_TABLE " 				+
			
			"    SET UNKNOWN_PARAMETER 		= '" 	+ feature.getUnknownParameter() 	+	"'"	+
			"      , INDEPENDENT_VARIABLE 	= '"  	+ feature.getIndependentVariable()	+	"'"	+
			"      , DEPENDENT_VARIABLE 	= '"  	+ feature.getDependentVariable()	+	"'"	+
			"      , MODIFY_USER			= '" 	+ feature.getModifyUser()  			+	"'"	+
			"      , MODIFY_TIMESTAMP		= '" 	+ feature.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 					= "		+ feature.getId()					+ 	"";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			" DELETE FROM FEATURE_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public FeatureBean selectFeatureById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM FEATURE_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<FeatureBean>(FeatureBean.class));
	
}

@Override
public List<FeatureBean> select(){
	
	return template.query( "SELECT * FROM FEATURE_TABLE"
						 ,new RowMapper<FeatureBean>(){
		
		public FeatureBean mapRow(ResultSet rs, int row) throws SQLException {
			
			FeatureBean feature = new FeatureBean();
			
			feature.setId					(rs.getInt("ID"));
			feature.setUnknownParameter		(rs.getString("UNKNOWN_PARAMETER"));
			feature.setIndependentVariable	(rs.getString("INDEPENDENT_VARIABLE"));
			feature.setDependentVariable	(rs.getString("DEPENDENT_VARIABLE"));
			feature.setCreateUser			(rs.getString("CREATE_USER"));
			feature.setCreateTimestamp		(rs.getTimestamp("CREATE_TIMESTAMP"));
			feature.setModifyUser			(rs.getString("MODIFY_USER"));
			feature.setModifyTimestamp		(rs.getTimestamp("MODIFY_TIMESTAMP"));
			
			return feature;
			
		}
	});
  }
}
