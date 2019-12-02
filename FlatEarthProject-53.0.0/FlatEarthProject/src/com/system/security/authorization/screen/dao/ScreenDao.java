package com.system.security.authorization.screen.dao;

import java.util.List;

import com.system.security.authorization.screen.model.ScreenBean;

public interface ScreenDao {

	public int insert(ScreenBean screen);
	public int update(ScreenBean screen);
	public int delete(int id);
	public ScreenBean selectScreenById(int id);
	public List<ScreenBean> select();

}
