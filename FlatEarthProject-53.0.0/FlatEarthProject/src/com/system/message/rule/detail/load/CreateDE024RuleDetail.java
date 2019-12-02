package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE024RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE024RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE024RuleDetail  {

	DataElementRuleDetailField functionCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       FUNCTION_CODE_024_RULE_DETAIL_ID
		                                 , FUNCTION_CODE_024_RULE_DETAIL_FIELD
		                                 , FUNCTION_CODE_024_RULE_DETAIL_SUBFIELD
		                                 , FUNCTION_CODE_024_RULE_DETAIL_FIRE
		                                 , FUNCTION_CODE_024_RULE_DETAIL_TYPE
		                                 , FUNCTION_CODE_024_RULE_DETAIL_GROUP
		                                 , FUNCTION_CODE_024_RULE_DETAIL_BL
		                                 , FUNCTION_CODE_024_RULE_DETAIL_AL
		                                 , FUNCTION_CODE_024_RULE_DETAIL_TL
		                                 , FUNCTION_CODE_024_RULE_DETAIL_SEQUENCE
		                                 , FUNCTION_CODE_024_RULE_DETAIL_POINTER
		                                 , FUNCTION_CODE_024_RULE_DETAIL_VALUE
		                                 , FUNCTION_CODE_024_RULE_DETAIL_CU
		                                 , FUNCTION_CODE_024_RULE_DETAIL_CT
		                                 , FUNCTION_CODE_024_RULE_DETAIL_MU
		                                 , FUNCTION_CODE_024_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE024RuleDetail() {
			
			int id = 24000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(functionCodeRuleField);
			
			DataElementRuleDetail de024RuleDetail = new DE024RuleDetailImpl(id, storage);
			
			return de024RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de024RuleDetail = new CreateDE024RuleDetail().createDE024RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de024RuleDetail, fieldList,codeList );
		
		}
}
