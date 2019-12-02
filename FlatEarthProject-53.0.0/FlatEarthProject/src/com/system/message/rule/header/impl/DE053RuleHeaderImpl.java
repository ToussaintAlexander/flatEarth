package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE053RuleHeader;

public class DE053RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE053RuleHeader {

	public DE053RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE053RuleHeaderImpl() {}

}		
