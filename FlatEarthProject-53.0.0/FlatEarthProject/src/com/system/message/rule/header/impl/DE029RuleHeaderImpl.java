package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE029RuleHeader;

public class DE029RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE029RuleHeader {

	public DE029RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE029RuleHeaderImpl() {}

}		
