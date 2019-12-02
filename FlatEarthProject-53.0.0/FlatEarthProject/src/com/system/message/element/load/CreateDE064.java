package com.system.message.element.load;

import static com.system.message.element.DE064.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE064Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE064  {

	DataElementField messageAuthenticationCodeField 
	
		= new DataElementField ( MESSAGE_AUTHENTICATION_CODE_064_ID
					           , MESSAGE_AUTHENTICATION_CODE_064_FIELD
					           , MESSAGE_AUTHENTICATION_CODE_064_SUBFIELD
					           , MESSAGE_AUTHENTICATION_CODE_064_FORMAT
					           , MESSAGE_AUTHENTICATION_CODE_064_LENGTH
					           , MESSAGE_AUTHENTICATION_CODE_064_ENCODING
					           , MESSAGE_AUTHENTICATION_CODE_064_DATATYPE
					           , MESSAGE_AUTHENTICATION_CODE_064_SOURCE
					           , MESSAGE_AUTHENTICATION_CODE_064_DIRECTION
					           , MESSAGE_AUTHENTICATION_CODE_064_EXISTENCE
					           , MESSAGE_AUTHENTICATION_CODE_064_CHANGE
					           , MESSAGE_AUTHENTICATION_CODE_064_VALUE
					   	      );
	
	public DE064Impl createDE064() {
		
		int id = 64000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(messageAuthenticationCodeField);
		
		DE064Impl de064 = new DE064Impl(id, storage);
		
		return de064;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE064 createDE064 = new CreateDE064(); 
		
		DE064Impl de064	= createDE064.createDE064(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de064, fieldList,codeList );
	
	}
}
