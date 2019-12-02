package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE027RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE027RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE027RuleHeader  {

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
	public DataElementRuleHeaderField getAuthorizingIdentificationResponseLengthRule() {
	
		DataElementRuleHeaderField authorizingIdentificationResponseLengthRule 	 
		
			= new DataElementRuleHeaderField ( 
											   AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_ID
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FIELD
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_SUBFIELD
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FIRE		
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_FORMAT
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_MINIMUM_LENGTH
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_MAXIMUM_LENGTH
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_ENCODING
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_DATATYPE
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_SOURCE
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_DIRECTION
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_EXISTENCE
											 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_HEADER_CHANGE
  		  	       	       		             );

		return authorizingIdentificationResponseLengthRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE027RuleHeader () {
			
			int id = 27000;
			
			DataElementRuleHeaderField authorizingIdentificationResponseLengthRule = getAuthorizingIdentificationResponseLengthRule();
			
			storage.add(authorizingIdentificationResponseLengthRule);
			
			DataElementRuleHeader de027HeaderRule = new DE027RuleHeaderImpl(id, storage);
			
			return de027HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de027RuleHeader = new CreateDE027RuleHeader().createDE027RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de027RuleHeader,fieldList,codeList);
		
		}
}
