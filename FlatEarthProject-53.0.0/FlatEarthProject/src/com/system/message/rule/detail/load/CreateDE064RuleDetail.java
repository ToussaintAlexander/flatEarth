package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE064RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE064RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE064RuleDetail  {

	DataElementRuleDetailField unassignedDataElement064RuleField 	 

		= new DataElementRuleDetailField ( 
									       MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_ID
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_FIELD
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_SUBFIELD
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_FIRE
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_TYPE
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_GROUP
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_BL
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_AL
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_TL
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_SEQUENCE
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_POINTER
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_VALUE
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_CU
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_CT
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_MU
		                                 , MESSAGE_AUTHENTICATION_CODE_064_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE064RuleDetail() {
			
			int id = 64000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement064RuleField);
			
			DataElementRuleDetail de064RuleDetail = new DE064RuleDetailImpl(id, storage);
			
			return de064RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de064RuleDetail = new CreateDE064RuleDetail().createDE064RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de064RuleDetail, fieldList,codeList );
		
		}
}
