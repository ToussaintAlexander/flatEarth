package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.SystemImpactBean;

public interface SystemImpactDao {

	public int insert(SystemImpactBean systemImpact);
	public int update(SystemImpactBean systemImpact);
	public int delete(int id);
	public SystemImpactBean selectSystemImpactById(int id);
	public List<SystemImpactBean> select();

}
