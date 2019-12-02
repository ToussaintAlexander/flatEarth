package com.region10.bank.issuer.client.dao;

import java.util.List;

import com.region10.bank.issuer.client.model.IssuersBean;

public interface IssuersDao {

	public int insert(IssuersBean issuers);
	public int update(IssuersBean issuers);
	public int delete(int id);
	public IssuersBean selectIssuersById(int id);
	public List<IssuersBean> select();

}
