package com.region04.merchant.terminal.dao;

import java.util.List;

import com.region04.merchant.terminal.model.CurrencyBean;

public interface CurrencyDao {

	public int insert(CurrencyBean currency);
	public int update(CurrencyBean currency);
	public int delete(int id);
	public CurrencyBean selectCurrencyById(int id);
	public List<CurrencyBean> select();

}
