package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE012RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE012RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE012RuleDetail  {

	DataElementRuleDetailField localTransactionTimeHourRuleField 	 

		= new DataElementRuleDetailField ( 
									       LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_ID
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_FIELD
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_SUBFIELD
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_FIRE
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_TYPE
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_GROUP
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_BL
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_AL
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_TL
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_SEQUENCE
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_POINTER
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_VALUE
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_CU
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_CT
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_MU
		                                 , LOCAL_TRANSACTION_TIME_HOUR_012_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField localTransactionTimeMinuteRuleField 	 

		= new DataElementRuleDetailField ( 
									       LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_ID
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_FIELD
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_SUBFIELD
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_FIRE
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_TYPE
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_GROUP
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_BL
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_AL
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_TL
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_SEQUENCE
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_POINTER
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_VALUE
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_CU
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_CT
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_MU
		                                 , LOCAL_TRANSACTION_TIME_MINUTE_012_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField localTransactionTimeSecondRuleField 	 

		= new DataElementRuleDetailField ( 
									       LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_ID
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_FIELD
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_SUBFIELD
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_FIRE
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_TYPE
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_GROUP
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_BL
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_AL
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_TL
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_SEQUENCE
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_POINTER
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_VALUE
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_CU
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_CT
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_MU
		                                 , LOCAL_TRANSACTION_TIME_SECOND_012_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE012RuleDetail() {
			
			int id = 12000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(localTransactionTimeHourRuleField);
			storage.add(localTransactionTimeMinuteRuleField);
			storage.add(localTransactionTimeSecondRuleField);
			
			DataElementRuleDetail de012RuleDetail = new DE012RuleDetailImpl(id, storage);
			
			return de012RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de012RuleDetail = new CreateDE012RuleDetail().createDE012RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de012RuleDetail, fieldList,codeList );
		
		}
}
