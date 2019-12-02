package com.system.message.element.load;

import static com.system.message.element.DE041.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE041Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE041  {

	DataElementField cardAcceptorTerminalIdentificationField 
	
		= new DataElementField ( CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_ID
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_FIELD
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_SUBFIELD
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_FORMAT
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_LENGTH
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_ENCODING
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_DATATYPE
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_SOURCE
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_DIRECTION
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_EXISTENCE
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_CHANGE
					           , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_VALUE
					   	      );
	
	public DE041Impl createDE041() {
		
		int id = 41000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(cardAcceptorTerminalIdentificationField);
		
		DE041Impl de041 = new DE041Impl(id, storage);
		
		return de041;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE041 createDE041 = new CreateDE041(); 
		
		DE041Impl de041	= createDE041.createDE041(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de041, fieldList,codeList );
	
	}
}
