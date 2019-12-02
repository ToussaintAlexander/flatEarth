package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE054RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE054RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE054RuleHeader  {

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
											   ACCOUNT_TYPE_054_RULE_HEADER_ID
											 , ACCOUNT_TYPE_054_RULE_HEADER_FIELD
											 , ACCOUNT_TYPE_054_RULE_HEADER_SUBFIELD
											 , ACCOUNT_TYPE_054_RULE_HEADER_FIRE		
											 , ACCOUNT_TYPE_054_RULE_HEADER_FORMAT
											 , ACCOUNT_TYPE_054_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_TYPE_054_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_TYPE_054_RULE_HEADER_ENCODING
											 , ACCOUNT_TYPE_054_RULE_HEADER_DATATYPE
											 , ACCOUNT_TYPE_054_RULE_HEADER_SOURCE
											 , ACCOUNT_TYPE_054_RULE_HEADER_DIRECTION
											 , ACCOUNT_TYPE_054_RULE_HEADER_EXISTENCE
											 , ACCOUNT_TYPE_054_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   AMOUNT_TYPE_054_RULE_HEADER_ID
											 , AMOUNT_TYPE_054_RULE_HEADER_FIELD
											 , AMOUNT_TYPE_054_RULE_HEADER_SUBFIELD
											 , AMOUNT_TYPE_054_RULE_HEADER_FIRE		
											 , AMOUNT_TYPE_054_RULE_HEADER_FORMAT
											 , AMOUNT_TYPE_054_RULE_HEADER_MINIMUM_LENGTH
											 , AMOUNT_TYPE_054_RULE_HEADER_MAXIMUM_LENGTH
											 , AMOUNT_TYPE_054_RULE_HEADER_ENCODING
											 , AMOUNT_TYPE_054_RULE_HEADER_DATATYPE
											 , AMOUNT_TYPE_054_RULE_HEADER_SOURCE
											 , AMOUNT_TYPE_054_RULE_HEADER_DIRECTION
											 , AMOUNT_TYPE_054_RULE_HEADER_EXISTENCE
											 , AMOUNT_TYPE_054_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   CURRENCY_CODE_054_RULE_HEADER_ID
											 , CURRENCY_CODE_054_RULE_HEADER_FIELD
											 , CURRENCY_CODE_054_RULE_HEADER_SUBFIELD
											 , CURRENCY_CODE_054_RULE_HEADER_FIRE		
											 , CURRENCY_CODE_054_RULE_HEADER_FORMAT
											 , CURRENCY_CODE_054_RULE_HEADER_MINIMUM_LENGTH
											 , CURRENCY_CODE_054_RULE_HEADER_MAXIMUM_LENGTH
											 , CURRENCY_CODE_054_RULE_HEADER_ENCODING
											 , CURRENCY_CODE_054_RULE_HEADER_DATATYPE
											 , CURRENCY_CODE_054_RULE_HEADER_SOURCE
											 , CURRENCY_CODE_054_RULE_HEADER_DIRECTION
											 , CURRENCY_CODE_054_RULE_HEADER_EXISTENCE
											 , CURRENCY_CODE_054_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   ACCOUNT_ENTRY_054_RULE_HEADER_ID
											 , ACCOUNT_ENTRY_054_RULE_HEADER_FIELD
											 , ACCOUNT_ENTRY_054_RULE_HEADER_SUBFIELD
											 , ACCOUNT_ENTRY_054_RULE_HEADER_FIRE		
											 , ACCOUNT_ENTRY_054_RULE_HEADER_FORMAT
											 , ACCOUNT_ENTRY_054_RULE_HEADER_MINIMUM_LENGTH
											 , ACCOUNT_ENTRY_054_RULE_HEADER_MAXIMUM_LENGTH
											 , ACCOUNT_ENTRY_054_RULE_HEADER_ENCODING
											 , ACCOUNT_ENTRY_054_RULE_HEADER_DATATYPE
											 , ACCOUNT_ENTRY_054_RULE_HEADER_SOURCE
											 , ACCOUNT_ENTRY_054_RULE_HEADER_DIRECTION
											 , ACCOUNT_ENTRY_054_RULE_HEADER_EXISTENCE
											 , ACCOUNT_ENTRY_054_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   AMOUNT_054_RULE_HEADER_ID
											 , AMOUNT_054_RULE_HEADER_FIELD
											 , AMOUNT_054_RULE_HEADER_SUBFIELD
											 , AMOUNT_054_RULE_HEADER_FIRE		
											 , AMOUNT_054_RULE_HEADER_FORMAT
											 , AMOUNT_054_RULE_HEADER_MINIMUM_LENGTH
											 , AMOUNT_054_RULE_HEADER_MAXIMUM_LENGTH
											 , AMOUNT_054_RULE_HEADER_ENCODING
											 , AMOUNT_054_RULE_HEADER_DATATYPE
											 , AMOUNT_054_RULE_HEADER_SOURCE
											 , AMOUNT_054_RULE_HEADER_DIRECTION
											 , AMOUNT_054_RULE_HEADER_EXISTENCE
											 , AMOUNT_054_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE054RuleHeader () {
			
			int id = 54000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			
			DataElementRuleHeader de054HeaderRule = new DE054RuleHeaderImpl(id, storage);
			
			return de054HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de054RuleHeader = new CreateDE054RuleHeader().createDE054RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de054RuleHeader,fieldList,codeList);
		
		}
}
