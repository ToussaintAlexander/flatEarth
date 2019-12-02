package com.system.message.element.load;

import static com.system.message.element.DE012.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE012Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE012  {

	DataElementField localTransactionTimeHourField 
	
		= new DataElementField ( 
				                 LOCAL_TRANSACTION_TIME_HOUR_012_ID
					           , LOCAL_TRANSACTION_TIME_HOUR_012_FIELD
					           , LOCAL_TRANSACTION_TIME_HOUR_012_SUBFIELD
					           , LOCAL_TRANSACTION_TIME_HOUR_012_FORMAT
					           , LOCAL_TRANSACTION_TIME_HOUR_012_LENGTH
					           , LOCAL_TRANSACTION_TIME_HOUR_012_ENCODING
					           , LOCAL_TRANSACTION_TIME_HOUR_012_DATATYPE
					           , LOCAL_TRANSACTION_TIME_HOUR_012_SOURCE
					           , LOCAL_TRANSACTION_TIME_HOUR_012_DIRECTION
					           , LOCAL_TRANSACTION_TIME_HOUR_012_EXISTENCE
					           , LOCAL_TRANSACTION_TIME_HOUR_012_CHANGE
					           , LOCAL_TRANSACTION_TIME_HOUR_012_VALUE
					   	      );

	DataElementField localTransactionTimeMinuteField 
	
		= new DataElementField ( 
				                 LOCAL_TRANSACTION_TIME_MINUTE_012_ID
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_FIELD
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_SUBFIELD
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_FORMAT
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_LENGTH
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_ENCODING
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_DATATYPE
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_SOURCE
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_DIRECTION
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_EXISTENCE
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_CHANGE
				               , LOCAL_TRANSACTION_TIME_MINUTE_012_VALUE
				   	           );

	DataElementField localTransactionTimeSecondField 
	
		= new DataElementField ( 
				                 LOCAL_TRANSACTION_TIME_SECOND_012_ID
				               , LOCAL_TRANSACTION_TIME_SECOND_012_FIELD
				               , LOCAL_TRANSACTION_TIME_SECOND_012_SUBFIELD
				               , LOCAL_TRANSACTION_TIME_SECOND_012_FORMAT
				               , LOCAL_TRANSACTION_TIME_SECOND_012_LENGTH
				               , LOCAL_TRANSACTION_TIME_SECOND_012_ENCODING
				               , LOCAL_TRANSACTION_TIME_SECOND_012_DATATYPE
				               , LOCAL_TRANSACTION_TIME_SECOND_012_SOURCE
				               , LOCAL_TRANSACTION_TIME_SECOND_012_DIRECTION
				               , LOCAL_TRANSACTION_TIME_SECOND_012_EXISTENCE
				               , LOCAL_TRANSACTION_TIME_SECOND_012_CHANGE
				               , LOCAL_TRANSACTION_TIME_SECOND_012_VALUE
				   	           );
	
	public DE012Impl createDE012() {
		
		int id = 12000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(localTransactionTimeHourField);
		storage.add(localTransactionTimeMinuteField);
		storage.add(localTransactionTimeSecondField);
		
		DE012Impl de012 = new DE012Impl(id, storage);
		
		return de012;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE012 createDE012 = new CreateDE012(); 
		
		DE012Impl de012	= createDE012.createDE012(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de012, fieldList,codeList );
	
	}
}
