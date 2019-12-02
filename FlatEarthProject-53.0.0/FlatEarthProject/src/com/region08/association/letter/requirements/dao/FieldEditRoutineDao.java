package com.region08.association.letter.requirements.dao;

import java.util.List;

import com.region08.association.letter.requirements.model.FieldEditRoutineBean;

public interface FieldEditRoutineDao {

	public int insert(FieldEditRoutineBean fieldEditRoutine);
	public int update(FieldEditRoutineBean fieldEditRoutine);
	public int delete(int id, int sequence);
	public FieldEditRoutineBean selectFieldEditRoutineById(int id);
	public List<FieldEditRoutineBean> select();
	
}
