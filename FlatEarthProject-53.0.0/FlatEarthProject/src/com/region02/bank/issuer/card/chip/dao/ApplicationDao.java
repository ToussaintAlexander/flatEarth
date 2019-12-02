package com.region02.bank.issuer.card.chip.dao;

import java.util.List;

import com.region02.bank.issuer.card.chip.model.ApplicationBean;

public interface ApplicationDao {

	public int insert(ApplicationBean application);
	public int update(ApplicationBean application);
	public int delete(int id);
	public ApplicationBean selectApplicationById(int id);
	public List<ApplicationBean> select();

}
