package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE062RuleHeader;

public class DE062RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE062RuleHeader {

	public DE062RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE062RuleHeaderImpl() {}

}		
