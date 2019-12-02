package com.system.message.element.impl;

import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE002;

public class DE002Impl extends DataElementImpl implements DE002 {

	public DE002Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE002Impl() {}
	
}		
