package com.system.message.element.load;

import static com.system.message.element.DE009.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE009Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE009   {

    	DataElementField settlementConversionRateField 
    	
    		= new DataElementField ( SETTLEMENT_CONVERSION_RATE_009_ID
  		    		               , SETTLEMENT_CONVERSION_RATE_009_FIELD
  		    		               , SETTLEMENT_CONVERSION_RATE_009_SUBFIELD
  		    		               , SETTLEMENT_CONVERSION_RATE_009_FORMAT
  		    		               , SETTLEMENT_CONVERSION_RATE_009_LENGTH
  		    		               , SETTLEMENT_CONVERSION_RATE_009_ENCODING
  		    		               , SETTLEMENT_CONVERSION_RATE_009_DATATYPE
  		    		               , SETTLEMENT_CONVERSION_RATE_009_SOURCE
  		    		               , SETTLEMENT_CONVERSION_RATE_009_DIRECTION
  		    		               , SETTLEMENT_CONVERSION_RATE_009_EXISTENCE
  		    		               , SETTLEMENT_CONVERSION_RATE_009_CHANGE
  		    		               , SETTLEMENT_CONVERSION_RATE_009_VALUE
  		   	  			   	      );
			
		public DE009Impl createDE009() {
			
			int id = 9000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			storage.add(settlementConversionRateField);
			
			DE009Impl de009 = new DE009Impl(id, storage);
			
			return de009;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE009 createDE009 = new CreateDE009(); 
			
			DE009Impl de009 = createDE009.createDE009(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de009, fieldList,codeList );
		
		}
}
