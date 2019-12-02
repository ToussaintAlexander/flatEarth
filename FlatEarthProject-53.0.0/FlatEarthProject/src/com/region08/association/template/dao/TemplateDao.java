package com.region08.association.template.dao;

import java.util.List;

import com.region08.association.template.model.TemplateBean;

public interface TemplateDao {

	public int insert(TemplateBean template);
	public int update(TemplateBean template);
	public int delete(int id);
	public TemplateBean selectTemplatesById(int id);
	public List<TemplateBean> select();

}
