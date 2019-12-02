package com.system.message.element.load;

import static com.system.message.element.DE008.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE008Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE008   {

    	DataElementField cardholderBillingFeeAmountField 
    	
    		= new DataElementField ( CARDHOLDER_BILLING_FEE_AMOUNT_008_ID
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_FIELD
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_SUBFIELD
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_FORMAT
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_LENGTH
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_ENCODING
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_DATATYPE
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_SOURCE
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_DIRECTION
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_EXISTENCE
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_CHANGE
  		    		               , CARDHOLDER_BILLING_FEE_AMOUNT_008_VALUE
  		   	  			   	      );
			
		public DE008Impl createDE008() {
			
			int id = 8000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			storage.add(cardholderBillingFeeAmountField);
			
			DE008Impl de008 = new DE008Impl(id, storage);
			
			return de008;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE008 createDE008 = new CreateDE008(); 
			
			DE008Impl de008 = createDE008.createDE008(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de008, fieldList,codeList );
		
		}
}
