package com.system.configuration.properties.dao;

import java.util.List;

import com.system.configuration.properties.model.FilePropertiesBean;

public interface FilePropertiesDao {

	public int insert(FilePropertiesBean fileProperties);
	public int update(FilePropertiesBean fileProperties);
	public int delete(int id);
	public FilePropertiesBean selectFilePropertiesById(int id);
	public List<FilePropertiesBean> select();

}
