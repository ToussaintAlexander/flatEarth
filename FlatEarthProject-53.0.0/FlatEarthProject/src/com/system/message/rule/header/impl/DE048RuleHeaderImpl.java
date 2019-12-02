package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE048RuleHeader;

public class DE048RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE048RuleHeader {

	public DE048RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE048RuleHeaderImpl() {}

}		
