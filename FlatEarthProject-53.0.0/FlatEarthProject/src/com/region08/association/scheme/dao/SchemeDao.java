package com.region08.association.scheme.dao;

import java.util.List;

import com.region08.association.scheme.model.SchemeBean;

public interface SchemeDao {

	public int insert(SchemeBean scheme);
	public int update(SchemeBean scheme);
	public int delete(int id);
	public SchemeBean selectSchemeById(int id);
	public List<SchemeBean> select();

}
