package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE022RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE022RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE022RuleDetail  {

	DataElementRuleDetailField transactionEntryModeRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_ID
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_FIELD
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_SUBFIELD
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_FIRE
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_TYPE
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_GROUP
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_BL
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_AL
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_TL
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_SEQUENCE
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_POINTER
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_VALUE
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_CU
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_CT
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_MU
		                                 , TRANSACTION_ENTRY_MODE_022_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField pinEntryModeRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_ENTRY_MODE_022_RULE_DETAIL_ID
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_FIELD
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_SUBFIELD
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_FIRE
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_TYPE
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_GROUP
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_BL
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_AL
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_TL
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_SEQUENCE
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_POINTER
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_VALUE
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_CU
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_CT
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_MU
		                                 , PIN_ENTRY_MODE_022_RULE_DETAIL_MT
	  		  	       	                 );
	
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE022RuleDetail() {
			
			int id = 22000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(transactionEntryModeRuleField);
			storage.add(pinEntryModeRuleField);
			
			DataElementRuleDetail de022RuleDetail = new DE022RuleDetailImpl(id, storage);
			
			return de022RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de022RuleDetail = new CreateDE022RuleDetail().createDE022RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de022RuleDetail, fieldList,codeList );
		
		}
}
