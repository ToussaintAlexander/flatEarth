package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE000RuleDetail;

public class DE000RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE000RuleDetail {

	public DE000RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE000RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
