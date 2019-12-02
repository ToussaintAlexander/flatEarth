package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE004RuleHeader;

public class DE004RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE004RuleHeader {

	public DE004RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE004RuleHeaderImpl() {}
	
}		
