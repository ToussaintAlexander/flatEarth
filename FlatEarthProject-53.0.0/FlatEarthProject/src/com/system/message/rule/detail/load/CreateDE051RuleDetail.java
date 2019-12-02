package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE051RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE051RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE051RuleDetail  {

	DataElementRuleDetailField cardholderBillingCurrencyCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_ID
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_FIELD
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_SUBFIELD
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_FIRE
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_TYPE
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_GROUP
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_BL
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_AL
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_TL
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_SEQUENCE
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_POINTER
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_VALUE
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_CU
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_CT
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_MU
		                                 , CARDHOLDER_BILLING_CURRENCY_CODE_051_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE051RuleDetail() {
			
			int id = 51000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(cardholderBillingCurrencyCodeRuleField);
			
			DataElementRuleDetail de051RuleDetail = new DE051RuleDetailImpl(id, storage);
			
			return de051RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de051RuleDetail = new CreateDE051RuleDetail().createDE051RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de051RuleDetail, fieldList,codeList );
		
		}
}
