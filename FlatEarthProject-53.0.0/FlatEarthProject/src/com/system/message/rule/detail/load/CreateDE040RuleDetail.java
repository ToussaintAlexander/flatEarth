package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE040RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE040RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE040RuleDetail  {

	DataElementRuleDetailField unassignedDataElement040RuleField 	 

		= new DataElementRuleDetailField ( 
									       SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_ID
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_FIELD
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_SUBFIELD
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_FIRE
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_TYPE
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_GROUP
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_BL
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_AL
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_TL
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_SEQUENCE
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_POINTER
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_VALUE
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_CU
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_CT
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_MU
		                                 , SERVICE_RESTRICTION_CODE_040_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE040RuleDetail() {
			
			int id = 40000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement040RuleField);
			
			DataElementRuleDetail de040RuleDetail = new DE040RuleDetailImpl(id, storage);
			
			return de040RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de040RuleDetail = new CreateDE040RuleDetail().createDE040RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de040RuleDetail, fieldList,codeList );
		
		}
}
