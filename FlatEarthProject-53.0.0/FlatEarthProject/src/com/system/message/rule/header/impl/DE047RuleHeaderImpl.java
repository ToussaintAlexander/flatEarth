package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE047RuleHeader;

public class DE047RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE047RuleHeader {

	public DE047RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE047RuleHeaderImpl() {}

}		
