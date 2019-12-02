package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE037RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE037RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE037RuleDetail  {

	DataElementRuleDetailField transmissionDateYearRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_ID
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_FIELD
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_SUBFIELD
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_FIRE
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_TYPE
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_GROUP
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_BL
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_AL
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_TL
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_SEQUENCE
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_POINTER
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_VALUE
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_CU
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_CT
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_MU
		                                 , TRANSMISSION_DATE_YEAR_037_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField julianDayMonthRuleField 	 

		= new DataElementRuleDetailField ( 
									       JULIAN_DAY_MONTH_037_RULE_DETAIL_ID
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_FIELD
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_SUBFIELD
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_FIRE
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_TYPE
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_GROUP
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_BL
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_AL
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_TL
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_SEQUENCE
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_POINTER
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_VALUE
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_CU
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_CT
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_MU
		                                 , JULIAN_DAY_MONTH_037_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField transmissionTimeHourRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_ID
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_FIELD
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_SUBFIELD
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_FIRE
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_TYPE
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_GROUP
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_BL
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_AL
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_TL
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_SEQUENCE
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_POINTER
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_VALUE
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_CU
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_CT
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_MU
		                                 , TRANSMISSION_TIME_HOUR_037_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField systemsTraceAuditNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_ID
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_FIELD
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_SUBFIELD
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_FIRE
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_TYPE
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_GROUP
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_BL
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_AL
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_TL
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_SEQUENCE
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_POINTER
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_VALUE
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_CU
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_CT
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_MU
		                                 , SYSTEMS_TRACE_AUDIT_NUMBER_037_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE037RuleDetail() {
			
			int id = 37000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(transmissionDateYearRuleField);
			storage.add(julianDayMonthRuleField);
			storage.add(transmissionTimeHourRuleField);
			storage.add(systemsTraceAuditNumberRuleField);
			
			DataElementRuleDetail de037RuleDetail = new DE037RuleDetailImpl(id, storage);
			
			return de037RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de037RuleDetail = new CreateDE037RuleDetail().createDE037RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de037RuleDetail, fieldList,codeList );
		
		}
}
