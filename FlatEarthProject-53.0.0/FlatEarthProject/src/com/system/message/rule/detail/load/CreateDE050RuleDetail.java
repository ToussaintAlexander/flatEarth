package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE050RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE050RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE050RuleDetail  {

	DataElementRuleDetailField settlementCurrencyCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_ID
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_FIELD
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_SUBFIELD
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_FIRE
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_TYPE
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_GROUP
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_BL
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_AL
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_TL
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_SEQUENCE
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_POINTER
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_VALUE
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_CU
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_CT
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_MU
		                                 , SETTLEMENT_CURRENCY_CODE_050_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE050RuleDetail() {
			
			int id = 50000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(settlementCurrencyCodeRuleField);
			
			DataElementRuleDetail de050RuleDetail = new DE050RuleDetailImpl(id, storage);
			
			return de050RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de050RuleDetail = new CreateDE050RuleDetail().createDE050RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de050RuleDetail, fieldList,codeList );
		
		}
}
