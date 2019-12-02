package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE020RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE020RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE020RuleHeader  {

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
	public DataElementRuleHeaderField getPanExtendedCountryCodeRule() {
	
		DataElementRuleHeaderField panExtendedCountryCode 	 
		
			= new DataElementRuleHeaderField ( 
											   PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_ID
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_FIELD
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_SUBFIELD
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_FIRE		
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_FORMAT
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_MINIMUM_LENGTH
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_MAXIMUM_LENGTH
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_ENCODING
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_DATATYPE
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_SOURCE
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_DIRECTION
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_EXISTENCE
											 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_HEADER_CHANGE
  		  	       	       		             );

		return panExtendedCountryCode;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE020RuleHeader () {
			
			int id = 20000;
			
			DataElementRuleHeaderField panExtendedCountryCode = getPanExtendedCountryCodeRule();
			
			storage.add(panExtendedCountryCode);
			
			DataElementRuleHeader de020HeaderRule = new DE020RuleHeaderImpl(id, storage);
			
			return de020HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de020RuleHeader = new CreateDE020RuleHeader().createDE020RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de020RuleHeader,fieldList,codeList);
		
		}
}
