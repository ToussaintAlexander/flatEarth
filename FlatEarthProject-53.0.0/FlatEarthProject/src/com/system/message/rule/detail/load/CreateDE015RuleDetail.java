package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE015RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE015RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE015RuleDetail  {

	DataElementRuleDetailField settlementDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
										   SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_ID
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_FIELD
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_SUBFIELD
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_FIRE
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_TYPE
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_GROUP
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_BL
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_AL
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_TL
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_SEQUENCE
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_POINTER
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_VALUE
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_CU
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_CT
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_MU
		                                 , SETTLEMENT_DATE_MONTH_015_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField settlementDateDayRuleField 	 

		= new DataElementRuleDetailField ( 
										   SETTLEMENT_DATE_DAY_015_RULE_DETAIL_ID
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_FIELD
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_SUBFIELD
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_FIRE
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_TYPE
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_GROUP
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_BL
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_AL
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_TL
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_SEQUENCE
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_POINTER
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_VALUE
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_CU
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_CT
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_MU
		                                 , SETTLEMENT_DATE_DAY_015_RULE_DETAIL_MT
	  		  	       	                 );
		
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE015RuleDetail() {
			
			int id = 15000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(settlementDateMonthRuleField);
			storage.add(settlementDateDayRuleField);
			
			DataElementRuleDetail de015RuleDetail = new DE015RuleDetailImpl(id, storage);
			
			return de015RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de015RuleDetail = new CreateDE015RuleDetail().createDE015RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de015RuleDetail, fieldList,codeList );
		
		}
}
