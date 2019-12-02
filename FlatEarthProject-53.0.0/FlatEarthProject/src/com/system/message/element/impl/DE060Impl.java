package com.system.message.element.impl;

import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE060;

public class DE060Impl extends DataElementImpl implements DE060 {

	public DE060Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE060Impl() {}
	
}		
