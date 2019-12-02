package com.system.message.element.impl;

import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE025;

public class DE025Impl extends DataElementImpl implements DE025 {

	public DE025Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE025Impl() {}
	
}		
