package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE008RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE008RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE008RuleDetail {

	DataElementRuleDetailField cardholderBillingFeeAmountRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_ID
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_FIELD
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_SUBFIELD
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_FIRE
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_TYPE
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_GROUP
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_BL
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_AL
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_TL
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_SEQUENCE
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_POINTER
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_VALUE
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_CU
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_CT
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_MU
	                                     , CARDHOLDER_BILLING_FEE_AMOUNT_008_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE008RuleDetailImpl createDE008RuleDetail() {
		
		int id = 8000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(cardholderBillingFeeAmountRuleDetailField);
		
		DE008RuleDetailImpl de008RuleKey = new DE008RuleDetailImpl(id, ruleDetailList);
		
		return de008RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE008RuleDetailImpl de008RuleDetail	= new CreateDE008RuleDetail().createDE008RuleDetail(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de008RuleDetail, fieldList,codeList );
		
		}
	}
