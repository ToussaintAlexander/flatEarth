package com.region08.association.certification.dao;

import java.util.List;

import com.region08.association.certification.model.CertificationBean;

public interface CertificationDao {

	public int insert(CertificationBean acquirer);
	public int update(CertificationBean acquirer);
	public int delete(int id);
	public CertificationBean selectCertificationById(int id);
	public List<CertificationBean> select();

}
