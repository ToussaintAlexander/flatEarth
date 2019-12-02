package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE032RuleHeader;

public class DE032RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE032RuleHeader {

	public DE032RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE032RuleHeaderImpl() {}

}		
