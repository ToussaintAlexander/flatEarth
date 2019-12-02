package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE016RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE016RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE016RuleDetail  {

	DataElementRuleDetailField conversionDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
									       CONVERSION_DATE_MONTH_016_RULE_DETAIL_ID
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_FIELD
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_SUBFIELD
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_FIRE
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_TYPE
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_GROUP
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_BL
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_AL
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_TL
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_SEQUENCE
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_POINTER
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_VALUE
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_CU
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_CT
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_MU
		                                 , CONVERSION_DATE_MONTH_016_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField conversionDateDayRuleField 	 

		= new DataElementRuleDetailField ( 
									       CONVERSION_DATE_DAY_016_RULE_DETAIL_ID
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_FIELD
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_SUBFIELD
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_FIRE
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_TYPE
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_GROUP
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_BL
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_AL
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_TL
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_SEQUENCE
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_POINTER
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_VALUE
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_CU
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_CT
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_MU
		                                 , CONVERSION_DATE_DAY_016_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE016RuleDetail() {
			
			int id = 16000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(conversionDateMonthRuleField);
			storage.add(conversionDateDayRuleField);
			
			DataElementRuleDetail de016RuleDetail = new DE016RuleDetailImpl(id, storage);
			
			return de016RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de016RuleDetail = new CreateDE016RuleDetail().createDE016RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de016RuleDetail, fieldList,codeList );
		
		}
}
