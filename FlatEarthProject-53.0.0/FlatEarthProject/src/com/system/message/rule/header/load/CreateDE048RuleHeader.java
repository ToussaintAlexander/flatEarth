package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE048RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE048RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE048RuleHeader  {

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
											   ADDITIONAL_DATA_048_RULE_HEADER_ID
											 , ADDITIONAL_DATA_048_RULE_HEADER_FIELD
											 , ADDITIONAL_DATA_048_RULE_HEADER_SUBFIELD
											 , ADDITIONAL_DATA_048_RULE_HEADER_FIRE		
											 , ADDITIONAL_DATA_048_RULE_HEADER_FORMAT
											 , ADDITIONAL_DATA_048_RULE_HEADER_MINIMUM_LENGTH
											 , ADDITIONAL_DATA_048_RULE_HEADER_MAXIMUM_LENGTH
											 , ADDITIONAL_DATA_048_RULE_HEADER_ENCODING
											 , ADDITIONAL_DATA_048_RULE_HEADER_DATATYPE
											 , ADDITIONAL_DATA_048_RULE_HEADER_SOURCE
											 , ADDITIONAL_DATA_048_RULE_HEADER_DIRECTION
											 , ADDITIONAL_DATA_048_RULE_HEADER_EXISTENCE
											 , ADDITIONAL_DATA_048_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE048RuleHeader () {
			
			int id = 48000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de048HeaderRule = new DE048RuleHeaderImpl(id, storage);
			
			return de048HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de048RuleHeader = new CreateDE048RuleHeader().createDE048RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de048RuleHeader,fieldList,codeList);
		
		}
}
