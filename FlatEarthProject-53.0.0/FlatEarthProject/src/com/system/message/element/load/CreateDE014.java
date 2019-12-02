package com.system.message.element.load;

import static com.system.message.element.DE014.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE014Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE014  {

	DataElementField expirationDateYearField 
	
		= new DataElementField ( 
							     EXPIRATION_DATE_YEAR_014_ID
					           , EXPIRATION_DATE_YEAR_014_FIELD
					           , EXPIRATION_DATE_YEAR_014_SUBFIELD
					           , EXPIRATION_DATE_YEAR_014_FORMAT
					           , EXPIRATION_DATE_YEAR_014_LENGTH
					           , EXPIRATION_DATE_YEAR_014_ENCODING
					           , EXPIRATION_DATE_YEAR_014_DATATYPE
					           , EXPIRATION_DATE_YEAR_014_SOURCE
					           , EXPIRATION_DATE_YEAR_014_DIRECTION
					           , EXPIRATION_DATE_YEAR_014_EXISTENCE
					           , EXPIRATION_DATE_YEAR_014_CHANGE
					           , EXPIRATION_DATE_YEAR_014_VALUE
					   	      );


	DataElementField expirationDateMonthField 
	
		= new DataElementField ( 
								 EXPIRATION_DATE_MONTH_014_ID
					           , EXPIRATION_DATE_MONTH_014_FIELD
					           , EXPIRATION_DATE_MONTH_014_SUBFIELD
					           , EXPIRATION_DATE_MONTH_014_FORMAT
					           , EXPIRATION_DATE_MONTH_014_LENGTH
					           , EXPIRATION_DATE_MONTH_014_ENCODING
					           , EXPIRATION_DATE_MONTH_014_DATATYPE
					           , EXPIRATION_DATE_MONTH_014_SOURCE
					           , EXPIRATION_DATE_MONTH_014_DIRECTION
					           , EXPIRATION_DATE_MONTH_014_EXISTENCE
					           , EXPIRATION_DATE_MONTH_014_CHANGE
					           , EXPIRATION_DATE_MONTH_014_VALUE
					   	      );	
	
	public DE014Impl createDE014() {
		
		int id = 14000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(expirationDateYearField);
		storage.add(expirationDateMonthField);
		
		DE014Impl de014 = new DE014Impl(id, storage);
		
		return de014;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE014 createDE014 = new CreateDE014(); 
		
		DE014Impl de014	= createDE014.createDE014(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de014, fieldList,codeList );
	
	}
}
