package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE004RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE004RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */	
public class CreateDE004RuleHeader  {

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
	public DataElementRuleHeaderField getTransactionAmountRuleHeader() {
		
		DataElementRuleHeaderField transactionAmountRuleHeaderField 
	
			= new DataElementRuleHeaderField ( 
											   TRANSACTION_AMOUNT_004_RULE_HEADER_ID
									         , TRANSACTION_AMOUNT_004_RULE_HEADER_FIELD
									         , TRANSACTION_AMOUNT_004_RULE_HEADER_SUBFIELD
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_FIRE
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_FORMAT
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_MINIMUM_LENGTH
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_MAXIMUM_LENGTH
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_ENCODING
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_DATATYPE
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_SOURCE
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_DIRECTION
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_EXISTENCE
	                   				         , TRANSACTION_AMOUNT_004_RULE_HEADER_CHANGE
		      			                     );
		
		return transactionAmountRuleHeaderField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DE004RuleHeaderImpl createDE004RuleHeader() {
		
		int id = 4000;
		
		DataElementRuleHeaderField transactionAmountRuleHeader = new CreateDE004RuleHeader().getTransactionAmountRuleHeader();
		
		storage.add(transactionAmountRuleHeader);
		
		DE004RuleHeaderImpl de004RuleHeader = new DE004RuleHeaderImpl(id, storage);
		
		return de004RuleHeader;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		DE004RuleHeaderImpl de004RuleHeader	= new CreateDE004RuleHeader().createDE004RuleHeader();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleHeaderUtils().display(de004RuleHeader,fieldList,codeList);
	
	}
}
