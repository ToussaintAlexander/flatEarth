package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE060RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE060RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE060RuleHeader  {

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
											   TERMINAL_TYPE_060_RULE_HEADER_ID
											 , TERMINAL_TYPE_060_RULE_HEADER_FIELD
											 , TERMINAL_TYPE_060_RULE_HEADER_SUBFIELD
											 , TERMINAL_TYPE_060_RULE_HEADER_FIRE		
											 , TERMINAL_TYPE_060_RULE_HEADER_FORMAT
											 , TERMINAL_TYPE_060_RULE_HEADER_MINIMUM_LENGTH
											 , TERMINAL_TYPE_060_RULE_HEADER_MAXIMUM_LENGTH
											 , TERMINAL_TYPE_060_RULE_HEADER_ENCODING
											 , TERMINAL_TYPE_060_RULE_HEADER_DATATYPE
											 , TERMINAL_TYPE_060_RULE_HEADER_SOURCE
											 , TERMINAL_TYPE_060_RULE_HEADER_DIRECTION
											 , TERMINAL_TYPE_060_RULE_HEADER_EXISTENCE
											 , TERMINAL_TYPE_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_ID
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FIELD
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_SUBFIELD
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FIRE		
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_FORMAT
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_MINIMUM_LENGTH
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_MAXIMUM_LENGTH
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_ENCODING
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_DATATYPE
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_SOURCE
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_DIRECTION
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_EXISTENCE
											 , TERMINAL_ENTRY_CAPABILITY_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03a() {
	
		DataElementRuleHeaderField dataElementField03a 	 
		
			= new DataElementRuleHeaderField ( 
											   CHIP_CONDITION_CODE_060_RULE_HEADER_ID
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_FIELD
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_SUBFIELD
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_FIRE		
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_FORMAT
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_MINIMUM_LENGTH
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_MAXIMUM_LENGTH
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_ENCODING
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_DATATYPE
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_SOURCE
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_DIRECTION
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_EXISTENCE
											 , CHIP_CONDITION_CODE_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03a;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03b() {
	
		DataElementRuleHeaderField dataElementField03b 	 
		
			= new DataElementRuleHeaderField ( 
											   CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_ID
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FIELD
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_SUBFIELD
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FIRE		
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_FORMAT
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_ENCODING
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_DATATYPE
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_SOURCE
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_DIRECTION
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_EXISTENCE
											 , CHIP_AUTHENTICATION_RELIABILITY_INDICATOR_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_ID
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FIELD
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_SUBFIELD
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FIRE		
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_FORMAT
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_ENCODING
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_DATATYPE
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_SOURCE
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_DIRECTION
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_EXISTENCE
											 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_ID
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FIELD
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_SUBFIELD
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FIRE		
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_FORMAT
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_MINIMUM_LENGTH
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_MAXIMUM_LENGTH
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_ENCODING
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_DATATYPE
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_SOURCE
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_DIRECTION
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_EXISTENCE
											 , PARTIAL_AUTH_INDICATOR_060_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE060RuleHeader () {
			
			int id = 60000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			
			DataElementRuleHeaderField dataElementField03a = getDataElementRuleField03a();
			DataElementRuleHeaderField dataElementField03b = getDataElementRuleField03b();
			
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			
			storage.add(dataElementField03a);
			storage.add(dataElementField03b);
			
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			
			DataElementRuleHeader de060HeaderRule = new DE060RuleHeaderImpl(id, storage);
			
			return de060HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de060RuleHeader = new CreateDE060RuleHeader().createDE060RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de060RuleHeader,fieldList,codeList);
		
		}
}
