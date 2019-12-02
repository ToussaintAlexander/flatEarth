package com.region05.merchant.retailer.invoice.dao;

import java.util.List;

import com.region05.merchant.retailer.invoice.model.InvoicePart2Bean;

public interface InvoicePart2Dao {

	public int insert(InvoicePart2Bean invoicePart2);
	public int update(InvoicePart2Bean invoicePart2);
	public int delete(int id);
	public InvoicePart2Bean selectInvoicePart2ById(int id);
	public List<InvoicePart2Bean> select();
	
}
