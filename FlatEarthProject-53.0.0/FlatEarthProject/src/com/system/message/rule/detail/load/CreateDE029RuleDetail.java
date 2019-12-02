package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE029RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE029RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE029RuleDetail  {


	DataElementRuleDetailField accountEntryRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_ENTRY_029_RULE_DETAIL_ID
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_FIELD
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_FIRE
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_TYPE
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_GROUP
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_BL
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_AL
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_TL
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_POINTER
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_VALUE
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_CU
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_CT
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_MU
		                                 , ACCOUNT_ENTRY_029_RULE_DETAIL_MT
	  		  	       	                 );

	
	DataElementRuleDetailField settlementFeeAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_ID
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_FIELD
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_SUBFIELD
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_FIRE
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_TYPE
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_GROUP
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_BL
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_AL
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_TL
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_SEQUENCE
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_POINTER
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_VALUE
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_CU
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_CT
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_MU
		                                 , SETTLEMENT_FEE_AMOUNT_029_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE029RuleDetail() {
			
			int id = 29000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(accountEntryRuleField);
			storage.add(settlementFeeAmountRuleField);
			
			DataElementRuleDetail de029RuleDetail = new DE029RuleDetailImpl(id, storage);
			
			return de029RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de029RuleDetail = new CreateDE029RuleDetail().createDE029RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de029RuleDetail, fieldList,codeList );
		
		}
}
