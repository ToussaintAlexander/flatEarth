package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE030RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE030RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE030RuleDetail  {

	DataElementRuleDetailField accountEntryRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_ENTRY_030_RULE_DETAIL_ID
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_FIELD
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_FIRE
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_TYPE
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_GROUP
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_BL
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_AL
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_TL
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_POINTER
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_VALUE
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_CU
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_CT
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_MU
		                                 , ACCOUNT_ENTRY_030_RULE_DETAIL_MT
	  		  	       	                 );

	
	DataElementRuleDetailField transactionProcessingFeeAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_ID
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_FIELD
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_SUBFIELD
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_FIRE
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_TYPE
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_GROUP
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_BL
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_AL
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_TL
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_SEQUENCE
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_POINTER
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_VALUE
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_CU
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_CT
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_MU
		                                 , TRANSACTION_PROCESSING_FEE_AMOUNT_030_RULE_DETAIL_MT
	  		  	       	                 );
	
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE030RuleDetail() {
			
			int id = 30000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(accountEntryRuleField);
			storage.add(transactionProcessingFeeAmountRuleField);
			
			DataElementRuleDetail de030RuleDetail = new DE030RuleDetailImpl(id, storage);
			
			return de030RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de030RuleDetail = new CreateDE030RuleDetail().createDE030RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de030RuleDetail, fieldList,codeList );
		
		}
}
