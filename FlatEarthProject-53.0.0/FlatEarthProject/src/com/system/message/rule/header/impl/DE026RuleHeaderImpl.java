package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE026RuleHeader;

public class DE026RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE026RuleHeader {

	public DE026RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE026RuleHeaderImpl() {}

}		
