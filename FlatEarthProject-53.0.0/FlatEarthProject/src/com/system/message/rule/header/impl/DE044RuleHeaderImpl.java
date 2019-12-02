package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE044RuleHeader;

public class DE044RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE044RuleHeader {

	public DE044RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE044RuleHeaderImpl() {}

}		
