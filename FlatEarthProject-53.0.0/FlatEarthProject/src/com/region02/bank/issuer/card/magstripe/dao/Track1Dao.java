package com.region02.bank.issuer.card.magstripe.dao;

import java.util.List;

import com.region02.bank.issuer.card.magstripe.model.Track1Bean;

public interface Track1Dao {

	public int insert(Track1Bean track);
	public int update(Track1Bean track);
	public int delete(int id);
	public Track1Bean selectTrackById(int id);
	public List<Track1Bean> select();

}
