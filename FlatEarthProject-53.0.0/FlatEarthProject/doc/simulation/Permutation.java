package com.system.message.utilties.permutate;

import java.util.ArrayList;
import java.util.List;

// https://en.wikipedia.org/wiki/Terminal_verification_results

//--------------------------------------------------------------------------------------
// 15th Level	Bit 55 9F6E	Form Factor Indicator			(FFI)		 5
//	7th Level	Bit 60.9 	Cardholder ID Method						 5
//	7th Level	Bit 55 9F42	Application Currency Code 
//	7th Level	DE014		Expiration date
//	7th Level	DE  44.2	Address Verification Result Code			15
//	8th Level	Bit 44.5 	CVV/dCVV Results Code						 3
//	9th Level	Bit 44.10 	It CVV2 Result Code (AN1) Used for VISA		 4
// 10th Level	Bit 44.13 	Card Authentication Verification Value 		13	(CAVV) Results Code
//	8th Level	DE  52		PIN											 2
//	15th Level	Bit 55 8E	Card Verification Method		(CVM)
//	11th Level	Bit 55 9F26 Application Request Cryptogram (ARQC)		 2	(ATC is part of the ARQC)
//--------------------------------------------------------------------------------------
//	2nd Level	DE  18		Merchant Category Code	MCC					20
//--------------------------------------------------------------------------------------
//	13th Level	Bit 60.1 	Terminal Type Code							10
//	13th Level	Bit 60.2 	Terminal Entry Capability					10
//	13th Level	Bit 60.3 	Chip Condition Code							 2
//   1st Level	Bit 60.8 	MOTO/Electronic Commerce Indicator			12
//	13th Level	Bit 60.10 	Partial Authorization / Balance Indicator	 2
//--------------------------------------------------------------------------------------
//	14th Level	Bit 55 95	Terminal Verification Results	(TVR)		40
//--------------------------------------------------------------------------------------
// 	Top Level	131,250

// 	1st Level	DE 003		Transaction Type							 7
//	1st Level	DE 003		Account From Type							 5
//	1st Level	DE 003		Account To Type								 5

//	1st Level	DE 022		Transaction Entry Mode						10
//	1st Level	DE 022		PIN Entry Mode								 5

//	1st Level	DE 025		Point Of Service Condition Code				15
//--------------------------------------------------------------------------------------
//	12th Level	Bit 55 9100 Application Response Cryptogram (APQC)		 2
//--------------------------------------------------------------------------------------
//	 1st Level	DE020		PAN extended (country code)
//  13th Level	Bit 55 9F1A Terminal Country Code
//  13th Level	Bit 55 5F2A	Transaction Currency Code
//   3rd Level	DE 019 		Acquiring institution (country code)		15
//	 6th Level	DE 040		Service restriction code					15
//--------------------------------------------------------------------------------------

public class Permutation {

	public static final int TRANSACTION_TYPE_LIST_SIZE 					= 7;
	public static final int ACCOUNT_FROM_TYPE_LIST_SIZE 				= 5;
	public static final int ACCOUNT_TO_TYPE_LIST_SIZE 					= 5;
	
	public static final int TRANSACTION_ENTRY_MODE_LIST_SIZE 			= 10;
	public static final int PIN_ENTRY_MODE_LIST_SIZE 					= 5;
	
