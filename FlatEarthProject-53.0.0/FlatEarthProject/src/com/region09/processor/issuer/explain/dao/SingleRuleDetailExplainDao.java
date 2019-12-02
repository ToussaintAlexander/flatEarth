package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.SingleRuleDetailExplainBean;

public interface SingleRuleDetailExplainDao {

	public int insert(SingleRuleDetailExplainBean singleDetail);
	public int update(SingleRuleDetailExplainBean singleDetail);
	public int delete(int id);
	public SingleRuleDetailExplainBean selectSingleRuleDetailExplainById(int id);
	public List<SingleRuleDetailExplainBean> select();

}
