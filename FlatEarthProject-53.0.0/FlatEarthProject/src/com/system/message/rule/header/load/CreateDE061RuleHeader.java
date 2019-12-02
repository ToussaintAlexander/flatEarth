package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE061RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE061RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE061RuleHeader  {

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
											   TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_ID
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_FIELD
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_SUBFIELD
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_FIRE		
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_FORMAT
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_ENCODING
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_DATATYPE
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_SOURCE
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_DIRECTION
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_EXISTENCE
											 , TRANSACTION_OTHER_AMOUNT_061_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_ID
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_FIELD
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_SUBFIELD
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_FIRE		
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_FORMAT
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_MINIMUM_LENGTH
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_MAXIMUM_LENGTH
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_ENCODING
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_DATATYPE
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_SOURCE
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_DIRECTION
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_EXISTENCE
											 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE061RuleHeader () {
			
			int id = 61000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			
			DataElementRuleHeader de061HeaderRule = new DE061RuleHeaderImpl(id, storage);
			
			return de061HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de061RuleHeader = new CreateDE061RuleHeader().createDE061RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de061RuleHeader,fieldList,codeList);
		
		}
}
		
