package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE042RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE042RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE042RuleDetail  {

	DataElementRuleDetailField cardAcceptorIdentificationCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE042RuleDetail() {
			
			int id = 42000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(cardAcceptorIdentificationCodeRuleField);
			
			DataElementRuleDetail de042RuleDetail = new DE042RuleDetailImpl(id, storage);
			
			return de042RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de042RuleDetail = new CreateDE042RuleDetail().createDE042RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de042RuleDetail, fieldList,codeList );
		
		}
}
