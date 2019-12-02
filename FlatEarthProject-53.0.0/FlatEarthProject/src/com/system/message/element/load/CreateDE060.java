package com.system.message.element.load;

import static com.system.message.element.DE060.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE060Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE060  {

	DataElementField terminalTypeField 
	
		= new DataElementField ( TERMINAL_TYPE_060_ID
					           , TERMINAL_TYPE_060_FIELD
					           , TERMINAL_TYPE_060_SUBFIELD
					           , TERMINAL_TYPE_060_FORMAT
					           , TERMINAL_TYPE_060_LENGTH
					           , TERMINAL_TYPE_060_ENCODING
					           , TERMINAL_TYPE_060_DATATYPE
					           , TERMINAL_TYPE_060_SOURCE
					           , TERMINAL_TYPE_060_DIRECTION
					           , TERMINAL_TYPE_060_EXISTENCE
					           , TERMINAL_TYPE_060_CHANGE
					           , TERMINAL_TYPE_060_VALUE
					   	      );


	DataElementField terminalEntryCapabilityField 
	
		= new DataElementField ( TERMINAL_ENTRY_CAPABILITY_060_ID
					           , TERMINAL_ENTRY_CAPABILITY_060_FIELD
					           , TERMINAL_ENTRY_CAPABILITY_060_SUBFIELD
					           , TERMINAL_ENTRY_CAPABILITY_060_FORMAT
					           , TERMINAL_ENTRY_CAPABILITY_060_LENGTH
					           , TERMINAL_ENTRY_CAPABILITY_060_ENCODING
					           , TERMINAL_ENTRY_CAPABILITY_060_DATATYPE
					           , TERMINAL_ENTRY_CAPABILITY_060_SOURCE
					           , TERMINAL_ENTRY_CAPABILITY_060_DIRECTION
					           , TERMINAL_ENTRY_CAPABILITY_060_EXISTENCE
					           , TERMINAL_ENTRY_CAPABILITY_060_CHANGE
					           , TERMINAL_ENTRY_CAPABILITY_060_VALUE
					   	      );
	
	
	//---------------------------------------------------------------------------------------
	
	DataElementField chipConditionCodeField 
	
		= new DataElementField ( CHIP_CONDITION_CODE_060_ID
							   , CHIP_CONDITION_CODE_060_FIELD								 	 
							   , CHIP_CONDITION_CODE_060_SUBFIELD							 
							   , CHIP_CONDITION_CODE_060_FORMAT								 	
							   , CHIP_CONDITION_CODE_060_LENGTH								    	 
							   , CHIP_CONDITION_CODE_060_ENCODING							 
							   , CHIP_CONDITION_CODE_060_DATATYPE							 
							   , CHIP_CONDITION_CODE_060_SOURCE								 
							   , CHIP_CONDITION_CODE_060_DIRECTION							 
							   , CHIP_CONDITION_CODE_060_EXISTENCE							 
							   , CHIP_CONDITION_CODE_060_CHANGE								 
							   , CHIP_CONDITION_CODE_060_VALUE								 
						       );
	
	//---------------------------------------------------------------------------------------
	
	DataElementField chipAuthenticationReliabilityIndicatorField 
	
		= new DataElementField ( CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_ID
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_FIELD			 	 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_SUBFIELD		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_FORMAT		 	
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_LENGTH		    	 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_ENCODING		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_DATATYPE		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_SOURCE		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_DIRECTION		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_EXISTENCE		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_CHANGE		 
						       , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_VALUE			 
						      );
	
	//---------------------------------------------------------------------------------------

	DataElementField motoEciPaymentIndicatorField 
	
		= new DataElementField ( MOTO_ECI_PAYMENT_INDICATOR_060_ID
					           , MOTO_ECI_PAYMENT_INDICATOR_060_FIELD
					           , MOTO_ECI_PAYMENT_INDICATOR_060_SUBFIELD
					           , MOTO_ECI_PAYMENT_INDICATOR_060_FORMAT
					           , MOTO_ECI_PAYMENT_INDICATOR_060_LENGTH
					           , MOTO_ECI_PAYMENT_INDICATOR_060_ENCODING
					           , MOTO_ECI_PAYMENT_INDICATOR_060_DATATYPE
					           , MOTO_ECI_PAYMENT_INDICATOR_060_SOURCE
					           , MOTO_ECI_PAYMENT_INDICATOR_060_DIRECTION
					           , MOTO_ECI_PAYMENT_INDICATOR_060_EXISTENCE
					           , MOTO_ECI_PAYMENT_INDICATOR_060_CHANGE
					           , MOTO_ECI_PAYMENT_INDICATOR_060_VALUE
					   	      );
	
	DataElementField partialAuthIndicatorField 
	
		= new DataElementField ( PARTIAL_AUTH_INDICATOR_060_ID
					           , PARTIAL_AUTH_INDICATOR_060_FIELD
					           , PARTIAL_AUTH_INDICATOR_060_SUBFIELD
					           , PARTIAL_AUTH_INDICATOR_060_FORMAT
					           , PARTIAL_AUTH_INDICATOR_060_LENGTH
					           , PARTIAL_AUTH_INDICATOR_060_ENCODING
					           , PARTIAL_AUTH_INDICATOR_060_DATATYPE
					           , PARTIAL_AUTH_INDICATOR_060_SOURCE
					           , PARTIAL_AUTH_INDICATOR_060_DIRECTION
					           , PARTIAL_AUTH_INDICATOR_060_EXISTENCE
					           , PARTIAL_AUTH_INDICATOR_060_CHANGE
					           , PARTIAL_AUTH_INDICATOR_060_VALUE
					   	      );
	
	
	public DE060Impl createDE060() {
		
		int id = 60000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(terminalTypeField);
		storage.add(terminalEntryCapabilityField);
		storage.add(chipConditionCodeField);
		storage.add(chipAuthenticationReliabilityIndicatorField);
		storage.add(motoEciPaymentIndicatorField);
		storage.add(partialAuthIndicatorField);
		
		DE060Impl de060 = new DE060Impl(id, storage);
		
		return de060;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE060 createDE060 = new CreateDE060(); 
		
		DE060Impl de060	= createDE060.createDE060(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de060, fieldList,codeList );
	
	}
}
