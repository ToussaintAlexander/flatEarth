package com.system.message.base.rule;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.header.DataElementRuleHeaderField;

public abstract class DataElementRuleImpl implements DataElementRule {

	private int id;
	private DataElementRuleHeaderField ruleHeaderField;
	private List<DataElementRuleDetailField> ruleDetailField;
	
	public DataElementRuleImpl() {}
	
	public DataElementRuleImpl(int id, DataElementRuleHeaderField ruleHeaderField,List<DataElementRuleDetailField> ruleDetailField) {
		super();
		this.id = id;
		this.ruleHeaderField = ruleHeaderField;
		this.ruleDetailField = ruleDetailField;
	}

	/***************************************************************
	 ***************************************************************
	 */	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DataElementRuleHeaderField getRuleHeaderField() {
		return ruleHeaderField;
	}

	public void setRuleHeaderField(DataElementRuleHeaderField ruleHeaderField) {
		this.ruleHeaderField = ruleHeaderField;
	}

	public List<DataElementRuleDetailField> getRuleDetailField() {
		return ruleDetailField;
	}

	public void setRuleDetailField(List<DataElementRuleDetailField> ruleDetailField) {
		this.ruleDetailField = ruleDetailField;
	}

}
