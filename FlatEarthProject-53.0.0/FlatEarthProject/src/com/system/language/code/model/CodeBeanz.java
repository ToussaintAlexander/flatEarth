package com.system.language.code.model;

import java.sql.Timestamp;

public class CodeBeanz {

	private int 		id;		
	private String 		batchKey;	
	private String 		contextFile;	
	private String 		databaseConfiguration;			
	private String 		jobReport;
	private String 		jobLauncher;
	private String 		reportJob;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;	 
	
	public CodeBeanz () {}

	public CodeBeanz(int id, String batchKey, String contextFile, String databaseConfiguration, String jobReport,
			String jobLauncher, String reportJob, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.batchKey = batchKey;
		this.contextFile = contextFile;
		this.databaseConfiguration = databaseConfiguration;
		this.jobReport = jobReport;
		this.jobLauncher = jobLauncher;
		this.reportJob = reportJob;
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

	public String getBatchKey() {
		return batchKey;
	}

	public void setBatchKey(String batchKey) {
		this.batchKey = batchKey;
	}

	public String getContextFile() {
		return contextFile;
	}

	public void setContextFile(String contextFile) {
		this.contextFile = contextFile;
	}

	public String getDatabaseConfiguration() {
		return databaseConfiguration;
	}

	public void setDatabaseConfiguration(String databaseConfiguration) {
		this.databaseConfiguration = databaseConfiguration;
	}

	public String getJobReport() {
		return jobReport;
	}

	public void setJobReport(String jobReport) {
		this.jobReport = jobReport;
	}

	public String getJobLauncher() {
		return jobLauncher;
	}

	public void setJobLauncher(String jobLauncher) {
		this.jobLauncher = jobLauncher;
	}

	public String getReportJob() {
		return reportJob;
	}

	public void setReportJob(String reportJob) {
		this.reportJob = reportJob;
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