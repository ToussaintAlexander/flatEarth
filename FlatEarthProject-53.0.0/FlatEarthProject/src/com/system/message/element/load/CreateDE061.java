package com.system.message.element.load;

import static com.system.message.element.DE061.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE061Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE061  {

	DataElementField transactionOtherAmountField 
	
		= new DataElementField ( TRANSACTION_OTHER_AMOUNT_061_ID
					           , TRANSACTION_OTHER_AMOUNT_061_FIELD
					           , TRANSACTION_OTHER_AMOUNT_061_SUBFIELD
					           , TRANSACTION_OTHER_AMOUNT_061_FORMAT
					           , TRANSACTION_OTHER_AMOUNT_061_LENGTH
					           , TRANSACTION_OTHER_AMOUNT_061_ENCODING
					           , TRANSACTION_OTHER_AMOUNT_061_DATATYPE
					           , TRANSACTION_OTHER_AMOUNT_061_SOURCE
					           , TRANSACTION_OTHER_AMOUNT_061_DIRECTION
					           , TRANSACTION_OTHER_AMOUNT_061_EXISTENCE
					           , TRANSACTION_OTHER_AMOUNT_061_CHANGE
					           , TRANSACTION_OTHER_AMOUNT_061_VALUE
					   	      );


	DataElementField cardholderBillingOtherAmountField 
	
		= new DataElementField ( CARDHOLDER_BILLING_OTHER_AMOUNT_061_ID
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_FIELD
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_SUBFIELD
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_FORMAT
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_LENGTH
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_ENCODING
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_DATATYPE
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_SOURCE
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_DIRECTION
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_EXISTENCE
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_CHANGE
					           , CARDHOLDER_BILLING_OTHER_AMOUNT_061_VALUE
					   	      );
		
	
	public DE061Impl createDE061() {
		
		int id = 61000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(transactionOtherAmountField);
		storage.add(cardholderBillingOtherAmountField);
		
		DE061Impl de061 = new DE061Impl(id, storage);
		
		return de061;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE061 createDE061 = new CreateDE061(); 
		
		DE061Impl de061	= createDE061.createDE061(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de061, fieldList,codeList );
	
	}
}
