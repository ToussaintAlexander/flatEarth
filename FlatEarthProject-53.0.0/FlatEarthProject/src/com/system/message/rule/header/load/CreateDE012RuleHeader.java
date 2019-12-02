package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE012RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE012RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE012RuleHeader  {

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
	public DataElementRuleHeaderField getLocalTransactionTimeHourRule() {
	
		DataElementRuleHeaderField localTransactionTimeHourRuleField 	 
		
			= new DataElementRuleHeaderField ( 
                                               LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_ID
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FIELD
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_SUBFIELD
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FIRE
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_FORMAT
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_MINIMUM_LENGTH
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_MINIMUM_LENGTH
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_ENCODING
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_DATATYPE
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_SOURCE
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_DIRECTION
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_EXISTENCE
                                             , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_HEADER_CHANGE
  		  	       	       		             );

		return localTransactionTimeHourRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getLocalTransactionTimeMinuteRule() {
	
		DataElementRuleHeaderField localTransactionTimeMinuteRuleField 	 
		
			= new DataElementRuleHeaderField ( 
                    						   LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_ID
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FIELD
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_SUBFIELD
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FIRE
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_FORMAT
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_MINIMUM_LENGTH
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_MINIMUM_LENGTH
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_ENCODING
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_DATATYPE
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_SOURCE
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_DIRECTION
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_EXISTENCE
                    					     , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_HEADER_CHANGE
  		  	       	       		             );

		return localTransactionTimeMinuteRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getLocalTransactionTimeSecondRule() {
	
		DataElementRuleHeaderField localTransactionTimeSecondRuleField 	 
		
			= new DataElementRuleHeaderField ( 
	                                           LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_ID
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FIELD
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_SUBFIELD
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FIRE
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_FORMAT
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_MINIMUM_LENGTH
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_MINIMUM_LENGTH
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_ENCODING
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_DATATYPE
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_SOURCE
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_DIRECTION
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_EXISTENCE
		                                     , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_HEADER_CHANGE
  		  	       	       		             );

		return localTransactionTimeSecondRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE012RuleHeader () {
			
			int id = 12000;
			
			DataElementRuleHeaderField localTransactionTimeHourRule = getLocalTransactionTimeHourRule();
			DataElementRuleHeaderField localTransactionTimeMinuteRule = getLocalTransactionTimeMinuteRule();
			DataElementRuleHeaderField localTransactionTimeSecondRule = getLocalTransactionTimeSecondRule();
			
			storage.add(localTransactionTimeHourRule);
			storage.add(localTransactionTimeMinuteRule);
			storage.add(localTransactionTimeSecondRule);
			
			DataElementRuleHeader de012HeaderRule = new DE012RuleHeaderImpl(id, storage);
			
			return de012HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de012RuleHeader = new CreateDE012RuleHeader().createDE012RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de012RuleHeader,fieldList,codeList);
		
		}
}
