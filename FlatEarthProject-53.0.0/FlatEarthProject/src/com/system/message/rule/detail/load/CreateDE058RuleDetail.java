package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE058RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE058RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE058RuleDetail  {

	DataElementRuleDetailField unassignedDataElement058RuleField 	 

		= new DataElementRuleDetailField ( 
									       UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_ID
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_FIELD
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_SUBFIELD
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_FIRE
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_TYPE
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_GROUP
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_BL
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_AL
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_TL
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_SEQUENCE
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_POINTER
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_VALUE
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_CU
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_CT
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_MU
		                                 , UNASSIGNED_DATA_ELEMENT_058_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE058RuleDetail() {
			
			int id = 58000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement058RuleField);
			
			DataElementRuleDetail de058RuleDetail = new DE058RuleDetailImpl(id, storage);
			
			return de058RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de058RuleDetail = new CreateDE058RuleDetail().createDE058RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de058RuleDetail, fieldList,codeList );
		
		}
}
