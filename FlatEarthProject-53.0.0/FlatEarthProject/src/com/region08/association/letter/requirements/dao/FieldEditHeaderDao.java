package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.FieldEditHeaderBean;

public interface FieldEditHeaderDao {

	public int insert(FieldEditHeaderBean fieldEditHeader);
	public int update(FieldEditHeaderBean fieldEditHeader);
	public int delete(int id, int sequence);
	public FieldEditHeaderBean selectFieldEditHeaderById(int id);
	public List<FieldEditHeaderBean> select();

}
