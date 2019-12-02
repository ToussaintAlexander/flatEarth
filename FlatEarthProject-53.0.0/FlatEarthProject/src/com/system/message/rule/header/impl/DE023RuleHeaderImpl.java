package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE023RuleHeader;

public class DE023RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE023RuleHeader {

	public DE023RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE023RuleHeaderImpl() {}

}		
