package com.region09.processor.issuer.editor.dao;

import java.util.List;

import com.region09.processor.issuer.editor.model.ElementEditorBean;

public interface ElementEditorDao {

	public int insert(ElementEditorBean elementEditor);
	public int update(ElementEditorBean elementEditor);
	public int delete(int id);
	public ElementEditorBean selectElementEditorById(int id);
	public List<ElementEditorBean> select();

}
