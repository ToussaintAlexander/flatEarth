package com.system.message.element.load;

import static com.system.message.element.DE004.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE004Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE004  {

    	DataElementField transactionAmountField 
    	
    		= new DataElementField ( TRANSACTION_AMOUNT_004_ID
  		    	                   , TRANSACTION_AMOUNT_004_FIELD
  		    	                   , TRANSACTION_AMOUNT_004_SUBFIELD
  		    	                   , TRANSACTION_AMOUNT_004_FORMAT
  		    	                   , TRANSACTION_AMOUNT_004_LENGTH
  		    	                   , TRANSACTION_AMOUNT_004_ENCODING
  		    	                   , TRANSACTION_AMOUNT_004_DATATYPE
  		    	                   , TRANSACTION_AMOUNT_004_SOURCE
  		    	                   , TRANSACTION_AMOUNT_004_DIRECTION
  		    	                   , TRANSACTION_AMOUNT_004_EXISTENCE
  		    	                   , TRANSACTION_AMOUNT_004_CHANGE
  		    	                   , TRANSACTION_AMOUNT_004_VALUE
  		   	  			   	      );
 
		public DE004Impl createDE004() {

			int id = 4000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			storage.add(transactionAmountField);
			
			DE004Impl de004 = new DE004Impl(id, storage);
			
			return de004;
			
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE004 createDE004 = new CreateDE004(); 
			
			DE004Impl de004 = createDE004.createDE004(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de004, fieldList,codeList );
		
		}
}
