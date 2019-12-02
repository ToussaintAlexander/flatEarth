package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.ProcessorImpactBean;

public interface ProcessorImpactDao {

	public int insert(ProcessorImpactBean processor);
	public int update(ProcessorImpactBean processor);
	public int delete(int id);
	public ProcessorImpactBean selectProcessorImpactById(int id);
	public List<ProcessorImpactBean> select();

}
