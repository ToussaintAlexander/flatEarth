package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.AppendixBean;

public interface AppendixDao {

	public int insert(AppendixBean appendix);
	public int update(AppendixBean appendix);
	public int delete(int id, int sequence);
	public AppendixBean selectAppendixById(int id, int sequence);
	public List<AppendixBean> select();

}
