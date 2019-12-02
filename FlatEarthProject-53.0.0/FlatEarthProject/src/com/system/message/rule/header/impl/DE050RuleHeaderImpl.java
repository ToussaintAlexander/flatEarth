package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE050RuleHeader;

public class DE050RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE050RuleHeader {

	public DE050RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE050RuleHeaderImpl() {}

}		
