package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE047RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE047RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE047RuleHeader  {

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
											   ADDITIONAL_DATA_047_RULE_HEADER_ID
											 , ADDITIONAL_DATA_047_RULE_HEADER_FIELD
											 , ADDITIONAL_DATA_047_RULE_HEADER_SUBFIELD
											 , ADDITIONAL_DATA_047_RULE_HEADER_FIRE		
											 , ADDITIONAL_DATA_047_RULE_HEADER_FORMAT
											 , ADDITIONAL_DATA_047_RULE_HEADER_MINIMUM_LENGTH
											 , ADDITIONAL_DATA_047_RULE_HEADER_MAXIMUM_LENGTH
											 , ADDITIONAL_DATA_047_RULE_HEADER_ENCODING
											 , ADDITIONAL_DATA_047_RULE_HEADER_DATATYPE
											 , ADDITIONAL_DATA_047_RULE_HEADER_SOURCE
											 , ADDITIONAL_DATA_047_RULE_HEADER_DIRECTION
											 , ADDITIONAL_DATA_047_RULE_HEADER_EXISTENCE
											 , ADDITIONAL_DATA_047_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE047RuleHeader () {
			
			int id = 47000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de047HeaderRule = new DE047RuleHeaderImpl(id, storage);
			
			return de047HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de047RuleHeader = new CreateDE047RuleHeader().createDE047RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de047RuleHeader,fieldList,codeList);
		
		}
}
