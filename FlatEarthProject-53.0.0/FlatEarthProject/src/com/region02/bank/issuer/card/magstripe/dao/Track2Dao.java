package com.region02.bank.issuer.card.magstripe.dao;

import java.util.List;

import com.region02.bank.issuer.card.magstripe.model.Track2Bean;

public interface Track2Dao {

	public int insert(Track2Bean track);
	public int update(Track2Bean track);
	public int delete(int id);
	public Track2Bean selectTrackById(int id);
	public List<Track2Bean> select();

}
