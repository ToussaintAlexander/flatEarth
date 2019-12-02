package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE010RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE010RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.NetworkUtils;

public class CreateDE010RuleDetail  {

	DataElementRuleDetailField unassignedDataElementRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_ID
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_FIELD
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_SUBFIELD
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_FIRE
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_TYPE
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_GROUP
		                                 , new NetworkUtils().getBinLevel ()
		                                 , new NetworkUtils().getAccountlevel ()
		                                 , new NetworkUtils().getTransactionlevel ()
		                                 , 1	// CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_SEQUENCE
		                                 , 2	// CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_POINTER
		                                 , 3	// CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_VALUE
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_CU
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_CT
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_MU
		                                 , CARDHOLDER_BILLING_CONVERSION_RATE_010_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE010RuleDetail() {
			
			int id = 0;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElementRuleField);
			
			DataElementRuleDetail de010RuleKey = new DE010RuleDetailImpl(id, storage);
			
			return de010RuleKey;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de010RuleDetail = new CreateDE010RuleDetail().createDE010RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de010RuleDetail, fieldList,codeList );
		
		}
}
