package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE059RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE059RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE059RuleDetail  {

	DataElementRuleDetailField nationalPosGeoDataRuleField 	 

		= new DataElementRuleDetailField ( 
									       NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_ID
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_FIELD
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_SUBFIELD
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_FIRE
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_TYPE
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_GROUP
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_BL
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_AL
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_TL
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_SEQUENCE
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_POINTER
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_VALUE
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_CU
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_CT
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_MU
		                                 , NATIONAL_POS_GEO_DATA_059_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE059RuleDetail() {
			
			int id = 59000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(nationalPosGeoDataRuleField);
			
			DataElementRuleDetail de059RuleDetail = new DE059RuleDetailImpl(id, storage);
			
			return de059RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de059RuleDetail = new CreateDE059RuleDetail().createDE059RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de059RuleDetail, fieldList,codeList );
		
		}
}
