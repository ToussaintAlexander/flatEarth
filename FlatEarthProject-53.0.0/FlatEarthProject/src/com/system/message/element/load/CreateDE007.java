package com.system.message.element.load;

import static com.system.message.element.DE007.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE007Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE007   {		// 10 BYTES		MMDDhhmmss

   		DataElementField transmissionDateMonthField 
   	
   			= new DataElementField ( TRANSMISSION_DATE_MONTH_007_ID
  		      		               , TRANSMISSION_DATE_MONTH_007_FIELD
  		      		               , TRANSMISSION_DATE_MONTH_007_SUBFIELD
  		      		               , TRANSMISSION_DATE_MONTH_007_FORMAT
  		      		               , TRANSMISSION_DATE_MONTH_007_LENGTH
  		      		               , TRANSMISSION_DATE_MONTH_007_ENCODING
  		      		               , TRANSMISSION_DATE_MONTH_007_DATATYPE
  		      		               , TRANSMISSION_DATE_MONTH_007_SOURCE
  		      		               , TRANSMISSION_DATE_MONTH_007_DIRECTION
  		      		               , TRANSMISSION_DATE_MONTH_007_EXISTENCE
  		      		               , TRANSMISSION_DATE_MONTH_007_CHANGE
  		      		               , TRANSMISSION_DATE_MONTH_007_VALUE
  		   	  		       	      );
 
   		DataElementField transmissionDateDayField 
   	
   			= new DataElementField ( TRANSMISSION_DATE_DAY_007_ID
  		      		       	       , TRANSMISSION_DATE_DAY_007_FIELD
  		      		       	       , TRANSMISSION_DATE_DAY_007_SUBFIELD
  		      		       	       , TRANSMISSION_DATE_DAY_007_FORMAT
  		      		       	       , TRANSMISSION_DATE_DAY_007_LENGTH
  		      		       	       , TRANSMISSION_DATE_DAY_007_ENCODING
  		      		       	       , TRANSMISSION_DATE_DAY_007_DATATYPE
  		      		       	       , TRANSMISSION_DATE_DAY_007_SOURCE
  		      		       	       , TRANSMISSION_DATE_DAY_007_DIRECTION
  		      		       	       , TRANSMISSION_DATE_DAY_007_EXISTENCE
  		      		       	       , TRANSMISSION_DATE_DAY_007_CHANGE
  		      		       	       , TRANSMISSION_DATE_DAY_007_VALUE
   					              );
 
   		DataElementField transmissionTimeHourField 
   	
   			= new DataElementField ( TRANSMISSION_TIME_HOUR_007_ID
  		      		               , TRANSMISSION_TIME_HOUR_007_FIELD
  		      		               , TRANSMISSION_TIME_HOUR_007_SUBFIELD
  		      		               , TRANSMISSION_TIME_HOUR_007_FORMAT
  		      		               , TRANSMISSION_TIME_HOUR_007_LENGTH
  		      		               , TRANSMISSION_TIME_HOUR_007_ENCODING
  		      		               , TRANSMISSION_TIME_HOUR_007_DATATYPE
  		      		               , TRANSMISSION_TIME_HOUR_007_SOURCE
  		      		               , TRANSMISSION_TIME_HOUR_007_DIRECTION
  		      		               , TRANSMISSION_DATE_DAY_007_EXISTENCE
  		      		               , TRANSMISSION_TIME_HOUR_007_CHANGE
  		      		               , TRANSMISSION_TIME_HOUR_007_VALUE
  		   	  		       	      );
 
   		DataElementField transmissionTimeMinuteField 
   	
   			= new DataElementField ( TRANSMISSION_TIME_MINUTE_007_ID
  		      		               , TRANSMISSION_TIME_MINUTE_007_FIELD
  		      		               , TRANSMISSION_TIME_MINUTE_007_SUBFIELD
  		      		               , TRANSMISSION_TIME_MINUTE_007_FORMAT
  		      		               , TRANSMISSION_TIME_MINUTE_007_LENGTH
  		      		               , TRANSMISSION_TIME_MINUTE_007_ENCODING
  		      		               , TRANSMISSION_TIME_MINUTE_007_DATATYPE
  		      		               , TRANSMISSION_TIME_MINUTE_007_SOURCE
  		      		               , TRANSMISSION_TIME_MINUTE_007_DIRECTION
  		      		               , TRANSMISSION_TIME_MINUTE_007_EXISTENCE
  		      		               , TRANSMISSION_TIME_MINUTE_007_CHANGE
  		      		               , TRANSMISSION_TIME_MINUTE_007_VALUE
  		   	  		       	      );
    
   		DataElementField transmissionTimeSecondField 
   	
   			= new DataElementField ( TRANSMISSION_TIME_SECOND_007_ID
  		      		               , TRANSMISSION_TIME_SECOND_007_FIELD
  		      		               , TRANSMISSION_TIME_SECOND_007_SUBFIELD
  		      		               , TRANSMISSION_TIME_SECOND_007_FORMAT
  		      		               , TRANSMISSION_TIME_SECOND_007_LENGTH
  		      		               , TRANSMISSION_TIME_SECOND_007_ENCODING
  		      		               , TRANSMISSION_TIME_SECOND_007_DATATYPE
  		      		               , TRANSMISSION_TIME_SECOND_007_SOURCE
  		      		               , TRANSMISSION_TIME_SECOND_007_DIRECTION
  		      		               , TRANSMISSION_TIME_SECOND_007_EXISTENCE
  		      		               , TRANSMISSION_TIME_SECOND_007_CHANGE
  		      		               , TRANSMISSION_TIME_SECOND_007_VALUE
  		   	  		       	      );
   	
		public DE007Impl createDE007() {
			
			int id = 7000;
			
			List<DataElementField> storage = new ArrayList<DataElementField>();
			
			storage.add(transmissionDateMonthField);
			storage.add(transmissionDateDayField);
			storage.add(transmissionTimeHourField);
			storage.add(transmissionTimeMinuteField);
			storage.add(transmissionTimeSecondField);
			
			DE007Impl de007 = new DE007Impl(id, storage);
			
			return de007;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			CreateDE007 createDE007 = new CreateDE007(); 
			
			DE007Impl de007 = createDE007.createDE007(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new ElementUtils().display(de007, fieldList,codeList );
		
		}
}
