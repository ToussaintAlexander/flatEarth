package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE021RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE021RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE021RuleDetail  {

	DataElementRuleDetailField forwardingInstitutionCountryCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_ID
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_FIELD
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_SUBFIELD
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_FIRE
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_TYPE
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_GROUP
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_BL
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_AL
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_TL
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_SEQUENCE
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_POINTER
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_VALUE
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_CU
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_CT
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_MU
		                                 , FORWARDING_INSTITUTION_COUNTRY_CODE_021_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE021RuleDetail() {
			
			int id = 21000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(forwardingInstitutionCountryCodeRuleField);
			
			DataElementRuleDetail de021RuleDetail = new DE021RuleDetailImpl(id, storage);
			
			return de021RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de021RuleDetail = new CreateDE021RuleDetail().createDE021RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de021RuleDetail, fieldList,codeList );
		
		}
}
