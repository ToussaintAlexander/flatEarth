package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE030RuleHeader;

public class DE030RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE030RuleHeader {

	public DE030RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE030RuleHeaderImpl() {}

}		
