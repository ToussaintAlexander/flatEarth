package com.region02.bank.issuer.card.chipcard.dao;

import java.util.List;

import com.region02.bank.issuer.card.chipcard.model.ChipCardBean;

public interface ChipCardDao {

	public int insert(ChipCardBean chipCard);
	public int update(ChipCardBean chipCard);
	public int delete(int id);
	public ChipCardBean selectChipCardById(int id);
	public List<ChipCardBean> select();

}
