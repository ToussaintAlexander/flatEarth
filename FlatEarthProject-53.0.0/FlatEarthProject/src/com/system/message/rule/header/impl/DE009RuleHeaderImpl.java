package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE009RuleHeader;

public class DE009RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE009RuleHeader {

	public DE009RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE009RuleHeaderImpl() {}
	
}		
