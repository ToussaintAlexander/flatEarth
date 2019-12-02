package com.system.configuration.properties.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;

public class PropertiesBean {

	// General file-access properties
	
	private int 				propertiesId;
	
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
	
	// Database-related properties
	
	private String 				driverName;
	private String 				serverName;
	private String 				portNumber;
	private String 				sid;
	private String 				userName;
	private String 				password;
	
	// Administrative columns
	
	private String 				createUser;			 
	private Timestamp 			createTimestamp;	 
	private String 				modifyUser;			 
	private Timestamp 			modifyTimestamp;	 	
	
	public PropertiesBean (int 				propertiesId
				   ,String				propertiesFile
				   ,String 				defaultProperties
				   ,String				propertiesLocation
				   ,String 				inputFileName
				   ,String 				outputFileName
				   ,boolean				xmlFormat
				   ,String 				encoding
				   ,String 				path
				   ,File 				file
				   ,FileInputStream 	fileInputStream
				   ,FileOutputStream 	fileOutputStream
				   ,String 				driverName
				   ,String 				serverName
				   ,String 				portNumber
				   ,String 				sid
				   ,String 				userName
				   ,String 				password
			 	   ,String 				createUser
			 	   ,Timestamp 			createTimestamp
			 	   ,String 				modifyUser
			 	   ,Timestamp 			modifyTimestamp
			 		) {	
		
		this.propertiesId		= propertiesId;
		this.propertiesFile		= propertiesFile;
		this.defaultProperties	= defaultProperties;
		this.propertiesLocation	= propertiesLocation;
		this.inputFileName		= inputFileName;
		this.outputFileName		= outputFileName;
		this.xmlFormat			= xmlFormat;
		this.encoding			= encoding;
		this.path				= path;
		this.file				= file;
		this.fileInputStream	= fileInputStream;
		this.fileOutputStream	= fileOutputStream;
		this.driverName			= driverName;
		this.serverName			= serverName;
		this.portNumber			= portNumber;
		this.sid				= sid;
		this.userName			= userName;
		this.password			= password;
		
		this.createUser 		= createUser;
		this.createTimestamp 	= createTimestamp;
		this.modifyUser 		= modifyUser;
		this.modifyTimestamp 	= modifyTimestamp;
		
	}
	
	public int getPropertiesId() {
		return propertiesId;
	}
	
	public void setPropertiesId(int propertiesId) {
		this.propertiesId = propertiesId;
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

	@Override
	public String toString() {
		return "PropertiesBean [propertiesId=" + propertiesId
				+ ", propertiesFile=" + propertiesFile + ", defaultProperties="
				+ defaultProperties + ", propertiesLocation="
				+ propertiesLocation + ", inputFileName=" + inputFileName
				+ ", outputFileName=" + outputFileName + ", xmlFormat="
				+ xmlFormat + ", encoding=" + encoding + ", path=" + path
				+ ", file=" + file + ", fileInputStream=" + fileInputStream
				+ ", fileOutputStream=" + fileOutputStream + ", driverName="
				+ driverName + ", serverName=" + serverName + ", portNumber="
				+ portNumber + ", sid=" + sid + ", userName=" + userName
				+ ", password=" + password + ", createUser=" + createUser
				+ ", createTimestamp=" + createTimestamp + ", modifyUser="
				+ modifyUser + ", modifyTimestamp=" + modifyTimestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTimestamp == null) ? 0 : createTimestamp.hashCode());
		result = prime * result
				+ ((createUser == null) ? 0 : createUser.hashCode());
		result = prime
				* result
				+ ((defaultProperties == null) ? 0 : defaultProperties
						.hashCode());
		result = prime * result
				+ ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result
				+ ((encoding == null) ? 0 : encoding.hashCode());
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result
				+ ((fileInputStream == null) ? 0 : fileInputStream.hashCode());
		result = prime
				* result
				+ ((fileOutputStream == null) ? 0 : fileOutputStream.hashCode());
		result = prime * result
				+ ((inputFileName == null) ? 0 : inputFileName.hashCode());
		result = prime * result
				+ ((modifyTimestamp == null) ? 0 : modifyTimestamp.hashCode());
		result = prime * result
				+ ((modifyUser == null) ? 0 : modifyUser.hashCode());
		result = prime * result
				+ ((outputFileName == null) ? 0 : outputFileName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result
				+ ((portNumber == null) ? 0 : portNumber.hashCode());
		result = prime * result
				+ ((propertiesFile == null) ? 0 : propertiesFile.hashCode());
		result = prime * result + propertiesId;
		result = prime
				* result
				+ ((propertiesLocation == null) ? 0 : propertiesLocation
						.hashCode());
		result = prime * result
				+ ((serverName == null) ? 0 : serverName.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + (xmlFormat ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertiesBean other = (PropertiesBean) obj;
		if (createTimestamp == null) {
			if (other.createTimestamp != null)
				return false;
		} else if (!createTimestamp.equals(other.createTimestamp))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (defaultProperties == null) {
			if (other.defaultProperties != null)
				return false;
		} else if (!defaultProperties.equals(other.defaultProperties))
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (encoding == null) {
			if (other.encoding != null)
				return false;
		} else if (!encoding.equals(other.encoding))
			return false;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (fileInputStream == null) {
			if (other.fileInputStream != null)
				return false;
		} else if (!fileInputStream.equals(other.fileInputStream))
			return false;
		if (fileOutputStream == null) {
			if (other.fileOutputStream != null)
				return false;
		} else if (!fileOutputStream.equals(other.fileOutputStream))
			return false;
		if (inputFileName == null) {
			if (other.inputFileName != null)
				return false;
		} else if (!inputFileName.equals(other.inputFileName))
			return false;
		if (modifyTimestamp == null) {
			if (other.modifyTimestamp != null)
				return false;
		} else if (!modifyTimestamp.equals(other.modifyTimestamp))
			return false;
		if (modifyUser == null) {
			if (other.modifyUser != null)
				return false;
		} else if (!modifyUser.equals(other.modifyUser))
			return false;
		if (outputFileName == null) {
			if (other.outputFileName != null)
				return false;
		} else if (!outputFileName.equals(other.outputFileName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (portNumber == null) {
			if (other.portNumber != null)
				return false;
		} else if (!portNumber.equals(other.portNumber))
			return false;
		if (propertiesFile == null) {
			if (other.propertiesFile != null)
				return false;
		} else if (!propertiesFile.equals(other.propertiesFile))
			return false;
		if (propertiesId != other.propertiesId)
			return false;
		if (propertiesLocation == null) {
			if (other.propertiesLocation != null)
				return false;
		} else if (!propertiesLocation.equals(other.propertiesLocation))
			return false;
		if (serverName == null) {
			if (other.serverName != null)
				return false;
		} else if (!serverName.equals(other.serverName))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (xmlFormat != other.xmlFormat)
			return false;
		return true;
	}

}