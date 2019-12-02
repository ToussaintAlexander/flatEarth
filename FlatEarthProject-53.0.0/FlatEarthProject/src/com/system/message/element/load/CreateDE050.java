package com.system.message.element.load;

import static com.system.message.element.DE050.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE050Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE050  {

	DataElementField settlementCurrencyCodeField 
	
		= new DataElementField ( SETTLEMENT_CURRENCY_CODE_050_ID
					           , SETTLEMENT_CURRENCY_CODE_050_FIELD
					           , SETTLEMENT_CURRENCY_CODE_050_SUBFIELD
					           , SETTLEMENT_CURRENCY_CODE_050_FORMAT
					           , SETTLEMENT_CURRENCY_CODE_050_LENGTH
					           , SETTLEMENT_CURRENCY_CODE_050_ENCODING
					           , SETTLEMENT_CURRENCY_CODE_050_DATATYPE
					           , SETTLEMENT_CURRENCY_CODE_050_SOURCE
					           , SETTLEMENT_CURRENCY_CODE_050_DIRECTION
					           , SETTLEMENT_CURRENCY_CODE_050_EXISTENCE
					           , SETTLEMENT_CURRENCY_CODE_050_CHANGE
					           , SETTLEMENT_CURRENCY_CODE_050_VALUE
					   	      );
	
	public DE050Impl createDE050() {
		
		int id = 50000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(settlementCurrencyCodeField);
		
		DE050Impl de050 = new DE050Impl(id, storage);
		
		return de050;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE050 createDE050 = new CreateDE050(); 
		
		DE050Impl de050	= createDE050.createDE050(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de050, fieldList,codeList );
	
	}
}
