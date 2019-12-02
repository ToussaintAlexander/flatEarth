package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE025RuleHeader;

public class DE025RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE025RuleHeader {

	public DE025RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE025RuleHeaderImpl() {}

}		
