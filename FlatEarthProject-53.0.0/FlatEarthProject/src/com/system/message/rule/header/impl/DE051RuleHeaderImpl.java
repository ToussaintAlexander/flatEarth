package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE051RuleHeader;

public class DE051RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE051RuleHeader {

	public DE051RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE051RuleHeaderImpl() {}

}		
