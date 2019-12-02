package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE024RuleDetail;

public class DE024RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail,DE024RuleDetail {

	public DE024RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE024RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
