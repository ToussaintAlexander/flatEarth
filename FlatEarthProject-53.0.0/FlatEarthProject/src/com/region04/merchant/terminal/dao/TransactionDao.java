package com.region04.merchant.terminal.dao;

import java.util.List;

import com.region04.merchant.terminal.model.TransactionBean;

public interface TransactionDao {

	public int insert(TransactionBean transaction);
	public int update(TransactionBean transaction);
	public int delete(int id);
	public TransactionBean selectTransactionById(int id);
	public List<TransactionBean> select();

}
