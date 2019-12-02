package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE021RuleHeader;

public class DE021RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE021RuleHeader {

	public DE021RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE021RuleHeaderImpl() {}

}		
