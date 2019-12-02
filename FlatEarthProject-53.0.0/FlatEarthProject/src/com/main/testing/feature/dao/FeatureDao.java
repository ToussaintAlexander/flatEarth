package com.main.testing.feature.dao;

import java.util.List;

import com.main.testing.feature.model.FeatureBean;

public interface FeatureDao {

	public int insert(FeatureBean feature);
	public int update(FeatureBean feature);
	public int delete(int id);
	public FeatureBean selectFeatureById(int id);
	public List<FeatureBean> select();
	
}
