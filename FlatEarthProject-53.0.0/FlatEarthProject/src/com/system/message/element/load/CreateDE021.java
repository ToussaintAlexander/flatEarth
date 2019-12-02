package com.system.message.element.load;

import static com.system.message.element.DE021.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE021Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE021  {

	DataElementField forwardInstitutionCountryCodeField 
	
		= new DataElementField ( FORWARDING_INSTITUTION_COUNTRY_CODE_021_ID
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_FIELD
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_SUBFIELD
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_FORMAT
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_LENGTH
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_ENCODING
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_DATATYPE
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_SOURCE
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_DIRECTION
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_EXISTENCE
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_CHANGE
					           , FORWARDING_INSTITUTION_COUNTRY_CODE_021_VALUE
					   	      );
	
	public DE021Impl createDE021() {
		
		int id = 21000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(forwardInstitutionCountryCodeField);
		
		DE021Impl de021 = new DE021Impl(id, storage);
		
		return de021;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE021 createDE021 = new CreateDE021(); 
		
		DE021Impl de021	= createDE021.createDE021(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de021, fieldList,codeList );
	
	}
}