	public static final int POINT_OF_SERVICE_CONDITION_CODE_LIST_SIZE 	= 15;
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getTransactionType (int id) {
		
		List<String> transactionTypeList = new ArrayList<String>();
		
		transactionTypeList.add("Purchase of Goods or Services");
		transactionTypeList.add("Withdrawal/Cash Advance");
		transactionTypeList.add("Cash Check");
		transactionTypeList.add("Deposit (Credit)");
		transactionTypeList.add("Available Funds Inquiry");
		transactionTypeList.add("Transfer");
		transactionTypeList.add("Bill Payments");
		
		return transactionTypeList.get(id);
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getAccountFromType (int id) {
		
		List<String> accountFromTypeList = new ArrayList<String>();
		
		accountFromTypeList.add("Not Specified");
		accountFromTypeList.add("Savings Account");
		accountFromTypeList.add("Checking Account");
		accountFromTypeList.add("Credit Card Account");
		accountFromTypeList.add("Cash Benefits Account");
		
		return accountFromTypeList.get(id);
		
	}	
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getAccountToType (int id) {
		
		List<String> accountToTypeList = new ArrayList<String>();
		
		accountToTypeList.add("Not Specified");
		accountToTypeList.add("Savings Account");
		accountToTypeList.add("Checking Account");
		accountToTypeList.add("Credit Card Account");
		accountToTypeList.add("Cash Benefits Account");
		
		return accountToTypeList.get(id);
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getTransactionEntryMode (int id) {
		
		List<String> transactionEntryMode = new ArrayList<String>();
		
		transactionEntryMode.add("Unknown or Terminal Not Used");
		transactionEntryMode.add("Manual Key Entry PAN");
		transactionEntryMode.add("Magnetic Stripes Read; CVV Checking Possible");
		transactionEntryMode.add("Bar Code Reader");
		transactionEntryMode.add("IC Cards Read; CVV or iCVV Checking Possible");
		transactionEntryMode.add("Contactless Device-Read Using VSDC Chip Data Rules");
		transactionEntryMode.add("Store and Forward");
		transactionEntryMode.add("MICR Reader");
		transactionEntryMode.add("Magnetic Stripe Read including Track 1 and 2");
		transactionEntryMode.add("Contactless Device-Read Originated using Mag Stripe");
		
		return transactionEntryMode.get(id);
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getPinEntryMode (int id) {
		
		List<String> pinEntryMode = new ArrayList<String>();
		
		pinEntryMode.add("Unknown");
		pinEntryMode.add("POS Terminal Can Accept and Forward Online PIN");
		pinEntryMode.add("POS Terminal Cannot Accept and Forward Online PIN");
		pinEntryMode.add("Terminal PIN Pad is Down");
		pinEntryMode.add("Reserved for Future Use");
		
		return pinEntryMode.get(id);
		
	}
	/************************************************************************************
	 ************************************************************************************
	 */
	public static String getPointOfServiceConditionCode (int id) {
		
		List<String> pointOfServiceConditionCodeList = new ArrayList<String>();
		
		pointOfServiceConditionCodeList.add("Normal Transaction");
		pointOfServiceConditionCodeList.add("Customer Not Present");
		pointOfServiceConditionCodeList.add("Unattended Cardholder-Activated Environments PIN Data Present");
		pointOfServiceConditionCodeList.add("Merchant Suspicious of Transaction");
		pointOfServiceConditionCodeList.add("Customer Present, Card Not Present");
		pointOfServiceConditionCodeList.add("Mail/Telephone Order");
		pointOfServiceConditionCodeList.add("Customer Identity Verified (Check Acceptance Only)");
		pointOfServiceConditionCodeList.add("Suspected Fraud");
		pointOfServiceConditionCodeList.add("Representment of Item");
		pointOfServiceConditionCodeList.add("Chargeback (validation or advice)");
		pointOfServiceConditionCodeList.add("Address/CVV2/Account without Verification");
		pointOfServiceConditionCodeList.add("POS Check Original Full Transaction or Adjustment");
		pointOfServiceConditionCodeList.add("Chargeback Reversal");
		pointOfServiceConditionCodeList.add("Electronic Commerce Request by Public Network");
		pointOfServiceConditionCodeList.add("Card Present, Magnetic Stripe Cannot Be Read");
		
		return pointOfServiceConditionCodeList.get(id);
		
	}		
	/************************************************************************************
	 ************************************************************************************
	 */		
	public void reorder()
	{
//		int count = 0;
		
		for (int i = 0; i < TRANSACTION_TYPE_LIST_SIZE; i++) {
			
			for (int j = 0; j < ACCOUNT_FROM_TYPE_LIST_SIZE; j++) {
				
				for (int k = 0; k < ACCOUNT_TO_TYPE_LIST_SIZE; k++) {
					
					for (int l = 0; l < TRANSACTION_ENTRY_MODE_LIST_SIZE; l++) {
						
						for (int m = 0; m < PIN_ENTRY_MODE_LIST_SIZE; m++) {	
						
							for (int n = 0; n < POINT_OF_SERVICE_CONDITION_CODE_LIST_SIZE; n++) {
							
								System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
								
								System.out.println("0100/0110   " 
//																+ ++count
//																+ ". "
																+ getTransactionType(i)
																+ ";"
																+ getAccountFromType(j)
																+ ";"
																+ getAccountToType(k)
																+ ";"
																+ getTransactionEntryMode(l)
																+ ";"
																+ getPinEntryMode(m)
																+ ";"
																+ getPointOfServiceConditionCode(n)
																
												   );
								
							}
						}
					 }
					
				}
				
			}
			
		}
	}
	/************************************************************************************
	 ************************************************************************************
	 */
	public static void main(String[] args) throws Exception {

		new Permutation().reorder();
		
	}

}
