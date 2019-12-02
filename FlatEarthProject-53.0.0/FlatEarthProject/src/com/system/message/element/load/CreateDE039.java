package com.system.message.element.load;

import static com.system.message.element.DE039.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE039Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE039  {

	DataElementField responseCodeField 
	
		= new DataElementField ( RESPONSE_CODE_039_ID
					           , RESPONSE_CODE_039_FIELD
					           , RESPONSE_CODE_039_SUBFIELD
					           , RESPONSE_CODE_039_FORMAT
					           , RESPONSE_CODE_039_LENGTH
					           , RESPONSE_CODE_039_ENCODING
					           , RESPONSE_CODE_039_DATATYPE
					           , RESPONSE_CODE_039_SOURCE
					           , RESPONSE_CODE_039_DIRECTION
					           , RESPONSE_CODE_039_EXISTENCE
					           , RESPONSE_CODE_039_CHANGE
					           , RESPONSE_CODE_039_VALUE
					   	      );
	
	public DE039Impl createDE039() {
		
		int id = 39000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(responseCodeField);
		
		DE039Impl de039 = new DE039Impl(id, storage);
		
		return de039;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE039 createDE039 = new CreateDE039(); 
		
		DE039Impl de039	= createDE039.createDE039(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de039, fieldList,codeList );
	
	}
}
