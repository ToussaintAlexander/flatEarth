package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE038RuleHeader;

public class DE038RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE038RuleHeader {

	public DE038RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE038RuleHeaderImpl() {}

}		
