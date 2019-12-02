package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.DualRuleDetailExplainBean;

public interface DualRuleDetailExplainDao {

	public int insert(DualRuleDetailExplainBean dualRuleDetailExplain);
	public int update(DualRuleDetailExplainBean dualRuleDetailExplain);
	public int delete(int id);
	public DualRuleDetailExplainBean selectDualRuleDetailExplainById(int id);
	public List<DualRuleDetailExplainBean> select();

}
