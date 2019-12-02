package com.system.message.element.load;

import static com.system.message.element.DE057.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE057Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE057  {

	DataElementField unassignedDataElementField 
	
		= new DataElementField ( UNASSIGNED_DATA_ELEMENT_057_ID
					           , UNASSIGNED_DATA_ELEMENT_057_FIELD
					           , UNASSIGNED_DATA_ELEMENT_057_SUBFIELD
					           , UNASSIGNED_DATA_ELEMENT_057_FORMAT
					           , UNASSIGNED_DATA_ELEMENT_057_LENGTH
					           , UNASSIGNED_DATA_ELEMENT_057_ENCODING
					           , UNASSIGNED_DATA_ELEMENT_057_DATATYPE
					           , UNASSIGNED_DATA_ELEMENT_057_SOURCE
					           , UNASSIGNED_DATA_ELEMENT_057_DIRECTION
					           , UNASSIGNED_DATA_ELEMENT_057_EXISTENCE
					           , UNASSIGNED_DATA_ELEMENT_057_CHANGE
					           , UNASSIGNED_DATA_ELEMENT_057_VALUE
					   	      );
	
	public DE057Impl createDE057() {
		
		int id = 57000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(unassignedDataElementField);
		
		DE057Impl de057 = new DE057Impl(id, storage);
		
		return de057;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE057 createDE057 = new CreateDE057(); 
		
		DE057Impl de057	= createDE057.createDE057(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de057, fieldList,codeList );
	
	}
}
