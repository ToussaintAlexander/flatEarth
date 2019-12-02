package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE001RuleHeader;

public class DE001RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE001RuleHeader {

	public DE001RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE001RuleHeaderImpl() {}
	
}		
