package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE028RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE028RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE028RuleDetail  {

	DataElementRuleDetailField accountEntryRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_ENTRY_028_RULE_DETAIL_ID
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_FIELD
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_FIRE
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_TYPE
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_GROUP
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_BL
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_AL
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_TL
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_POINTER
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_VALUE
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_CU
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_CT
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_MU
		                                 , ACCOUNT_ENTRY_028_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField transactionFeeAmountRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_ID
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_FIELD
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_SUBFIELD
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_FIRE
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_TYPE
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_GROUP
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_BL
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_AL
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_TL
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_SEQUENCE
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_POINTER
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_VALUE
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_CU
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_CT
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_MU
		                                 , TRANSACTION_FEE_AMOUNT_028_RULE_DETAIL_MT
	  		  	       	                 );
	
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE028RuleDetail() {
			
			int id = 28000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(accountEntryRuleField);
			storage.add(transactionFeeAmountRuleField);
			
			DataElementRuleDetail de028RuleDetail = new DE028RuleDetailImpl(id, storage);
			
			return de028RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de028RuleDetail = new CreateDE028RuleDetail().createDE028RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de028RuleDetail, fieldList,codeList );
		
		}
}
