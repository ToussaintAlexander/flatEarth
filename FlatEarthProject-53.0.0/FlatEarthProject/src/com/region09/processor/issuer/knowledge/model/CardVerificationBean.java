package com.region09.processor.issuer.knowledge.model;

import java.sql.Timestamp;

/*
 * CVV1, is encoded on track-2 of the magnetic stripe of the card and used for card present transactions. 
 * The purpose of the code is to verify that a payment card is actually in the hand of the merchant. 
 * This code is automatically retrieved when the magnetic stripe of a card is swiped on a point-of-sale 
 * (card present) device and is verified by the issuer.
 * 
 * The most cited, is CVV2 or CVC2. This code is often sought by merchants for card not present transactions 
 * occurring by mail or FAX or over the telephone or Internet.
 * 
 * iCVV (Integrated Chip Card Card Verification Value) is the code stored in the card’s chip.
 * 
 * DCVV A security code which changes for each transaction, replacing the static magnetic stripe-based card
 * security code for a contactless transaction
 */

public class CardVerificationBean {

	private int id;
	
	private String lowBinRangeNumber;
	private String highBinRangeNumber;
	
	private short cVV1;
	private short cVV2;
	private short iCVV;
	private short dCVV;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public CardVerificationBean () {}

	public CardVerificationBean(int id, String lowBinRangeNumber, String highBinRangeNumber, short cVV1, short cVV2,
			short iCVV, short dCVV, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.lowBinRangeNumber = lowBinRangeNumber;
		this.highBinRangeNumber = highBinRangeNumber;
		this.cVV1 = cVV1;
		this.cVV2 = cVV2;
		this.iCVV = iCVV;
		this.dCVV = dCVV;
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

	public String getLowBinRangeNumber() {
		return lowBinRangeNumber;
	}

	public void setLowBinRangeNumber(String lowBinRangeNumber) {
		this.lowBinRangeNumber = lowBinRangeNumber;
	}

	public String getHighBinRangeNumber() {
		return highBinRangeNumber;
	}

	public void setHighBinRangeNumber(String highBinRangeNumber) {
		this.highBinRangeNumber = highBinRangeNumber;
	}

	public short getcVV1() {
		return cVV1;
	}

	public void setcVV1(short cVV1) {
		this.cVV1 = cVV1;
	}

	public short getcVV2() {
		return cVV2;
	}

	public void setcVV2(short cVV2) {
		this.cVV2 = cVV2;
	}

	public short getiCVV() {
		return iCVV;
	}

	public void setiCVV(short iCVV) {
		this.iCVV = iCVV;
	}

	public short getdCVV() {
		return dCVV;
	}

	public void setdCVV(short dCVV) {
		this.dCVV = dCVV;
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
