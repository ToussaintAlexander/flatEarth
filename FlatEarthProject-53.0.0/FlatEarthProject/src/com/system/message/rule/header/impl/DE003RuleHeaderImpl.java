package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE003RuleHeader;

public class DE003RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE003RuleHeader {

	public DE003RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE003RuleHeaderImpl() {}
	
}		
