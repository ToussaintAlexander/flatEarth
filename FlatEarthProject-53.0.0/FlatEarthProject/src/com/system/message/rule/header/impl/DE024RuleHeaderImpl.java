package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE024RuleHeader;

public class DE024RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE024RuleHeader {

	public DE024RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE024RuleHeaderImpl() {}

}		
