package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE020RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE020RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE020RuleDetail  {

	DataElementRuleDetailField panExtendedCountryCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_ID
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_FIELD
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_SUBFIELD
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_FIRE
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_TYPE
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_GROUP
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_BL
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_AL
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_TL
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_SEQUENCE
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_POINTER
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_VALUE
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_CU
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_CT
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_MU
		                                 , PAN_EXTENDED_COUNTRY_CODE_020_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE020RuleDetail() {
			
			int id = 20000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(panExtendedCountryCodeRuleField);
			
			DataElementRuleDetail de020RuleDetail = new DE020RuleDetailImpl(id, storage);
			
			return de020RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de020RuleDetail = new CreateDE020RuleDetail().createDE020RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de020RuleDetail, fieldList,codeList );
		
		}
}
