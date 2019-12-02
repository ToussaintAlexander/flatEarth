package com.system.message.base.validate.header;

import java.util.List;

public abstract class DataElementValidateRuleHeaderImpl implements DataElementValidateRuleHeader {

	protected int id;
	protected List<DataElementValidateRuleHeaderField> storage;
	
	public DataElementValidateRuleHeaderImpl() {}
	
	public DataElementValidateRuleHeaderImpl(int id, List<DataElementValidateRuleHeaderField> storage) {
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
	public List<DataElementValidateRuleHeaderField> getStorage() {
		return storage;
	}
	@Override
	public void setStorage(List<DataElementValidateRuleHeaderField> storage) {
		this.storage = storage;
	}

}
