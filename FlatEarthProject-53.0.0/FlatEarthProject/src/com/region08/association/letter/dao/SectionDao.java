package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.SectionBean;

public interface SectionDao {

	public int insert(SectionBean section);
	public int update(SectionBean section);
	public int delete(int id);
	public SectionBean selectSectionById(int id);
	public List<SectionBean> select();

}
