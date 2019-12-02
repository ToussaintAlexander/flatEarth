package com.system.message.routine.dao;

import java.util.List;

import com.system.message.routine.model.RoutineBean;

public interface RoutineDao {

	public int insert(RoutineBean routine);
	public int update(RoutineBean routine);
	public int delete(int id);
	public RoutineBean selectRoutineById(int id);
	public List<RoutineBean> select();

}
