package com.region04.merchant.terminal.dao;

import java.util.List;

import com.region04.merchant.terminal.model.TerminalBean;

public interface TerminalDao {

	public int insert(TerminalBean terminal);
	public int update(TerminalBean terminal);
	public int delete(int id);
	public TerminalBean selectTerminalById(int id);
	public List<TerminalBean> select();

}
