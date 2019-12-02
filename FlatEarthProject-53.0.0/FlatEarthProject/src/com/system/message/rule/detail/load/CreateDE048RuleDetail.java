package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE048RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE048RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE048RuleDetail  {

	DataElementRuleDetailField additionalDataRuleField 	 

		= new DataElementRuleDetailField ( 
									       ADDITIONAL_DATA_048_RULE_DETAIL_ID
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_FIELD
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_SUBFIELD
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_FIRE
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_TYPE
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_GROUP
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_BL
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_AL
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_TL
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_SEQUENCE
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_POINTER
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_VALUE
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_CU
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_CT
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_MU
		                                 , ADDITIONAL_DATA_048_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE048RuleDetail() {
			
			int id = 48000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(additionalDataRuleField);
			
			DataElementRuleDetail de048RuleDetail = new DE048RuleDetailImpl(id, storage);
			
			return de048RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de048RuleDetail = new CreateDE048RuleDetail().createDE048RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de048RuleDetail, fieldList,codeList );
		
		}
}
