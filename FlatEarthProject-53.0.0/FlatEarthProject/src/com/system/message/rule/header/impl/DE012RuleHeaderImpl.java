package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE012RuleHeader;

public class DE012RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE012RuleHeader {

	public DE012RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE012RuleHeaderImpl() {}

}		
