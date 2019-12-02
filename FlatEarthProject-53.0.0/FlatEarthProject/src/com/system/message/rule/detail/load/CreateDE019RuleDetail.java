package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE019RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE019RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE019RuleDetail  {

	DataElementRuleDetailField acquiringInstitutionCountryCodeRuleField 	 

		= new DataElementRuleDetailField ( 
										   ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_ID
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_FIELD
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_SUBFIELD
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_FIRE
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_TYPE
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_GROUP
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_BL
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_AL
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_TL
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_SEQUENCE
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_POINTER
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_VALUE
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_CU
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_CT
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_MU
		                                 , ACQUIRING_INSTITUTION_COUNTRY_CODE_019_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE019RuleDetail() {
			
			int id = 19000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(acquiringInstitutionCountryCodeRuleField);
			
			DataElementRuleDetail de019RuleDetail = new DE019RuleDetailImpl(id, storage);
			
			return de019RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de019RuleDetail = new CreateDE019RuleDetail().createDE019RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de019RuleDetail, fieldList,codeList );
		
		}
}
