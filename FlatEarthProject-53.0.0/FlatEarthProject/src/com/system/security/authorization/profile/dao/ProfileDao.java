package com.system.security.authorization.profile.dao;

import java.util.List;

import com.system.security.authorization.profile.model.ProfileBean;

public interface ProfileDao  {

	public boolean insert(ProfileBean profile);
	public boolean update(ProfileBean profile);
	public boolean delete(int id);
	public ProfileBean selectProfileById(int id);
	public List<ProfileBean> select();
	
}