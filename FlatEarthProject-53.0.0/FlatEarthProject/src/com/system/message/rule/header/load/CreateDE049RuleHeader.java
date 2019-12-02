package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE049RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE049RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE049RuleHeader  {

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
	public DataElementRuleHeaderField getDataElementRuleField01() {
	
		DataElementRuleHeaderField dataElementField01 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_ID
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_FIELD
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_SUBFIELD
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_FIRE		
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_FORMAT
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_MINIMUM_LENGTH
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_ENCODING
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_DATATYPE
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_SOURCE
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_DIRECTION
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_EXISTENCE
											 , TRANSACTION_CURRENCY_CODE_049_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE049RuleHeader () {
			
			int id = 49000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de049HeaderRule = new DE049RuleHeaderImpl(id, storage);
			
			return de049HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de049RuleHeader = new CreateDE049RuleHeader().createDE049RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de049RuleHeader,fieldList,codeList);
		
		}
}
