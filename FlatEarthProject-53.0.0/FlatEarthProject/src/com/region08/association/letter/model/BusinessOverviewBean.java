package com.region08.association.letter.model;

import java.sql.Timestamp;
import java.util.Date;

public class BusinessOverviewBean {

	private int 		id;
	
	private Date		effectiveDate;
	private int			majorVersion;
	private int			minorVersion;
	private int			section;
	private int			subsection;
	private int 		paragraph;
	
	private String		title;
	private String		sentence;
	
	private String 		createUser;
	private Timestamp 	createTimestamp;
	private String 		modifyUser;
	private Timestamp 	modifyTimestamp;
	
	public BusinessOverviewBean () {}

	public BusinessOverviewBean(int id, Date effectiveDate, int majorVersion, int minorVersion, int section,
			int subsection, int paragraph, String title, String sentence, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.effectiveDate = effectiveDate;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		this.section = section;
		this.subsection = subsection;
		this.paragraph = paragraph;
		this.title = title;
		this.sentence = sentence;
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

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public int getMajorVersion() {
		return majorVersion;
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public int getMinorVersion() {
		return minorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getSubsection() {
		return subsection;
	}

	public void setSubsection(int subsection) {
		this.subsection = subsection;
	}

	public int getParagraph() {
		return paragraph;
	}

	public void setParagraph(int paragraph) {
		this.paragraph = paragraph;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
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
