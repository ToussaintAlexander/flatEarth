package com.system.message.utilties;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.system.base.constants.Element.*;

public class FieldTableUtils {

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
	public List<FieldBean>  createFields () {
		
		List<FieldBean> fieldList = new ArrayList<FieldBean>();
		
		FieldBean field00 = new FieldBean ( 0, "Unassigned"									, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field01 = new FieldBean ( 1, "Bitmap"										, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field02 = new FieldBean ( 2, "Primary Account Number"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field03 = new FieldBean ( 3, "Processing Code"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field04 = new FieldBean ( 4, "Transaction Amount"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field05 = new FieldBean ( 5, "Settlement Amount"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field06 = new FieldBean ( 6, "Cardholder Billing Amount"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field07 = new FieldBean ( 7, "Transmission Date & Time"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field08 = new FieldBean ( 8, "Cardholder Billing Fee Amount"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field09 = new FieldBean ( 9, "Setttlement Conversion Rate"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);

		FieldBean field10 = new FieldBean (10, "Cardholder Billing Conversion Rate"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field11 = new FieldBean (11, "System Trace Audit Number"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field12 = new FieldBean (12, "Local Transaction Time"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field13 = new FieldBean (13, "Local Transaction Date"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field14 = new FieldBean (14, "Expiration Date"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field15 = new FieldBean (15, "Settlement Date"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field16 = new FieldBean (16, "Conversion Date"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field17 = new FieldBean (17, "Capture Date"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field18 = new FieldBean (18, "Merchant Type"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field19 = new FieldBean (19, "Acquiring Institution Country Code"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean field20 = new FieldBean (20, "PAN Extended Country Code"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field21 = new FieldBean (21, "Forwarding Institution Country Code"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field22 = new FieldBean (22, "Point of Service Entry Mode"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field23 = new FieldBean (23, "Application PAN Sequence Number"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field24 = new FieldBean (24, "Network International Identifier"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field25 = new FieldBean (25, "Point of Service Condition Code"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field26 = new FieldBean (26, "Point of Service PIN Capture Code"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field27 = new FieldBean (27, "Authorizing Identification Response Length"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field28 = new FieldBean (28, "Transaction Fee Amount"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field29 = new FieldBean (29, "Settlement Fee Amount"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean field30 = new FieldBean (30, "Transaction Processing Fee Amount"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field31 = new FieldBean (31, "Settlement Processing Fee Amount"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field32 = new FieldBean (32, "Acquiring Institution Identification Code"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field33 = new FieldBean (33, "Forwarding Institution Identification Code"	, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field34 = new FieldBean (34, "Extended Primary Account Number"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field35 = new FieldBean (35, "Track 2 Data"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field36 = new FieldBean (36, "Track 3 Data"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field37 = new FieldBean (37, "Retrieval Reference Number"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field38 = new FieldBean (38, "Authorization Identification Response"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field39 = new FieldBean (39, "Response Code"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean field40 = new FieldBean (40, "Service Restriction Code"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field41 = new FieldBean (41, "Card Acceptor Terminal Identification"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field42 = new FieldBean (42, "Card Acceptor Identification Code"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field43 = new FieldBean (43, "Card Acceptor Name/Location"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field44 = new FieldBean (44, "Additional Response Data"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field45 = new FieldBean (45, "Track 1 Data"								, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field46 = new FieldBean (46, "Cardholder Billing Amount"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field47 = new FieldBean (47, "Transmission Date & Time"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field48 = new FieldBean (48, "Additional Data - Private"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field49 = new FieldBean (49, "Transaction Currency Code"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean field50 = new FieldBean (50, "Settlement Currency Code"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field51 = new FieldBean (51, "Cardholder Billing Currency Code"			, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field52 = new FieldBean (52, "Personal Identification Number"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field53 = new FieldBean (53, "Security-Related Control Information"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field54 = new FieldBean (54, "Additional Amount"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field55 = new FieldBean (55, "Integrated Circuit Card Related Data"		, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field56 = new FieldBean (56, "Unused Bit Field"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field57 = new FieldBean (57, "Unused Bit Field"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field58 = new FieldBean (58, "Unused Bit Field"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field59 = new FieldBean (59, "National POS GEO Data"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		FieldBean field60 = new FieldBean (60, "Additional POS Information"					, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field61 = new FieldBean (61, "Bitmap"										, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field62 = new FieldBean (62, "Custom Payment Service"						, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field63 = new FieldBean (63, "Private-Use Field"							, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		FieldBean field64 = new FieldBean (64, "Message Authentication Code"				, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field00);	fieldList.add(field01);	fieldList.add(field02);	fieldList.add(field03);	
		fieldList.add(field04);	fieldList.add(field05);	fieldList.add(field06);	fieldList.add(field07);
		fieldList.add(field08);	fieldList.add(field09);	fieldList.add(field10);	fieldList.add(field11);
		fieldList.add(field12);	fieldList.add(field13);	fieldList.add(field14);	fieldList.add(field15);
		fieldList.add(field16);	fieldList.add(field17);	fieldList.add(field18);	fieldList.add(field19);
		fieldList.add(field20);	fieldList.add(field21);	fieldList.add(field22);	fieldList.add(field23);
		fieldList.add(field24);	fieldList.add(field25);	fieldList.add(field26);	fieldList.add(field27);
		fieldList.add(field28);	fieldList.add(field29);	fieldList.add(field30);	fieldList.add(field31);
		fieldList.add(field32);	fieldList.add(field33);	fieldList.add(field34);	fieldList.add(field35);
		fieldList.add(field36);	fieldList.add(field37);	fieldList.add(field38);	fieldList.add(field39);
		fieldList.add(field40);	fieldList.add(field41);	fieldList.add(field42);	fieldList.add(field43);
		fieldList.add(field44);	fieldList.add(field45);	fieldList.add(field46);	fieldList.add(field47);
		fieldList.add(field48);	fieldList.add(field49);	fieldList.add(field50);	fieldList.add(field51);
		fieldList.add(field52);	fieldList.add(field53);	fieldList.add(field54);	fieldList.add(field55);
		fieldList.add(field56);	fieldList.add(field57);	fieldList.add(field58);	fieldList.add(field59);
		fieldList.add(field60);	fieldList.add(field61);	fieldList.add(field62);	fieldList.add(field63);
		
		fieldList.add(field64);
		
		return fieldList;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public void  display (List<FieldBean> fieldList) {
		
		for (int i = 0; i < fieldList.size(); i++) {
			
			System.out.println("ID................. = " + fieldList.get(i).getId()				);
			System.out.println("Field..............	= " + fieldList.get(i).getFieldName()			);
//			System.out.println("Description 		= " + fieldList.get(i).getDescription()		);
			
			System.out.println("Create User........	= " + fieldList.get(i).getCreateUser()		);
			System.out.println("Create Timestamp...	= " + fieldList.get(i).getCreateTimestamp()	);
//			System.out.println("Modify User 		= " + fieldList.get(i).getModifyUser()		);
//			System.out.println("Modify Timestamp 	= " + fieldList.get(i).getModifyTimestamp()	);
			System.out.println();
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void  main (String [] args) {
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		 new FieldTableUtils().display(fieldList);
		 
	}
}
