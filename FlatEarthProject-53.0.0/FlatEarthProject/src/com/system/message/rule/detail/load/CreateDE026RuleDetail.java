package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE026RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE026RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE026RuleDetail  {

	DataElementRuleDetailField pointOfServicePinCaptureCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_ID
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_FIELD
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_SUBFIELD
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_FIRE
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_TYPE
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_GROUP
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_BL
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_AL
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_TL
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_SEQUENCE
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_POINTER
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_VALUE
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_CU
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_CT
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_MU
		                                 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE026RuleDetail() {
			
			int id = 26000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(pointOfServicePinCaptureCodeRuleField);
			
			DataElementRuleDetail de026RuleDetail = new DE026RuleDetailImpl(id, storage);
			
			return de026RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de026RuleDetail = new CreateDE026RuleDetail().createDE026RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de026RuleDetail, fieldList,codeList );
		
		}
}
