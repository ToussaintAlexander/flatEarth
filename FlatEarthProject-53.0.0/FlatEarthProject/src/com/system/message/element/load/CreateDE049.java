package com.system.message.element.load;

import static com.system.message.element.DE049.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE049Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE049  {

	DataElementField transactionCurrencyCodeField 
	
		= new DataElementField ( TRANSACTION_CURRENCY_CODE_049_ID
					           , TRANSACTION_CURRENCY_CODE_049_FIELD
					           , TRANSACTION_CURRENCY_CODE_049_SUBFIELD
					           , TRANSACTION_CURRENCY_CODE_049_FORMAT
					           , TRANSACTION_CURRENCY_CODE_049_LENGTH
					           , TRANSACTION_CURRENCY_CODE_049_ENCODING
					           , TRANSACTION_CURRENCY_CODE_049_DATATYPE
					           , TRANSACTION_CURRENCY_CODE_049_SOURCE
					           , TRANSACTION_CURRENCY_CODE_049_DIRECTION
					           , TRANSACTION_CURRENCY_CODE_049_EXISTENCE
					           , TRANSACTION_CURRENCY_CODE_049_CHANGE
					           , TRANSACTION_CURRENCY_CODE_049_VALUE
					   	      );
	
	public DE049Impl createDE049() {
		
		int id = 49000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(transactionCurrencyCodeField);
		
		DE049Impl de049 = new DE049Impl(id, storage);
		
		return de049;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE049 createDE049 = new CreateDE049(); 
		
		DE049Impl de049	= createDE049.createDE049(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de049, fieldList,codeList );
	
	}
}
