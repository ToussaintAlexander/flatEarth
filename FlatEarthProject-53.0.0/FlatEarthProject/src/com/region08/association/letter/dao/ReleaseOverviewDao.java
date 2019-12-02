package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.ReleaseOverviewBean;

public interface ReleaseOverviewDao {

	public int insert(ReleaseOverviewBean releaseOverview);
	public int update(ReleaseOverviewBean releaseOverview);
	public int delete(int id, int sequence);
	public ReleaseOverviewBean selectReleaseOverviewById(int id, int sequence);
	public List<ReleaseOverviewBean> select();

}
