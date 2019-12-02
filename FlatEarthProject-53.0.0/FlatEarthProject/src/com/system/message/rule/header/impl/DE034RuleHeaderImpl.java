package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE034RuleHeader;

public class DE034RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE034RuleHeader {

	public DE034RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE034RuleHeaderImpl() {}

}		
