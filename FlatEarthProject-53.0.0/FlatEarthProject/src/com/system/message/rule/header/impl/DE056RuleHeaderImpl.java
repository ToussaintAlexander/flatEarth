package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE056RuleHeader;

public class DE056RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE056RuleHeader {

	public DE056RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE056RuleHeaderImpl() {}

}		
