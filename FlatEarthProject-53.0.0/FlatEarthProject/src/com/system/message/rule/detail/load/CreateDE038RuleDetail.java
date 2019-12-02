package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE038RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE038RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE038RuleDetail  {

	DataElementRuleDetailField authorizationIdentificationResponseRuleField 	 

		= new DataElementRuleDetailField ( 
									       AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_ID
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_FIELD
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_SUBFIELD
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_FIRE
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_TYPE
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_GROUP
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_BL
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_AL
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_TL
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_SEQUENCE
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_POINTER
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_VALUE
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_CU
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_CT
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_MU
		                                 , AUTHORIZATION_IDENTIFICATION_RESPONSE_038_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE038RuleDetail() {
			
			int id = 38000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(authorizationIdentificationResponseRuleField);
			
			DataElementRuleDetail de038RuleDetail = new DE038RuleDetailImpl(id, storage);
			
			return de038RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de038RuleDetail = new CreateDE038RuleDetail().createDE038RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de038RuleDetail, fieldList,codeList );
		
		}
}
