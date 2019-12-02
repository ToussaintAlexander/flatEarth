package com.system.message.element.load;

import static com.system.message.element.DE005.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE005Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE005  {

    	DataElementField settlementAmountField 
    	
    		= new DataElementField ( SETTLEMENT_AMOUNT_005_ID
  		    		               , SETTLEMENT_AMOUNT_005_FIELD
  		    		               , SETTLEMENT_AMOUNT_005_SUBFIELD
  		    		               , SETTLEMENT_AMOUNT_005_FORMAT
  		    		               , SETTLEMENT_AMOUNT_005_LENGTH
  		    		               , SETTLEMENT_AMOUNT_005_ENCODING
  		    		               , SETTLEMENT_AMOUNT_005_DATATYPE
  		    		               , SETTLEMENT_AMOUNT_005_SOURCE
  		    		               , SETTLEMENT_AMOUNT_005_DIRECTION
  		    		               , SETTLEMENT_AMOUNT_005_EXISTENCE
  		    		               , SETTLEMENT_AMOUNT_005_CHANGE
  		    		               , SETTLEMENT_AMOUNT_005_VALUE
  		   	  			   	      );
			
		public DE005Impl createDE005() {
			
			int id = 5000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			storage.add(settlementAmountField);
			
			DE005Impl de005 = new DE005Impl(id, storage);
			
			return de005;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE005 createDE005 = new CreateDE005(); 
			
			DE005Impl de005 = createDE005.createDE005(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de005, fieldList,codeList );
		
		}
}
