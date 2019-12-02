package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE010RuleHeader;

public class DE010RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE010RuleHeader {

	public DE010RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE010RuleHeaderImpl() {}

}		
