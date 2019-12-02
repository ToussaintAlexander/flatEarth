package com.system.message.base.rule.detail;

import java.util.List;

public abstract class DataElementRuleDetailImpl implements DataElementRuleDetail {

	protected int id;
	protected List<DataElementRuleDetailField> storage;
	
	public DataElementRuleDetailImpl() {}
	
	public DataElementRuleDetailImpl(int id, List<DataElementRuleDetailField> storage) {
		super();
		this.id = id;
		this.storage = storage;
	}
	
	/***************************************************************
	 ***************************************************************
	 */	
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public List<DataElementRuleDetailField> getStorage() {
		return storage;
	}
	@Override
	public void setStorage(List<DataElementRuleDetailField> storage) {
		this.storage = storage;
	}

}
