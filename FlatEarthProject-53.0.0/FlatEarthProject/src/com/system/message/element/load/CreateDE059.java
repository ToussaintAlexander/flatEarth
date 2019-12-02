package com.system.message.element.load;

import static com.system.message.element.DE059.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE059Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE059  {

	DataElementField stateCodeField 
	
		= new DataElementField ( STATE_CODE_059_ID
						       , STATE_CODE_059_FIELD				 	 
						       , STATE_CODE_059_SUBFIELD				 
						       , STATE_CODE_059_FORMAT				 	
						       , STATE_CODE_059_LENGTH				    	 
						       , STATE_CODE_059_ENCODING				 
						       , STATE_CODE_059_DATATYPE				 
						       , STATE_CODE_059_SOURCE				 
						       , STATE_CODE_059_DIRECTION			 
						       , STATE_CODE_059_EXISTENCE			 
						       , STATE_CODE_059_CHANGE				 
						       , STATE_CODE_059_VALUE				 
						   	   );
	
	//-------------------------------------------------------------------------------------------
	
	DataElementField countyCodeField 
	
		= new DataElementField ( COUNTY_CODE_059_ID	
						       , COUNTY_CODE_059_FIELD				 	 
						       , COUNTY_CODE_059_SUBFIELD			 
						       , COUNTY_CODE_059_FORMAT				 	
						       , COUNTY_CODE_059_LENGTH				    	 
						       , COUNTY_CODE_059_ENCODING			 
						       , COUNTY_CODE_059_DATATYPE			 
						       , COUNTY_CODE_059_SOURCE				 
						       , COUNTY_CODE_059_DIRECTION			 
						       , COUNTY_CODE_059_EXISTENCE			 
						       , COUNTY_CODE_059_CHANGE				 
						       , COUNTY_CODE_059_VALUE				 
						       );
	
	//-------------------------------------------------------------------------------------------
	
	DataElementField postalServiceCodeField 
	
		= new DataElementField ( POSTAL_SERVICE_CODE_059_ID
							   , POSTAL_SERVICE_CODE_059_FIELD		 	 
							   , POSTAL_SERVICE_CODE_059_SUBFIELD	 
							   , POSTAL_SERVICE_CODE_059_FORMAT		 	
							   , POSTAL_SERVICE_CODE_059_LENGTH		    	 
							   , POSTAL_SERVICE_CODE_059_ENCODING	 
							   , POSTAL_SERVICE_CODE_059_DATATYPE	 
							   , POSTAL_SERVICE_CODE_059_SOURCE		 
							   , POSTAL_SERVICE_CODE_059_DIRECTION	 
							   , POSTAL_SERVICE_CODE_059_EXISTENCE	 
							   , POSTAL_SERVICE_CODE_059_CHANGE		 
							   , POSTAL_SERVICE_CODE_059_VALUE		 
							   );
	
	//-------------------------------------------------------------------------------------------
	
	DataElementField countryCodeField 
	
		= new DataElementField ( COUNTRY_CODE_059_ID
						       , COUNTRY_CODE_059_FIELD				 	 
						       , COUNTRY_CODE_059_SUBFIELD			 
						       , COUNTRY_CODE_059_FORMAT				 
						       , COUNTRY_CODE_059_LENGTH				    	 
						       , COUNTRY_CODE_059_ENCODING			 
						       , COUNTRY_CODE_059_DATATYPE			 
						       , COUNTRY_CODE_059_SOURCE				 
						       , COUNTRY_CODE_059_DIRECTION			 
						       , COUNTRY_CODE_059_EXISTENCE			 
						       , COUNTRY_CODE_059_CHANGE				 
						       , COUNTRY_CODE_059_VALUE				 
							   );
	
	public DE059Impl createDE059() {
		
		int id = 59000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		
		storage.add(stateCodeField);
		storage.add(countyCodeField);
		storage.add(postalServiceCodeField);
		storage.add(countryCodeField);
		
		DE059Impl de059 = new DE059Impl(id, storage);
		
		return de059;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE059 createDE059 = new CreateDE059(); 
		
		DE059Impl de059	= createDE059.createDE059(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de059, fieldList,codeList );
	
	}
}
