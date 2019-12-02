package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE013RuleHeader;

public class DE013RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE013RuleHeader {

	public DE013RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE013RuleHeaderImpl() {}

}		
