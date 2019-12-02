package com.system.message.element.load;

import static com.system.message.element.DE032.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE032Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE032  {

	DataElementField acquiringInstitutionIdentificationCodeField 
	
		= new DataElementField ( ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_ID
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_FIELD
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_SUBFIELD
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_FORMAT
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_LENGTH
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_ENCODING
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_DATATYPE
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_SOURCE
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_DIRECTION
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_EXISTENCE
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_CHANGE
					           , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_VALUE
					   	      );
	
	public DE032Impl createDE032() {
		
		int id = 32000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(acquiringInstitutionIdentificationCodeField);
		
		DE032Impl de032 = new DE032Impl(id, storage);
		
		return de032;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE032 createDE032 = new CreateDE032(); 
		
		DE032Impl de032	= createDE032.createDE032(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de032, fieldList,codeList );
	
	}
}
