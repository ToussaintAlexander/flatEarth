package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE019RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE019RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE019RuleHeader  {

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
	public DataElementRuleHeaderField getAcquiringInstitutionCountryCodeRule() {
	
		DataElementRuleHeaderField acquiringInstitutionCountryCode 	 
		
			= new DataElementRuleHeaderField ( 
											   ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_ID
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_FIELD
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_SUBFIELD
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_FIRE		
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_FORMAT
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_MINIMUM_LENGTH
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_MAXIMUM_LENGTH
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_ENCODING
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_DATATYPE
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_SOURCE
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_DIRECTION
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_EXISTENCE
											 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_HEADER_CHANGE
  		  	       	       		             );

		return acquiringInstitutionCountryCode;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE019RuleHeader () {
			
			int id = 19000;
			
			DataElementRuleHeaderField acquiringInstitutionCountryCode = getAcquiringInstitutionCountryCodeRule();
			
			storage.add(acquiringInstitutionCountryCode);
			
			DataElementRuleHeader de019HeaderRule = new DE019RuleHeaderImpl(id, storage);
			
			return de019HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de019RuleHeader = new CreateDE019RuleHeader().createDE019RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de019RuleHeader,fieldList,codeList);
		
		}
}
