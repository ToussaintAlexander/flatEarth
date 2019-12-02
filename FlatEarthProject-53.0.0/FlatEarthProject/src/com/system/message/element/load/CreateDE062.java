package com.system.message.element.load;

import static com.system.message.element.DE062.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE062Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE062  {

	DataElementField fieldBitmapField 
	
		= new DataElementField ( FIELD_BITMAP_062_ID
					           , FIELD_BITMAP_062_FIELD
					           , FIELD_BITMAP_062_SUBFIELD
					           , FIELD_BITMAP_062_FORMAT
					           , FIELD_BITMAP_062_LENGTH
					           , FIELD_BITMAP_062_ENCODING
					           , FIELD_BITMAP_062_DATATYPE
					           , FIELD_BITMAP_062_SOURCE
					           , FIELD_BITMAP_062_DIRECTION
					           , FIELD_BITMAP_062_EXISTENCE
					           , FIELD_BITMAP_062_CHANGE
					           , FIELD_BITMAP_062_VALUE
					   	      );

	DataElementField authCharIndicatorField 
	
		= new DataElementField ( AUTH_CHAR_INDICATOR_062_ID
					           , AUTH_CHAR_INDICATOR_062_FIELD
					           , AUTH_CHAR_INDICATOR_062_SUBFIELD
					           , AUTH_CHAR_INDICATOR_062_FORMAT
					           , AUTH_CHAR_INDICATOR_062_LENGTH
					           , AUTH_CHAR_INDICATOR_062_ENCODING
					           , AUTH_CHAR_INDICATOR_062_DATATYPE
					           , AUTH_CHAR_INDICATOR_062_SOURCE
					           , AUTH_CHAR_INDICATOR_062_DIRECTION
					           , AUTH_CHAR_INDICATOR_062_EXISTENCE
					           , AUTH_CHAR_INDICATOR_062_CHANGE
					           , AUTH_CHAR_INDICATOR_062_VALUE
					   	      );
	
	DataElementField transIdentifierField 
	
		= new DataElementField ( TRANS_IDENTIFIER_062_ID
					           , TRANS_IDENTIFIER_062_FIELD
					           , TRANS_IDENTIFIER_062_SUBFIELD
					           , TRANS_IDENTIFIER_062_FORMAT
					           , TRANS_IDENTIFIER_062_LENGTH
					           , TRANS_IDENTIFIER_062_ENCODING
					           , TRANS_IDENTIFIER_062_DATATYPE
					           , TRANS_IDENTIFIER_062_SOURCE
					           , TRANS_IDENTIFIER_062_DIRECTION
					           , TRANS_IDENTIFIER_062_EXISTENCE
					           , TRANS_IDENTIFIER_062_CHANGE
					           , TRANS_IDENTIFIER_062_VALUE
					   	      );
	
	DataElementField marketSpecificDataIdtfrField 
	
		= new DataElementField ( MARKET_SPECIFIC_DATA_IDTFR_062_ID
					           , MARKET_SPECIFIC_DATA_IDTFR_062_FIELD
					           , MARKET_SPECIFIC_DATA_IDTFR_062_SUBFIELD
					           , MARKET_SPECIFIC_DATA_IDTFR_062_FORMAT
					           , MARKET_SPECIFIC_DATA_IDTFR_062_LENGTH
					           , MARKET_SPECIFIC_DATA_IDTFR_062_ENCODING
					           , MARKET_SPECIFIC_DATA_IDTFR_062_DATATYPE
					           , MARKET_SPECIFIC_DATA_IDTFR_062_SOURCE
					           , MARKET_SPECIFIC_DATA_IDTFR_062_DIRECTION
					           , MARKET_SPECIFIC_DATA_IDTFR_062_EXISTENCE
					           , MARKET_SPECIFIC_DATA_IDTFR_062_CHANGE
					           , MARKET_SPECIFIC_DATA_IDTFR_062_VALUE
					   	      );
	
	DataElementField merchantVVField 
	
		= new DataElementField ( MERCHANT_VV_062_ID
					           , MERCHANT_VV_062_FIELD
					           , MERCHANT_VV_062_SUBFIELD
					           , MERCHANT_VV_062_FORMAT
					           , MERCHANT_VV_062_LENGTH
					           , MERCHANT_VV_062_ENCODING
					           , MERCHANT_VV_062_DATATYPE
					           , MERCHANT_VV_062_SOURCE
					           , MERCHANT_VV_062_DIRECTION
					           , MERCHANT_VV_062_EXISTENCE
					           , MERCHANT_VV_062_CHANGE
					           , MERCHANT_VV_062_VALUE
					   	      );

	DataElementField cardLevelResultsField 
	
		= new DataElementField ( CARD_LEVEL_RESULTS_062_ID
					           , CARD_LEVEL_RESULTS_062_FIELD
					           , CARD_LEVEL_RESULTS_062_SUBFIELD
					           , CARD_LEVEL_RESULTS_062_FORMAT
					           , CARD_LEVEL_RESULTS_062_LENGTH
					           , CARD_LEVEL_RESULTS_062_ENCODING
					           , CARD_LEVEL_RESULTS_062_DATATYPE
					           , CARD_LEVEL_RESULTS_062_SOURCE
					           , CARD_LEVEL_RESULTS_062_DIRECTION
					           , CARD_LEVEL_RESULTS_062_EXISTENCE
					           , CARD_LEVEL_RESULTS_062_CHANGE
					           , CARD_LEVEL_RESULTS_062_VALUE
					   	      );
	
	DataElementField programIdentifierField 
	
		= new DataElementField ( PROGRAM_IDENTIFIER_062_ID
					           , PROGRAM_IDENTIFIER_062_FIELD
					           , PROGRAM_IDENTIFIER_062_SUBFIELD
					           , PROGRAM_IDENTIFIER_062_FORMAT
					           , PROGRAM_IDENTIFIER_062_LENGTH
					           , PROGRAM_IDENTIFIER_062_ENCODING
					           , PROGRAM_IDENTIFIER_062_DATATYPE
					           , PROGRAM_IDENTIFIER_062_SOURCE
					           , PROGRAM_IDENTIFIER_062_DIRECTION
					           , PROGRAM_IDENTIFIER_062_EXISTENCE
					           , PROGRAM_IDENTIFIER_062_CHANGE
					           , PROGRAM_IDENTIFIER_062_VALUE
					   	      );
	
	public DE062Impl createDE062() {
		
		int id = 62000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(fieldBitmapField);
		storage.add(authCharIndicatorField);
		storage.add(transIdentifierField);
		storage.add(marketSpecificDataIdtfrField);
		storage.add(merchantVVField);
		storage.add(cardLevelResultsField);
		storage.add(programIdentifierField);
		
		DE062Impl de062 = new DE062Impl(id, storage);
		
		return de062;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE062 createDE062 = new CreateDE062(); 
		
		DE062Impl de062	= createDE062.createDE062(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de062, fieldList,codeList );
	
	}
}
