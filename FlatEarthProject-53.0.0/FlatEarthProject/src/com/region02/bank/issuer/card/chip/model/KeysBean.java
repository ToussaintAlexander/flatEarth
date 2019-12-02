package com.region02.bank.issuer.card.chip.model;

import java.sql.Timestamp;

//	All fields prefixed with icc

public class KeysBean {

	private int id;
	private String primaryAccountNumber;		// Tag 5A		AN 19	35 69 99 00 10 08 22 11
	private int primaryAccountNumberSeq;		// Tag 5F 34	N 2 

	private byte pinEncipherPublicKeyCert;		// Tag 9F 2D	B										LENGTH = NI										 
	private byte pinEncipherPublicKeyExp;		// Tag 9F 2E	B		03								LENGTH = 1 OR 3				 
	private byte pinEncipherPublicKeyRemain;	// Tag 9F 2F	B										LENGTH = NPE - NI + 42					 
	
	private long publicKeyCertificate;			// Tag 9F 46	B		42 67 F4 23 01 55 61 D7 C3 FA	LENGTH = NI									 	
												//						31 92 FA 68 9A AA BF 2A CD 55
												//						4D 4F AE 6F DA 39 31 98 6E E9
												//						72 33 D2 0A 5B 1E F8 0F 26 5F
												//						35 E1 B8 21 E5 0F 60 50 D5 62
												//						AC F1 0E BE E4 82 ED E6 F1 3D
												//						6A 26 A6 AC BD E9 D1 5E DE 0C
												//						8C 17 05 81 7D E9 0D C4 85 1F
												//						30 C9 7C 5F E8 D0 0E 8B 7C E3
												//						19 E5 42 CC 01 8A 1A 04 84 0D
												//						68 F4 07 25 1F B9 6A F8 64 AE
												//						95 83 D5 3B 23 AC 27 D6 F5 D7
												//						54 4D 09 9F 12 40 51 4C 7D F9
												//						6B 61 E7 F5 62 D7 F3 31 44 99
												//						2E 08 97 4A 53 BF A1 83 50 B3
												//						1B 42 A1 FA 68 8F 69 5F AA F7
												//						34 13 44 87 F0 36 86 B7 27 BE
												//						34 D2 05 23 06 E3
	
	
	
	private byte publicKeyExponent;				// Tag 9F 47	B		03								LENGTH = 1 - 3				 
	private byte publicKeyRemainder;			// Tag 9F 48	B		D3 16 8D 49 80 C1 76 16 C0 19	LENGTH = NIC - NI + 42		 		
												// 						C7 F5
	
	private byte publicKeyIndex;				// Tag 8F		B 1
	
	private byte dynamicNumber;					// Tag 9F 4C	B 2 - 8										LENGTH = 2 - 8											 

	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public KeysBean () {}

	public KeysBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, byte pinEncipherPublicKeyCert,
			byte pinEncipherPublicKeyExp, byte pinEncipherPublicKeyRemain, long publicKeyCertificate,
			byte publicKeyIndex, byte publicKeyExponent, byte publicKeyRemainder, byte dynamicNumber, String createUser,
			Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.pinEncipherPublicKeyCert = pinEncipherPublicKeyCert;
		this.pinEncipherPublicKeyExp = pinEncipherPublicKeyExp;
		this.pinEncipherPublicKeyRemain = pinEncipherPublicKeyRemain;
		this.publicKeyCertificate = publicKeyCertificate;
		this.publicKeyIndex = publicKeyIndex;
		this.publicKeyExponent = publicKeyExponent;
		this.publicKeyRemainder = publicKeyRemainder;
		this.dynamicNumber = dynamicNumber;
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

	public byte getPinEncipherPublicKeyCert() {
		return pinEncipherPublicKeyCert;
	}

	public void setPinEncipherPublicKeyCert(byte pinEncipherPublicKeyCert) {
		this.pinEncipherPublicKeyCert = pinEncipherPublicKeyCert;
	}

	public byte getPinEncipherPublicKeyExp() {
		return pinEncipherPublicKeyExp;
	}

	public void setPinEncipherPublicKeyExp(byte pinEncipherPublicKeyExp) {
		this.pinEncipherPublicKeyExp = pinEncipherPublicKeyExp;
	}

	public byte getPinEncipherPublicKeyRemain() {
		return pinEncipherPublicKeyRemain;
	}

	public void setPinEncipherPublicKeyRemain(byte pinEncipherPublicKeyRemain) {
		this.pinEncipherPublicKeyRemain = pinEncipherPublicKeyRemain;
	}

	public long getPublicKeyCertificate() {
		return publicKeyCertificate;
	}

	public void setPublicKeyCertificate(long publicKeyCertificate) {
		this.publicKeyCertificate = publicKeyCertificate;
	}

	public byte getPublicKeyIndex() {
		return publicKeyIndex;
	}

	public void setPublicKeyIndex(byte publicKeyIndex) {
		this.publicKeyIndex = publicKeyIndex;
	}

	public byte getPublicKeyExponent() {
		return publicKeyExponent;
	}

	public void setPublicKeyExponent(byte publicKeyExponent) {
		this.publicKeyExponent = publicKeyExponent;
	}

	public byte getPublicKeyRemainder() {
		return publicKeyRemainder;
	}

	public void setPublicKeyRemainder(byte publicKeyRemainder) {
		this.publicKeyRemainder = publicKeyRemainder;
	}

	public byte getDynamicNumber() {
		return dynamicNumber;
	}

	public void setDynamicNumber(byte dynamicNumber) {
		this.dynamicNumber = dynamicNumber;
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
