package com.system.message.element.load;

import static com.system.message.element.DE024.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE024Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE024  {

	DataElementField functionCodeField 
	
		= new DataElementField ( FUNCTION_CODE_024_ID
					           , FUNCTION_CODE_024_FIELD
					           , FUNCTION_CODE_024_SUBFIELD
					           , FUNCTION_CODE_024_FORMAT
					           , FUNCTION_CODE_024_LENGTH
					           , FUNCTION_CODE_024_ENCODING
					           , FUNCTION_CODE_024_DATATYPE
					           , FUNCTION_CODE_024_SOURCE
					           , FUNCTION_CODE_024_DIRECTION
					           , FUNCTION_CODE_024_EXISTENCE
					           , FUNCTION_CODE_024_CHANGE
					           , FUNCTION_CODE_024_VALUE
					   	      );
	
	public DE024Impl createDE024() {
		
		int id = 24000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(functionCodeField);
		
		DE024Impl de024 = new DE024Impl(id, storage);
		
		return de024;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE024 createDE024 = new CreateDE024(); 
		
		DE024Impl de024	= createDE024.createDE024(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de024, fieldList,codeList );
	
	}
}
