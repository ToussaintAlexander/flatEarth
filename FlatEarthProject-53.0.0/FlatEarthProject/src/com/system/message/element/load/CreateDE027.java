package com.system.message.element.load;

import static com.system.message.element.DE027.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE027Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE027  {

	DataElementField authorizingIdentificationResponseLengthField 
	
		= new DataElementField ( AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_ID
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_FIELD
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_SUBFIELD
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_FORMAT
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_LENGTH
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_ENCODING
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_DATATYPE
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_SOURCE
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_DIRECTION
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_EXISTENCE
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_CHANGE
					           , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_VALUE
					   	      );
	
	public DE027Impl createDE027() {
		
		int id = 27000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(authorizingIdentificationResponseLengthField);
		
		DE027Impl de027 = new DE027Impl(id, storage);
		
		return de027;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE027 createDE027 = new CreateDE027(); 
		
		DE027Impl de027	= createDE027.createDE027(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de027, fieldList,codeList );
	
	}
}
