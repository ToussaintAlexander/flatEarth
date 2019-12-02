package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE029RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE029RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE029RuleHeader  {

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
											   ACCOUNT_ENTRY_029_RULE_HEADER_ID
											 , ACCOUNT_ENTRY_029_RULE_HEADER_FIELD
											 , ACCOUNT_ENTRY_029_RULE_HEADER_SUBFIELD
											 , ACCOUNT_ENTRY_029_RULE_HEADER_FIRE		
											 , ACCOUNT_ENTRY_029_RULE_HEADER_FORMAT
											 , ACCOUNT_ENTRY_029_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_ENTRY_029_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_ENTRY_029_RULE_HEADER_ENCODING
											 , ACCOUNT_ENTRY_029_RULE_HEADER_DATATYPE
											 , ACCOUNT_ENTRY_029_RULE_HEADER_SOURCE
											 , ACCOUNT_ENTRY_029_RULE_HEADER_DIRECTION
											 , ACCOUNT_ENTRY_029_RULE_HEADER_EXISTENCE
											 , ACCOUNT_ENTRY_029_RULE_HEADER_CHANGE
  		  	       	       		             );

		return accountEntryRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getUnassignedDataElementRule() {
	
		DataElementRuleHeaderField unassignedDataElementRuleField 	 
		
			= new DataElementRuleHeaderField ( 
											   SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_ID
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_FIELD
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_SUBFIELD
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_FIRE		
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_FORMAT
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_MINIMUM_LENGTH
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_MAXIMUM_LENGTH
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_ENCODING
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_DATATYPE
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_SOURCE
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_DIRECTION
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_EXISTENCE
											 , SETTLEMENT_FEE_AMOUNT_029_RULE_HEADER_CHANGE
  		  	       	       		             );

		return unassignedDataElementRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE029RuleHeader () {
			
			int id = 29000;
			
			DataElementRuleHeaderField unassignedDataElementRuleHeaderField = getUnassignedDataElementRule();
			
			storage.add(unassignedDataElementRuleHeaderField);
			
			DataElementRuleHeader de029HeaderRule = new DE029RuleHeaderImpl(id, storage);
			
			return de029HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de029RuleHeader = new CreateDE029RuleHeader().createDE029RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de029RuleHeader,fieldList,codeList);
		
		}
}
