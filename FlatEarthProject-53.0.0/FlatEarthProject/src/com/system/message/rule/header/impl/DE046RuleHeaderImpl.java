package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE046RuleHeader;

public class DE046RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE046RuleHeader {

	public DE046RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE046RuleHeaderImpl() {}

}		
