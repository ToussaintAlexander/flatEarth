package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE040RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE040RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE040RuleHeader  {

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
											   SERVICE_RESTRICTION_CODE_040_RULE_HEADER_ID
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FIELD
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_SUBFIELD
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FIRE		
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_FORMAT
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_MINIMUM_LENGTH
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_MAXIMUM_LENGTH
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_ENCODING
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_DATATYPE
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_SOURCE
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_DIRECTION
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_EXISTENCE
											 , SERVICE_RESTRICTION_CODE_040_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE040RuleHeader () {
			
			int id = 40000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de040HeaderRule = new DE040RuleHeaderImpl(id, storage);
			
			return de040HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de040RuleHeader = new CreateDE040RuleHeader().createDE040RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de040RuleHeader,fieldList,codeList);
		
		}
}
