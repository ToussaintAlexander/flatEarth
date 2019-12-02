package com.system.message.element.load;

import static com.system.message.element.DE026.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE026Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;


public class CreateDE026  {

	DataElementField pointOfServicePinCaptureCodeField 
	
		= new DataElementField ( POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_ID
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_FIELD
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_SUBFIELD
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_FORMAT
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_LENGTH
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_ENCODING
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_DATATYPE
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_SOURCE
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_DIRECTION
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_EXISTENCE
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_CHANGE
					           , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_VALUE
					   	      );
	
	public DE026Impl createDE026() {
		
		int id = 26000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(pointOfServicePinCaptureCodeField);
		
		DE026Impl de026 = new DE026Impl(id, storage);
		
		return de026;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE026 createDE026 = new CreateDE026(); 
		
		DE026Impl de026	= createDE026.createDE026(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de026, fieldList,codeList );
	
	}
}
