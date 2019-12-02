package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.BusinessOverviewBean;

public interface BusinessOverviewDao {

	public int insert(BusinessOverviewBean overview);
	public int update(BusinessOverviewBean overview);
	public int delete(int id);
	public BusinessOverviewBean selectBusinessOverviewById(int id);
	public List<BusinessOverviewBean> select();

}
