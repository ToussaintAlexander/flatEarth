package com.system.message.utilties.codes;

import static com.system.configuration.constants.Element.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;
import com.system.message.utilties.message.CodeBean;

public class CodeTableUtils {

	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertTypeCode (int value) {

		String type = null;
		
		switch (value) {
		
			case ADDRESS_RULE_TYPE:			type = "Address Rule Type";			break;
			case COMPOSITE_RULE_TYPE:		type = "Composite Rule Type";		break;
			case CONSTANT_RULE_TYPE:		type = "Constant Rule Type";		break;
			case DATABASE_RULE_TYPE:		type = "Database Rule Type";		break;
			case NUMERIC_RULE_TYPE:			type = "Numeric Rule Type";			break;
			case UNASSIGNED_RULE_TYPE:		type = "Unassigned Rule Type";		break;
			
			default:						type = "Unknown Format";			break;
				
		}
		
		return type;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertGroupCode (int value) {

		String group = null;
		
		switch (value) {
		
			case ADDRESS_RULE_GROUP:		group = "Address Rule Group";		break;
			case ARITHMETIC_RULE_GROUP:		group = "Arithmetic Rule Group";	break;
			case BITMAP_RULE_GROUP:			group = "Bitmap Rule Group";		break;
			case CHARACTER_RULE_GROUP:		group = "Character Rule Group";	break;
			case CITY_RULE_GROUP:			group = "City Rule Group";			break;
			case CODE_RULE_GROUP:			group = "Code Rule Group";			break;
			case COUNTRY_RULE_GROUP:		group = "Country Rule Group";		break;
			case CURRENCY_RULE_GROUP:		group = "Currency Rule Group";		break;
			case DATE_TIME_RULE_GROUP:		group = "Date Time Rule Group";	break;
			case EXACT_RULE_GROUP:			group = "Exact Rule Group";		break;
			case RANGE_RULE_GROUP:			group = "Range Rule Group";		break;
			case RATE_RULE_GROUP:			group = "Rate Rule Group";			break;
			case SEQUENCE_RULE_GROUP:		group = "Sequence Rule Group";		break;
			case STATE_RULE_GROUP:			group = "State Rule Group";		break;
			case UNASSIGNED_RULE_GROUP:		group = "Unassigned Rule Group";	break;
			
			default:						group = "Unknown Format";			break;
				
		}
		
		return group;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertBLevelCode (int value) {

		String format = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		format = "Fixed Format";		break;
			case VARIABLE_FORMAT:	format = "Variable Format";		break;
			
			default:				format = "Unknown Format";		break;
				
		}
		
		return format;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertALevelCode (int value) {

		String format = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		format = "Fixed Format";		break;
			case VARIABLE_FORMAT:	format = "Variable Format";		break;
			
			default:				format = "Unknown Format";		break;
				
		}
		
		return format;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertTLevelCode (int value) {

		String format = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		format = "Fixed Format";		break;
			case VARIABLE_FORMAT:	format = "Variable Format";		break;
			
			default:				format = "Unknown Format";		break;
				
		}
		
		return format;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertFormatCode (int value) {

		String format = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		format = "Fixed Format";		break;
			case VARIABLE_FORMAT:	format = "Variable Format";		break;
			
			default:				format = "Unknown Format";		break;
				
		}
		
		return format;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertEncodingCode (int value) {

		String encoding = null;
		
		switch (value) {
		
			case ASCII_ENCODING:	encoding = "ASCII";				break;
			case EBCDIC_ENCODING:	encoding = "EBCDIC";			break;
			
			default:				encoding = "Unknown Encoding";	break;
				
		}
		
		return encoding;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */		
	public String convertDataTypeCode  (int value) {

		String dataType = null;
		
		switch (value) {
		
			case ALPHABETIC_DATATYPE:			dataType = "Alphabetic";			break;
			case ALPHANUMERIC_DATATYPE:			dataType = "Alphanumeric";			break;
			case ALPHANUMERIC_SPECIAL_DATATYPE:	dataType = "Alphanumeric Special";	break;
			case BINARY_DATATYPE:				dataType = "Binary";				break;
			case DATE_DATATYPE:					dataType = "Date";					break;
			case NUMERIC_DATATYPE:				dataType = "Numeric";				break;
			case NUMERIC_SPECIAL_DATATYPE:		dataType = "Numeric Special";		break;
			case SPECIAL_DATATYPE:				dataType = "Special";				break;
			case TIMESTAMP_DATATYPE:			dataType = "Timestamp";				break;
			
			default:							dataType = "Unknown Data Type";		break;
				
		}
		
		return dataType;
		 
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertSourceCode (int value) {

		String source = null;
		
		switch (value) {
		
			case CARDHOLDER_FROM_SOURCE		:	source = "From Cardholder";		break;
			case MERCHANT_FROM_SOURCE		:	source = "From Merchant";		break;
			case ACQUIRER_FROM_SOURCE		:	source = "From Acquirer";		break;
			case ASSOCIATION_FROM_SOURCE	:	source = "From Association";	break;
			case ISSUER_FROM_SOURCE			:	source = "From Issuer";			break;
			case CLIENT_FROM_SOURCE			:	source = "From Client";			break;
			case CLIENT_TO_SOURCE			:	source = "To Client";			break;
			case ISSUER_TO_SOURCE			:	source = "To Issuer";			break;
			case ASSOCIATION_TO_SOURCE		:	source = "To Association";		break;
			case ACQUIRER_TO_SOURCE			:	source = "To Acquirer";			break;
			case MERCHANT_TO_SOURCE			:	source = "To Merchant";			break;
			case CARDHOLDER_TO_SOURCE		:	source = "To Cardholder";		break;
			
			default							:	source = "Unknown Source";		break;
				
		}
		
		return source;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertDirectionCode (int value) {

		String direction = null;
		
		switch (value) {
		
		case CARDHOLDER_FROM_DIRECTION		:	direction = "Cardholder->Merchant";		break;
		case MERCHANT_FROM_DIRECTION		:	direction = "Merchant->Acquirer";		break;
		case ACQUIRER_FROM_DIRECTION		:	direction = "Acquirer->Association";	break;
		case ASSOCIATION_FROM_DIRECTION		:	direction = "Association->Issuer";		break;
		case ISSUER_FROM_DIRECTION			:	direction = "Issuer->Client";			break;
		case CLIENT_FROM_DIRECTION			:	direction = "Client->Issuer";			break;
		case ISSUER_TO_DIRECTION			:	direction = "Issuer->Association";		break;
		case ASSOCIATION_TO_DIRECTION		:	direction = "Association->Acquirer";	break;
		case ACQUIRER_TO_DIRECTION			:	direction = "Acquirer->Merchant";		break;
		case MERCHANT_TO_DIRECTION			:	direction = "Merchant->Cardholder";		break;
			
		default								:	direction = "Unknown Direction";	break;
				
		}
		
		return direction;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertExistenceCode (int value) {

		String existence = null;
		
		switch (value) {
		
			case CONDITIONAL_ADDED		:	existence = "Conditionally Added Data Element";			break;
			case CONDITIONAL_PRESENCE	:	existence = "Conditionally Prescence Data Element";		break;
			case CONDITIONAL_REMOVED	:	existence = "Conditionally Removed Data Element";		break;
			
			case MANDATORY_ADDED		:	existence = "Mandatory Added Data Element";				break;
			case MANDATORY_PRESENCE		:	existence = "Mandatory Prescence Data Element";			break;
			case MANDATORY_REMOVED		:	existence = "Mandatory Removed Data Element";			break;
			
			case OPTIONAL_ADDED			:	existence = "Optional Added Data Element";				break;
			case OPTIONAL_PRESENCE		:	existence = "Optional Prescence Data Element";			break;
			case OPTIONAL_REMOVED		:	existence = "Optional Removed Data Element";			break;
			
			default						:	existence = "Unknown Existence";						break;
				
		}
		
		return existence;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertChangeCode (int value) {

		String change = null;
		
		switch (value) {
		
			case ELEMENT_FIXED:		change = "Element Fixed";		break;
			case ELEMENT_ADDED:		change = "Element Added";		break;
			case ELEMENT_REMOVED:	change = "Element Removed";		break;
			case ELEMENT_CHANGED:	change = "Element Change";		break;
			
			default:				change = "Unknown Change";		break;
				
		}
		
		return change;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertBinLevel (BinLevel value) {

		int totalWeight = value.getBinWeightCenter() 
					    + value.getBinWeightLeft() 
					    * value.getBinWeightRight();
		
		return String.valueOf(totalWeight);
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertAccountLevel (AcctLevel value) {

		int totalWeight = value.getAccountWeightCenter() 
			            + value.getAccountWeightLeft() 
			            * value.getAccountWeightRight();
		
		return String.valueOf(totalWeight);
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertTransLevel (TransLevel value) {

		int totalWeight = value.getTransactionWeightCenter() 
	                    + value.getTransactionWeightLeft() 
	                    * value.getTransactionWeightRight();

		
		return String.valueOf(totalWeight);
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertValueCode (String value) {

		return value;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertASCIItoBinary (String value) {

		  byte[] bytes = value.getBytes();
		  StringBuilder binary = new StringBuilder();
		  
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++)
		     {
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		
		return binary.toString();
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertASCIItoHexadecmal (String value) {

		String hexadecimalString = null;
		
	    for (char ch : value.toCharArray()) {
	    	
	    	hexadecimalString = hexadecimalString + Integer.toHexString(ch) + " ";
	        
	    } // prints "31 32 2e 30 31 33 "
		
	    return hexadecimalString;
	    
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertASCIItoEBCDIC (String ascii) {

        Charset charsetEBCDIC = Charset.forName("CP037");
        Charset charsetACSII = Charset.forName("US-ASCII");

        //String ascII = "MMMMMM";
        System.out.println("String ASCII: " + ascii);
        //System.out.println("String converted to EBCDIC: " + convertTO(ascII, charsetACSII, charsetEBCDIC));
        
        return convertTO(ascii, charsetACSII, charsetEBCDIC);
        
    }
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertEBCDICtoASCII (String ebcdic) {

        Charset charsetEBCDIC = Charset.forName("CP037");
        Charset charsetACSII = Charset.forName("US-ASCII");

        //String ebcdic = "(((((((";
        System.out.println("String EBCDIC: " + ebcdic);
        //System.out.println("String converted to ASCII: " + convertTO(ebcdic, charsetEBCDIC, charsetACSII));
        
        return convertTO(ebcdic, charsetACSII, charsetEBCDIC);
        
    }
	/******************************************************************************
	 ******************************************************************************
	 */
    public static String convertTO(String dados, Charset encondingFrom, Charset encondingTo) {
    	
        return new String(dados.getBytes(encondingFrom), encondingTo);
        
    }
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFireCode (boolean value) {

		String fire = null;
		
		if (value)
			fire = "Rule Fired";
		else
			fire = "Rule Not Fired";
		
		return fire;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFireCode (int value) {

		String fire = null;
		
		if ( value == 1)
			fire = "Rule Fired";
		else
			fire = "Rule Not Fired";
		
		return fire;
		
	}
	/***********************************************************************************
	***********************************************************************************
	*/
	public List<CodeBean> createCodes () {
		
		List<CodeBean> codeTableRowList = new ArrayList<CodeBean>();
		
		// DE 001 Bitmap 					- N/A
		// DE 002 Primary Account Number 	- N/A
		
		// DE 003 SF 01	Transaction Type					 
		// DE 055 SF 9C Transaction Type
		
		CodeBean codeTableRow03010 = new CodeBean( 0,  3, 0, "10", "Purchase of Goods or Services"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03011 = new CodeBean( 0,  3, 0, "20", "Withdrawal/Cash Advance"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03012 = new CodeBean( 0,  3, 0, "30", "Cash Check"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03013 = new CodeBean( 0,  3, 0, "40", "Deposit (Credit)"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03014 = new CodeBean( 0,  3, 0, "50", "Available Funds Inquiry"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03015 = new CodeBean( 0,  3, 0, "60", "Transfer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03016 = new CodeBean( 0,  3, 0, "70", "Bill Payments"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow03010);
		codeTableRowList.add(codeTableRow03011);
		codeTableRowList.add(codeTableRow03012);
		codeTableRowList.add(codeTableRow03013);
		codeTableRowList.add(codeTableRow03014);
		codeTableRowList.add(codeTableRow03015);
		codeTableRowList.add(codeTableRow03016);
		
		// DE 003 SF 02	Account Type From					 
		// DE 054 SF 00 Additional Amounts Account Type
		
		CodeBean codeTableRow03020 = new CodeBean( 0,  3, 1, "10", "Not Specified"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03021 = new CodeBean( 0,  3, 1, "20", "Savings Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03022 = new CodeBean( 0,  3, 1, "30", "Checking Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03023 = new CodeBean( 0,  3, 1, "40", "Credit Card Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03024 = new CodeBean( 0,  3, 1, "50", "Cash Benefits Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow03020);
		codeTableRowList.add(codeTableRow03021);
		codeTableRowList.add(codeTableRow03022);
		codeTableRowList.add(codeTableRow03023);
		codeTableRowList.add(codeTableRow03024);
		
		// DE 003 SF 03	Account Type To						 
		// DE 054 SF 00 Additional Amounts Account Type
		
		CodeBean codeTableRow03030 = new CodeBean( 0,  3, 2, "10", "Not Specified"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03031 = new CodeBean( 0,  3, 2, "20", "Savings Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03032 = new CodeBean( 0,  3, 2, "30", "Checking Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03033 = new CodeBean( 0,  3, 2, "40", "Credit Card Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03034 = new CodeBean( 0,  3, 2, "50", "Cash Benefits Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow03030);
		codeTableRowList.add(codeTableRow03031);
		codeTableRowList.add(codeTableRow03032);
		codeTableRowList.add(codeTableRow03033);
		codeTableRowList.add(codeTableRow03034);
		
		// DE 004 Transaction Amount					- N/A
		// DE 005 Settlement Amount						- N/A
		// DE 006 Cardholder Billing Amount				- N/A
		// DE 055 SF 9F02 Transaction Amount			- N/A
		
		// DE 007 Transmission Date Time				- N/A
		// DE 008 Cardholder Billing Fee Amount			- N/A
		
		// DE 009 Settlement Conversion Rate			- N/A
		// DE 010 Cardholder Billing Conversion Rate	- N/A
		
		// DE 011 System Trace Audit Number				- N/A
		// DE 012 Local Transaction Time (hhmmss)		- N/A
		// DE 013 Local TransactionDate (MMDD)			- N/A
		// DE 014 Expiration Date						- N/A
		// DE 015 Settlement Date						- N/A
		// DE 016 Conversion Date						- N/A
		// DE 017 Capture Date							- N/A
		
		// DE 018 SF 00	Merchant Type	 
		
		CodeBean codeTableRow18000 = new CodeBean( 0,   18,   -1, "1520", "General Contractors/Residential and Commerical"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18001 = new CodeBean( 0,   18,   -1, "3002", "Pan American Airlines"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18002 = new CodeBean( 0,   18,   -1, "3393", "National Car Rental"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18003 = new CodeBean( 0,   18,   -1, "3501", "Holiday Inn Express"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800B = new CodeBean( 0,   18,   -1, "4829", "Money Orders – Wire Transfer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18004 = new CodeBean( 0,   18,   -1, "4900", "Utilities - Electric, Gas, Water"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18005 = new CodeBean( 0,   18,   -1, "5045", "Computers, Peripheral Equipment, Software"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800A = new CodeBean( 0,   18,   -1, "5122", "Drugs and Drug Proprietors"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800C = new CodeBean( 0,   18,   -1, "5172", "Petroleum and Petroleum Products"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18006 = new CodeBean( 0,   18,   -1, "5411", "Grocery Stores, Supermarkets"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18007 = new CodeBean( 0,   18,   -1, "5541", "Service Stations"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18008 = new CodeBean( 0,   18,   -1, "5542", "Automated Fuel Dispenser"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18009 = new CodeBean( 0,   18,   -1, "5651", "Family Clothing Stores"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800D = new CodeBean( 0,   18,   -1, "5971", "Art Dealers and Galleries"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18010 = new CodeBean( 0,   18,   -1, "6011", "Automated Cash"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18011 = new CodeBean( 0,   18,   -1, "7298", "Health and Beauty Spas"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18012 = new CodeBean( 0,   18,   -1, "7372", "Computer Programming, Integrated Systems Design"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18013 = new CodeBean( 0,   18,   -1, "7832", "Motion Picture Theatres"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18014 = new CodeBean( 0,   18,   -1, "8111", "Legal Services, Attorneys"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18015 = new CodeBean( 0,   18,   -1, "9311", "Tax Payments"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow18000);
		codeTableRowList.add(codeTableRow18001);
		codeTableRowList.add(codeTableRow18002);
		codeTableRowList.add(codeTableRow18003);
		codeTableRowList.add(codeTableRow1800B);
		codeTableRowList.add(codeTableRow18004);
		codeTableRowList.add(codeTableRow18005);
		codeTableRowList.add(codeTableRow1800A);
		codeTableRowList.add(codeTableRow1800C);
		codeTableRowList.add(codeTableRow18006);
		
		codeTableRowList.add(codeTableRow18007);
		codeTableRowList.add(codeTableRow18008);
		codeTableRowList.add(codeTableRow18009);
		codeTableRowList.add(codeTableRow1800D);
		codeTableRowList.add(codeTableRow18010);
		codeTableRowList.add(codeTableRow18011);
		codeTableRowList.add(codeTableRow18012);
		codeTableRowList.add(codeTableRow18013);
		codeTableRowList.add(codeTableRow18014);
		codeTableRowList.add(codeTableRow18015);
		
		// DE 019 SF 00	Acquiring Institution Country Code	n 3
		// DE 020 SF 00	Pan Extended Country Code
		// DE 021 SF 00	Forwarding Institution Country Code
		// DE 049 SF 00 Transaction Currency Code
		// DE 050 SF 00 Settlement Currency Code
		// DE 051 SF 00 Cardholder Billing Currency Code
		// DE 054 SF 02 Currency Code 
		// DE 055 SF 5F2A Transaction Currency Code
		// DE 055 SF 9F1A Terminal Country Code
		// DE 059 SF 01 National POS Geographic Data Country Code positions 15-17
		
		CodeBean codeTableRow19000 = new CodeBean( 0,  19,  -1, "036", "Australia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19001 = new CodeBean( 0,  19,  -1, "076", "Brazil"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19002 = new CodeBean( 0,  19,  -1, "124", "Canada"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19003 = new CodeBean( 0,  19,  -1, "156", "China"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19004 = new CodeBean( 0,  19,  -1, "250", "France"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19005 = new CodeBean( 0,  19,  -1, "276", "Germany"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19006 = new CodeBean( 0,  19,  -1, "356", "India"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19007 = new CodeBean( 0,  19,  -1, "380", "Italy"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19008 = new CodeBean( 0,  19,  -1, "392", "Japan"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19009 = new CodeBean( 0,  19,  -1, "484", "Mexico"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19010 = new CodeBean( 0,  19,  -1, "643", "Russian Federation"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19011 = new CodeBean( 0,  19,  -1, "682", "Saudi Arabia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19012 = new CodeBean( 0,  19,  -1, "724", "Spain"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19013 = new CodeBean( 0,  19,  -1, "826", "United Kingdom"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19014 = new CodeBean( 0,  19,  -1, "840", "United States of America"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow19000);
		codeTableRowList.add(codeTableRow19001);
		codeTableRowList.add(codeTableRow19002);
		codeTableRowList.add(codeTableRow19003);
		codeTableRowList.add(codeTableRow19004);
		codeTableRowList.add(codeTableRow19005);
		codeTableRowList.add(codeTableRow19006);
		codeTableRowList.add(codeTableRow19007);
		codeTableRowList.add(codeTableRow19008);
		codeTableRowList.add(codeTableRow19009);
		codeTableRowList.add(codeTableRow19010);
		codeTableRowList.add(codeTableRow19011);
		codeTableRowList.add(codeTableRow19012);
		codeTableRowList.add(codeTableRow19013);
		codeTableRowList.add(codeTableRow19014);
		
		// DE 020 SF 00	Pan Extended Country Code
		
		CodeBean codeTableRow20000 = new CodeBean( 0,  20,  -1, "036", "Australia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20001 = new CodeBean( 0,  20,  -1, "076", "Brazil"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20002 = new CodeBean( 0,  20,  -1, "124", "Canada"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20003 = new CodeBean( 0,  20,  -1, "156", "China"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20004 = new CodeBean( 0,  20,  -1, "250", "France"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20005 = new CodeBean( 0,  20,  -1, "276", "Germany"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20006 = new CodeBean( 0,  20,  -1, "356", "India"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20007 = new CodeBean( 0,  20,  -1, "380", "Italy"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20008 = new CodeBean( 0,  20,  -1, "392", "Japan"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20009 = new CodeBean( 0,  20,  -1, "484", "Mexico"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20010 = new CodeBean( 0,  20,  -1, "643", "Russian Federation"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20011 = new CodeBean( 0,  20,  -1, "682", "Saudi Arabia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20012 = new CodeBean( 0,  20,  -1, "724", "Spain"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20013 = new CodeBean( 0,  20,  -1, "826", "United Kingdom"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow20014 = new CodeBean( 0,  20,  -1, "840", "United States of America"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow20000);
		codeTableRowList.add(codeTableRow20001);
		codeTableRowList.add(codeTableRow20002);
		codeTableRowList.add(codeTableRow20003);
		codeTableRowList.add(codeTableRow20004);
		codeTableRowList.add(codeTableRow20005);
		codeTableRowList.add(codeTableRow20006);
		codeTableRowList.add(codeTableRow20007);
		codeTableRowList.add(codeTableRow20008);
		codeTableRowList.add(codeTableRow20009);
		codeTableRowList.add(codeTableRow20010);
		codeTableRowList.add(codeTableRow20011);
		codeTableRowList.add(codeTableRow20012);
		codeTableRowList.add(codeTableRow20013);
		codeTableRowList.add(codeTableRow20014);
		
		// DE 021 SF 00	Forwarding Institution Country Code
		
		CodeBean codeTableRow21000 = new CodeBean( 0,  21,  -1, "036", "Australia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21001 = new CodeBean( 0,  21,  -1, "076", "Brazil"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21002 = new CodeBean( 0,  21,  -1, "124", "Canada"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21003 = new CodeBean( 0,  21,  -1, "156", "China"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21004 = new CodeBean( 0,  21,  -1, "250", "France"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21005 = new CodeBean( 0,  21,  -1, "276", "Germany"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21006 = new CodeBean( 0,  21,  -1, "356", "India"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21007 = new CodeBean( 0,  21,  -1, "380", "Italy"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21008 = new CodeBean( 0,  21,  -1, "392", "Japan"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21009 = new CodeBean( 0,  21,  -1, "484", "Mexico"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21010 = new CodeBean( 0,  21,  -1, "643", "Russian Federation"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21011 = new CodeBean( 0,  21,  -1, "682", "Saudi Arabia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21012 = new CodeBean( 0,  21,  -1, "724", "Spain"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21013 = new CodeBean( 0,  21,  -1, "826", "United Kingdom"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow21014 = new CodeBean( 0,  21,  -1, "840", "United States of America"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
	
		codeTableRowList.add(codeTableRow21000);
		codeTableRowList.add(codeTableRow21001);
		codeTableRowList.add(codeTableRow21002);
		codeTableRowList.add(codeTableRow21003);
		codeTableRowList.add(codeTableRow21004);
		codeTableRowList.add(codeTableRow21005);
		codeTableRowList.add(codeTableRow21006);
		codeTableRowList.add(codeTableRow21007);
		codeTableRowList.add(codeTableRow21008);
		codeTableRowList.add(codeTableRow21009);
		codeTableRowList.add(codeTableRow21010);
		codeTableRowList.add(codeTableRow21011);
		codeTableRowList.add(codeTableRow21012);
		codeTableRowList.add(codeTableRow21013);
		codeTableRowList.add(codeTableRow21014);
		
		// DE 022 SF 00	PAN and Transaction Entry Mode  n 2
		
		CodeBean codeTableRow22000 = new CodeBean( 0,  22,  0, "10", "Unknown or Terminal Not Used"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22001 = new CodeBean( 0,  22,  0, "15", "Manual Key Entry PAN"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22002 = new CodeBean( 0,  22,  0, "20", "Magnetic Stripes Read; CVV Checking Possible"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22003 = new CodeBean( 0,  22,  0, "25", "Bar Code Reader"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22005 = new CodeBean( 0,  22,  0, "30", "IC Cards Read; CVV or iCVV Checking Possible"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22007 = new CodeBean( 0,  22,  0, "35", "Contactless Device-Read Using VSDC Chip Data Rules"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22008 = new CodeBean( 0,  22,  0, "40", "Store and Forward"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22009 = new CodeBean( 0,  22,  0, "45", "MICR Reader"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22011 = new CodeBean( 0,  22,  0, "50", "Magnetic Stripe Read including Track 1 & 2"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22012 = new CodeBean( 0,  22,  0, "55", "Contactless Device-Read Originated using Mag Stripe"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow22000);
		codeTableRowList.add(codeTableRow22001);
		codeTableRowList.add(codeTableRow22002);
		codeTableRowList.add(codeTableRow22003);
		codeTableRowList.add(codeTableRow22005);
		codeTableRowList.add(codeTableRow22007);
		codeTableRowList.add(codeTableRow22008);
		codeTableRowList.add(codeTableRow22009);
		codeTableRowList.add(codeTableRow22011);
		codeTableRowList.add(codeTableRow22012);
		
		// DE 022 SF 01	PIN Entry Capability n 1
		
		CodeBean codeTableRow22015 = new CodeBean( 0,  22,  1, "1", "Unknown"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22016 = new CodeBean( 0,  22,  1, "2", "POS Terminal Can Accept and Forward Online PIN"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22017 = new CodeBean( 0,  22,  1, "3", "POS Terminal Cannot Accept and Forward Online PIN"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22018 = new CodeBean( 0,  22,  1, "4", "Terminal PIN Pad is Down"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22019 = new CodeBean( 0,  22,  1, "5", "Reserved for Future Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow22015);
		codeTableRowList.add(codeTableRow22016);
		codeTableRowList.add(codeTableRow22017);
		codeTableRowList.add(codeTableRow22018);
		codeTableRowList.add(codeTableRow22019);
		
		// DE 023 Application PAN Sequence Number
		// DE 024 Function Code
		
		// DE 025 00 Point of Service Condition Code
		
		CodeBean codeTableRow25000 = new CodeBean( 0,  25,  -1, "10", "Normal Transaction"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25001 = new CodeBean( 0,  25,  -1, "15", "Customer Not Present"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25002 = new CodeBean( 0,  25,  -1, "20", "Unattended Cardholder-Activated Environments PIN Data Present"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25003 = new CodeBean( 0,  25,  -1, "25", "Merchant Suspicious of Transaction"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25004 = new CodeBean( 0,  25,  -1, "30", "Customer Present, Card Not Present"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25006 = new CodeBean( 0,  25,  -1, "35", "Mail/Telephone Order"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25007 = new CodeBean( 0,  25,  -1, "40", "Customer Identity Verified (Check Acceptance Only)"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25008 = new CodeBean( 0,  25,  -1, "45", "Suspected Fraud"													, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25010 = new CodeBean( 0,  25,  -1, "50", "Representment of Item"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25011 = new CodeBean( 0,  25,  -1, "55", "Chargeback (validation or advice)"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25012 = new CodeBean( 0,  25,  -1, "60", "Address/CVV2/Account without Verification"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25013 = new CodeBean( 0,  25,  -1, "65", "POS Check Original Full Transaction or Adjustment"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25014 = new CodeBean( 0,  25,  -1, "70", "Chargeback Reversal"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25016 = new CodeBean( 0,  25,  -1, "75", "Electronic Commerce Request by Public Network"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25017 = new CodeBean( 0,  25,  -1, "80", "Card Present, Magnetic Stripe Cannot Be Read"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow25000);
		codeTableRowList.add(codeTableRow25001);
		codeTableRowList.add(codeTableRow25002);
		codeTableRowList.add(codeTableRow25003);
		codeTableRowList.add(codeTableRow25004);
		
		codeTableRowList.add(codeTableRow25006);
		codeTableRowList.add(codeTableRow25007);
		codeTableRowList.add(codeTableRow25008);
		codeTableRowList.add(codeTableRow25010);
		codeTableRowList.add(codeTableRow25011);
		
		codeTableRowList.add(codeTableRow25012);
		codeTableRowList.add(codeTableRow25013);
		codeTableRowList.add(codeTableRow25014);
		codeTableRowList.add(codeTableRow25016);
		codeTableRowList.add(codeTableRow25017);
		
		// DE 026 Point of Service Capture Code
		// DE 027 Authorizing Identification Response Length		
		
		// DE 028 00 Transaction Fee Amount Account Entry
		// DE 029 00 Settlement Fee Amount Account Entry
		// DE 030 00 Transaction Processing Fee Amount Account Entry
		// DE 031 00 Settlement Processing Fee Amount Account Entry
		// DE 054 03 Additional Amounts Account Entry
		
		CodeBean codeTableRow28000 = new CodeBean( 0,  28,  0, "10", "Credit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow28001 = new CodeBean( 0,  28,  0, "20", "Debit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow28000);
		codeTableRowList.add(codeTableRow28001);
		
		// DE 029 00 Settlement Fee Amount Account Entry
		
		CodeBean codeTableRow29000 = new CodeBean( 0,  29,  0, "10", "Credit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow29001 = new CodeBean( 0,  29,  0, "20", "Debit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow29000);
		codeTableRowList.add(codeTableRow29001);
		
		// DE 030 00 Transaction Processing Fee Amount Account Entry
		
		CodeBean codeTableRow30000 = new CodeBean( 0,  30,  0, "10", "Credit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow30001 = new CodeBean( 0,  30,  0, "20", "Debit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow30000);
		codeTableRowList.add(codeTableRow30001);

		// DE 031 00 Settlement Processing Fee Amount Account Entry
		
		CodeBean codeTableRow31000 = new CodeBean( 0,  31,  0, "10", "Credit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow31001 = new CodeBean( 0,  31,  0, "20", "Debit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow31000);
		codeTableRowList.add(codeTableRow31001);
		
		// DE 032 00 Acquiring Institution Identification Code	n...11
		// DE 033 00 Forwarding Institution Identification Code
		
		CodeBean codeTableRow32000 = new CodeBean( 0,  32,  -1, "12507500100", "Acquiring Institution 000"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32001 = new CodeBean( 0,  32,  -1, "12507500200", "Acquiring Institution 100"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32002 = new CodeBean( 0,  32,  -1, "12507500300", "Acquiring Institution 200"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32003 = new CodeBean( 0,  32,  -1, "12507500400", "Acquiring Institution 300"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32004 = new CodeBean( 0,  32,  -1, "12507500500", "Acquiring Institution 400"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32005 = new CodeBean( 0,  32,  -1, "12507500550", "Acquiring Institution 500"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32006 = new CodeBean( 0,  32,  -1, "12507500600", "Acquiring Institution 600"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32007 = new CodeBean( 0,  32,  -1, "12507500700", "Acquiring Institution 700"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32008 = new CodeBean( 0,  32,  -1, "12507500800", "Acquiring Institution 800"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32009 = new CodeBean( 0,  32,  -1, "12507500900", "Acquiring Institution 900"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow32000);
		codeTableRowList.add(codeTableRow32001);
		codeTableRowList.add(codeTableRow32002);
		codeTableRowList.add(codeTableRow32003);
		codeTableRowList.add(codeTableRow32004);
		codeTableRowList.add(codeTableRow32005);
		codeTableRowList.add(codeTableRow32006);
		codeTableRowList.add(codeTableRow32007);
		codeTableRowList.add(codeTableRow32008);
		codeTableRowList.add(codeTableRow32009);

		// DE 033 00 Forwarding Institution Identification Code
		
		CodeBean codeTableRow33000 = new CodeBean( 0,  33,  -1,  "12507500100", "Forwarding Institution 000"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33001 = new CodeBean( 0,  33,  -1,  "12507500200", "Forwarding Institution 100"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33002 = new CodeBean( 0,  33,  -1,  "12507500300", "Forwarding Institution 200"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33003 = new CodeBean( 0,  33,  -1,  "12507500400", "Forwarding Institution 300"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33004 = new CodeBean( 0,  33,  -1,  "12507500500", "Forwarding Institution 400"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33005 = new CodeBean( 0,  33,  -1,  "12507500550", "Forwarding Institution 500"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33006 = new CodeBean( 0,  33,  -1,  "12507500600", "Forwarding Institution 600"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33007 = new CodeBean( 0,  33,  -1,  "12507500700", "Forwarding Institution 700"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33008 = new CodeBean( 0,  33,  -1,  "12507500800", "Forwarding Institution 800"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow33009 = new CodeBean( 0,  33,  -1,  "12507500900", "Forwarding Institution 900"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow33000);
		codeTableRowList.add(codeTableRow33001);
		codeTableRowList.add(codeTableRow33002);
		codeTableRowList.add(codeTableRow33003);
		codeTableRowList.add(codeTableRow33004);
		codeTableRowList.add(codeTableRow33005);
		codeTableRowList.add(codeTableRow33006);
		codeTableRowList.add(codeTableRow33007);
		codeTableRowList.add(codeTableRow33008);
		codeTableRowList.add(codeTableRow33009);
		
		// DE 034 Extended Primary Account Number
		
		// DE 035 Track 2 Data - SC: Service Code. 3 digits:
		
		// Digit 1 (most significant): Interchange and technology:
		
		CodeBean codeTableRow35000 = new CodeBean( 0,  35, 0, "1", "Available for international interchange."										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35001 = new CodeBean( 0,  35, 0, "5", "Available for national interchange only, except under bilateral agreement."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35002 = new CodeBean( 0,  35, 0, "7", "Not available for general interchange, except under bilateral agreement."		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		codeTableRowList.add(codeTableRow35000);
		codeTableRowList.add(codeTableRow35001);
		codeTableRowList.add(codeTableRow35002);
		
		// Digit 2: Authorization processing:
		
		CodeBean codeTableRow35010 = new CodeBean( 0,  35, 1, "1", "Transactions are authorized following the normal rules."		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35011 = new CodeBean( 0,  35, 1, "2", "Transactions are authorized by issuer and should be online."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35012 = new CodeBean( 0,  35, 1, "5", "Reserved for future use by ISO."								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		codeTableRowList.add(codeTableRow35010);
		codeTableRowList.add(codeTableRow35011);
		codeTableRowList.add(codeTableRow35012);
		
		// Digit 3 (least significant): Range of services and PIN requirements:
		
		CodeBean codeTableRow35020 = new CodeBean( 0,  35, 2, "0", "No restrictions and PIN required."					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35021 = new CodeBean( 0,  35, 2, "2", "Goods and services only (no cash)."					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35022 = new CodeBean( 0,  35, 2, "3", "ATM only and PIN required."							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35023 = new CodeBean( 0,  35, 2, "4", "Cash only."											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35024 = new CodeBean( 0,  35, 2, "5", "Goods and services only (no cash) and PIN required."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow35025 = new CodeBean( 0,  35, 2, "6", "No restrictions and require PIN when feasible."		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		codeTableRowList.add(codeTableRow35020);
		codeTableRowList.add(codeTableRow35021);
		codeTableRowList.add(codeTableRow35022);
		codeTableRowList.add(codeTableRow35023);
		codeTableRowList.add(codeTableRow35024);
		codeTableRowList.add(codeTableRow35025);
		
		// DE 036 Track 3 Data
		// Country Code
		// Currency Code
		
/*		
			FC: Format Code. 2 digits:

			00: Not valid for international interchange.
			01-02: Bank/financial. These are the formats described here.
			03-19: Reserved for future use by ISO/TC 68.
			20-89: Reserved for future use by ISO/TC 95 SC 17.
			90-99: Reserved for proprietary use of card issuer, but not for international interchange.
			
			CL: Cycle Length. 2 digits:

			00: Infinite, AR should be decremented but never reset.
			01-79: Number of days.
			80: Cycle begin each 7 days.
			81: Cycle begin each 14 days.
			82: Cycle begins each 1st and 15th days of every month.
			83: Cycle begins the day of the month specified in CB of every month.
			84: Cycle begins the day of the month specified in CB of every third month.
			85: Cycle begins the day of the month specified in CB of every sixth month.
			86: Cycle begins the day of the year specified in CB of every year.
			87-89: Reserved for future use by ISO/TC 68.
			90-99: Reserved for proprietary use of card issuer, but not for international interchange.

			This field represents the duration of the cycle for which the AA limit holds.
			
			IC: Interchange Control. 1 digit:

0: No restriction.
1: Not available for international interchange.
2-8: Limited interchange, only local use and under agreement.
9: Limited interchange, recommended for test cards.

PANSR: PAN Service Restriction. 2 digits:

The first digit defines the type of account:

0: Associated account number not encoded on track.
1: Savings account.
2: Current or checking account.
3: Credit card account.
4: Generic or universal account.
5: Interest-bearing current or checking account.
6-8: Reserved for future use by ISO/TC 68.
9: Reserved for card issuer's internal use, not for interchange.

The second digit defines the service restrictions:

0: No restrictions.
1: No cash dispense.
2: No point of sale (POS) transaction.
3: No cash dispense and no POS transaction.
4: Authorization required.
5-7: Reserved for future use by ISO/TC 68.
8-9: Reserved for card issuer's internal use, only local use and under agreement.

CScN: Card Security Number. 9 digits:

The first digit represents the algorithm used to calculate a verification value to validate 
the information on the magnetic track against the embossed characters, where 0-4 are available 
for national use, 5-8 are available for international security methods given by ISO/TC 68, and 9 
is reserved for private use. Next 8 digits are the verification value.

RM: Relay Marker. 1 digit:

0: Include AD and DD fields in transactions messages.
1: Do not include AD field in transactions messages.
2: Do not include DD field in transactions messages.
3-9: Invalid.

*/		
		// DE 037 Retrieval Reference Number
		
		// DE 038 00 Authorization Identification Response	an 6
		
		CodeBean codeTableRow38000 = new CodeBean( 0,  38,  -1, "100000", "000ABC"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38001 = new CodeBean( 0,  38,  -1, "150000", "100BCD"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38002 = new CodeBean( 0,  38,  -1, "200000", "200CDE"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38003 = new CodeBean( 0,  38,  -1, "250000", "300DEF"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38004 = new CodeBean( 0,  38,  -1, "300000", "400EFG"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38005 = new CodeBean( 0,  38,  -1, "350000", "500FGH"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38006 = new CodeBean( 0,  38,  -1, "400000", "600GHI"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38007 = new CodeBean( 0,  38,  -1, "450000", "700HIJ"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38008 = new CodeBean( 0,  38,  -1, "500000", "800IJK"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38009 = new CodeBean( 0,  38,  -1, "550000", "900JKL"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow38000);
		codeTableRowList.add(codeTableRow38001);
		codeTableRowList.add(codeTableRow38002);
		codeTableRowList.add(codeTableRow38003);
		codeTableRowList.add(codeTableRow38004);
		codeTableRowList.add(codeTableRow38005);
		codeTableRowList.add(codeTableRow38006);
		codeTableRowList.add(codeTableRow38007);
		codeTableRowList.add(codeTableRow38008);
		codeTableRowList.add(codeTableRow38009);
		
		// DE 039 00 Response Code							 
		// DE 044 11 Original Response Code
		
		CodeBean codeTableRow39000 = new CodeBean( 0,  39,  -1,  "0", "Successful approval"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39001 = new CodeBean( 0,  39,  -1,  "1", "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39002 = new CodeBean( 0,  39,  -1,  "2", "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39003 = new CodeBean( 0,  39,  -1,  "3", "Invalid merchant or service provider"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39004 = new CodeBean( 0,  39,  -1,  "4", "Pickup card"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39005 = new CodeBean( 0,  39,  -1,  "5", "Do not honor"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39006 = new CodeBean( 0,  39,  -1,  "6", "General Error"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39007 = new CodeBean( 0,  39,  -1,  "7", "Pickup card not lost or stolen card"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39008 = new CodeBean( 0,  39,  -1,  "8", "Honor with identification"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39009 = new CodeBean( 0,  39,  -1,  "9", "Request in progress"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39010 = new CodeBean( 0,  39,  -1, "10", "Partial Approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39011 = new CodeBean( 0,  39,  -1, "11", "V.I.P. approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39012 = new CodeBean( 0,  39,  -1, "12", "Invalid transaction"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39013 = new CodeBean( 0,  39,  -1, "13", "Invalid amount"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39014 = new CodeBean( 0,  39,  -1, "14", "Invalid account number"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39015 = new CodeBean( 0,  39,  -1, "15", "No such issuer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39016 = new CodeBean( 0,  39,  -1, "16", "Insufficient funds"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39017 = new CodeBean( 0,  39,  -1, "17", "Customer cancellation"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39018 = new CodeBean( 0,  39,  -1, "18", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39019 = new CodeBean( 0,  39,  -1, "19", "Re-enter transaction"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39020 = new CodeBean( 0,  39,  -1, "20", "Invalid response"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39021 = new CodeBean( 0,  39,  -1, "21", "No action taken"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39022 = new CodeBean( 0,  39,  -1, "22", "Suspected Malfunction"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39023 = new CodeBean( 0,  39,  -1, "23", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39024 = new CodeBean( 0,  39,  -1, "24", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39025 = new CodeBean( 0,  39,  -1, "25", "Unable to locate record in file"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39026 = new CodeBean( 0,  39,  -1, "26", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39027 = new CodeBean( 0,  39,  -1, "27", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39028 = new CodeBean( 0,  39,  -1, "28", "File is temporarily unavailable"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39029 = new CodeBean( 0,  39,  -1, "29", "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39030 = new CodeBean( 0,  39,  -1, "30", "Format Error"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39031 = new CodeBean( 0,  39,  -1, "31", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39032 = new CodeBean( 0,  39,  -1, "32", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39033 = new CodeBean( 0,  39,  -1, "33", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39034 = new CodeBean( 0,  39,  -1, "34", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39035 = new CodeBean( 0,  39,  -1, "35", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39036 = new CodeBean( 0,  39,  -1, "36", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39037 = new CodeBean( 0,  39,  -1, "37", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39038 = new CodeBean( 0,  39,  -1, "38", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39039 = new CodeBean( 0,  39,  -1, "39", "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39040 = new CodeBean( 0,  39,  -1, "40", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39041 = new CodeBean( 0,  39,  -1, "41", "Pickup card (lost card)"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39042 = new CodeBean( 0,  39,  -1, "42", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39043 = new CodeBean( 0,  39,  -1, "43", "Pickup card (stolen card)"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39044 = new CodeBean( 0,  39,  -1, "44", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39045 = new CodeBean( 0,  39,  -1, "45", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39046 = new CodeBean( 0,  39,  -1, "46", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39047 = new CodeBean( 0,  39,  -1, "47", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39048 = new CodeBean( 0,  39,  -1, "48", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39049 = new CodeBean( 0,  39,  -1, "49", "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39050 = new CodeBean( 0,  39,  -1, "50", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39051 = new CodeBean( 0,  39,  -1, "51", "Insufficient funds"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39052 = new CodeBean( 0,  39,  -1, "52", "No checking account"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39053 = new CodeBean( 0,  39,  -1, "53", "No savings account"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39054 = new CodeBean( 0,  39,  -1, "54", "Expired card"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39055 = new CodeBean( 0,  39,  -1, "55", "Incorrect PIN"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39056 = new CodeBean( 0,  39,  -1, "56", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39057 = new CodeBean( 0,  39,  -1, "57", "Transaction not permitted to cardholder"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39058 = new CodeBean( 0,  39,  -1, "58", "Transaction not allowed at terminal"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39059 = new CodeBean( 0,  39,  -1, "59", "Suspected fraud"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow39060 = new CodeBean( 0,  39,  -1, "60", "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39061 = new CodeBean( 0,  39,  -1, "61", "Activity amount limit exceeded"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39062 = new CodeBean( 0,  39,  -1, "62", "Restricted card"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39063 = new CodeBean( 0,  39,  -1, "63", "Security violation"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39064 = new CodeBean( 0,  39,  -1, "64", "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39065 = new CodeBean( 0,  39,  -1, "65", "Activity count limit exceeded"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39066 = new CodeBean( 0,  39,  -1, "66", "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39067 = new CodeBean( 0,  39,  -1, "67", "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39068 = new CodeBean( 0,  39,  -1, "68", "Response received too late"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39069 = new CodeBean( 0,  39,  -1, "69", "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow39070 = new CodeBean( 0,  39,  -1, "70", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39071 = new CodeBean( 0,  39,  -1, "71", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39072 = new CodeBean( 0,  39,  -1, "72", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39073 = new CodeBean( 0,  39,  -1, "73", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39074 = new CodeBean( 0,  39,  -1, "74", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39075 = new CodeBean( 0,  39,  -1, "75", "Allowable number of PIN-entry tries exceeded"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39076 = new CodeBean( 0,  39,  -1, "76", "Unable to locate previous message"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39077 = new CodeBean( 0,  39,  -1, "77", "repeat or reversal data are inconsistent with original message"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39078 = new CodeBean( 0,  39,  -1, "78", "Blocked, first used"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39079 = new CodeBean( 0,  39,  -1, "79", "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
	
		CodeBean codeTableRow39080 = new CodeBean( 0,  39,  -1, "80", "credit issuer unavailable"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39081 = new CodeBean( 0,  39,  -1, "81", "PIN cryptographic error found"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39082 = new CodeBean( 0,  39,  -1, "82", "Negative CAM, dCVV, iCVV, or CVV results"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39083 = new CodeBean( 0,  39,  -1, "83", "Unable to verify PIN"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39084 = new CodeBean( 0,  39,  -1, "84", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39085 = new CodeBean( 0,  39,  -1, "85", "No reason to decline a request"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39086 = new CodeBean( 0,  39,  -1, "86", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39087 = new CodeBean( 0,  39,  -1, "87", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39088 = new CodeBean( 0,  39,  -1, "88", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39089 = new CodeBean( 0,  39,  -1, "89", "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39090 = new CodeBean( 0,  39,  -1, "90", "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39091 = new CodeBean( 0,  39,  -1, "91", "Issuer unavailable or switch inoperative"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39092 = new CodeBean( 0,  39,  -1, "92", "Destination cannot be found for routing"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39093 = new CodeBean( 0,  39,  -1, "93", "Transaction cannot be completed, violation of law"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39094 = new CodeBean( 0,  39,  -1, "94", "Duplicate Transmission"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39095 = new CodeBean( 0,  39,  -1, "95", "Reconcile error"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39096 = new CodeBean( 0,  39,  -1, "96", "System malfunction"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39097 = new CodeBean( 0,  39,  -1, "97", "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39098 = new CodeBean( 0,  39,  -1, "98", "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39099 = new CodeBean( 0,  39,  -1, "99", "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);		

		CodeBean codeTableRow39100 = new CodeBean( 0,  39,  -1, "B1", "Surcharge amount not permitted on Visa cards"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39101 = new CodeBean( 0,  39,  -1, "N0", "Force STIP"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39102 = new CodeBean( 0,  39,  -1, "N3", "Cash service not available"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39103 = new CodeBean( 0,  39,  -1, "N4", "Cash back request exceeds issuer limit"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39104 = new CodeBean( 0,  39,  -1, "N7", "Decline for CVV2 failure"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39105 = new CodeBean( 0,  39,  -1, "P2", "Invalid biller information"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39106 = new CodeBean( 0,  39,  -1, "P5", "PIN Change/Unblock request declined"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39107 = new CodeBean( 0,  39,  -1, "P6", "Unsafe PIN"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39108 = new CodeBean( 0,  39,  -1, "Q1", "Card Authentication failed"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39109 = new CodeBean( 0,  39,  -1, "R0", "Stop Payment Order"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);	

		CodeBean codeTableRow39110 = new CodeBean( 0,  39,  -1, "R1", "Revocation of Authorization Order"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39111 = new CodeBean( 0,  39,  -1, "R3", "Revocation of All Authorizations Order"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39112 = new CodeBean( 0,  39,  -1, "XA", "Destination cannot be found for routing"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39113 = new CodeBean( 0,  39,  -1, "XD", "Forward to issuer"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39114 = new CodeBean( 0,  39,  -1, "Z3", "Unable to go online"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow39000);
		codeTableRowList.add(codeTableRow39001);
		codeTableRowList.add(codeTableRow39002);
		codeTableRowList.add(codeTableRow39003);
		codeTableRowList.add(codeTableRow39004);
		codeTableRowList.add(codeTableRow39005);
		codeTableRowList.add(codeTableRow39006);
		codeTableRowList.add(codeTableRow39007);
		codeTableRowList.add(codeTableRow39008);
		codeTableRowList.add(codeTableRow39009);

		codeTableRowList.add(codeTableRow39010);
		codeTableRowList.add(codeTableRow39011);
		codeTableRowList.add(codeTableRow39012);
		codeTableRowList.add(codeTableRow39013);
		codeTableRowList.add(codeTableRow39014);
		codeTableRowList.add(codeTableRow39015);
		codeTableRowList.add(codeTableRow39016);
		codeTableRowList.add(codeTableRow39017);
		codeTableRowList.add(codeTableRow39018);
		codeTableRowList.add(codeTableRow39019);
		
		codeTableRowList.add(codeTableRow39020);
		codeTableRowList.add(codeTableRow39021);
		codeTableRowList.add(codeTableRow39022);
		codeTableRowList.add(codeTableRow39023);
		codeTableRowList.add(codeTableRow39024);
		codeTableRowList.add(codeTableRow39025);
		codeTableRowList.add(codeTableRow39026);
		codeTableRowList.add(codeTableRow39027);
		codeTableRowList.add(codeTableRow39028);
		codeTableRowList.add(codeTableRow39029);
		
		codeTableRowList.add(codeTableRow39030);
		codeTableRowList.add(codeTableRow39031);
		codeTableRowList.add(codeTableRow39032);
		codeTableRowList.add(codeTableRow39033);
		codeTableRowList.add(codeTableRow39034);
		codeTableRowList.add(codeTableRow39035);
		codeTableRowList.add(codeTableRow39036);
		codeTableRowList.add(codeTableRow39037);
		codeTableRowList.add(codeTableRow39038);
		codeTableRowList.add(codeTableRow39039);
		
		codeTableRowList.add(codeTableRow39040);
		codeTableRowList.add(codeTableRow39041);
		codeTableRowList.add(codeTableRow39042);
		codeTableRowList.add(codeTableRow39043);
		codeTableRowList.add(codeTableRow39044);
		codeTableRowList.add(codeTableRow39045);
		codeTableRowList.add(codeTableRow39046);
		codeTableRowList.add(codeTableRow39047);
		codeTableRowList.add(codeTableRow39048);
		codeTableRowList.add(codeTableRow39049);
		
		codeTableRowList.add(codeTableRow39050);
		codeTableRowList.add(codeTableRow39051);
		codeTableRowList.add(codeTableRow39052);
		codeTableRowList.add(codeTableRow39053);
		codeTableRowList.add(codeTableRow39054);
		codeTableRowList.add(codeTableRow39055);
		codeTableRowList.add(codeTableRow39056);
		codeTableRowList.add(codeTableRow39057);
		codeTableRowList.add(codeTableRow39058);
		codeTableRowList.add(codeTableRow39059);

		codeTableRowList.add(codeTableRow39060);
		codeTableRowList.add(codeTableRow39061);
		codeTableRowList.add(codeTableRow39062);
		codeTableRowList.add(codeTableRow39063);
		codeTableRowList.add(codeTableRow39064);
		codeTableRowList.add(codeTableRow39065);
		codeTableRowList.add(codeTableRow39066);
		codeTableRowList.add(codeTableRow39067);
		codeTableRowList.add(codeTableRow39068);
		codeTableRowList.add(codeTableRow39069);
		
		codeTableRowList.add(codeTableRow39070);
		codeTableRowList.add(codeTableRow39071);
		codeTableRowList.add(codeTableRow39072);
		codeTableRowList.add(codeTableRow39073);
		codeTableRowList.add(codeTableRow39074);
		codeTableRowList.add(codeTableRow39075);
		codeTableRowList.add(codeTableRow39076);
		codeTableRowList.add(codeTableRow39077);
		codeTableRowList.add(codeTableRow39078);
		codeTableRowList.add(codeTableRow39079);
		
		codeTableRowList.add(codeTableRow39080);
		codeTableRowList.add(codeTableRow39081);
		codeTableRowList.add(codeTableRow39082);
		codeTableRowList.add(codeTableRow39083);
		codeTableRowList.add(codeTableRow39084);
		codeTableRowList.add(codeTableRow39085);
		codeTableRowList.add(codeTableRow39086);
		codeTableRowList.add(codeTableRow39087);
		codeTableRowList.add(codeTableRow39088);
		codeTableRowList.add(codeTableRow39089);
		
		codeTableRowList.add(codeTableRow39090);
		codeTableRowList.add(codeTableRow39091);
		codeTableRowList.add(codeTableRow39092);
		codeTableRowList.add(codeTableRow39093);
		codeTableRowList.add(codeTableRow39094);
		codeTableRowList.add(codeTableRow39095);
		codeTableRowList.add(codeTableRow39096);
		codeTableRowList.add(codeTableRow39097);
		codeTableRowList.add(codeTableRow39098);
		codeTableRowList.add(codeTableRow39099);
		
		codeTableRowList.add(codeTableRow39100);
		codeTableRowList.add(codeTableRow39101);
		codeTableRowList.add(codeTableRow39102);
		codeTableRowList.add(codeTableRow39103);
		codeTableRowList.add(codeTableRow39104);
		codeTableRowList.add(codeTableRow39105);
		codeTableRowList.add(codeTableRow39106);
		codeTableRowList.add(codeTableRow39107);
		codeTableRowList.add(codeTableRow39108);
		codeTableRowList.add(codeTableRow39109);
		
		codeTableRowList.add(codeTableRow39110);
		codeTableRowList.add(codeTableRow39111);
		codeTableRowList.add(codeTableRow39112);
		codeTableRowList.add(codeTableRow39113);
		codeTableRowList.add(codeTableRow39114);
		
		// DE 040 00 Service Restriction Code		an 3
		
		CodeBean codeTableRow40000 = new CodeBean( 0,  40,  -1, "100", "Successful approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40001 = new CodeBean( 0,  40,  -1, "110", "Refer to card issuer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40002 = new CodeBean( 0,  40,  -1, "120", "Refer to card issuer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40003 = new CodeBean( 0,  40,  -1, "130", "Invalid merchant or service provider"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40004 = new CodeBean( 0,  40,  -1, "140", "Pickup card"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40005 = new CodeBean( 0,  40,  -1, "150", "Do not honor"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40006 = new CodeBean( 0,  40,  -1, "160", "General Error"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40007 = new CodeBean( 0,  40,  -1, "170", "Pickup card not lost or stolen card"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40008 = new CodeBean( 0,  40,  -1, "180", "Honor with identification"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40009 = new CodeBean( 0,  40,  -1, "190", "Request in progress"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow40000);
		codeTableRowList.add(codeTableRow40001);
		codeTableRowList.add(codeTableRow40002);
		codeTableRowList.add(codeTableRow40003);
		codeTableRowList.add(codeTableRow40004);
		codeTableRowList.add(codeTableRow40005);
		codeTableRowList.add(codeTableRow40006);
		codeTableRowList.add(codeTableRow40007);
		codeTableRowList.add(codeTableRow40008);
		codeTableRowList.add(codeTableRow40009);
		
		// DE 041 00 Card Acceptor Terminal Identification	ans 8
		
		CodeBean codeTableRow41000 = new CodeBean( 0,  41,  -1, "10101250", "Card Acceptor Terminal ID 0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41001 = new CodeBean( 0,  41,  -1, "15101500", "Card Acceptor Terminal ID 1"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41002 = new CodeBean( 0,  41,  -1, "20101750", "Card Acceptor Terminal ID 2"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41003 = new CodeBean( 0,  41,  -1, "25101200", "Card Acceptor Terminal ID 3"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41004 = new CodeBean( 0,  41,  -1, "30101650", "Card Acceptor Terminal ID 4"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41005 = new CodeBean( 0,  41,  -1, "35101300", "Card Acceptor Terminal ID 5"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41006 = new CodeBean( 0,  41,  -1, "40101150", "Card Acceptor Terminal ID 6"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41007 = new CodeBean( 0,  41,  -1, "45101300", "Card Acceptor Terminal ID 7"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41008 = new CodeBean( 0,  41,  -1, "50101950", "Card Acceptor Terminal ID 8"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41009 = new CodeBean( 0,  41,  -1, "55101800", "Card Acceptor Terminal ID 9"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow41000);
		codeTableRowList.add(codeTableRow41001);
		codeTableRowList.add(codeTableRow41002);
		codeTableRowList.add(codeTableRow41003);
		codeTableRowList.add(codeTableRow41004);
		codeTableRowList.add(codeTableRow41005);
		codeTableRowList.add(codeTableRow41006);
		codeTableRowList.add(codeTableRow41007);
		codeTableRowList.add(codeTableRow41008);
		codeTableRowList.add(codeTableRow41009);

		// DE 042 00 Card Acceptor Identification Code	ans 15	actual n=8
		
		CodeBean codeTableRow42000 = new CodeBean( 0,  42,  -1,   "10101250", "CARD-ACPTR-CODE-000"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42001 = new CodeBean( 0,  42,  -1,   "15101250", "CARD-ACPTR-CODE-100"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42002 = new CodeBean( 0,  42,  -1,   "20101250", "CARD-ACPTR-CODE-200"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42003 = new CodeBean( 0,  42,  -1,   "25101250", "CARD-ACPTR-CODE-300"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42004 = new CodeBean( 0,  42,  -1,   "30101250", "CARD-ACPTR-CODE-400"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42005 = new CodeBean( 0,  42,  -1,   "35101250", "CARD-ACPTR-CODE-500"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42006 = new CodeBean( 0,  42,  -1,   "40101250", "CARD-ACPTR-CODE-600"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42007 = new CodeBean( 0,  42,  -1,   "45101250", "CARD-ACPTR-CODE-700"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42008 = new CodeBean( 0,  42,  -1,   "50101250", "CARD-ACPTR-CODE-800"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42009 = new CodeBean( 0,  42,  -1,   "55101250", "CARD-ACPTR-CODE-900"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		codeTableRowList.add(codeTableRow42000);
		codeTableRowList.add(codeTableRow42001);
		codeTableRowList.add(codeTableRow42002);
		codeTableRowList.add(codeTableRow42003);
		codeTableRowList.add(codeTableRow42004);
		codeTableRowList.add(codeTableRow42005);
		codeTableRowList.add(codeTableRow42006);
		codeTableRowList.add(codeTableRow42007);
		codeTableRowList.add(codeTableRow42008);
		codeTableRowList.add(codeTableRow42009);
		
		// DE 043 00 Card acceptor name/location (1-23 address)		an 23 
		
		CodeBean codeTableRow43000 = new CodeBean( 0,  43,   0, "10", "125 Maple Street       "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43001 = new CodeBean( 0,  43,   0, "15", "700 Agnew Rd, Apt. #311"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43002 = new CodeBean( 0,  43,   0, "20", "One HP Nonstop Circle  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43003 = new CodeBean( 0,  43,   0, "25", "60 Cherry Wood Road    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43004 = new CodeBean( 0,  43,   0, "30", "4 Seaside View Avenue  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43005 = new CodeBean( 0,  43,   0, "35", "One Rural Route Road   "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43006 = new CodeBean( 0,  43,   0, "40", "180 Highway Road       "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43007 = new CodeBean( 0,  43,   0, "45", "700 Agnew Rd, Apt 307  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43008 = new CodeBean( 0,  43,   0, "50", "One IBM Way            "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43009 = new CodeBean( 0,  43,   0, "55", "Infinity Circle        "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow43000);
		codeTableRowList.add(codeTableRow43001);
		codeTableRowList.add(codeTableRow43002);
		codeTableRowList.add(codeTableRow43003);
		codeTableRowList.add(codeTableRow43004);
		codeTableRowList.add(codeTableRow43005);
		codeTableRowList.add(codeTableRow43006);
		codeTableRowList.add(codeTableRow43007);
		codeTableRowList.add(codeTableRow43008);
		codeTableRowList.add(codeTableRow43009);
		
		// DE 043 01 Card acceptor name/location (24-36 city)		an 13
		
		CodeBean codeTableRow43010 = new CodeBean( 0,  43,  1, "10", "Santa Clara  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43011 = new CodeBean( 0,  43,  1, "15", "Palos Verdes "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43012 = new CodeBean( 0,  43,  1, "20", "New Rochelle "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43013 = new CodeBean( 0,  43,  1, "25", "San Diego    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43014 = new CodeBean( 0,  43,  1, "30", "Rolling Hills"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43015 = new CodeBean( 0,  43,  1, "35", "Sunnyvale    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43016 = new CodeBean( 0,  43,  1, "40", "Mountain View"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43017 = new CodeBean( 0,  43,  1, "45", "Miracosta    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43018 = new CodeBean( 0,  43,  1, "50", "Costa Mesa   "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43019 = new CodeBean( 0,  43,  1, "55", "San Jose     "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow43010);
		codeTableRowList.add(codeTableRow43011);
		codeTableRowList.add(codeTableRow43012);
		codeTableRowList.add(codeTableRow43013);
		codeTableRowList.add(codeTableRow43014);
		codeTableRowList.add(codeTableRow43015);
		codeTableRowList.add(codeTableRow43016);
		codeTableRowList.add(codeTableRow43017);
		codeTableRowList.add(codeTableRow43018);
		codeTableRowList.add(codeTableRow43019);

		// DE 043 02 Card acceptor name/location (37-38 state)		a 2
		// DE 059 00 National POS Geographic Data State/Province
		// DE 059 SF 00 National POS Geographical Data (Positions 1 - 2)
		
		CodeBean codeTableRow43020 = new CodeBean( 0,  43,  2,  "0", "AL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43021 = new CodeBean( 0,  43,  2,  "1", "AK", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43022 = new CodeBean( 0,  43,  2,  "2", "AZ", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43023 = new CodeBean( 0,  43,  2,  "3", "AR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43024 = new CodeBean( 0,  43,  2,  "4", "CA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43025 = new CodeBean( 0,  43,  2,  "5", "CO", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43026 = new CodeBean( 0,  43,  2,  "6", "CT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43027 = new CodeBean( 0,  43,  2,  "7", "DE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43028 = new CodeBean( 0,  43,  2,  "8", "DC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43029 = new CodeBean( 0,  43,  2,  "9", "FL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow43030 = new CodeBean( 0,  43,  2, "10", "GA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43031 = new CodeBean( 0,  43,  2, "11", "HI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43032 = new CodeBean( 0,  43,  2, "12", "ID", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43033 = new CodeBean( 0,  43,  2, "13", "IL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43034 = new CodeBean( 0,  43,  2, "14", "IN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43035 = new CodeBean( 0,  43,  2, "15", "IA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43036 = new CodeBean( 0,  43,  2, "16", "KS", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43037 = new CodeBean( 0,  43,  2, "17", "KY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43038 = new CodeBean( 0,  43,  2, "18", "LA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43039 = new CodeBean( 0,  43,  2, "19", "ME", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43040 = new CodeBean( 0,  43,  2, "20", "MD", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43041 = new CodeBean( 0,  43,  2, "21", "MA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43042 = new CodeBean( 0,  43,  2, "22", "MI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43043 = new CodeBean( 0,  43,  2, "23", "MN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43044 = new CodeBean( 0,  43,  2, "24", "MS", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43045 = new CodeBean( 0,  43,  2, "25", "MO", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43046 = new CodeBean( 0,  43,  2, "26", "MT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43047 = new CodeBean( 0,  43,  2, "27", "NE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43048 = new CodeBean( 0,  43,  2, "28", "NV", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43049 = new CodeBean( 0,  43,  2, "29", "NH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43050 = new CodeBean( 0,  43,  2, "30", "NJ", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43051 = new CodeBean( 0,  43,  2, "31", "NM", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43052 = new CodeBean( 0,  43,  2, "32", "NY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43053 = new CodeBean( 0,  43,  2, "33", "NC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43054 = new CodeBean( 0,  43,  2, "34", "ND", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43055 = new CodeBean( 0,  43,  2, "35", "OH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43056 = new CodeBean( 0,  43,  2, "36", "OK", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43057 = new CodeBean( 0,  43,  2, "37", "OR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43058 = new CodeBean( 0,  43,  2, "38", "PA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43059 = new CodeBean( 0,  43,  2, "39", "RI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43060 = new CodeBean( 0,  43,  2, "40", "SC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43061 = new CodeBean( 0,  43,  2, "41", "SD", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43062 = new CodeBean( 0,  43,  2, "42", "TN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43063 = new CodeBean( 0,  43,  2, "43", "TX", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43064 = new CodeBean( 0,  43,  2, "44", "UT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43065 = new CodeBean( 0,  43,  2, "45", "VT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43066 = new CodeBean( 0,  43,  2, "46", "VA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43067 = new CodeBean( 0,  43,  2, "47", "WA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43068 = new CodeBean( 0,  43,  2, "48", "WV", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43069 = new CodeBean( 0,  43,  2, "49", "WI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43070 = new CodeBean( 0,  43,  2, "50", "WY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow43020);
		codeTableRowList.add(codeTableRow43021);
		codeTableRowList.add(codeTableRow43022);
		codeTableRowList.add(codeTableRow43023);
		codeTableRowList.add(codeTableRow43024);
		codeTableRowList.add(codeTableRow43025);
		codeTableRowList.add(codeTableRow43026);
		codeTableRowList.add(codeTableRow43027);
		codeTableRowList.add(codeTableRow43028);
		codeTableRowList.add(codeTableRow43029);
		
		codeTableRowList.add(codeTableRow43030);
		codeTableRowList.add(codeTableRow43031);
		codeTableRowList.add(codeTableRow43032);
		codeTableRowList.add(codeTableRow43033);
		codeTableRowList.add(codeTableRow43034);
		codeTableRowList.add(codeTableRow43035);
		codeTableRowList.add(codeTableRow43036);
		codeTableRowList.add(codeTableRow43037);
		codeTableRowList.add(codeTableRow43038);
		codeTableRowList.add(codeTableRow43039);

		codeTableRowList.add(codeTableRow43040);
		codeTableRowList.add(codeTableRow43041);
		codeTableRowList.add(codeTableRow43042);
		codeTableRowList.add(codeTableRow43043);
		codeTableRowList.add(codeTableRow43044);
		codeTableRowList.add(codeTableRow43045);
		codeTableRowList.add(codeTableRow43046);
		codeTableRowList.add(codeTableRow43047);
		codeTableRowList.add(codeTableRow43048);
		codeTableRowList.add(codeTableRow43049);

		codeTableRowList.add(codeTableRow43050);
		codeTableRowList.add(codeTableRow43051);
		codeTableRowList.add(codeTableRow43052);
		codeTableRowList.add(codeTableRow43053);
		codeTableRowList.add(codeTableRow43054);
		codeTableRowList.add(codeTableRow43055);
		codeTableRowList.add(codeTableRow43056);
		codeTableRowList.add(codeTableRow43057);
		codeTableRowList.add(codeTableRow43058);
		codeTableRowList.add(codeTableRow43059);
		
		codeTableRowList.add(codeTableRow43060);
		codeTableRowList.add(codeTableRow43061);
		codeTableRowList.add(codeTableRow43062);
		codeTableRowList.add(codeTableRow43063);
		codeTableRowList.add(codeTableRow43064);
		codeTableRowList.add(codeTableRow43065);
		codeTableRowList.add(codeTableRow43066);
		codeTableRowList.add(codeTableRow43067);
		codeTableRowList.add(codeTableRow43068);
		codeTableRowList.add(codeTableRow43069);
		
		codeTableRowList.add(codeTableRow43070);
		
		// DE 043 03 Card acceptor name/location (39-40 country)
		// DE 059 SF 03 National POS Geographical Data (Country 15 - 17)
		
		CodeBean codeTableRow43081 = new CodeBean( 0,  43,  -1, "036", "AU", "Australia"					, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43082 = new CodeBean( 0,  43,  -1, "076", "BR", "Brazil"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43083 = new CodeBean( 0,  43,  -1, "124", "CA", "Canada"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43084 = new CodeBean( 0,  43,  -1, "156", "CN", "China"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43085 = new CodeBean( 0,  43,  -1, "250", "FR", "France"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43086 = new CodeBean( 0,  43,  -1, "276", "DE", "Germany"					, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43087 = new CodeBean( 0,  43,  -1, "356", "IN", "India"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43088 = new CodeBean( 0,  43,  -1, "380", "IT", "Italy"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43089 = new CodeBean( 0,  43,  -1, "392", "JP", "Japan"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43090 = new CodeBean( 0,  43,  -1, "484", "MX", "Mexico"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43091 = new CodeBean( 0,  43,  -1, "643", "RU", "Russian Federation"			, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43092 = new CodeBean( 0,  43,  -1, "682", "SA", "Saudi Arabia"				, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43093 = new CodeBean( 0,  43,  -1, "724", "ES", "Spain"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43094 = new CodeBean( 0,  43,  -1, "826", "GB", "United Kingdom"				, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43095 = new CodeBean( 0,  43,  -1, "840", "US", "United States of America"	, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow43081);
		codeTableRowList.add(codeTableRow43082);
		codeTableRowList.add(codeTableRow43083);
		codeTableRowList.add(codeTableRow43084);
		codeTableRowList.add(codeTableRow43085);
		codeTableRowList.add(codeTableRow43086);
		codeTableRowList.add(codeTableRow43087);
		codeTableRowList.add(codeTableRow43088);
		codeTableRowList.add(codeTableRow43089);
		
		codeTableRowList.add(codeTableRow43090);
		codeTableRowList.add(codeTableRow43091);
		codeTableRowList.add(codeTableRow43092);
		codeTableRowList.add(codeTableRow43093);
		codeTableRowList.add(codeTableRow43094);
		codeTableRowList.add(codeTableRow43095);
		
		// DE 044 SF 01 Response Source / Reason Code
		
		CodeBean codeTableRow44011 = new CodeBean( 0,  44,   0, "10", "STIP Response: Request Timed Out by Switch"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44012 = new CodeBean( 0,  44,   0, "20", "STIP Response: Issuer Not Available"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44013 = new CodeBean( 0,  44,   0, "30", "Response Provided by Issuer"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44014 = new CodeBean( 0,  44,   0, "40", "Reversal Matches Original Request Authorization"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44015 = new CodeBean( 0,  44,   0, "50", "Reversal Doesn't Match Original Request Authorization"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44011);
		codeTableRowList.add(codeTableRow44012);
		codeTableRowList.add(codeTableRow44013);
		codeTableRowList.add(codeTableRow44014);
		codeTableRowList.add(codeTableRow44015);
		
		// DE 044 SF 02 Address Verification Result Code
		
		CodeBean codeTableRow44021 = new CodeBean( 0,  44,  1, "01", "A",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44022 = new CodeBean( 0,  44,  1, "02", "B",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44023 = new CodeBean( 0,  44,  1, "03", "C",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44024 = new CodeBean( 0,  44,  1, "04", "D",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44025 = new CodeBean( 0,  44,  1, "06", "F",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44026 = new CodeBean( 0,  44,  1, "07", "G",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44027 = new CodeBean( 0,  44,  1, "09", "I",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44028 = new CodeBean( 0,  44,  1, "13", "M",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44029 = new CodeBean( 0,  44,  1, "14", "N",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44030 = new CodeBean( 0,  44,  1, "16", "P",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44031 = new CodeBean( 0,  44,  1, "18", "R",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44032 = new CodeBean( 0,  44,  1, "19", "S",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44033 = new CodeBean( 0,  44,  1, "21", "U",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44034 = new CodeBean( 0,  44,  1, "23", "W",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44035 = new CodeBean( 0,  44,  1, "24", "X",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44036 = new CodeBean( 0,  44,  1, "25", "Y",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44037 = new CodeBean( 0,  44,  1, "26", "Z",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44021);
		codeTableRowList.add(codeTableRow44022);
		codeTableRowList.add(codeTableRow44023);
		codeTableRowList.add(codeTableRow44024);
		codeTableRowList.add(codeTableRow44025);
		codeTableRowList.add(codeTableRow44026);
		codeTableRowList.add(codeTableRow44027);
		codeTableRowList.add(codeTableRow44028);
		codeTableRowList.add(codeTableRow44029);
		codeTableRowList.add(codeTableRow44030);
		codeTableRowList.add(codeTableRow44031);
		codeTableRowList.add(codeTableRow44032);
		codeTableRowList.add(codeTableRow44033);
		codeTableRowList.add(codeTableRow44034);
		codeTableRowList.add(codeTableRow44035);
		codeTableRowList.add(codeTableRow44036);
		codeTableRowList.add(codeTableRow44037);
		
		// DE 044 SF 05 CVV / iCVV / dCVV Results Code
		
		CodeBean codeTableRow44051 = new CodeBean( 0,  44,  5, "1", "CVV, iCVV, or dCVV was not verified."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44052 = new CodeBean( 0,  44,  5, "2", "CVV, iCVV, or dCVV failed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44053 = new CodeBean( 0,  44,  5, "3", "CVV, iCVV, or dCVV passed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44054 = new CodeBean( 0,  44,  5, "4", "Not applicable"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44051);
		codeTableRowList.add(codeTableRow44052);
		codeTableRowList.add(codeTableRow44053);
		codeTableRowList.add(codeTableRow44054);
		
		// DE 044 SF 08 Card Authentication Results Code
		
		CodeBean codeTableRow44081 = new CodeBean( 0,  44,  8, "1", "Cryptographic Error Occurred"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44082 = new CodeBean( 0,  44,  8, "2", "Authorization Request Cryptogram failed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44083 = new CodeBean( 0,  44,  8, "3", "Authorization Request Cryptogram passed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44081);
		codeTableRowList.add(codeTableRow44082);
		codeTableRowList.add(codeTableRow44083);
		
		// DE 044 SF 10 CVV2 Results Code
		
		CodeBean codeTableRow44105 = new CodeBean( 0,  44,  10, "13", "M", "CVV2 match"		, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44106 = new CodeBean( 0,  44,  10, "14", "N", "CVV2 no match"	, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44107 = new CodeBean( 0,  44,  10, "16", "P", "Not processed"	, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44108 = new CodeBean( 0,  44,  10, "19", "S", "No CVV2 on Card"	, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44105);
		codeTableRowList.add(codeTableRow44106);
		codeTableRowList.add(codeTableRow44107);
		codeTableRowList.add(codeTableRow44108);
		
		// DE 044 SF 13 Card Authentication Verification Value Results Code
		
		CodeBean codeTableRow44131 = new CodeBean( 0,  44,  13, "0", "CAVV authentication results invalid"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44132 = new CodeBean( 0,  44,  13, "1", "CAVV failed validation - authentication"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44133 = new CodeBean( 0,  44,  13, "2", "CAVV passed validation - authentication"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44134 = new CodeBean( 0,  44,  13, "3", "CAVV passed validation - attempt"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44135 = new CodeBean( 0,  44,  13, "4", "CAVV failed validation - attempt"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44136 = new CodeBean( 0,  44,  13, "5", "Not used"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44137 = new CodeBean( 0,  44,  13, "6", "CAVV not validated; Issuer not participant" , "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44138 = new CodeBean( 0,  44,  13, "7", "CAVV failed validation – attempt." 			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44139 = new CodeBean( 0,  44,  13, "8", "CAVV passed validation – attempt." 			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44140 = new CodeBean( 0,  44,  13, "9", "CAVV failed validation – attempt." 			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		/*		
		CodeBean codeTableRow44141 = new CodeBean( 0,  44,  13, A, "CAVV not validated; Issuer not participant" , "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44142 = new CodeBean( 0,  44,  13, B, "CAVV not validated; Issuer not participant" , "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44143 = new CodeBean( 0,  44,  13, C, "CAVV not validated; Issuer not participant" , "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44144 = new CodeBean( 0,  44,  13, D, "CAVV not validated; Issuer not participant" , "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		*/
		
		codeTableRowList.add(codeTableRow44131);
		codeTableRowList.add(codeTableRow44132);
		codeTableRowList.add(codeTableRow44133);
		codeTableRowList.add(codeTableRow44134);
		codeTableRowList.add(codeTableRow44135);
		codeTableRowList.add(codeTableRow44136);
		codeTableRowList.add(codeTableRow44137);
		codeTableRowList.add(codeTableRow44138);
		codeTableRowList.add(codeTableRow44139);
		codeTableRowList.add(codeTableRow44140);
/*
		codeTableRowList.add(codeTableRow44141);
		codeTableRowList.add(codeTableRow44142);
		codeTableRowList.add(codeTableRow44143);
		codeTableRowList.add(codeTableRow44144);
		codeTableRowList.add(codeTableRow44145);
*/		 
		
		// DE 053 SF 00 Security Algorithm Format
		
		CodeBean codeTableRow53001 = new CodeBean( 0,  53,  0, "20", "Zone encryption"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53001);
		
		// DE 053 SF 01 PIN Encryption Algorithm Identifier
		
		CodeBean codeTableRow53011 = new CodeBean( 0,  53,  1, "1", "ANSI DES"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53011);
		
		// DE 053 SF 02 PIN Block Format Code
		
		CodeBean codeTableRow53021 = new CodeBean( 0,  53,  2, "1", "Based on PIN format,length,rightmost acct digits, and pad chars"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53022 = new CodeBean( 0,  53,  2, "2", "Based on PIN format,length, and numeric pad characters"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53023 = new CodeBean( 0,  53,  2, "3", "Based on PIN,length, and user-specified numberic pad characters"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53024 = new CodeBean( 0,  53,  2, "4", "PIN block format (Plus transactions)"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53021);
		codeTableRowList.add(codeTableRow53022);
		codeTableRowList.add(codeTableRow53023);
		codeTableRowList.add(codeTableRow53024);
		
		// DE 053 SF 03 PIN Zone Key Index
		
		CodeBean codeTableRow53031 = new CodeBean( 0,  53,  3, "0", "Reserved for Future Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53032 = new CodeBean( 0,  53,  3, "1", "Working Key 1 is to be changed or used."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53033 = new CodeBean( 0,  53,  3, "2", "Working Key 2 is to be changed or used."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53031);
		codeTableRowList.add(codeTableRow53032);
		codeTableRowList.add(codeTableRow53033);
		
		// DE 054 SF 01 Amount Type
		
		CodeBean codeTableRow54011 = new CodeBean( 0,  54,  1, "1", "Current Ledger Balance"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow54012 = new CodeBean( 0,  54,  1, "2", "Current Available Balance"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow54011);
		codeTableRowList.add(codeTableRow54012);
		
		// DE 055 SF 9F09 - Application Version Number [binary]
		
		CodeBean codeTableRow9F091 = new CodeBean( 0,  55,  1, "10", "Version 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F092 = new CodeBean( 0,  55,  1, "20", "Version 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F093 = new CodeBean( 0,  55,  1, "30", "Version 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F091);
		codeTableRowList.add(codeTableRow9F092);
		codeTableRowList.add(codeTableRow9F093);
		
		// DE 055 SF 9F1E - Terminal Serial Number an 8
		
		CodeBean codeTableRow9F1E1 = new CodeBean( 0,  55,  2, "12501200", "Terminal Serial Number 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F1E2 = new CodeBean( 0,  55,  2, "12502300", "Terminal Serial Number 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F1E3 = new CodeBean( 0,  55,  2, "12503400", "Terminal Serial Number 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F1E1);
		codeTableRowList.add(codeTableRow9F1E2);
		codeTableRowList.add(codeTableRow9F1E3);
		
		// DE 055 SF 9F35 - Terminal Type n 2
		// DE 060 SF 00   - Terminal Type n 2
		
		CodeBean codeTableRow9F351 = new CodeBean( 0,  55,  3, "12501000", "Terminal Serial Number 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F352 = new CodeBean( 0,  55,  3, "12501000", "Terminal Serial Number 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F353 = new CodeBean( 0,  55,  3, "12501000", "Terminal Serial Number 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F351);
		codeTableRowList.add(codeTableRow9F352);
		codeTableRowList.add(codeTableRow9F353);
		
		// DE 055 SF 9F53 - Transaction Category Code
		
		CodeBean codeTableRow9F531 = new CodeBean( 0,  55,  4, "03", "C", " Cash Disbursements"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F532 = new CodeBean( 0,  55,  4, "26", "Z", "Cash Disbursements"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F533 = new CodeBean( 0,  55,  4, "15", "O", "Hospitals, Education and School Expenses"	, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F534 = new CodeBean( 0,  55,  4, "08", "H", "Hotels and Motels"							, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F535 = new CodeBean( 0,  55,  4, "24", "X", "Transportation"							, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F536 = new CodeBean( 0,  55,  4, "01", "A", "Vehicle Rentals"							, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F537 = new CodeBean( 0,  55,  4, "06", "F", "Restaurants"								, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F538 = new CodeBean( 0,  55,  4, "20", "T", "Pre-Authorised Mail Orders"				, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F539 = new CodeBean( 0,  55,  4, "21", "U", "Cardholder Activated Terminals"			, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F540 = new CodeBean( 0,  55,  4, "18", "R", "All Other Merchants"						, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F541 = new CodeBean( 0,  55,  4, "18", "P", "Payment Service Providers"					, CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F531);
		codeTableRowList.add(codeTableRow9F532);
		codeTableRowList.add(codeTableRow9F533);
		codeTableRowList.add(codeTableRow9F534);
		codeTableRowList.add(codeTableRow9F535);
		codeTableRowList.add(codeTableRow9F536);
		codeTableRowList.add(codeTableRow9F537);
		codeTableRowList.add(codeTableRow9F538);
		codeTableRowList.add(codeTableRow9F539);
		codeTableRowList.add(codeTableRow9F540);
		codeTableRowList.add(codeTableRow9F541);
		
		// DE 059 SF 00 National POS Geographical Data
		// State  Positions 1 - 2
		
		// DE 059 SF 01 National POS Geographical Data
		// County Positions 3 - 5
		
		CodeBean codeTableRow059011 = new CodeBean( 0,  59,  1, "01", "Alameda County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059012 = new CodeBean( 0,  59,  1, "13", "Contra Costa County"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059013 = new CodeBean( 0,  59,  1, "23", "Humboldt County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059014 = new CodeBean( 0,  59,  1, "53", "Monterey County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059015 = new CodeBean( 0,  59,  1, "85", "Santa Clara County"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow059011);
		codeTableRowList.add(codeTableRow059012);
		codeTableRowList.add(codeTableRow059013);
		codeTableRowList.add(codeTableRow059014);
		codeTableRowList.add(codeTableRow059015);
		
		// DE 059 SF 02 National POS Geographical Data
		// Postal Service Code 6 - 14
		
		CodeBean codeTableRow059021 = new CodeBean( 0,  59,  2, "95014", "Santa Clara"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059022 = new CodeBean( 0,  59,  2, "95112", "San Jose"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059023 = new CodeBean( 0,  59,  2, "95008", "Campbell"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059024 = new CodeBean( 0,  59,  2, "95070", "Saratoga"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059025 = new CodeBean( 0,  59,  2, "95014", "Cupertino"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow059021);
		codeTableRowList.add(codeTableRow059022);
		codeTableRowList.add(codeTableRow059023);
		codeTableRowList.add(codeTableRow059024);
		codeTableRowList.add(codeTableRow059025);
		
		// DE 059 SF 03 National POS Geographical Data
		// Country 15 - 17
		
		// DE 060 SF 00 Terminal Type
		
		CodeBean codeTableRow06001 = new CodeBean( 0,  60,  0, "0", "Unknown"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06002 = new CodeBean( 0,  60,  0, "1", "Unattended Terminal (ATM)"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06003 = new CodeBean( 0,  60,  0, "2", "Electronic Cash Register"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06004 = new CodeBean( 0,  60,  0, "0", "Customer-owned Device"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06005 = new CodeBean( 0,  60,  0, "1", "Merchant-owned Device"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06001);
		codeTableRowList.add(codeTableRow06002);
		codeTableRowList.add(codeTableRow06003);
		codeTableRowList.add(codeTableRow06004);
		codeTableRowList.add(codeTableRow06005);
		
		// DE 060 SF 01 Terminal Entry Capability
		
		CodeBean codeTableRow06011 = new CodeBean( 0,  60,  1, "0", "Unknown"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06012 = new CodeBean( 0,  60,  1, "1", "Terminal Not Used"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06013 = new CodeBean( 0,  60,  1, "2", "Mgnetic Stripe Read Capability"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06014 = new CodeBean( 0,  60,  1, "3", "Bar Code Read Capability"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06015 = new CodeBean( 0,  60,  1, "4", "OCR Read Capability"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06016 = new CodeBean( 0,  60,  1, "5", "Chip Read Capability"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06017 = new CodeBean( 0,  60,  1, "6", "MICR Read Capability"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06018 = new CodeBean( 0,  60,  1, "7", "MICR Read and Image-capable"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06019 = new CodeBean( 0,  60,  1, "8", "Proximity Read Capability"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06020 = new CodeBean( 0,  60,  1, "9", "POS Key-Entry"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06011);
		codeTableRowList.add(codeTableRow06012);
		codeTableRowList.add(codeTableRow06013);
		codeTableRowList.add(codeTableRow06014);
		codeTableRowList.add(codeTableRow06015);
		codeTableRowList.add(codeTableRow06016);
		codeTableRowList.add(codeTableRow06017);
		codeTableRowList.add(codeTableRow06018);
		codeTableRowList.add(codeTableRow06019);
		codeTableRowList.add(codeTableRow06020);
				
		// DE 060 SF 03 Chip Condition Code
		
		CodeBean codeTableRow06031 = new CodeBean( 0,  60,  3, "0", "Chip Capable Terminal Last Read Successful"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06032 = new CodeBean( 0,  60,  3, "1", "Chip Capable Terminal Last Read Unsuccessful"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06031);
		codeTableRowList.add(codeTableRow06032);
		
		// DE 060 SF 04 Chip Authentication Reliability Indicator
		
		CodeBean codeTableRow06041 = new CodeBean( 0,  60,  4, "0", "Acquirer Card Authentication reliable"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06042 = new CodeBean( 0,  60,  4, "1", "Acquirer Card Authentication not reliable"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06041);
		codeTableRowList.add(codeTableRow06042);		
		
		// DE 060 SF 05 MOTO Electronic Commerce Indicator
		
		CodeBean codeTableRow06051 = new CodeBean( 0,  60,  5, "0", "Unknown"															, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06052 = new CodeBean( 0,  60,  5, "1", "Telephone Order"													, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06053 = new CodeBean( 0,  60,  5, "2", "Recurring Transaction"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06054 = new CodeBean( 0,  60,  5, "3", "Installment Payment"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06055 = new CodeBean( 0,  60,  5, "4", "Mail Order"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06056 = new CodeBean( 0,  60,  5, "5", "Secure Electronic Commerce Transaction"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06057 = new CodeBean( 0,  60,  5, "6", "Non-authenticated transaction @ 3-D Secure-capable merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06058 = new CodeBean( 0,  60,  5, "7", "Non-authenticated transaction @ non 3-D Secure-capable merchant"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06059 = new CodeBean( 0,  60,  5, "8", "Transaction that uses data encryption"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06060 = new CodeBean( 0,  60,  5, "9", "Transaction that has no data protection"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06061 = new CodeBean( 0,  60,  5, "8", "Subscription transaction"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06062 = new CodeBean( 0,  60,  5, "9", "Live agent"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06051);
		codeTableRowList.add(codeTableRow06052);
		codeTableRowList.add(codeTableRow06053);
		codeTableRowList.add(codeTableRow06054);
		codeTableRowList.add(codeTableRow06055);
		codeTableRowList.add(codeTableRow06056);
		codeTableRowList.add(codeTableRow06057);
		codeTableRowList.add(codeTableRow06058);
		codeTableRowList.add(codeTableRow06059);
		codeTableRowList.add(codeTableRow06060);
		codeTableRowList.add(codeTableRow06061);
		codeTableRowList.add(codeTableRow06062);
		
		// DE 060 SF 06 Cardholder ID Method
		
		CodeBean codeTableRow06063 = new CodeBean( 0,  60,  6, "0", "Unknown"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06064 = new CodeBean( 0,  60,  6, "1", "Signature"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06065 = new CodeBean( 0,  60,  6, "2", "PIN"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06066 = new CodeBean( 0,  60,  6, "3", "Unattended Terminal"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06067 = new CodeBean( 0,  60,  6, "4", "Mail/Phone Order"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06063);
		codeTableRowList.add(codeTableRow06064);
		codeTableRowList.add(codeTableRow06065);
		codeTableRowList.add(codeTableRow06066);
		codeTableRowList.add(codeTableRow06067);
		
		// DE 060 SF 07 Partial Authorization
		
		CodeBean codeTableRow06070 = new CodeBean( 0,  60,  7, "0", "Device Doesn't Support Partial Authorizations; Balances Not Desired"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06071 = new CodeBean( 0,  60,  7, "1", "Device Supports Partial Authorizations; Balances Desired"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06072 = new CodeBean( 0,  60,  7, "2", "Device Doesn't Support Partial Authorizations; Balances Desired"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06070);
		codeTableRowList.add(codeTableRow06071);
		codeTableRowList.add(codeTableRow06072);
		
		// DE 063 SF 01 Network ID Code 
		
		CodeBean codeTableRow06300 = new CodeBean( 0,  63,  1, "1001", "Bronze Network"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06301 = new CodeBean( 0,  63,  1, "1002", "Silver Network"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06302 = new CodeBean( 0,  63,  1, "1003", "Gold Network"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06300);
		codeTableRowList.add(codeTableRow06301);
		codeTableRowList.add(codeTableRow06302);
		
		// DE 063 SF 03 Message Reason Code  
		
		CodeBean codeTableRow06330 = new CodeBean( 0,  63,  3,  "2501", "Transaction voided by customer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06331 = new CodeBean( 0,  63,  3,  "2502", "Transaction has not completed"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06332 = new CodeBean( 0,  63,  3,  "2503", "No confirmation from point of service"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06333 = new CodeBean( 0,  63,  3,  "2547", "Potential duplicate"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06334 = new CodeBean( 0,  63,  3,  "2548", "Duplicate"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06335 = new CodeBean( 0,  63,  3,  "5202", "Online submission"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06336 = new CodeBean( 0,  63,  3,  "5204", "Online resubmission"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06330);
		codeTableRowList.add(codeTableRow06331);
		codeTableRowList.add(codeTableRow06332);
		codeTableRowList.add(codeTableRow06333);
		codeTableRowList.add(codeTableRow06334);
		codeTableRowList.add(codeTableRow06335);
		codeTableRowList.add(codeTableRow06336);
		
		// DE 063 SF 04 STIP Switch Reason Code  
		
		CodeBean codeTableRow06340 = new CodeBean( 0, 63,  4, "1", "Issuer Unavailable"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06341 = new CodeBean( 0, 63,  4, "2", "Timeout"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06342 = new CodeBean( 0, 63,  4, "3", "Corrupted Response"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06340);
		codeTableRowList.add(codeTableRow06341);
		codeTableRowList.add(codeTableRow06342);
		
		// DE 064 SF 00 Message Authentication Code  [ Binary 16 ]
		
		CodeBean codeTableRow06400 = new CodeBean( 0,  64,  0, "1", "MAC Result 01"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06401 = new CodeBean( 0,  64,  0, "2", "MAC Result 02"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06402 = new CodeBean( 0,  64,  0, "3", "MAC Result 03"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06400);
		codeTableRowList.add(codeTableRow06401);
		codeTableRowList.add(codeTableRow06402);
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------
		
		// Format Codes
		
		CodeBean codeTableRow01010 = new CodeBean( 0,  200,  -1, "10", "Fixed Format"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow01020 = new CodeBean( 0,  200,  -1, "20", "Variable Format"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow01030 = new CodeBean( 0,  200,  -1, "99", "Unknown Format"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow01010);
		codeTableRowList.add(codeTableRow01020);
		codeTableRowList.add(codeTableRow01030);
		
		// Encoding Codes
		
		CodeBean codeTableRow02010 = new CodeBean( 0,  300,  -1, "10", "ASCII"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02020 = new CodeBean( 0,  300,  -1, "20", "EBCDIC"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow02010);
		codeTableRowList.add(codeTableRow02020);
		
		// Data Type Codes
		
		CodeBean codeTableRow02110 = new CodeBean( 0, 400,  -1, "10", "Alphabetic"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02120 = new CodeBean( 0, 400,  -1, "20", "Alphanumeric"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02130 = new CodeBean( 0, 400,  -1, "30", "Alphanumeric Special"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02140 = new CodeBean( 0, 400,  -1, "40", "Binary"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02150 = new CodeBean( 0, 400,  -1, "50", "Date"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02160 = new CodeBean( 0, 400,  -1, "60", "Numeric"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02170 = new CodeBean( 0, 400,  -1, "70", "Numeric Special"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02180 = new CodeBean( 0, 400,  -1, "80", "Special"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02190 = new CodeBean( 0, 400,  -1, "90", "Timestamp"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
		codeTableRowList.add(codeTableRow02110);
		codeTableRowList.add(codeTableRow02120);	
		codeTableRowList.add(codeTableRow02130);
		codeTableRowList.add(codeTableRow02140);	
		codeTableRowList.add(codeTableRow02150);
		codeTableRowList.add(codeTableRow02160);	
		codeTableRowList.add(codeTableRow02170);
		codeTableRowList.add(codeTableRow02180);	
		codeTableRowList.add(codeTableRow02190);
		
		// Source Codes
		
		CodeBean codeTableRow05110 = new CodeBean( 0,  500,  -1, "10", "From Cardholder"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05120 = new CodeBean( 0,  500,  -1, "15", "From Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05130 = new CodeBean( 0,  500,  -1, "20", "From Acquirer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05140 = new CodeBean( 0,  500,  -1, "25", "From Association"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05150 = new CodeBean( 0,  500,  -1, "30", "From Issuer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05160 = new CodeBean( 0,  500,  -1, "35", "From Client"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05170 = new CodeBean( 0,  500,  -1, "40", "To Client"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05180 = new CodeBean( 0,  500,  -1, "45", "To Issuer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05190 = new CodeBean( 0,  500,  -1, "50", "To Association"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051A0 = new CodeBean( 0,  500,  -1, "55", "To Acquirer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051B0 = new CodeBean( 0,  500,  -1, "60", "To Merchant"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051C0 = new CodeBean( 0,  500,  -1, "65", "To Cardholder"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
		codeTableRowList.add(codeTableRow05110);
		codeTableRowList.add(codeTableRow05120);	
		codeTableRowList.add(codeTableRow05130);
		codeTableRowList.add(codeTableRow05140);	
		codeTableRowList.add(codeTableRow05150);
		codeTableRowList.add(codeTableRow05160);	
		codeTableRowList.add(codeTableRow05170);
		codeTableRowList.add(codeTableRow05180);	
		codeTableRowList.add(codeTableRow05190);
		codeTableRowList.add(codeTableRow051A0);
		codeTableRowList.add(codeTableRow051B0);	
		codeTableRowList.add(codeTableRow051C0);

		// Direction Codes
		
		CodeBean codeTableRow07110 = new CodeBean( 0,  600,  -1, "10", "Cardholder->Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07120 = new CodeBean( 0,  600,  -1, "15", "Merchant->Acquirer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07130 = new CodeBean( 0,  600,  -1, "20", "Acquirer->Association"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07140 = new CodeBean( 0,  600,  -1, "25", "Association->Issuer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07150 = new CodeBean( 0,  600,  -1, "30", "Issuer->Client"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07160 = new CodeBean( 0,  600,  -1, "35", "Client->Issuer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07170 = new CodeBean( 0,  600,  -1, "40", "Issuer->Association"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07180 = new CodeBean( 0,  600,  -1, "45", "Association->Acquirer"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07190 = new CodeBean( 0,  600,  -1, "50", "Acquirer->Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow071A0 = new CodeBean( 0,  600,  -1, "55", "Merchant->Cardholder"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
		codeTableRowList.add(codeTableRow07110);
		codeTableRowList.add(codeTableRow07120);	
		codeTableRowList.add(codeTableRow07130);
		codeTableRowList.add(codeTableRow07140);	
		codeTableRowList.add(codeTableRow07150);
		codeTableRowList.add(codeTableRow07160);	
		codeTableRowList.add(codeTableRow07170);
		codeTableRowList.add(codeTableRow07180);	
		codeTableRowList.add(codeTableRow07190);
		codeTableRowList.add(codeTableRow071A0);
		
		// Existence Codes
		 
		CodeBean codeTableRow08110 = new CodeBean( 0,  700,  -1, "10", "Conditional Added"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08120 = new CodeBean( 0,  700,  -1, "20", "Conditional Presence"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08130 = new CodeBean( 0,  700,  -1, "30", "Conditional Removed"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08140 = new CodeBean( 0,  700,  -1, "40", "Mandatory Added"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08150 = new CodeBean( 0,  700,  -1, "50", "Mandatory Presence"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08160 = new CodeBean( 0,  700,  -1, "60", "Mandatory Removed"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08170 = new CodeBean( 0,  700,  -1, "70", "Optional Added"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08180 = new CodeBean( 0,  700,  -1, "80", "Optional Presence"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08190 = new CodeBean( 0,  700,  -1, "90", "Optional Removed"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
		codeTableRowList.add(codeTableRow08110);
		codeTableRowList.add(codeTableRow08120);	
		codeTableRowList.add(codeTableRow08130);
		codeTableRowList.add(codeTableRow08140);	
		codeTableRowList.add(codeTableRow08150);
		codeTableRowList.add(codeTableRow08160);	
		codeTableRowList.add(codeTableRow08170);
		codeTableRowList.add(codeTableRow08180);	
		codeTableRowList.add(codeTableRow08190);
		
		// Header / Detail Fire
		 
		CodeBean codeTableRowA8110 = new CodeBean( 0,  800,  -1, "10", "Rule Fired"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowA8120 = new CodeBean( 0,  800,  -1, "20", "Rule Not Fired"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRowA8110);
		codeTableRowList.add(codeTableRowA8120);	
		
		return codeTableRowList;
		
	}
	/***********************************************************************************
	***********************************************************************************
	*/
	public CodeBean search (int codeField, int codeSubfield) {
		
		List<CodeBean> codeTableRowList = createCodes ();
		
		int index = 0;
		
		while ( codeTableRowList.get(index).getCodeField() 		== codeField
		   &&   codeTableRowList.get(index).getCodeSubfield() 	== codeSubfield)
		{
			
		}
		
		return codeTableRowList.get(index);

	}
	/***********************************************************************************
	***********************************************************************************
	*/
	public void display (List<CodeBean> codeTableRowList) {
		
		for (int i = 0; i < codeTableRowList.size() ; i++) {
			
			System.out.format("%5d %7d %7d %-25s %-65s %-13s %-25s %-15s %-13s\n"
					        , i
							, codeTableRowList.get(i).getId()
							, codeTableRowList.get(i).getCodeName()
							, codeTableRowList.get(i).getCodeValue()
							, codeTableRowList.get(i).getDescription()
							, codeTableRowList.get(i).getCreateUser()
							, codeTableRowList.get(i).getCreateTimestamp()
							, codeTableRowList.get(i).getModifyUser()
							, codeTableRowList.get(i).getModifyTimestamp()
							);
		}
	}
}	
