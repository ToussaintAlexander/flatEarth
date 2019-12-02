package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE014RuleHeader;

public class DE014RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE014RuleHeader {

	public DE014RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE014RuleHeaderImpl() {}

}		