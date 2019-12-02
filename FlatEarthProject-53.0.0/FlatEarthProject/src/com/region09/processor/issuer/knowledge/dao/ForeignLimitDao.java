package com.region09.processor.issuer.knowledge.dao;

import java.util.List;

import com.region09.processor.issuer.knowledge.model.ForeignLimitBean;

public interface ForeignLimitDao {

	public int insert(ForeignLimitBean foreignLimit);
	public int update(ForeignLimitBean foreignLimit);
	public int delete(int id);
	public ForeignLimitBean selectForeignLimitById(int id);
	public List<ForeignLimitBean> select();

}
