package com.region09.processor.issuer.editor.dao;

import java.util.List;

import com.region09.processor.issuer.editor.model.RuleHeaderEditorBean;

public interface RuleHeaderEditorDao {

	public int insert(RuleHeaderEditorBean ruleHeaderEditorScreen);
	public int update(RuleHeaderEditorBean ruleHeaderEditorScreen);
	public int delete(int id);
	public RuleHeaderEditorBean selectRuleHeaderEditorById(int id);
	public List<RuleHeaderEditorBean> select();

}
