package com.system.message.base.rule.detail;

import java.util.List;

public abstract interface DataElementRuleDetail {

	public abstract int getId();
	public abstract void setId(int id);

	public abstract List<DataElementRuleDetailField> getStorage();
	public abstract void setStorage(List<DataElementRuleDetailField> storage);
	
}
