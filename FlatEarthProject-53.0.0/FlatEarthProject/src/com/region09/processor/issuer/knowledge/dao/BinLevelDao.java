package com.region09.processor.issuer.knowledge.dao;

import java.util.List;

import com.region09.processor.issuer.knowledge.model.BinLevelBean;

public interface BinLevelDao {

	public int insert(BinLevelBean binLevel);
	public int update(BinLevelBean binLevel);
	public int delete(int id);
	public BinLevelBean selectBinLevelById(int id);
	public List<BinLevelBean> select();

}
