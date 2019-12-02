package com.system.message.element.load;

import static com.system.message.element.DE003.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE003Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE003  
{
    	DataElementField transactionTypeField 
    	
    		= new DataElementField ( TRANSACTION_TYPE_003_ID
  		      			           , TRANSACTION_TYPE_003_FIELD
  		      			           , TRANSACTION_TYPE_003_SUBFIELD
  		      			           , TRANSACTION_TYPE_003_FORMAT
  		      			           , TRANSACTION_TYPE_003_LENGTH
  		      			           , TRANSACTION_TYPE_003_ENCODING
  		      			           , TRANSACTION_TYPE_003_DATATYPE
  		      			           , TRANSACTION_TYPE_003_SOURCE
  		      			           , TRANSACTION_TYPE_003_DIRECTION
  		      			           , TRANSACTION_TYPE_003_EXISTENCE
  		      			           , TRANSACTION_TYPE_003_CHANGE
  		      			           , TRANSACTION_TYPE_003_VALUE
    					   		  );
 
		DataElementField accountFromTypeField 
		
			= new DataElementField ( ACCOUNT_FROM_TYPE_003_ID
					       	       , ACCOUNT_FROM_TYPE_003_FIELD
					       	       , ACCOUNT_FROM_TYPE_003_SUBFIELD
					       	       , ACCOUNT_FROM_TYPE_003_FORMAT
					       	       , ACCOUNT_FROM_TYPE_003_LENGTH
					       	       , ACCOUNT_FROM_TYPE_003_ENCODING
					       	       , ACCOUNT_FROM_TYPE_003_DATATYPE
					       	       , ACCOUNT_FROM_TYPE_003_SOURCE
					       	       , ACCOUNT_FROM_TYPE_003_DIRECTION
					       	       , ACCOUNT_FROM_TYPE_003_EXISTENCE
					       	       , ACCOUNT_FROM_TYPE_003_CHANGE
					       	       , ACCOUNT_FROM_TYPE_003_VALUE
						   	      );

		DataElementField accountToTypeField 
		
			= new DataElementField ( ACCOUNT_TO_TYPE_003_ID
		   		     	           , ACCOUNT_TO_TYPE_003_FIELD
		   		     	           , ACCOUNT_TO_TYPE_003_SUBFIELD
		   		     	           , ACCOUNT_TO_TYPE_003_FORMAT
		   		     	           , ACCOUNT_TO_TYPE_003_LENGTH
		   		     	           , ACCOUNT_TO_TYPE_003_ENCODING
		   		     	           , ACCOUNT_TO_TYPE_003_DATATYPE
		   		     	           , ACCOUNT_TO_TYPE_003_SOURCE
		   		     	           , ACCOUNT_TO_TYPE_003_DIRECTION
		   		     	           , ACCOUNT_TO_TYPE_003_EXISTENCE
		   		     	           , ACCOUNT_TO_TYPE_003_CHANGE
		   		     	           , ACCOUNT_TO_TYPE_003_VALUE
		   			 	   	      );
		
		public DE003Impl createDE003() {
			
			int id = 3000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			
			storage.add(transactionTypeField);
			storage.add(accountFromTypeField);
			storage.add(accountToTypeField);
			
			DE003Impl de003 = new DE003Impl(id, storage);
			
			return de003;
			
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE003 createDE003 = new CreateDE003(); 
			
			DE003Impl de003 = createDE003.createDE003(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de003, fieldList,codeList );
		
		}
}
