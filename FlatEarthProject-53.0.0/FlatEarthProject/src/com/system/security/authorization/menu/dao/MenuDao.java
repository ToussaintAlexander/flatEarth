package com.system.security.authorization.menu.dao;

import java.util.List;

import com.system.security.authorization.menu.model.MenuBean;

public interface MenuDao {

	public int insert(MenuBean menu);
	public int update(MenuBean menu);
	public int delete(int id);
	public MenuBean selectMenuById(int id);
	public List<MenuBean> selectChildMenuByParentMenu(String parentMenu);
	public List<MenuBean> select();

}
