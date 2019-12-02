package com.system.message.element.load;

import static com.system.message.element.DE035.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE035Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE035  {

	DataElementField startSentinelField 
	
		= new DataElementField ( START_SENTINEL_035_ID
					           , START_SENTINEL_035_FIELD
					           , START_SENTINEL_035_SUBFIELD
					           , START_SENTINEL_035_FORMAT
					           , START_SENTINEL_035_LENGTH
					           , START_SENTINEL_035_ENCODING
					           , START_SENTINEL_035_DATATYPE
					           , START_SENTINEL_035_SOURCE
					           , START_SENTINEL_035_DIRECTION
					           , START_SENTINEL_035_EXISTENCE
					           , START_SENTINEL_035_CHANGE
					           , START_SENTINEL_035_VALUE
					   	      );

	//--------------------------------------------------------------- 
	
	DataElementField binField 
	
		= new DataElementField ( BIN_035_ID
							   , BIN_035_FIELD
							   , BIN_035_SUBFIELD					 
							   , BIN_035_FORMAT						 
							   , BIN_035_LENGTH						 
							   , BIN_035_ENCODING					 
							   , BIN_035_DATATYPE					 
							   , BIN_035_SOURCE						 
							   , BIN_035_DIRECTION					 
							   , BIN_035_EXISTENCE					 
							   , BIN_035_CHANGE						 
							   , BIN_035_VALUE						 
							   );
	
	//--------------------------------------------------------------- 
	
	DataElementField panField 
	
		= new DataElementField ( PAN_035_ID
						       , PAN_035_FIELD						 	
							   , PAN_035_SUBFIELD					 
							   , PAN_035_FORMAT						 
							   , PAN_035_LENGTH						 
							   , PAN_035_ENCODING					 
							   , PAN_035_DATATYPE					 
							   , PAN_035_SOURCE						 
							   , PAN_035_DIRECTION					 
							   , PAN_035_EXISTENCE					 
							   , PAN_035_CHANGE						 
							   , PAN_035_VALUE						 
							   );
	
	//---------------------------------------------------------------
	
	DataElementField checkDigitField 
	
		= new DataElementField ( CHECK_DIGIT_035_ID
						       , CHECK_DIGIT_035_FIELD				 	
						       , CHECK_DIGIT_035_SUBFIELD			 
						       , CHECK_DIGIT_035_FORMAT				 
						       , CHECK_DIGIT_035_LENGTH				 
						       , CHECK_DIGIT_035_ENCODING			 
						       , CHECK_DIGIT_035_DATATYPE			 
						       , CHECK_DIGIT_035_SOURCE				 
						       , CHECK_DIGIT_035_DIRECTION			 
						       , CHECK_DIGIT_035_EXISTENCE			 
						       , CHECK_DIGIT_035_CHANGE				 
						       , CHECK_DIGIT_035_VALUE				 
						       );
	
	//--------------------------------------------------------------------------------------
	
	DataElementField fieldSeparator1Field 
	
		= new DataElementField ( FIELD_SEPARATOR_01_035_ID
					           , FIELD_SEPARATOR_01_035_FIELD
					           , FIELD_SEPARATOR_01_035_SUBFIELD
					           , FIELD_SEPARATOR_01_035_FORMAT
					           , FIELD_SEPARATOR_01_035_LENGTH
					           , FIELD_SEPARATOR_01_035_ENCODING
					           , FIELD_SEPARATOR_01_035_DATATYPE
					           , FIELD_SEPARATOR_01_035_SOURCE
					           , FIELD_SEPARATOR_01_035_DIRECTION
					           , FIELD_SEPARATOR_01_035_EXISTENCE
					           , FIELD_SEPARATOR_01_035_CHANGE
					           , FIELD_SEPARATOR_01_035_VALUE
					   	      );
	

	DataElementField expirationDateYearField 
	
		= new DataElementField ( EXPIRATION_DATE_YEAR_035_ID
					           , EXPIRATION_DATE_YEAR_035_FIELD
					           , EXPIRATION_DATE_YEAR_035_SUBFIELD
					           , EXPIRATION_DATE_YEAR_035_FORMAT
					           , EXPIRATION_DATE_YEAR_035_LENGTH
					           , EXPIRATION_DATE_YEAR_035_ENCODING
					           , EXPIRATION_DATE_YEAR_035_DATATYPE
					           , EXPIRATION_DATE_YEAR_035_SOURCE
					           , EXPIRATION_DATE_YEAR_035_DIRECTION
					           , EXPIRATION_DATE_YEAR_035_EXISTENCE
					           , EXPIRATION_DATE_YEAR_035_CHANGE
					           , EXPIRATION_DATE_YEAR_035_VALUE
					   	      );
	

	DataElementField expirationDateMonthField 
	
		= new DataElementField ( EXPIRATION_DATE_MONTH_035_ID
					           , EXPIRATION_DATE_MONTH_035_FIELD
					           , EXPIRATION_DATE_MONTH_035_SUBFIELD
					           , EXPIRATION_DATE_MONTH_035_FORMAT
					           , EXPIRATION_DATE_MONTH_035_LENGTH
					           , EXPIRATION_DATE_MONTH_035_ENCODING
					           , EXPIRATION_DATE_MONTH_035_DATATYPE
					           , EXPIRATION_DATE_MONTH_035_SOURCE
					           , EXPIRATION_DATE_MONTH_035_DIRECTION
					           , EXPIRATION_DATE_MONTH_035_EXISTENCE
					           , EXPIRATION_DATE_MONTH_035_CHANGE
					           , EXPIRATION_DATE_MONTH_035_VALUE
					   	      );
	

	DataElementField serviceCodeField 
	
		= new DataElementField ( SERVICE_CODE_035_ID
					           , SERVICE_CODE_035_FIELD
					           , SERVICE_CODE_035_SUBFIELD
					           , SERVICE_CODE_035_FORMAT
					           , SERVICE_CODE_035_LENGTH
					           , SERVICE_CODE_035_ENCODING
					           , SERVICE_CODE_035_DATATYPE
					           , SERVICE_CODE_035_SOURCE
					           , SERVICE_CODE_035_DIRECTION
					           , SERVICE_CODE_035_EXISTENCE
					           , SERVICE_CODE_035_CHANGE
					           , SERVICE_CODE_035_VALUE
					   	      );
	

	DataElementField pinValueKeyIndicatorField 
	
		= new DataElementField ( PIN_VALUE_KEY_INDICATOR_035_ID
					           , PIN_VALUE_KEY_INDICATOR_035_FIELD
					           , PIN_VALUE_KEY_INDICATOR_035_SUBFIELD
					           , PIN_VALUE_KEY_INDICATOR_035_FORMAT
					           , PIN_VALUE_KEY_INDICATOR_035_LENGTH
					           , PIN_VALUE_KEY_INDICATOR_035_ENCODING
					           , PIN_VALUE_KEY_INDICATOR_035_DATATYPE
					           , PIN_VALUE_KEY_INDICATOR_035_SOURCE
					           , PIN_VALUE_KEY_INDICATOR_035_DIRECTION
					           , PIN_VALUE_KEY_INDICATOR_035_EXISTENCE
					           , PIN_VALUE_KEY_INDICATOR_035_CHANGE
					           , PIN_VALUE_KEY_INDICATOR_035_VALUE
					   	      );
	

	DataElementField pinVerificationValueField 
	
		= new DataElementField ( PIN_VERIFICATION_VALUE_035_ID
					           , PIN_VERIFICATION_VALUE_035_FIELD
					           , PIN_VERIFICATION_VALUE_035_SUBFIELD
					           , PIN_VERIFICATION_VALUE_035_FORMAT
					           , PIN_VERIFICATION_VALUE_035_LENGTH
					           , PIN_VERIFICATION_VALUE_035_ENCODING
					           , PIN_VERIFICATION_VALUE_035_DATATYPE
					           , PIN_VERIFICATION_VALUE_035_SOURCE
					           , PIN_VERIFICATION_VALUE_035_DIRECTION
					           , PIN_VERIFICATION_VALUE_035_EXISTENCE
					           , PIN_VERIFICATION_VALUE_035_CHANGE
					           , PIN_VERIFICATION_VALUE_035_VALUE
					   	      );
	

	DataElementField cardVerificationValueField 
	
		= new DataElementField ( CARD_VERIFICATION_VALUE_035_ID
					           , CARD_VERIFICATION_VALUE_035_FIELD
					           , CARD_VERIFICATION_VALUE_035_SUBFIELD
					           , CARD_VERIFICATION_VALUE_035_FORMAT
					           , CARD_VERIFICATION_VALUE_035_LENGTH
					           , CARD_VERIFICATION_VALUE_035_ENCODING
					           , CARD_VERIFICATION_VALUE_035_DATATYPE
					           , CARD_VERIFICATION_VALUE_035_SOURCE
					           , CARD_VERIFICATION_VALUE_035_DIRECTION
					           , CARD_VERIFICATION_VALUE_035_EXISTENCE
					           , CARD_VERIFICATION_VALUE_035_CHANGE
					           , CARD_VERIFICATION_VALUE_035_VALUE
					   	      );
	

	DataElementField endSentinelField 
	
		= new DataElementField ( END_SENTINEL_035_ID
					           , END_SENTINEL_035_FIELD
					           , END_SENTINEL_035_SUBFIELD
					           , END_SENTINEL_035_FORMAT
					           , END_SENTINEL_035_LENGTH
					           , END_SENTINEL_035_ENCODING
					           , END_SENTINEL_035_DATATYPE
					           , END_SENTINEL_035_SOURCE
					           , END_SENTINEL_035_DIRECTION
					           , END_SENTINEL_035_EXISTENCE
					           , END_SENTINEL_035_CHANGE
					           , END_SENTINEL_035_VALUE
					   	      );
	

	DataElementField longRedundancyCheckCharField 
	
		= new DataElementField ( LONG_REDUNDANCY_CHECK_CHAR_035_ID
					           , LONG_REDUNDANCY_CHECK_CHAR_035_FIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_035_SUBFIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_035_FORMAT
					           , LONG_REDUNDANCY_CHECK_CHAR_035_LENGTH
					           , LONG_REDUNDANCY_CHECK_CHAR_035_ENCODING
					           , LONG_REDUNDANCY_CHECK_CHAR_035_DATATYPE
					           , LONG_REDUNDANCY_CHECK_CHAR_035_SOURCE
					           , LONG_REDUNDANCY_CHECK_CHAR_035_DIRECTION
					           , LONG_REDUNDANCY_CHECK_CHAR_035_EXISTENCE
					           , LONG_REDUNDANCY_CHECK_CHAR_035_CHANGE
					           , LONG_REDUNDANCY_CHECK_CHAR_035_VALUE
					   	      );
	
	public DE035Impl createDE035() {
		
		int id = 35000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		
		storage.add(startSentinelField);
		storage.add(binField);
		storage.add(panField);
		storage.add(checkDigitField);
		storage.add(fieldSeparator1Field);
		storage.add(expirationDateYearField);
		storage.add(expirationDateMonthField);
		storage.add(serviceCodeField);
		storage.add(pinValueKeyIndicatorField);
		storage.add(pinVerificationValueField);
		storage.add(cardVerificationValueField);
		storage.add(endSentinelField);
		storage.add(longRedundancyCheckCharField);
		
		DE035Impl de035 = new DE035Impl(id, storage);
		
		return de035;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE035 createDE035 = new CreateDE035(); 
		
		DE035Impl de035	= createDE035.createDE035(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de035, fieldList,codeList );
	
	}
}
