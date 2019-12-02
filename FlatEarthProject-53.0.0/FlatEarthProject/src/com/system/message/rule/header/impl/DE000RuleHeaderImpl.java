package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE000RuleHeader;

public class DE000RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE000RuleHeader {

	public DE000RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE000RuleHeaderImpl() {}

}		
