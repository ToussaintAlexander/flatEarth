package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE057RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE057RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE057RuleHeader  {

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
											   UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_ID
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FIELD
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_SUBFIELD
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FIRE		
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_FORMAT
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_MINIMUM_LENGTH
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_MAXIMUM_LENGTH
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_ENCODING
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_DATATYPE
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_SOURCE
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_DIRECTION
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_EXISTENCE
											 , UNASSIGNED_DATA_ELEMENT_057_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE057RuleHeader () {
			
			int id = 57000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de057HeaderRule = new DE057RuleHeaderImpl(id, storage);
			
			return de057HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de057RuleHeader = new CreateDE057RuleHeader().createDE057RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de057RuleHeader,fieldList,codeList);
		
		}
}
