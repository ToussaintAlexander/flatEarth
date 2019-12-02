package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE035RuleHeader;

public class DE035RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE035RuleHeader {

	public DE035RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE035RuleHeaderImpl() {}

}		
