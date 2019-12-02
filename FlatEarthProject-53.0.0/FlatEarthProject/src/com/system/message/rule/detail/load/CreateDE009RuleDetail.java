package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE009RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE009RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE009RuleDetail {

	DataElementRuleDetailField settlementConversionRateRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_ID
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_FIELD
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_SUBFIELD
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_FIRE
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_TYPE
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_GROUP
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_BL
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_AL
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_TL
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_SEQUENCE
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_POINTER
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_VALUE
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_CU
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_CT
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_MU
	                                     , SETTLEMENT_CONVERSION_RATE_009_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE009RuleDetailImpl createDE009RuleDetail() {
		
		int id = 9000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(settlementConversionRateRuleDetailField);
		
		DE009RuleDetailImpl de009RuleKey = new DE009RuleDetailImpl(id, ruleDetailList);
		
		return de009RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE009RuleDetailImpl de009RuleDetail = new CreateDE009RuleDetail().createDE009RuleDetail(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de009RuleDetail, fieldList,codeList );
		
		}
	}
