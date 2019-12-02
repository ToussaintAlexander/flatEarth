package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.AcronymBean;

public interface AcronymDao {

	public int insert(AcronymBean acronym);
	public int update(AcronymBean acronym);
	public int delete(int id, int sequence);
	public AcronymBean selectAcronymById(int id);
	public List<AcronymBean> select();

}
