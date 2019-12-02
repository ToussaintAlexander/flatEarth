package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.CoverBean;

public interface CoverDao {

	public int insert(CoverBean cover);
	public int update(CoverBean cover);
	public int delete(int id);
	public CoverBean selectCoverById(int id);
	public List<CoverBean> select();

}
