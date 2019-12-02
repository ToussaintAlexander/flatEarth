package com.region09.processor.issuer.knowledge.dao;

import java.util.List;

import com.region09.processor.issuer.knowledge.model.CardVerificationBean;

public interface CardVerificationDao {

	public int insert(CardVerificationBean cardVerification);
	public int update(CardVerificationBean cardVerification);
	public int delete(int id);
	public CardVerificationBean selectCardVerificationById(int id);
	public List<CardVerificationBean> select();

}
