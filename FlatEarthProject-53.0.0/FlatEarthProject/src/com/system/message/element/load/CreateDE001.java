package com.system.message.element.load;

import static com.system.message.element.DE001.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE001  {

	DataElementField bitmapField 
	
		= new DataElementField ( PRIMARY_BITMAP_001_ID
					           , PRIMARY_BITMAP_001_FIELD
					           , PRIMARY_BITMAP_001_SUBFIELD
					           , PRIMARY_BITMAP_001_FORMAT
					           , PRIMARY_BITMAP_001_LENGTH
					           , PRIMARY_BITMAP_001_ENCODING
					           , PRIMARY_BITMAP_001_DATATYPE
					           , PRIMARY_BITMAP_001_SOURCE
					           , PRIMARY_BITMAP_001_DIRECTION
					           , PRIMARY_BITMAP_001_EXISTENCE
					           , PRIMARY_BITMAP_001_CHANGE
//					           , new BitmapUtils().getFullBitMapString()
					           , PRIMARY_BITMAP_001_VALUE
					   	      );
	
	public DE001Impl createDE001() {
		
		int id = 1000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(bitmapField);
		
		DE001Impl de001 = new DE001Impl(id, storage);
		
		return de001;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE001 createDE001 = new CreateDE001(); 
		
		DE001Impl de001	= createDE001.createDE001(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de001, fieldList,codeList );
	
	}
}
