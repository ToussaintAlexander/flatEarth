package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE054RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE054RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE054RuleDetail  {

	DataElementRuleDetailField accountTypeRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_TYPE_054_RULE_DETAIL_ID
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_FIELD
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_FIRE
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_TYPE
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_GROUP
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_BL
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_AL
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_TL
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_POINTER
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_VALUE
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_CU
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_CT
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_MU
		                                 , ACCOUNT_TYPE_054_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField amountTypeRuleField 	 

		= new DataElementRuleDetailField ( 
									       AMOUNT_TYPE_054_RULE_DETAIL_ID
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_FIELD
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_SUBFIELD
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_FIRE
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_TYPE
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_GROUP
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_BL
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_AL
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_TL
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_SEQUENCE
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_POINTER
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_VALUE
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_CU
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_CT
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_MU
		                                 , AMOUNT_TYPE_054_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField currencyCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       CURRENCY_CODE_054_RULE_DETAIL_ID
		                                 , CURRENCY_CODE_054_RULE_DETAIL_FIELD
		                                 , CURRENCY_CODE_054_RULE_DETAIL_SUBFIELD
		                                 , CURRENCY_CODE_054_RULE_DETAIL_FIRE
		                                 , CURRENCY_CODE_054_RULE_DETAIL_TYPE
		                                 , CURRENCY_CODE_054_RULE_DETAIL_GROUP
		                                 , CURRENCY_CODE_054_RULE_DETAIL_BL
		                                 , CURRENCY_CODE_054_RULE_DETAIL_AL
		                                 , CURRENCY_CODE_054_RULE_DETAIL_TL
		                                 , CURRENCY_CODE_054_RULE_DETAIL_SEQUENCE
		                                 , CURRENCY_CODE_054_RULE_DETAIL_POINTER
		                                 , CURRENCY_CODE_054_RULE_DETAIL_VALUE
		                                 , CURRENCY_CODE_054_RULE_DETAIL_CU
		                                 , CURRENCY_CODE_054_RULE_DETAIL_CT
		                                 , CURRENCY_CODE_054_RULE_DETAIL_MU
		                                 , CURRENCY_CODE_054_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField accountEntryRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACCOUNT_ENTRY_054_RULE_DETAIL_ID
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_FIELD
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_SUBFIELD
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_FIRE
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_TYPE
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_GROUP
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_BL
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_AL
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_TL
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_SEQUENCE
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_POINTER
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_VALUE
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_CU
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_CT
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_MU
		                                 , ACCOUNT_ENTRY_054_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField amountRuleField 	 

		= new DataElementRuleDetailField ( 
									       AMOUNT_054_RULE_DETAIL_ID
		                                 , AMOUNT_054_RULE_DETAIL_FIELD
		                                 , AMOUNT_054_RULE_DETAIL_SUBFIELD
		                                 , AMOUNT_054_RULE_DETAIL_FIRE
		                                 , AMOUNT_054_RULE_DETAIL_TYPE
		                                 , AMOUNT_054_RULE_DETAIL_GROUP
		                                 , AMOUNT_054_RULE_DETAIL_BL
		                                 , AMOUNT_054_RULE_DETAIL_AL
		                                 , AMOUNT_054_RULE_DETAIL_TL
		                                 , AMOUNT_054_RULE_DETAIL_SEQUENCE
		                                 , AMOUNT_054_RULE_DETAIL_POINTER
		                                 , AMOUNT_054_RULE_DETAIL_VALUE
		                                 , AMOUNT_054_RULE_DETAIL_CU
		                                 , AMOUNT_054_RULE_DETAIL_CT
		                                 , AMOUNT_054_RULE_DETAIL_MU
		                                 , AMOUNT_054_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE054RuleDetail() {
			
			int id = 54000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(accountTypeRuleField);
			storage.add(amountTypeRuleField);
			storage.add(currencyCodeRuleField);
			storage.add(accountEntryRuleField);
			storage.add(amountRuleField);
			
			DataElementRuleDetail de054RuleDetail = new DE054RuleDetailImpl(id, storage);
			
			return de054RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de054RuleDetail = new CreateDE054RuleDetail().createDE054RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de054RuleDetail, fieldList,codeList );
		
		}
}
