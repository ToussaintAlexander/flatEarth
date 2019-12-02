package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE060RuleHeader;

public class DE060RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE060RuleHeader {

	public DE060RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE060RuleHeaderImpl() {}

}		
