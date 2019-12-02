package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE023RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE023RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE023RuleDetail  {

	DataElementRuleDetailField applicationPanSequenceNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_ID
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_FIELD
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_SUBFIELD
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_FIRE
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_TYPE
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_GROUP
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_BL
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_AL
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_TL
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_SEQUENCE
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_POINTER
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_VALUE
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_CU
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_CT
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_MU
		                                 , APPLICATION_PAN_SEQUENCE_NUMBER_023_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE023RuleDetail() {
			
			int id = 23000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(applicationPanSequenceNumberRuleField);
			
			DataElementRuleDetail de023RuleDetail = new DE023RuleDetailImpl(id, storage);
			
			return de023RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de023RuleDetail = new CreateDE023RuleDetail().createDE023RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de023RuleDetail, fieldList,codeList );
		
		}
}
