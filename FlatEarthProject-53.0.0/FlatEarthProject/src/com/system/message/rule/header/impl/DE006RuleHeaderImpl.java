package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE006RuleHeader;

public class DE006RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE006RuleHeader {

	public DE006RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE006RuleHeaderImpl() {}
	
}		
