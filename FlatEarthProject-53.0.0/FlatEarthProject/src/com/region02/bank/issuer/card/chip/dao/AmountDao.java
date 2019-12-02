package com.region02.bank.issuer.card.chip.dao;

import java.util.List;

import com.region02.bank.issuer.card.chip.model.AmountBean;

public interface AmountDao {

	public int insert(AmountBean amount);
	public int update(AmountBean amount);
	public int delete(int id);
	public AmountBean selectAmountById(int id);
	public List<AmountBean> select();

}
