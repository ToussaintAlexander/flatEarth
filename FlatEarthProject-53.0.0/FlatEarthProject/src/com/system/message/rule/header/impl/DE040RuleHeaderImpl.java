package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE040RuleHeader;

public class DE040RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE040RuleHeader {

	public DE040RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE040RuleHeaderImpl() {}

}		
