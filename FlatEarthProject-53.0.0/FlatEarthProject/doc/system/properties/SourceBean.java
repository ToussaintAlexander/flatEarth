package com.system.language.logger.model;

import java.sql.Timestamp;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class SourceBean {

	private int 					id;
	private Logger					loggerName;
	private int						handlerType;
	private Handler					fileHandler;			// diskFileHandler, needed for memoryHandler	
	private String					serverName;
	private int 					portNumber;
    private int    					pushLevel;				// levelValue	
    private String					sourceClass;
    private String					sourceMethodName;
    private String					resourceBundle;
    private int						formatCode;
    
	private String 					createUser;			 
	private Timestamp 				createTimestamp;	 
	private String 					modifyUser;			 
	private Timestamp 				modifyTimestamp;	 
    
    public SourceBean() {}

	public SourceBean(int id, Logger loggerName, int handlerType, Handler fileHandler, String serverName,
			int portNumber, int pushLevel, String sourceClass, String sourceMethodName, String resourceBundle,
			int formatCode, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.loggerName = loggerName;
		this.handlerType = handlerType;
		this.fileHandler = fileHandler;
		this.serverName = serverName;
		this.portNumber = portNumber;
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

	public Logger getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(Logger loggerName) {
		this.loggerName = loggerName;
	}

	public int getHandlerType() {
		return handlerType;
	}

	public void setHandlerType(int handlerType) {
		this.handlerType = handlerType;
	}

	public Handler getFileHandler() {
		return fileHandler;
	}

	public void setFileHandler(Handler fileHandler) {
		this.fileHandler = fileHandler;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
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