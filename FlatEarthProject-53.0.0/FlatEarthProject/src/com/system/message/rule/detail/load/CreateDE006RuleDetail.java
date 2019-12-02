package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE006RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE006RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE006RuleDetail {

	DataElementRuleDetailField cardholderBillingAmountRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_ID
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_FIELD
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_SUBFIELD
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_FIRE
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_TYPE
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_GROUP
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_BL
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_AL
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_TL
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_SEQUENCE
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_POINTER
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_VALUE
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_CU
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_CT
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_MU
	                                     , CARDHOLDER_BILLING_AMOUNT_006_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE006RuleDetailImpl createDE006RuleDetail() {
		
		int id = 6000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(cardholderBillingAmountRuleDetailField);
		
		DE006RuleDetailImpl de006RuleKey = new DE006RuleDetailImpl(id, ruleDetailList);
		
		return de006RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE006RuleDetailImpl de006RuleDetail = new CreateDE006RuleDetail().createDE006RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de006RuleDetail, fieldList,codeList );
		
		}
	}
