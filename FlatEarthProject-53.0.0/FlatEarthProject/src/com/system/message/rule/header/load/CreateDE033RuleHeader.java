package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE033RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE033RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE033RuleHeader  {

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
	public DataElementRuleHeaderField getForwardingInstitutionIdentificationCodeRule() {
	
		DataElementRuleHeaderField forwardingInstitutionIdentificationCodeRuleField 	 
		
			= new DataElementRuleHeaderField ( 
											   FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_ID
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FIELD
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_SUBFIELD
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FIRE		
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_FORMAT
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_MINIMUM_LENGTH
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_MAXIMUM_LENGTH
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_ENCODING
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_DATATYPE
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_SOURCE
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_DIRECTION
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_EXISTENCE
											 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_HEADER_CHANGE
  		  	       	       		             );

		return forwardingInstitutionIdentificationCodeRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE033RuleHeader () {
			
			int id = 33000;
			
			DataElementRuleHeaderField forwardingInstitutionIdentificationCodeRule = getForwardingInstitutionIdentificationCodeRule();
			
			storage.add(forwardingInstitutionIdentificationCodeRule);
			
			DataElementRuleHeader de033HeaderRule = new DE033RuleHeaderImpl(id, storage);
			
			return de033HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de033RuleHeader = new CreateDE033RuleHeader().createDE033RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de033RuleHeader,fieldList,codeList);
		
		}
}
