package com.main.testing.regression.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.main.testing.regression.model.RegressionBean;

public class RegressionDaoImpl implements RegressionDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(RegressionBean feature){

			String sql 
			
				= "INSERT INTO REGRESSION_TABLE "
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
public int update(RegressionBean feature){
	
	String sql =
			
			" UPDATE REGRESSION_TABLE " 				+
			
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
			
			" DELETE FROM REGRESSION_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}

@Override
public RegressionBean selectRegressionById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "  FROM REGRESSION_TABLE "
		+ " WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<RegressionBean>(RegressionBean.class));
	
}

@Override
public List<RegressionBean> select(){
	
	return template.query( "SELECT * FROM REGRESSION_TABLE"
						 ,new RowMapper<RegressionBean>(){
		
		public RegressionBean mapRow(ResultSet rs, int row) throws SQLException {
			
			RegressionBean feature = new RegressionBean();
			
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
