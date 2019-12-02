package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE023RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE023RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE023RuleHeader  {

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
	public DataElementRuleHeaderField getApplicationPanSequenceNumberRule() {
	
		DataElementRuleHeaderField applicationPanSequenceNumber 	 
		
			= new DataElementRuleHeaderField ( 
											   APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_ID
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_FIELD
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_SUBFIELD
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_FIRE		
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_FORMAT
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_MINIMUM_LENGTH
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_MAXIMUM_LENGTH
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_ENCODING
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_DATATYPE
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_SOURCE
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_DIRECTION
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_EXISTENCE
											 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_HEADER_CHANGE
  		  	       	       		             );

		return applicationPanSequenceNumber;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE023RuleHeader () {
			
			int id = 23000;
			
			DataElementRuleHeaderField applicationPanSequenceNumber = getApplicationPanSequenceNumberRule();
			
			storage.add(applicationPanSequenceNumber);
			
			DataElementRuleHeader de023HeaderRule = new DE023RuleHeaderImpl(id, storage);
			
			return de023HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de023RuleHeader = new CreateDE023RuleHeader().createDE023RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de023RuleHeader,fieldList,codeList);
		
		}
}
