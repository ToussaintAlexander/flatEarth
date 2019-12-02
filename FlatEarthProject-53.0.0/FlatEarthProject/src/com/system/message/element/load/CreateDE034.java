package com.system.message.element.load;

import static com.system.message.element.DE034.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE034Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE034  {

	DataElementField extendedPrimaryAccountNumberField 
	
		= new DataElementField ( EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_ID
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_FIELD
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_SUBFIELD
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_FORMAT
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_LENGTH
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_ENCODING
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_DATATYPE
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_SOURCE
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_DIRECTION
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_EXISTENCE
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_CHANGE
					           , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_VALUE
					   	      );
	
	public DE034Impl createDE034() {
		
		int id = 34000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(extendedPrimaryAccountNumberField);
		
		DE034Impl de034 = new DE034Impl(id, storage);
		
		return de034;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE034 createDE034 = new CreateDE034(); 
		
		DE034Impl de034	= createDE034.createDE034(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de034, fieldList,codeList );
	
	}
}
