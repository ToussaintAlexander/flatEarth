package com.system.message.element.load;

import static com.system.message.element.DE023.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE023Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;


public class CreateDE023  {

	DataElementField applicationPanSequenceNumberField 
	
		= new DataElementField ( APPLICATION_PAN_SEQUENCE_NUMBER_023_ID
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_FIELD
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_SUBFIELD
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_FORMAT
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_LENGTH
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_ENCODING
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_DATATYPE
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_SOURCE
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_DIRECTION
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_EXISTENCE
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_CHANGE
					           , APPLICATION_PAN_SEQUENCE_NUMBER_023_VALUE
					   	      );
	
	public DE023Impl createDE023() {
		
		int id = 0;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(applicationPanSequenceNumberField);
		
		DE023Impl de023 = new DE023Impl(id, storage);
		
		return de023;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE023 createDE023 = new CreateDE023(); 
		
		DE023Impl de023	= createDE023.createDE023(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de023, fieldList,codeList );
	
	}
}
