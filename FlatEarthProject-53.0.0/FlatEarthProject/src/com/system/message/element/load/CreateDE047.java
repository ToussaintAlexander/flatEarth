package com.system.message.element.load;

import static com.system.message.element.DE047.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE047Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE047  {

	DataElementField additionalDataField 
	
		= new DataElementField ( ADDITIONAL_DATA_047_ID
					           , ADDITIONAL_DATA_047_FIELD
					           , ADDITIONAL_DATA_047_SUBFIELD
					           , ADDITIONAL_DATA_047_FORMAT
					           , ADDITIONAL_DATA_047_LENGTH
					           , ADDITIONAL_DATA_047_ENCODING
					           , ADDITIONAL_DATA_047_DATATYPE
					           , ADDITIONAL_DATA_047_SOURCE
					           , ADDITIONAL_DATA_047_DIRECTION
					           , ADDITIONAL_DATA_047_EXISTENCE
					           , ADDITIONAL_DATA_047_CHANGE
					           , ADDITIONAL_DATA_047_VALUE
					   	      );
	
	public DE047Impl createDE047() {
		
		int id = 47000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(additionalDataField);
		
		DE047Impl de047 = new DE047Impl(id, storage);
		
		return de047;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE047 createDE047 = new CreateDE047(); 
		
		DE047Impl de047	= createDE047.createDE047(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de047, fieldList,codeList );
	
	}
}
