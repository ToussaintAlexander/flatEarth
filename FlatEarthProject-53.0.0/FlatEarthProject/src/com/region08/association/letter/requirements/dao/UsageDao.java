package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.UsageBean;

public interface UsageDao {

	public int insert(UsageBean usage);
	public int update(UsageBean usage);
	public int delete(int id);
	public UsageBean selectUsageById(int id);
	public List<UsageBean> select();

}
