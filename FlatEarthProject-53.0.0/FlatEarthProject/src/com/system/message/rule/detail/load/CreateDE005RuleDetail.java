package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE005RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE005RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE005RuleDetail {

	DataElementRuleDetailField settlementAmountRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       SETTLEMENT_AMOUNT_005_RULE_DETAIL_ID
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_FIELD
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_SUBFIELD
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_FIRE
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_TYPE
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_GROUP
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_BL
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_AL
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_TL
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_SEQUENCE
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_POINTER
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_VALUE	
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_CU
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_CT
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_MU
	                                     , SETTLEMENT_AMOUNT_005_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE005RuleDetailImpl createDE005RuleDetail() {
		
		int id = 5000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(settlementAmountRuleDetailField);
		
		DE005RuleDetailImpl de005RuleKey = new DE005RuleDetailImpl(id, ruleDetailList);
		
		return de005RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE005RuleDetailImpl de005RuleDetail = new CreateDE005RuleDetail().createDE005RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de005RuleDetail, fieldList,codeList );
		
		}
	}
