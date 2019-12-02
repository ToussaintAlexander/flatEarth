package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE022RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE022RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE022RuleHeader  {

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
	public DataElementRuleHeaderField getTransactionEntryModeRule() {
	
		DataElementRuleHeaderField transactionEntryModeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSACTION_ENTRY_MODE_022_RULE_HEADER_ID
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FIELD
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_SUBFIELD
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FIRE		
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_FORMAT
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_ENCODING
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_DATATYPE
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_SOURCE
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_DIRECTION
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_EXISTENCE
											 , TRANSACTION_ENTRY_MODE_022_RULE_HEADER_CHANGE
  		  	       	       		             );

		return transactionEntryModeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getPinEntryModeRule() {
	
		DataElementRuleHeaderField pinEntryModeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_ENTRY_MODE_022_RULE_HEADER_ID
											 , PIN_ENTRY_MODE_022_RULE_HEADER_FIELD
											 , PIN_ENTRY_MODE_022_RULE_HEADER_SUBFIELD
											 , PIN_ENTRY_MODE_022_RULE_HEADER_FIRE		
											 , PIN_ENTRY_MODE_022_RULE_HEADER_FORMAT
											 , PIN_ENTRY_MODE_022_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_ENTRY_MODE_022_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_ENTRY_MODE_022_RULE_HEADER_ENCODING
											 , PIN_ENTRY_MODE_022_RULE_HEADER_DATATYPE
											 , PIN_ENTRY_MODE_022_RULE_HEADER_SOURCE
											 , PIN_ENTRY_MODE_022_RULE_HEADER_DIRECTION
											 , PIN_ENTRY_MODE_022_RULE_HEADER_EXISTENCE
											 , PIN_ENTRY_MODE_022_RULE_HEADER_CHANGE
  		  	       	       		             );

		return pinEntryModeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE022RuleHeader () {
			
			int id = 22000;
			
			DataElementRuleHeaderField transactionEntryModeRule = getTransactionEntryModeRule();
			DataElementRuleHeaderField pinEntryModeRule = getPinEntryModeRule();
			
			storage.add(transactionEntryModeRule);
			storage.add(pinEntryModeRule);
			
			DataElementRuleHeader de022HeaderRule = new DE022RuleHeaderImpl(id, storage);
			
			return de022HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de022RuleHeader = new CreateDE022RuleHeader().createDE022RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de022RuleHeader,fieldList,codeList);
		
		}
}
