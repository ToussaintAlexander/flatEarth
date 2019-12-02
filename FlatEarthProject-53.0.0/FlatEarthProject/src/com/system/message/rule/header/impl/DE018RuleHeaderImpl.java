package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE018RuleHeader;

public class DE018RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE018RuleHeader {

	public DE018RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE018RuleHeaderImpl() {}

}		
