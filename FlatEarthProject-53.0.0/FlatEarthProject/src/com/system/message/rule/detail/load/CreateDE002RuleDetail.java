package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE002RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE002RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE002RuleDetail {

	DataElementRuleDetailField binRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       BIN_002_RULE_DETAIL_ID
	                                     , BIN_002_RULE_DETAIL_FIELD
	                                     , BIN_002_RULE_DETAIL_SUBFIELD
	                                     , BIN_002_RULE_DETAIL_FIRE
	                                     , BIN_002_RULE_DETAIL_TYPE
	                                     , BIN_002_RULE_DETAIL_GROUP
	                                     , BIN_002_RULE_DETAIL_BL
	                                     , BIN_002_RULE_DETAIL_AL
	                                     , BIN_002_RULE_DETAIL_TL
	                                     , BIN_002_RULE_DETAIL_SEQUENCE
	                                     , BIN_002_RULE_DETAIL_POINTER
	                                     , BIN_002_RULE_DETAIL_VALUE
	                                     , BIN_002_RULE_DETAIL_CU
	                                     , BIN_002_RULE_DETAIL_CT
	                                     , BIN_002_RULE_DETAIL_MU
	                                     , BIN_002_RULE_DETAIL_MT
  		  	       	      		         );

	DataElementRuleDetailField panRuleDetailField 	 

		= new DataElementRuleDetailField (  
										   PAN_002_RULE_DETAIL_ID
	                                     , PAN_002_RULE_DETAIL_FIELD
	                                     , PAN_002_RULE_DETAIL_SUBFIELD
	                                     , PAN_002_RULE_DETAIL_FIRE
	                                     , PAN_002_RULE_DETAIL_TYPE
	                                     , PAN_002_RULE_DETAIL_GROUP
	                                     , PAN_002_RULE_DETAIL_BL
	                                     , PAN_002_RULE_DETAIL_AL
	                                     , PAN_002_RULE_DETAIL_TL
	                                     , PAN_002_RULE_DETAIL_SEQUENCE
	                                     , PAN_002_RULE_DETAIL_POINTER
	                                     , PAN_002_RULE_DETAIL_VALUE
	                                     , PAN_002_RULE_DETAIL_CU
	                                     , PAN_002_RULE_DETAIL_CT
	                                     , PAN_002_RULE_DETAIL_MU
	                                     , PAN_002_RULE_DETAIL_MT
  		  	       	      		         );
		
	DataElementRuleDetailField checkDigitRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       CHECK_DIGIT_002_RULE_DETAIL_ID
	                                     , CHECK_DIGIT_002_RULE_DETAIL_FIELD
	                                     , CHECK_DIGIT_002_RULE_DETAIL_SUBFIELD
	                                     , CHECK_DIGIT_002_RULE_DETAIL_FIRE
	                                     , CHECK_DIGIT_002_RULE_DETAIL_TYPE
	                                     , CHECK_DIGIT_002_RULE_DETAIL_GROUP
	                                     , CHECK_DIGIT_002_RULE_DETAIL_BL
	                                     , CHECK_DIGIT_002_RULE_DETAIL_AL
	                                     , CHECK_DIGIT_002_RULE_DETAIL_TL
	                                     , CHECK_DIGIT_002_RULE_DETAIL_SEQUENCE
	                                     , CHECK_DIGIT_002_RULE_DETAIL_POINTER
	                                     , CHECK_DIGIT_002_RULE_DETAIL_VALUE
	                                     , CHECK_DIGIT_002_RULE_DETAIL_CU
	                                     , CHECK_DIGIT_002_RULE_DETAIL_CT
	                                     , CHECK_DIGIT_002_RULE_DETAIL_MU
	                                     , CHECK_DIGIT_002_RULE_DETAIL_MT
  		  	       	      		         );
	
	public DE002RuleDetailImpl createDE002RuleDetail() {
		
		int id = 2000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(binRuleDetailField);
		ruleDetailList.add(panRuleDetailField);
		ruleDetailList.add(checkDigitRuleDetailField);
		
		DE002RuleDetailImpl de002RuleKey = new DE002RuleDetailImpl(id, ruleDetailList);
		
		return de002RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE002RuleDetailImpl de002RuleDetail = new CreateDE002RuleDetail().createDE002RuleDetail(); 
			
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de002RuleDetail, fieldList,codeList );
		
	}
}
