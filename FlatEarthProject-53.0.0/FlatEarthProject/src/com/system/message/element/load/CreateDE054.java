package com.system.message.element.load;

import static com.system.message.element.DE054.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE054Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE054  {

	DataElementField accountTypeField 
	
		= new DataElementField ( ACCOUNT_TYPE_054_ID
					           , ACCOUNT_TYPE_054_FIELD
					           , ACCOUNT_TYPE_054_SUBFIELD
					           , ACCOUNT_TYPE_054_FORMAT
					           , ACCOUNT_TYPE_054_LENGTH
					           , ACCOUNT_TYPE_054_ENCODING
					           , ACCOUNT_TYPE_054_DATATYPE
					           , ACCOUNT_TYPE_054_SOURCE
					           , ACCOUNT_TYPE_054_DIRECTION
					           , ACCOUNT_TYPE_054_EXISTENCE
					           , ACCOUNT_TYPE_054_CHANGE
					           , ACCOUNT_TYPE_054_VALUE
					   	      );


	DataElementField amountTypeField 
	
		= new DataElementField ( AMOUNT_TYPE_054_ID
					           , AMOUNT_TYPE_054_FIELD
					           , AMOUNT_TYPE_054_SUBFIELD
					           , AMOUNT_TYPE_054_FORMAT
					           , AMOUNT_TYPE_054_LENGTH
					           , AMOUNT_TYPE_054_ENCODING
					           , AMOUNT_TYPE_054_DATATYPE
					           , AMOUNT_TYPE_054_SOURCE
					           , AMOUNT_TYPE_054_DIRECTION
					           , AMOUNT_TYPE_054_EXISTENCE
					           , AMOUNT_TYPE_054_CHANGE
					           , AMOUNT_TYPE_054_VALUE
					   	      );
	

	DataElementField currencyCodeField 
	
		= new DataElementField ( CURRENCY_CODE_054_ID
					           , CURRENCY_CODE_054_FIELD
					           , CURRENCY_CODE_054_SUBFIELD
					           , CURRENCY_CODE_054_FORMAT
					           , CURRENCY_CODE_054_LENGTH
					           , CURRENCY_CODE_054_ENCODING
					           , CURRENCY_CODE_054_DATATYPE
					           , CURRENCY_CODE_054_SOURCE
					           , CURRENCY_CODE_054_DIRECTION
					           , CURRENCY_CODE_054_EXISTENCE
					           , CURRENCY_CODE_054_CHANGE
					           , CURRENCY_CODE_054_VALUE
					   	      );
	

	DataElementField accountEntryField 
	
		= new DataElementField ( ACCOUNT_ENTRY_054_ID
					           , ACCOUNT_ENTRY_054_FIELD
					           , ACCOUNT_ENTRY_054_SUBFIELD
					           , ACCOUNT_ENTRY_054_FORMAT
					           , ACCOUNT_ENTRY_054_LENGTH
					           , ACCOUNT_ENTRY_054_ENCODING
					           , ACCOUNT_ENTRY_054_DATATYPE
					           , ACCOUNT_ENTRY_054_SOURCE
					           , ACCOUNT_ENTRY_054_DIRECTION
					           , ACCOUNT_ENTRY_054_EXISTENCE
					           , ACCOUNT_ENTRY_054_CHANGE
					           , ACCOUNT_ENTRY_054_VALUE
					   	      );
	

	DataElementField amountField 
	
		= new DataElementField ( AMOUNT_054_ID
					           , AMOUNT_054_FIELD
					           , AMOUNT_054_SUBFIELD
					           , AMOUNT_054_FORMAT
					           , AMOUNT_054_LENGTH
					           , AMOUNT_054_ENCODING
					           , AMOUNT_054_DATATYPE
					           , AMOUNT_054_SOURCE
					           , AMOUNT_054_DIRECTION
					           , AMOUNT_054_EXISTENCE
					           , AMOUNT_054_CHANGE
					           , AMOUNT_054_VALUE
					   	      );
	

	public DE054Impl createDE054() {
		
		int id = 54000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(accountTypeField);
		storage.add(amountTypeField);
		storage.add(currencyCodeField);
		storage.add(accountEntryField);
		storage.add(amountField);
		
		DE054Impl de054 = new DE054Impl(id, storage);
		
		return de054;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE054 createDE054 = new CreateDE054(); 
		
		DE054Impl de054	= createDE054.createDE054(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de054, fieldList,codeList );
	
	}
}
