package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE058RuleHeader;

public class DE058RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE058RuleHeader {

	public DE058RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE058RuleHeaderImpl() {}

}		
