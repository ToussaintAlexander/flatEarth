package com.system.message.element.load;

import static com.system.message.element.DE042.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE042Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE042  {

	DataElementField cardAcceptorIdentificationCodeField 
	
		= new DataElementField ( CARD_ACCEPTOR_IDENTIFICATION_CODE_042_ID
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_FIELD
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_SUBFIELD
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_FORMAT
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_LENGTH
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_ENCODING
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_DATATYPE
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_SOURCE
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_DIRECTION
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_EXISTENCE
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_CHANGE
					           , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_VALUE
					   	      );
	
	public DE042Impl createDE042() {
		
		int id = 42000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(cardAcceptorIdentificationCodeField);
		
		DE042Impl de042 = new DE042Impl(id, storage);
		
		return de042;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE042 createDE042 = new CreateDE042(); 
		
		DE042Impl de042	= createDE042.createDE042(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de042, fieldList,codeList );
	
	}
}
