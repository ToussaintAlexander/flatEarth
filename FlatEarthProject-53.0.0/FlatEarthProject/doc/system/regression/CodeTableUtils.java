package com.system.message.utilties;

import static com.system.base.constants.Element.*;

import static com.system.message.element.contract.DE000.*;
import static com.system.message.element.contract.DE001.*;
import static com.system.message.element.contract.DE002.*;
import static com.system.message.element.contract.DE003.*;
import static com.system.message.element.contract.DE004.*;
import static com.system.message.element.contract.DE005.*;
import static com.system.message.element.contract.DE006.*;
import static com.system.message.element.contract.DE007.*;
import static com.system.message.element.contract.DE008.*;
import static com.system.message.element.contract.DE009.*;

import static com.system.message.element.rule.header.contract.DE000RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE001RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE002RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE003RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE004RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE005RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE006RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE007RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE008RuleHeader.*;
import static com.system.message.element.rule.header.contract.DE009RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.element.base.network.AcctLevel;
import com.system.message.element.base.network.BinLevel;
import com.system.message.element.base.network.TransLevel;

public class CodeTableUtils {

	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertIdCode (int value) {

		String subroutine = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_ID			:	subroutine = "Element Field 000 00 ID";	break;
			case PRIMARY_BITMAP_001_ID					:	subroutine = "Element Field 001 00 ID";	break;
			case BIN_002_ID								:	subroutine = "Trans Element 002 00 ID";	break;
			case PAN_002_ID								:	subroutine = "Element Field 002 01 ID";	break;
			case CHECK_DIGIT_002_ID						:	subroutine = "Element Field 002 02 ID";	break;
			case TRANSACTION_TYPE_003_ID				:	subroutine = "Element Field 003 00 ID";	break;
			case ACCOUNT_FROM_TYPE_003_ID				:	subroutine = "Element Field 003 01 ID";	break;
			case ACCOUNT_TO_TYPE_003_ID					:	subroutine = "Element Field 003 02 ID";	break;
			case TRANSACTION_AMOUNT_004_ID				:	subroutine = "Element Field 004 00 ID";	break;
			case SETTLEMENT_AMOUNT_005_ID				:	subroutine = "Element Field 005 00 ID";	break;
			case CARDHOLDER_BILLING_AMOUNT_006_ID		:	subroutine = "Element Field 006 00 ID";	break;
			case TRANSMISSION_DATE_MONTH_007_ID			:	subroutine = "Element Field 007 00 ID";	break;
			case TRANSMISSION_DATE_DAY_007_ID			:	subroutine = "Element Field 007 01 ID";	break;
			case TRANSMISSION_TIME_HOUR_007_ID			:	subroutine = "Element Field 007 02 ID";	break;
			case TRANSMISSION_TIME_MINUTE_007_ID		:	subroutine = "Element Field 007 03 ID";	break;
			case TRANSMISSION_TIME_SECOND_007_ID		:	subroutine = "Element Field 007 04 ID";	break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_ID	:	subroutine = "Element Field 008 00 ID";	break;
			case SETTLEMENT_CONVERSION_RATE_009_ID		:	subroutine = "Element Field 009 00 ID";	break;
		
			default										:	subroutine = "Element Field ??? ?? ID";	break;
			
		}
	
		return subroutine;
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertFieldCode (int value) {

		String fieldStr = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_FIELD			:	fieldStr = "Unassigned Element Field";				break;
			case PRIMARY_BITMAP_001_FIELD					:	fieldStr = "Primary Bitmap Field";					break;
			case PRIMARY_ACCOUNT_NUMBER_002_FIELD			:	fieldStr = "Primary Account Number Field";			break;
			case PROCESSING_CODE_003_FIELD					:	fieldStr = "Processing Code Field";					break;
			case TRANSACTION_AMOUNT_004_FIELD				:	fieldStr = "Transaction Amount Field";				break;
			case SETTLEMENT_AMOUNT_005_FIELD				:	fieldStr = "Settlement Amount Field";				break;
			case CARDHOLDER_BILLING_AMOUNT_006_FIELD		:	fieldStr = "Cardholder Billing Amount Field";		break;
			case TRANSMISSION_DATE_TIME_007_FIELD			:	fieldStr = "Transmmission Date Time Field";			break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_FIELD	:	fieldStr = "Cardholder Billing Fee Amount Field";	break;
			case SETTLEMENT_CONVERSION_RATE_009_FIELD		:	fieldStr = "Settlement Conversion Rate Field";		break;
			
			default											:	fieldStr = "Unknown Element Field";					break;
				
		}
		
		return fieldStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertFormatCode (int value) {

		String formatStr = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		formatStr = "Fixed Format";		break;
			case VARIABLE_FORMAT:	formatStr = "Variable Format";	break;
			
			default:				formatStr = "Unknown Format";	break;
				
		}
		
