package com.system.language.expression.dao;

import java.util.List;

import com.system.language.expression.model.ExpressionBean;

public interface ExpressionDao {

	public int insert(ExpressionBean expression);
	public int update(ExpressionBean expression);
	public int delete(int id);
	public ExpressionBean selectExpressionById(int id);
	public String selectExpressionByScreenField(ExpressionBean expressionBean);
	public List<ExpressionBean> select();
	
	public boolean validateScreenField(ExpressionBean expression, String string);

}
