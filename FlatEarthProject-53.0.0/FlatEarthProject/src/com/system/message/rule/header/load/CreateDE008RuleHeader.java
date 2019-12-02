package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE008RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE008RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE008RuleHeader {

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
    	public DataElementRuleHeaderField getCardholderBillingFeeAmountRuleHeader() {

    		DataElementRuleHeaderField cardholderBillingFeeAmountRuleHeaderField 
    		
    			= new DataElementRuleHeaderField (  
    										       CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_ID
    										     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_FIELD
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_SUBFIELD
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_FIRE
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_FORMAT
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_MINIMUM_LENGTH
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_MAXIMUM_LENGTH
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_ENCODING
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_DATATYPE
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_SOURCE
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_DIRECTION
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_EXISTENCE
		       		       		                 , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_HEADER_CHANGE
    					                         );
    	    	
    		return cardholderBillingFeeAmountRuleHeaderField;
    		
    	}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DE008RuleHeaderImpl createDE008RuleHeader() {
			
			int id = 8000;
			
			DataElementRuleHeaderField cardholderBillingFeeAmountRuleHeader  = getCardholderBillingFeeAmountRuleHeader();
			
			storage.add(cardholderBillingFeeAmountRuleHeader);
			
			DE008RuleHeaderImpl de008RuleHeader = new DE008RuleHeaderImpl(id, storage);
			
			return de008RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DE008RuleHeaderImpl de008RuleHeader = new CreateDE008RuleHeader().createDE008RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de008RuleHeader,fieldList,codeList);
		
		}
}
