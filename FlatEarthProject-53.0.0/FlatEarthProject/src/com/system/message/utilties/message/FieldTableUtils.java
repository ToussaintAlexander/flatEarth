package com.system.message.utilties.message;

import java.util.ArrayList;
import java.util.List;

import static com.system.configuration.constants.Element.*;

public class FieldTableUtils {

	/***********************************************************************************
	 ***********************************************************************************
	 */
	public List<FieldBean>  createFields () {
		
		List<FieldBean> fieldList = new ArrayList<FieldBean>();
		
		List<String> subfieldList = null;	//new ArrayList<String>();
		
		FieldBean field = new FieldBean ( 0, "Placeholder Field", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;	 
		
		field = new FieldBean ( 1, "Primary Bitmap", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Bank Identification Number");
		subfieldList.add("Primary Account Number");
		subfieldList.add("Check Digit");
		
		field = new FieldBean ( 2, "Primary Account Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Transaction Type");
		subfieldList.add("Account From Type");
		subfieldList.add("Account To Type");
		
		field = new FieldBean ( 3, "Processing Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 4, "Transaction Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 5, "Settlement Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 6, "Cardholder Billing Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Transmission Date Month");
		subfieldList.add("Transmission Date Day");
		subfieldList.add("Transmission Time Hour");
		subfieldList.add("Transmission Time Minute");
		subfieldList.add("Transmission Time Second");
		
		field = new FieldBean ( 7, "Transmission Date & Time", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 8, "Cardholder Billing Fee Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 9, "Settlement Conversion Rate", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 10, "Cardholder Billing Conversion Rate", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
	
		subfieldList = null;
		
		field = new FieldBean ( 11, "System Trace Audit Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 12, "Local Transaction Time", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 13, "Local Transaction Date", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Expiration Year");
		subfieldList.add("Expiration Month");
		
		field = new FieldBean ( 14, "Expiration Date", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Settlement Year");
		subfieldList.add("Settlement Month");
		
		field = new FieldBean ( 15, "Settlement Date", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Conversion Year");
		subfieldList.add("Conversion Month");
		
		field = new FieldBean ( 16, "Conversion Date", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Capture Month");
		subfieldList.add("Capture Day");
		
		field = new FieldBean ( 17, "Capture Date", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 18, "Merchant Type", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 19, "Acquiring Institution Country Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 20, "PAN Extended Country Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 21, "Forwarding Institution Country Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Transaction Entry Mode");
		subfieldList.add("PIN Entry Mode");
		
		field = new FieldBean ( 22, "Point of Service Entry Mode", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 23, "Application PAN Sequence Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 24, "Function Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 25, "Point of Service Condition Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 26, "Point of Service PIN Capture Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 27, "Authorizing Identification Response Length", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Account  Entry");
		subfieldList.add("Transaction Fee Amount");
		
		field = new FieldBean ( 28, "Transaction Fee Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Account  Entry");
		subfieldList.add("Settlement Fee Amount");
		
		field = new FieldBean ( 29, "Settlement Fee Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Account  Entry");
		subfieldList.add("Transaction Processing Fee Amount");
		
		field = new FieldBean ( 30, "Transaction Processing Fee Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Account  Entry");
		subfieldList.add("Settlement Processing Fee Amount");
		
		field = new FieldBean ( 31, "Settlement Processing Fee Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 32, "Acquiring Institution Identification Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 33, "Forwarding Institution Identification Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 34, "Extended Primary Account Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Start Sentinel");
		subfieldList.add("Bank Identification Number");
		subfieldList.add("Primary Account Number");
		subfieldList.add("Check Digit");
		subfieldList.add("Field Separator");
		subfieldList.add("Expiration Date Year");
		subfieldList.add("Expiration Date Month");
		subfieldList.add("Service Code");
		subfieldList.add("PIN Value Key Indicator");
		subfieldList.add("PIN Verification Value");
		subfieldList.add("Card Verification Value");
		subfieldList.add("End Sentinel");
		subfieldList.add("Long Redundancy Check Character");
		
		field = new FieldBean ( 35, "Track 2 Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Start Sentinel");
		subfieldList.add("Format Code");
		subfieldList.add("Bank Identification Number");
		subfieldList.add("Primary Account Number");
		subfieldList.add("Check Digit");
		subfieldList.add("Field Separator");
		subfieldList.add("Country Code");
		subfieldList.add("Currency Code");
		subfieldList.add("Currency Exponent");
		subfieldList.add("Amount Authorized Per Cycle");
		subfieldList.add("Amount Remaining This Cycle");
		subfieldList.add("Cycle Begin");
		subfieldList.add("Cycle Length");
		subfieldList.add("Retry Count");
		subfieldList.add("PIN Control Parameters");
		subfieldList.add("Interchange Control Parameters");
		subfieldList.add("PAN Service Restriction");
		subfieldList.add("SAN 1 Service Restriction");
		subfieldList.add("SAN 2 Service Restriction");
		subfieldList.add("Expiration Date Year");
		subfieldList.add("Expiration Date Month");
		subfieldList.add("Card Sequence Number");
		subfieldList.add("Card Security Number");
		subfieldList.add("First Subsidiary Account Number");
		subfieldList.add("Second Subsidiary Account Number");
		subfieldList.add("Relay Marker");
		subfieldList.add("Cryptographic Check Digits");
		subfieldList.add("PIN Value Key Indicator");
		subfieldList.add("PIN Verification Value");
		subfieldList.add("Card Verification Value");
		subfieldList.add("End Sentinel");
		subfieldList.add("Long Redundancy Check Character");
		
		field = new FieldBean ( 36, "Track 3 Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Transmission Date Year");
		subfieldList.add("Julian Day Month");
		subfieldList.add("Transmission Time Hour");
		subfieldList.add("System Trace Audit Number");
		
		field = new FieldBean ( 37, "Retrieval Reference Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 38, "Authorization Identification Response", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 39, "Response Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 40, "Service Restriction Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 41, "Card Acceptor Terminal Identification", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 42, "Card Acceptor Identification Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Street Address");
		subfieldList.add("City");
		subfieldList.add("State");
		subfieldList.add("Country");
		
		field = new FieldBean ( 43, "Card Acceptor Name/Location", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Response Source");
		subfieldList.add("Address Verification Result Code");
		subfieldList.add("CVV Results Code");
		subfieldList.add("Card Authentication Results Code");
		subfieldList.add("CVV2 Results Code");
		subfieldList.add("CAVV Results Code");
		
		field = new FieldBean ( 44, "Additional Response Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Start Sentinel");
		subfieldList.add("Format Code");
		subfieldList.add("Bank Identification Number");
		subfieldList.add("Primary Account Number");
		subfieldList.add("Check Digit");
		subfieldList.add("Field Separator");
		subfieldList.add("Full Name");
		subfieldList.add("Field Separator");
		subfieldList.add("Expiration Date Year");
		subfieldList.add("Expiration Date Month");
		subfieldList.add("Service Code");
		subfieldList.add("PIN Value Key Indicator");
		subfieldList.add("PIN Verification Value");
		subfieldList.add("Card Verification Value");
		subfieldList.add("End Sentinel");
		subfieldList.add("Long Redundancy Check Character");
		
		field = new FieldBean ( 45, "Track 3 Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 46, "Additional Data (ISO)", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 47, "Additional Data (National)", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 48, "Additional Data (Private)", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 49, "Transaction Currency Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 50, "Settlement Currency Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 51, "Cardholder Billing Currency Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 52, "Personal Identification Number", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Key Management Scheme");
		subfieldList.add("Key Set Identifier");
		subfieldList.add("Encryption Algorithm");
		subfieldList.add("Key Length");
		subfieldList.add("Protection Mechanism");
		subfieldList.add("Reserved National");
		subfieldList.add("Reserved Private");
		
		field = new FieldBean ( 53, "Security-Related Control Information", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Account Type");
		subfieldList.add("Amount Type");
		subfieldList.add("Currency Code");
		subfieldList.add("Account Entry");
		subfieldList.add("Amount");
		
		field = new FieldBean ( 54, "Additional Amount", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Tag 5F2A Transaction Currency Code");
		subfieldList.add("Tag 7100 Issuer Scripts");
		subfieldList.add("Tag 7200 Issuer Scripts");
		subfieldList.add("Tag 8200 Appl Inter Profile Falgs");
		subfieldList.add("Tag 8400 Dedicated FName");
		subfieldList.add("Tag 9100 Issuer ARPC");
		subfieldList.add("Tag 9500 TVR Flags");
		subfieldList.add("Tag 9A   Transaction Date");
		subfieldList.add("Tag 9C   Transaction Type");
		subfieldList.add("Tag 9F02 Transaction Amount");
		subfieldList.add("Tag 9F03 Other Cash Back Amount");
		subfieldList.add("Tag 9F09 Application Version Number");
		subfieldList.add("Tag 9F1A Terminal Country Code");
		subfieldList.add("Tag 9F1E Terminal Serial Number");
		subfieldList.add("Tag 9F26 Cryptographic ARQC Data");
		subfieldList.add("Tag 9F33 Terminal Profile Flags");
		subfieldList.add("Tag 9F35 Terminal Type");
		subfieldList.add("Tag 9F36 ATC Data");
		subfieldList.add("Tag 9F37 Unpredictable Number");
		subfieldList.add("Tag 9F41 Transaction Sequence Counter");
		subfieldList.add("Tag 9F53 Transaction Category Code");
		subfieldList.add("Tag 9F5B Issuer Script Results");
		subfieldList.add("Tag 9F6E Form Factor");
		subfieldList.add("Tag BF10 Issuer Application Data Flags");
		subfieldList.add("Tag HC   New PIN Block");

		field = new FieldBean ( 55, "Integrated Circuit Card Related Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 56, "Unassigned Field", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 57, "Unassigned Field", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = null;
		
		field = new FieldBean ( 58, "Unassigned Field", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("State Code");
		subfieldList.add("County Code");
		subfieldList.add("Postal Service Code");
		subfieldList.add("Country Code");

		field = new FieldBean ( 59, "National POS GEO Data", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Terminal Type");
		subfieldList.add("Terminal Entry Capability");
		subfieldList.add("Chip Condition Code");
		subfieldList.add("Chip Authentication Reliability Indicator");
		subfieldList.add("MOTO ECI Payment Indicator");
		subfieldList.add("Cardholder ID Method");
		subfieldList.add("Partial Authorization Indicator");

		field = new FieldBean ( 60, "Additional POS Information", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Transaction Other Amount");
		subfieldList.add("Cardholder Billing Other Amount");

		field = new FieldBean ( 61, "Bitmap", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Field Bitmap");
		subfieldList.add("Auth Character Indicator");
		subfieldList.add("Transaction Identifier");
		subfieldList.add("Market Specific Data Identifier");
		subfieldList.add("Merchant VV");
		subfieldList.add("Card Level Results");
		subfieldList.add("Program Identifier");

		field = new FieldBean ( 62, "Custom Payment Service", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Field Bitmap");
		subfieldList.add("Network ID Code");
		subfieldList.add("Preauth Time Limit");
		subfieldList.add("Message Reason Code");
		subfieldList.add("STIP Switch Reason Code");

		field = new FieldBean ( 63, "Private-Use Field", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		//-----------------------------------------------------------------
		
		subfieldList = new ArrayList<String>();
		
		subfieldList.add("Field Bitmap");
		subfieldList.add("Network ID Code");
		subfieldList.add("Preauth Time Limit");
		subfieldList.add("Message Reason Code");
		subfieldList.add("STIP Switch Reason Code");

		field = new FieldBean ( 64, "Message Authentication Code", subfieldList, CREATE_USER, CREATE_TIMESTAMP, MODIFY_USER, MODIFY_TIMESTAMP);
		
		fieldList.add(field);
		
		return fieldList;
 
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public void  load (List<FieldBean> fieldList) {
		
		int maximum;
		String subfieldName = null;
		
		for (int i = 0; i < fieldList.size(); i++) {
			
			maximum = fieldList.get(i).getSubFieldName() == null ? 0 : fieldList.get(i).getSubFieldName().size();
			
			if (maximum != 0) {
			
			for (int j = 0; j < maximum; j++)
				
				System.out.println (
								     fieldList.get(i).getId() 
						           + " " 
						           + fieldList.get(i).getFieldName()	
						           + " " 
						           + fieldList.get(i).getSubFieldName().get(j)
						           + " "
						           + fieldList.get(i).getCreateUser()
						           + " "
						           + fieldList.get(i).getCreateTimestamp()
						           + " "
						           + fieldList.get(i).getModifyUser()
						           + " "
						           + fieldList.get(i).getModifyTimestamp()
						           );
				
			} else {
				
				System.out.println (
								     fieldList.get(i).getId() 
						           + " " 
						           + fieldList.get(i).getFieldName()	
						           + " " 
						           + subfieldName
						           + " "
						           + fieldList.get(i).getCreateUser()
						           + " "
						           + fieldList.get(i).getCreateTimestamp()
						           + " "
						           + fieldList.get(i).getModifyUser()
						           + " "
						           + fieldList.get(i).getModifyTimestamp()
						           );
			}
			
			System.out.println();
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public void  display (List<FieldBean> fieldList) {
		
		int maximum;
		
		for (int i = 0; i < fieldList.size(); i++) {
			
			System.out.println("ID..................  " + fieldList.get(i).getId()				);
			System.out.println("Field Name..........	 " + fieldList.get(i).getFieldName() + "\n"		);
			
			maximum = fieldList.get(i).getSubFieldName() == null ? 0 : fieldList.get(i).getSubFieldName().size();
			
			if (maximum != 0) {
			
			for (int j = 0; j < maximum; j++)
				System.out.println("SubField Name.......	 " + fieldList.get(i).getSubFieldName().get(j));
			
			} else {
				System.out.println("SubField Name.......	 " + "null");
			}
			
			System.out.println("\nCreate User........	 " + fieldList.get(i).getCreateUser()		);
			System.out.println("Create Timestamp...	 " + fieldList.get(i).getCreateTimestamp()	);
			System.out.println("Modify User 		 " + fieldList.get(i).getModifyUser()		);
			System.out.println("Modify Timestamp 	 " + fieldList.get(i).getModifyTimestamp()	);
			System.out.println();
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void  main (String [] args) {
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
//		 new FieldTableUtils().display(fieldList);
		 new FieldTableUtils().load(fieldList);
		 
	}
}
