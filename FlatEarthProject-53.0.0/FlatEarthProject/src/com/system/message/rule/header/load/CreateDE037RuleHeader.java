package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE037RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE037RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE037RuleHeader  {

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
	public DataElementRuleHeaderField getDataElementRuleField01() {
	
		DataElementRuleHeaderField dataElementField01 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSMISSION_DATE_YEAR_037_RULE_HEADER_ID
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FIELD
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_SUBFIELD
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FIRE		
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_FORMAT
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_ENCODING
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_DATATYPE
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_SOURCE
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_DIRECTION
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_EXISTENCE
											 , TRANSMISSION_DATE_YEAR_037_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   JULIAN_DAY_MONTH_037_RULE_HEADER_ID
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_FIELD
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_SUBFIELD
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_FIRE		
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_FORMAT
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_MINIMUM_LENGTH
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_MAXIMUM_LENGTH
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_ENCODING
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_DATATYPE
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_SOURCE
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_DIRECTION
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_EXISTENCE
											 , JULIAN_DAY_MONTH_037_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSMISSION_TIME_HOUR_037_RULE_HEADER_ID
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FIELD
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_SUBFIELD
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FIRE		
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_FORMAT
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_ENCODING
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_DATATYPE
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_SOURCE
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_DIRECTION
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_EXISTENCE
											 , TRANSMISSION_TIME_HOUR_037_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_ID
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FIELD
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_SUBFIELD
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FIRE		
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_FORMAT
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_MINIMUM_LENGTH
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_MAXIMUM_LENGTH
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_ENCODING
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_DATATYPE
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_SOURCE
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_DIRECTION
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_EXISTENCE
											 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE037RuleHeader () {
			
			int id = 37000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			
			DataElementRuleHeader de037HeaderRule = new DE037RuleHeaderImpl(id, storage);
			
			return de037HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de037RuleHeader = new CreateDE037RuleHeader().createDE037RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de037RuleHeader,fieldList,codeList);
		
		}
}
