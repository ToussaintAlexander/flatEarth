package com.system.message.element.load;

import static com.system.message.element.DE000.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE000Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE000  {

	DataElementField bitmapField 
	
		= new DataElementField ( UNASSIGNED_DATA_ELEMENT_000_ID
					           , UNASSIGNED_DATA_ELEMENT_000_FIELD
					           , UNASSIGNED_DATA_ELEMENT_000_SUBFIELD
					           , UNASSIGNED_DATA_ELEMENT_000_FORMAT
					           , UNASSIGNED_DATA_ELEMENT_000_LENGTH
					           , UNASSIGNED_DATA_ELEMENT_000_ENCODING
					           , UNASSIGNED_DATA_ELEMENT_000_DATATYPE
					           , UNASSIGNED_DATA_ELEMENT_000_SOURCE
					           , UNASSIGNED_DATA_ELEMENT_000_DIRECTION
					           , UNASSIGNED_DATA_ELEMENT_000_EXISTENCE
					           , UNASSIGNED_DATA_ELEMENT_000_CHANGE
					           , UNASSIGNED_DATA_ELEMENT_000_VALUE
					   	      );
	
	public DE000Impl createDE000() {
		
		int id = 0;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(bitmapField);
		
		DE000Impl de000 = new DE000Impl(id, storage);
		
		return de000;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE000 createDE000 = new CreateDE000(); 
		
		DE000Impl de000	= createDE000.createDE000(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de000, fieldList,codeList );
	
	}
}
