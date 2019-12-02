package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE041RuleHeader;

public class DE041RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE041RuleHeader {

	public DE041RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE041RuleHeaderImpl() {}

}		
