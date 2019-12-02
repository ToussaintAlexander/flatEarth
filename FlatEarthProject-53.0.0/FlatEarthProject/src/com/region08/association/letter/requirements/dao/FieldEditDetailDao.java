package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.FieldEditDetailBean;

public interface FieldEditDetailDao {

	public int insert(FieldEditDetailBean fieldEditDetail);
	public int update(FieldEditDetailBean fieldEditDetail);
	public int delete(int id, int sequence);
	public FieldEditDetailBean selectFieldEditDetailById(int id);
	public List<FieldEditDetailBean> select();

}
