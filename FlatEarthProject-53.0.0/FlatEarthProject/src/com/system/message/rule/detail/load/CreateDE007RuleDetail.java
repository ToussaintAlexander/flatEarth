package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE007RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE007RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE007RuleDetail {

	DataElementRuleDetailField transmissionDateMonthRuleDetailField 	 

		= new DataElementRuleDetailField (  
	                                       TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_ID
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_FIELD
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_SUBFIELD
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_FIRE
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_TYPE
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_GROUP
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_BL
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_AL
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_TL
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_SEQUENCE
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_POINTER
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_VALUE
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_CU
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_CT
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_MU
	                                     , TRANSMISSION_DATE_MONTH_007_RULE_DETAIL_MT
  		  	       	      		         );

	DataElementRuleDetailField transmissionDateDayRuleDetailField 	 

		= new DataElementRuleDetailField (  
										   TRANSMISSION_DATE_DAY_007_RULE_DETAIL_ID
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_FIELD
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_SUBFIELD
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_FIRE
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_TYPE
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_GROUP
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_BL
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_AL
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_TL
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_SEQUENCE
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_POINTER
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_VALUE
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_CU
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_CT
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_MU
	                                     , TRANSMISSION_DATE_DAY_007_RULE_DETAIL_MT
  		  	       	      		         );
		
	DataElementRuleDetailField transmissionTimeHourRuleDetailField 	 

		= new DataElementRuleDetailField (  
										   TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_ID
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_FIELD
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_SUBFIELD
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_FIRE
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_TYPE
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_GROUP
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_BL
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_AL
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_TL
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_SEQUENCE
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_POINTER
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_VALUE
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_CU
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_CT
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_MU
	                                     , TRANSMISSION_TIME_HOUR_007_RULE_DETAIL_MT
  		  	       	      		         );
		
	DataElementRuleDetailField transmissionTimeMinuteRuleDetailField 	 

		= new DataElementRuleDetailField (  
									       TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_ID
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_FIELD
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_SUBFIELD
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_FIRE
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_TYPE
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_GROUP
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_BL
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_AL
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_TL
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_SEQUENCE
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_POINTER
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_VALUE
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_CU
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_CT
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_MU
	                                     , TRANSMISSION_TIME_MINUTE_007_RULE_DETAIL_MT
  		  	       	      		         );
		
	DataElementRuleDetailField transmissionTimeSecondRuleDetailField 	 

		= new DataElementRuleDetailField (   
										   TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_ID
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_FIELD
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_SUBFIELD
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_FIRE
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_TYPE
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_GROUP
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_BL
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_AL
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_TL
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_SEQUENCE
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_POINTER
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_VALUE
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_CU
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_CT
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_MU
	                                     , TRANSMISSION_TIME_SECOND_007_RULE_DETAIL_MT
  		  	       	      		         );
	
	public DE007RuleDetailImpl createDE007RuleDetail() {
		
		int id = 7000;
		
		List<DataElementRuleDetailField> ruleDetailList = new ArrayList<DataElementRuleDetailField>();
		
		ruleDetailList.add(transmissionDateMonthRuleDetailField);
		ruleDetailList.add(transmissionDateDayRuleDetailField);
		ruleDetailList.add(transmissionTimeHourRuleDetailField);
		ruleDetailList.add(transmissionTimeMinuteRuleDetailField);
		ruleDetailList.add(transmissionTimeSecondRuleDetailField);
		
		DE007RuleDetailImpl de007RuleKey = new DE007RuleDetailImpl(id, ruleDetailList);
		
		return de007RuleKey;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main (String[] args) {
		
		DE007RuleDetailImpl de007RuleDetail = new CreateDE007RuleDetail().createDE007RuleDetail(); 
		
		List<FieldBean> fieldList = new FieldTableUtils().createFields();
		
		List<CodeBean> codeList = new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display(de007RuleDetail, fieldList,codeList );
		
		}
	}
