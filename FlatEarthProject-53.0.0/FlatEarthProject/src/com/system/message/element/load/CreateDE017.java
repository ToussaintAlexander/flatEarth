package com.system.message.element.load;

import static com.system.message.element.DE017.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE017Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE017  {

	DataElementField captureDateMonthField 
	
		= new DataElementField ( CAPTURE_DATE_MONTH_017_ID
					           , CAPTURE_DATE_MONTH_017_FIELD
					           , CAPTURE_DATE_MONTH_017_SUBFIELD
					           , CAPTURE_DATE_MONTH_017_FORMAT
					           , CAPTURE_DATE_MONTH_017_LENGTH
					           , CAPTURE_DATE_MONTH_017_ENCODING
					           , CAPTURE_DATE_MONTH_017_DATATYPE
					           , CAPTURE_DATE_MONTH_017_SOURCE
					           , CAPTURE_DATE_MONTH_017_DIRECTION
					           , CAPTURE_DATE_MONTH_017_EXISTENCE
					           , CAPTURE_DATE_MONTH_017_CHANGE
					           , CAPTURE_DATE_MONTH_017_VALUE
					   	      );


	DataElementField captureDateDayField 
	
		= new DataElementField ( CAPTURE_DATE_DAY_017_ID
					           , CAPTURE_DATE_DAY_017_FIELD
					           , CAPTURE_DATE_DAY_017_SUBFIELD
					           , CAPTURE_DATE_DAY_017_FORMAT
					           , CAPTURE_DATE_DAY_017_LENGTH
					           , CAPTURE_DATE_DAY_017_ENCODING
					           , CAPTURE_DATE_DAY_017_DATATYPE
					           , CAPTURE_DATE_DAY_017_SOURCE
					           , CAPTURE_DATE_DAY_017_DIRECTION
					           , CAPTURE_DATE_DAY_017_EXISTENCE
					           , CAPTURE_DATE_DAY_017_CHANGE
					           , CAPTURE_DATE_DAY_017_VALUE
					   	      );
		
	public DE017Impl createDE017() {
		
		int id = 17000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(captureDateMonthField);
		storage.add(captureDateDayField);
		
		DE017Impl de017 = new DE017Impl(id, storage);
		
		return de017;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE017 createDE017 = new CreateDE017(); 
		
		DE017Impl de017	= createDE017.createDE017(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de017, fieldList,codeList );
	
	}
}
