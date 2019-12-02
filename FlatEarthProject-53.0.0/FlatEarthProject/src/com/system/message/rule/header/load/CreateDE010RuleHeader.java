package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE010RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE010RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE010RuleHeader  {

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
	public DataElementRuleHeaderField getCardholderBillingConversionRateRule() {
	
		DataElementRuleHeaderField cardholderBillingConversionRate 	 
		
			= new DataElementRuleHeaderField ( 
											   CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_ID
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FIELD
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_SUBFIELD
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FIRE		
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_FORMAT
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_MINIMUM_LENGTH
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_MAXIMUM_LENGTH
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_ENCODING
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_DATATYPE
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_SOURCE
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_DIRECTION
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_EXISTENCE
											 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_HEADER_CHANGE
  		  	       	       		             );

		return cardholderBillingConversionRate;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE010RuleHeader () {
			
			int id = 10000;
			
			DataElementRuleHeaderField cardholderBillingConversionRate = getCardholderBillingConversionRateRule();
			
			storage.add(cardholderBillingConversionRate);
			
			DataElementRuleHeader de010HeaderRule = new DE010RuleHeaderImpl(id, storage);
			
			return de010HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de010RuleHeader = new CreateDE010RuleHeader().createDE010RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de010RuleHeader,fieldList,codeList);
		
		}
}
