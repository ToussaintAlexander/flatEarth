package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE002RuleHeader;

public class DE002RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE002RuleHeader {

	public DE002RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE002RuleHeaderImpl() {}
	
}		
