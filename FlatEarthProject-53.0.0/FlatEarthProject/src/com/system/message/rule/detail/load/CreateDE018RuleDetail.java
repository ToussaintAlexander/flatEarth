package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE018RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE018RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE018RuleDetail  {

	DataElementRuleDetailField unassignedDataElement018RuleField 	 

		= new DataElementRuleDetailField ( 
										   MERCHANT_TYPE_018_RULE_DETAIL_ID
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_FIELD
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_SUBFIELD
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_FIRE
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_TYPE
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_GROUP
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_BL
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_AL
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_TL
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_SEQUENCE
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_POINTER
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_VALUE
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_CU
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_CT
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_MU
		                                 , MERCHANT_TYPE_018_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE018RuleDetail() {
			
			int id = 18000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement018RuleField);
			
			DataElementRuleDetail de018RuleDetail = new DE018RuleDetailImpl(id, storage);
			
			return de018RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de018RuleDetail = new CreateDE018RuleDetail().createDE018RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de018RuleDetail, fieldList,codeList );
		
		}
}
