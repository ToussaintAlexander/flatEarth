package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.SingleRuleHeaderExplainBean;

public interface SingleRuleHeaderExplainDao {

	public int insert(SingleRuleHeaderExplainBean singleRuleHeaderExplain);
	public int update(SingleRuleHeaderExplainBean singleRuleHeaderExplain);
	public int delete(int id);
	public SingleRuleHeaderExplainBean selectSingleRuleHeaderExplainById(int id);
	public List<SingleRuleHeaderExplainBean> select();

}
