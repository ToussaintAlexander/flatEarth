package com.system.message.element.load;

import static com.system.message.element.DE006.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE006Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE006   {

    	DataElementField cardholderBillingAmountField 
    	
    		= new DataElementField ( CARDHOLDER_BILLING_AMOUNT_006_ID
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_FIELD
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_SUBFIELD
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_FORMAT
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_LENGTH
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_ENCODING
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_DATATYPE
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_SOURCE
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_DIRECTION
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_EXISTENCE
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_CHANGE
  		    		               , CARDHOLDER_BILLING_AMOUNT_006_VALUE
  		   	  			   	      );
			
		public DE006Impl createDE006() {
			
			int id = 6000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			
			storage.add(cardholderBillingAmountField);
			
			DE006Impl de006 = new DE006Impl(id, storage);
			
			return de006;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE006 createDE006 = new CreateDE006(); 
			
			DE006Impl de006 = createDE006.createDE006(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de006, fieldList,codeList );
		
		}
}
