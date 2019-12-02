package com.system.message.base.rule;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.header.DataElementRuleHeaderField;

public abstract interface DataElementRule {

	public abstract int getId();
	public abstract void setId(int id);

	public abstract DataElementRuleHeaderField getRuleHeaderField();
	public abstract void setRuleHeaderField(DataElementRuleHeaderField ruleHeaderField);

	public abstract List<DataElementRuleDetailField> getRuleDetailField();
	public abstract void setRuleDetailField(List<DataElementRuleDetailField> ruleDetailField);
	
}
