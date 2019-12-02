package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE005RuleHeader;

public class DE005RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE005RuleHeader {

	public DE005RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE005RuleHeaderImpl() {}
	
}		
