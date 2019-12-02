package com.system.message.element.impl;

import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE014;

public class DE014Impl extends DataElementImpl implements DE014 {

	public DE014Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE014Impl() {}
	
}		
