package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE064RuleHeader;

public class DE064RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE064RuleHeader {

	public DE064RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE064RuleHeaderImpl() {}

}		
