package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE027RuleHeader;

public class DE027RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE027RuleHeader {

	public DE027RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE027RuleHeaderImpl() {}

}		
