package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.LetterBean;

public interface LetterDao {

	public int insert(LetterBean letter);
	public int update(LetterBean letter);
	public int delete(int id);
	public LetterBean selectLetterById(int id);
	public List<LetterBean> select();

}