		return formatStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertLengthCode () {

		return "Length";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertEncodingCode (int value) {

		String encodingStr = null;
		
		switch (value) {
		
			case ASCII_ENCODING:	encodingStr = "ASCII";				break;
			case EBCDIC_ENCODING:	encodingStr = "EBCDIC";				break;
			
			default:				encodingStr = "Unknown Encoding";	break;
				
		}
		
		return encodingStr;
		
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
		
			case CONDITIONAL_ADDED		:	existence = "Prohibited Data Element";		break;
			
/* 			static final int CONDITIONAL_ADDED				= 10;
			public static final int CONDITIONAL_PRESENCE			= 20;
			public static final int CONDITIONAL_REMOVED				= 30;
			
			public static final int MANDATORY_ADDED					= 40;
			public static final int MANDATORY_PRESENCE				= 50;
			public static final int MANDATORY_REMOVED				= 60;
			
			public static final int OPTIONAL_ADDED					= 70;
			public static final int OPTIONAL_PRESENCE				= 80;
			public static final int OPTIONAL_REMOVED				= 90;
*/			
			default							:	existence = "Unknown Existence";			break;
				
		}
		
		return existence;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertChangeCode (int value) {

		String change = null;
		
		switch (value) {
		
//			case ELEMENT_FIXED:		change = "Element Fixed";		break;
//			case ELEMENT_ADDED:		change = "Element Added";		break;
//			case ELEMENT_REMOVED:	change = "Element Removed";		break;
			case ELEMENT_CHANGED:	change = "Element Change";		break;
			
			default:				change = "Unknown Change";		break;
				
		}
		
		return change;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertValueCode (String value) {

		return value;
		
	}
	/******************************************************************************
	 * yyy
	 ******************************************************************************
	 */
	public String convertRuleIdCode (int value) {
		
		String subroutine = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_RULE_HEADER_ID			:	subroutine = "Element 000 00 Rule Header ID";	break;
			case PRIMARY_BITMAP_001_RULE_HEADER_ID					:	subroutine = "Element 001 00 Rule Header ID";	break;
			case BIN_002_RULE_HEADER_ID								:	subroutine = "Element 002 00 Rule Header ID";	break;
			case PAN_002_RULE_HEADER_ID								:	subroutine = "Element 002 01 Rule Header ID";	break;
			case CHECK_DIGIT_002_RULE_HEADER_ID						:	subroutine = "Element 002 02 Rule Header ID";	break;
			case TRANSACTION_TYPE_003_RULE_HEADER_ID				:	subroutine = "Element 003 00 Rule Header ID";	break;
			case ACCOUNT_FROM_TYPE_003_RULE_HEADER_ID				:	subroutine = "Element 003 01 Rule Header ID";	break;
			case ACCOUNT_TO_TYPE_003_RULE_HEADER_ID					:	subroutine = "Element 003 02 Rule Header ID";	break;
			case TRANSACTION_AMOUNT_004_RULE_HEADER_ID				:	subroutine = "Element 004 00 Rule Header ID";	break;
			case SETTLEMENT_AMOUNT_005_RULE_HEADER_ID				:	subroutine = "Element 005 00 Rule Header ID";	break;
			case CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_ID		:	subroutine = "Element 006 00 Rule Header ID";	break;
			case TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ID			:	subroutine = "Element 007 00 Rule Header ID";	break;
			case TRANSMISSION_DATE_DAY_007_RULE_HEADER_ID			:	subroutine = "Element 007 01 Rule Header ID";	break;
			case TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ID			:	subroutine = "Element 007 02 Rule Header ID";	break;
			case TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ID		:	subroutine = "Element 007 03 Rule Header ID";	break;
			case TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ID		:	subroutine = "Element 007 04 Rule Header ID";	break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_ID	:	subroutine = "Element 008 00 Rule Header ID";	break;
			case SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ID		:	subroutine = "Element 009 00 Rule Header ID";	break;
			
		
			default													:	subroutine = "Element ??? ?? Rule Header ID";	break;
			
		}
	
		return subroutine;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFieldCode (int value) {

		String fieldStr = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_FIELD			:	fieldStr = "Unassigned Element Field Rule";				break;
			case PRIMARY_BITMAP_001_FIELD					:	fieldStr = "Primary Bitmap Field Rule";					break;
			case PRIMARY_ACCOUNT_NUMBER_002_FIELD			:	fieldStr = "Primary Account Number Field Rule";			break;
			case PROCESSING_CODE_003_FIELD					:	fieldStr = "Processing Code Field Rule";				break;
			case TRANSACTION_AMOUNT_004_FIELD				:	fieldStr = "Transaction Amount Field Rule";				break;
			case SETTLEMENT_AMOUNT_005_FIELD				:	fieldStr = "Settlement Amount Field Rule";				break;
			case CARDHOLDER_BILLING_AMOUNT_006_FIELD		:	fieldStr = "Cardholder Billing Amount Field Rule";		break;
			case TRANSMISSION_DATE_TIME_007_FIELD			:	fieldStr = "Transmmission Date Time Field Rule";		break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_FIELD	:	fieldStr = "Cardholder Billing Fee Amount Field Rule";	break;
			case SETTLEMENT_CONVERSION_RATE_009_FIELD		:	fieldStr = "Settlement Conversion Rate Field Rule";		break;
			
			default											:	fieldStr = "Unknown Element Rule Field";				break;
				
		}
		
		return fieldStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleTypeCode (int value) {

		String ruleTypeStr = null;
		
		switch (value) {
		
			case UNASSIGNED_RULE_TYPE	:	ruleTypeStr = "Unassigned Type Rule";	break;
//			case BITMAP_RULE_TYPE		:	ruleTypeStr = "Bitmap Type Rule";		break;
			case COMPOSITE_RULE_TYPE	:	ruleTypeStr = "Composite Type Rule";	break;
//			case DATE_TIME_RULE_TYPE	:	ruleTypeStr = "Year Date Type Rule";	break;
//			case CURRENCY_RULE_TYPE		:	ruleTypeStr = "Currency Type Rule";		break;
			
			default						:	ruleTypeStr = "Unknown Type Rule";		break;
				
		}
		
		return ruleTypeStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleGroupCode (int value) {

		String ruleGroupStr = null;
		
		switch (value) {
		
			case UNASSIGNED_RULE_GROUP	:	ruleGroupStr = "Unknown Group Rule";		break;
			case BITMAP_RULE_GROUP		: 	ruleGroupStr = "Bitmap Group Rule";			break;
			case CODE_RULE_GROUP		:	ruleGroupStr = "Code Group Rule";			break;
			case DATE_TIME_RULE_GROUP	:	ruleGroupStr = "Date Time Group Rule";		break;
			case CURRENCY_RULE_GROUP	:	ruleGroupStr = "Currency Group Rule";		break;
			case RATE_RULE_GROUP		:	ruleGroupStr = "Rate Group Rule";			break;
			
			default						:	ruleGroupStr = "Unknown Group Rule";		break;
			
		}
		
		return ruleGroupStr;
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFireCode (boolean value) {

		String fireStr = null;
		
		if (value)
			fireStr = "Rule Fired";
		else
			fireStr = "Rule Not Fired";
		
		return fireStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFireCode (int value) {

		String fireStr = null;
		
		if ( value == 0)
			fireStr = "Rule Not Fired";
		else
			fireStr = "Rule Fired";
		
		return fireStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleFormatCode (int value) {

		String formatStr = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		formatStr = "Fixed Format Rule";		break;
			case VARIABLE_FORMAT:	formatStr = "Variable Format Rule";		break;
			
			default:				formatStr = "Unknown Format Rule";		break;
				
		}
		
		return formatStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleMinLengthCode () {

		return "Minimum Length Rule";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleMaxLengthCode () {

		return "Maximum Length Rule";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertRuleEncodingCode (int value) {

		String encodingStr = null;
		
		switch (value) {
		
			case ASCII_ENCODING:	encodingStr = "ASCII Encoding Rule";	break;
			case EBCDIC_ENCODING:	encodingStr = "EBCDIC Encoding Rule";	break;
			
			default:				encodingStr = "Unknown Encoding Rule";	break;
				
		}
		
		return encodingStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */		
	public String convertRuleDataTypeCode  (int value) {

		String dataType = null;
		
		switch (value) {
		
			case ALPHABETIC_DATATYPE:			dataType = "Alphabetic Data Type Rule";				break;
			case ALPHANUMERIC_DATATYPE:			dataType = "Alphanumeric Data Type Rule";			break;
			case ALPHANUMERIC_SPECIAL_DATATYPE:	dataType = "Alphanumeric Special Data Type Rule";	break;
			case BINARY_DATATYPE:				dataType = "Binary Data Type Rule";					break;
			case DATE_DATATYPE:					dataType = "Date Data Type Rule";					break;
			case NUMERIC_DATATYPE:				dataType = "Numeric Data Type Rule";				break;
			case NUMERIC_SPECIAL_DATATYPE:		dataType = "Numeric Special Data Type Rule";		break;
			case SPECIAL_DATATYPE:				dataType = "Special Data Type Rule";				break;
			case TIMESTAMP_DATATYPE:			dataType = "Timestamp Data Type Rule";				break;
			
			default:							dataType = "Unknown Data Type Rule";				break;
				
		}
		
		return dataType;
		 
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertRuleSourceCode (int value) {

		String source = null;
		
		switch (value) {
		
			case CARDHOLDER_FROM_SOURCE		:	source = "From Cardholder Rule";	break;
			case MERCHANT_FROM_SOURCE		:	source = "From Merchant Rule";		break;
			case ACQUIRER_FROM_SOURCE		:	source = "From Acquirer Rule";		break;
			case ASSOCIATION_FROM_SOURCE	:	source = "From Association Rule";	break;
			case ISSUER_FROM_SOURCE			:	source = "From Issuer Rule";		break;
			case CLIENT_FROM_SOURCE			:	source = "From Client Rule";		break;
			case CLIENT_TO_SOURCE			:	source = "To Client Rule";			break;
			case ISSUER_TO_SOURCE			:	source = "To Issuer Rule";			break;
			case ASSOCIATION_TO_SOURCE		:	source = "To Association Rule";		break;
			case ACQUIRER_TO_SOURCE			:	source = "To Acquirer Rule";		break;
			case MERCHANT_TO_SOURCE			:	source = "To Merchant Rule";		break;
			case CARDHOLDER_TO_SOURCE		:	source = "To Cardholder Rule";		break;
			
			default							:	source = "Unknown Source Rule";		break;
				
		}
		
		return source;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String convertRuleDirectionCode (int value) {

		String direction = null;
		
		switch (value) {
		
			case CARDHOLDER_FROM_DIRECTION		:	direction = "Cardholder->Merchant Rule";	break;
			case MERCHANT_FROM_DIRECTION		:	direction = "Merchant->Acquirer Rule";		break;
			case ACQUIRER_FROM_DIRECTION		:	direction = "Acquirer->Association Rule";	break;
			case ASSOCIATION_FROM_DIRECTION		:	direction = "Association->Issuer Rule";		break;
			case ISSUER_FROM_DIRECTION			:	direction = "Issuer->Client Rule";			break;
			case CLIENT_FROM_DIRECTION			:	direction = "Client->Issuer Rule";			break;
			case ISSUER_TO_DIRECTION			:	direction = "Issuer->Association Rule";		break;
			case ASSOCIATION_TO_DIRECTION		:	direction = "Association->Acquirer Rule";	break;
			case ACQUIRER_TO_DIRECTION			:	direction = "Acquirer->Merchant Rule";		break;
			case MERCHANT_TO_DIRECTION			:	direction = "Merchant->Cardholder Rule";	break;
			
			default								:	direction = "Unknown Direction Rule";		break;
				
		}
		
		return direction;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleExistenceCode (int value) {

		String existence = null;
		
		switch (value) {
		
			case MANDATORY_REMOVED		:	existence = "Prohibited Data Element Rule";		break;
/*			
			public static final int CONDITIONAL_ADDED				= 10;
			public static final int CONDITIONAL_PRESENCE			= 20;
			public static final int CONDITIONAL_REMOVED				= 30;
			
			public static final int MANDATORY_ADDED					= 40;
			public static final int MANDATORY_PRESENCE				= 50;
			public static final int MANDATORY_REMOVED				= 60;
			
			public static final int OPTIONAL_ADDED					= 70;
			public static final int OPTIONAL_PRESENCE				= 80;
			public static final int OPTIONAL_REMOVED				= 90;
*/			
			default							:	existence = "Unknown Element Existence Rule";	break;
				
		}
		
		return existence;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleChangeCode (int value) {

		String change = null;
		
		switch (value) {
		
//			case ELEMENT_FIXED:		change = "Element Fixed Rule";		break;
//			case ELEMENT_ADDED:		change = "Element Added Rule";		break;
//			case ELEMENT_REMOVED:	change = "Element Removed Rule";	break;
			case ELEMENT_CHANGED:	change = "Element Change Rule";		break;
			
			default:				change = "Unknown Change Rule";		break;
				
		}
		
		return change;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleSequenceCode () {

		return "Rule Sequence";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRulePointerCode () {

		return "Rule Pointer";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String convertRuleValueCode () {

		return "Rule Value";
		
	}
	/******************************************************************************
	 * zzz
	 ******************************************************************************
	 */
	public String validateRuleIdName (int value) {

		String subroutine = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_RULE_HEADER_ID			:	subroutine = "Validate Rule ID 000 00";	break;
			case PRIMARY_BITMAP_001_RULE_HEADER_ID					:	subroutine = "Validate Rule ID 001 00";	break;
			case BIN_002_RULE_HEADER_ID								:	subroutine = "Validate Rule ID 002 00";	break;
			case PAN_002_RULE_HEADER_ID								:	subroutine = "Validate Rule ID 002 01";	break;
			case CHECK_DIGIT_002_RULE_HEADER_ID						:	subroutine = "Validate Rule ID 002 02";	break;
			case TRANSACTION_TYPE_003_RULE_HEADER_ID				:	subroutine = "Validate Rule ID 003 00";	break;
			case ACCOUNT_FROM_TYPE_003_RULE_HEADER_ID				:	subroutine = "Validate Rule ID 003 01";	break;
			case ACCOUNT_TO_TYPE_003_RULE_HEADER_ID					:	subroutine = "Validate Rule ID 003 02";	break;
			case TRANSACTION_AMOUNT_004_RULE_HEADER_ID				:	subroutine = "Validate Rule ID 004 00";	break;
			case SETTLEMENT_AMOUNT_005_RULE_HEADER_ID				:	subroutine = "Validate Rule ID 005 00";	break;
			case CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_ID		:	subroutine = "Validate Rule ID 006 00";	break;
			case TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ID			:	subroutine = "Validate Rule ID 007 00";	break;
			case TRANSMISSION_DATE_DAY_007_RULE_HEADER_ID			:	subroutine = "Validate Rule ID 007 01";	break;
			case TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ID			:	subroutine = "Validate Rule ID 007 02";	break;
			case TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ID		:	subroutine = "Validate Rule ID 007 03";	break;
			case TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ID		:	subroutine = "Validate Rule ID 007 04";	break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_ID	:	subroutine = "Validate Rule ID 008 00";	break;
			case SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ID		:	subroutine = "Validate Rule ID 009 00";	break;
		
			default													:	subroutine = "Unknown Validate Name";	break;
			
		}
	
		return subroutine;
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRuleFieldName (int value) {
		
		String fieldStr = null;
		
		switch (value) {
		
			case UNASSIGNED_DATA_ELEMENT_000_FIELD			:	fieldStr = "Unassigned Element Field Validation";				break;
			case PRIMARY_BITMAP_001_FIELD					:	fieldStr = "Primary Bitmap Field Validation";					break;
			case PRIMARY_ACCOUNT_NUMBER_002_FIELD			:	fieldStr = "Primary Account Number Field Validation";			break;
			case PROCESSING_CODE_003_FIELD					:	fieldStr = "Processing Code Field Validation";					break;
			case TRANSACTION_AMOUNT_004_FIELD				:	fieldStr = "Transaction Amount Field Validation";				break;
			case SETTLEMENT_AMOUNT_005_FIELD				:	fieldStr = "Settlement Amount Field  Validation";				break;
			case CARDHOLDER_BILLING_AMOUNT_006_FIELD		:	fieldStr = "Cardholder Billing Amount Field  Validation";		break;
			case TRANSMISSION_DATE_TIME_007_FIELD			:	fieldStr = "Transmmission Date Time Field  Validation";			break;
			case CARDHOLDER_BILLING_FEE_AMOUNT_008_FIELD	:	fieldStr = "Cardholder Billing Fee Amount Field  Validation";	break;
			case SETTLEMENT_CONVERSION_RATE_009_FIELD		:	fieldStr = "Settlement Conversion Rate Field  Validation";		break;
			
			default											:	fieldStr = "Unknown Element Field  Validation";					break;
				
		}
		return fieldStr;
	}

	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleTypeCode (int value) {

		String ruleTypeStr = null;
		
		switch (value) {
		
			case UNASSIGNED_RULE_TYPE	:	ruleTypeStr = "Unassigned Type Validation";	break;
//			case BITMAP_RULE_TYPE		:	ruleTypeStr = "Bitmap Type Validation";		break;
			case COMPOSITE_RULE_TYPE	:	ruleTypeStr = "Composite Type Validation";	break;
//			case DATE_TIME_RULE_TYPE	:	ruleTypeStr = "Year Date Type Validation";	break;
//			case CURRENCY_RULE_TYPE		:	ruleTypeStr = "Currency Type Validation";	break;
			
			default						:	ruleTypeStr = "Unknown Type Validation";	break;
				
		}
		
		return ruleTypeStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleGroupCode (int value) {

		String ruleGroupStr = null;
		
		switch (value) {
		
			case UNASSIGNED_RULE_GROUP	:	ruleGroupStr = "Unknown Group Validation";		break;
			case BITMAP_RULE_GROUP		: 	ruleGroupStr = "Bitmap Group Validation";		break;
			case CODE_RULE_GROUP		:	ruleGroupStr = "Code Group Validation";			break;
			case DATE_TIME_RULE_GROUP	:	ruleGroupStr = "Date Time Group Validation";	break;
			case CURRENCY_RULE_GROUP	:	ruleGroupStr = "Currency Group Validation";		break;
			case RATE_RULE_GROUP		:	ruleGroupStr = "Rate Group Validation";			break;
			
			default						:	ruleGroupStr = "Unknown Group Validation";		break;
			
		}
		
		return ruleGroupStr;
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRuleFireCode (int value) {
		
		String fireStr = null;
		
		if ( value == 0)
			fireStr = "Rule Not Fired Value";
		else
			fireStr = "Rule Fired Value";
		
		return fireStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleFormatCode (int value) {

		String formatStr = null;
		
		switch (value) {
		
			case FIXED_FORMAT:		formatStr = "Fixed Format Validation";		break;
			case VARIABLE_FORMAT:	formatStr = "Variable Format Validation";	break;
			
			default:				formatStr = "Unknown Format Validation";	break;
				
		}
		
		return formatStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleMinLengthCode () {

		return "Rule Minimum Length Validation";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleMaxLengthCode () {

		return "Rule Maximum Length Validation";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRuleEncodingCode (int value) {

		String encodingStr = null;
		
		switch (value) {
		
			case ASCII_ENCODING:	encodingStr = "ASCII Encoding Validation";		break;
			case EBCDIC_ENCODING:	encodingStr = "EBCDIC Encoding Validation";		break;
			
			default:				encodingStr = "Unknown Encoding Validation";	break;
				
		}
		
		return encodingStr;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */		
	public String validateRuleDataTypeCode  (int value) {

		String dataType = null;
		
		switch (value) {
		
			case ALPHABETIC_DATATYPE:			dataType = "Alphabetic Data Type Validation";			break;
			case ALPHANUMERIC_DATATYPE:			dataType = "Alphanumeric Data Type Validation";			break;
			case ALPHANUMERIC_SPECIAL_DATATYPE:	dataType = "Alphanumeric Special Data Type Validation";	break;
			case BINARY_DATATYPE:				dataType = "Binary Data Type Validation";				break;
			case DATE_DATATYPE:					dataType = "Date Data Type Validation";					break;
			case NUMERIC_DATATYPE:				dataType = "Numeric Data Type Validation";				break;
			case NUMERIC_SPECIAL_DATATYPE:		dataType = "Numeric Special Data Type Validation";		break;
			case SPECIAL_DATATYPE:				dataType = "Special Data Type Validation";				break;
			case TIMESTAMP_DATATYPE:			dataType = "Timestamp Data Type Validation";			break;
			
			default:							dataType = "Unknown Data Type Validation";				break;
				
		}
		
		return dataType;
		 
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRuleSourceCode (int value) {

		String source = null;
		
		switch (value) {
		
			case CARDHOLDER_FROM_SOURCE		:	source = "From Cardholder Validation";	break;
			case MERCHANT_FROM_SOURCE		:	source = "From Merchant Validation";	break;
			case ACQUIRER_FROM_SOURCE		:	source = "From Acquirer Validation";	break;
			case ASSOCIATION_FROM_SOURCE	:	source = "From Association Validation";	break;
			case ISSUER_FROM_SOURCE			:	source = "From Issuer Validation";		break;
			case CLIENT_FROM_SOURCE			:	source = "From Client Validation";		break;
			case CLIENT_TO_SOURCE			:	source = "To Client Validation";		break;
			case ISSUER_TO_SOURCE			:	source = "To Issuer Validation";		break;
			case ASSOCIATION_TO_SOURCE		:	source = "To Association Validation";	break;
			case ACQUIRER_TO_SOURCE			:	source = "To Acquirer Validation";		break;
			case MERCHANT_TO_SOURCE			:	source = "To Merchant Validation";		break;
			case CARDHOLDER_TO_SOURCE		:	source = "To Cardholder Validation";	break;
			
			default							:	source = "Unknown Source Validation";	break;
				
		}
		
		return source;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRuleDirectionCode (int value) {

		String direction = null;
		
		switch (value) {
		
			case CARDHOLDER_FROM_DIRECTION		:	direction = "Cardholder->Merchant Validation";		break;
			case MERCHANT_FROM_DIRECTION		:	direction = "Merchant->Acquirer Validation";		break;
			case ACQUIRER_FROM_DIRECTION		:	direction = "Acquirer->Association Validation";		break;
			case ASSOCIATION_FROM_DIRECTION		:	direction = "Association->Issuer Validation";		break;
			case ISSUER_FROM_DIRECTION			:	direction = "Issuer->Client Validation";			break;
			case CLIENT_FROM_DIRECTION			:	direction = "Client->Issuer Validation";			break;
			case ISSUER_TO_DIRECTION			:	direction = "Issuer->Association Validation";		break;
			case ASSOCIATION_TO_DIRECTION		:	direction = "Association->Acquirer Validation";		break;
			case ACQUIRER_TO_DIRECTION			:	direction = "Acquirer->Merchant Validation";		break;
			case MERCHANT_TO_DIRECTION			:	direction = "Merchant->Cardholder Validation";		break;
			
			default								:	direction = "Unknown Direction Validation";			break;
				
		}
		
		return direction;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleExistenceCode (int value) {

		String existence = null;
		
		switch (value) {
		
//			case PROHIBITED_EXISTENCE		:	existence = "Prohibited Data Element Validation";		break;
//			case CONDITIONAL_EXISTENCE		:	existence = "Conditional Data Element Validation";		break;
//			case MANDATORY_EXISTENCE		:	existence = "Mandatory Data Element Validation";		break;
//			case MANDATORY_ECHO_EXISTENCE	:	existence = "Mandatory Echo Data Element Validation";	break;
			
			default							:	existence = "Unknown Element Existence Validation";		break;
				
		}
		
		return existence;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleChangeCode (int value) {

		String change = null;
		
		switch (value) {
		
//			case ELEMENT_FIXED:		change = "Element Fixed Validation";	break;
//			case ELEMENT_ADDED:		change = "Element Added Validation";	break;
//			case ELEMENT_REMOVED:	change = "Element Removed Validation";	break;
//			case ELEMENT_CHANGE:	change = "Element Change Validation";	break;
			
			default:				change = "Unknown Change Validation";	break;
				
		}
		
		return change;
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */
	public String validateRuleValueCode (int value) {

		return "Rule Value Validation";
		
	}	
	/******************************************************************************
	 ******************************************************************************
	 */		
	public String validateRuleSequenceCode (int value) {
		
		return "Rule Sequence Validation";
		
	}
	/******************************************************************************
	 ******************************************************************************
	 */	
	public String validateRulePointerCode (int value) {
		
		return "Rule Pointer Validation";
		
	}
	/***********************************************************************************
	***********************************************************************************
	*/
	public List<CodeBean> createCodes () {
		
		List<CodeBean> codeTableRowList = new ArrayList<CodeBean>();
		
		// Header Format
		
		CodeBean codeTableRow01010 = new CodeBean( 0,  10, 10, "Fixed Format"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow01020 = new CodeBean( 0,  10, 20, "Variable Format"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow01030 = new CodeBean( 0,  10, 99, "Unknown Format"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow01010);
		codeTableRowList.add(codeTableRow01020);
		codeTableRowList.add(codeTableRow01030);
		
		// Header Encoding
		
		CodeBean codeTableRow02010 = new CodeBean( 0,  20, 10, "ASCII"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02020 = new CodeBean( 0,  20, 20, "EBCDIC"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow02010);
		codeTableRowList.add(codeTableRow02020);
		
		// Header Data Type
		
		CodeBean codeTableRow02110 = new CodeBean( 0,  30, 10, "Alphabetic"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02120 = new CodeBean( 0,  30, 20, "Alphanumeric"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02130 = new CodeBean( 0,  30, 30, "Alphanumeric Special"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02140 = new CodeBean( 0,  30, 40, "Binary"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02150 = new CodeBean( 0,  30, 50, "Date"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02160 = new CodeBean( 0,  30, 60, "Numeric"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02170 = new CodeBean( 0,  30, 70, "Numeric Special"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02180 = new CodeBean( 0,  30, 80, "Special"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow02190 = new CodeBean( 0,  30, 90, "Timestamp"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
		codeTableRowList.add(codeTableRow02110);
		codeTableRowList.add(codeTableRow02120);	
		codeTableRowList.add(codeTableRow02130);
		codeTableRowList.add(codeTableRow02140);	
		codeTableRowList.add(codeTableRow02150);
		codeTableRowList.add(codeTableRow02160);	
		codeTableRowList.add(codeTableRow02170);
		codeTableRowList.add(codeTableRow02180);	
		codeTableRowList.add(codeTableRow02190);
		
		// Header Source
		
		CodeBean codeTableRow05110 = new CodeBean( 0,  40, 10, "From Cardholder"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05120 = new CodeBean( 0,  40, 15, "From Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05130 = new CodeBean( 0,  40, 20, "From Acquirer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05140 = new CodeBean( 0,  40, 25, "From Association"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05150 = new CodeBean( 0,  40, 30, "From Issuer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05160 = new CodeBean( 0,  40, 35, "From Client"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05170 = new CodeBean( 0,  40, 40, "To Client"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05180 = new CodeBean( 0,  40, 45, "To Issuer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow05190 = new CodeBean( 0,  40, 50, "To Association"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051A0 = new CodeBean( 0,  40, 55, "To Acquirer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051B0 = new CodeBean( 0,  40, 60, "To Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow051C0 = new CodeBean( 0,  40, 65, "To Cardholder"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
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

		// Header Direction
		
		CodeBean codeTableRow07110 = new CodeBean( 0,  50, 10, "Cardholder->Merchant"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07120 = new CodeBean( 0,  50, 15, "Merchant->Acquirer"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07130 = new CodeBean( 0,  50, 20, "Acquirer->Association"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07140 = new CodeBean( 0,  50, 25, "Association->Issuer"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07150 = new CodeBean( 0,  50, 30, "Issuer->Client"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07160 = new CodeBean( 0,  50, 35, "Client->Issuer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07170 = new CodeBean( 0,  50, 40, "Issuer->Association"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07180 = new CodeBean( 0,  50, 45, "Association->Acquirer"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow07190 = new CodeBean( 0,  50, 50, "Acquirer->Merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow071A0 = new CodeBean( 0,  50, 55, "Merchant->Cardholder"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
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
		
		// Header Existence
		 
		CodeBean codeTableRow08110 = new CodeBean( 0,  60, 10, "Conditional Added"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08120 = new CodeBean( 0,  60, 20, "Conditional Presence"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08130 = new CodeBean( 0,  60, 30, "Conditional Removed"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08140 = new CodeBean( 0,  60, 40, "Mandatory Added"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08150 = new CodeBean( 0,  60, 50, "Mandatory Presence"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08160 = new CodeBean( 0,  60, 60, "Mandatory Removed"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08170 = new CodeBean( 0,  60, 70, "Optional Added"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08180 = new CodeBean( 0,  60, 80, "Optional Presence"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow08190 = new CodeBean( 0,  60, 90, "Optional Removed"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
				
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
		 
		CodeBean codeTableRowA8110 = new CodeBean( 0,  70, 10, "Rule Fired"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowA8120 = new CodeBean( 0,  70, 20, "Rule Not Fired"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRowA8110);
		codeTableRowList.add(codeTableRowA8120);	
		
		// Detail Rule Type
		 
		CodeBean codeTableRowB8110 = new CodeBean( 0,  80, 10, "Address Rule Type"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowB8120 = new CodeBean( 0,  80, 20, "Composite Rule Type"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowB8130 = new CodeBean( 0,  80, 30, "Constant Rule Type"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowB8140 = new CodeBean( 0,  80, 40, "Database Rule Type"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowB8150 = new CodeBean( 0,  80, 50, "Numeric Rule Type"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRowB8110);
		codeTableRowList.add(codeTableRowB8120);
		codeTableRowList.add(codeTableRowB8130);
		codeTableRowList.add(codeTableRowB8140);
		codeTableRowList.add(codeTableRowB8150);
		
		// Detail Rule Group
		 
		CodeBean codeTableRowC8110 = new CodeBean( 0,  90, 10, "Address Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8120 = new CodeBean( 0,  90, 15, "Arithmetic Rule Group"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8130 = new CodeBean( 0,  90, 20, "Bitmap Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8140 = new CodeBean( 0,  90, 25, "Character Rule Group"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8150 = new CodeBean( 0,  90, 30, "City Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8160 = new CodeBean( 0,  90, 35, "Code Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8170 = new CodeBean( 0,  90, 40, "Country Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8180 = new CodeBean( 0,  90, 45, "Currency Rule Group"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC8190 = new CodeBean( 0,  90, 50, "Date Time Rule Group"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC81A0 = new CodeBean( 0,  90, 55, "Exact Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC81B0 = new CodeBean( 0,  90, 60, "Range Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC81C0 = new CodeBean( 0,  90, 65, "Rate Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC81D0 = new CodeBean( 0,  90, 70, "Sequence Rule Group"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRowC81E0 = new CodeBean( 0,  90, 75, "State Rule Group"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRowC8110);
		codeTableRowList.add(codeTableRowC8120);
		codeTableRowList.add(codeTableRowC8130);
		codeTableRowList.add(codeTableRowC8140);
		codeTableRowList.add(codeTableRowC8150);
		codeTableRowList.add(codeTableRowC8160);
		codeTableRowList.add(codeTableRowC8170);
		codeTableRowList.add(codeTableRowC8180);
		codeTableRowList.add(codeTableRowC8190);
		codeTableRowList.add(codeTableRowC81A0);
		codeTableRowList.add(codeTableRowC81B0);
		codeTableRowList.add(codeTableRowC81C0);
		codeTableRowList.add(codeTableRowC81D0);
		codeTableRowList.add(codeTableRowC81E0);
		
		// DE 001 Bitmap 					- N/A
		// DE 002 Primary Account Number 	- N/A
		
		// DE 003 SF 01	Transaction Type					 
		// DE 055 SF 9C Transaction Type
		
		CodeBean codeTableRow03010 = new CodeBean( 0,  300, 10, "Purchase of Goods or Services"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03011 = new CodeBean( 0,  300, 20, "Withdrawal/Cash Advance"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03012 = new CodeBean( 0,  300, 30, "Cash Check"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03013 = new CodeBean( 0,  300, 40, "Deposit (Credit)"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03014 = new CodeBean( 0,  300, 50, "Available Funds Inquiry"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03015 = new CodeBean( 0,  300, 60, "Transfer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03016 = new CodeBean( 0,  300, 70, "Bill Payments"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow03010);
		codeTableRowList.add(codeTableRow03011);
		codeTableRowList.add(codeTableRow03012);
		codeTableRowList.add(codeTableRow03013);
		codeTableRowList.add(codeTableRow03014);
		codeTableRowList.add(codeTableRow03015);
		codeTableRowList.add(codeTableRow03016);
		
		// DE 003 SF 02	Account Type From					 
		// DE 054 SF 00 Additional Amounts Account Type
		
		CodeBean codeTableRow03020 = new CodeBean( 0,  301, 10, "Not Specified"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03021 = new CodeBean( 0,  301, 20, "Savings Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03022 = new CodeBean( 0,  301, 30, "Checking Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03023 = new CodeBean( 0,  301, 40, "Credit Card Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03024 = new CodeBean( 0,  301, 50, "Cash Benefits Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow03020);
		codeTableRowList.add(codeTableRow03021);
		codeTableRowList.add(codeTableRow03022);
		codeTableRowList.add(codeTableRow03023);
		codeTableRowList.add(codeTableRow03024);
		
		// DE 003 SF 03	Account Type To						 
		// DE 054 SF 00 Additional Amounts Account Type
		
		CodeBean codeTableRow03030 = new CodeBean( 0,  302, 10, "Not Specified"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03031 = new CodeBean( 0,  302, 20, "Savings Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03032 = new CodeBean( 0,  302, 30, "Checking Account"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03033 = new CodeBean( 0,  302, 40, "Credit Card Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow03034 = new CodeBean( 0,  302, 50, "Cash Benefits Account"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow18000 = new CodeBean( 0,   1800, 1520, "General Contractors/Residential and Commerical"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18001 = new CodeBean( 0,   1800, 3002, "Pan American Airlines"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18002 = new CodeBean( 0,   1800, 3393, "National Car Rental"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18003 = new CodeBean( 0,   1800, 3501, "Holiday Inn Express"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800B = new CodeBean( 0,   1800, 4829, "Money Orders – Wire Transfer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18004 = new CodeBean( 0,   1800, 4900, "Utilities - Electric, Gas, Water"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18005 = new CodeBean( 0,   1800, 5045, "Computers, Peripheral Equipment, Software"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800A = new CodeBean( 0,   1800, 5122, "Drugs and Drug Proprietors"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800C = new CodeBean( 0,   1800, 5172, "Petroleum and Petroleum Products"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18006 = new CodeBean( 0,   1800, 5411, "Grocery Stores, Supermarkets"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18007 = new CodeBean( 0,   1800, 5541, "Service Stations"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18008 = new CodeBean( 0,   1800, 5542, "Automated Fuel Dispenser"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18009 = new CodeBean( 0,   1800, 5651, "Family Clothing Stores"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow1800D = new CodeBean( 0,   1800, 5971, "Art Dealers and Galleries"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18010 = new CodeBean( 0,   1800, 6011, "Automated Cash"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18011 = new CodeBean( 0,   1800, 7298, "Health and Beauty Spas"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18012 = new CodeBean( 0,   1800, 7372, "Computer Programming, Integrated Systems Design"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18013 = new CodeBean( 0,   1800, 7832, "Motion Picture Theatres"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18014 = new CodeBean( 0,   1800, 8111, "Legal Services, Attorneys"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow18015 = new CodeBean( 0,   1800, 9311, "Tax Payments"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		// DE 055 SF 5F2A
		// DE 055 SF 9F1A
		// DE 059 SF 01 National POS Geographic Data Country Code ?
		
		CodeBean codeTableRow19000 = new CodeBean( 0,  1900,  36, "Australia"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19001 = new CodeBean( 0,  1900,  76, "Brazil"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19002 = new CodeBean( 0,  1900, 124, "Canada"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19003 = new CodeBean( 0,  1900, 156, "China"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19004 = new CodeBean( 0,  1900, 250, "France"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19005 = new CodeBean( 0,  1900, 276, "Germany"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19006 = new CodeBean( 0,  1900, 356, "India"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19007 = new CodeBean( 0,  1900, 372, "Ireland"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19008 = new CodeBean( 0,  1900, 380, "Italy"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19009 = new CodeBean( 0,  1900, 392, "Japan"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow19010 = new CodeBean( 0,  1900, 438, "Liechtenstein"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19011 = new CodeBean( 0,  1900, 484, "Mexico"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19012 = new CodeBean( 0,  1900, 554, "New Zealand"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19013 = new CodeBean( 0,  1900, 591, "Panama"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19014 = new CodeBean( 0,  1900, 608, "Philippines"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19015 = new CodeBean( 0,  1900, 630, "Puerto Rico"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19016 = new CodeBean( 0,  1900, 634, "Qatar"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19017 = new CodeBean( 0,  1900, 643, "Russian Federation"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19018 = new CodeBean( 0,  1900, 682, "Saudi Arabia"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19019 = new CodeBean( 0,  1900, 702, "Singapore"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow19020 = new CodeBean( 0,  1900, 706, "Somalia"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19021 = new CodeBean( 0,  1900, 724, "Spain"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19022 = new CodeBean( 0,  1900, 756, "Switzerland"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19023 = new CodeBean( 0,  1900, 818, "Egypt"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow19024 = new CodeBean( 0,  1900, 840, "United States of America"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		codeTableRowList.add(codeTableRow19015);
		codeTableRowList.add(codeTableRow19016);
		codeTableRowList.add(codeTableRow19017);
		codeTableRowList.add(codeTableRow19018);
		codeTableRowList.add(codeTableRow19019);
		
		codeTableRowList.add(codeTableRow19020);
		codeTableRowList.add(codeTableRow19021);
		codeTableRowList.add(codeTableRow19022);
		codeTableRowList.add(codeTableRow19023);
		codeTableRowList.add(codeTableRow19024);
		
		// DE 022 SF 00	PAN and Transaction Entry Mode  n 2
		
		CodeBean codeTableRow22000 = new CodeBean( 0,  2200, 10, "Unknown or Terminal Not Used"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22001 = new CodeBean( 0,  2200, 15, "Manual Key Entry PAN"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22002 = new CodeBean( 0,  2200, 20, "Magnetic Stripes Read; CVV Checking Possible"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22003 = new CodeBean( 0,  2200, 25, "Bar Code Reader"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22005 = new CodeBean( 0,  2200, 30, "IC Cards Read; CVV or iCVV Checking Possible"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22007 = new CodeBean( 0,  2200, 35, "Contactless Device-Read Using VSDC Chip Data Rules"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22008 = new CodeBean( 0,  2200, 40, "Store and Forward"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22009 = new CodeBean( 0,  2200, 45, "MICR Reader"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22011 = new CodeBean( 0,  2200, 50, "Magnetic Stripe Read including Track 1 & 2"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22012 = new CodeBean( 0,  2200, 55, "Contactless Device-Read Originated using Mag Stripe"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow22015 = new CodeBean( 0,  2201, 1, "Unknown"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22016 = new CodeBean( 0,  2201, 2, "POS Terminal Can Accept and Forward Online PIN"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22017 = new CodeBean( 0,  2201, 3, "POS Terminal Cannot Accept and Forward Online PIN"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22018 = new CodeBean( 0,  2201, 4, "Terminal PIN Pad is Down"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow22019 = new CodeBean( 0,  2201, 5, "Reserved for Future Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow22015);
		codeTableRowList.add(codeTableRow22016);
		codeTableRowList.add(codeTableRow22017);
		codeTableRowList.add(codeTableRow22018);
		codeTableRowList.add(codeTableRow22019);
		
		// DE 023 Application PAN Sequence Number
		// DE 024 Function Code
		
		// DE 025 00 Point of Service Condition Code
		
		CodeBean codeTableRow25000 = new CodeBean( 0,  2500, 10, "Normal Transaction"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25001 = new CodeBean( 0,  2500, 15, "Customer Not Present"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25002 = new CodeBean( 0,  2500, 20, "Unattended Cardholder-Activated Environments PIN Data Present"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25003 = new CodeBean( 0,  2500, 25, "Merchant Suspicious of Transaction"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25004 = new CodeBean( 0,  2500, 30, "Customer Present, Card Not Present"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25006 = new CodeBean( 0,  2500, 35, "Mail/Telephone Order"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25007 = new CodeBean( 0,  2500, 40, "Customer Identity Verified (Check Acceptance Only)"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25008 = new CodeBean( 0,  2500, 45, "Suspected Fraud"													, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25010 = new CodeBean( 0,  2500, 50, "Representment of Item"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25011 = new CodeBean( 0,  2500, 55, "Chargeback (validation or advice)"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25012 = new CodeBean( 0,  2500, 60, "Address/CVV2/Account without Verification"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25013 = new CodeBean( 0,  2500, 65, "POS Check Original Full Transaction or Adjustment"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25014 = new CodeBean( 0,  2500, 70, "Chargeback Reversal"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25016 = new CodeBean( 0,  2500, 75, "Electronic Commerce Request by Public Network"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow25017 = new CodeBean( 0,  2500, 80, "Card Present, Magnetic Stripe Cannot Be Read"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow28000 = new CodeBean( 0,  2800, 10, "Credit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow28001 = new CodeBean( 0,  2800, 20, "Debit"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow28000);
		codeTableRowList.add(codeTableRow28001);
		
		// DE 032 00 Acquiring Institution Identification Code	n...11; actual n=10
		// DE 033 00 Forwarding Institution Identification Code
		
		CodeBean codeTableRow32000 = new CodeBean( 0,  3200, 1250750010, "Institution Identification 100"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32001 = new CodeBean( 0,  3200, 1250750020, "Institution Identification 200"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32002 = new CodeBean( 0,  3200, 1250750030, "Institution Identification 300"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32003 = new CodeBean( 0,  3200, 1250750040, "Institution Identification 400"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32004 = new CodeBean( 0,  3200, 1250750050, "Institution Identification 500"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32005 = new CodeBean( 0,  3200, 1250750055, "Institution Identification 550"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32006 = new CodeBean( 0,  3200, 1250750060, "Institution Identification 600"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32007 = new CodeBean( 0,  3200, 1250750070, "Institution Identification 700"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32008 = new CodeBean( 0,  3200, 1250750080, "Institution Identification 800"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow32009 = new CodeBean( 0,  3200, 1250750090, "Institution Identification 900"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		// DE 034 Extended Primary Account Number
		
		// DE 038 00 Authorization Identification Response	an 6
		
		CodeBean codeTableRow38000 = new CodeBean( 0,  3800, 100000, "000ABC"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38001 = new CodeBean( 0,  3800, 150000, "100BCD"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38002 = new CodeBean( 0,  3800, 200000, "200CDE"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38003 = new CodeBean( 0,  3800, 250000, "300DEF"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38004 = new CodeBean( 0,  3800, 300000, "400EFG"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38005 = new CodeBean( 0,  3800, 350000, "500FGH"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38006 = new CodeBean( 0,  3800, 400000, "600GHI"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38007 = new CodeBean( 0,  3800, 450000, "700HIJ"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38008 = new CodeBean( 0,  3800, 500000, "800IJK"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow38009 = new CodeBean( 0,  3800, 550000, "900JKL"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow39000 = new CodeBean( 0,  3900,  0, "Successful approval"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39001 = new CodeBean( 0,  3900,  1, "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39002 = new CodeBean( 0,  3900,  2, "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39003 = new CodeBean( 0,  3900,  3, "Invalid merchant or service provider"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39004 = new CodeBean( 0,  3900,  4, "Pickup card"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39005 = new CodeBean( 0,  3900,  5, "Do not honor"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39006 = new CodeBean( 0,  3900,  6, "General Error"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39007 = new CodeBean( 0,  3900,  7, "Pickup card not lost or stolen card"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39008 = new CodeBean( 0,  3900,  8, "Honor with identification"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39009 = new CodeBean( 0,  3900,  9, "Request in progress"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39010 = new CodeBean( 0,  3900, 10, "Partial Approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39011 = new CodeBean( 0,  3900, 11, "V.I.P. approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39012 = new CodeBean( 0,  3900, 12, "Invalid transaction"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39013 = new CodeBean( 0,  3900, 13, "Invalid amount"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39014 = new CodeBean( 0,  3900, 14, "Invalid account number"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39015 = new CodeBean( 0,  3900, 15, "No such issuer"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39016 = new CodeBean( 0,  3900, 16, "Insufficient funds"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39017 = new CodeBean( 0,  3900, 17, "Customer cancellation"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39018 = new CodeBean( 0,  3900, 18, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39019 = new CodeBean( 0,  3900, 19, "Re-enter transaction"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39020 = new CodeBean( 0,  3900, 20, "Invalid response"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39021 = new CodeBean( 0,  3900, 21, "No action taken"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39022 = new CodeBean( 0,  3900, 22, "Suspected Malfunction"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39023 = new CodeBean( 0,  3900, 23, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39024 = new CodeBean( 0,  3900, 24, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39025 = new CodeBean( 0,  3900, 25, "Unable to locate record in file"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39026 = new CodeBean( 0,  3900, 26, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39027 = new CodeBean( 0,  3900, 27, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39028 = new CodeBean( 0,  3900, 28, "File is temporarily unavailable"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39029 = new CodeBean( 0,  3900, 29, "Not in Use"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39030 = new CodeBean( 0,  3900, 30, "Format Error"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39031 = new CodeBean( 0,  3900, 31, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39032 = new CodeBean( 0,  3900, 32, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39033 = new CodeBean( 0,  3900, 33, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39034 = new CodeBean( 0,  3900, 34, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39035 = new CodeBean( 0,  3900, 35, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39036 = new CodeBean( 0,  3900, 36, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39037 = new CodeBean( 0,  3900, 37, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39038 = new CodeBean( 0,  3900, 38, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39039 = new CodeBean( 0,  3900, 39, "Not in Use"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39040 = new CodeBean( 0,  3900, 40, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39041 = new CodeBean( 0,  3900, 41, "Pickup card (lost card)"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39042 = new CodeBean( 0,  3900, 42, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39043 = new CodeBean( 0,  3900, 43, "Pickup card (stolen card)"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39044 = new CodeBean( 0,  3900, 44, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39045 = new CodeBean( 0,  3900, 45, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39046 = new CodeBean( 0,  3900, 46, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39047 = new CodeBean( 0,  3900, 47, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39048 = new CodeBean( 0,  3900, 48, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39049 = new CodeBean( 0,  3900, 49, "Not in Use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39050 = new CodeBean( 0,  3900, 50, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39051 = new CodeBean( 0,  3900, 51, "Insufficient funds"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39052 = new CodeBean( 0,  3900, 52, "No checking account"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39053 = new CodeBean( 0,  3900, 53, "No savings account"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39054 = new CodeBean( 0,  3900, 54, "Expired card"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39055 = new CodeBean( 0,  3900, 55, "Incorrect PIN"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39056 = new CodeBean( 0,  3900, 56, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39057 = new CodeBean( 0,  3900, 57, "Transaction not permitted to cardholder"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39058 = new CodeBean( 0,  3900, 58, "Transaction not allowed at terminal"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39059 = new CodeBean( 0,  3900, 59, "Suspected fraud"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow39060 = new CodeBean( 0,  3900, 60, "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39061 = new CodeBean( 0,  3900, 61, "Activity amount limit exceeded"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39062 = new CodeBean( 0,  3900, 62, "Restricted card"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39063 = new CodeBean( 0,  3900, 63, "Security violation"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39064 = new CodeBean( 0,  3900, 64, "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39065 = new CodeBean( 0,  3900, 65, "Activity count limit exceeded"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39066 = new CodeBean( 0,  3900, 66, "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39067 = new CodeBean( 0,  3900, 67, "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39068 = new CodeBean( 0,  3900, 68, "Response received too late"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39069 = new CodeBean( 0,  3900, 69, "Not in Use"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow39070 = new CodeBean( 0,  3900, 70, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39071 = new CodeBean( 0,  3900, 71, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39072 = new CodeBean( 0,  3900, 72, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39073 = new CodeBean( 0,  3900, 73, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39074 = new CodeBean( 0,  3900, 74, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39075 = new CodeBean( 0,  3900, 75, "Allowable number of PIN-entry tries exceeded"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39076 = new CodeBean( 0,  3900, 76, "Unable to locate previous message"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39077 = new CodeBean( 0,  3900, 77, "repeat or reversal data are inconsistent with original message"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39078 = new CodeBean( 0,  3900, 78, "Blocked, first used"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39079 = new CodeBean( 0,  3900, 79, "Not in Use"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
	
		CodeBean codeTableRow39080 = new CodeBean( 0,  3900, 80, "credit issuer unavailable"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39081 = new CodeBean( 0,  3900, 81, "PIN cryptographic error found"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39082 = new CodeBean( 0,  3900, 82, "Negative CAM, dCVV, iCVV, or CVV results"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39083 = new CodeBean( 0,  3900, 83, "Unable to verify PIN"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39084 = new CodeBean( 0,  3900, 84, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39085 = new CodeBean( 0,  3900, 85, "No reason to decline a request"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39086 = new CodeBean( 0,  3900, 86, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39087 = new CodeBean( 0,  3900, 87, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39088 = new CodeBean( 0,  3900, 88, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39089 = new CodeBean( 0,  3900, 89, "Not in Use"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow39090 = new CodeBean( 0,  3900, 90, "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39091 = new CodeBean( 0,  3900, 91, "Issuer unavailable or switch inoperative"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39092 = new CodeBean( 0,  3900, 92, "Destination cannot be found for routing"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39093 = new CodeBean( 0,  3900, 93, "Transaction cannot be completed, violation of law"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39094 = new CodeBean( 0,  3900, 94, "Duplicate Transmission"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39095 = new CodeBean( 0,  3900, 95, "Reconcile error"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39096 = new CodeBean( 0,  3900, 96, "System malfunction"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39097 = new CodeBean( 0,  3900, 97, "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39098 = new CodeBean( 0,  3900, 98, "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow39099 = new CodeBean( 0,  3900, 99, "Not in Use"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);		

//		Code codeTableRow39100 = new Code( 0,  3900, "B1", "Surcharge amount not permitted on Visa cards"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39101 = new Code( 0,  3900, "N0", "Force STIP"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39102 = new Code( 0,  3900, "N3", "Cash service not available"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39103 = new Code( 0,  3900, "N4", "Cash back request exceeds issuer limit"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39104 = new Code( 0,  3900, "N7", "Decline for CVV2 failure"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39105 = new Code( 0,  3900, "P2", "Invalid biller information"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39106 = new Code( 0,  3900, "P5", "PIN Change/Unblock request declined"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39107 = new Code( 0,  3900, "P6", "Unsafe PIN"										, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39108 = new Code( 0,  3900, "Q1", "Card Authentication failed"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39109 = new Code( 0,  3900, "R0", "Stop Payment Order"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);	
		
//		Code codeTableRow39110 = new Code( 0,  3900, "R1", "Revocation of Authorization Order"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39111 = new Code( 0,  3900, "R3", "Revocation of All Authorizations Order"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39112 = new Code( 0,  3900, "XA", "Destination cannot be found for routing"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39113 = new Code( 0,  3900, "XD", "Forward to issuer"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
//		Code codeTableRow39114 = new Code( 0,  3900, "Z3", "Unable to go online"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
//		codeTableRowList.add(codeTableRow39100);
//		codeTableRowList.add(codeTableRow39101);
//		codeTableRowList.add(codeTableRow39102);
//		codeTableRowList.add(codeTableRow39103);
//		codeTableRowList.add(codeTableRow39104);
//		codeTableRowList.add(codeTableRow39105);
//		codeTableRowList.add(codeTableRow39106);
//		codeTableRowList.add(codeTableRow39107);
//		codeTableRowList.add(codeTableRow39108);
//		codeTableRowList.add(codeTableRow39109);
		
//		codeTableRowList.add(codeTableRow39110);
//		codeTableRowList.add(codeTableRow39111);
//		codeTableRowList.add(codeTableRow39112);
//		codeTableRowList.add(codeTableRow39113);
//		codeTableRowList.add(codeTableRow39114);
		
		// DE 040 00 Service Restriction Code		an 3
		
		CodeBean codeTableRow40000 = new CodeBean( 0,  4000, 100, "Successful approval"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40001 = new CodeBean( 0,  4000, 110, "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40002 = new CodeBean( 0,  4000, 120, "Refer to card issuer"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40003 = new CodeBean( 0,  4000, 130, "Invalid merchant or service provider"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40004 = new CodeBean( 0,  4000, 140, "Pickup card"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40005 = new CodeBean( 0,  4000, 150, "Do not honor"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40006 = new CodeBean( 0,  4000, 160, "General Error"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40007 = new CodeBean( 0,  4000, 170, "Pickup card not lost or stolen card"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40008 = new CodeBean( 0,  4000, 180, "Honor with identification"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow40009 = new CodeBean( 0,  4000, 190, "Request in progress"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow41000 = new CodeBean( 0,  4100, 10101250, "Card Acceptor Terminal ID 0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41001 = new CodeBean( 0,  4100, 15101500, "Card Acceptor Terminal ID 1"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41002 = new CodeBean( 0,  4100, 20101750, "Card Acceptor Terminal ID 2"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41003 = new CodeBean( 0,  4100, 25101200, "Card Acceptor Terminal ID 3"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41004 = new CodeBean( 0,  4100, 30101650, "Card Acceptor Terminal ID 4"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41005 = new CodeBean( 0,  4100, 35101300, "Card Acceptor Terminal ID 5"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41006 = new CodeBean( 0,  4100, 40101150, "Card Acceptor Terminal ID 6"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41007 = new CodeBean( 0,  4100, 45101300, "Card Acceptor Terminal ID 7"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41008 = new CodeBean( 0,  4100, 50101950, "Card Acceptor Terminal ID 8"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow41009 = new CodeBean( 0,  4100, 55101800, "Card Acceptor Terminal ID 9"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow42000 = new CodeBean( 0,  4200, 10101250, "CARD-ACPTR-CODE-000"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42001 = new CodeBean( 0,  4200, 15101250, "CARD-ACPTR-CODE-100"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42002 = new CodeBean( 0,  4200, 20101250, "CARD-ACPTR-CODE-200"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42003 = new CodeBean( 0,  4200, 25101250, "CARD-ACPTR-CODE-300"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42004 = new CodeBean( 0,  4200, 30101250, "CARD-ACPTR-CODE-400"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42005 = new CodeBean( 0,  4200, 35101250, "CARD-ACPTR-CODE-500"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42006 = new CodeBean( 0,  4200, 40101250, "CARD-ACPTR-CODE-600"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42007 = new CodeBean( 0,  4200, 45101250, "CARD-ACPTR-CODE-700"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42008 = new CodeBean( 0,  4200, 50101250, "CARD-ACPTR-CODE-800"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow42009 = new CodeBean( 0,  4200, 55101250, "CARD-ACPTR-CODE-900"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

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
		
		CodeBean codeTableRow43000 = new CodeBean( 0,  4300, 10, "125 Maple Street       "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43001 = new CodeBean( 0,  4300, 15, "700 Agnew Rd, Apt. #311"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43002 = new CodeBean( 0,  4300, 20, "One HP Nonstop Circle  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43003 = new CodeBean( 0,  4300, 25, "60 Cherry Wood Road    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43004 = new CodeBean( 0,  4300, 30, "4 Seaside View Avenue  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43005 = new CodeBean( 0,  4300, 35, "One Rural Route Road   "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43006 = new CodeBean( 0,  4300, 40, "180 Highway Road       "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43007 = new CodeBean( 0,  4300, 45, "700 Agnew Rd, Apt 307  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43008 = new CodeBean( 0,  4300, 50, "One IBM Way            "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43009 = new CodeBean( 0,  4300, 55, "Infinity Circle        "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow43010 = new CodeBean( 0,  4301, 10, "Santa Clara  "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43011 = new CodeBean( 0,  4301, 15, "Palos Verdes "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43012 = new CodeBean( 0,  4301, 20, "New Rochelle "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43013 = new CodeBean( 0,  4301, 25, "San Diego    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43014 = new CodeBean( 0,  4301, 30, "Rolling Hills"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43015 = new CodeBean( 0,  4301, 35, "Sunnyvale    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43016 = new CodeBean( 0,  4301, 40, "Mountain View"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43017 = new CodeBean( 0,  4301, 45, "Miracosta    "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43018 = new CodeBean( 0,  4301, 50, "Costa Mesa   "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43019 = new CodeBean( 0,  4301, 55, "San Jose     "	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow43020 = new CodeBean( 0,  4302,  0, "AL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43021 = new CodeBean( 0,  4302,  1, "AK", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43022 = new CodeBean( 0,  4302,  2, "AZ", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43023 = new CodeBean( 0,  4302,  3, "AR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43024 = new CodeBean( 0,  4302,  4, "CA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43025 = new CodeBean( 0,  4302,  5, "CO", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43026 = new CodeBean( 0,  4302,  6, "CT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43027 = new CodeBean( 0,  4302,  7, "DE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43028 = new CodeBean( 0,  4302,  8, "DC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43029 = new CodeBean( 0,  4302,  9, "FL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);

		CodeBean codeTableRow43030 = new CodeBean( 0,  4302, 10, "GA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43031 = new CodeBean( 0,  4302, 11, "HI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43032 = new CodeBean( 0,  4302, 12, "ID", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43033 = new CodeBean( 0,  4302, 13, "IL", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43034 = new CodeBean( 0,  4302, 14, "IN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43035 = new CodeBean( 0,  4302, 15, "IA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43036 = new CodeBean( 0,  4302, 16, "KS", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43037 = new CodeBean( 0,  4302, 17, "KY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43038 = new CodeBean( 0,  4302, 18, "LA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43039 = new CodeBean( 0,  4302, 19, "ME", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43040 = new CodeBean( 0,  4302, 20, "MD", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43041 = new CodeBean( 0,  4302, 21, "MA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43042 = new CodeBean( 0,  4302, 22, "MI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43043 = new CodeBean( 0,  4302, 23, "MN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43044 = new CodeBean( 0,  4302, 24, "MS", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43045 = new CodeBean( 0,  4302, 25, "MO", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43046 = new CodeBean( 0,  4302, 26, "MT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43047 = new CodeBean( 0,  4302, 27, "NE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43048 = new CodeBean( 0,  4302, 28, "NV", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43049 = new CodeBean( 0,  4302, 29, "NH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43050 = new CodeBean( 0,  4302, 30, "NJ", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43051 = new CodeBean( 0,  4302, 31, "NM", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43052 = new CodeBean( 0,  4302, 32, "NY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43053 = new CodeBean( 0,  4302, 33, "NC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43054 = new CodeBean( 0,  4302, 34, "ND", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43055 = new CodeBean( 0,  4302, 35, "OH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43056 = new CodeBean( 0,  4302, 36, "OK", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43057 = new CodeBean( 0,  4302, 37, "OR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43058 = new CodeBean( 0,  4302, 38, "PA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43059 = new CodeBean( 0,  4302, 39, "RI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43060 = new CodeBean( 0,  4302, 40, "SC", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43061 = new CodeBean( 0,  4302, 41, "SD", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43062 = new CodeBean( 0,  4302, 42, "TN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43063 = new CodeBean( 0,  4302, 43, "TX", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43064 = new CodeBean( 0,  4302, 44, "UT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43065 = new CodeBean( 0,  4302, 45, "VT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43066 = new CodeBean( 0,  4302, 46, "VA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43067 = new CodeBean( 0,  4302, 47, "WA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43068 = new CodeBean( 0,  4302, 48, "WV", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43069 = new CodeBean( 0,  4302, 49, "WI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43070 = new CodeBean( 0,  4302, 50, "WY", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow43081 = new CodeBean( 0,  4303,  36, "AU", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43082 = new CodeBean( 0,  4303, 124, "CA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43083 = new CodeBean( 0,  4303, 156, "CN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43084 = new CodeBean( 0,  4303, 250, "FR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43085 = new CodeBean( 0,  4303, 276, "DE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43086 = new CodeBean( 0,  4303, 356, "IN", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43087 = new CodeBean( 0,  4303, 372, "IE", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43088 = new CodeBean( 0,  4303, 380, "IT", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43089 = new CodeBean( 0,  4303, 392, "JP", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43090 = new CodeBean( 0,  4303, 438, "LI", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43091 = new CodeBean( 0,  4303, 484, "MX", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43092 = new CodeBean( 0,  4303, 554, "NZ", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43093 = new CodeBean( 0,  4303, 591, "PA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43094 = new CodeBean( 0,  4303, 608, "PH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43095 = new CodeBean( 0,  4303, 630, "PR", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43096 = new CodeBean( 0,  4303, 634, "QA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43097 = new CodeBean( 0,  4303, 643, "RU", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43098 = new CodeBean( 0,  4303, 682, "SA", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43099 = new CodeBean( 0,  4303, 702, "SG", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		CodeBean codeTableRow43100 = new CodeBean( 0,  4303, 706, "SO", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43101 = new CodeBean( 0,  4303, 724, "ES", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43102 = new CodeBean( 0,  4303, 756, "CH", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43103 = new CodeBean( 0,  4303, 818, "EG", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow43104 = new CodeBean( 0,  4303, 840, "US", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		codeTableRowList.add(codeTableRow43096);
		codeTableRowList.add(codeTableRow43097);
		codeTableRowList.add(codeTableRow43098);
		codeTableRowList.add(codeTableRow43099);
		
		codeTableRowList.add(codeTableRow43100);
		codeTableRowList.add(codeTableRow43101);
		codeTableRowList.add(codeTableRow43102);
		codeTableRowList.add(codeTableRow43103);
		codeTableRowList.add(codeTableRow43104);
		
		// DE 044 SF 01 Response Source / Reason Code
		
		CodeBean codeTableRow44011 = new CodeBean( 0,  4401, 10, "STIP Response: Request Timed Out by Switch"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44012 = new CodeBean( 0,  4401, 20, "STIP Response: Issuer Not Available"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44013 = new CodeBean( 0,  4401, 30, "Response Provided by Issuer"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44014 = new CodeBean( 0,  4401, 40, "Reversal Matches Original Request Authorization"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44015 = new CodeBean( 0,  4401, 50, "Reversal Doesn't Match Original Request Authorization"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44011);
		codeTableRowList.add(codeTableRow44012);
		codeTableRowList.add(codeTableRow44013);
		codeTableRowList.add(codeTableRow44014);
		codeTableRowList.add(codeTableRow44015);
		
		// DE 044 SF 02 Address Verification Result Code
		
		CodeBean codeTableRow44021 = new CodeBean( 0,  4402,  1, "A",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44022 = new CodeBean( 0,  4402,  2, "B",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44023 = new CodeBean( 0,  4402,  3, "C",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44024 = new CodeBean( 0,  4402,  4, "D",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44025 = new CodeBean( 0,  4402,  6, "F",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44026 = new CodeBean( 0,  4402,  7, "G",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44027 = new CodeBean( 0,  4402,  9, "I",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44028 = new CodeBean( 0,  4402, 13, "M",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44029 = new CodeBean( 0,  4402, 14, "N",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44030 = new CodeBean( 0,  4402, 16, "P",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44031 = new CodeBean( 0,  4402, 18, "R",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44032 = new CodeBean( 0,  4402, 19, "S",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44033 = new CodeBean( 0,  4402, 21, "U",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44034 = new CodeBean( 0,  4402, 23, "W",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44035 = new CodeBean( 0,  4402, 24, "X",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44036 = new CodeBean( 0,  4402, 25, "Y",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44037 = new CodeBean( 0,  4402, 26, "Z",  "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow44051 = new CodeBean( 0,  4405, 1, "CVV, iCVV, or dCVV was not verified."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44052 = new CodeBean( 0,  4405, 2, "CVV, iCVV, or dCVV failed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44053 = new CodeBean( 0,  4405, 3, "CVV, iCVV, or dCVV passed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44054 = new CodeBean( 0,  4405, 4, "Not applicable"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44051);
		codeTableRowList.add(codeTableRow44052);
		codeTableRowList.add(codeTableRow44053);
		codeTableRowList.add(codeTableRow44054);
		
		// DE 044 SF 08 Card Authentication Results Code
		
		CodeBean codeTableRow44081 = new CodeBean( 0,  4408, 1, "Cryptographic error occurred"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44082 = new CodeBean( 0,  4408, 2, "Authorization Request Cryptogram failed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44083 = new CodeBean( 0,  4408, 3, "Authorization Request Cryptogram passed verification."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44081);
		codeTableRowList.add(codeTableRow44082);
		codeTableRowList.add(codeTableRow44083);
		
		// DE 044 SF 10 CVV2 Results Code
		
		CodeBean codeTableRow44101 = new CodeBean( 0,  4410,  3, "C", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44102 = new CodeBean( 0,  4410,  4, "D", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44103 = new CodeBean( 0,  4410, 11, "K", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44104 = new CodeBean( 0,  4410, 12, "L", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44105 = new CodeBean( 0,  4410, 13, "M", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44106 = new CodeBean( 0,  4410, 14, "N", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44107 = new CodeBean( 0,  4410, 16, "P", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44108 = new CodeBean( 0,  4410, 19, "S", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44109 = new CodeBean( 0,  4410, 21, "U", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44101);
		codeTableRowList.add(codeTableRow44102);
		codeTableRowList.add(codeTableRow44103);
		codeTableRowList.add(codeTableRow44104);
		codeTableRowList.add(codeTableRow44105);
		codeTableRowList.add(codeTableRow44106);
		codeTableRowList.add(codeTableRow44107);
		codeTableRowList.add(codeTableRow44108);
		codeTableRowList.add(codeTableRow44109);
		
		// DE 044 SF 13 Card Authentication Verification Value Results Code
		
		CodeBean codeTableRow44131 = new CodeBean( 0,  4413, 0, "CAVV authentication results invalid"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44132 = new CodeBean( 0,  4413, 1, "CAVV failed validation - authentication"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44133 = new CodeBean( 0,  4413, 2, "CAVV passed validation - authentication"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44134 = new CodeBean( 0,  4413, 3, "CAVV passed validation - attempt"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44135 = new CodeBean( 0,  4413, 4, "CAVV failed validation - attempt"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44136 = new CodeBean( 0,  4413, 5, "Not used"									, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow44137 = new CodeBean( 0,  4413, 6, "CAVV not validated; Issuer not participant", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow44131);
		codeTableRowList.add(codeTableRow44132);
		codeTableRowList.add(codeTableRow44133);
		codeTableRowList.add(codeTableRow44134);
		codeTableRowList.add(codeTableRow44135);
		codeTableRowList.add(codeTableRow44136);
		codeTableRowList.add(codeTableRow44137);
		
		// DE 053 SF 00 Security Algorithm Format
		
		CodeBean codeTableRow53001 = new CodeBean( 0,  5300, 20, "Zone encryption"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53001);
		
		// DE 053 SF 01 PIN Encryption Algorithm Identifier
		
		CodeBean codeTableRow53011 = new CodeBean( 0,  5301, 1, "ANSI DES"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53011);
		
		// DE 053 SF 02 PIN Block Format Code
		
		CodeBean codeTableRow53021 = new CodeBean( 0,  5302, 01, "Based on PIN format,length,rightmost acct digits, and pad chars"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53022 = new CodeBean( 0,  5302, 02, "Based on PIN format,length, and numeric pad characters"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53023 = new CodeBean( 0,  5302, 03, "Based on PIN,length, and user-specified numberic pad characters"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53024 = new CodeBean( 0,  5302, 04, "PIN block format (Plus transactions)"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53021);
		codeTableRowList.add(codeTableRow53022);
		codeTableRowList.add(codeTableRow53023);
		codeTableRowList.add(codeTableRow53024);
		
		// DE 053 SF 03 PIN Zone Key Index
		
		CodeBean codeTableRow53031 = new CodeBean( 0,  5303, 00, "Reserved for future use"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53032 = new CodeBean( 0,  5303, 01, "Working Key 1 is to be changed or used."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow53033 = new CodeBean( 0,  5303, 02, "Working Key 2 is to be changed or used."	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow53031);
		codeTableRowList.add(codeTableRow53032);
		codeTableRowList.add(codeTableRow53033);
		
		// DE 054 SF 01 Amount Type
		
		CodeBean codeTableRow54011 = new CodeBean( 0,  5401, 01, "Current ledger balance"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow54012 = new CodeBean( 0,  5401, 02, "Current available balance"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow54011);
		codeTableRowList.add(codeTableRow54012);
		
		// DE 055 SF 9F09 - Application Version Number [binary]
		
		CodeBean codeTableRow9F091 = new CodeBean( 0,  5501, 10, "Version 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F092 = new CodeBean( 0,  5501, 20, "Version 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F093 = new CodeBean( 0,  5501, 30, "Version 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F091);
		codeTableRowList.add(codeTableRow9F092);
		codeTableRowList.add(codeTableRow9F093);
		
		// DE 055 SF 9F1E - Terminal Serial Number an 8
		
		CodeBean codeTableRow9F1E1 = new CodeBean( 0,  5502, 12501200, "Terminal Serial Number 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F1E2 = new CodeBean( 0,  5502, 12502300, "Terminal Serial Number 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F1E3 = new CodeBean( 0,  5502, 12503400, "Terminal Serial Number 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F1E1);
		codeTableRowList.add(codeTableRow9F1E2);
		codeTableRowList.add(codeTableRow9F1E3);
		
		// DE 055 SF 9F35 - Terminal Type n 2
		// DE 060 SF 00   - Terminal Type n 2
		
		CodeBean codeTableRow9F351 = new CodeBean( 0,  5503, 12501000, "Terminal Serial Number 1.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F352 = new CodeBean( 0,  5503, 12501000, "Terminal Serial Number 2.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F353 = new CodeBean( 0,  5503, 12501000, "Terminal Serial Number 3.0"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow9F351);
		codeTableRowList.add(codeTableRow9F352);
		codeTableRowList.add(codeTableRow9F353);
		
		// DE 055 SF 9F53 - Transaction Category Code
		
		CodeBean codeTableRow9F531 = new CodeBean( 0,  5504,  3, "C", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F532 = new CodeBean( 0,  5504, 26, "Z", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F533 = new CodeBean( 0,  5504, 15, "O", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F534 = new CodeBean( 0,  5504,  8, "H", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F535 = new CodeBean( 0,  5504, 24, "X", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F536 = new CodeBean( 0,  5504,  1, "A", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F537 = new CodeBean( 0,  5504,  6, "F", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F538 = new CodeBean( 0,  5504, 20, "T", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F539 = new CodeBean( 0,  5504, 21, "U", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow9F540 = new CodeBean( 0,  5504, 18, "R", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		// DE 059 SF 00 National POS Geographical Data
		// State  Positions 1 - 2
		
		// DE 059 SF 01 National POS Geographical Data
		// County Positions 3 - 5
		
		CodeBean codeTableRow059011 = new CodeBean( 0,  5901,  1, "Alameda County"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059012 = new CodeBean( 0,  5901, 13, "Contra Costa County"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059013 = new CodeBean( 0,  5901, 23, "Humboldt County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059014 = new CodeBean( 0,  5901, 53, "Monterey County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059015 = new CodeBean( 0,  5901, 85, "Santa Clara County"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow059011);
		codeTableRowList.add(codeTableRow059012);
		codeTableRowList.add(codeTableRow059013);
		codeTableRowList.add(codeTableRow059014);
		codeTableRowList.add(codeTableRow059015);
		
		// DE 059 SF 02 National POS Geographical Data
		// Postal Service Code 6 - 14
		
		CodeBean codeTableRow059021 = new CodeBean( 0,  5902, 95014, "Santa Clara"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059022 = new CodeBean( 0,  5902, 95112, "San Jose"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059023 = new CodeBean( 0,  5902, 95008, "Campbell"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059024 = new CodeBean( 0,  5902, 95070, "Saratoga"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow059025 = new CodeBean( 0,  5902, 95014, "Cupertino"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow059021);
		codeTableRowList.add(codeTableRow059022);
		codeTableRowList.add(codeTableRow059023);
		codeTableRowList.add(codeTableRow059024);
		codeTableRowList.add(codeTableRow059025);
		
		// DE 059 SF 03 National POS Geographical Data
		// Country 15 - 17
		
		// DE 060 SF 00 Terminal Type
		
		CodeBean codeTableRow06001 = new CodeBean( 0,  6000, 0, "Unknown"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06002 = new CodeBean( 0,  6000, 1, "Unattended Terminal (ATM)"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06003 = new CodeBean( 0,  6000, 2, "Electronic Cash Register"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06004 = new CodeBean( 0,  6000, 0, "Customer-owned Device"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06005 = new CodeBean( 0,  6000, 1, "Merchant-owned Device"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06001);
		codeTableRowList.add(codeTableRow06002);
		codeTableRowList.add(codeTableRow06003);
		codeTableRowList.add(codeTableRow06004);
		codeTableRowList.add(codeTableRow06005);
		
		// DE 060 SF 01 Terminal Entry Capability
		
		CodeBean codeTableRow06011 = new CodeBean( 0,  6001, 0, "Unknown"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06012 = new CodeBean( 0,  6001, 1, "Terminal Not Used"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06013 = new CodeBean( 0,  6001, 2, "Mgnetic Stripe Read Capability", "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06014 = new CodeBean( 0,  6001, 3, "Bar Code Read Capability"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06015 = new CodeBean( 0,  6001, 4, "OCR Read Capability"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06016 = new CodeBean( 0,  6001, 5, "Chip Read Capability"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06017 = new CodeBean( 0,  6001, 6, "MICR Read Capability"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06018 = new CodeBean( 0,  6001, 7, "MICR Read and Image-capable"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06019 = new CodeBean( 0,  6001, 8, "Proximity Read Capability"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06020 = new CodeBean( 0,  6001, 9, "POS Key-Entry"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow06031 = new CodeBean( 0,  6003, 0, "Chip Capable Terminal Last Read Successful"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06032 = new CodeBean( 0,  6003, 1, "Chip Capable Terminal Last Read Unsuccessful"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06031);
		codeTableRowList.add(codeTableRow06032);
		
		// DE 060 SF 04 Chip Authentication Reliability Indicator
		
		CodeBean codeTableRow06041 = new CodeBean( 0,  6004, 0, "Acquirer Card Authentication reliable"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06042 = new CodeBean( 0,  6004, 1, "Acquirer Card Authentication not reliable"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06041);
		codeTableRowList.add(codeTableRow06042);		
		
		// DE 060 SF 05 MOTO Electronic Commerce Indicator
		
		CodeBean codeTableRow06051 = new CodeBean( 0,  6005, 0, "Unknown"															, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06052 = new CodeBean( 0,  6005, 1, "Telephone Order"													, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06053 = new CodeBean( 0,  6005, 2, "Recurring Transaction"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06054 = new CodeBean( 0,  6005, 3, "Installment Payment"												, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06055 = new CodeBean( 0,  6005, 4, "Mail Order"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06056 = new CodeBean( 0,  6005, 5, "Secure Electronic Commerce Transaction"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06057 = new CodeBean( 0,  6005, 6, "Non-authenticated transaction @ 3-D Secure-capable merchant"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06058 = new CodeBean( 0,  6005, 7, "Non-authenticated transaction @ non 3-D Secure-capable merchant"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06059 = new CodeBean( 0,  6005, 8, "Transaction that uses data encryption"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06060 = new CodeBean( 0,  6005, 9, "Transaction that has no data protection"							, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06061 = new CodeBean( 0,  6005, 8, "Subscription transaction"											, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06062 = new CodeBean( 0,  6005, 9, "Live agent"														, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
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
		
		CodeBean codeTableRow06063 = new CodeBean( 0,  6006, 0, "Unknown"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06064 = new CodeBean( 0,  6006, 1, "Signature"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06065 = new CodeBean( 0,  6006, 2, "PIN"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06066 = new CodeBean( 0,  6006, 3, "Unattended Terminal"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06067 = new CodeBean( 0,  6006, 4, "Mail/Phone Order"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06063);
		codeTableRowList.add(codeTableRow06064);
		codeTableRowList.add(codeTableRow06065);
		codeTableRowList.add(codeTableRow06066);
		codeTableRowList.add(codeTableRow06067);
		
		// DE 060 SF 07 Partial Authorization
		
		CodeBean codeTableRow06070 = new CodeBean( 0,  6007, 0, "Device Doesn't Support Partial Authorizations; Balances Not Desired"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06071 = new CodeBean( 0,  6007, 1, "Device Supports Partial Authorizations; Balances Desired"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06072 = new CodeBean( 0,  6007, 2, "Device Doesn't Support Partial Authorizations; Balances Desired"		, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06070);
		codeTableRowList.add(codeTableRow06071);
		codeTableRowList.add(codeTableRow06072);
		
		// DE 063 SF 01 Network ID Code 
		
		CodeBean codeTableRow06300 = new CodeBean( 0,  6301, 1001, "Bronze Network"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06301 = new CodeBean( 0,  6301, 1002, "Silver Network"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06302 = new CodeBean( 0,  6301, 1003, "Gold Network"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06300);
		codeTableRowList.add(codeTableRow06301);
		codeTableRowList.add(codeTableRow06302);
		
		// DE 063 SF 03 Message Reason Code  
		
		CodeBean codeTableRow06330 = new CodeBean( 0,  6303, 2501, "Transaction voided by customer"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06331 = new CodeBean( 0,  6303, 2502, "Transaction has not completed"			, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06332 = new CodeBean( 0,  6303, 2503, "No confirmation from point of service"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06333 = new CodeBean( 0,  6303, 2547, "Potential duplicate"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06334 = new CodeBean( 0,  6303, 2548, "Duplicate"								, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06335 = new CodeBean( 0,  6303, 5202, "Online submission"						, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06336 = new CodeBean( 0,  6303, 5204, "Online resubmission"					, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06330);
		codeTableRowList.add(codeTableRow06331);
		codeTableRowList.add(codeTableRow06332);
		codeTableRowList.add(codeTableRow06333);
		codeTableRowList.add(codeTableRow06334);
		codeTableRowList.add(codeTableRow06335);
		codeTableRowList.add(codeTableRow06336);
		
		// DE 063 SF 04 STIP Switch Reason Code  
		
		CodeBean codeTableRow06340 = new CodeBean( 0,  6304, 1, "Issuer Unavailable"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06341 = new CodeBean( 0,  6304, 2, "Timeout"				, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06342 = new CodeBean( 0,  6304, 3, "Corrupted Response"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06340);
		codeTableRowList.add(codeTableRow06341);
		codeTableRowList.add(codeTableRow06342);
		
		// DE 064 SF 00 Message Authentication Code  [ Binary 16 ]
		
		CodeBean codeTableRow06400 = new CodeBean( 0,  6400, 1, "MAC Result 01"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06401 = new CodeBean( 0,  6400, 2, "MAC Result 02"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		CodeBean codeTableRow06402 = new CodeBean( 0,  6400, 3, "MAC Result 03"	, "Description", CREATE_USER,CREATE_TIMESTAMP,MODIFY_USER,MODIFY_TIMESTAMP);
		
		codeTableRowList.add(codeTableRow06400);
		codeTableRowList.add(codeTableRow06401);
		codeTableRowList.add(codeTableRow06402);
		
		return codeTableRowList;
		
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
	/***********************************************************************************
	***********************************************************************************
	*/
	public String select (int codeName, int codeValue) {
		
		List<CodeBean> codeTableRowList = createCodes ();
		
		String description = null;
		boolean found = false;
		int i = 0;
		
		while (i < codeTableRowList.size() && !found) {
			
			System.out.println ( i + " codeName = " + codeName 
							       + " list = " + codeTableRowList.get(i).getCodeName() 
							       + " attribute = " + codeValue
//							       + " list = " + codeTableRowList.get(i).getCodeValue()
							   );
/*			
			if (codeTableRowList.get(i).getCodeName()  == codeName
			&&  codeTableRowList.get(i).getCodeValue() == codeValue )
			{
				description = codeTableRowList.get(i).getDescription();
				found = true;
			}
*/
			i++;
		}
		System.out.println(description);
		return description;
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
							, codeTableRowList.get(i).getCodeNumber()
							, codeTableRowList.get(i).getDescription()
							, codeTableRowList.get(i).getCreateUser()
							, codeTableRowList.get(i).getCreateTimestamp()
							, codeTableRowList.get(i).getModifyUser()
							, codeTableRowList.get(i).getModifyTimestamp()
							);
		}
	}
}

	
