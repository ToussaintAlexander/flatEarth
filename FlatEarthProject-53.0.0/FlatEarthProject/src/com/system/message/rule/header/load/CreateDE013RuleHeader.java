package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE013RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE013RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE013RuleHeader  {

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
	public DataElementRuleHeaderField getLocalTransactionDateMonthRule() {
	
		DataElementRuleHeaderField localTransactionDateMonthRuleField 	 
		
			= new DataElementRuleHeaderField ( 
	                 					       LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_ID
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FIELD
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_SUBFIELD
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FIRE
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_FORMAT
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_MINIMUM_LENGTH
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_MAXIMUM_LENGTH
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_ENCODING
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_DATATYPE
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_SOURCE
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_DIRECTION
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_EXISTENCE
	                 						 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_HEADER_CHANGE
  		  	       	       		             );

		return localTransactionDateMonthRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getLocalTransactionDateDayRule() {
	
		DataElementRuleHeaderField localTransactionDateDayRuleField 	 
		
			= new DataElementRuleHeaderField ( 
	                 					       LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_ID
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FIELD
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_SUBFIELD
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FIRE
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_FORMAT
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_MINIMUM_LENGTH
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_MAXIMUM_LENGTH
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_ENCODING
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_DATATYPE
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_SOURCE
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_DIRECTION
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_EXISTENCE
	                 						 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_HEADER_CHANGE
  		  	       	       		             );

		return localTransactionDateDayRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE013RuleHeader () {
			
			int id = 13000;
			
			DataElementRuleHeaderField localTransactionDateMonth = getLocalTransactionDateMonthRule();
			DataElementRuleHeaderField localTransactionDateDay = getLocalTransactionDateDayRule();
			
			storage.add(localTransactionDateMonth);
			storage.add(localTransactionDateDay);
			
			DataElementRuleHeader de013HeaderRule = new DE013RuleHeaderImpl(id, storage);
			
			return de013HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de013RuleHeader = new CreateDE013RuleHeader().createDE013RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de013RuleHeader,fieldList,codeList);
		
		}
}
