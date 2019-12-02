package com.system.message.element.load;

import static com.system.message.element.DE013.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE013Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE013  {

	DataElementField localTransactionDateMonthField 
	
		= new DataElementField ( 
				                 LOCAL_TRANSACTION_DATE_MONTH_013_ID
					           , LOCAL_TRANSACTION_DATE_MONTH_013_FIELD
					           , LOCAL_TRANSACTION_DATE_MONTH_013_SUBFIELD
					           , LOCAL_TRANSACTION_DATE_MONTH_013_FORMAT
					           , LOCAL_TRANSACTION_DATE_MONTH_013_LENGTH
					           , LOCAL_TRANSACTION_DATE_MONTH_013_ENCODING
					           , LOCAL_TRANSACTION_DATE_MONTH_013_DATATYPE
					           , LOCAL_TRANSACTION_DATE_MONTH_013_SOURCE
					           , LOCAL_TRANSACTION_DATE_MONTH_013_DIRECTION
					           , LOCAL_TRANSACTION_DATE_MONTH_013_EXISTENCE
					           , LOCAL_TRANSACTION_DATE_MONTH_013_CHANGE
					           , LOCAL_TRANSACTION_DATE_MONTH_013_VALUE
					   	      );


	DataElementField localTransactionDateDayField 
	
		= new DataElementField ( 
				                 LOCAL_TRANSACTION_DATE_DAY_013_ID
					           , LOCAL_TRANSACTION_DATE_DAY_013_FIELD
					           , LOCAL_TRANSACTION_DATE_DAY_013_SUBFIELD
					           , LOCAL_TRANSACTION_DATE_DAY_013_FORMAT
					           , LOCAL_TRANSACTION_DATE_DAY_013_LENGTH
					           , LOCAL_TRANSACTION_DATE_DAY_013_ENCODING
					           , LOCAL_TRANSACTION_DATE_DAY_013_DATATYPE
					           , LOCAL_TRANSACTION_DATE_DAY_013_SOURCE
					           , LOCAL_TRANSACTION_DATE_DAY_013_DIRECTION
					           , LOCAL_TRANSACTION_DATE_DAY_013_EXISTENCE
					           , LOCAL_TRANSACTION_DATE_DAY_013_CHANGE
					           , LOCAL_TRANSACTION_DATE_DAY_013_VALUE
					   	      );
	
	
	public DE013Impl createDE013() {
		
		int id = 13000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(localTransactionDateMonthField);
		storage.add(localTransactionDateDayField);
		
		DE013Impl de013 = new DE013Impl(id, storage);
		
		return de013;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE013 createDE013 = new CreateDE013(); 
		
		DE013Impl de013	= createDE013.createDE013(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de013, fieldList,codeList );
	
	}
}
