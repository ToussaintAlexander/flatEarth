package com.region08.association.letter.model;

public class CoverBean {

	private int 		id;
	
	private String		title;
	private String 		subtitle;
	
	private String		effectiveDate;
	private int			majorVersion;
	private int			minorVersion;
	
	private String 		createUser;
	private String 		createTimestamp;
	private String 		modifyUser;
	private String 		modifyTimestamp;
	
	public CoverBean () {}

	public CoverBean(int id, String title, String subtitle, String effectiveDate, int majorVersion, int minorVersion,
			String createUser, String createTimestamp, String modifyUser, String modifyTimestamp) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.effectiveDate = effectiveDate;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
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

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(String modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
