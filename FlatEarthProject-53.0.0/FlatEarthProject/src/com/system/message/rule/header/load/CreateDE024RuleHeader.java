package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE024RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE024RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE024RuleHeader  {

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
	public DataElementRuleHeaderField getFunctionCodeRule() {
	
		DataElementRuleHeaderField functionCodeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   FUNCTION_CODE_024_RULE_HEADER_ID
											 , FUNCTION_CODE_024_RULE_HEADER_FIELD
											 , FUNCTION_CODE_024_RULE_HEADER_SUBFIELD
											 , FUNCTION_CODE_024_RULE_HEADER_FIRE		
											 , FUNCTION_CODE_024_RULE_HEADER_FORMAT
											 , FUNCTION_CODE_024_RULE_HEADER_MINIMUM_LENGTH
											 , FUNCTION_CODE_024_RULE_HEADER_MAXIMUM_LENGTH
											 , FUNCTION_CODE_024_RULE_HEADER_ENCODING
											 , FUNCTION_CODE_024_RULE_HEADER_DATATYPE
											 , FUNCTION_CODE_024_RULE_HEADER_SOURCE
											 , FUNCTION_CODE_024_RULE_HEADER_DIRECTION
											 , FUNCTION_CODE_024_RULE_HEADER_EXISTENCE
											 , FUNCTION_CODE_024_RULE_HEADER_CHANGE
  		  	       	       		             );

		return functionCodeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE024RuleHeader () {
			
			int id = 24000;
			
			DataElementRuleHeaderField functionCodeRule = getFunctionCodeRule();
			
			storage.add(functionCodeRule);
			
			DataElementRuleHeader de024HeaderRule = new DE024RuleHeaderImpl(id, storage);
			
			return de024HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de024RuleHeader = new CreateDE024RuleHeader().createDE024RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de024RuleHeader,fieldList,codeList);
		
		}
}
