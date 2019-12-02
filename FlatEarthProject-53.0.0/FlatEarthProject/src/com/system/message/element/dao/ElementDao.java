package com.system.message.element.dao;

import java.util.List;

import com.system.message.element.model.ElementBean;

public interface ElementDao {

	public int insert(ElementBean element);
	public int update(ElementBean element);
	public int delete(int id);
	public ElementBean selectElementById(int id);
	public List<ElementBean> select();

}
