package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.RegionImpactBean;

public interface RegionImpactDao {

	public int insert(RegionImpactBean region);
	public int update(RegionImpactBean region);
	public int delete(int id);
	public RegionImpactBean selectRegionImpactById(int id);
	public List<RegionImpactBean> select();

}
