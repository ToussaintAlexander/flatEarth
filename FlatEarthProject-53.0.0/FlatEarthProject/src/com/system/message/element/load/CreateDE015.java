package com.system.message.element.load;

import static com.system.message.element.DE015.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE015Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE015  {

	DataElementField settlementDateMonthField 
	
		= new DataElementField ( 
								 SETTLEMENT_DATE_MONTH_015_ID
					           , SETTLEMENT_DATE_MONTH_015_FIELD
					           , SETTLEMENT_DATE_MONTH_015_SUBFIELD
					           , SETTLEMENT_DATE_MONTH_015_FORMAT
					           , SETTLEMENT_DATE_MONTH_015_LENGTH
					           , SETTLEMENT_DATE_MONTH_015_ENCODING
					           , SETTLEMENT_DATE_MONTH_015_DATATYPE
					           , SETTLEMENT_DATE_MONTH_015_SOURCE
					           , SETTLEMENT_DATE_MONTH_015_DIRECTION
					           , SETTLEMENT_DATE_MONTH_015_EXISTENCE
					           , SETTLEMENT_DATE_MONTH_015_CHANGE
					           , SETTLEMENT_DATE_MONTH_015_VALUE
					   	      );


	DataElementField settlementDateDayField 
	
		= new DataElementField ( 
								 SETTLEMENT_DATE_DAY_015_ID
					           , SETTLEMENT_DATE_DAY_015_FIELD
					           , SETTLEMENT_DATE_DAY_015_SUBFIELD
					           , SETTLEMENT_DATE_DAY_015_FORMAT
					           , SETTLEMENT_DATE_DAY_015_LENGTH
					           , SETTLEMENT_DATE_DAY_015_ENCODING
					           , SETTLEMENT_DATE_DAY_015_DATATYPE
					           , SETTLEMENT_DATE_DAY_015_SOURCE
					           , SETTLEMENT_DATE_DAY_015_DIRECTION
					           , SETTLEMENT_DATE_DAY_015_EXISTENCE
					           , SETTLEMENT_DATE_DAY_015_CHANGE
					           , SETTLEMENT_DATE_DAY_015_VALUE
					   	      );
		
	
	public DE015Impl createDE015() {
		
		int id = 15000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(settlementDateMonthField);
		storage.add(settlementDateDayField);
		
		DE015Impl de015 = new DE015Impl(id, storage);
		
		return de015;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE015 createDE015 = new CreateDE015(); 
		
		DE015Impl de015	= createDE015.createDE015(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de015, fieldList,codeList );
	
	}
}
