package com.system.message.element.load;

import static com.system.message.element.DE018.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE018Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE018  {

	DataElementField merchantTypeField 
	
		= new DataElementField ( MERCHANT_TYPE_018_ID
					           , MERCHANT_TYPE_018_FIELD
					           , MERCHANT_TYPE_018_SUBFIELD
					           , MERCHANT_TYPE_018_FORMAT
					           , MERCHANT_TYPE_018_LENGTH
					           , MERCHANT_TYPE_018_ENCODING
					           , MERCHANT_TYPE_018_DATATYPE
					           , MERCHANT_TYPE_018_SOURCE
					           , MERCHANT_TYPE_018_DIRECTION
					           , MERCHANT_TYPE_018_EXISTENCE
					           , MERCHANT_TYPE_018_CHANGE
					           , MERCHANT_TYPE_018_VALUE
					   	      );
	
	public DE018Impl createDE018() {
		
		int id = 18000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(merchantTypeField);
		
		DE018Impl de018 = new DE018Impl(id, storage);
		
		return de018;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE018 createDE018 = new CreateDE018(); 
		
		DE018Impl de018	= createDE018.createDE018(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de018, fieldList,codeList );
	
	}
}
