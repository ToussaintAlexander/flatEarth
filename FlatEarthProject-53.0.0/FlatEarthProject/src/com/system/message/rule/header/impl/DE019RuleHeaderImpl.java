package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE019RuleHeader;

public class DE019RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE019RuleHeader {

	public DE019RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE019RuleHeaderImpl() {}

}		
