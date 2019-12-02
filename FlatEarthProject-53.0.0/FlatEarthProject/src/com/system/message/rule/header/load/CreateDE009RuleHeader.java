package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE009RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE009RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE009RuleHeader  {

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
    	public DataElementRuleHeaderField getSettlementConversionRateRuleHeader() {

    		DataElementRuleHeaderField settlementConversionRateRuleHeaderField 
    		
    			= new DataElementRuleHeaderField (  
    										       SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ID
    										     , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FIELD
    										     , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_SUBFIELD
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FIRE
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_FORMAT
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_MINIMUM_LENGTH
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_MAXIMUM_LENGTH
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_ENCODING
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_DATATYPE
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_SOURCE
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_DIRECTION
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_EXISTENCE
		                   				         , SETTLEMENT_CONVERSION_RATE_009_RULE_HEADER_CHANGE
    						   	                 );

    		return settlementConversionRateRuleHeaderField;
    		
    	}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DE009RuleHeaderImpl createDE009RuleHeader() {
			
			int id = 9000;
			
			DataElementRuleHeaderField settlementConversionRateRuleHeader  = getSettlementConversionRateRuleHeader();
			
			storage.add(settlementConversionRateRuleHeader);
			
			DE009RuleHeaderImpl de009RuleHeader = new DE009RuleHeaderImpl(id, storage);
			
			return de009RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DE009RuleHeaderImpl de009RuleHeader = new CreateDE009RuleHeader().createDE009RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de009RuleHeader,fieldList,codeList);
		
		}
}
