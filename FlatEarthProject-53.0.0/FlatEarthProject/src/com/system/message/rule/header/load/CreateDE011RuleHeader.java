package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE011RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE011RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE011RuleHeader  {

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
	public DataElementRuleHeaderField getSystemTraceAuditNumberRule() {
	
		DataElementRuleHeaderField systemTraceAuditNumber 	 
		
			= new DataElementRuleHeaderField ( 
	                 						   SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_ID
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_FIELD
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_SUBFIELD
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_FIRE
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_FORMAT
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_MINIMUM_LENGTH
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_MAXIMUM_LENGTH
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_ENCODING
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_DATATYPE
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_SOURCE
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_DIRECTION
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_EXISTENCE
	                 						 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_HEADER_CHANGE
  		  	       	       		             );

		return systemTraceAuditNumber;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE011RuleHeader () {
			
			int id = 11000;
			
			DataElementRuleHeaderField systemTraceAuditNumber = getSystemTraceAuditNumberRule();
			
			storage.add(systemTraceAuditNumber);
			
			DataElementRuleHeader de011HeaderRule = new DE011RuleHeaderImpl(id, storage);
			
			return de011HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de011RuleHeader = new CreateDE011RuleHeader().createDE011RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de011RuleHeader,fieldList,codeList);
		
		}
}
