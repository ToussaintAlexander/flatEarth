package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE011RuleHeader;

public class DE011RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE011RuleHeader {

	public DE011RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE011RuleHeaderImpl() {}

}		
