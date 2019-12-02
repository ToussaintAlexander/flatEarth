package com.region09.processor.issuer.editor.dao;

import java.util.List;

import com.region09.processor.issuer.editor.model.RuleDetailEditorBean;

public interface RuleDetailEditorDao {

	public int insert(RuleDetailEditorBean ruleDetailEditor);
	public int update(RuleDetailEditorBean ruleDetailEditor);
	public int delete(int id);
	public RuleDetailEditorBean selectRuleDetailEditorById(int id);
	public List<RuleDetailEditorBean> select();

}
