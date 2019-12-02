package com.system.message.base.rule.header;

import java.util.List;

public abstract interface DataElementRuleHeader {

	public abstract int getId();  
	public abstract void setId(int id); 
	
	public abstract List<DataElementRuleHeaderField> getStorage();  
	public abstract void setStorage(List<DataElementRuleHeaderField> storage);
	
}
