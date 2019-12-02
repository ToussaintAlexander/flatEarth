package com.system.language.logger.model;

import java.sql.Timestamp;
import java.util.logging.Logger;

public class FileBean {

	private int 					id;
	private Logger					loggerName;
	private String					outputStream;			// Was OutputStream now String
    private String 					fileNamePattern;		// diskFileName
    private boolean 				fileAppend;
    private int 					maximumDiskFiles;		// maximumFileNumbers 
    private int 					fileLimitSize;
    private int 					maximumRecordBuffer;	// recordNumber		
    private int						filterCode;
    private String					filterValue;
    
	private String 					createUser;			 
	private Timestamp 				createTimestamp;	 
	private String 					modifyUser;			 
	private Timestamp 				modifyTimestamp;	 
    
    public FileBean() {}

	public FileBean(int id, Logger loggerName, String outputStream, String fileNamePattern, boolean fileAppend,
			int maximumDiskFiles, int fileLimitSize, int maximumRecordBuffer, int filterCode, String filterValue,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.loggerName = loggerName;
		this.outputStream = outputStream;
		this.fileNamePattern = fileNamePattern;
		this.fileAppend = fileAppend;
		this.maximumDiskFiles = maximumDiskFiles;
		this.fileLimitSize = fileLimitSize;
		this.maximumRecordBuffer = maximumRecordBuffer;
		this.filterCode = filterCode;
		this.filterValue = filterValue;
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

	public Logger getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(Logger loggerName) {
		this.loggerName = loggerName;
	}

	public String getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(String outputStream) {
		this.outputStream = outputStream;
	}

	public String getFileNamePattern() {
		return fileNamePattern;
	}

	public void setFileNamePattern(String fileNamePattern) {
		this.fileNamePattern = fileNamePattern;
	}

	public boolean isFileAppend() {
		return fileAppend;
	}

	public void setFileAppend(boolean fileAppend) {
		this.fileAppend = fileAppend;
	}

	public int getMaximumDiskFiles() {
		return maximumDiskFiles;
	}

	public void setMaximumDiskFiles(int maximumDiskFiles) {
		this.maximumDiskFiles = maximumDiskFiles;
	}

	public int getFileLimitSize() {
		return fileLimitSize;
	}

	public void setFileLimitSize(int fileLimitSize) {
		this.fileLimitSize = fileLimitSize;
	}

	public int getMaximumRecordBuffer() {
		return maximumRecordBuffer;
	}

	public void setMaximumRecordBuffer(int maximumRecordBuffer) {
		this.maximumRecordBuffer = maximumRecordBuffer;
	}

	public int getFilterCode() {
		return filterCode;
	}

	public void setFilterCode(int filterCode) {
		this.filterCode = filterCode;
	}

	public String getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
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