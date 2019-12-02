package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE025RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE025RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE025RuleHeader  {

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
	public DataElementRuleHeaderField getPointOfServiceConditionCodeRule() {
	
		DataElementRuleHeaderField pointOfServiceConditionCodeRuleField 	 
		
			= new DataElementRuleHeaderField ( 
											   POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_ID
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FIELD
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_SUBFIELD
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FIRE		
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_FORMAT
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_MINIMUM_LENGTH
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_MAXIMUM_LENGTH
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_ENCODING
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_DATATYPE
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_SOURCE
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_DIRECTION
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_EXISTENCE
											 , POINT_OF_SERVICE_CONDITION_CODE_025_RULE_HEADER_CHANGE
  		  	       	       		             );

		return pointOfServiceConditionCodeRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE025RuleHeader () {
			
			int id = 25000;
			
			DataElementRuleHeaderField pointOfServiceConditionCodeRuleField = getPointOfServiceConditionCodeRule();
			
			storage.add(pointOfServiceConditionCodeRuleField);
			
			DataElementRuleHeader de025HeaderRule = new DE025RuleHeaderImpl(id, storage);
			
			return de025HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de025RuleHeader = new CreateDE025RuleHeader().createDE025RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de025RuleHeader,fieldList,codeList);
		
		}
}
