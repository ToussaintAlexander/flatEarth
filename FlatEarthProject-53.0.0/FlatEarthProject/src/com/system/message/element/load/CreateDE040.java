package com.system.message.element.load;

import static com.system.message.element.DE040.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE040Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE040  {

	DataElementField serviceRestrictionCodeField 
	
		= new DataElementField ( SERVICE_RESTRICTION_CODE_040_ID
					           , SERVICE_RESTRICTION_CODE_040_FIELD
					           , SERVICE_RESTRICTION_CODE_040_SUBFIELD
					           , SERVICE_RESTRICTION_CODE_040_FORMAT
					           , SERVICE_RESTRICTION_CODE_040_LENGTH
					           , SERVICE_RESTRICTION_CODE_040_ENCODING
					           , SERVICE_RESTRICTION_CODE_040_DATATYPE
					           , SERVICE_RESTRICTION_CODE_040_SOURCE
					           , SERVICE_RESTRICTION_CODE_040_DIRECTION
					           , SERVICE_RESTRICTION_CODE_040_EXISTENCE
					           , SERVICE_RESTRICTION_CODE_040_CHANGE
					           , SERVICE_RESTRICTION_CODE_040_VALUE
					   	      );
	
	public DE040Impl createDE040() {
		
		int id = 0;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(serviceRestrictionCodeField);
		
		DE040Impl de040 = new DE040Impl(id, storage);
		
		return de040;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE040 createDE040 = new CreateDE040(); 
		
		DE040Impl de040	= createDE040.createDE040(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de040, fieldList,codeList );
	
	}
}
