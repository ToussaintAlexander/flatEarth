package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE036RuleHeader;

public class DE036RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE036RuleHeader {

	public DE036RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE036RuleHeaderImpl() {}

}		
