package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE060RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE060RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE060RuleDetail  {

	DataElementRuleDetailField terminalTypeRuleField 	 

		= new DataElementRuleDetailField ( 
									       TERMINAL_TYPE_060_RULE_DETAIL_ID
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_FIELD
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_SUBFIELD
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_FIRE
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_TYPE
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_GROUP
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_BL
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_AL
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_TL
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_SEQUENCE
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_POINTER
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_VALUE
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_CU
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_CT
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_MU
		                                 , TERMINAL_TYPE_060_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField terminalEntryCapabilityRuleField 	 

		= new DataElementRuleDetailField ( 
									       TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_ID
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_FIELD
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_SUBFIELD
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_FIRE
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_TYPE
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_GROUP
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_BL
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_AL
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_TL
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_SEQUENCE
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_POINTER
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_VALUE
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_CU
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_CT
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_MU
		                                 , TERMINAL_ENTRY_CAPABILITY_060_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField specialConditionIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_ID
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_FIELD
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_SUBFIELD
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_FIRE
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_TYPE
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_GROUP
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_BL
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_AL
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_TL
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_SEQUENCE
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_POINTER
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_VALUE
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_CU
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_CT
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_MU
		                                 , SPECIAL_CONDITION_INDICATOR_060_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField motoEciPaymentIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_ID
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_FIELD
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_SUBFIELD
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_FIRE
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_TYPE
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_GROUP
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_BL
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_AL
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_TL
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_SEQUENCE
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_POINTER
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_VALUE
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_CU
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_CT
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_MU
		                                 , MOTO_ECI_PAYMENT_INDICATOR_060_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField partialAuthIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_ID
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_FIELD
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_SUBFIELD
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_FIRE
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_TYPE
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_GROUP
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_BL
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_AL
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_TL
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_SEQUENCE
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_POINTER
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_VALUE
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_CU
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_CT
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_MU
		                                 , PARTIAL_AUTH_INDICATOR_060_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE060RuleDetail() {
			
			int id = 60000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(terminalTypeRuleField);
			storage.add(terminalEntryCapabilityRuleField);
			storage.add(specialConditionIndicatorRuleField);
			storage.add(motoEciPaymentIndicatorRuleField);
			storage.add(partialAuthIndicatorRuleField);
			
			DataElementRuleDetail de060RuleDetail = new DE060RuleDetailImpl(id, storage);
			
			return de060RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de060RuleDetail = new CreateDE060RuleDetail().createDE060RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de060RuleDetail, fieldList,codeList );
		
		}
}
