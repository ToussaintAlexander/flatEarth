package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE051RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE051RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE051RuleHeader  {

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
											   CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_ID
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_FIELD
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_SUBFIELD
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_FIRE		
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_FORMAT
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_MINIMUM_LENGTH
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_MAXIMUM_LENGTH
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_ENCODING
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_DATATYPE
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_SOURCE
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_DIRECTION
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_EXISTENCE
											 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE051RuleHeader () {
			
			int id = 51000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de051HeaderRule = new DE051RuleHeaderImpl(id, storage);
			
			return de051HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de051RuleHeader = new CreateDE051RuleHeader().createDE051RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de051RuleHeader,fieldList,codeList);
		
		}
}
