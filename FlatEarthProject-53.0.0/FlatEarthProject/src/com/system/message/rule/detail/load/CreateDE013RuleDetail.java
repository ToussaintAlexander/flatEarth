package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE013RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE013RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE013RuleDetail  {

	DataElementRuleDetailField localTransactionDateMonthField 	 

		= new DataElementRuleDetailField ( 
										   LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_ID
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_FIELD
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_SUBFIELD
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_FIRE
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_TYPE
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_GROUP
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_BL
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_AL
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_TL
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_SEQUENCE
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_POINTER
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_VALUE
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_CU
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_CT
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_MU
		                                 , LOCAL_TRANSACTION_DATE_MONTH_013_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField localTransactionDateDayField 	 

		= new DataElementRuleDetailField ( 
										   LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_ID
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_FIELD
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_SUBFIELD
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_FIRE
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_TYPE
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_GROUP
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_BL
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_AL
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_TL
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_SEQUENCE
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_POINTER
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_VALUE
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_CU
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_CT
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_MU
		                                 , LOCAL_TRANSACTION_DATE_DAY_013_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE013RuleDetail() {
			
			int id = 13000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(localTransactionDateMonthField);
			storage.add(localTransactionDateDayField);
			
			DataElementRuleDetail de013RuleDetail = new DE013RuleDetailImpl(id, storage);
			
			return de013RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de013RuleDetail = new CreateDE013RuleDetail().createDE013RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de013RuleDetail, fieldList,codeList );
		
		}
}
