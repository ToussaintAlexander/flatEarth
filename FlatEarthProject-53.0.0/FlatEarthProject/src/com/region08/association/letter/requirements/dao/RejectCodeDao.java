package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.RejectCodeBean;

public interface RejectCodeDao {

	public int insert(RejectCodeBean rejectCode);
	public int update(RejectCodeBean rejectCode);
	public int delete(int field, int subfield, int sequence);
	public RejectCodeBean selectRejectCodeById(int id);
	public List<RejectCodeBean> select();

}
