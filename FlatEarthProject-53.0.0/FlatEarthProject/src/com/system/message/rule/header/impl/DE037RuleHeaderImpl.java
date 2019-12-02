package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE037RuleHeader;

public class DE037RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE037RuleHeader {

	public DE037RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE037RuleHeaderImpl() {}

}		
