package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE033RuleHeader;

public class DE033RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE033RuleHeader {

	public DE033RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE033RuleHeaderImpl() {}

}		
