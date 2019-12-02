package com.system.message.header;

public class Header {

	private int id;
	private String destinationID;	// number fixed 6
	private String sourceId;		// number fixed 6
	private String echoData;		// number fixed 2
	private String baseFlags;		// number fixed 4
	private String statusFlags;		// number fixed 6
	private String batchNumber;		// number fixed 2
	private String userInfo;		// only on response
	
	public Header(int id, String destinationID, String sourceId, String echoData, String vSDFlags, String statusFlags,
			String batchNumber, String userInfo) {
		super();
		this.id = id;
		this.destinationID = destinationID;
		this.sourceId = sourceId;
		this.echoData = echoData;
		this.baseFlags = vSDFlags;
		this.statusFlags = statusFlags;
		this.batchNumber = batchNumber;
		this.userInfo = userInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinationID() {
		return destinationID;
	}

	public void setDestinationID(String destinationID) {
		this.destinationID = destinationID;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getEchoData() {
		return echoData;
	}

	public void setEchoData(String echoData) {
		this.echoData = echoData;
	}

	public String getvSDFlags() {
		return baseFlags;
	}

	public void setvSDFlags(String vSDFlags) {
		this.baseFlags = vSDFlags;
	}

	public String getStatusFlags() {
		return statusFlags;
	}

	public void setStatusFlags(String statusFlags) {
		this.statusFlags = statusFlags;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
}
