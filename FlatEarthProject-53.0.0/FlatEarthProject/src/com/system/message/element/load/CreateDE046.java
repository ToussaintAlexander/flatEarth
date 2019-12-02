package com.system.message.element.load;

import static com.system.message.element.DE046.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE046Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE046  {

	DataElementField additionalDataField 
	
		= new DataElementField ( ADDITIONAL_DATA_046_ID
					           , ADDITIONAL_DATA_046_FIELD
					           , ADDITIONAL_DATA_046_SUBFIELD
					           , ADDITIONAL_DATA_046_FORMAT
					           , ADDITIONAL_DATA_046_LENGTH
					           , ADDITIONAL_DATA_046_ENCODING
					           , ADDITIONAL_DATA_046_DATATYPE
					           , ADDITIONAL_DATA_046_SOURCE
					           , ADDITIONAL_DATA_046_DIRECTION
					           , ADDITIONAL_DATA_046_EXISTENCE
					           , ADDITIONAL_DATA_046_CHANGE
					           , ADDITIONAL_DATA_046_VALUE
					   	      );
	
	public DE046Impl createDE046() {
		
		int id = 46000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(additionalDataField);
		
		DE046Impl de046 = new DE046Impl(id, storage);
		
		return de046;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE046 createDE046 = new CreateDE046(); 
		
		DE046Impl de046	= createDE046.createDE046(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de046, fieldList,codeList );
	
	}
}
