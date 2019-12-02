package com.region09.processor.issuer.engine.dao;

import java.util.List;

import com.region09.processor.issuer.engine.model.EngineBean;

public interface EngineDao {

	public int insert(EngineBean engine);
	public int update(EngineBean engine);
	public int delete(int id);
	public EngineBean selectEngineById(int id);
	public List<EngineBean> select();

}
