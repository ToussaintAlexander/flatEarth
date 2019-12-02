package com.system.message.rule.header.impl;

import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.base.rule.header.DataElementRuleHeaderImpl;
import com.system.message.rule.header.DE063RuleHeader;

public class DE063RuleHeaderImpl extends DataElementRuleHeaderImpl implements DE063RuleHeader {

	public DE063RuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE063RuleHeaderImpl() {}

}		
