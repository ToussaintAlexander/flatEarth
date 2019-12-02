package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE032RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE032RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE032RuleDetail  {

	DataElementRuleDetailField acquiringInstitutionIdentificationCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_ID
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_FIELD
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_SUBFIELD
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_FIRE
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_TYPE
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_GROUP
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_BL
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_AL
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_TL
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_SEQUENCE
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_POINTER
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_VALUE
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_CU
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_CT
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_MU
		                                 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE032RuleDetail() {
			
			int id = 32000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(acquiringInstitutionIdentificationCodeRuleField);
			
			DataElementRuleDetail de032RuleDetail = new DE032RuleDetailImpl(id, storage);
			
			return de032RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de032RuleDetail = new CreateDE032RuleDetail().createDE032RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de032RuleDetail, fieldList,codeList );
		
		}
}
