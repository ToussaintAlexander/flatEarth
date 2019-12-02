package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE008RuleHeader;

public class DE008RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE008RuleHeader {

	public DE008RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE008RuleHeaderImpl() {}
	
}		
