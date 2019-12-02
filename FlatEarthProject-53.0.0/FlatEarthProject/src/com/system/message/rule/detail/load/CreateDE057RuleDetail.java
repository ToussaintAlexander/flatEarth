package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE057RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE057RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE057RuleDetail  {

	DataElementRuleDetailField unassignedDataElement057RuleField 	 

		= new DataElementRuleDetailField ( 
									       UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_ID
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_FIELD
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_SUBFIELD
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_FIRE
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_TYPE
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_GROUP
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_BL
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_AL
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_TL
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_SEQUENCE
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_POINTER
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_VALUE
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_CU
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_CT
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_MU
		                                 , UNASSIGNED_DATA_ELEMENT_057_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE057RuleDetail() {
			
			int id = 57000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement057RuleField);
			
			DataElementRuleDetail de057RuleDetail = new DE057RuleDetailImpl(id, storage);
			
			return de057RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de057RuleDetail = new CreateDE057RuleDetail().createDE057RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de057RuleDetail, fieldList,codeList );
		
		}
}
