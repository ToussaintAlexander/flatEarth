package com.system.message.element.impl;

import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.base.element.DataElementImpl;
import com.system.message.element.DE049;

public class DE049Impl extends DataElementImpl implements DE049 {

	public DE049Impl(int id, List<DataElementField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}

	public DE049Impl() {}
	
}		
