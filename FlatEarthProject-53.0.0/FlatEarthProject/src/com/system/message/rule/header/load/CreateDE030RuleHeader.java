package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE030RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE030RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE030RuleHeader  {

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
											   ACCOUNT_ENTRY_030_RULE_HEADER_ID
											 , ACCOUNT_ENTRY_030_RULE_HEADER_FIELD
											 , ACCOUNT_ENTRY_030_RULE_HEADER_SUBFIELD
											 , ACCOUNT_ENTRY_030_RULE_HEADER_FIRE		
											 , ACCOUNT_ENTRY_030_RULE_HEADER_FORMAT
											 , ACCOUNT_ENTRY_030_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_ENTRY_030_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_ENTRY_030_RULE_HEADER_ENCODING
											 , ACCOUNT_ENTRY_030_RULE_HEADER_DATATYPE
											 , ACCOUNT_ENTRY_030_RULE_HEADER_SOURCE
											 , ACCOUNT_ENTRY_030_RULE_HEADER_DIRECTION
											 , ACCOUNT_ENTRY_030_RULE_HEADER_EXISTENCE
											 , ACCOUNT_ENTRY_030_RULE_HEADER_CHANGE
  		  	       	       		             );

		return accountEntryRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getTransactionProcessingFeeAmountRule() {
	
		DataElementRuleHeaderField transactionProcessingFeeAmountRule 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_ID
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_FIELD
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_SUBFIELD
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_FIRE		
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_FORMAT
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_ENCODING
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_DATATYPE
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_SOURCE
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_DIRECTION
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_EXISTENCE
											 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_HEADER_CHANGE
  		  	       	       		             );

		return transactionProcessingFeeAmountRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE030RuleHeader () {
			
			int id = 30000;
			
			DataElementRuleHeaderField accountEntryRule = getAccountEntryRule();
			DataElementRuleHeaderField transactionProcessingFeeAmountRule = getTransactionProcessingFeeAmountRule();
			
			storage.add(accountEntryRule);
			storage.add(transactionProcessingFeeAmountRule);
			
			DataElementRuleHeader de030HeaderRule = new DE030RuleHeaderImpl(id, storage);
			
			return de030HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de030RuleHeader = new CreateDE030RuleHeader().createDE030RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de030RuleHeader,fieldList,codeList);
		
		}
}
