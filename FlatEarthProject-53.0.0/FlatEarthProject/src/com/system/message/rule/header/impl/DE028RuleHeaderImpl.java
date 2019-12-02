package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE028RuleHeader;

public class DE028RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE028RuleHeader {

	public DE028RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE028RuleHeaderImpl() {}

}		
