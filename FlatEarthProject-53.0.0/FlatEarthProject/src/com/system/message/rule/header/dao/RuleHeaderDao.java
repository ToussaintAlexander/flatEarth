package com.system.message.rule.header.dao;

import java.util.List;

import com.system.message.rule.header.model.RuleHeaderBean;

public interface RuleHeaderDao {

	public int insert(RuleHeaderBean ruleHeader);
	public int update(RuleHeaderBean ruleHeader);
	public int delete(int id);
	public RuleHeaderBean selectRuleHeaderById(int id);
	public List<RuleHeaderBean> select();

}
