package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE003RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE003RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */	
public class CreateDE003RuleHeader  {

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
		public DataElementRuleHeaderField getTransactionTypeRuleHeader() {
		
			DataElementRuleHeaderField transactionTypeRuleHeaderField 
    	
    			= new DataElementRuleHeaderField ( 
    										       TRANSACTION_TYPE_003_RULE_HEADER_ID
    										     , TRANSACTION_TYPE_003_RULE_HEADER_FIELD
    										     , TRANSACTION_TYPE_003_RULE_HEADER_SUBFIELD
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_FIRE
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_FORMAT
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_MINIMUM_LENGTH
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_ENCODING
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_DATATYPE
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_SOURCE
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_DIRECTION
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_EXISTENCE
				                                 , TRANSACTION_TYPE_003_RULE_HEADER_CHANGE
    						  	                 );
			
			return transactionTypeRuleHeaderField;
			
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DataElementRuleHeaderField getAccountFromRuleHeader() {
			
			DataElementRuleHeaderField accountFromRuleHeaderField 
    	
    			= new DataElementRuleHeaderField ( 
    											   ACCOUNT_FROM_TYPE_003_RULE_HEADER_ID
    										     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIELD
    										     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_SUBFIELD
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIRE
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_FORMAT
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_MINIMUM_LENGTH
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_ENCODING
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_DATATYPE
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_SOURCE
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_DIRECTION
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_EXISTENCE
				                                 , ACCOUNT_FROM_TYPE_003_RULE_HEADER_CHANGE
    						  	                 );
			
			return accountFromRuleHeaderField;
			
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DataElementRuleHeaderField getAccountToRuleHeader() {
			
			DataElementRuleHeaderField accountToRuleHeaderField 
    	
    			= new DataElementRuleHeaderField ( 
    											   ACCOUNT_TO_TYPE_003_RULE_HEADER_ID
    										     , ACCOUNT_TO_TYPE_003_RULE_HEADER_FIELD
    										     , ACCOUNT_TO_TYPE_003_RULE_HEADER_SUBFIELD
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_FIRE
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_FORMAT
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_MINIMUM_LENGTH
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_MAXIMUM_LENGTH
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_ENCODING
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_DATATYPE
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_SOURCE
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_DIRECTION
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_EXISTENCE
				                                 , ACCOUNT_TO_TYPE_003_RULE_HEADER_CHANGE
    						  	                 );
			
			return accountToRuleHeaderField;
			
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public DE003RuleHeaderImpl createDE003RuleHeader() {
			
			int id = 3000;
			
			DataElementRuleHeaderField transactionTypeRuleHeader = getTransactionTypeRuleHeader();
			DataElementRuleHeaderField accountFromRuleHeader = getAccountFromRuleHeader();
			DataElementRuleHeaderField accountToRuleHeader = getAccountToRuleHeader();
			
			storage.add(transactionTypeRuleHeader);
			storage.add(accountFromRuleHeader);
			storage.add(accountToRuleHeader);
			
			DE003RuleHeaderImpl de003RuleHeader = new DE003RuleHeaderImpl(id, storage);
			
			return de003RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DE003RuleHeaderImpl de003RuleHeader = new CreateDE003RuleHeader().createDE003RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de003RuleHeader,fieldList,codeList);
		
		}
}
