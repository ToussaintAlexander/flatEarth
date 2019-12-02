package com.system.language.code.dao;

import java.util.List;

import com.system.message.utilties.message.CodeBean;

public interface CodeDao {

	public int insert(CodeBean code);
	public int update(CodeBean code);
	public int delete(int id);
	public CodeBean selectCodeById(int id);
	public List<CodeBean> select();

}
