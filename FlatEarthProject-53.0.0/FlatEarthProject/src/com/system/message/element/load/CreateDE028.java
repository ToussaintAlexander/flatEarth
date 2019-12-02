package com.system.message.element.load;

import static com.system.message.element.DE028.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE028Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE028  {

	DataElementField accountEntryField 
	
		= new DataElementField ( ACCOUNT_ENTRY_028_ID
					           , ACCOUNT_ENTRY_028_FIELD
					           , ACCOUNT_ENTRY_028_SUBFIELD
					           , ACCOUNT_ENTRY_028_FORMAT
					           , ACCOUNT_ENTRY_028_LENGTH
					           , ACCOUNT_ENTRY_028_ENCODING
					           , ACCOUNT_ENTRY_028_DATATYPE
					           , ACCOUNT_ENTRY_028_SOURCE
					           , ACCOUNT_ENTRY_028_DIRECTION
					           , ACCOUNT_ENTRY_028_EXISTENCE
					           , ACCOUNT_ENTRY_028_CHANGE
					           , ACCOUNT_ENTRY_028_VALUE
					   	      );
	
	DataElementField transactionFeeAmountField 
	
		= new DataElementField ( TRANSACTION_FEE_AMOUNT_028_ID
					           , TRANSACTION_FEE_AMOUNT_028_FIELD
					           , TRANSACTION_FEE_AMOUNT_028_SUBFIELD
					           , TRANSACTION_FEE_AMOUNT_028_FORMAT
					           , TRANSACTION_FEE_AMOUNT_028_LENGTH
					           , TRANSACTION_FEE_AMOUNT_028_ENCODING
					           , TRANSACTION_FEE_AMOUNT_028_DATATYPE
					           , TRANSACTION_FEE_AMOUNT_028_SOURCE
					           , TRANSACTION_FEE_AMOUNT_028_DIRECTION
					           , TRANSACTION_FEE_AMOUNT_028_EXISTENCE
					           , TRANSACTION_FEE_AMOUNT_028_CHANGE
					           , TRANSACTION_FEE_AMOUNT_028_VALUE
					   	      );
	
	public DE028Impl createDE028() {
		
		int id = 28000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(accountEntryField);
		storage.add(transactionFeeAmountField);
		
		DE028Impl de028 = new DE028Impl(id, storage);
		
		return de028;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE028 createDE028 = new CreateDE028(); 
		
		DE028Impl de028	= createDE028.createDE028(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de028, fieldList,codeList );
	
	}
}
