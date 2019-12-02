package com.region08.association.letter.model;

import java.util.Date;
import java.sql.Timestamp;

public class LetterBean {

	public int						id;
	
	public String 					association;	
	public String 					title;
	public String 					subtitle;
	public String 					version;
	public Date 					effectiveDate;
	
	public int 						releaseOverview;
	public int 						section;
	public int 						appendix;
	
	public String 					createUser;
	public Timestamp 				createTimestamp;
	public String 					modifyUser;
	public Timestamp 				modifyTimestamp;

	public LetterBean () {}

	public LetterBean(int id, String association, String title, String subtitle, String version, Date effectiveDate,
			int releaseOverview, int section, int appendix, String createUser, Timestamp createTimestamp,
			String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.association = association;
		this.title = title;
		this.subtitle = subtitle;
		this.version = version;
		this.effectiveDate = effectiveDate;
		this.releaseOverview = releaseOverview;
		this.section = section;
		this.appendix = appendix;
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

	public String getAssociation() {
		return association;
	}

	public void setAssociation(String association) {
		this.association = association;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public int getReleaseOverview() {
		return releaseOverview;
	}

	public void setReleaseOverview(int releaseOverview) {
		this.releaseOverview = releaseOverview;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getAppendix() {
		return appendix;
	}

	public void setAppendix(int appendix) {
		this.appendix = appendix;
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
