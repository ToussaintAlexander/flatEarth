package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE014RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE014RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE014RuleDetail  {

	DataElementRuleDetailField expirationDateYearRuleField 	 

		= new DataElementRuleDetailField ( 
										   EXPIRATION_DATE_YEAR_014_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_YEAR_014_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField expirationDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
										   EXPIRATION_DATE_MONTH_014_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_MONTH_014_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE014RuleDetail() {
			
			int id = 0;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(expirationDateYearRuleField);
			storage.add(expirationDateMonthRuleField);
			
			DataElementRuleDetail de014RuleDetail = new DE014RuleDetailImpl(id, storage);
			
			return de014RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de014RuleDetail = new CreateDE014RuleDetail().createDE014RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de014RuleDetail, fieldList,codeList );
		
		}
}
