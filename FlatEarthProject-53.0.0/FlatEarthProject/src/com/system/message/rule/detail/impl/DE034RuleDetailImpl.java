package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE034RuleDetail;

public class DE034RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE034RuleDetail {

	public DE034RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE034RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
