package com.region05.merchant.retailer.invoice.dao;

import java.util.List;

import com.region05.merchant.retailer.invoice.model.InvoicePart3Bean;

public interface InvoicePart3Dao {

	public int insert(InvoicePart3Bean invoicePart3);
	public int update(InvoicePart3Bean invoicePart3);
	public int delete(int id);
	public InvoicePart3Bean selectInvoicePart3ById(int id);
	public List<InvoicePart3Bean> select();
	
}
