package com.region08.association.letter.model;

import java.sql.Timestamp;

public class AppendixBean {

	private int 					id;
	private int 					sequence;
	
	private int						validCodes;		 
	private int						rejectCodes;	 
	
	private int						acronyms;
	private int						relatedDocuments;
	
	private String 					createUser;
	private Timestamp 				createTimestamp;
	private String 					modifyUser;
	private Timestamp 				modifyTimestamp;
	
	public AppendixBean () {}

	public AppendixBean(int id, int sequence, int validCodes, int rejectCodes, int acronyms, int relatedDocuments,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.sequence = sequence;
		this.validCodes = validCodes;
		this.rejectCodes = rejectCodes;
		this.acronyms = acronyms;
		this.relatedDocuments = relatedDocuments;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getValidCodes() {
		return validCodes;
	}

	public void setValidCodes(int validCodes) {
		this.validCodes = validCodes;
	}

	public int getRejectCodes() {
		return rejectCodes;
	}

	public void setRejectCodes(int rejectCodes) {
		this.rejectCodes = rejectCodes;
	}

	public int getAcronyms() {
		return acronyms;
	}

	public void setAcronyms(int acronyms) {
		this.acronyms = acronyms;
	}

	public int getRelatedDocuments() {
		return relatedDocuments;
	}

	public void setRelatedDocuments(int relatedDocuments) {
		this.relatedDocuments = relatedDocuments;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
