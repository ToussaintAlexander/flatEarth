package com.system.language.logger.dao;

import java.util.List;

import com.system.language.logger.model.LoggerBean;

public interface LoggerDao  {

	public boolean insert(LoggerBean loggerBean);
	public List<LoggerBean> select();
	public boolean update(LoggerBean loggerBean);
	public boolean delete(int id);
	public LoggerBean selectLoggerById(int id);
}