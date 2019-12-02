package com.region05.merchant.retailer.invoice.dao;

import java.util.List;

import com.region05.merchant.retailer.invoice.model.InvoicePart1Bean;

public interface InvoicePart1Dao {

	public int insert(InvoicePart1Bean invoicePart1);
	public int update(InvoicePart1Bean invoicePart1);
	public int delete(int id);
	public InvoicePart1Bean selectInvoicePart1ById(int id);
	public List<InvoicePart1Bean> select();
	
}
