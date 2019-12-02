package com.system.message.base.validate.header;

import java.util.List;

public abstract interface DataElementValidateRuleHeader {

	public abstract int getId();
	public abstract void setId(int id);

	public abstract List<DataElementValidateRuleHeaderField> getStorage();
	public abstract void setStorage(List<DataElementValidateRuleHeaderField> storage);
	
}
