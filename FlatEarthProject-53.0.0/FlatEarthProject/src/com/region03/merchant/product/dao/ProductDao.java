package com.region03.merchant.product.dao;

import java.util.List;

import com.region03.merchant.product.model.ProductBean;

public interface ProductDao {

	public int insert(ProductBean product);
	public int update(ProductBean product);
	public int delete(int id);
	public ProductBean selectProductById(int id);
	public List<ProductBean> select();

}
