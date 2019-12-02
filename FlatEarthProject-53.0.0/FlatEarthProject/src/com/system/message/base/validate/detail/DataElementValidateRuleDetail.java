package com.system.message.base.validate.detail;

import java.util.List;

public abstract interface DataElementValidateRuleDetail {

	public abstract int getId();
	public abstract void setId(int id);

	public abstract List<DataElementValidateRuleDetailField> getStorage();
	public abstract void setStorage(List<DataElementValidateRuleDetailField> storage);
	
}
