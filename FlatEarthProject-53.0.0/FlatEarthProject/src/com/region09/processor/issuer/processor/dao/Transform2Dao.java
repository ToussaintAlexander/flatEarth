package com.region09.processor.issuer.processor.dao;

import java.util.List;

import com.region09.processor.issuer.processor.model.transform2Bean;

public interface Transform2Dao {

	public int insert(transform2Bean processor);
	public int update(transform2Bean processor);
	public int delete(int id);
	public transform2Bean selectTransform2ById(int id);
	public List<transform2Bean> select();

}
