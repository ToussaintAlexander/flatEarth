package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE042RuleHeader;

public class DE042RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE042RuleHeader {

	public DE042RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE042RuleHeaderImpl() {}

}		
