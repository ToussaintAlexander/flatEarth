package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE007RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE007RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */	
public class CreateDE007RuleHeader  {

	public List<DataElementRuleHeaderField> storage = new ArrayList<DataElementRuleHeaderField>();
	
	public List<DataElementRuleHeaderField> getStorage() {
		return storage;
	}
	public void setStorage(List<DataElementRuleHeaderField> storage) {
		this.storage = storage;
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getTransmissionDateTimeMonthRuleHeader() {

	   	DataElementRuleHeaderField transmissionDateTimeMonthRuleHeaderField 
	   	
   			= new DataElementRuleHeaderField ( 
   										       TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ID
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FIELD
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_SUBFIELD
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FIRE
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_FORMAT
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_MINIMUM_LENGTH
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_MAXIMUM_LENGTH
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_ENCODING
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_DATATYPE
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_SOURCE
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_DIRECTION
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_EXISTENCE
			               			         , TRANSMISSION_DATE_MONTH_007_RULE_HEADER_CHANGE
  		   	  			                     );

		return transmissionDateTimeMonthRuleHeaderField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeaderField getTransmissionDateTimeDayRuleHeader() {
	
		DataElementRuleHeaderField transmissionDateTimeDayRuleHeaderField 
   	
			= new DataElementRuleHeaderField ( 
										       TRANSMISSION_DATE_DAY_007_RULE_HEADER_ID
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_FIELD
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_SUBFIELD
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_FIRE
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_FORMAT
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_MINIMUM_LENGTH
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_MAXIMUM_LENGTH
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_ENCODING
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_DATATYPE
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_SOURCE
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_DIRECTION
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_EXISTENCE
		               			             , TRANSMISSION_DATE_DAY_007_RULE_HEADER_CHANGE
		   	  			                     );

	return transmissionDateTimeDayRuleHeaderField;
	
	}
	/***********************************************************************************
	 ***********************************************************************************
 	 */
	public DataElementRuleHeaderField getTransmissionDateTimeHourRuleHeader() {
		
		DataElementRuleHeaderField transmissionDateTimeHourRuleHeaderField 
	
			= new DataElementRuleHeaderField ( 
									           TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ID
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FIELD
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_SUBFIELD
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FIRE
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_FORMAT
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_MINIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_MAXIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_ENCODING
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_DATATYPE
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_SOURCE
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_DIRECTION
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_EXISTENCE
	               			                 , TRANSMISSION_TIME_HOUR_007_RULE_HEADER_CHANGE
											);

		return transmissionDateTimeHourRuleHeaderField;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeaderField getTransmissionDateTimeMinuteRuleHeader() {
		
		DataElementRuleHeaderField transmissionDateTimeMinuteRuleHeaderField 
	
			= new DataElementRuleHeaderField ( 
									           TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ID
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FIELD
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_SUBFIELD
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FIRE
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_FORMAT
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_MINIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_MAXIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_ENCODING
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_DATATYPE
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_SOURCE
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_DIRECTION
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_EXISTENCE
	               			                 , TRANSMISSION_TIME_MINUTE_007_RULE_HEADER_CHANGE
	   	  			                     	);

		return transmissionDateTimeMinuteRuleHeaderField;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeaderField getTransmissionDateTimeSecondRuleHeader() {
		
		DataElementRuleHeaderField transmissionDateTimeSecondRuleHeaderField 
	
			= new DataElementRuleHeaderField ( 
									           TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ID
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FIELD
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_SUBFIELD
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FIRE
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_FORMAT
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_MINIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_MAXIMUM_LENGTH
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_ENCODING
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_DATATYPE
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_SOURCE
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_DIRECTION
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_EXISTENCE
	               			                 , TRANSMISSION_TIME_SECOND_007_RULE_HEADER_CHANGE
	   	  			                     	);

		return transmissionDateTimeSecondRuleHeaderField;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DE007RuleHeaderImpl createDE007RuleHeader() {
		
		int id = 7000;
		
		DataElementRuleHeaderField transmissionDateTimeMonthRuleHeader = getTransmissionDateTimeMonthRuleHeader();
		DataElementRuleHeaderField transmissionDateTimeDayRuleHeader = getTransmissionDateTimeDayRuleHeader();
		DataElementRuleHeaderField transmissionDateTimeHourRuleHeader = getTransmissionDateTimeHourRuleHeader();
		DataElementRuleHeaderField transmissionDateTimeMinuteRuleHeader = getTransmissionDateTimeMinuteRuleHeader();
		DataElementRuleHeaderField transmissionDateTimeSecondRuleHeader = getTransmissionDateTimeSecondRuleHeader();
		
		storage.add(transmissionDateTimeMonthRuleHeader);
		storage.add(transmissionDateTimeDayRuleHeader);
		storage.add(transmissionDateTimeHourRuleHeader);
		storage.add(transmissionDateTimeMinuteRuleHeader);
		storage.add(transmissionDateTimeSecondRuleHeader);
		
		DE007RuleHeaderImpl de007RuleHeader = new DE007RuleHeaderImpl(id, storage);
		
		return de007RuleHeader;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		DE007RuleHeaderImpl de007RuleHeader	 = new CreateDE007RuleHeader().createDE007RuleHeader(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleHeaderUtils().display(de007RuleHeader,fieldList,codeList);
	
	}
}
