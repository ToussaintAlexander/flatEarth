package com.system.configuration.properties.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;

public class PropertiesBean {

	private int					id;
	
	private String				propertiesFile;
	
	private String 				defaultProperties;
	private String				propertiesLocation;
	
	private String 				inputFileName;
	private String 				outputFileName;
	private boolean				xmlFormat;
	private String 				encoding;
	private String 				path;
	private File 				file;
	private FileInputStream 	fileInputStream;
	private FileOutputStream 	fileOutputStream;
	
	private String 				driverName;
	private String 				serverName;
	private String 				portNumber;
	private String 				sid;
	private String 				userName;
	private String 				password;
	
	private String 				createUser;			 
	private Timestamp			createTimestamp;	 
	private String 				modifyUser;			 
	private Timestamp 			modifyTimestamp;	 	
	
	public PropertiesBean () {}

	public PropertiesBean(int id, String propertiesFile, String defaultProperties, String propertiesLocation,
			String inputFileName, String outputFileName, boolean xmlFormat, String encoding, String path, File file,
			FileInputStream fileInputStream, FileOutputStream fileOutputStream, String driverName, String serverName,
			String portNumber, String sid, String userName, String password, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.propertiesFile = propertiesFile;
		this.defaultProperties = defaultProperties;
		this.propertiesLocation = propertiesLocation;
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
		this.xmlFormat = xmlFormat;
		this.encoding = encoding;
		this.path = path;
		this.file = file;
		this.fileInputStream = fileInputStream;
		this.fileOutputStream = fileOutputStream;
		this.driverName = driverName;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.sid = sid;
		this.userName = userName;
		this.password = password;
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

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPropertiesFile() {
		return propertiesFile;
	}

	public void setPropertiesFile(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}

	public String getDefaultProperties() {
		return defaultProperties;
	}

	public void setDefaultProperties(String defaultProperties) {
		this.defaultProperties = defaultProperties;
	}

	public String getPropertiesLocation() {
		return propertiesLocation;
	}

	public void setPropertiesLocation(String propertiesLocation) {
		this.propertiesLocation = propertiesLocation;
	}

	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	public boolean isXmlFormat() {
		return xmlFormat;
	}

	public void setXmlFormat(boolean xmlFormat) {
		this.xmlFormat = xmlFormat;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public FileOutputStream getFileOutputStream() {
		return fileOutputStream;
	}

	public void setFileOutputStream(FileOutputStream fileOutputStream) {
		this.fileOutputStream = fileOutputStream;
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
