package com.region07.processor.acquirer.processor.dao;

import java.util.List;

import com.region07.processor.acquirer.processor.model.transform1Bean;

public interface Transform1Dao {

	public int insert(transform1Bean processor);
	public int update(transform1Bean processor);
	public int delete(int id);
	public transform1Bean selectTransform1ById(int id);
	public List<transform1Bean> select();

}
