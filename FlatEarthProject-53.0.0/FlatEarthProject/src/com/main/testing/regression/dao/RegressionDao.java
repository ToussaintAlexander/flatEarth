package com.main.testing.regression.dao;

import java.util.List;

import com.main.testing.regression.model.RegressionBean;

public interface RegressionDao {

	public int insert(RegressionBean regression);
	public int update(RegressionBean regression);
	public int delete(int id);
	public RegressionBean selectRegressionById(int id);
	public List<RegressionBean> select();
	
}
