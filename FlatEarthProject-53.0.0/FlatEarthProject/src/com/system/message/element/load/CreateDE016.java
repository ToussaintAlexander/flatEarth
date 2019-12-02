package com.system.message.element.load;

import static com.system.message.element.DE016.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE016Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE016  {

	DataElementField conversionDateMonthField 
	
		= new DataElementField ( CONVERSION_DATE_MONTH_016_ID
					           , CONVERSION_DATE_MONTH_016_FIELD
					           , CONVERSION_DATE_MONTH_016_SUBFIELD
					           , CONVERSION_DATE_MONTH_016_FORMAT
					           , CONVERSION_DATE_MONTH_016_LENGTH
					           , CONVERSION_DATE_MONTH_016_ENCODING
					           , CONVERSION_DATE_MONTH_016_DATATYPE
					           , CONVERSION_DATE_MONTH_016_SOURCE
					           , CONVERSION_DATE_MONTH_016_DIRECTION
					           , CONVERSION_DATE_MONTH_016_EXISTENCE
					           , CONVERSION_DATE_MONTH_016_CHANGE
					           , CONVERSION_DATE_MONTH_016_VALUE
					   	      );


	DataElementField conversionDateDayField 
	
		= new DataElementField ( CONVERSION_DATE_DAY_016_ID
					           , CONVERSION_DATE_DAY_016_FIELD
					           , CONVERSION_DATE_DAY_016_SUBFIELD
					           , CONVERSION_DATE_DAY_016_FORMAT
					           , CONVERSION_DATE_DAY_016_LENGTH
					           , CONVERSION_DATE_DAY_016_ENCODING
					           , CONVERSION_DATE_DAY_016_DATATYPE
					           , CONVERSION_DATE_DAY_016_SOURCE
					           , CONVERSION_DATE_DAY_016_DIRECTION
					           , CONVERSION_DATE_DAY_016_EXISTENCE
					           , CONVERSION_DATE_DAY_016_CHANGE
					           , CONVERSION_DATE_DAY_016_VALUE
					   	      );	
	
	public DE016Impl createDE016() {
		
		int id = 16000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(conversionDateMonthField);
		storage.add(conversionDateDayField);
		
		DE016Impl de016 = new DE016Impl(id, storage);
		
		return de016;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE016 createDE016 = new CreateDE016(); 
		
		DE016Impl de016	= createDE016.createDE016(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de016, fieldList,codeList );
	
	}
}
