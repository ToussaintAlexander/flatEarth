package com.region06.bank.acquirer.client.dao;

import java.util.List;

import com.region06.bank.acquirer.client.model.AcquirerBean;

public interface AcquirerDao {

	public int insert(AcquirerBean acquirer);
	public int update(AcquirerBean acquirer);
	public int delete(int id);
	public AcquirerBean selectAcquirerById(int id);
	public List<AcquirerBean> select();

}
