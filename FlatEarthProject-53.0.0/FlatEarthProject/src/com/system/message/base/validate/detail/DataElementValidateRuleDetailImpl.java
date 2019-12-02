package com.system.message.base.validate.detail;

import java.util.List;

public abstract class DataElementValidateRuleDetailImpl implements DataElementValidateRuleDetail {

	protected int id;
	protected List<DataElementValidateRuleDetailField> storage;
	
	public DataElementValidateRuleDetailImpl() {}
	
	public DataElementValidateRuleDetailImpl(int id, List<DataElementValidateRuleDetailField> storage) {
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
	public List<DataElementValidateRuleDetailField> getStorage() {
		return storage;
	}
	@Override
	public void setStorage(List<DataElementValidateRuleDetailField> storage) {
		this.storage = storage;
	}

}
