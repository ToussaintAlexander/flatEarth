package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE050RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE050RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE050RuleHeader  {

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
											   SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_ID
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_FIELD
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_SUBFIELD
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_FIRE		
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_FORMAT
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_MINIMUM_LENGTH
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_MAXIMUM_LENGTH
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_ENCODING
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_DATATYPE
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_SOURCE
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_DIRECTION
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_EXISTENCE
											 , SETTLEMENT_CURRENCY_CODE_050_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE050RuleHeader () {
			
			int id = 50000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de050HeaderRule = new DE050RuleHeaderImpl(id, storage);
			
			return de050HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de050RuleHeader = new CreateDE050RuleHeader().createDE050RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de050RuleHeader,fieldList,codeList);
		
		}
}
