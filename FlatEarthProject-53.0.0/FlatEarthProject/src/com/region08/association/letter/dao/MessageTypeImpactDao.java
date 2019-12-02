package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.MessageTypeImpactBean;

public interface MessageTypeImpactDao {

	public int insert(MessageTypeImpactBean messageTypeImpact);
	public int update(MessageTypeImpactBean messageTypeImpact);
	public int delete(int id);
	public MessageTypeImpactBean selectMessageTypeImpactById(int id);
	public List<MessageTypeImpactBean> select();

}
