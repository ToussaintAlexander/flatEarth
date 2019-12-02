package com.system.message.validate.header.dao;

import java.util.List;

import com.system.message.validate.header.model.ValidateHeaderBean;

public interface ValidateHeaderDao {

	public int insert(ValidateHeaderBean validateHeader);
	public int update(ValidateHeaderBean validateHeader);
	public int delete(int id);
	public ValidateHeaderBean selectValidateHeaderById(int id);
	public List<ValidateHeaderBean> select();

}
