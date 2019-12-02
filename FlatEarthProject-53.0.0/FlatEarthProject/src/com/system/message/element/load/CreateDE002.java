package com.system.message.element.load;

import static com.system.message.element.DE002.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE002Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE002  {

    	DataElementField binStorageField 
    	
    		= new DataElementField ( BIN_002_ID
  		    			           , BIN_002_FIELD
  		    			           , BIN_002_SUBFIELD
  		    			           , BIN_002_FORMAT
  		    			           , BIN_002_LENGTH
  		    			           , BIN_002_ENCODING
  		    			           , BIN_002_DATATYPE
  		    			           , BIN_002_SOURCE
  		    			           , BIN_002_DIRECTION
  		    			           , BIN_002_EXISTENCE
  		    			           , BIN_002_CHANGE
  		    			           , BIN_002_VALUE
  		   				   	      );
 
		DataElementField panStorageField 
		
			= new DataElementField ( PAN_002_ID
						           , PAN_002_FIELD
						           , PAN_002_SUBFIELD
						           , PAN_002_FORMAT
						           , PAN_002_LENGTH
						           , PAN_002_ENCODING
						           , PAN_002_DATATYPE
						           , PAN_002_SOURCE
						           , PAN_002_DIRECTION
						           , PAN_002_EXISTENCE
						           , PAN_002_CHANGE
						           , PAN_002_VALUE
						          );

		DataElementField checkDigitStorageField 
		
			= new DataElementField ( CHECK_DIGIT_002_ID
		   			               , CHECK_DIGIT_002_FIELD
		   			               , CHECK_DIGIT_002_SUBFIELD
		   			               , CHECK_DIGIT_002_FORMAT
		   			               , CHECK_DIGIT_002_LENGTH
		   			               , CHECK_DIGIT_002_ENCODING
		   			               , CHECK_DIGIT_002_DATATYPE
		   			               , CHECK_DIGIT_002_SOURCE
		   			               , CHECK_DIGIT_002_DIRECTION
		   			               , CHECK_DIGIT_002_EXISTENCE
		   			               , CHECK_DIGIT_002_CHANGE
		   			               , CHECK_DIGIT_002_VALUE
		   			 	   	      );
		
		public DE002Impl createDE002() {
			
			int id = 2000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			
			storage.add(binStorageField);
			storage.add(panStorageField);
			storage.add(checkDigitStorageField);
			
			DE002Impl de002 = new DE002Impl(id, storage);
			
			return de002;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE002 createDE002 = new CreateDE002(); 
			
			DE002Impl de002 = createDE002.createDE002(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de002, fieldList,codeList );
		
		}
}
