package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE059RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE059RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE059RuleHeader  {

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
	public DataElementRuleHeaderField getDataElementRuleField01a() {
	
		DataElementRuleHeaderField dataElementField01a 	 
		
			= new DataElementRuleHeaderField ( 
											   STATE_CODE_059_RULE_HEADER_ID
											 , STATE_CODE_059_RULE_HEADER_FIELD
											 , STATE_CODE_059_RULE_HEADER_SUBFIELD
											 , STATE_CODE_059_RULE_HEADER_FIRE		
											 , STATE_CODE_059_RULE_HEADER_FORMAT
											 , STATE_CODE_059_RULE_HEADER_MINIMUM_LENGTH
											 , STATE_CODE_059_RULE_HEADER_MAXIMUM_LENGTH
											 , STATE_CODE_059_RULE_HEADER_ENCODING
											 , STATE_CODE_059_RULE_HEADER_DATATYPE
											 , STATE_CODE_059_RULE_HEADER_SOURCE
											 , STATE_CODE_059_RULE_HEADER_DIRECTION
											 , STATE_CODE_059_RULE_HEADER_EXISTENCE
											 , STATE_CODE_059_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01a;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01b() {
	
		DataElementRuleHeaderField dataElementField01b 	 
		
			= new DataElementRuleHeaderField ( 
											   COUNTY_CODE_059_RULE_HEADER_ID
											 , COUNTY_CODE_059_RULE_HEADER_FIELD
											 , COUNTY_CODE_059_RULE_HEADER_SUBFIELD
											 , COUNTY_CODE_059_RULE_HEADER_FIRE		
											 , COUNTY_CODE_059_RULE_HEADER_FORMAT
											 , COUNTY_CODE_059_RULE_HEADER_MINIMUM_LENGTH
											 , COUNTY_CODE_059_RULE_HEADER_MAXIMUM_LENGTH
											 , COUNTY_CODE_059_RULE_HEADER_ENCODING
											 , COUNTY_CODE_059_RULE_HEADER_DATATYPE
											 , COUNTY_CODE_059_RULE_HEADER_SOURCE
											 , COUNTY_CODE_059_RULE_HEADER_DIRECTION
											 , COUNTY_CODE_059_RULE_HEADER_EXISTENCE
											 , COUNTY_CODE_059_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01c() {
	
		DataElementRuleHeaderField dataElementField01c 	 
		
			= new DataElementRuleHeaderField ( 
											   POSTAL_SERVICE_CODE_059_RULE_HEADER_ID
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_FIELD
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_SUBFIELD
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_FIRE		
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_FORMAT
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_MINIMUM_LENGTH
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_MAXIMUM_LENGTH
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_ENCODING
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_DATATYPE
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_SOURCE
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_DIRECTION
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_EXISTENCE
											 , POSTAL_SERVICE_CODE_059_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01c;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01d() {
	
		DataElementRuleHeaderField dataElementField01d 	 
		
			= new DataElementRuleHeaderField ( 
											   COUNTRY_CODE_059_RULE_HEADER_ID
											 , COUNTRY_CODE_059_RULE_HEADER_FIELD
											 , COUNTRY_CODE_059_RULE_HEADER_SUBFIELD
											 , COUNTRY_CODE_059_RULE_HEADER_FIRE		
											 , COUNTRY_CODE_059_RULE_HEADER_FORMAT
											 , COUNTRY_CODE_059_RULE_HEADER_MINIMUM_LENGTH
											 , COUNTRY_CODE_059_RULE_HEADER_MAXIMUM_LENGTH
											 , COUNTRY_CODE_059_RULE_HEADER_ENCODING
											 , COUNTRY_CODE_059_RULE_HEADER_DATATYPE
											 , COUNTRY_CODE_059_RULE_HEADER_SOURCE
											 , COUNTRY_CODE_059_RULE_HEADER_DIRECTION
											 , COUNTRY_CODE_059_RULE_HEADER_EXISTENCE
											 , COUNTRY_CODE_059_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01d;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE059RuleHeader () {
			
			int id = 59000;
			
			DataElementRuleHeaderField dataElementField01a = getDataElementRuleField01a();
			DataElementRuleHeaderField dataElementField01b = getDataElementRuleField01b();
			DataElementRuleHeaderField dataElementField01c = getDataElementRuleField01c();
			DataElementRuleHeaderField dataElementField01d = getDataElementRuleField01d();
			
			storage.add(dataElementField01a);
			storage.add(dataElementField01b);
			storage.add(dataElementField01c);
			storage.add(dataElementField01d);
			
			DataElementRuleHeader de059HeaderRule = new DE059RuleHeaderImpl(id, storage);
			
			return de059HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de059RuleHeader = new CreateDE059RuleHeader().createDE059RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de059RuleHeader,fieldList,codeList);
		
		}
}
