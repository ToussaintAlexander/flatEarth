package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE049RuleHeader;

public class DE049RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE049RuleHeader {

	public DE049RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE049RuleHeaderImpl() {}

}		
