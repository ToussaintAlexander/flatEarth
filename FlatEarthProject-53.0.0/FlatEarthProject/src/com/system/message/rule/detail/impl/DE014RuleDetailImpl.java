package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE014RuleDetail;

public class DE014RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE014RuleDetail {

	public DE014RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE014RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
