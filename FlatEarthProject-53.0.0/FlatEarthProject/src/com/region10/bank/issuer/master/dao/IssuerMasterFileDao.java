package com.region10.bank.issuer.master.dao;

import java.util.List;

import com.region10.bank.issuer.master.model.IssuerMasterFileBean;

public interface IssuerMasterFileDao {

	public int insert(IssuerMasterFileBean file);
	public int update(IssuerMasterFileBean file);
	public int delete(int id);
	public IssuerMasterFileBean selectIssuerMasterFileById(int id);
	public List<IssuerMasterFileBean> select();

}
