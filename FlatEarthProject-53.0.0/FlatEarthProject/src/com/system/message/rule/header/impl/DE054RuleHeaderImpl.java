package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE054RuleHeader;

public class DE054RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE054RuleHeader {

	public DE054RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE054RuleHeaderImpl() {}

}		
