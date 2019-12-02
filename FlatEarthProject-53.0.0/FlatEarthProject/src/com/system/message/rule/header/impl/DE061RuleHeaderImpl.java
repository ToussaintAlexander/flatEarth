package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE061RuleHeader;

public class DE061RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE061RuleHeader {

	public DE061RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE061RuleHeaderImpl() {}

}		
