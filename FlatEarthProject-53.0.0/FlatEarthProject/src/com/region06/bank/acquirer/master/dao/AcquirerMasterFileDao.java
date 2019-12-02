package com.region06.bank.acquirer.master.dao;

import java.util.List;

import com.region06.bank.acquirer.master.model.AcquirerMasterFileBean;

public interface AcquirerMasterFileDao {

	public int insert(AcquirerMasterFileBean file);
	public int update(AcquirerMasterFileBean file);
	public int delete(int id);
	public AcquirerMasterFileBean selectAcquirerMasterFileById(int id);
	public List<AcquirerMasterFileBean> select();

}
