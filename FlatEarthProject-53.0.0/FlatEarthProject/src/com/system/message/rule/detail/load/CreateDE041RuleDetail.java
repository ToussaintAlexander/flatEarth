package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE041RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE041RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE041RuleDetail  {

	DataElementRuleDetailField unassignedDataElement041RuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE041RuleDetail() {
			
			int id = 41000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(unassignedDataElement041RuleField);
			
			DataElementRuleDetail de041RuleDetail = new DE041RuleDetailImpl(id, storage);
			
			return de041RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de041RuleDetail = new CreateDE041RuleDetail().createDE041RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de041RuleDetail, fieldList,codeList );
		
		}
}
