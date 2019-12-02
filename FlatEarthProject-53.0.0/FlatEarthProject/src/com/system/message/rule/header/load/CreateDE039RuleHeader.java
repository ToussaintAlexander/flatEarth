package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE039RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE039RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE039RuleHeader  {

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
											   RESPONSE_CODE_039_RULE_HEADER_ID
											 , RESPONSE_CODE_039_RULE_HEADER_FIELD
											 , RESPONSE_CODE_039_RULE_HEADER_SUBFIELD
											 , RESPONSE_CODE_039_RULE_HEADER_FIRE		
											 , RESPONSE_CODE_039_RULE_HEADER_FORMAT
											 , RESPONSE_CODE_039_RULE_HEADER_MINIMUM_LENGTH
											 , RESPONSE_CODE_039_RULE_HEADER_MAXIMUM_LENGTH
											 , RESPONSE_CODE_039_RULE_HEADER_ENCODING
											 , RESPONSE_CODE_039_RULE_HEADER_DATATYPE
											 , RESPONSE_CODE_039_RULE_HEADER_SOURCE
											 , RESPONSE_CODE_039_RULE_HEADER_DIRECTION
											 , RESPONSE_CODE_039_RULE_HEADER_EXISTENCE
											 , RESPONSE_CODE_039_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE039RuleHeader () {
			
			int id = 39000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de039HeaderRule = new DE039RuleHeaderImpl(id, storage);
			
			return de039HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de039RuleHeader = new CreateDE039RuleHeader().createDE039RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de039RuleHeader,fieldList,codeList);
		
		}
}
