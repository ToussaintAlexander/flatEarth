package com.region09.processor.issuer.knowledge.dao;

import java.util.List;

import com.region09.processor.issuer.knowledge.model.DomesticLimitBean;

public interface DomesticLimitDao {

	public int insert(DomesticLimitBean domesticLimit);
	public int update(DomesticLimitBean domesticLimit);
	public int delete(int id);
	public DomesticLimitBean selectDomesticLimitById(int id);
	public List<DomesticLimitBean> select();

}
