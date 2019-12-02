package com.system.message.element.load;

import static com.system.message.element.DE036.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE036Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE036  {

	DataElementField startSentinelField 
	
		= new DataElementField ( START_SENTINEL_036_ID
					           , START_SENTINEL_036_FIELD
					           , START_SENTINEL_036_SUBFIELD
					           , START_SENTINEL_036_FORMAT
					           , START_SENTINEL_036_LENGTH
					           , START_SENTINEL_036_ENCODING
					           , START_SENTINEL_036_DATATYPE
					           , START_SENTINEL_036_SOURCE
					           , START_SENTINEL_036_DIRECTION
					           , START_SENTINEL_036_EXISTENCE
					           , START_SENTINEL_036_CHANGE
					           , START_SENTINEL_036_VALUE
					   	      );


	DataElementField formatCodeField 
	
		= new DataElementField ( FORMAT_CODE_036_ID
					           , FORMAT_CODE_036_FIELD
					           , FORMAT_CODE_036_SUBFIELD
					           , FORMAT_CODE_036_FORMAT
					           , FORMAT_CODE_036_LENGTH
					           , FORMAT_CODE_036_ENCODING
					           , FORMAT_CODE_036_DATATYPE
					           , FORMAT_CODE_036_SOURCE
					           , FORMAT_CODE_036_DIRECTION
					           , FORMAT_CODE_036_EXISTENCE
					           , FORMAT_CODE_036_CHANGE
					           , FORMAT_CODE_036_VALUE
					   	      );
	
	DataElementField binField 
	
		= new DataElementField ( BIN_036_ID
							   , BIN_036_FIELD
							   , BIN_036_SUBFIELD					 
							   , BIN_036_FORMAT						 
							   , BIN_036_LENGTH						 
							   , BIN_036_ENCODING					 
							   , BIN_036_DATATYPE					 
							   , BIN_036_SOURCE						 
							   , BIN_036_DIRECTION					 
							   , BIN_036_EXISTENCE					 
							   , BIN_036_CHANGE						 
							   , BIN_036_VALUE						 
							   );
	
	//--------------------------------------------------------------- 
	
	DataElementField panField 
	
		= new DataElementField ( PAN_036_ID
						       , PAN_036_FIELD						 	
							   , PAN_036_SUBFIELD					 
							   , PAN_036_FORMAT						 
							   , PAN_036_LENGTH						 
							   , PAN_036_ENCODING					 
							   , PAN_036_DATATYPE					 
							   , PAN_036_SOURCE						 
							   , PAN_036_DIRECTION					 
							   , PAN_036_EXISTENCE					 
							   , PAN_036_CHANGE						 
							   , PAN_036_VALUE						 
							   );
	
	//---------------------------------------------------------------
	
	DataElementField checkDigitField 
	
		= new DataElementField ( CHECK_DIGIT_036_ID
						       , CHECK_DIGIT_036_FIELD				 	
						       , CHECK_DIGIT_036_SUBFIELD			 
						       , CHECK_DIGIT_036_FORMAT				 
						       , CHECK_DIGIT_036_LENGTH				 
						       , CHECK_DIGIT_036_ENCODING			 
						       , CHECK_DIGIT_036_DATATYPE			 
						       , CHECK_DIGIT_036_SOURCE				 
						       , CHECK_DIGIT_036_DIRECTION			 
						       , CHECK_DIGIT_036_EXISTENCE			 
						       , CHECK_DIGIT_036_CHANGE				 
						       , CHECK_DIGIT_036_VALUE				 
						       );
	
	//--------------------------------------------------------------------------------------

	DataElementField fieldSeparator1Field 
	
		= new DataElementField ( FIELD_SEPARATOR_01_036_ID
					           , FIELD_SEPARATOR_01_036_FIELD
					           , FIELD_SEPARATOR_01_036_SUBFIELD
					           , FIELD_SEPARATOR_01_036_FORMAT
					           , FIELD_SEPARATOR_01_036_LENGTH
					           , FIELD_SEPARATOR_01_036_ENCODING
					           , FIELD_SEPARATOR_01_036_DATATYPE
					           , FIELD_SEPARATOR_01_036_SOURCE
					           , FIELD_SEPARATOR_01_036_DIRECTION
					           , FIELD_SEPARATOR_01_036_EXISTENCE
					           , FIELD_SEPARATOR_01_036_CHANGE
					           , FIELD_SEPARATOR_01_036_VALUE
					   	      );
	

	DataElementField countryCodeField 
	
		= new DataElementField ( COUNTRY_CODE_036_ID
					           , COUNTRY_CODE_036_FIELD
					           , COUNTRY_CODE_036_SUBFIELD
					           , COUNTRY_CODE_036_FORMAT
					           , COUNTRY_CODE_036_LENGTH
					           , COUNTRY_CODE_036_ENCODING
					           , COUNTRY_CODE_036_DATATYPE
					           , COUNTRY_CODE_036_SOURCE
					           , COUNTRY_CODE_036_DIRECTION
					           , COUNTRY_CODE_036_EXISTENCE
					           , COUNTRY_CODE_036_CHANGE
					           , COUNTRY_CODE_036_VALUE
					   	      );
	

	DataElementField currencyCodeField 
	
		= new DataElementField ( CURRENCY_CODE_036_ID
					           , CURRENCY_CODE_036_FIELD
					           , CURRENCY_CODE_036_SUBFIELD
					           , CURRENCY_CODE_036_FORMAT
					           , CURRENCY_CODE_036_LENGTH
					           , CURRENCY_CODE_036_ENCODING
					           , CURRENCY_CODE_036_DATATYPE
					           , CURRENCY_CODE_036_SOURCE
					           , CURRENCY_CODE_036_DIRECTION
					           , CURRENCY_CODE_036_EXISTENCE
					           , CURRENCY_CODE_036_CHANGE
					           , CURRENCY_CODE_036_VALUE
					   	      );
	

	DataElementField currencyExponentField 
	
		= new DataElementField ( CURRENCY_EXPONENT_036_ID
					           , CURRENCY_EXPONENT_036_FIELD
					           , CURRENCY_EXPONENT_036_SUBFIELD
					           , CURRENCY_EXPONENT_036_FORMAT
					           , CURRENCY_EXPONENT_036_LENGTH
					           , CURRENCY_EXPONENT_036_ENCODING
					           , CURRENCY_EXPONENT_036_DATATYPE
					           , CURRENCY_EXPONENT_036_SOURCE
					           , CURRENCY_EXPONENT_036_DIRECTION
					           , CURRENCY_EXPONENT_036_EXISTENCE
					           , CURRENCY_EXPONENT_036_CHANGE
					           , CURRENCY_EXPONENT_036_VALUE
					   	      );
	

	DataElementField amountAuthorizedPerCycleField 
	
		= new DataElementField ( AMOUNT_AUTHORIZED_PER_CYCLE_036_ID
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_FIELD
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_SUBFIELD
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_FORMAT
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_LENGTH
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_ENCODING
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_DATATYPE
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_SOURCE
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_DIRECTION
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_EXISTENCE
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_CHANGE
					           , AMOUNT_AUTHORIZED_PER_CYCLE_036_VALUE
					   	      );
	

	DataElementField amountRemainingThisCycleField 
	
		= new DataElementField ( AMOUNT_REMAINING_THIS_CYCLE_036_ID
					           , AMOUNT_REMAINING_THIS_CYCLE_036_FIELD
					           , AMOUNT_REMAINING_THIS_CYCLE_036_SUBFIELD
					           , AMOUNT_REMAINING_THIS_CYCLE_036_FORMAT
					           , AMOUNT_REMAINING_THIS_CYCLE_036_LENGTH
					           , AMOUNT_REMAINING_THIS_CYCLE_036_ENCODING
					           , AMOUNT_REMAINING_THIS_CYCLE_036_DATATYPE
					           , AMOUNT_REMAINING_THIS_CYCLE_036_SOURCE
					           , AMOUNT_REMAINING_THIS_CYCLE_036_DIRECTION
					           , AMOUNT_REMAINING_THIS_CYCLE_036_EXISTENCE
					           , AMOUNT_REMAINING_THIS_CYCLE_036_CHANGE
					           , AMOUNT_REMAINING_THIS_CYCLE_036_VALUE
					   	      );
	

	DataElementField cycleBeginField 
	
		= new DataElementField ( CYCLE_BEGIN_036_ID
					           , CYCLE_BEGIN_036_FIELD
					           , CYCLE_BEGIN_036_SUBFIELD
					           , CYCLE_BEGIN_036_FORMAT
					           , CYCLE_BEGIN_036_LENGTH
					           , CYCLE_BEGIN_036_ENCODING
					           , CYCLE_BEGIN_036_DATATYPE
					           , CYCLE_BEGIN_036_SOURCE
					           , CYCLE_BEGIN_036_DIRECTION
					           , CYCLE_BEGIN_036_EXISTENCE
					           , CYCLE_BEGIN_036_CHANGE
					           , CYCLE_BEGIN_036_VALUE
					   	      );
	

	DataElementField cycleLengthField 
	
		= new DataElementField ( CYCLE_LENGTH_036_ID
					           , CYCLE_LENGTH_036_FIELD
					           , CYCLE_LENGTH_036_SUBFIELD
					           , CYCLE_LENGTH_036_FORMAT
					           , CYCLE_LENGTH_036_LENGTH
					           , CYCLE_LENGTH_036_ENCODING
					           , CYCLE_LENGTH_036_DATATYPE
					           , CYCLE_LENGTH_036_SOURCE
					           , CYCLE_LENGTH_036_DIRECTION
					           , CYCLE_LENGTH_036_EXISTENCE
					           , CYCLE_LENGTH_036_CHANGE
					           , CYCLE_LENGTH_036_VALUE
					   	      );
	

	DataElementField retryCountField 
	
		= new DataElementField ( RETRY_COUNT_036_ID
					           , RETRY_COUNT_036_FIELD
					           , RETRY_COUNT_036_SUBFIELD
					           , RETRY_COUNT_036_FORMAT
					           , RETRY_COUNT_036_LENGTH
					           , RETRY_COUNT_036_ENCODING
					           , RETRY_COUNT_036_DATATYPE
					           , RETRY_COUNT_036_SOURCE
					           , RETRY_COUNT_036_DIRECTION
					           , RETRY_COUNT_036_EXISTENCE
					           , RETRY_COUNT_036_CHANGE
					           , RETRY_COUNT_036_VALUE
					   	      );
	

	DataElementField pinControlParametersField 
	
		= new DataElementField ( PIN_CONTROL_PARAMETERS_036_ID
					           , PIN_CONTROL_PARAMETERS_036_FIELD
					           , PIN_CONTROL_PARAMETERS_036_SUBFIELD
					           , PIN_CONTROL_PARAMETERS_036_FORMAT
					           , PIN_CONTROL_PARAMETERS_036_LENGTH
					           , PIN_CONTROL_PARAMETERS_036_ENCODING
					           , PIN_CONTROL_PARAMETERS_036_DATATYPE
					           , PIN_CONTROL_PARAMETERS_036_SOURCE
					           , PIN_CONTROL_PARAMETERS_036_DIRECTION
					           , PIN_CONTROL_PARAMETERS_036_EXISTENCE
					           , PIN_CONTROL_PARAMETERS_036_CHANGE
					           , PIN_CONTROL_PARAMETERS_036_VALUE
					   	      );
	

	DataElementField interchangeControlsField 
	
		= new DataElementField ( INTERCHANGE_CONTROLS_036_ID
					           , INTERCHANGE_CONTROLS_036_FIELD
					           , INTERCHANGE_CONTROLS_036_SUBFIELD
					           , INTERCHANGE_CONTROLS_036_FORMAT
					           , INTERCHANGE_CONTROLS_036_LENGTH
					           , INTERCHANGE_CONTROLS_036_ENCODING
					           , INTERCHANGE_CONTROLS_036_DATATYPE
					           , INTERCHANGE_CONTROLS_036_SOURCE
					           , INTERCHANGE_CONTROLS_036_DIRECTION
					           , INTERCHANGE_CONTROLS_036_EXISTENCE
					           , INTERCHANGE_CONTROLS_036_CHANGE
					           , INTERCHANGE_CONTROLS_036_VALUE
					   	      );
	

	DataElementField panServiceRestrictionField 
	
		= new DataElementField ( PAN_SERVICE_RESTRICTION_036_ID
					           , PAN_SERVICE_RESTRICTION_036_FIELD
					           , PAN_SERVICE_RESTRICTION_036_SUBFIELD
					           , PAN_SERVICE_RESTRICTION_036_FORMAT
					           , PAN_SERVICE_RESTRICTION_036_LENGTH
					           , PAN_SERVICE_RESTRICTION_036_ENCODING
					           , PAN_SERVICE_RESTRICTION_036_DATATYPE
					           , PAN_SERVICE_RESTRICTION_036_SOURCE
					           , PAN_SERVICE_RESTRICTION_036_DIRECTION
					           , PAN_SERVICE_RESTRICTION_036_EXISTENCE
					           , PAN_SERVICE_RESTRICTION_036_CHANGE
					           , PAN_SERVICE_RESTRICTION_036_VALUE
					   	      );
	

	DataElementField san1ServiceRestrictionField 
	
		= new DataElementField ( SAN_1_SERVICE_RESTRICTION_036_ID
					           , SAN_1_SERVICE_RESTRICTION_036_FIELD
					           , SAN_1_SERVICE_RESTRICTION_036_SUBFIELD
					           , SAN_1_SERVICE_RESTRICTION_036_FORMAT
					           , SAN_1_SERVICE_RESTRICTION_036_LENGTH
					           , SAN_1_SERVICE_RESTRICTION_036_ENCODING
					           , SAN_1_SERVICE_RESTRICTION_036_DATATYPE
					           , SAN_1_SERVICE_RESTRICTION_036_SOURCE
					           , SAN_1_SERVICE_RESTRICTION_036_DIRECTION
					           , SAN_1_SERVICE_RESTRICTION_036_EXISTENCE
					           , SAN_1_SERVICE_RESTRICTION_036_CHANGE
					           , SAN_1_SERVICE_RESTRICTION_036_VALUE
					   	      );
	

	DataElementField san2ServiceRestrictionField 
	
		= new DataElementField (  SAN_2_SERVICE_RESTRICTION_036_ID
					           ,  SAN_2_SERVICE_RESTRICTION_036_FIELD
					           ,  SAN_2_SERVICE_RESTRICTION_036_SUBFIELD
					           ,  SAN_2_SERVICE_RESTRICTION_036_FORMAT
					           ,  SAN_2_SERVICE_RESTRICTION_036_LENGTH
					           ,  SAN_2_SERVICE_RESTRICTION_036_ENCODING
					           ,  SAN_2_SERVICE_RESTRICTION_036_DATATYPE
					           ,  SAN_2_SERVICE_RESTRICTION_036_SOURCE
					           ,  SAN_2_SERVICE_RESTRICTION_036_DIRECTION
					           ,  SAN_2_SERVICE_RESTRICTION_036_EXISTENCE
					           ,  SAN_2_SERVICE_RESTRICTION_036_CHANGE
					           ,  SAN_2_SERVICE_RESTRICTION_036_VALUE
					   	      );
	

	DataElementField expirationDateYearField 
	
		= new DataElementField ( EXPIRATION_DATE_YEAR_036_ID
					           , EXPIRATION_DATE_YEAR_036_FIELD
					           , EXPIRATION_DATE_YEAR_036_SUBFIELD
					           , EXPIRATION_DATE_YEAR_036_FORMAT
					           , EXPIRATION_DATE_YEAR_036_LENGTH
					           , EXPIRATION_DATE_YEAR_036_ENCODING
					           , EXPIRATION_DATE_YEAR_036_DATATYPE
					           , EXPIRATION_DATE_YEAR_036_SOURCE
					           , EXPIRATION_DATE_YEAR_036_DIRECTION
					           , EXPIRATION_DATE_YEAR_036_EXISTENCE
					           , EXPIRATION_DATE_YEAR_036_CHANGE
					           , EXPIRATION_DATE_YEAR_036_VALUE
					   	      );
	

	DataElementField expirationDateMonthField 
	
		= new DataElementField ( EXPIRATION_DATE_MONTH_036_ID
					           , EXPIRATION_DATE_MONTH_036_FIELD
					           , EXPIRATION_DATE_MONTH_036_SUBFIELD
					           , EXPIRATION_DATE_MONTH_036_FORMAT
					           , EXPIRATION_DATE_MONTH_036_LENGTH
					           , EXPIRATION_DATE_MONTH_036_ENCODING
					           , EXPIRATION_DATE_MONTH_036_DATATYPE
					           , EXPIRATION_DATE_MONTH_036_SOURCE
					           , EXPIRATION_DATE_MONTH_036_DIRECTION
					           , EXPIRATION_DATE_MONTH_036_EXISTENCE
					           , EXPIRATION_DATE_MONTH_036_CHANGE
					           , EXPIRATION_DATE_MONTH_036_VALUE
					   	      );
	

	DataElementField cardSequenceNumberField 
	
		= new DataElementField ( CARD_SEQUENCE_NUMBER_036_ID
					           , CARD_SEQUENCE_NUMBER_036_FIELD
					           , CARD_SEQUENCE_NUMBER_036_SUBFIELD
					           , CARD_SEQUENCE_NUMBER_036_FORMAT
					           , CARD_SEQUENCE_NUMBER_036_LENGTH
					           , CARD_SEQUENCE_NUMBER_036_ENCODING
					           , CARD_SEQUENCE_NUMBER_036_DATATYPE
					           , CARD_SEQUENCE_NUMBER_036_SOURCE
					           , CARD_SEQUENCE_NUMBER_036_DIRECTION
					           , CARD_SEQUENCE_NUMBER_036_EXISTENCE
					           , CARD_SEQUENCE_NUMBER_036_CHANGE
					           , CARD_SEQUENCE_NUMBER_036_VALUE
					   	      );
	

	DataElementField cardSecurityNumberField 
	
		= new DataElementField ( CARD_SECURITY_NUMBER_036_ID
					           , CARD_SECURITY_NUMBER_036_FIELD
					           , CARD_SECURITY_NUMBER_036_SUBFIELD
					           , CARD_SECURITY_NUMBER_036_FORMAT
					           , CARD_SECURITY_NUMBER_036_LENGTH
					           , CARD_SECURITY_NUMBER_036_ENCODING
					           , CARD_SECURITY_NUMBER_036_DATATYPE
					           , CARD_SECURITY_NUMBER_036_SOURCE
					           , CARD_SECURITY_NUMBER_036_DIRECTION
					           , CARD_SECURITY_NUMBER_036_EXISTENCE
					           , CARD_SECURITY_NUMBER_036_CHANGE
					           , CARD_SECURITY_NUMBER_036_VALUE
					   	      );
	

	DataElementField firstSubsidiaryAcctNbrField 
	
		= new DataElementField ( FIRST_SUBSIDIARY_ACCT_NBR_036_ID
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_FIELD
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_SUBFIELD
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_FORMAT
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_LENGTH
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_ENCODING
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_DATATYPE
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_SOURCE
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_DIRECTION
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_EXISTENCE
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_CHANGE
					           , FIRST_SUBSIDIARY_ACCT_NBR_036_VALUE
					   	      );
	

	DataElementField secondarySubsidiaryAcctNbrField 
	
		= new DataElementField ( SECONDARY_SUBSIDIARY_ACCT_NBR_036_ID
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_FIELD
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_SUBFIELD
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_FORMAT
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_LENGTH
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_ENCODING
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_DATATYPE
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_SOURCE
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_DIRECTION
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_EXISTENCE
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_CHANGE
					           , SECONDARY_SUBSIDIARY_ACCT_NBR_036_VALUE
					   	      );
	

	DataElementField relayMarkerField 
	
		= new DataElementField ( RELAY_MARKER_036_ID
					           , RELAY_MARKER_036_FIELD
					           , RELAY_MARKER_036_SUBFIELD
					           , RELAY_MARKER_036_FORMAT
					           , RELAY_MARKER_036_LENGTH
					           , RELAY_MARKER_036_ENCODING
					           , RELAY_MARKER_036_DATATYPE
					           , RELAY_MARKER_036_SOURCE
					           , RELAY_MARKER_036_DIRECTION
					           , RELAY_MARKER_036_EXISTENCE
					           , RELAY_MARKER_036_CHANGE
					           , RELAY_MARKER_036_VALUE
					   	      );
	

	DataElementField cryptographicCheckDigitsField 
	
		= new DataElementField ( CRYPTOGRAPHIC_CHECK_DIGITS_036_ID
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_FIELD
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_SUBFIELD
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_FORMAT
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_LENGTH
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_ENCODING
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_DATATYPE
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_SOURCE
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_DIRECTION
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_EXISTENCE
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_CHANGE
					           , CRYPTOGRAPHIC_CHECK_DIGITS_036_VALUE
					   	      );
	

	DataElementField pinValueKeyIndicatorField 
	
		= new DataElementField ( PIN_VALUE_KEY_INDICATOR_036_ID
					           , PIN_VALUE_KEY_INDICATOR_036_FIELD
					           , PIN_VALUE_KEY_INDICATOR_036_SUBFIELD
					           , PIN_VALUE_KEY_INDICATOR_036_FORMAT
					           , PIN_VALUE_KEY_INDICATOR_036_LENGTH
					           , PIN_VALUE_KEY_INDICATOR_036_ENCODING
					           , PIN_VALUE_KEY_INDICATOR_036_DATATYPE
					           , PIN_VALUE_KEY_INDICATOR_036_SOURCE
					           , PIN_VALUE_KEY_INDICATOR_036_DIRECTION
					           , PIN_VALUE_KEY_INDICATOR_036_EXISTENCE
					           , PIN_VALUE_KEY_INDICATOR_036_CHANGE
					           , PIN_VALUE_KEY_INDICATOR_036_VALUE
					   	      );
	

	DataElementField pinVerificationValueField 
	
		= new DataElementField ( PIN_VERIFICATION_VALUE_036_ID
					           , PIN_VERIFICATION_VALUE_036_FIELD
					           , PIN_VERIFICATION_VALUE_036_SUBFIELD
					           , PIN_VERIFICATION_VALUE_036_FORMAT
					           , PIN_VERIFICATION_VALUE_036_LENGTH
					           , PIN_VERIFICATION_VALUE_036_ENCODING
					           , PIN_VERIFICATION_VALUE_036_DATATYPE
					           , PIN_VERIFICATION_VALUE_036_SOURCE
					           , PIN_VERIFICATION_VALUE_036_DIRECTION
					           , PIN_VERIFICATION_VALUE_036_EXISTENCE
					           , PIN_VERIFICATION_VALUE_036_CHANGE
					           , PIN_VERIFICATION_VALUE_036_VALUE
					   	      );
	

	DataElementField cardVerificationValueField 
	
		= new DataElementField ( CARD_VERIFICATION_VALUE_036_ID
					           , CARD_VERIFICATION_VALUE_036_FIELD
					           , CARD_VERIFICATION_VALUE_036_SUBFIELD
					           , CARD_VERIFICATION_VALUE_036_FORMAT
					           , CARD_VERIFICATION_VALUE_036_LENGTH
					           , CARD_VERIFICATION_VALUE_036_ENCODING
					           , CARD_VERIFICATION_VALUE_036_DATATYPE
					           , CARD_VERIFICATION_VALUE_036_SOURCE
					           , CARD_VERIFICATION_VALUE_036_DIRECTION
					           , CARD_VERIFICATION_VALUE_036_EXISTENCE
					           , CARD_VERIFICATION_VALUE_036_CHANGE
					           , CARD_VERIFICATION_VALUE_036_VALUE
					   	      );
	

	DataElementField endSentinelField 
	
		= new DataElementField ( END_SENTINEL_036_ID
					           , END_SENTINEL_036_FIELD
					           , END_SENTINEL_036_SUBFIELD
					           , END_SENTINEL_036_FORMAT
					           , END_SENTINEL_036_LENGTH
					           , END_SENTINEL_036_ENCODING
					           , END_SENTINEL_036_DATATYPE
					           , END_SENTINEL_036_SOURCE
					           , END_SENTINEL_036_DIRECTION
					           , END_SENTINEL_036_EXISTENCE
					           , END_SENTINEL_036_CHANGE
					           , END_SENTINEL_036_VALUE
					   	      );
	

	DataElementField longRedundancyCheckCharField 
	
		= new DataElementField ( LONG_REDUNDANCY_CHECK_CHAR_036_ID
					           , LONG_REDUNDANCY_CHECK_CHAR_036_FIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_036_SUBFIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_036_FORMAT
					           , LONG_REDUNDANCY_CHECK_CHAR_036_LENGTH
					           , LONG_REDUNDANCY_CHECK_CHAR_036_ENCODING
					           , LONG_REDUNDANCY_CHECK_CHAR_036_DATATYPE
					           , LONG_REDUNDANCY_CHECK_CHAR_036_SOURCE
					           , LONG_REDUNDANCY_CHECK_CHAR_036_DIRECTION
					           , LONG_REDUNDANCY_CHECK_CHAR_036_EXISTENCE
					           , LONG_REDUNDANCY_CHECK_CHAR_036_CHANGE
					           , LONG_REDUNDANCY_CHECK_CHAR_036_VALUE
					   	      );
	
	public DE036Impl createDE036() {
		
		int id = 36000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(startSentinelField);
		storage.add(formatCodeField);
		storage.add(binField);
		storage.add(panField);
		storage.add(checkDigitField);
		storage.add(fieldSeparator1Field);
		storage.add(countryCodeField);
		storage.add(currencyCodeField);
		storage.add(currencyExponentField);
		storage.add(amountAuthorizedPerCycleField);
		storage.add(amountRemainingThisCycleField);
		storage.add(cycleBeginField);
		storage.add(cycleLengthField);
		storage.add(retryCountField);
		storage.add(pinControlParametersField);
		storage.add(interchangeControlsField);
		storage.add(panServiceRestrictionField);
		storage.add(san1ServiceRestrictionField);
		storage.add(san2ServiceRestrictionField);
		storage.add(expirationDateYearField);
		storage.add(expirationDateMonthField);
		storage.add(cardSequenceNumberField);
		storage.add(cardSecurityNumberField);
		storage.add(firstSubsidiaryAcctNbrField);
		storage.add(secondarySubsidiaryAcctNbrField);
		storage.add(relayMarkerField);
		storage.add(cryptographicCheckDigitsField);
		storage.add(pinValueKeyIndicatorField);
		storage.add(pinVerificationValueField);
		storage.add(cardVerificationValueField);
		storage.add(endSentinelField);
		storage.add(longRedundancyCheckCharField);
		
		DE036Impl de036 = new DE036Impl(id, storage);
		
		return de036;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE036 createDE036 = new CreateDE036(); 
		
		DE036Impl de036	= createDE036.createDE036(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de036, fieldList,codeList );
	
	}
}
