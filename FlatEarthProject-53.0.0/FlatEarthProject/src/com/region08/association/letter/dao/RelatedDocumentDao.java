package com.region08.association.letter.dao;

import java.util.List;

import com.region08.association.letter.model.RelatedDocumentBean;

public interface RelatedDocumentDao {

	public int insert(RelatedDocumentBean relatedDocument);
	public int update(RelatedDocumentBean relatedDocument);
	public int delete(int id);
	public RelatedDocumentBean selectRelatedDocumentById(int id);
	public List<RelatedDocumentBean> select();

}
