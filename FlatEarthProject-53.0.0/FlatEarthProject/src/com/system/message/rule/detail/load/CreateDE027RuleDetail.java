package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE027RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE027RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE027RuleDetail  {

	DataElementRuleDetailField authorizingIdentificationResponseLengthRuleField 	 

		= new DataElementRuleDetailField ( 
									       AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_ID
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_FIELD
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_SUBFIELD
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_FIRE
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_TYPE
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_GROUP
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_BL
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_AL
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_TL
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_SEQUENCE
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_POINTER
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_VALUE
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_CU
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_CT
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_MU
		                                 , AUTHORIZING_IDENTIFICATION_RESPONSE_LENGTH_027_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE027RuleDetail() {
			
			int id = 27000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(authorizingIdentificationResponseLengthRuleField);
			
			DataElementRuleDetail de027RuleDetail = new DE027RuleDetailImpl(id, storage);
			
			return de027RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de027RuleDetail = new CreateDE027RuleDetail().createDE027RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de027RuleDetail, fieldList,codeList );
		
		}
}
