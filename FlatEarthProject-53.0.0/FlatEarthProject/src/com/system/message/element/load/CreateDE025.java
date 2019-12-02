package com.system.message.element.load;

import static com.system.message.element.DE025.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE025Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;


public class CreateDE025  {

	DataElementField pointOfServiceConditionCodeField 
	
		= new DataElementField ( POINT_OF_SERVICE_CONDITION_CODE_025_ID
					           , POINT_OF_SERVICE_CONDITION_CODE_025_FIELD
					           , POINT_OF_SERVICE_CONDITION_CODE_025_SUBFIELD
					           , POINT_OF_SERVICE_CONDITION_CODE_025_FORMAT
					           , POINT_OF_SERVICE_CONDITION_CODE_025_LENGTH
					           , POINT_OF_SERVICE_CONDITION_CODE_025_ENCODING
					           , POINT_OF_SERVICE_CONDITION_CODE_025_DATATYPE
					           , POINT_OF_SERVICE_CONDITION_CODE_025_SOURCE
					           , POINT_OF_SERVICE_CONDITION_CODE_025_DIRECTION
					           , POINT_OF_SERVICE_CONDITION_CODE_025_EXISTENCE
					           , POINT_OF_SERVICE_CONDITION_CODE_025_CHANGE
					           , POINT_OF_SERVICE_CONDITION_CODE_025_VALUE
					   	      );
	
	public DE025Impl createDE025() {
		
		int id = 25000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(pointOfServiceConditionCodeField);
		
		DE025Impl de025 = new DE025Impl(id, storage);
		
		return de025;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE025 createDE025 = new CreateDE025(); 
		
		DE025Impl de025	= createDE025.createDE025(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de025, fieldList,codeList );
	
	}
}
