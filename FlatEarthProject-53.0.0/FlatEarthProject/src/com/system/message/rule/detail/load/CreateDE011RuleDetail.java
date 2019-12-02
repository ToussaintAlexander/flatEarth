package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE011RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE011RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE011RuleDetail  {

	DataElementRuleDetailField systemTraceAuditNumberRuleField 	 

		= new DataElementRuleDetailField ( 
		                                   SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_ID
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_FIELD
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_SUBFIELD
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_FIRE
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_TYPE
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_GROUP
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_BL
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_AL
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_TL
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_SEQUENCE
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_POINTER
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_VALUE
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_CU
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_CT
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_MU
		                                 , SYSTEM_TRACE_AUDIT_NUMBER_011_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE011RuleDetail() {
			
			int id = 11000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(systemTraceAuditNumberRuleField);
			
			DataElementRuleDetail de011RuleDetail = new DE011RuleDetailImpl(id, storage);
			
			return de011RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de011RuleDetail = new CreateDE011RuleDetail().createDE011RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de011RuleDetail, fieldList,codeList );
		
		}
}
