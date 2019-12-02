package com.system.message.element.load;

import static com.system.message.element.DE019.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE019Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE019  {

	DataElementField acquiringInstitutionCountryCodeField 
	
		= new DataElementField ( ACQUIRING_INSTITUTION_COUNTRY_CODE_019_ID
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_FIELD
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_SUBFIELD
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_FORMAT
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_LENGTH
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_ENCODING
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_DATATYPE
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_SOURCE
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_DIRECTION
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_EXISTENCE
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_CHANGE
					           , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_VALUE
					   	      );
	
	public DE019Impl createDE019() {
		
		int id = 19000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(acquiringInstitutionCountryCodeField);
		
		DE019Impl de019 = new DE019Impl(id, storage);
		
		return de019;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE019 createDE019 = new CreateDE019(); 
		
		DE019Impl de019	= createDE019.createDE019(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de019, fieldList,codeList );
	
	}
}
