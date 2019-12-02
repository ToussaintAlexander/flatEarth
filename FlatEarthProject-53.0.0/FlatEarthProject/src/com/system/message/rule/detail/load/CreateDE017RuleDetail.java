package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE017RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE017RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE017RuleDetail  {

	DataElementRuleDetailField conversionDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
									       CAPTURE_DATE_MONTH_017_RULE_DETAIL_ID
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_FIELD
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_SUBFIELD
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_FIRE
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_TYPE
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_GROUP
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_BL
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_AL
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_TL
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_SEQUENCE
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_POINTER
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_VALUE
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_CU
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_CT
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_MU
		                                 , CAPTURE_DATE_MONTH_017_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField conversionDateDayRuleField 	 

		= new DataElementRuleDetailField ( 
									       CAPTURE_DATE_DAY_017_RULE_DETAIL_ID
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_FIELD
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_SUBFIELD
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_FIRE
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_TYPE
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_GROUP
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_BL
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_AL
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_TL
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_SEQUENCE
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_POINTER
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_VALUE
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_CU
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_CT
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_MU
		                                 , CAPTURE_DATE_DAY_017_RULE_DETAIL_MT
	  		  	       	                 );
		
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE017RuleDetail() {
			
			int id = 17000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(conversionDateMonthRuleField);
			storage.add(conversionDateDayRuleField);
			
			DataElementRuleDetail de017RuleDetail = new DE017RuleDetailImpl(id, storage);
			
			return de017RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de017RuleDetail = new CreateDE017RuleDetail().createDE017RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de017RuleDetail, fieldList,codeList );
		
		}
}
