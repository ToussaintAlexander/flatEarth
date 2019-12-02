package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE056RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE056RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE056RuleHeader  {

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
											   UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_ID
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_FIELD
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_SUBFIELD
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_FIRE		
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_FORMAT
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_MINIMUM_LENGTH
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_MAXIMUM_LENGTH
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_ENCODING
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_DATATYPE
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_SOURCE
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_DIRECTION
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_EXISTENCE
											 , UNASSIGNED_DATA_ELEMENT_056_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE056RuleHeader () {
			
			int id = 56000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de056HeaderRule = new DE056RuleHeaderImpl(id, storage);
			
			return de056HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de056RuleHeader = new CreateDE056RuleHeader().createDE056RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de056RuleHeader,fieldList,codeList);
		
		}
}
