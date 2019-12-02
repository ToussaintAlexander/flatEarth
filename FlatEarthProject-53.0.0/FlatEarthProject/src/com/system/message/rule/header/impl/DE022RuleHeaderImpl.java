package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE022RuleHeader;

public class DE022RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE022RuleHeader {

	public DE022RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE022RuleHeaderImpl() {}

}		
