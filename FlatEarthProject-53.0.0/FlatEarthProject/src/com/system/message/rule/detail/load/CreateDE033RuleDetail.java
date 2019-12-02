package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE033RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE033RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE033RuleDetail  {

	DataElementRuleDetailField forwardingInstitutionIdentificationCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_ID
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_FIELD
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_SUBFIELD
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_FIRE
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_TYPE
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_GROUP
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_BL
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_AL
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_TL
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_SEQUENCE
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_POINTER
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_VALUE
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_CU
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_CT
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_MU
		                                 , FORWARDING_INSTITUTION_IDENTIFICATION_CODE_033_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE033RuleDetail() {
			
			int id = 33000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(forwardingInstitutionIdentificationCodeRuleField);
			
			DataElementRuleDetail de033RuleDetail = new DE033RuleDetailImpl(id, storage);
			
			return de033RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de033RuleDetail = new CreateDE033RuleDetail().createDE033RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de033RuleDetail, fieldList,codeList );
		
		}
}
