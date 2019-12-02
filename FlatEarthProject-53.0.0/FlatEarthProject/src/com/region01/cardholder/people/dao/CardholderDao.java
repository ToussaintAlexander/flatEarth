package com.region01.cardholder.people.dao;

import java.util.List;

import com.region01.cardholder.people.model.CardholderBean;

public interface CardholderDao {

	public int insert(CardholderBean cardholder);
	public int update(CardholderBean cardholder);
	public int delete(int id);
	public CardholderBean selectCardholderById(int id);
	public List<CardholderBean> select(int x, int y);

}
