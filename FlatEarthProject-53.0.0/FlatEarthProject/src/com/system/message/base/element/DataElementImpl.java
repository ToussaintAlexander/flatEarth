package com.system.message.base.element;

import java.util.List;

public abstract class DataElementImpl implements DataElement {

	protected int id;
	protected List<DataElementField> storage;
	
	public DataElementImpl() {}
	
	public DataElementImpl(int id, List<DataElementField> storage) {
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
	/***************************************************************
	 ***************************************************************
	 */	
	@Override
	public List<DataElementField> getStorage() {
		
		return storage;
		
	}
	@Override
	public void setStorage(List<DataElementField> storage) {
		
		this.storage = storage;
		
	}
	
}
