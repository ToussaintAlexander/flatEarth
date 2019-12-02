package com.system.configuration.properties.dao;

import java.util.List;

import com.system.configuration.properties.model.DatabasePropertiesBean;

public interface DatabasePropertiesDao {

	public int insert(DatabasePropertiesBean databaseProperties);
	public int update(DatabasePropertiesBean databaseProperties);
	public int delete(int id);
	public DatabasePropertiesBean selectDatabasePropertiesById(int id);
	public List<DatabasePropertiesBean> select();

}
