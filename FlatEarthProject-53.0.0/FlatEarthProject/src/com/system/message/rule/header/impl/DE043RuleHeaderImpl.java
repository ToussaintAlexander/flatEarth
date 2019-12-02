package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE043RuleHeader;

public class DE043RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE043RuleHeader {

	public DE043RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE043RuleHeaderImpl() {}

}		
