package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE031RuleHeader;

public class DE031RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE031RuleHeader {

	public DE031RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE031RuleHeaderImpl() {}

}		
