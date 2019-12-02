package com.system.message.element.load;

import static com.system.message.element.DE029.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE029Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE029  {

	DataElementField accountEntryField 
	
		= new DataElementField ( ACCOUNT_ENTRY_029_ID
					           , ACCOUNT_ENTRY_029_FIELD
					           , ACCOUNT_ENTRY_029_SUBFIELD
					           , ACCOUNT_ENTRY_029_FORMAT
					           , ACCOUNT_ENTRY_029_LENGTH
					           , ACCOUNT_ENTRY_029_ENCODING
					           , ACCOUNT_ENTRY_029_DATATYPE
					           , ACCOUNT_ENTRY_029_SOURCE
					           , ACCOUNT_ENTRY_029_DIRECTION
					           , ACCOUNT_ENTRY_029_EXISTENCE
					           , ACCOUNT_ENTRY_029_CHANGE
					           , ACCOUNT_ENTRY_029_VALUE
					   	      );
	
	DataElementField settlementFeeAmountField 
	
		= new DataElementField ( SETTLEMENT_FEE_AMOUNT_029_ID
					           , SETTLEMENT_FEE_AMOUNT_029_FIELD
					           , SETTLEMENT_FEE_AMOUNT_029_SUBFIELD
					           , SETTLEMENT_FEE_AMOUNT_029_FORMAT
					           , SETTLEMENT_FEE_AMOUNT_029_LENGTH
					           , SETTLEMENT_FEE_AMOUNT_029_ENCODING
					           , SETTLEMENT_FEE_AMOUNT_029_DATATYPE
					           , SETTLEMENT_FEE_AMOUNT_029_SOURCE
					           , SETTLEMENT_FEE_AMOUNT_029_DIRECTION
					           , SETTLEMENT_FEE_AMOUNT_029_EXISTENCE
					           , SETTLEMENT_FEE_AMOUNT_029_CHANGE
					           , SETTLEMENT_FEE_AMOUNT_029_VALUE
					   	      );
	
	public DE029Impl createDE029() {
		
		int id = 29000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(accountEntryField);
		storage.add(settlementFeeAmountField);
		
		DE029Impl de029 = new DE029Impl(id, storage);
		
		return de029;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE029 createDE029 = new CreateDE029(); 
		
		DE029Impl de029	= createDE029.createDE029(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de029, fieldList,codeList );
	
	}
}
