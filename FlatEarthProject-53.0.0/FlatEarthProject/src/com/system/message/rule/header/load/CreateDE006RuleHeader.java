package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE006RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE006RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE006RuleHeader {

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
    	public DataElementRuleHeaderField getCardholderBillingAmountRuleHeader() {
    		
    		DataElementRuleHeaderField cardholderBillingAmountRuleHeaderField 
    		
    			= new DataElementRuleHeaderField ( 
    								               CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_ID
    								             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_FIELD
    								             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_SUBFIELD
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_FIRE
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_FORMAT
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_MINIMUM_LENGTH
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_MAXIMUM_LENGTH
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_ENCODING
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_DATATYPE
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_SOURCE
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_DIRECTION
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_EXISTENCE
		                   			             , CARDHOLDER_BILLING_AMOUNT_006_RULE_HEADER_CHANGE
    						                     );

    		return cardholderBillingAmountRuleHeaderField;
    		
    	}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DE006RuleHeaderImpl createDE006RuleHeader() {
			
			int id = 6000;
			
			DataElementRuleHeaderField cardholderBillingAmountRuleHeader = getCardholderBillingAmountRuleHeader();
			
			storage.add(cardholderBillingAmountRuleHeader);
			
			DE006RuleHeaderImpl de006RuleHeader = new DE006RuleHeaderImpl(id, storage);
			
			return de006RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DE006RuleHeaderImpl de006RuleHeader	= new CreateDE006RuleHeader().createDE006RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de006RuleHeader,fieldList,codeList);
		
		}
}