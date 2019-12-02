package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE021RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE021RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE021RuleHeader  {

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
	public DataElementRuleHeaderField getforwardingInstitutionCountryCodeRule() {
	
		DataElementRuleHeaderField forwardingInstitutionCountryCode 	 
		
			= new DataElementRuleHeaderField ( 
											   FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_ID
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FIELD
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_SUBFIELD
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FIRE		
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_FORMAT
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_MINIMUM_LENGTH
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_MAXIMUM_LENGTH
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_ENCODING
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_DATATYPE
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_SOURCE
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_DIRECTION
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_EXISTENCE
											 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_HEADER_CHANGE
  		  	       	       		             );

		return forwardingInstitutionCountryCode;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE021RuleHeader () {
			
			int id = 21000;
			
			DataElementRuleHeaderField forwardingInstitutionCountryCode = getforwardingInstitutionCountryCodeRule();
			
			storage.add(forwardingInstitutionCountryCode);
			
			DataElementRuleHeader de021HeaderRule = new DE021RuleHeaderImpl(id, storage);
			
			return de021HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de021RuleHeader = new CreateDE021RuleHeader().createDE021RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de021RuleHeader,fieldList,codeList);
		
		}
}
