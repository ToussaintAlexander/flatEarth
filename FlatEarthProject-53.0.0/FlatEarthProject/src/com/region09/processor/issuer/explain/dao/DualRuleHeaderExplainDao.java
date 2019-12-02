package com.region09.processor.issuer.explain.dao;

import java.util.List;

import com.region09.processor.issuer.explain.model.DualRuleHeaderExplainBean;

public interface DualRuleHeaderExplainDao {

	public int insert(DualRuleHeaderExplainBean dualRuleHeaderExplain);
	public int update(DualRuleHeaderExplainBean dualRuleHeaderExplain);
	public int delete(int id);
	public DualRuleHeaderExplainBean selectDualRuleHeaderExplainById(int id);
	public List<DualRuleHeaderExplainBean> select();

}
