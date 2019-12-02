package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE049RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE049RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE049RuleDetail  {

	DataElementRuleDetailField transactionCurrencyCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_ID
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_FIELD
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_SUBFIELD
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_FIRE
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_TYPE
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_GROUP
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_BL
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_AL
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_TL
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_SEQUENCE
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_POINTER
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_VALUE
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_CU
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_CT
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_MU
		                                 , TRANSACTION_CURRENCY_CODE_049_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE049RuleDetail() {
			
			int id = 49000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(transactionCurrencyCodeRuleField);
			
			DataElementRuleDetail de049RuleDetail = new DE049RuleDetailImpl(id, storage);
			
			return de049RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de049RuleDetail = new CreateDE049RuleDetail().createDE049RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de049RuleDetail, fieldList,codeList );
		
		}
}
