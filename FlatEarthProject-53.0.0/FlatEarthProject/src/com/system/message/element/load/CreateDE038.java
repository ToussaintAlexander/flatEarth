package com.system.message.element.load;

import static com.system.message.element.DE038.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE038Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE038  {

	DataElementField authorizationIdentificationResponseField 
	
		= new DataElementField ( AUTHORIZATION_IDENTIFICATION_RESPONSE_038_ID
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_FIELD
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_SUBFIELD
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_FORMAT
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_LENGTH
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_ENCODING
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_DATATYPE
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_SOURCE
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_DIRECTION
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_EXISTENCE
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_CHANGE
					           , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_VALUE
					   	      );
	
	public DE038Impl createDE038() {
		
		int id = 38000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(authorizationIdentificationResponseField);
		
		DE038Impl de038 = new DE038Impl(id, storage);
		
		return de038;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE038 createDE038 = new CreateDE038(); 
		
		DE038Impl de038	= createDE038.createDE038(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de038, fieldList,codeList );
	
	}
}
