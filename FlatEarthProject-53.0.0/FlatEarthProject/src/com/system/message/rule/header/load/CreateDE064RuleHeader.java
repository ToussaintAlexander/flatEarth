package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE064RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE064RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE064RuleHeader  {

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
											   MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_ID
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FIELD
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_SUBFIELD
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FIRE		
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_FORMAT
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_MINIMUM_LENGTH
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_MAXIMUM_LENGTH
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_ENCODING
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_DATATYPE
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_SOURCE
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_DIRECTION
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_EXISTENCE
											 , MESSAGE_AUTHENTICATION_CODE_064_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE064RuleHeader () {
			
			int id = 64000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de064HeaderRule = new DE064RuleHeaderImpl(id, storage);
			
			return de064HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de064RuleHeader = new CreateDE064RuleHeader().createDE064RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de064RuleHeader,fieldList,codeList);
		
		}
}		
