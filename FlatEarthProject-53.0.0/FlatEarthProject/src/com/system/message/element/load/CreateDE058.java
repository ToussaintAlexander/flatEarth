package com.system.message.element.load;

import static com.system.message.element.DE058.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE058Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE058  {

	DataElementField unassignedDataElementField 
	
		= new DataElementField ( UNASSIGNED_DATA_ELEMENT_058_ID
					           , UNASSIGNED_DATA_ELEMENT_058_FIELD
					           , UNASSIGNED_DATA_ELEMENT_058_SUBFIELD
					           , UNASSIGNED_DATA_ELEMENT_058_FORMAT
					           , UNASSIGNED_DATA_ELEMENT_058_LENGTH
					           , UNASSIGNED_DATA_ELEMENT_058_ENCODING
					           , UNASSIGNED_DATA_ELEMENT_058_DATATYPE
					           , UNASSIGNED_DATA_ELEMENT_058_SOURCE
					           , UNASSIGNED_DATA_ELEMENT_058_DIRECTION
					           , UNASSIGNED_DATA_ELEMENT_058_EXISTENCE
					           , UNASSIGNED_DATA_ELEMENT_058_CHANGE
					           , UNASSIGNED_DATA_ELEMENT_058_VALUE
					   	      );
	
	public DE058Impl createDE058() {
		
		int id = 58000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(unassignedDataElementField);
		
		DE058Impl de058 = new DE058Impl(id, storage);
		
		return de058;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE058 createDE058 = new CreateDE058(); 
		
		DE058Impl de058	= createDE058.createDE058(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de058, fieldList,codeList );
	
	}
}
