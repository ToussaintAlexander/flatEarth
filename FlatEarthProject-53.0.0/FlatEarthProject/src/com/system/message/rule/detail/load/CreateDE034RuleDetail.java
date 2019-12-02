package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE034RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE034RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE034RuleDetail  {

	DataElementRuleDetailField extendedPrimaryAccountNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_ID
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_FIELD
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_SUBFIELD
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_FIRE
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_TYPE
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_GROUP
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_BL
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_AL
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_TL
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_SEQUENCE
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_POINTER
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_VALUE
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_CU
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_CT
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_MU
		                                 , EXTENDED_PRIMARY_ACCOUNT_NUMBER_034_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE034RuleDetail() {
			
			int id = 34000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(extendedPrimaryAccountNumberRuleField);
			
			DataElementRuleDetail de034RuleDetail = new DE034RuleDetailImpl(id, storage);
			
			return de034RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de034RuleDetail = new CreateDE034RuleDetail().createDE034RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de034RuleDetail, fieldList,codeList );
		
		}
}
