package com.system.message.element.load;

import static com.system.message.element.DE051.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE051Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE051  {

	DataElementField cardholderBillingCurrencyCodeField 
	
		= new DataElementField ( CARDHOLDER_BILLING_CURRENCY_CODE_051_ID
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_FIELD
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_SUBFIELD
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_FORMAT
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_LENGTH
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_ENCODING
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_DATATYPE
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_SOURCE
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_DIRECTION
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_EXISTENCE
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_CHANGE
					           , CARDHOLDER_BILLING_CURRENCY_CODE_051_VALUE
					   	      );
	
	public DE051Impl createDE051() {
		
		int id = 51000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(cardholderBillingCurrencyCodeField);
		
		DE051Impl de051 = new DE051Impl(id, storage);
		
		return de051;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE051 createDE051 = new CreateDE051(); 
		
		DE051Impl de051	= createDE051.createDE051(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de051, fieldList,codeList );
	
	}
}
