package com.system.message.validate.detail.dao;

import java.util.List;

import com.system.message.validate.detail.model.ValidateDetailBean;

public interface ValidateDetailDao {

	public int insert(ValidateDetailBean validateDetail);
	public int update(ValidateDetailBean validateDetail);
	public int delete(int id);
	public ValidateDetailBean selectValidateDetailById(int id);
	public List<ValidateDetailBean> select();

}
