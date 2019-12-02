package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE052RuleHeader;

public class DE052RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE052RuleHeader {

	public DE052RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE052RuleHeaderImpl() {}

}		
