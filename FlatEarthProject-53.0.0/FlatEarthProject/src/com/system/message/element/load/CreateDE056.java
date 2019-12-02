package com.system.message.element.load;

import static com.system.message.element.DE056.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE056Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE056  {

	DataElementField unassignedDataElementField 
	
		= new DataElementField ( UNASSIGNED_DATA_ELEMENT_056_ID
					           , UNASSIGNED_DATA_ELEMENT_056_FIELD
					           , UNASSIGNED_DATA_ELEMENT_056_SUBFIELD
					           , UNASSIGNED_DATA_ELEMENT_056_FORMAT
					           , UNASSIGNED_DATA_ELEMENT_056_LENGTH
					           , UNASSIGNED_DATA_ELEMENT_056_ENCODING
					           , UNASSIGNED_DATA_ELEMENT_056_DATATYPE
					           , UNASSIGNED_DATA_ELEMENT_056_SOURCE
					           , UNASSIGNED_DATA_ELEMENT_056_DIRECTION
					           , UNASSIGNED_DATA_ELEMENT_056_EXISTENCE
					           , UNASSIGNED_DATA_ELEMENT_056_CHANGE
					           , UNASSIGNED_DATA_ELEMENT_056_VALUE
					   	      );
	
	public DE056Impl createDE056() {
		
		int id = 56000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(unassignedDataElementField);
		
		DE056Impl de056 = new DE056Impl(id, storage);
		
		return de056;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE056 createDE056 = new CreateDE056(); 
		
		DE056Impl de056	= createDE056.createDE056(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de056, fieldList,codeList );
	
	}
}
