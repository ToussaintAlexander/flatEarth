package com.system.message.element.load;

import static com.system.message.element.DE022.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE022Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE022  {

	DataElementField transactionEntryModeField 
	
		= new DataElementField ( TRANSACTION_ENTRY_MODE_022_ID
					           , TRANSACTION_ENTRY_MODE_022_FIELD
					           , TRANSACTION_ENTRY_MODE_022_SUBFIELD
					           , TRANSACTION_ENTRY_MODE_022_FORMAT
					           , TRANSACTION_ENTRY_MODE_022_LENGTH
					           , TRANSACTION_ENTRY_MODE_022_ENCODING
					           , TRANSACTION_ENTRY_MODE_022_DATATYPE
					           , TRANSACTION_ENTRY_MODE_022_SOURCE
					           , TRANSACTION_ENTRY_MODE_022_DIRECTION
					           , TRANSACTION_ENTRY_MODE_022_EXISTENCE
					           , TRANSACTION_ENTRY_MODE_022_CHANGE
					           , TRANSACTION_ENTRY_MODE_022_VALUE
					   	      );


	DataElementField pinEntryModeField 
	
		= new DataElementField ( PIN_ENTRY_MODE_022_ID
					           , PIN_ENTRY_MODE_022_FIELD
					           , PIN_ENTRY_MODE_022_SUBFIELD
					           , PIN_ENTRY_MODE_022_FORMAT
					           , PIN_ENTRY_MODE_022_LENGTH
					           , PIN_ENTRY_MODE_022_ENCODING
					           , PIN_ENTRY_MODE_022_DATATYPE
					           , PIN_ENTRY_MODE_022_SOURCE
					           , PIN_ENTRY_MODE_022_DIRECTION
					           , PIN_ENTRY_MODE_022_EXISTENCE
					           , PIN_ENTRY_MODE_022_CHANGE
					           , PIN_ENTRY_MODE_022_VALUE
					   	      );
		
	
	public DE022Impl createDE022() {
		
		int id = 22000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(transactionEntryModeField);
		storage.add(pinEntryModeField);
		
		DE022Impl de022 = new DE022Impl(id, storage);
		
		return de022;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE022 createDE022 = new CreateDE022(); 
		
		DE022Impl de022	= createDE022.createDE022(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de022, fieldList,codeList );
	
	}
}
