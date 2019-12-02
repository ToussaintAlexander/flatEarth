package com.system.configuration.properties.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;

public class FilePropertiesBean {

	private int 				id;
	
	private String				propertiesFile;
	
	private String 				defaultProperties;
	private String				propertiesLocation;
	
	private String 				inputFileName;
	private String 				outputFileName;
	private boolean				xmlFormatSwitch;
	private String 				encodingFormat;
	private String 				pathName;
	private File 				fileName;
	private FileInputStream 	fileInputStream;
	private FileOutputStream 	fileOutputStream;
	
	private String 				createUser;			 
	private Timestamp 			createTimestamp;	 
	private String 				modifyUser;			 
	private Timestamp 			modifyTimestamp;	 	
	
	public FilePropertiesBean () {}

	public FilePropertiesBean(int id, String propertiesFile, String defaultProperties, String propertiesLocation,
			String inputFileName, String outputFileName, boolean xmlFormatSwitch, String encodingFormat,
			String pathName, File fileName, FileInputStream fileInputStream, FileOutputStream fileOutputStream,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.propertiesFile = propertiesFile;
		this.defaultProperties = defaultProperties;
		this.propertiesLocation = propertiesLocation;
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
		this.xmlFormatSwitch = xmlFormatSwitch;
		this.encodingFormat = encodingFormat;
		this.pathName = pathName;
		this.fileName = fileName;
		this.fileInputStream = fileInputStream;
		this.fileOutputStream = fileOutputStream;
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

	public boolean isXmlFormatSwitch() {
		return xmlFormatSwitch;
	}

	public void setXmlFormatSwitch(boolean xmlFormatSwitch) {
		this.xmlFormatSwitch = xmlFormatSwitch;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public File getFileName() {
		return fileName;
	}

	public void setFileName(File fileName) {
		this.fileName = fileName;
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