package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE001RuleDetail;

public class DE001RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE001RuleDetail {

	public DE001RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE001RuleDetailImpl() {}
	
}		
