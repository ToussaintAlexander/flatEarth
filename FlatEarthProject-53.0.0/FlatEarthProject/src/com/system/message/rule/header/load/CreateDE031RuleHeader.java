package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE031RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE031RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE031RuleHeader  {

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
	public DataElementRuleHeaderField getAccountEntryRule() {
	
		DataElementRuleHeaderField accountEntryRule 	 
		
			= new DataElementRuleHeaderField ( 
											   ACCOUNT_ENTRY_031_RULE_HEADER_ID
											 , ACCOUNT_ENTRY_031_RULE_HEADER_FIELD
											 , ACCOUNT_ENTRY_031_RULE_HEADER_SUBFIELD
											 , ACCOUNT_ENTRY_031_RULE_HEADER_FIRE		
											 , ACCOUNT_ENTRY_031_RULE_HEADER_FORMAT
											 , ACCOUNT_ENTRY_031_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_ENTRY_031_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_ENTRY_031_RULE_HEADER_ENCODING
											 , ACCOUNT_ENTRY_031_RULE_HEADER_DATATYPE
											 , ACCOUNT_ENTRY_031_RULE_HEADER_SOURCE
											 , ACCOUNT_ENTRY_031_RULE_HEADER_DIRECTION
											 , ACCOUNT_ENTRY_031_RULE_HEADER_EXISTENCE
											 , ACCOUNT_ENTRY_031_RULE_HEADER_CHANGE
  		  	       	       		             );

		return accountEntryRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getSettlementProcessingFeeAmountRule() {
	
		DataElementRuleHeaderField settlementProcessingFeeAmountRule 	 
		
			= new DataElementRuleHeaderField ( 
											   SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_ID
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_FIELD
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_SUBFIELD
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_FIRE		
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_FORMAT
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_MINIMUM_LENGTH
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_MAXIMUM_LENGTH
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_ENCODING
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_DATATYPE
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_SOURCE
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_DIRECTION
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_EXISTENCE
											 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_HEADER_CHANGE
  		  	       	       		             );

		return settlementProcessingFeeAmountRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE031RuleHeader () {
			
			int id = 31000;
			
			DataElementRuleHeaderField accountEntryRule = getAccountEntryRule();
			DataElementRuleHeaderField settlementProcessingFeeAmountRule = getSettlementProcessingFeeAmountRule();
			
			storage.add(accountEntryRule);
			storage.add(settlementProcessingFeeAmountRule);
			
			DataElementRuleHeader de031HeaderRule = new DE031RuleHeaderImpl(id, storage);
			
			return de031HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de031RuleHeader = new CreateDE031RuleHeader().createDE031RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de031RuleHeader,fieldList,codeList);
		
		}
}
