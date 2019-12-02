package com.system.message.base.rule.header;

import java.util.List;

public abstract class DataElementRuleHeaderImpl implements DataElementRuleHeader {

	protected int id;
	protected List<DataElementRuleHeaderField> storage;
	
	public DataElementRuleHeaderImpl() {}
	
	public DataElementRuleHeaderImpl(int id, List<DataElementRuleHeaderField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}
	/*******************************************************************
	 * *****************************************************************
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<DataElementRuleHeaderField> getStorage() {
		return storage;
	}

	public void setStorage(List<DataElementRuleHeaderField> storage) {
		this.storage = storage;
	}
	
}
