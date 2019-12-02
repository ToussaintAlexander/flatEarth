package com.system.language.expression.model;

import java.sql.Timestamp;

/**
 * @author TOALEXANDER
 *
 */
public class ExpressionBean {

	private int 		id;						 
	private String 		screenName;			 
	private String 		fieldName;			 
	private String 		fieldValue;			 
	private String 		expression;	
	private int			rating;
	private String 		defaultValue;	
	private int			status;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;	 
	
	public ExpressionBean () {}
	
	public ExpressionBean (ExpressionBean expressionBean) {
		
		 this.id 				= expressionBean.getId();
		 this.screenName 		= expressionBean.getScreenName();
		 this.fieldName 		= expressionBean.getFieldName();
		 this.fieldValue 		= expressionBean.getFieldValue();
		 this.expression 		= expressionBean.getExpression();
		 this.rating 			= expressionBean.getRating();
		 this.defaultValue 		= expressionBean.getDefaultValue();
		 this.status 			= expressionBean.getStatus();
		 this.createUser 		= expressionBean.getCreateUser();
		 this.createTimestamp 	= expressionBean.getCreateTimestamp();
		 this.modifyUser 		= expressionBean.getModifyUser();
		 this.modifyTimestamp	= expressionBean.getModifyTimestamp();
	}
	
	public ExpressionBean (
							 int		id
			  				,String 	screenName 
			  				,String 	fieldName 
			  				,String		fieldValue
			  				,String 	expression 
			  				,int		rating
			  				,String		defaultValue
			  				,boolean	status
			  				,String 	createUser 
			  				,Timestamp 	createTimestamp 
			  				,String 	modifyUser 
			  				,Timestamp 	modifyTimestamp 
							) {
			 this.id				= id;
			 this.screenName 		= screenName;
			 this.fieldName 		= fieldName;
			 this.fieldValue		= fieldValue;
			 this.expression 		= expression;
			 this.rating			= rating;
			 this.defaultValue		= defaultValue;
			 this.createUser 		= createUser;
			 this.createTimestamp	= createTimestamp;
			 this.modifyUser 		= modifyUser;
			 this.modifyTimestamp	= modifyTimestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}