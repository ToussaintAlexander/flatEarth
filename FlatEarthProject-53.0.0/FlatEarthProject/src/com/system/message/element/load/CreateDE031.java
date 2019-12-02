package com.system.message.element.load;

import static com.system.message.element.DE031.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE031Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE031  {

	DataElementField accountEntryField 
	
		= new DataElementField ( ACCOUNT_ENTRY_031_ID
					           , ACCOUNT_ENTRY_031_FIELD
					           , ACCOUNT_ENTRY_031_SUBFIELD
					           , ACCOUNT_ENTRY_031_FORMAT
					           , ACCOUNT_ENTRY_031_LENGTH
					           , ACCOUNT_ENTRY_031_ENCODING
					           , ACCOUNT_ENTRY_031_DATATYPE
					           , ACCOUNT_ENTRY_031_SOURCE
					           , ACCOUNT_ENTRY_031_DIRECTION
					           , ACCOUNT_ENTRY_031_EXISTENCE
					           , ACCOUNT_ENTRY_031_CHANGE
					           , ACCOUNT_ENTRY_031_VALUE
					   	      );


	DataElementField settlementProcessingFeeAmountField 
	
		= new DataElementField ( SETTLEMENT_PROCESSING_FEE_AMOUNT_031_ID
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_FIELD
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_SUBFIELD
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_FORMAT
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_LENGTH
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_ENCODING
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_DATATYPE
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_SOURCE
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_DIRECTION
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_EXISTENCE
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_CHANGE
					           , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_VALUE
					   	      );
	
	
	public DE031Impl createDE031() {
		
		int id = 0;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(accountEntryField);
		storage.add(settlementProcessingFeeAmountField);
		
		DE031Impl de031 = new DE031Impl(id, storage);
		
		return de031;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE031 createDE031 = new CreateDE031(); 
		
		DE031Impl de031	= createDE031.createDE031(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de031, fieldList,codeList );
	
	}
}
