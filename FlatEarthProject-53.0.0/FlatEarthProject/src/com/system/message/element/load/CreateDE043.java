package com.system.message.element.load;

import static com.system.message.element.DE043.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE043Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE043  {

	DataElementField cardAcceptorNameLocationAddressField 
	
		= new DataElementField ( CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_ID
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_FIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_SUBFIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_FORMAT
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_LENGTH
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_ENCODING
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_DATATYPE
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_SOURCE
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_DIRECTION
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_EXISTENCE
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_CHANGE
					           , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_VALUE
					   	      );


	DataElementField cardAcceptorNameLocationCityField 
	
		= new DataElementField ( CARD_ACCEPTOR_NAME_LOCATION_CITY_043_ID
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_FIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_SUBFIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_FORMAT
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_LENGTH
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_ENCODING
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_DATATYPE
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_SOURCE
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_DIRECTION
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_EXISTENCE
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_CHANGE
					           , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_VALUE
					   	      );
	

	DataElementField cardAcceptorNameLocationStateField 
	
		= new DataElementField ( CARD_ACCEPTOR_NAME_LOCATION_STATE_043_ID
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_FIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_SUBFIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_FORMAT
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_LENGTH
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_ENCODING
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_DATATYPE
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_SOURCE
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_DIRECTION
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_EXISTENCE
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_CHANGE
					           , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_VALUE
					   	      );
	

	DataElementField cardAcceptorNameLocationCountryField 
	
		= new DataElementField ( CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_ID
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_FIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_SUBFIELD
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_FORMAT
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_LENGTH
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_ENCODING
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_DATATYPE
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_SOURCE
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_DIRECTION
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_EXISTENCE
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_CHANGE
					           , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_VALUE
					   	      );
		
	
	public DE043Impl createDE043() {
		
		int id = 43000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(cardAcceptorNameLocationAddressField);
		storage.add(cardAcceptorNameLocationCityField);
		storage.add(cardAcceptorNameLocationStateField);
		storage.add(cardAcceptorNameLocationCountryField);
		
		DE043Impl de043 = new DE043Impl(id, storage);
		
		return de043;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE043 createDE043 = new CreateDE043(); 
		
		DE043Impl de043	= createDE043.createDE043(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de043, fieldList,codeList );
	
	}
}
