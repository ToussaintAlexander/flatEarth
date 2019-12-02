package com.system.message.element.load;

import static com.system.message.element.DE045.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE045Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE045  {

	DataElementField startSentinelField 
	
		= new DataElementField ( START_SENTINEL_045_ID
					           , START_SENTINEL_045_FIELD
					           , START_SENTINEL_045_SUBFIELD
					           , START_SENTINEL_045_FORMAT
					           , START_SENTINEL_045_LENGTH
					           , START_SENTINEL_045_ENCODING
					           , START_SENTINEL_045_DATATYPE
					           , START_SENTINEL_045_SOURCE
					           , START_SENTINEL_045_DIRECTION
					           , START_SENTINEL_045_EXISTENCE
					           , START_SENTINEL_045_CHANGE
					           , START_SENTINEL_045_VALUE
					   	      );


	DataElementField formatCodeField 
	
		= new DataElementField ( FORMAT_CODE_045_ID
					           , FORMAT_CODE_045_FIELD
					           , FORMAT_CODE_045_SUBFIELD
					           , FORMAT_CODE_045_FORMAT
					           , FORMAT_CODE_045_LENGTH
					           , FORMAT_CODE_045_ENCODING
					           , FORMAT_CODE_045_DATATYPE
					           , FORMAT_CODE_045_SOURCE
					           , FORMAT_CODE_045_DIRECTION
					           , FORMAT_CODE_045_EXISTENCE
					           , FORMAT_CODE_045_CHANGE
					           , FORMAT_CODE_045_VALUE
					   	      );
	
	//--------------------------------------------------------------- 
	
	DataElementField binField 
	
		= new DataElementField ( BIN_045_ID
							   , BIN_045_FIELD
							   , BIN_045_SUBFIELD					 
							   , BIN_045_FORMAT						 
							   , BIN_045_LENGTH						 
							   , BIN_045_ENCODING					 
							   , BIN_045_DATATYPE					 
							   , BIN_045_SOURCE						 
							   , BIN_045_DIRECTION					 
							   , BIN_045_EXISTENCE					 
							   , BIN_045_CHANGE						 
							   , BIN_045_VALUE						 
							   );
	
	//--------------------------------------------------------------- 
	
	DataElementField panField 
	
		= new DataElementField ( PAN_045_ID
						       , PAN_045_FIELD						 	
							   , PAN_045_SUBFIELD					 
							   , PAN_045_FORMAT						 
							   , PAN_045_LENGTH						 
							   , PAN_045_ENCODING					 
							   , PAN_045_DATATYPE					 
							   , PAN_045_SOURCE						 
							   , PAN_045_DIRECTION					 
							   , PAN_045_EXISTENCE					 
							   , PAN_045_CHANGE						 
							   , PAN_045_VALUE						 
							   );
	
	//---------------------------------------------------------------
	
	DataElementField checkDigitField 
	
		= new DataElementField ( CHECK_DIGIT_045_ID
						       , CHECK_DIGIT_045_FIELD				 	
						       , CHECK_DIGIT_045_SUBFIELD			 
						       , CHECK_DIGIT_045_FORMAT				 
						       , CHECK_DIGIT_045_LENGTH				 
						       , CHECK_DIGIT_045_ENCODING			 
						       , CHECK_DIGIT_045_DATATYPE			 
						       , CHECK_DIGIT_045_SOURCE				 
						       , CHECK_DIGIT_045_DIRECTION			 
						       , CHECK_DIGIT_045_EXISTENCE			 
						       , CHECK_DIGIT_045_CHANGE				 
						       , CHECK_DIGIT_045_VALUE				 
						       );
	
	//--------------------------------------------------------------------------------------

	DataElementField fieldSeparator01Field 
	
		= new DataElementField ( FIELD_SEPARATOR_01_045_ID
					           , FIELD_SEPARATOR_01_045_FIELD
					           , FIELD_SEPARATOR_01_045_SUBFIELD
					           , FIELD_SEPARATOR_01_045_FORMAT
					           , FIELD_SEPARATOR_01_045_LENGTH
					           , FIELD_SEPARATOR_01_045_ENCODING
					           , FIELD_SEPARATOR_01_045_DATATYPE
					           , FIELD_SEPARATOR_01_045_SOURCE
					           , FIELD_SEPARATOR_01_045_DIRECTION
					           , FIELD_SEPARATOR_01_045_EXISTENCE
					           , FIELD_SEPARATOR_01_045_CHANGE
					           , FIELD_SEPARATOR_01_045_VALUE
					   	      );
	

	DataElementField fullNameField 
	
		= new DataElementField ( FULL_NAME_045_ID
					           , FULL_NAME_045_FIELD
					           , FULL_NAME_045_SUBFIELD
					           , FULL_NAME_045_FORMAT
					           , FULL_NAME_045_LENGTH
					           , FULL_NAME_045_ENCODING
					           , FULL_NAME_045_DATATYPE
					           , FULL_NAME_045_SOURCE
					           , FULL_NAME_045_DIRECTION
					           , FULL_NAME_045_EXISTENCE
					           , FULL_NAME_045_CHANGE
					           , FULL_NAME_045_VALUE
					   	      );
	

	DataElementField fieldSeparator02Field 
	
		= new DataElementField ( FIELD_SEPARATOR_02_045_ID
					           , FIELD_SEPARATOR_02_045_FIELD
					           , FIELD_SEPARATOR_02_045_SUBFIELD
					           , FIELD_SEPARATOR_02_045_FORMAT
					           , FIELD_SEPARATOR_02_045_LENGTH
					           , FIELD_SEPARATOR_02_045_ENCODING
					           , FIELD_SEPARATOR_02_045_DATATYPE
					           , FIELD_SEPARATOR_02_045_SOURCE
					           , FIELD_SEPARATOR_02_045_DIRECTION
					           , FIELD_SEPARATOR_02_045_EXISTENCE
					           , FIELD_SEPARATOR_02_045_CHANGE
					           , FIELD_SEPARATOR_02_045_VALUE
					   	      );
	

	DataElementField expirationDateYearField 
	
		= new DataElementField ( EXPIRATION_DATE_YEAR_045_ID
					           , EXPIRATION_DATE_YEAR_045_FIELD
					           , EXPIRATION_DATE_YEAR_045_SUBFIELD
					           , EXPIRATION_DATE_YEAR_045_FORMAT
					           , EXPIRATION_DATE_YEAR_045_LENGTH
					           , EXPIRATION_DATE_YEAR_045_ENCODING
					           , EXPIRATION_DATE_YEAR_045_DATATYPE
					           , EXPIRATION_DATE_YEAR_045_SOURCE
					           , EXPIRATION_DATE_YEAR_045_DIRECTION
					           , EXPIRATION_DATE_YEAR_045_EXISTENCE
					           , EXPIRATION_DATE_YEAR_045_CHANGE
					           , EXPIRATION_DATE_YEAR_045_VALUE
					   	      );
	

	DataElementField expirationDateMonthField 
	
		= new DataElementField ( EXPIRATION_DATE_MONTH_045_ID
					           , EXPIRATION_DATE_MONTH_045_FIELD
					           , EXPIRATION_DATE_MONTH_045_SUBFIELD
					           , EXPIRATION_DATE_MONTH_045_FORMAT
					           , EXPIRATION_DATE_MONTH_045_LENGTH
					           , EXPIRATION_DATE_MONTH_045_ENCODING
					           , EXPIRATION_DATE_MONTH_045_DATATYPE
					           , EXPIRATION_DATE_MONTH_045_SOURCE
					           , EXPIRATION_DATE_MONTH_045_DIRECTION
					           , EXPIRATION_DATE_MONTH_045_EXISTENCE
					           , EXPIRATION_DATE_MONTH_045_CHANGE
					           , EXPIRATION_DATE_MONTH_045_VALUE
					   	      );
	

	DataElementField serviceCodeField 
	
		= new DataElementField ( SERVICE_CODE_045_ID
					           , SERVICE_CODE_045_FIELD
					           , SERVICE_CODE_045_SUBFIELD
					           , SERVICE_CODE_045_FORMAT
					           , SERVICE_CODE_045_LENGTH
					           , SERVICE_CODE_045_ENCODING
					           , SERVICE_CODE_045_DATATYPE
					           , SERVICE_CODE_045_SOURCE
					           , SERVICE_CODE_045_DIRECTION
					           , SERVICE_CODE_045_EXISTENCE
					           , SERVICE_CODE_045_CHANGE
					           , SERVICE_CODE_045_VALUE
					   	      );
	

	DataElementField pinValueKeyIndicatorField 
	
		= new DataElementField ( PIN_VALUE_KEY_INDICATOR_045_ID
					           , PIN_VALUE_KEY_INDICATOR_045_FIELD
					           , PIN_VALUE_KEY_INDICATOR_045_SUBFIELD
					           , PIN_VALUE_KEY_INDICATOR_045_FORMAT
					           , PIN_VALUE_KEY_INDICATOR_045_LENGTH
					           , PIN_VALUE_KEY_INDICATOR_045_ENCODING
					           , PIN_VALUE_KEY_INDICATOR_045_DATATYPE
					           , PIN_VALUE_KEY_INDICATOR_045_SOURCE
					           , PIN_VALUE_KEY_INDICATOR_045_DIRECTION
					           , PIN_VALUE_KEY_INDICATOR_045_EXISTENCE
					           , PIN_VALUE_KEY_INDICATOR_045_CHANGE
					           , PIN_VALUE_KEY_INDICATOR_045_VALUE
					   	      );
	

	DataElementField pinVerificationValueField 
	
		= new DataElementField ( PIN_VERIFICATION_VALUE_045_ID
					           , PIN_VERIFICATION_VALUE_045_FIELD
					           , PIN_VERIFICATION_VALUE_045_SUBFIELD
					           , PIN_VERIFICATION_VALUE_045_FORMAT
					           , PIN_VERIFICATION_VALUE_045_LENGTH
					           , PIN_VERIFICATION_VALUE_045_ENCODING
					           , PIN_VERIFICATION_VALUE_045_DATATYPE
					           , PIN_VERIFICATION_VALUE_045_SOURCE
					           , PIN_VERIFICATION_VALUE_045_DIRECTION
					           , PIN_VERIFICATION_VALUE_045_EXISTENCE
					           , PIN_VERIFICATION_VALUE_045_CHANGE
					           , PIN_VERIFICATION_VALUE_045_VALUE
					   	      );
	

	DataElementField cardVerificationValueField 
	
		= new DataElementField ( CARD_VERIFICATION_VALUE_045_ID
					           , CARD_VERIFICATION_VALUE_045_FIELD
					           , CARD_VERIFICATION_VALUE_045_SUBFIELD
					           , CARD_VERIFICATION_VALUE_045_FORMAT
					           , CARD_VERIFICATION_VALUE_045_LENGTH
					           , CARD_VERIFICATION_VALUE_045_ENCODING
					           , CARD_VERIFICATION_VALUE_045_DATATYPE
					           , CARD_VERIFICATION_VALUE_045_SOURCE
					           , CARD_VERIFICATION_VALUE_045_DIRECTION
					           , CARD_VERIFICATION_VALUE_045_EXISTENCE
					           , CARD_VERIFICATION_VALUE_045_CHANGE
					           , CARD_VERIFICATION_VALUE_045_VALUE
					   	      );
	

	DataElementField endSentinelField 
	
		= new DataElementField ( END_SENTINEL_045_ID
					           , END_SENTINEL_045_FIELD
					           , END_SENTINEL_045_SUBFIELD
					           , END_SENTINEL_045_FORMAT
					           , END_SENTINEL_045_LENGTH
					           , END_SENTINEL_045_ENCODING
					           , END_SENTINEL_045_DATATYPE
					           , END_SENTINEL_045_SOURCE
					           , END_SENTINEL_045_DIRECTION
					           , END_SENTINEL_045_EXISTENCE
					           , END_SENTINEL_045_CHANGE
					           , END_SENTINEL_045_VALUE
					   	      );
	

	DataElementField longRedundancyCheckCharField 
	
		= new DataElementField ( LONG_REDUNDANCY_CHECK_CHAR_045_ID
					           , LONG_REDUNDANCY_CHECK_CHAR_045_FIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_045_SUBFIELD
					           , LONG_REDUNDANCY_CHECK_CHAR_045_FORMAT
					           , LONG_REDUNDANCY_CHECK_CHAR_045_LENGTH
					           , LONG_REDUNDANCY_CHECK_CHAR_045_ENCODING
					           , LONG_REDUNDANCY_CHECK_CHAR_045_DATATYPE
					           , LONG_REDUNDANCY_CHECK_CHAR_045_SOURCE
					           , LONG_REDUNDANCY_CHECK_CHAR_045_DIRECTION
					           , LONG_REDUNDANCY_CHECK_CHAR_045_EXISTENCE
					           , LONG_REDUNDANCY_CHECK_CHAR_045_CHANGE
					           , LONG_REDUNDANCY_CHECK_CHAR_045_VALUE
					   	      );
	
	
	public DE045Impl createDE045() {
		
		int id = 45000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(startSentinelField);
		storage.add(formatCodeField);
		storage.add(binField);
		storage.add(panField);
		storage.add(checkDigitField);
		storage.add(fieldSeparator01Field);
		storage.add(fullNameField);
		storage.add(fieldSeparator02Field);
		storage.add(expirationDateYearField);
		storage.add(expirationDateMonthField);
		storage.add(serviceCodeField);
		storage.add(pinValueKeyIndicatorField);
		storage.add(pinVerificationValueField);
		storage.add(cardVerificationValueField);
		storage.add(endSentinelField);
		storage.add(longRedundancyCheckCharField);
		
		DE045Impl de045 = new DE045Impl(id, storage);
		
		return de045;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE045 createDE045 = new CreateDE045(); 
		
		DE045Impl de045	= createDE045.createDE045(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de045, fieldList,codeList );
	
	}
}
