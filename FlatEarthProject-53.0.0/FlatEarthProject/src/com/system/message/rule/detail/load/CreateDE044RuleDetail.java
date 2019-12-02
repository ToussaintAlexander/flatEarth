package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE044RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE044RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE044RuleDetail  {

	DataElementRuleDetailField additionalResponseDataRuleField 	 

		= new DataElementRuleDetailField ( 
									       ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_ID
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_FIELD
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_SUBFIELD
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_FIRE
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_TYPE
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_GROUP
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_BL
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_AL
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_TL
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_SEQUENCE
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_POINTER
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_VALUE
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_CU
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_CT
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_MU
		                                 , ADDITIONAL_RESPONSE_DATA_044_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE044RuleDetail() {
			
			int id = 0;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(additionalResponseDataRuleField);
			
			DataElementRuleDetail de044RuleDetail = new DE044RuleDetailImpl(id, storage);
			
			return de044RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de044RuleDetail = new CreateDE044RuleDetail().createDE044RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de044RuleDetail, fieldList,codeList );
		
		}
}
