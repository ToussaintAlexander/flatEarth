package com.system.message.element.load;

import static com.system.message.element.DE048.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE048Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE048  {

	DataElementField additionalDataField 
	
		= new DataElementField ( ADDITIONAL_DATA_048_ID
					           , ADDITIONAL_DATA_048_FIELD
					           , ADDITIONAL_DATA_048_SUBFIELD
					           , ADDITIONAL_DATA_048_FORMAT
					           , ADDITIONAL_DATA_048_LENGTH
					           , ADDITIONAL_DATA_048_ENCODING
					           , ADDITIONAL_DATA_048_DATATYPE
					           , ADDITIONAL_DATA_048_SOURCE
					           , ADDITIONAL_DATA_048_DIRECTION
					           , ADDITIONAL_DATA_048_EXISTENCE
					           , ADDITIONAL_DATA_048_CHANGE
					           , ADDITIONAL_DATA_048_VALUE
					   	      );
	
	public DE048Impl createDE048() {
		
		int id = 48000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(additionalDataField);
		
		DE048Impl de048 = new DE048Impl(id, storage);
		
		return de048;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE048 createDE048 = new CreateDE048(); 
		
		DE048Impl de048	= createDE048.createDE048(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de048, fieldList,codeList );
	
	}
}
