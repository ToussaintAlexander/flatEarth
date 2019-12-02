package com.region08.association.report.dao;

import java.util.List;

import com.region08.association.report.model.ReportBean;

public interface ReportDao {

	public int insert(ReportBean acquirer);
	public int update(ReportBean acquirer);
	public int delete(int id);
	public ReportBean selectReportById(int id);
	public List<ReportBean> select();

}
