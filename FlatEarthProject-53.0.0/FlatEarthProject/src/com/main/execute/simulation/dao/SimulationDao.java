package com.main.execute.simulation.dao;

import java.util.List;

import com.main.execute.simulation.model.SimulationBean;

public interface SimulationDao {

	public int insert(SimulationBean scheme);
	public int update(SimulationBean scheme);
	public int delete(int id);
	public SimulationBean selectSimulationById(int id);
	public List<SimulationBean> select();
	
}
