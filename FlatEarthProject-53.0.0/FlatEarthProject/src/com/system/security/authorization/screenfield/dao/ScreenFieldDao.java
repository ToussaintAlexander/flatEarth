package com.system.security.authorization.screenfield.dao;

import java.util.List;

import com.system.security.authorization.screenfield.model.ScreenFieldBean;

public interface ScreenFieldDao {

	public int insert(ScreenFieldBean field);
	public int update(ScreenFieldBean field);
	public int delete(int id);
	public ScreenFieldBean selectFieldById(int id);
	public List<ScreenFieldBean> select();

}
