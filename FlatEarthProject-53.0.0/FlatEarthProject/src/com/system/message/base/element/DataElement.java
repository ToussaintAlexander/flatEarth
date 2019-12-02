package com.system.message.base.element;

import java.util.List;

public abstract interface DataElement {

	public int getId();
	public void setId(int id);
	
	public abstract List<DataElementField> getStorage();
	public abstract void setStorage(List<DataElementField> storage);
		
}
