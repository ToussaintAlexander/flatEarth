package com.system.language.expression.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.system.language.expression.model.ExpressionBean;

@Repository
public class ExpressionDaoImpl implements ExpressionDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public int insert(ExpressionBean expression){

			String sql 
			
				= "INSERT INTO EXPRESSION_TABLE "
						+ "("
						+ " SCREEN_NAME"
						+ ",FIELD_NAME"
						+ ",FIELD_VALUE"
						+ ",EXPRESSION"
						+ ",RATING"
						+ ",DEFAULT_VALUE"
						+ ",STATUS"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	expression.getScreenName()		+	"'"
						+ ",'"	+	expression.getFieldName()		+	"'"
						+ ",'"	+	expression.getFieldValue()		+	"'"
						+ ",'"	+	expression.getExpression()		+	"'"
						+ ",'"	+	expression.getRating()			+	"'"
						+ ",'"	+	expression.getDefaultValue()	+	"'"
						+ ",'"	+	expression.getStatus()			+	"'"
						+ ",'"	+	expression.getCreateUser()		+	"'"
						+ ",'"	+	expression.getCreateTimestamp()	+	"'"
						+ ",'"	+	expression.getModifyUser()		+	"'"
						+ ",'"	+	expression.getModifyTimestamp()	+	"'"
						+ ")";

			return template.update(sql);
	
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public int update(ExpressionBean expression){
	
		String sql =
			
			" UPDATE EXPRESSION_TABLE " 		+
			
			"    SET SCREEN_NAME 		= '" 	+ expression.getScreenName() 		+	"'"	+
			"      , FIELD_NAME 		= '"  	+ expression.getFieldName()			+	"'"	+
			"      , FIELD_VALUE 		= '"  	+ expression.getFieldValue()		+	"'"	+
			"      , EXPRESSION			= '" 	+ expression.getExpression()  		+	"'"	+
			"      , RATING				= '" 	+ expression.getRating()  			+	"'"	+
			"      , DEFAULT_VALUE		= '" 	+ expression.getDefaultValue()  	+	"'"	+
			"      , STATUS				= '" 	+ expression.getStatus()  			+	"'"	+
			"      , MODIFY_USER		= '" 	+ expression.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ expression.getModifyTimestamp()  	+	"'"	+	
			
			"  WHERE ID 				= "		+ expression.getId()				+ 	"";
	
		return template.update(sql);
	
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public int delete(int id){
	
		String sql =
			
				" DELETE FROM EXPRESSION_TABLE "
						+ "WHERE ID = "
						+ id
						+ "";
	
		return template.update(sql);
	
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public ExpressionBean selectExpressionById(int id){
	
		String sql 
	
			= "SELECT * "
			+ "  FROM EXPRESSION_TABLE "
			+ " WHERE ID = ?";
	
		return template.queryForObject( sql
								      , new Object[]{id}
								  	  , new BeanPropertyRowMapper<ExpressionBean>(ExpressionBean.class));
	
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public String selectExpressionByScreenField(ExpressionBean expressionBean) {
	
		System.out.println("ExpressionDaoImpl --> Entering selectExpressionByScreenField() Method");
		
		String screen 		= expressionBean.getScreenName();
		String fieldName 	= expressionBean.getFieldName();
		
		System.out.println("Screen     = " + screen);
		System.out.println("Field Name = " + fieldName);
		
		String sql 
	
			= "SELECT EXPRESSION "
			+ "  FROM EXPRESSION_TABLE   "
			+ " WHERE SCREEN_NAME 	= ?  "
			+ "   AND FIELD_NAME    = ?  ";
		
		System.out.println("hello 0");
		
		String expression =  template.queryForObject( sql
								              		, new Object[]{screen,fieldName}
								  	          		, new BeanPropertyRowMapper<String>(String.class));
		
		System.out.println("hello 1 = " + expression);
		
		System.out.println("ExpressionDaoImpl --> Exiting selectExpressionByScreenField() Method");
		
		return expression;
		
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public List<ExpressionBean> select(){
	
		return template.query( "SELECT * FROM EXPRESSION_TABLE WHERE ID < 11 "
						 ,new RowMapper<ExpressionBean>(){
		
							 public ExpressionBean mapRow(ResultSet rs, int row) throws SQLException {
			
								 ExpressionBean expression = new ExpressionBean();
			
								 expression.setId				(rs.getInt(1));
								 expression.setScreenName		(rs.getString(2));
								 expression.setFieldName		(rs.getString(3));
								 expression.setFieldValue		(rs.getString(4));
								 expression.setExpression		(rs.getString(5));
								 expression.setRating			(rs.getInt(6));
								 expression.setDefaultValue		(rs.getString(7));
								 expression.setStatus			(rs.getInt(8));
								 expression.setCreateUser		(rs.getString(9));
								 expression.setCreateTimestamp	(rs.getTimestamp(10));
								 expression.setModifyUser		(rs.getString(11));
								 expression.setModifyTimestamp	(rs.getTimestamp(12));
			
								 return expression;
			
							 }
							 
						 });
		
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	@Override
	public boolean validateScreenField(ExpressionBean expressionIn, String value) {
	
		System.out.println("ExpressionHelpDaoImpl --> Entering validateScreenField() Method");
	
		String expressionSelect = selectExpressionByScreenField(expressionIn);
		
		if(expressionSelect == null) {
			return false;
		}
		
		Pattern pattern = Pattern.compile(expressionSelect); 
		Matcher matcher = pattern.matcher(value);
		System.out.println("ExpressionHelpDaoImpl --> Exiting validateScreenField() Method: " + matcher.matches());
		return matcher.matches();
	
	}
	/***********************************************************************************/
	/***********************************************************************************/		
	public void display (ExpressionBean expressionBean) {
	
		System.out.println("ExpressionDaoImpl ---> ID  				= " + expressionBean.getId() 				);
		System.out.println("ExpressionDaoImpl ---> Screen Name 		= " + expressionBean.getScreenName()		);
		System.out.println("ExpressionDaoImpl ---> Field Name 		= " + expressionBean.getFieldName()			);
		System.out.println("ExpressionDaoImpl ---> Expression 		= " + expressionBean.getExpression()		);
		System.out.println("ExpressionDaoImpl ---> Rating 			= " + expressionBean.getRating()			);
		System.out.println("ExpressionDaoImpl ---> Default Value	= " + expressionBean.getDefaultValue() 		);
		System.out.println("ExpressionDaoImpl ---> Status 			= " + expressionBean.getStatus()			);
		System.out.println("ExpressionDaoImpl ---> Create User 		= " + expressionBean.getCreateUser()		);
		System.out.println("ExpressionDaoImpl ---> Create Timestamp = " + expressionBean.getCreateTimestamp()	);
		System.out.println("ExpressionDaoImpl ---> Modify User 		= " + expressionBean.getModifyUser()		);
		System.out.println("ExpressionDaoImpl ---> Modify Timestamp = " + expressionBean.getModifyTimestamp()	);
	
	}

}

