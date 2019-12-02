package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE038RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE038RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE038RuleHeader  {

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
											   AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_ID
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FIELD
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_SUBFIELD
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FIRE		
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_FORMAT
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_MINIMUM_LENGTH
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_MAXIMUM_LENGTH
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_ENCODING
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_DATATYPE
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_SOURCE
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_DIRECTION
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_EXISTENCE
											 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE038RuleHeader () {
			
			int id = 38000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de038HeaderRule = new DE038RuleHeaderImpl(id, storage);
			
			return de038HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de038RuleHeader = new CreateDE038RuleHeader().createDE038RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de038RuleHeader,fieldList,codeList);
		
		}
}
