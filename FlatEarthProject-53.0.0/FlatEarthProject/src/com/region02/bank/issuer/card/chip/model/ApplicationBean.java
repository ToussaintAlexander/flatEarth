package com.region02.bank.issuer.card.chip.model;

import java.sql.Timestamp;
import java.util.Date;

/*
 * https://www.openscdp.org/scripts/tutorial/emv/cardactionanalysis.html
 * 
 * Tag: '9F27' - Cryptogram Information Data (CID)
 * Tag: '9F36' - Application Transaction Counter (ATC)
 * Tag: '9F26' - Application Cryptogram (AC)
 * ---------------------------------------------------------------------
 * Coding of Cryptogram Information Data
 * 
 * b8	b7	b6	b5	b4	b3	b2	b1	Meaning
 * 0	0							AAC
 * 0	1							TC
 * 1	0							ARQC
 * 1	1							AAR
 * 		    x	x					Payment System-specific cryptogram
 * 				0					No advice required
 * 				1					Advice required
 * 					x	x	x		Reason/advice/referral code
 * 					0	0	0		No information given
 * 					0	0	1		Service not allowed	
 * 					0	1	0		PIN Try Limit exceeded
 * 					0	1	1		Issuer authentication failed
 * 					1	x	x		Other values RFU
 * ---------------------------------------------------------------------
 */

public class ApplicationBean {

	private int id;
	private String primaryAccountNumber;		//  Tag 5A		AN 19			35 69 99 00 10 08 22 11	
	private int primaryAccountNumberSeq;		//  Tag 5F 34	 N  2 			00
	
	private short versionNumber;				//  Tag 9F 09	 B  2			00000000 00000000	
	private short usageControl;					//  tag 9F 07	 B  2			00000000 00000000
												//  short = 16 bits
	
	private long cryptogram;					//  Tag 9F 26	 B  8			00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000
												//								AA		 CD		  EF	   F0		A0		 C9		  D1	   FF
												//								255		 254	  234	   200		170		 109	  207	   110
												//	long =  64 bits
	
	private int unpredictableNumber;			//  Tag 9F 6A	 N  8			12345678
	
	private byte cryptogramInformationData;		//  Tag 9F 27	 B  1			00000000					CID	
												//  byte = 8 bits
	
	private short lastOnlineApplTransCounter;	//  Tag 9F 13	 B  2			00000000 00000000			velocity		 
	private short applicationTransCounter;		//  Tag 9F 36	 B  2			00000000 00000000			velocity			ATC	
												//  short = 16 bits

	private Date effectiveDate;					//  Tag 5F 25	 N  6			18 12 31	YY MM DD		
	private Date expirationDate;				//  Tag 5F 24	 N  6			18 12 31	YY MM DD
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;
	
	public ApplicationBean () {}

	public ApplicationBean(int id, String primaryAccountNumber, int primaryAccountNumberSeq, short versionNumber,
			short usageControl, long cryptogram, int unpredictableNumber, byte cryptogramInformationData,
			short lastOnlineApplTransCounter, short applicationTransCounter, Date effectiveDate, Date expirationDate,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.primaryAccountNumber = primaryAccountNumber;
		this.primaryAccountNumberSeq = primaryAccountNumberSeq;
		this.versionNumber = versionNumber;
		this.usageControl = usageControl;
		this.cryptogram = cryptogram;
		this.unpredictableNumber = unpredictableNumber;
		this.cryptogramInformationData = cryptogramInformationData;
		this.lastOnlineApplTransCounter = lastOnlineApplTransCounter;
		this.applicationTransCounter = applicationTransCounter;
		this.effectiveDate = effectiveDate;
		this.expirationDate = expirationDate;
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

	public short getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(short versionNumber) {
		this.versionNumber = versionNumber;
	}

	public short getUsageControl() {
		return usageControl;
	}

	public void setUsageControl(short usageControl) {
		this.usageControl = usageControl;
	}

	public long getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(long cryptogram) {
		this.cryptogram = cryptogram;
	}

	public int getUnpredictableNumber() {
		return unpredictableNumber;
	}

	public void setUnpredictableNumber(int unpredictableNumber) {
		this.unpredictableNumber = unpredictableNumber;
	}

	public byte getCryptogramInformationData() {
		return cryptogramInformationData;
	}

	public void setCryptogramInformationData(byte cryptogramInformationData) {
		this.cryptogramInformationData = cryptogramInformationData;
	}

	public short getLastOnlineApplTransCounter() {
		return lastOnlineApplTransCounter;
	}

	public void setLastOnlineApplTransCounter(short lastOnlineApplTransCounter) {
		this.lastOnlineApplTransCounter = lastOnlineApplTransCounter;
	}

	public short getApplicationTransCounter() {
		return applicationTransCounter;
	}

	public void setApplicationTransCounter(short applicationTransCounter) {
		this.applicationTransCounter = applicationTransCounter;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
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
