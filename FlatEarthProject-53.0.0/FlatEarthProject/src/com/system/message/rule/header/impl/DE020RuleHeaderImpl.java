package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE020RuleHeader;

public class DE020RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE020RuleHeader {

	public DE020RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE020RuleHeaderImpl() {}

}		
