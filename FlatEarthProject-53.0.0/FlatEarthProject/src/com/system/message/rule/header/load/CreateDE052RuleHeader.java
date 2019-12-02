package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE052RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE052RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE052RuleHeader  {

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
											   PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_ID
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FIELD
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_SUBFIELD
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FIRE		
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_FORMAT
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_MINIMUM_LENGTH
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_MAXIMUM_LENGTH
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_ENCODING
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_DATATYPE
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_SOURCE
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_DIRECTION
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_EXISTENCE
											 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE052RuleHeader () {
			
			int id = 52000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de052HeaderRule = new DE052RuleHeaderImpl(id, storage);
			
			return de052HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de052RuleHeader = new CreateDE052RuleHeader().createDE052RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de052RuleHeader,fieldList,codeList);
		
		}
}
