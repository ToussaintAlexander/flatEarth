package com.region02.bank.issuer.card.chip.dao;

import java.util.List;

import com.region02.bank.issuer.card.chip.model.KeysBean;

public interface KeysDao {

	public int insert(KeysBean keys);
	public int update(KeysBean keys);
	public int delete(int id);
	public KeysBean selectKeysById(int id);
	public List<KeysBean> select();

}
