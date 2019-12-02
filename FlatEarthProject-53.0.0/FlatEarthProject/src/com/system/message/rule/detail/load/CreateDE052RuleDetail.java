package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE052RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE052RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE052RuleDetail  {

	DataElementRuleDetailField personalIdentificationNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_ID
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_FIELD
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_SUBFIELD
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_FIRE
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_TYPE
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_GROUP
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_BL
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_AL
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_TL
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_SEQUENCE
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_POINTER
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_VALUE
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_CU
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_CT
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_MU
		                                 , PERSONAL_IDENTIFICATION_NUMBER_052_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE052RuleDetail() {
			
			int id = 0;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(personalIdentificationNumberRuleField);
			
			DataElementRuleDetail de052RuleDetail = new DE052RuleDetailImpl(id, storage);
			
			return de052RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de052RuleDetail = new CreateDE052RuleDetail().createDE052RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de052RuleDetail, fieldList,codeList );
		
		}
}
