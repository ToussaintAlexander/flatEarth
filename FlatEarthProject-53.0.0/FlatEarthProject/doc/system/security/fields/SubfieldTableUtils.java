package com.system.message.utilties;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.system.base.constants.Element.*;

public class SubfieldTableUtils {

	private List<FieldBean> fieldList = new ArrayList<FieldBean>();
	
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public int  getId (int element) {
		
		return fieldList.get(element).getId();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public String  getField (int element) {
		
		return fieldList.get(element).getFieldName();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public String  getCreateUser (int element) {
		
		return fieldList.get(element).getCreateUser();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public Timestamp  getCreateTimestamp (int element) {
		
		return fieldList.get(element).getCreateTimestamp();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public String  getModifyUser (int element) {
		
		return fieldList.get(element).getModifyUser();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public Timestamp  getModifyTimestamp (int element) {
		
		return fieldList.get(element).getModifyTimestamp();
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public List<ArrayList<FieldBean>>  createFields () {
		
		List<ArrayList<FieldBean>> fieldList = new ArrayList<ArrayList<FieldBean>>();
		
		ArrayList<FieldBean> subFieldList00 = new ArrayList<FieldBean>();
		
		FieldBean subfield0000 = new FieldBean ( 0, "Unassigned 000 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		subFieldList00.add(subfield0000);
		fieldList.add(subFieldList00);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList01 = new ArrayList<FieldBean>();
		
		FieldBean subfield0100 = new FieldBean ( 1, "Bitmap 001 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		subFieldList01.add(subfield0100);
		fieldList.add(subFieldList01);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList02 = new ArrayList<FieldBean>();
		
		FieldBean subfield0200 = new FieldBean ( 2, "Bank Identification Number 002 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0201 = new FieldBean ( 2, "Primary Account Number 002 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0202 = new FieldBean ( 2, "Check Digit 002 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList02.add(subfield0200);
		subFieldList02.add(subfield0201);
		subFieldList02.add(subfield0202);
		fieldList.add(subFieldList02);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList03 = new ArrayList<FieldBean>();
		
		FieldBean subfield0300 = new FieldBean ( 5, "Transaction Type 003 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0301 = new FieldBean ( 6, "Account From Type 003 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0302 = new FieldBean ( 7, "Account To Type 003 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList03.add(subfield0300);
		subFieldList03.add(subfield0301);
		subFieldList03.add(subfield0302);
		fieldList.add(subFieldList03);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList04 = new ArrayList<FieldBean>();
		
		FieldBean subfield0400 = new FieldBean ( 4, "Transaction Amount 004 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList04.add(subfield0400);
		fieldList.add(subFieldList04);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList05 = new ArrayList<FieldBean>();
		
		FieldBean subfield0500 = new FieldBean ( 5, "Settlement Amount 005 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList05.add(subfield0500);
		fieldList.add(subFieldList05);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList06 = new ArrayList<FieldBean>();
		
		FieldBean subfield0600 = new FieldBean ( 6, "Cardholder Billing Amount 006 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList06.add(subfield0600);
		fieldList.add(subFieldList06);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList07 = new ArrayList<FieldBean>();
		
		FieldBean subfield0700 = new FieldBean ( 7, "Transmission Date Month 007 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0701 = new FieldBean ( 7, "Transmission Date Day 007 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0702 = new FieldBean ( 7, "Transmission Time Hour 007 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0703 = new FieldBean ( 7, "Transmission Time Minute 007 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield0704 = new FieldBean ( 7, "Transmission Time Second 007 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList07.add(subfield0700);
		subFieldList07.add(subfield0701);
		subFieldList07.add(subfield0702);
		subFieldList07.add(subfield0703);
		subFieldList07.add(subfield0704);
		fieldList.add(subFieldList07);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList08 = new ArrayList<FieldBean>();
		
		FieldBean subfield0800 = new FieldBean ( 8, "Cardholder Billing Fee Amount 008 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList08.add(subfield0800);
		fieldList.add(subFieldList08);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList09 = new ArrayList<FieldBean>();
		
		FieldBean subfield0900 = new FieldBean ( 9, "Setttlement Conversion Rate 009 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList09.add(subfield0900);
		fieldList.add(subFieldList09);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList10 = new ArrayList<FieldBean>();
		
		FieldBean subfield1000 = new FieldBean (10, "Cardholder Billing Conversion Rate 010 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList10.add(subfield1000);
		fieldList.add(subFieldList10);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList11 = new ArrayList<FieldBean>();
		
		FieldBean subfield1100 = new FieldBean (11, "System Trace Audit Number 011 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList11.add(subfield1100);
		fieldList.add(subFieldList11);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList12 = new ArrayList<FieldBean>();
		
		FieldBean subfield1200 = new FieldBean (12, "Local Transaction Time Hour 012 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1201 = new FieldBean (12, "Local Transaction Time Minute 012 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1202 = new FieldBean (12, "Local Transaction Time Second 012 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList12.add(subfield1200);
		subFieldList12.add(subfield1201);
		subFieldList12.add(subfield1202);
		fieldList.add(subFieldList12);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList13 = new ArrayList<FieldBean>();
		
		FieldBean subfield1300 = new FieldBean (13, "Local Transaction Date Month 013 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1301 = new FieldBean (13, "Local Transaction Date Day 013 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList13.add(subfield1300);
		subFieldList13.add(subfield1301);
		fieldList.add(subFieldList13);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList14 = new ArrayList<FieldBean>();
		
		FieldBean subfield1400 = new FieldBean (14, "Expiration Date Year 014 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1401 = new FieldBean (14, "Expiration Date Month 014 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList14.add(subfield1400);
		subFieldList14.add(subfield1401);
		fieldList.add(subFieldList14);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList15 = new ArrayList<FieldBean>();
		
		FieldBean subfield1500 = new FieldBean (15, "Settlement Date Month 015 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1501 = new FieldBean (15, "Settlement Date Day 015 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList15.add(subfield1500);
		subFieldList15.add(subfield1501);
		fieldList.add(subFieldList15);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList16 = new ArrayList<FieldBean>();
		
		FieldBean subfield1600 = new FieldBean (16, "Conversion Date Month 016 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1601 = new FieldBean (16, "Conversion Date Day 016 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList16.add(subfield1600);
		subFieldList16.add(subfield1601);
		fieldList.add(subFieldList16);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList17 = new ArrayList<FieldBean>();
		
		FieldBean subfield1700 = new FieldBean (17, "Capture Date Month 017 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield1701 = new FieldBean (17, "Capture Date Day 017 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList17.add(subfield1700);
		subFieldList17.add(subfield1701);
		fieldList.add(subFieldList17);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList18 = new ArrayList<FieldBean>();
		
		FieldBean subfield1800 = new FieldBean (18, "Merchant Type 018 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList18.add(subfield1800);
		fieldList.add(subFieldList18);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList19 = new ArrayList<FieldBean>();
		
		FieldBean subfield1900 = new FieldBean (19, "Acquiring Institution Country Code 019 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList19.add(subfield1900);
		fieldList.add(subFieldList19);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList20 = new ArrayList<FieldBean>();
		
		FieldBean subfield2000 = new FieldBean (20, "PAN Extended Country Code 020 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList20.add(subfield2000);
		fieldList.add(subFieldList20);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList21 = new ArrayList<FieldBean>();
		
		FieldBean subfield2100 = new FieldBean (21, "Forwarding Institution Country Code 021 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList21.add(subfield2100);
		fieldList.add(subFieldList21);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList22 = new ArrayList<FieldBean>();
		
		FieldBean subfield2200 = new FieldBean (22, "Transaction Entry Mode 022 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield2201 = new FieldBean (22, "PIN Entry Mode 022 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList22.add(subfield2200);
		subFieldList22.add(subfield2201);
		fieldList.add(subFieldList22);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList23 = new ArrayList<FieldBean>();
		
		FieldBean subfield2300 = new FieldBean (23, "Application PAN Sequence Number 023 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList23.add(subfield2300);
		fieldList.add(subFieldList23);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList24 = new ArrayList<FieldBean>();
		
		FieldBean subfield2400 = new FieldBean (24, "Network International Identifier 024 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList24.add(subfield2400);
		fieldList.add(subFieldList24);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList25 = new ArrayList<FieldBean>();
		
		FieldBean subfield2500 = new FieldBean (25, "Point of Service Condition Code 025 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList25.add(subfield2500);
		fieldList.add(subFieldList25);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList26 = new ArrayList<FieldBean>();
		
		FieldBean subfield2600 = new FieldBean (26, "Point of Service PIN Capture Code 026 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList26.add(subfield2600);
		fieldList.add(subFieldList26);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList27 = new ArrayList<FieldBean>();
		
		FieldBean subfield2700 = new FieldBean (27, "Authorizing Identification Response Length 027 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList27.add(subfield2700);
		fieldList.add(subFieldList27);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList28 = new ArrayList<FieldBean>();
		
		FieldBean subfield2800 = new FieldBean (28, "Account Entry 028 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield2801 = new FieldBean (28, "Transaction Fee Amount 028 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList28.add(subfield2800);
		subFieldList28.add(subfield2801);
		fieldList.add(subFieldList28);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList29 = new ArrayList<FieldBean>();
		
		FieldBean subfield2900 = new FieldBean (29, "Account Entry 029 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield2901 = new FieldBean (29, "Settlement Fee Amount 029 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList29.add(subfield2900);
		subFieldList29.add(subfield2901);
		fieldList.add(subFieldList29);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList30 = new ArrayList<FieldBean>();
		
		FieldBean subfield3000 = new FieldBean (30, "Account Entry 030 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3001 = new FieldBean (30, "Transaction Processing Fee Amount 030 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList30.add(subfield3000);
		subFieldList30.add(subfield3001);
		fieldList.add(subFieldList30);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList31 = new ArrayList<FieldBean>();
		
		FieldBean subfield3100 = new FieldBean (31, "Account Entry 031 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3101 = new FieldBean (31, "Settlement Processing Fee Amount 031 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList31.add(subfield3100);
		subFieldList31.add(subfield3101);
		fieldList.add(subFieldList31);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList32 = new ArrayList<FieldBean>();
		
		FieldBean subfield3200 = new FieldBean (32, "Acquiring Institution Identification Code 032 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList32.add(subfield3200);
		fieldList.add(subFieldList32);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList33 = new ArrayList<FieldBean>();
		
		FieldBean subfield3300 = new FieldBean (33, "Forwarding Institution Identification Code 033 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList33.add(subfield3300);
		fieldList.add(subFieldList33);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList34 = new ArrayList<FieldBean>();
		
		FieldBean subfield3400 = new FieldBean (34, "Extended Primary Account Number 034 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList34.add(subfield3400);
		fieldList.add(subFieldList34);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList35 = new ArrayList<FieldBean>();
		
		FieldBean subfield3500 = new FieldBean (35, "Start Sentinel 035 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
//		Field subfield3501 = new Field (35, "Primary Account Number 035 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		FieldBean subfield3502 = new FieldBean ( 35, "Bank Identification Number 035 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3503 = new FieldBean ( 35, "Primary Account Number 035 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3504 = new FieldBean ( 35, "Check Digit 035 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield3505 = new FieldBean (35, "Field 01 Separator 035 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3506 = new FieldBean (35, "Expiration Date Year 035 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3507 = new FieldBean (35, "Expiration Date Month 035 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3508 = new FieldBean (35, "Service Code 035 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3509 = new FieldBean (35, "PIN Value Key Indicator 035 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3510 = new FieldBean (35, "PIN Verification Value 035 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3511 = new FieldBean (35, "Card Verification Value 035 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3512 = new FieldBean (35, "End Sentinel 035 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3513 = new FieldBean (35, "Long Redundancy Check Character 035 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList35.add(subfield3500);
		
//		subFieldList35.add(subfield3501);
		
		subFieldList35.add(subfield3502);
		subFieldList35.add(subfield3503);
		subFieldList35.add(subfield3504);
		
		subFieldList35.add(subfield3505);
		subFieldList35.add(subfield3506);
		subFieldList35.add(subfield3507);
		subFieldList35.add(subfield3508);
		subFieldList35.add(subfield3509);
		subFieldList35.add(subfield3510);
		
		subFieldList35.add(subfield3511);
		subFieldList35.add(subfield3512);
		subFieldList35.add(subfield3513);
		
		fieldList.add(subFieldList35);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList36 = new ArrayList<FieldBean>();
		
		FieldBean subfield3600 = new FieldBean (36, "Start Sentinel 036 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3601 = new FieldBean (36, "Format Code 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

//		Field subfield3602 = new Field (36, "Primary Account Number 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		FieldBean subfield3603 = new FieldBean (36, "Bank Identification Number 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3604 = new FieldBean (36, "Primary Account Number 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3605 = new FieldBean (36, "Check Digit 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield3606 = new FieldBean (36, "Field 01 Separator 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3607 = new FieldBean (36, "Country Code 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3608 = new FieldBean (36, "Currency Code 036 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3609 = new FieldBean (36, "Currency Exponent 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3610 = new FieldBean (36, "Amount Authorized Per Cycle 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3611 = new FieldBean (36, "Amount Remaining This Cycle 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3612 = new FieldBean (36, "Cycle Begin 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield3613 = new FieldBean (36, "Cycle Length 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3614 = new FieldBean (36, "Retry Count 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3615 = new FieldBean (36, "PIN Control Parameters 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3616 = new FieldBean (36, "Interchange Controls 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3617 = new FieldBean (36, "PAN Service Restriction 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3618 = new FieldBean (36, "SAN 1 Service Restriction 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3619 = new FieldBean (36, "SAN 2 Service Restriction 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3620 = new FieldBean (36, "Expiration Date Year 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3621 = new FieldBean (36, "Expiration Date Month 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3622 = new FieldBean (36, "Card Sequence Number 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield3623 = new FieldBean (36, "Card Security Number 036 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3624 = new FieldBean (36, "First Subsidiary Account Number 036 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3625 = new FieldBean (36, "Secondary Subsidiary Account Number 036 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3626 = new FieldBean (36, "Relay Marker 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3627 = new FieldBean (36, "Cryptographic Check Digits 036 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3628 = new FieldBean (36, "PIN Value Key Indicator 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3629 = new FieldBean (36, "PIN Verification Value 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3630 = new FieldBean (36, "Card Verification Value 036 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3631 = new FieldBean (36, "End Sentinel 036 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3632 = new FieldBean (36, "Long Redundancy Check Character 036 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
	
		subFieldList36.add(subfield3600);
		subFieldList36.add(subfield3601);
		
//		subFieldList36.add(subfield3602);
		
		subFieldList36.add(subfield3603);
		subFieldList36.add(subfield3604);
		subFieldList36.add(subfield3605);
		
		subFieldList36.add(subfield3606);
		subFieldList36.add(subfield3607);
		subFieldList36.add(subfield3608);
		subFieldList36.add(subfield3609);

		subFieldList36.add(subfield3610);
		subFieldList36.add(subfield3611);
		subFieldList36.add(subfield3612);
		subFieldList36.add(subfield3613);
		subFieldList36.add(subfield3614);
		subFieldList36.add(subfield3615);
		subFieldList36.add(subfield3616);
		subFieldList36.add(subfield3617);
		subFieldList36.add(subfield3618);
		subFieldList36.add(subfield3619);

		subFieldList36.add(subfield3620);
		subFieldList36.add(subfield3621);
		subFieldList36.add(subfield3622);
		subFieldList36.add(subfield3623);
		subFieldList36.add(subfield3624);
		subFieldList36.add(subfield3625);
		subFieldList36.add(subfield3626);
		subFieldList36.add(subfield3627);
		subFieldList36.add(subfield3628);
		subFieldList36.add(subfield3629);
		
		subFieldList36.add(subfield3630);
		subFieldList36.add(subfield3631);
		subFieldList36.add(subfield3632);
		
		fieldList.add(subFieldList36);
		
		//-----------------------------------------------------------------

		ArrayList<FieldBean> subFieldList37 = new ArrayList<FieldBean>();
		
		FieldBean subfield3700 = new FieldBean (37, "Transmission Date Year 037 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3701 = new FieldBean (37, "Julian Day Month 037 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3702 = new FieldBean (37, "Transmission Time Hour 037 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield3703 = new FieldBean (37, "Systems Trace Audit Number 037 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList37.add(subfield3700);
		subFieldList37.add(subfield3701);
		subFieldList37.add(subfield3702);
		subFieldList37.add(subfield3703);
		fieldList.add(subFieldList37);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList38 = new ArrayList<FieldBean>();
		
		FieldBean subfield3800 = new FieldBean (38, "Authorization Identification Response 038 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList38.add(subfield3800);
		fieldList.add(subFieldList38);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList39 = new ArrayList<FieldBean>();
		
		FieldBean subfield3900 = new FieldBean (39, "Response Code 039 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
	
		subFieldList39.add(subfield3900);
		fieldList.add(subFieldList39);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList40 = new ArrayList<FieldBean>();
		
		FieldBean subfield4000 = new FieldBean (40, "Service Restriction Code 040 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList40.add(subfield4000);
		fieldList.add(subFieldList40);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList41 = new ArrayList<FieldBean>();
		
		FieldBean subfield4100 = new FieldBean (41, "Card Acceptor Terminal Identification 041 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList41.add(subfield4100);
		fieldList.add(subFieldList41);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList42 = new ArrayList<FieldBean>();
		
		FieldBean subfield4200 = new FieldBean (42, "Card Acceptor Identification Code 042 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList42.add(subfield4200);
		fieldList.add(subFieldList42);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList43 = new ArrayList<FieldBean>();
		
		FieldBean subfield4300 = new FieldBean (43, "Card Acceptor Name/Location Address 043 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4301 = new FieldBean (43, "Card Acceptor Name/Location City 043 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4302 = new FieldBean (43, "Card Acceptor Name/Location State 043 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4303 = new FieldBean (43, "Card Acceptor Name/Location Country 043 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList43.add(subfield4300);
		subFieldList43.add(subfield4301);
		subFieldList43.add(subfield4302);
		subFieldList43.add(subfield4303);
		fieldList.add(subFieldList43);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList44 = new ArrayList<FieldBean>();
		
		FieldBean subfield4400 = new FieldBean (44, "Additional Response Data 044 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList44.add(subfield4400);
		fieldList.add(subFieldList44);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList45 = new ArrayList<FieldBean>();
		
		FieldBean subfield4500 = new FieldBean (45, "Start Sentinel 045 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4501 = new FieldBean (45, "Format Code 045 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
//		Field subfield4502 = new Field (45, "Primary Account Number 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield4503 = new FieldBean (45, "Primary Account Number 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4504 = new FieldBean (45, "Primary Account Number 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4505 = new FieldBean (45, "Primary Account Number 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield4506 = new FieldBean (45, "Field 1 Separator 045 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4507 = new FieldBean (45, "Full Name 045 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4508 = new FieldBean (45, "Field 2 Separator 045 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4509 = new FieldBean (45, "Expiration Date Year 045 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4510 = new FieldBean (45, "Expiration Date Month 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4511 = new FieldBean (45, "Service Code 045 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4512 = new FieldBean (45, "PIN Value Key Indicator 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4513 = new FieldBean (45, "PIN Verification Value 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4514 = new FieldBean (45, "Card Verification Value 045 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4515 = new FieldBean (45, "End Sentinel 045 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield4516 = new FieldBean (45, "Long Redundancy Check Character 045 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList45.add(subfield4500);
		subFieldList45.add(subfield4501);
//		subFieldList45.add(subfield4502);
		
		subFieldList45.add(subfield4503);
		subFieldList45.add(subfield4504);
		subFieldList45.add(subfield4505);
		
		subFieldList45.add(subfield4506);
		subFieldList45.add(subfield4507);
		subFieldList45.add(subfield4508);
		subFieldList45.add(subfield4509);
		subFieldList45.add(subfield4510);
		subFieldList45.add(subfield4511);
		subFieldList45.add(subfield4512);
		subFieldList45.add(subfield4513);
		subFieldList45.add(subfield4514);
		subFieldList45.add(subfield4515);
		subFieldList45.add(subfield4516);
		
		fieldList.add(subFieldList45);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList46 = new ArrayList<FieldBean>();
		
		FieldBean subfield4600 = new FieldBean (46, "Cardholder Billing Amount 046 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList46.add(subfield4600);
		fieldList.add(subFieldList46);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList47 = new ArrayList<FieldBean>();
		
		FieldBean subfield4700 = new FieldBean (47, "Transmission Date & Time 047 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList47.add(subfield4700);
		fieldList.add(subFieldList47);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList48 = new ArrayList<FieldBean>();
		
		FieldBean subfield4800 = new FieldBean (48, "Additional Data - Private 048 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList48.add(subfield4800);
		fieldList.add(subFieldList48);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList49 = new ArrayList<FieldBean>();
		
		FieldBean subfield4900 = new FieldBean (49, "Transaction Currency Code 049 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList49.add(subfield4900);
		fieldList.add(subFieldList49);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList50 = new ArrayList<FieldBean>();
		
		FieldBean subfield5000 = new FieldBean (50, "Settlement Currency Code 050 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList50.add(subfield5000);
		fieldList.add(subFieldList50);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList51 = new ArrayList<FieldBean>();
		
		FieldBean subfield5100 = new FieldBean (51, "Cardholder Billing Currency Code 051 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList51.add(subfield5100);
		fieldList.add(subFieldList51);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList52 = new ArrayList<FieldBean>();
		
		FieldBean subfield5200 = new FieldBean (52, "Personal Identification Number 052 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList52.add(subfield5200);
		fieldList.add(subFieldList52);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList53 = new ArrayList<FieldBean>();
		
		FieldBean subfield5300 = new FieldBean (53, "Key Management Scheme 053 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5301 = new FieldBean (53, "Key Set Identifier 053 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5302 = new FieldBean (53, "Encryption Algorithm 053 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5303 = new FieldBean (53, "Key Length 053 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5304 = new FieldBean (53, "Protection Mechanism 053 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5305 = new FieldBean (53, "Reserved National 053 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5306 = new FieldBean (53, "Reserved Private 053 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList53.add(subfield5300);
		subFieldList53.add(subfield5301);
		subFieldList53.add(subfield5302);
		subFieldList53.add(subfield5303);
		subFieldList53.add(subfield5304);
		subFieldList53.add(subfield5305);
		subFieldList53.add(subfield5306);
		fieldList.add(subFieldList53);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList54 = new ArrayList<FieldBean>();
		
		FieldBean subfield5400 = new FieldBean (54, "Account Type 054 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5401 = new FieldBean (54, "Amount Type 054 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5402 = new FieldBean (54, "Currency Code 054 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5403 = new FieldBean (54, "Account Entry 054 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5404 = new FieldBean (54, "Amount 054 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList54.add(subfield5400);
		subFieldList54.add(subfield5401);
		subFieldList54.add(subfield5402);
		subFieldList54.add(subfield5403);
		subFieldList54.add(subfield5404);
		fieldList.add(subFieldList54);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList55 = new ArrayList<FieldBean>();
		
		FieldBean subfield5500 = new FieldBean (55, "Transaction Currency Code 055 5F2A Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield5501 = new FieldBean (55, "Issuer Scripts 055 7100 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5502 = new FieldBean (55, "Issuer Scripts 055 7200 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5503 = new FieldBean (55, "Application Inter Profile Flags 055 8200 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5504 = new FieldBean (55, "Dedicated FName 055 8400 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5505 = new FieldBean (55, "Issuer ARPC 055 9100 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5506 = new FieldBean (55, "TVR Flags 055 9500 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5507 = new FieldBean (55, "Transaction Date 055 9A Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5508 = new FieldBean (55, "Transaction Type 055 9C Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield5509 = new FieldBean (55, "Transaction Amount 055 9F02 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5510 = new FieldBean (55, "Other Cash Back Amount 055 9F03 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5511 = new FieldBean (55, "Application Version Number 055 9F09 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield5512 = new FieldBean (55, "Terminal Country Code 055 9F1A Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5513 = new FieldBean (55, "Terminal Serial Number 055 9F1E Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5514 = new FieldBean (55, "Cryptographic ARQC Data 055 9F26 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5515 = new FieldBean (55, "Terminal Profile Flags 055 9F33 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5516 = new FieldBean (55, "Terminal Type 055 9F35 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5517 = new FieldBean (55, "ATC Data 055 9F36 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield5518 = new FieldBean (55, "Unpredicatble Number 055 9F37 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5519 = new FieldBean (55, "Transaction Sequence Counter 055 9F41 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5520 = new FieldBean (55, "Transaction Category Code 055 9F53 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5521 = new FieldBean (55, "Issuer Script Results 055 9F5B Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5522 = new FieldBean (55, "Form Factor 055 9F6E Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean subfield5523 = new FieldBean (55, "Issuer Application Data Flags 055 BF10 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield5524 = new FieldBean (55, "New PIN Block 055 HC Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList55.add(subfield5500);
		subFieldList55.add(subfield5501);
		subFieldList55.add(subfield5502);
		subFieldList55.add(subfield5503);
		subFieldList55.add(subfield5504);
		subFieldList55.add(subfield5505);
		subFieldList55.add(subfield5506);
		subFieldList55.add(subfield5507);
		subFieldList55.add(subfield5508);
		subFieldList55.add(subfield5509);
		
		subFieldList55.add(subfield5510);
		subFieldList55.add(subfield5511);
		subFieldList55.add(subfield5512);
		subFieldList55.add(subfield5513);
		subFieldList55.add(subfield5514);
		subFieldList55.add(subfield5515);
		subFieldList55.add(subfield5516);
		subFieldList55.add(subfield5517);
		subFieldList55.add(subfield5518);
		subFieldList55.add(subfield5519);
		
		subFieldList55.add(subfield5520);
		subFieldList55.add(subfield5521);
		subFieldList55.add(subfield5522);
		subFieldList55.add(subfield5523);
		subFieldList55.add(subfield5524);
		
		fieldList.add(subFieldList55);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList56 = new ArrayList<FieldBean>();
		
		FieldBean subfield5600 = new FieldBean (56, "Unused Bit Field 056 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList56.add(subfield5600);
		fieldList.add(subFieldList56);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList57 = new ArrayList<FieldBean>();
		
		FieldBean subfield5700 = new FieldBean (57, "Unused Bit Field 057 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList57.add(subfield5700);
		fieldList.add(subFieldList57);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList58 = new ArrayList<FieldBean>();
		
		FieldBean subfield5800 = new FieldBean (58, "Unused Bit Field 058 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList58.add(subfield5800);
		fieldList.add(subFieldList58);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList59 = new ArrayList<FieldBean>();
		
		FieldBean subfield5900 = new FieldBean (59, "National POS GEO Data 059 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList59.add(subfield5900);
		fieldList.add(subFieldList59);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList60 = new ArrayList<FieldBean>();
		
		FieldBean subfield6000 = new FieldBean (60, "Terminal Type 060 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6001 = new FieldBean (60, "Terminal Entry Capability 060 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6002 = new FieldBean (60, "Special Condition Indicator 060 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6003 = new FieldBean (60, "MOTO ECI Payment Indicator 060 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6004 = new FieldBean (60, "Partial Authorization Indicator 060 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		
		subFieldList60.add(subfield6000);
		subFieldList60.add(subfield6001);
		subFieldList60.add(subfield6002);
		subFieldList60.add(subfield6003);
		subFieldList60.add(subfield6004);
		fieldList.add(subFieldList60);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList61 = new ArrayList<FieldBean>();
		
		FieldBean subfield6100 = new FieldBean (61, "Transaction Other Amount 061 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6101 = new FieldBean (61, "Cardholder Billing Other Amount 061 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList61.add(subfield6100);
		subFieldList61.add(subfield6101);
		fieldList.add(subFieldList61);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList62 = new ArrayList<FieldBean>();
		
		FieldBean subfield6200 = new FieldBean (62, "Field Bitmap 062 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6201 = new FieldBean (62, "Authorization Character Indicator 062 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6202 = new FieldBean (62, "Transaction Identifier 062 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6203 = new FieldBean (62, "Market Specific Data Identifier 062 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6204 = new FieldBean (62, "Merchant VV 062 Subfield"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6205 = new FieldBean (62, "Card Level Results 062 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6206 = new FieldBean (62, "Program Identifier 062 Subfield"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList62.add(subfield6200);
		subFieldList62.add(subfield6201);
		subFieldList62.add(subfield6202);
		subFieldList62.add(subfield6203);
		subFieldList62.add(subfield6204);
		subFieldList62.add(subfield6205);
		subFieldList62.add(subfield6206);
		fieldList.add(subFieldList62);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList63 = new ArrayList<FieldBean>();
		
		FieldBean subfield6300 = new FieldBean (63, "Bitmap 63 Subfield"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6301 = new FieldBean (63, "Network ID Code 63 Subfield"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6302 = new FieldBean (63, "Preauthorization Time Limit 63 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6303 = new FieldBean (63, "Message Reason Code 63 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6304 = new FieldBean (63, "STIP Switch Reason Code 63 Subfield"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean subfield6305 = new FieldBean (63, "Fee Program Indicator 63 Subfield"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		subFieldList63.add(subfield6300);
		subFieldList63.add(subfield6301);
		subFieldList63.add(subfield6302);
		subFieldList63.add(subfield6303);
		subFieldList63.add(subfield6304);
		subFieldList63.add(subfield6305);
		
		fieldList.add(subFieldList63);
		
		//-----------------------------------------------------------------
		
		ArrayList<FieldBean> subFieldList64 = new ArrayList<FieldBean>();
		
		FieldBean subfield6400 = new FieldBean (64, "Message Authentication Code 064 Subfield"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		subFieldList64.add(subfield6400);
		fieldList.add(subFieldList64);
	
		return fieldList;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public void  display (List<ArrayList<FieldBean>> fieldList) {
		
		int inc = 0;
		
		for (int i = 0; i < fieldList.size(); i++) {
			
			int maximum = fieldList.get(i).size();
			
			for (int j = 0; j < maximum; j++) {
			
				System.out.format( "%5d %5d %5d %5s "
								 , inc++
							     , fieldList.get(i).get(j).getId()
							     , j
							     , fieldList.get(i).get(j).getFieldName()
//							     , fieldList.get(i).get(j).getCreateUser()
//							     , fieldList.get(i).get(j).getCreateTimestamp()
							     );
				
				System.out.println();
				
			}
			System.out.println("------------------------------------------------------------");
		}
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void  main (String [] args) {
		
		List<ArrayList<FieldBean>> fieldList =  new SubfieldTableUtils().createFields();
		
		 new SubfieldTableUtils().display(fieldList);
		 
	}
}
