package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE004RuleDetail;

public class DE004RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail, DE004RuleDetail {

	public DE004RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE004RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

	
}		
