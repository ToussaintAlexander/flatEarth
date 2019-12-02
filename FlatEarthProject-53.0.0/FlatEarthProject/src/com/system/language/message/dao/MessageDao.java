package com.system.language.message.dao;

import java.util.List;

import com.system.language.message.model.MessageBean;

public interface MessageDao {

	public int insert(MessageBean message);
	public int update(MessageBean message);
	public int delete(int id);
	public MessageBean selectMessageById(int id);
	public List<MessageBean> select();

}
