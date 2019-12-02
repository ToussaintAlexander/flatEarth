package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.SingleElementExplainBean;

public interface SingleElementExplainDao {

	public int insert(SingleElementExplainBean singleElementExplain);
	public int update(SingleElementExplainBean singleElementExplain);
	public int delete(int id);
	public SingleElementExplainBean selectSingleElementExplainById(int id);
	public List<SingleElementExplainBean> select();

}
