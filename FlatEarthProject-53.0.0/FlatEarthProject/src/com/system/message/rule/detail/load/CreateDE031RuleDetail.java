package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE031RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE031RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE031RuleDetail  {


	DataElementRuleDetailField accountEntryRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_ENTRY_031_RULE_DETAIL_ID
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_FIELD
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_FIRE
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_TYPE
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_GROUP
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_BL
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_AL
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_TL
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_POINTER
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_VALUE
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_CU
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_CT
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_MU
		                                 , ACCOUNT_ENTRY_031_RULE_DETAIL_MT
	  		  	       	                 );

	
	DataElementRuleDetailField settlementProcessingFeeAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_ID
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_FIELD
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_SUBFIELD
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_FIRE
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_TYPE
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_GROUP
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_BL
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_AL
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_TL
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_SEQUENCE
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_POINTER
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_VALUE
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_CU
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_CT
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_MU
		                                 , SETTLEMENT_PROCESSING_FEE_AMOUNT_031_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE031RuleDetail() {
			
			int id = 31000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(accountEntryRuleField);
			storage.add(settlementProcessingFeeAmountRuleField);
			
			DataElementRuleDetail de031RuleDetail = new DE031RuleDetailImpl(id, storage);
			
			return de031RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de031RuleDetail = new CreateDE031RuleDetail().createDE031RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de031RuleDetail, fieldList,codeList );
		
		}
}
