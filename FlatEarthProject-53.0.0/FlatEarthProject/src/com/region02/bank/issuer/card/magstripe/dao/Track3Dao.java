package com.region02.bank.issuer.card.magstripe.dao;

import java.util.List;

import com.region02.bank.issuer.card.magstripe.model.Track3Bean;

public interface Track3Dao {

	public int insert(Track3Bean track);
	public int update(Track3Bean track);
	public int delete(int id);
	public Track3Bean selectTrackById(int id);
	public List<Track3Bean> select();

}
