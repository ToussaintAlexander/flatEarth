package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE015RuleHeader;

public class DE015RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE015RuleHeader {

	public DE015RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE015RuleHeaderImpl() {}

}		
