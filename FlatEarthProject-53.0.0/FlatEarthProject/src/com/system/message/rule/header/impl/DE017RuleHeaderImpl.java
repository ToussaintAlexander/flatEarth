package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE017RuleHeader;

public class DE017RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE017RuleHeader {

	public DE017RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE017RuleHeaderImpl() {}

}		
