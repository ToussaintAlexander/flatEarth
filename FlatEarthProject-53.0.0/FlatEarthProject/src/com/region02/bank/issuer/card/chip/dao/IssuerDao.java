package com.region02.bank.issuer.card.chip.dao;

import java.util.List;

import com.region02.bank.issuer.card.chip.model.IssuerBean;

public interface IssuerDao {

	public int insert(IssuerBean issuer);
	public int update(IssuerBean issuer);
	public int delete(int id);
	public IssuerBean selectIssuerById(int id);
	public List<IssuerBean> select();

}
