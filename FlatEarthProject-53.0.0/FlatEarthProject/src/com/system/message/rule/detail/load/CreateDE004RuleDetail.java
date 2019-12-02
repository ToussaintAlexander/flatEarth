package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE004RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE004RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE004RuleDetail {

	DataElementRuleDetailField transactionAmount004RuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       TRANSACTION_AMOUNT_004_RULE_DETAIL_ID
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_FIELD
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_SUBFIELD
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_FIRE
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_TYPE
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_GROUP
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_BL
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_AL
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_TL
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_SEQUENCE
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_POINTER
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_VALUE
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_CU
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_CT
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_MU
	                                     , TRANSACTION_AMOUNT_004_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE004RuleDetailImpl createDE004RuleDetail() {
		
		int id = 4000;
		
		List<DataElementRuleDetailField> ruleHeaderDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleHeaderDetailList.add(transactionAmount004RuleDetailField);
		
		DE004RuleDetailImpl de004RuleKey = new DE004RuleDetailImpl(id, ruleHeaderDetailList);
		
		return de004RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE004RuleDetailImpl de004RuleDetail = new CreateDE004RuleDetail().createDE004RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de004RuleDetail, fieldList,codeList );
		
		}
	}
