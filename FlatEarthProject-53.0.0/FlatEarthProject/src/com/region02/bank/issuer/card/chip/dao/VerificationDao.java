package com.region02.bank.issuer.card.chip.dao;

import java.util.List;

import com.region02.bank.issuer.card.chip.model.VerificationBean;

public interface VerificationDao {

	public int insert(VerificationBean verification);
	public int update(VerificationBean verification);
	public int delete(int id);
	public VerificationBean selectVerificationById(int id);
	public List<VerificationBean> select();

}
