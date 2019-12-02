package com.system.message.rule.detail.dao;

import java.util.List;

import com.system.message.rule.detail.model.RuleDetailBean;

public interface RuleDetailDao {

	public int insert(RuleDetailBean ruleDetail);
	public int update(RuleDetailBean ruleDetail);
	public int delete(int id);
	public RuleDetailBean selectRuleDetailById(int id);
	public List<RuleDetailBean> select();

}
