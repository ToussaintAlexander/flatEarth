package com.system.message.element.load;

import static com.system.message.element.DE052.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE052Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE052  {

	DataElementField personalIdentificationNumberField 
	
		= new DataElementField ( PERSONAL_IDENTIFICATION_NUMBER_052_ID
					           , PERSONAL_IDENTIFICATION_NUMBER_052_FIELD
					           , PERSONAL_IDENTIFICATION_NUMBER_052_SUBFIELD
					           , PERSONAL_IDENTIFICATION_NUMBER_052_FORMAT
					           , PERSONAL_IDENTIFICATION_NUMBER_052_LENGTH
					           , PERSONAL_IDENTIFICATION_NUMBER_052_ENCODING
					           , PERSONAL_IDENTIFICATION_NUMBER_052_DATATYPE
					           , PERSONAL_IDENTIFICATION_NUMBER_052_SOURCE
					           , PERSONAL_IDENTIFICATION_NUMBER_052_DIRECTION
					           , PERSONAL_IDENTIFICATION_NUMBER_052_EXISTENCE
					           , PERSONAL_IDENTIFICATION_NUMBER_052_CHANGE
					           , PERSONAL_IDENTIFICATION_NUMBER_052_VALUE
					   	      );
	
	public DE052Impl createDE052() {
		
		int id = 52000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(personalIdentificationNumberField);
		
		DE052Impl de052 = new DE052Impl(id, storage);
		
		return de052;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE052 createDE052 = new CreateDE052(); 
		
		DE052Impl de052	= createDE052.createDE052(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de052, fieldList,codeList );
	
	}
}
