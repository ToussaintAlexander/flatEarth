package com.system.message.element.load;

import static com.system.message.element.DE037.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE037Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE037  {

	DataElementField transmissionDateYearField 
	
		= new DataElementField ( TRANSMISSION_DATE_YEAR_037_ID
					           , TRANSMISSION_DATE_YEAR_037_FIELD
					           , TRANSMISSION_DATE_YEAR_037_SUBFIELD
					           , TRANSMISSION_DATE_YEAR_037_FORMAT
					           , TRANSMISSION_DATE_YEAR_037_LENGTH
					           , TRANSMISSION_DATE_YEAR_037_ENCODING
					           , TRANSMISSION_DATE_YEAR_037_DATATYPE
					           , TRANSMISSION_DATE_YEAR_037_SOURCE
					           , TRANSMISSION_DATE_YEAR_037_DIRECTION
					           , TRANSMISSION_DATE_YEAR_037_EXISTENCE
					           , TRANSMISSION_DATE_YEAR_037_CHANGE
					           , TRANSMISSION_DATE_YEAR_037_VALUE
					   	      );


	DataElementField julianDayMonthField 
	
		= new DataElementField ( JULIAN_DAY_MONTH_037_ID
					           , JULIAN_DAY_MONTH_037_FIELD
					           , JULIAN_DAY_MONTH_037_SUBFIELD
					           , JULIAN_DAY_MONTH_037_FORMAT
					           , JULIAN_DAY_MONTH_037_LENGTH
					           , JULIAN_DAY_MONTH_037_ENCODING
					           , JULIAN_DAY_MONTH_037_DATATYPE
					           , JULIAN_DAY_MONTH_037_SOURCE
					           , JULIAN_DAY_MONTH_037_DIRECTION
					           , JULIAN_DAY_MONTH_037_EXISTENCE
					           , JULIAN_DAY_MONTH_037_CHANGE
					           , JULIAN_DAY_MONTH_037_VALUE
					   	      );
	

	DataElementField transmissionTimeHourField 
	
		= new DataElementField ( TRANSMISSION_TIME_HOUR_037_ID
					           , TRANSMISSION_TIME_HOUR_037_FIELD
					           , TRANSMISSION_TIME_HOUR_037_SUBFIELD
					           , TRANSMISSION_TIME_HOUR_037_FORMAT
					           , TRANSMISSION_TIME_HOUR_037_LENGTH
					           , TRANSMISSION_TIME_HOUR_037_ENCODING
					           , TRANSMISSION_TIME_HOUR_037_DATATYPE
					           , TRANSMISSION_TIME_HOUR_037_SOURCE
					           , TRANSMISSION_TIME_HOUR_037_DIRECTION
					           , TRANSMISSION_TIME_HOUR_037_EXISTENCE
					           , TRANSMISSION_TIME_HOUR_037_CHANGE
					           , TRANSMISSION_TIME_HOUR_037_VALUE
					   	      );
	

	DataElementField systemsTraceAuditNumberField 
	
		= new DataElementField ( SYSTEMS_TRACE_AUDIT_NUMBER_037_ID
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_FIELD
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_SUBFIELD
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_FORMAT
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_LENGTH
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_ENCODING
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_DATATYPE
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_SOURCE
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_DIRECTION
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_EXISTENCE
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_CHANGE
					           , SYSTEMS_TRACE_AUDIT_NUMBER_037_VALUE
					   	      );
		
	
	public DE037Impl createDE037() {
		
		int id = 37000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(transmissionDateYearField);
		storage.add(julianDayMonthField);
		storage.add(transmissionTimeHourField);
		storage.add(systemsTraceAuditNumberField);
		
		DE037Impl de037 = new DE037Impl(id, storage);
		
		return de037;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE037 createDE037 = new CreateDE037(); 
		
		DE037Impl de037	= createDE037.createDE037(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de037, fieldList,codeList );
	
	}
}
