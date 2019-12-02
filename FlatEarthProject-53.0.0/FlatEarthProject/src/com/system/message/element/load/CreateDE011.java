package com.system.message.element.load;

import static com.system.message.element.DE011.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE011Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE011  {

	DataElementField systemTraceAuditNumberField 
	
		= new DataElementField ( 
				                 SYSTEM_TRACE_AUDIT_NUMBER_011_ID
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_FIELD
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_SUBFIELD
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_FORMAT
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_LENGTH
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_ENCODING
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_DATATYPE
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_SOURCE
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_DIRECTION
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_EXISTENCE
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_CHANGE
					           , SYSTEM_TRACE_AUDIT_NUMBER_011_VALUE
					   	      );
	
	public DE011Impl createDE011() {
		
		int id = 11000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(systemTraceAuditNumberField);
		
		DE011Impl de011 = new DE011Impl(id, storage);
		
		return de011;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE011 createDE011 = new CreateDE011(); 
		
		DE011Impl de011	= createDE011.createDE011(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de011, fieldList,codeList );
	
	}
}
