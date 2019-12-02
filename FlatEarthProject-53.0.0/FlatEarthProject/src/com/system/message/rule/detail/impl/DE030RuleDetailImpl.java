package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE030RuleDetail;

public class DE030RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE030RuleDetail {

	public DE030RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE030RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
