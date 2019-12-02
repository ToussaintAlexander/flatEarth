package com.system.language.logger.model;

import java.sql.Timestamp;

public class LoggerBean {

	private int 					id;
	private String					loggerName;				// Type=Logger
	private String					handlerType;
	private String					fileHandler;			// Type=Handler;	diskFileHandler, needed for memoryHandler	
	private String					serverName;
	private String 					portNumber;
	private String					outputStream;			// Was OutputStream now String
    private String 					fileNamePattern;		// diskFileName
    private short 					fileAppend;				// Type=boolean
    private int 					maximumDiskFiles;		// maximumFileNumbers 
    private int 					fileLimitSize;
    private int 					maximumRecordBuffer;	// recordNumber		
    private int						filterCode;
    private String					filterValue;
//  private MessageSearch			filterValue;    
    private int    					pushLevel;				// levelValue	
    private String					sourceClass;
    private String					sourceMethodName;
    private String					resourceBundle;
    private int						formatCode;
    
	private String 					createUser;			 
	private Timestamp 				createTimestamp;	 
	private String 					modifyUser;			 
	private Timestamp 				modifyTimestamp;	 
    
    public LoggerBean() {}

	public LoggerBean(int id, String loggerName, String handlerType, String fileHandler, String serverName, String portNumber,
			String outputStream, String fileNamePattern, short fileAppend, int maximumDiskFiles, int fileLimitSize,
			int maximumRecordBuffer, int filterCode, String filterValue, int pushLevel, String sourceClass,
			String sourceMethodName, String resourceBundle, int formatCode, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.loggerName = loggerName;
		this.handlerType = handlerType;
		this.fileHandler = fileHandler;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.outputStream = outputStream;
		this.fileNamePattern = fileNamePattern;
		this.fileAppend = fileAppend;
		this.maximumDiskFiles = maximumDiskFiles;
		this.fileLimitSize = fileLimitSize;
		this.maximumRecordBuffer = maximumRecordBuffer;
		this.filterCode = filterCode;
		this.filterValue = filterValue;
		this.pushLevel = pushLevel;
		this.sourceClass = sourceClass;
		this.sourceMethodName = sourceMethodName;
		this.resourceBundle = resourceBundle;
		this.formatCode = formatCode;
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

	public String getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}

	public String getHandlerType() {
		return handlerType;
	}

	public void setHandlerType(String handlerType) {
		this.handlerType = handlerType;
	}

	public String getFileHandler() {
		return fileHandler;
	}

	public void setFileHandler(String fileHandler) {
		this.fileHandler = fileHandler;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
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

	public short getFileAppend() {
		return fileAppend;
	}

	public void setFileAppend(short fileAppend) {
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

	public int getPushLevel() {
		return pushLevel;
	}

	public void setPushLevel(int pushLevel) {
		this.pushLevel = pushLevel;
	}

	public String getSourceClass() {
		return sourceClass;
	}

	public void setSourceClass(String sourceClass) {
		this.sourceClass = sourceClass;
	}

	public String getSourceMethodName() {
		return sourceMethodName;
	}

	public void setSourceMethodName(String sourceMethodName) {
		this.sourceMethodName = sourceMethodName;
	}

	public String getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(String resourceBundle) {
		this.resourceBundle = resourceBundle;
	}

	public int getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(int formatCode) {
		this.formatCode = formatCode;
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