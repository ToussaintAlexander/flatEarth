package com.system.message.element.load;

import static com.system.message.element.DE033.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE033Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE033  {

	DataElementField forwardingInstitutionIdentificationCodeField 
	
		= new DataElementField ( FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_ID
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_FIELD
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_SUBFIELD
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_FORMAT
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_LENGTH
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_ENCODING
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_DATATYPE
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_SOURCE
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_DIRECTION
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_EXISTENCE
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_CHANGE
					           , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_VALUE
					   	      );
	
	public DE033Impl createDE033() {
		
		int id = 33000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(forwardingInstitutionIdentificationCodeField);
		
		DE033Impl de033 = new DE033Impl(id, storage);
		
		return de033;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE033 createDE033 = new CreateDE033(); 
		
		DE033Impl de033	= createDE033.createDE033(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de033, fieldList,codeList );
	
	}
}
