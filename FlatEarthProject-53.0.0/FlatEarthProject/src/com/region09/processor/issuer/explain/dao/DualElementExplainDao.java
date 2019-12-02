package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.DualElementExplainBean;

public interface DualElementExplainDao {

	public int insert(DualElementExplainBean dualElementExplain);
	public int update(DualElementExplainBean dualElementExplain);
	public int delete(int id);
	public DualElementExplainBean selectDualElementExplainById(int id);
	public List<DualElementExplainBean> select();
	
}
