package com.region02.bank.issuer.card.chip.model;

import java.sql.Timestamp;

/*
 * https://www.eftlab.co.uk/index.php/site-map/our-articles/177-cardholder-verification-in-emv
 * 
 * Cardholder Verification in EMV
 */
public class VerificationBean {

	private int id;
	private String primaryAccountNumber;				// Tag 5A		AN 19	35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;				// Tag 5F 34	N 2 	00

	private short cardhldrVerificationMethod;			// Tag 8E				00 00 00 00 00 00 00 00 44 03 	
														//						41 03 1E 03 02 03 1F 00
	private byte  cardhldrVerificationStatus;			// Tag 9F 50	B 1	
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public VerificationBean () {}

	public VerificationBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq,
			short crdhldrVerificationMethod, byte crdhldrVerificationStatus, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.cardhldrVerificationMethod = crdhldrVerificationMethod;
		this.cardhldrVerificationStatus = crdhldrVerificationStatus;
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

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public int getPrimaryAccountNumberSeq() {
		return primaryAccountNumberSeq;
	}

	public void setPrimaryAccountNumberSeq(int primaryAccountNumberSeq) {
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
	}

	public short getCardhldrVerificationMethod() {
		return cardhldrVerificationMethod;
	}

	public void setCardhldrVerificationMethod(short cardhldrVerificationMethod) {
		this.cardhldrVerificationMethod = cardhldrVerificationMethod;
	}

	public byte getCardhldrVerificationStatus() {
		return cardhldrVerificationStatus;
	}

	public void setCardhldrVerificationStatus(byte cardhldrVerificationStatus) {
		this.cardhldrVerificationStatus = cardhldrVerificationStatus;
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
