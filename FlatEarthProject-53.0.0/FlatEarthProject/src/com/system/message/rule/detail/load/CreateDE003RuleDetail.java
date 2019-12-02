package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE003RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE003RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE003RuleDetail {

	DataElementRuleDetailField transactionTypeRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       TRANSACTION_TYPE_003_RULE_DETAIL_ID
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_FIELD
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_SUBFIELD
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_FIRE
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_TYPE
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_GROUP
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_BL
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_AL
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_TL
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_SEQUENCE
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_POINTER
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_VALUE
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_CU
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_CT
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_MU
	                                     , TRANSACTION_TYPE_003_RULE_DETAIL_MT
  		  	       	      		         );

	DataElementRuleDetailField accountFromTypeRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       ACCOUNT_FROM_TYPE_003_RULE_DETAIL_ID
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_FIELD
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_SUBFIELD
	                                     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_FIRE
	                                     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_TYPE
	                                     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_GROUP
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_BL
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_AL
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_TL
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_SEQUENCE
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_POINTER
	                                     , ACCOUNT_FROM_TYPE_003_RULE_HEADER_VALUE	
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_CU
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_CT
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_MU
	                                     , ACCOUNT_FROM_TYPE_003_RULE_DETAIL_MT
  		  	       	      		         );
		
	DataElementRuleDetailField accountToTypeRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       ACCOUNT_TO_TYPE_003_RULE_DETAIL_ID
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_FIELD
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_SUBFIELD
	                                     , ACCOUNT_TO_TYPE_003_RULE_HEADER_FIRE
	                                     , ACCOUNT_TO_TYPE_003_RULE_HEADER_TYPE
	                                     , ACCOUNT_TO_TYPE_003_RULE_HEADER_GROUP
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_BL
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_AL
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_TL
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_SEQUENCE
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_POINTER
	                                     , ACCOUNT_TO_TYPE_003_RULE_HEADER_VALUE
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_CU
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_CT
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_MU
	                                     , ACCOUNT_TO_TYPE_003_RULE_DETAIL_MT
  		  	       	      		         );
	
	public DE003RuleDetailImpl createDE003RuleDetail() {
		
		int id = 3000;
		
		List<DataElementRuleDetailField> ruleKEYList = new ArrayList<DataElementRuleDetailField>();
		
		ruleKEYList.add(transactionTypeRuleDetailField);
		ruleKEYList.add(accountFromTypeRuleDetailField);
		ruleKEYList.add(accountToTypeRuleDetailField);
		
		DE003RuleDetailImpl de003RuleKey = new DE003RuleDetailImpl(id, ruleKEYList);
		
		return de003RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE003RuleDetailImpl de003RuleDetail = new CreateDE003RuleDetail().createDE003RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de003RuleDetail, fieldList,codeList );
		
		}
	}
