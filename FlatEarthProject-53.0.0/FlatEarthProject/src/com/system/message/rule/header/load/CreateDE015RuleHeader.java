package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE015RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE015RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE015RuleHeader  {

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
	public DataElementRuleHeaderField getSettlementDateMonthRule() {
	
		DataElementRuleHeaderField settlementDateMonthField 	 
		
			= new DataElementRuleHeaderField ( 
					 						   SETTLEMENT_DATE_MONTH_015_RULE_HEADER_ID
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FIELD
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_SUBFIELD
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FIRE
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_FORMAT
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_MINIMUM_LENGTH
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_MAXIMUM_LENGTH
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_ENCODING
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_DATATYPE
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_SOURCE
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_DIRECTION
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_EXISTENCE
					 						 , SETTLEMENT_DATE_MONTH_015_RULE_HEADER_CHANGE
  		  	       	       		             );

		return settlementDateMonthField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getSettlementDateDayRule() {
	
		DataElementRuleHeaderField settlementDateDayField 	 
		
			= new DataElementRuleHeaderField ( 
					 						   SETTLEMENT_DATE_DAY_015_RULE_HEADER_ID
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_FIELD
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_SUBFIELD
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_FIRE
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_FORMAT
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_MINIMUM_LENGTH
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_MAXIMUM_LENGTH
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_ENCODING
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_DATATYPE
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_SOURCE
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_DIRECTION
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_EXISTENCE
					 						 , SETTLEMENT_DATE_DAY_015_RULE_HEADER_CHANGE
  		  	       	       		             );

		return settlementDateDayField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE015RuleHeader () {
			
			int id = 15000;
			
			DataElementRuleHeaderField settlementDateMonthField = getSettlementDateMonthRule();
			DataElementRuleHeaderField settlementDateDayField = getSettlementDateDayRule();
			
			storage.add(settlementDateMonthField);
			storage.add(settlementDateDayField);
			
			DataElementRuleHeader de015HeaderRule = new DE015RuleHeaderImpl(id, storage);
			
			return de015HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de015RuleHeader = new CreateDE015RuleHeader().createDE015RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de015RuleHeader,fieldList,codeList);
		
		}
}
