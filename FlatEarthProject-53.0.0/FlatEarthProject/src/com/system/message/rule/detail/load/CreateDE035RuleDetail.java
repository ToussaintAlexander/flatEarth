package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE035RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE035RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE035RuleDetail  {

	DataElementRuleDetailField startSentinelRuleField 	 

		= new DataElementRuleDetailField ( 
									       START_SENTINEL_035_RULE_DETAIL_ID
		                                 , START_SENTINEL_035_RULE_DETAIL_FIELD
		                                 , START_SENTINEL_035_RULE_DETAIL_SUBFIELD
		                                 , START_SENTINEL_035_RULE_DETAIL_FIRE
		                                 , START_SENTINEL_035_RULE_DETAIL_TYPE
		                                 , START_SENTINEL_035_RULE_DETAIL_GROUP
		                                 , START_SENTINEL_035_RULE_DETAIL_BL
		                                 , START_SENTINEL_035_RULE_DETAIL_AL
		                                 , START_SENTINEL_035_RULE_DETAIL_TL
		                                 , START_SENTINEL_035_RULE_DETAIL_SEQUENCE
		                                 , START_SENTINEL_035_RULE_DETAIL_POINTER
		                                 , START_SENTINEL_035_RULE_DETAIL_VALUE
		                                 , START_SENTINEL_035_RULE_DETAIL_CU
		                                 , START_SENTINEL_035_RULE_DETAIL_CT
		                                 , START_SENTINEL_035_RULE_DETAIL_MU
		                                 , START_SENTINEL_035_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField binRuleField 	 

		= new DataElementRuleDetailField ( 
									       BIN_035_RULE_DETAIL_ID
		                                 , BIN_035_RULE_DETAIL_FIELD
		                                 , BIN_035_RULE_DETAIL_SUBFIELD
		                                 , BIN_035_RULE_DETAIL_FIRE
		                                 , BIN_035_RULE_DETAIL_TYPE
		                                 , BIN_035_RULE_DETAIL_GROUP
		                                 , BIN_035_RULE_DETAIL_BL
		                                 , BIN_035_RULE_DETAIL_AL
		                                 , BIN_035_RULE_DETAIL_TL
		                                 , BIN_035_RULE_DETAIL_SEQUENCE
		                                 , BIN_035_RULE_DETAIL_POINTER
		                                 , BIN_035_RULE_DETAIL_VALUE
		                                 , BIN_035_RULE_DETAIL_CU
		                                 , BIN_035_RULE_DETAIL_CT
		                                 , BIN_035_RULE_DETAIL_MU
		                                 , BIN_035_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField panRuleField 	 

		= new DataElementRuleDetailField ( 
									       PAN_035_RULE_DETAIL_ID
		                                 , PAN_035_RULE_DETAIL_FIELD
		                                 , PAN_035_RULE_DETAIL_SUBFIELD
		                                 , PAN_035_RULE_DETAIL_FIRE
		                                 , PAN_035_RULE_DETAIL_TYPE
		                                 , PAN_035_RULE_DETAIL_GROUP
		                                 , PAN_035_RULE_DETAIL_BL
		                                 , PAN_035_RULE_DETAIL_AL
		                                 , PAN_035_RULE_DETAIL_TL
		                                 , PAN_035_RULE_DETAIL_SEQUENCE
		                                 , PAN_035_RULE_DETAIL_POINTER
		                                 , PAN_035_RULE_DETAIL_VALUE
		                                 , PAN_035_RULE_DETAIL_CU
		                                 , PAN_035_RULE_DETAIL_CT
		                                 , PAN_035_RULE_DETAIL_MU
		                                 , PAN_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField checkDigitRuleField 	 

		= new DataElementRuleDetailField ( 
									       CHECK_DIGIT_035_RULE_DETAIL_ID
		                                 , CHECK_DIGIT_035_RULE_DETAIL_FIELD
		                                 , CHECK_DIGIT_035_RULE_DETAIL_SUBFIELD
		                                 , CHECK_DIGIT_035_RULE_DETAIL_FIRE
		                                 , CHECK_DIGIT_035_RULE_DETAIL_TYPE
		                                 , CHECK_DIGIT_035_RULE_DETAIL_GROUP
		                                 , CHECK_DIGIT_035_RULE_DETAIL_BL
		                                 , CHECK_DIGIT_035_RULE_DETAIL_AL
		                                 , CHECK_DIGIT_035_RULE_DETAIL_TL
		                                 , CHECK_DIGIT_035_RULE_DETAIL_SEQUENCE
		                                 , CHECK_DIGIT_035_RULE_DETAIL_POINTER
		                                 , CHECK_DIGIT_035_RULE_DETAIL_VALUE
		                                 , CHECK_DIGIT_035_RULE_DETAIL_CU
		                                 , CHECK_DIGIT_035_RULE_DETAIL_CT
		                                 , CHECK_DIGIT_035_RULE_DETAIL_MU
		                                 , CHECK_DIGIT_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField fieldSeparator01RuleField 	 

		= new DataElementRuleDetailField ( 
									       FIELD_SEPARATOR_01_035_RULE_DETAIL_ID
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_FIELD
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_SUBFIELD
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_FIRE
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_TYPE
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_GROUP
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_BL
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_AL
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_TL
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_SEQUENCE
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_POINTER
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_VALUE
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_CU
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_CT
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_MU
		                                 , FIELD_SEPARATOR_01_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField expirationDateYearRuleField 	 

		= new DataElementRuleDetailField ( 
									       EXPIRATION_DATE_YEAR_035_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_YEAR_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField expirationDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
									       EXPIRATION_DATE_MONTH_035_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_MONTH_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField serviceCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       SERVICE_CODE_035_RULE_DETAIL_ID
		                                 , SERVICE_CODE_035_RULE_DETAIL_FIELD
		                                 , SERVICE_CODE_035_RULE_DETAIL_SUBFIELD
		                                 , SERVICE_CODE_035_RULE_DETAIL_FIRE
		                                 , SERVICE_CODE_035_RULE_DETAIL_TYPE
		                                 , SERVICE_CODE_035_RULE_DETAIL_GROUP
		                                 , SERVICE_CODE_035_RULE_DETAIL_BL
		                                 , SERVICE_CODE_035_RULE_DETAIL_AL
		                                 , SERVICE_CODE_035_RULE_DETAIL_TL
		                                 , SERVICE_CODE_035_RULE_DETAIL_SEQUENCE
		                                 , SERVICE_CODE_035_RULE_DETAIL_POINTER
		                                 , SERVICE_CODE_035_RULE_DETAIL_VALUE
		                                 , SERVICE_CODE_035_RULE_DETAIL_CU
		                                 , SERVICE_CODE_035_RULE_DETAIL_CT
		                                 , SERVICE_CODE_035_RULE_DETAIL_MU
		                                 , SERVICE_CODE_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField pinValueKeyIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_ID
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_FIELD
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_SUBFIELD
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_FIRE
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_TYPE
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_GROUP
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_BL
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_AL
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_TL
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_SEQUENCE
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_POINTER
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_VALUE
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_CU
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_CT
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_MU
		                                 , PIN_VALUE_KEY_INDICATOR_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField pinVerificationValueRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_VERIFICATION_VALUE_035_RULE_DETAIL_ID
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_FIELD
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_SUBFIELD
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_FIRE
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_TYPE
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_GROUP
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_BL
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_AL
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_TL
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_SEQUENCE
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_POINTER
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_VALUE
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_CU
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_CT
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_MU
		                                 , PIN_VERIFICATION_VALUE_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardVerificationValueRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_VERIFICATION_VALUE_035_RULE_DETAIL_ID
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_FIELD
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_SUBFIELD
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_FIRE
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_TYPE
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_GROUP
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_BL
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_AL
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_TL
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_SEQUENCE
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_POINTER
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_VALUE
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_CU
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_CT
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_MU
		                                 , CARD_VERIFICATION_VALUE_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField endSentinelRuleField 	 

		= new DataElementRuleDetailField ( 
									       END_SENTINEL_035_RULE_DETAIL_ID
		                                 , END_SENTINEL_035_RULE_DETAIL_FIELD
		                                 , END_SENTINEL_035_RULE_DETAIL_SUBFIELD
		                                 , END_SENTINEL_035_RULE_DETAIL_FIRE
		                                 , END_SENTINEL_035_RULE_DETAIL_TYPE
		                                 , END_SENTINEL_035_RULE_DETAIL_GROUP
		                                 , END_SENTINEL_035_RULE_DETAIL_BL
		                                 , END_SENTINEL_035_RULE_DETAIL_AL
		                                 , END_SENTINEL_035_RULE_DETAIL_TL
		                                 , END_SENTINEL_035_RULE_DETAIL_SEQUENCE
		                                 , END_SENTINEL_035_RULE_DETAIL_POINTER
		                                 , END_SENTINEL_035_RULE_DETAIL_VALUE
		                                 , END_SENTINEL_035_RULE_DETAIL_CU
		                                 , END_SENTINEL_035_RULE_DETAIL_CT
		                                 , END_SENTINEL_035_RULE_DETAIL_MU
		                                 , END_SENTINEL_035_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField longRedundancyCheckCharRuleField 	 

		= new DataElementRuleDetailField ( 
									       LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_ID
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_FIELD
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_SUBFIELD
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_FIRE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_TYPE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_GROUP
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_BL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_AL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_TL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_SEQUENCE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_POINTER
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_VALUE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_CU
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_CT
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_MU
		                                 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE035RuleDetail() {
			
			int id = 35000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(startSentinelRuleField);
			
//			storage.add(primaryAccountNumberRuleField);
			
			storage.add(binRuleField);
			storage.add(panRuleField);
			storage.add(checkDigitRuleField);
			
			storage.add(fieldSeparator01RuleField);
			storage.add(expirationDateYearRuleField);
			storage.add(expirationDateMonthRuleField);
			storage.add(serviceCodeRuleField);
			storage.add(pinValueKeyIndicatorRuleField);
			storage.add(pinVerificationValueRuleField);
			storage.add(cardVerificationValueRuleField);
			storage.add(endSentinelRuleField);
			storage.add(longRedundancyCheckCharRuleField);
			
			DataElementRuleDetail de035RuleDetail = new DE035RuleDetailImpl(id, storage);
			
			return de035RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de035RuleDetail = new CreateDE035RuleDetail().createDE035RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de035RuleDetail, fieldList,codeList );
		
		}
}
