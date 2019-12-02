package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE001RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE001RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE001RuleDetail {

	DataElementRuleDetailField primaryBitmapRuleKeyField 	 

		= new DataElementRuleDetailField (  
	                                       PRIMARY_BITMAP_001_RULE_DETAIL_ID
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_FIELD
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_SUBFIELD
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_FIRE
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_TYPE
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_GROUP
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_BL
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_AL
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_TL
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_SEQUENCE
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_POINTER
	                                     , PRIMARY_BITMAP_001_RULE_DETAIL_VALUE
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_CU
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_CT
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_MU
		                                 , PRIMARY_BITMAP_001_RULE_DETAIL_MT
  		  	       	      		         );
		
	public DE001RuleDetailImpl createDE001RuleDetail() {
		
		int id = 1000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(primaryBitmapRuleKeyField);
		
		DE001RuleDetailImpl de001RuleKey = new DE001RuleDetailImpl(id, ruleDetailList);
		
		return de001RuleKey;
	}		
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE001RuleDetailImpl de001RuleDetail	= new CreateDE001RuleDetail().createDE001RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de001RuleDetail, fieldList,codeList );
		
		}
	}
