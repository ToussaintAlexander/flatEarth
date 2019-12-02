package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE034RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE034RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE034RuleHeader  {

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
	
		DataElementRuleHeaderField extendedPrimaryAccountNumber 	 
		
			= new DataElementRuleHeaderField ( 
											   EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_ID
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FIELD
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_SUBFIELD
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FIRE		
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_FORMAT
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_MINIMUM_LENGTH
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_MAXIMUM_LENGTH
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_ENCODING
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_DATATYPE
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_SOURCE
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_DIRECTION
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_EXISTENCE
											 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_HEADER_CHANGE
  		  	       	       		             );

		return extendedPrimaryAccountNumber;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE034RuleHeader () {
			
			int id = 34000;
			
			DataElementRuleHeaderField extendedPrimaryAccountNumber = getDataElementRuleField01();
			
			storage.add(extendedPrimaryAccountNumber);
			
			DataElementRuleHeader de034HeaderRule = new DE034RuleHeaderImpl(id, storage);
			
			return de034HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de034RuleHeader = new CreateDE034RuleHeader().createDE034RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de034RuleHeader,fieldList,codeList);
		
		}
}
