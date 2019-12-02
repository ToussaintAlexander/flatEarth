package com.system.message.element.load;

import static com.system.message.element.DE030.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE030Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE030  {


	DataElementField accountEntryField 
	
		= new DataElementField ( ACCOUNT_ENTRY_030_ID
					           , ACCOUNT_ENTRY_030_FIELD
					           , ACCOUNT_ENTRY_030_SUBFIELD
					           , ACCOUNT_ENTRY_030_FORMAT
					           , ACCOUNT_ENTRY_030_LENGTH
					           , ACCOUNT_ENTRY_030_ENCODING
					           , ACCOUNT_ENTRY_030_DATATYPE
					           , ACCOUNT_ENTRY_030_SOURCE
					           , ACCOUNT_ENTRY_030_DIRECTION
					           , ACCOUNT_ENTRY_030_EXISTENCE
					           , ACCOUNT_ENTRY_030_CHANGE
					           , ACCOUNT_ENTRY_030_VALUE
					   	      );
		
	
	DataElementField transactionProcessingFeeAmountField 
	
		= new DataElementField ( TRANSACTION_PROCESSING_FEE_AMOUNT_030_ID
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_FIELD
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_SUBFIELD
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_FORMAT
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_LENGTH
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_ENCODING
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_DATATYPE
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_SOURCE
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_DIRECTION
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_EXISTENCE
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_CHANGE
					           , TRANSACTION_PROCESSING_FEE_AMOUNT_030_VALUE
					   	      );
	
	public DE030Impl createDE030() {
		
		int id = 30000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(accountEntryField);
		storage.add(transactionProcessingFeeAmountField);
		
		DE030Impl de030 = new DE030Impl(id, storage);
		
		return de030;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE030 createDE030 = new CreateDE030(); 
		
		DE030Impl de030	= createDE030.createDE030(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de030, fieldList,codeList );
	
	}
}
