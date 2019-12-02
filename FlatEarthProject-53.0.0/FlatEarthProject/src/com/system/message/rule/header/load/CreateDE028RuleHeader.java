package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE028RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE028RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE028RuleHeader  {

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
											   ACCOUNT_ENTRY_028_RULE_HEADER_ID
											 , ACCOUNT_ENTRY_028_RULE_HEADER_FIELD
											 , ACCOUNT_ENTRY_028_RULE_HEADER_SUBFIELD
											 , ACCOUNT_ENTRY_028_RULE_HEADER_FIRE		
											 , ACCOUNT_ENTRY_028_RULE_HEADER_FORMAT
											 , ACCOUNT_ENTRY_028_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_ENTRY_028_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_ENTRY_028_RULE_HEADER_ENCODING
											 , ACCOUNT_ENTRY_028_RULE_HEADER_DATATYPE
											 , ACCOUNT_ENTRY_028_RULE_HEADER_SOURCE
											 , ACCOUNT_ENTRY_028_RULE_HEADER_DIRECTION
											 , ACCOUNT_ENTRY_028_RULE_HEADER_EXISTENCE
											 , ACCOUNT_ENTRY_028_RULE_HEADER_CHANGE
  		  	       	       		             );

		return accountEntryRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getTransactionFeeAmountRule() {
	
		DataElementRuleHeaderField transactionFeeAmountRule 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_ID
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FIELD
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_SUBFIELD
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FIRE		
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_FORMAT
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_ENCODING
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_DATATYPE
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_SOURCE
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_DIRECTION
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_EXISTENCE
											 , TRANSACTION_FEE_AMOUNT_028_RULE_HEADER_CHANGE
  		  	       	       		             );

		return transactionFeeAmountRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE028RuleHeader () {
			
			int id = 28000;
			
			DataElementRuleHeaderField accountEntryRule = getAccountEntryRule();
			DataElementRuleHeaderField transactionFeeAmountRule = getTransactionFeeAmountRule();
			
			storage.add(accountEntryRule);
			storage.add(transactionFeeAmountRule);
			
			DataElementRuleHeader de028HeaderRule = new DE028RuleHeaderImpl(id, storage);
			
			return de028HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de028RuleHeader = new CreateDE028RuleHeader().createDE028RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de028RuleHeader,fieldList,codeList);
		
		}
}
