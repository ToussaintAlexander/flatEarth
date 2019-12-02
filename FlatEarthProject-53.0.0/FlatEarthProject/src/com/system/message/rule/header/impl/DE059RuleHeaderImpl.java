package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE059RuleHeader;

public class DE059RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE059RuleHeader {

	public DE059RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE059RuleHeaderImpl() {}

}		
