package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.SubSectionBean;

public interface SubSectionDao {

	public int insert(SubSectionBean subSection);
	public int update(SubSectionBean subSection);
	public int delete(int id);
	public SubSectionBean selectSubSectionById(int id);
	public List<SubSectionBean> select();

}
