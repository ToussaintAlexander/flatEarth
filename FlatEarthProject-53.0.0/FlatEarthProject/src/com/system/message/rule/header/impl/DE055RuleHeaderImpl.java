package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE055RuleHeader;

public class DE055RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE055RuleHeader {

	public DE055RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE055RuleHeaderImpl() {}

}		
