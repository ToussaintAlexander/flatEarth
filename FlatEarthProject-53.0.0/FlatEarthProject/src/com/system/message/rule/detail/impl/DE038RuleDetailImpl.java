package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE038RuleDetail;

public class DE038RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE038RuleDetail {

	public DE038RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE038RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
