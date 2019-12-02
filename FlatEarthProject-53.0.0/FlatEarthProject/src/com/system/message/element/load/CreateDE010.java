package com.system.message.element.load;

import static com.system.message.element.DE010.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE010Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE010  {

	DataElementField cardholderBillingConversionField 
	
		= new DataElementField ( CARDHOLDER_BILLING_CONVERSION_RATE_010_ID
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_FIELD
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_SUBFIELD
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_FORMAT
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_LENGTH
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_ENCODING
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_DATATYPE
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_SOURCE
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_DIRECTION
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_EXISTENCE
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_CHANGE
					           , CARDHOLDER_BILLING_CONVERSION_RATE_010_VALUE
					   	      );
	
	public DE010Impl createDE010() {
		
		int id = 10000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(cardholderBillingConversionField);
		
		DE010Impl de010 = new DE010Impl(id, storage);
		
		return de010;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE010 createDE010 = new CreateDE010(); 
		
		DE010Impl de010	= createDE010.createDE010(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de010, fieldList,codeList );
	
	}
}
