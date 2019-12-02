package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.FieldEditElementBean;

public interface FieldEditElementDao {

	public int insert(FieldEditElementBean fieldEditElement);
	public int update(FieldEditElementBean fieldEditElement);
	public int delete(int id);
	public FieldEditElementBean selectFieldEditElementById(int id);
	public List<FieldEditElementBean> select();

}
