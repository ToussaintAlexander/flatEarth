package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.PlatformImpactBean;

public interface PlatformImpactDao {

	public int insert(PlatformImpactBean platform);
	public int update(PlatformImpactBean platform);
	public int delete(int id);
	public PlatformImpactBean selectPlatformImpactById(int id);
	public List<PlatformImpactBean> select();

}
