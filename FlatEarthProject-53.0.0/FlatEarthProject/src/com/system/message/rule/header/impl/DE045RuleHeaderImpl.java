package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE045RuleHeader;

public class DE045RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE045RuleHeader {

	public DE045RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE045RuleHeaderImpl() {}

}		
