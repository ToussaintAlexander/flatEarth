package com.system.message.element.load;

import static com.system.message.element.DE020.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE020Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE020  {

	DataElementField countryCodePanExtendedField 
	
		= new DataElementField ( COUNTRY_CODE_PAN_EXTENDED_020_ID
					           , COUNTRY_CODE_PAN_EXTENDED_020_FIELD
					           , COUNTRY_CODE_PAN_EXTENDED_020_SUBFIELD
					           , COUNTRY_CODE_PAN_EXTENDED_020_FORMAT
					           , COUNTRY_CODE_PAN_EXTENDED_020_LENGTH
					           , COUNTRY_CODE_PAN_EXTENDED_020_ENCODING
					           , COUNTRY_CODE_PAN_EXTENDED_020_DATATYPE
					           , COUNTRY_CODE_PAN_EXTENDED_020_SOURCE
					           , COUNTRY_CODE_PAN_EXTENDED_020_DIRECTION
					           , COUNTRY_CODE_PAN_EXTENDED_020_EXISTENCE
					           , COUNTRY_CODE_PAN_EXTENDED_020_CHANGE
					           , COUNTRY_CODE_PAN_EXTENDED_020_VALUE
					   	      );
	
	public DE020Impl createDE020() {
		
		int id = 20000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(countryCodePanExtendedField);
		
		DE020Impl de020 = new DE020Impl(id, storage);
		
		return de020;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE020 createDE020 = new CreateDE020(); 
		
		DE020Impl de020	= createDE020.createDE020(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de020, fieldList,codeList );
	
	}
}
