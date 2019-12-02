package com.system.message.rule.detail.impl;

import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.base.rule.detail.DataElementRuleDetailImpl;
import com.system.message.rule.detail.DE018RuleDetail;

public class DE018RuleDetailImpl extends DataElementRuleDetailImpl implements DataElementRuleDetail, DE018RuleDetail {

	public DE018RuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE018RuleDetailImpl() {}
	
	/***************************************************************
	 ***************************************************************
	 */

}		
