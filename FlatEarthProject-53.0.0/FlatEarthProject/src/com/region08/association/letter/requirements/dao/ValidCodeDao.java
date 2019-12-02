package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.ValidCodeBean;

public interface ValidCodeDao {

	public int insert(ValidCodeBean validCode);
	public int update(ValidCodeBean validCode);
	public int delete(int field, int subfield, int sequence);
	public ValidCodeBean selectValidCodeById(int id);
	public List<ValidCodeBean> select();

}
