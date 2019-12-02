package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE057RuleHeader;

public class DE057RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE057RuleHeader {

	public DE057RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE057RuleHeaderImpl() {}

}		
