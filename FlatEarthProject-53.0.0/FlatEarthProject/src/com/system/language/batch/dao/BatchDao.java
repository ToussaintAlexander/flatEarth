package com.system.language.batch.dao;

import java.util.List;

import com.system.language.batch.model.BatchBean;

public interface BatchDao {

	public int insert(BatchBean batch);
	public int update(BatchBean batch);
	public int delete(int id);
	public BatchBean selectBatchById(int id);
	public List<BatchBean> select();

}
