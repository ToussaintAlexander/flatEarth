package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.ProcessingImpactBean;

public interface ProcessingImpactDao {

	public int insert(ProcessingImpactBean processing);
	public int update(ProcessingImpactBean processing);
	public int delete(int id);
	public ProcessingImpactBean selectProcessingImpactById(int id);
	public List<ProcessingImpactBean> select();

}
