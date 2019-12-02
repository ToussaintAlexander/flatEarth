package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE005RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE005RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE005RuleHeader {

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
    	public DataElementRuleHeaderField getSettlementAmountRuleHeader() {

    		DataElementRuleHeaderField settlementAmount005RuleHeaderField 
    		
    			= new DataElementRuleHeaderField (  
    					                           SETTLEMENT_AMOUNT_005_RULE_HEADER_ID
    					                         , SETTLEMENT_AMOUNT_005_RULE_HEADER_FIELD
    					                         , SETTLEMENT_AMOUNT_005_RULE_HEADER_SUBFIELD
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_FIRE
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_FORMAT
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_MINIMUM_LENGTH
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_MAXIMUM_LENGTH
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_ENCODING
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_DATATYPE
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_SOURCE
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_DIRECTION
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_EXISTENCE
		       			   			             , SETTLEMENT_AMOUNT_005_RULE_HEADER_CHANGE
    						   	                 );
    	    	
    		return settlementAmount005RuleHeaderField;
    		
    	}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DE005RuleHeaderImpl createDE005RuleHeader() {
			
			int id = 5000;
			
			DataElementRuleHeaderField settlementAmountRuleHeader = getSettlementAmountRuleHeader();
			
			storage.add(settlementAmountRuleHeader);
			
			DE005RuleHeaderImpl de005RuleHeader = new DE005RuleHeaderImpl(id, storage);
			
			return de005RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DE005RuleHeaderImpl de005RuleHeader = new CreateDE005RuleHeader().createDE005RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de005RuleHeader,fieldList,codeList);
		
		}
}
