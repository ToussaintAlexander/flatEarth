package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE061RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE061RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE061RuleDetail  {

	DataElementRuleDetailField transactionOtherAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_ID
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_FIELD
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_SUBFIELD
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_FIRE
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_TYPE
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_GROUP
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_BL
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_AL
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_TL
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_SEQUENCE
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_POINTER
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_VALUE
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_CU
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_CT
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_MU
		                                 , TRANSACTION_OTHER_AMOUNT_061_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField carholderBillingOtherAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_ID
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_FIELD
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_SUBFIELD
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_FIRE
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_TYPE
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_GROUP
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_BL
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_AL
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_TL
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_SEQUENCE
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_POINTER
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_VALUE
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_CU
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_CT
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_MU
		                                 , CARDHOLDER_BILLING_OTHER_AMOUNT_061_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE061RuleDetail() {
			
			int id = 61000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(transactionOtherAmountRuleField);
			storage.add(carholderBillingOtherAmountRuleField);
			
			DataElementRuleDetail de061RuleDetail = new DE061RuleDetailImpl(id, storage);
			
			return de061RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de061RuleDetail = new CreateDE061RuleDetail().createDE061RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de061RuleDetail, fieldList,codeList );
		
		}
}
