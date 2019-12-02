package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE039RuleHeader;

public class DE039RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE039RuleHeader {

	public DE039RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE039RuleHeaderImpl() {}

}		
