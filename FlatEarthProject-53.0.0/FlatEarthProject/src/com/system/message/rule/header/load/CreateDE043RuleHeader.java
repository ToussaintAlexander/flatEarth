package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE043RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE043RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE043RuleHeader  {

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
											   CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_ID
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_FIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_SUBFIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_FIRE		
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_FORMAT
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_ENCODING
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_DATATYPE
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_SOURCE
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_DIRECTION
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_EXISTENCE
											 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_ID
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_FIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_SUBFIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_FIRE		
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_FORMAT
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_ENCODING
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_DATATYPE
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_SOURCE
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_DIRECTION
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_EXISTENCE
											 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_ID
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_FIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_SUBFIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_FIRE		
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_FORMAT
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_ENCODING
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_DATATYPE
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_SOURCE
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_DIRECTION
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_EXISTENCE
											 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_ID
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_FIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_SUBFIELD
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_FIRE		
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_FORMAT
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_ENCODING
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_DATATYPE
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_SOURCE
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_DIRECTION
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_EXISTENCE
											 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE043RuleHeader () {
			
			int id = 43000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			
			DataElementRuleHeader de043HeaderRule = new DE043RuleHeaderImpl(id, storage);
			
			return de043HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de043RuleHeader = new CreateDE043RuleHeader().createDE043RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de043RuleHeader,fieldList,codeList);
		
		}
}
