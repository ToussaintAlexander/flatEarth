package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE039RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE039RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE039RuleDetail  {

	DataElementRuleDetailField responseCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       RESPONSE_CODE_039_RULE_DETAIL_ID
		                                 , RESPONSE_CODE_039_RULE_DETAIL_FIELD
		                                 , RESPONSE_CODE_039_RULE_DETAIL_SUBFIELD
		                                 , RESPONSE_CODE_039_RULE_DETAIL_FIRE
		                                 , RESPONSE_CODE_039_RULE_DETAIL_TYPE
		                                 , RESPONSE_CODE_039_RULE_DETAIL_GROUP
		                                 , RESPONSE_CODE_039_RULE_DETAIL_BL
		                                 , RESPONSE_CODE_039_RULE_DETAIL_AL
		                                 , RESPONSE_CODE_039_RULE_DETAIL_TL
		                                 , RESPONSE_CODE_039_RULE_DETAIL_SEQUENCE
		                                 , RESPONSE_CODE_039_RULE_DETAIL_POINTER
		                                 , RESPONSE_CODE_039_RULE_DETAIL_VALUE
		                                 , RESPONSE_CODE_039_RULE_DETAIL_CU
		                                 , RESPONSE_CODE_039_RULE_DETAIL_CT
		                                 , RESPONSE_CODE_039_RULE_DETAIL_MU
		                                 , RESPONSE_CODE_039_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE039RuleDetail() {
			
			int id = 39000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(responseCodeRuleField);
			
			DataElementRuleDetail de039RuleDetail = new DE039RuleDetailImpl(id, storage);
			
			return de039RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de039RuleDetail = new CreateDE039RuleDetail().createDE039RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de039RuleDetail, fieldList,codeList );
		
		}
}
