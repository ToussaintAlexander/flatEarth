package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE036RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE036RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE036RuleDetail  {

	DataElementRuleDetailField startSentinelRuleField 	 

		= new DataElementRuleDetailField ( 
									       START_SENTINEL_036_RULE_DETAIL_ID
		                                 , START_SENTINEL_036_RULE_DETAIL_FIELD
		                                 , START_SENTINEL_036_RULE_DETAIL_SUBFIELD
		                                 , START_SENTINEL_036_RULE_DETAIL_FIRE
		                                 , START_SENTINEL_036_RULE_DETAIL_TYPE
		                                 , START_SENTINEL_036_RULE_DETAIL_GROUP
		                                 , START_SENTINEL_036_RULE_DETAIL_BL
		                                 , START_SENTINEL_036_RULE_DETAIL_AL
		                                 , START_SENTINEL_036_RULE_DETAIL_TL
		                                 , START_SENTINEL_036_RULE_DETAIL_SEQUENCE
		                                 , START_SENTINEL_036_RULE_DETAIL_POINTER
		                                 , START_SENTINEL_036_RULE_DETAIL_VALUE
		                                 , START_SENTINEL_036_RULE_DETAIL_CU
		                                 , START_SENTINEL_036_RULE_DETAIL_CT
		                                 , START_SENTINEL_036_RULE_DETAIL_MU
		                                 , START_SENTINEL_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField formatCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       FORMAT_CODE_036_RULE_DETAIL_ID
		                                 , FORMAT_CODE_036_RULE_DETAIL_FIELD
		                                 , FORMAT_CODE_036_RULE_DETAIL_SUBFIELD
		                                 , FORMAT_CODE_036_RULE_DETAIL_FIRE
		                                 , FORMAT_CODE_036_RULE_DETAIL_TYPE
		                                 , FORMAT_CODE_036_RULE_DETAIL_GROUP
		                                 , FORMAT_CODE_036_RULE_DETAIL_BL
		                                 , FORMAT_CODE_036_RULE_DETAIL_AL
		                                 , FORMAT_CODE_036_RULE_DETAIL_TL
		                                 , FORMAT_CODE_036_RULE_DETAIL_SEQUENCE
		                                 , FORMAT_CODE_036_RULE_DETAIL_POINTER
		                                 , FORMAT_CODE_036_RULE_DETAIL_VALUE
		                                 , FORMAT_CODE_036_RULE_DETAIL_CU
		                                 , FORMAT_CODE_036_RULE_DETAIL_CT
		                                 , FORMAT_CODE_036_RULE_DETAIL_MU
		                                 , FORMAT_CODE_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField binRuleField 	 

		= new DataElementRuleDetailField ( 
									       BIN_036_RULE_DETAIL_ID
		                                 , BIN_036_RULE_DETAIL_FIELD
		                                 , BIN_036_RULE_DETAIL_SUBFIELD
		                                 , BIN_036_RULE_DETAIL_FIRE
		                                 , BIN_036_RULE_DETAIL_TYPE
		                                 , BIN_036_RULE_DETAIL_GROUP
		                                 , BIN_036_RULE_DETAIL_BL
		                                 , BIN_036_RULE_DETAIL_AL
		                                 , BIN_036_RULE_DETAIL_TL
		                                 , BIN_036_RULE_DETAIL_SEQUENCE
		                                 , BIN_036_RULE_DETAIL_POINTER
		                                 , BIN_036_RULE_DETAIL_VALUE
		                                 , BIN_036_RULE_DETAIL_CU
		                                 , BIN_036_RULE_DETAIL_CT
		                                 , BIN_036_RULE_DETAIL_MU
		                                 , BIN_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField panRuleField 	 

		= new DataElementRuleDetailField ( 
									       PAN_036_RULE_DETAIL_ID
		                                 , PAN_036_RULE_DETAIL_FIELD
		                                 , PAN_036_RULE_DETAIL_SUBFIELD
		                                 , PAN_036_RULE_DETAIL_FIRE
		                                 , PAN_036_RULE_DETAIL_TYPE
		                                 , PAN_036_RULE_DETAIL_GROUP
		                                 , PAN_036_RULE_DETAIL_BL
		                                 , PAN_036_RULE_DETAIL_AL
		                                 , PAN_036_RULE_DETAIL_TL
		                                 , PAN_036_RULE_DETAIL_SEQUENCE
		                                 , PAN_036_RULE_DETAIL_POINTER
		                                 , PAN_036_RULE_DETAIL_VALUE
		                                 , PAN_036_RULE_DETAIL_CU
		                                 , PAN_036_RULE_DETAIL_CT
		                                 , PAN_036_RULE_DETAIL_MU
		                                 , PAN_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField checkDigitRuleField 	 

		= new DataElementRuleDetailField ( 
									       CHECK_DIGIT_036_RULE_DETAIL_ID
		                                 , CHECK_DIGIT_036_RULE_DETAIL_FIELD
		                                 , CHECK_DIGIT_036_RULE_DETAIL_SUBFIELD
		                                 , CHECK_DIGIT_036_RULE_DETAIL_FIRE
		                                 , CHECK_DIGIT_036_RULE_DETAIL_TYPE
		                                 , CHECK_DIGIT_036_RULE_DETAIL_GROUP
		                                 , CHECK_DIGIT_036_RULE_DETAIL_BL
		                                 , CHECK_DIGIT_036_RULE_DETAIL_AL
		                                 , CHECK_DIGIT_036_RULE_DETAIL_TL
		                                 , CHECK_DIGIT_036_RULE_DETAIL_SEQUENCE
		                                 , CHECK_DIGIT_036_RULE_DETAIL_POINTER
		                                 , CHECK_DIGIT_036_RULE_DETAIL_VALUE
		                                 , CHECK_DIGIT_036_RULE_DETAIL_CU
		                                 , CHECK_DIGIT_036_RULE_DETAIL_CT
		                                 , CHECK_DIGIT_036_RULE_DETAIL_MU
		                                 , CHECK_DIGIT_036_RULE_DETAIL_MT
	  		  	       	                 );
	
	

	DataElementRuleDetailField fieldSeparator01RuleField 	 

		= new DataElementRuleDetailField ( 
									       FIELD_SEPARATOR_01_036_RULE_DETAIL_ID
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_FIELD
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_SUBFIELD
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_FIRE
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_TYPE
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_GROUP
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_BL
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_AL
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_TL
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_SEQUENCE
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_POINTER
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_VALUE
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_CU
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_CT
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_MU
		                                 , FIELD_SEPARATOR_01_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField countryCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       COUNTRY_CODE_036_RULE_DETAIL_ID
		                                 , COUNTRY_CODE_036_RULE_DETAIL_FIELD
		                                 , COUNTRY_CODE_036_RULE_DETAIL_SUBFIELD
		                                 , COUNTRY_CODE_036_RULE_DETAIL_FIRE
		                                 , COUNTRY_CODE_036_RULE_DETAIL_TYPE
		                                 , COUNTRY_CODE_036_RULE_DETAIL_GROUP
		                                 , COUNTRY_CODE_036_RULE_DETAIL_BL
		                                 , COUNTRY_CODE_036_RULE_DETAIL_AL
		                                 , COUNTRY_CODE_036_RULE_DETAIL_TL
		                                 , COUNTRY_CODE_036_RULE_DETAIL_SEQUENCE
		                                 , COUNTRY_CODE_036_RULE_DETAIL_POINTER
		                                 , COUNTRY_CODE_036_RULE_DETAIL_VALUE
		                                 , COUNTRY_CODE_036_RULE_DETAIL_CU
		                                 , COUNTRY_CODE_036_RULE_DETAIL_CT
		                                 , COUNTRY_CODE_036_RULE_DETAIL_MU
		                                 , COUNTRY_CODE_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField currencyCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       CURRENCY_CODE_036_RULE_DETAIL_ID
		                                 , CURRENCY_CODE_036_RULE_DETAIL_FIELD
		                                 , CURRENCY_CODE_036_RULE_DETAIL_SUBFIELD
		                                 , CURRENCY_CODE_036_RULE_DETAIL_FIRE
		                                 , CURRENCY_CODE_036_RULE_DETAIL_TYPE
		                                 , CURRENCY_CODE_036_RULE_DETAIL_GROUP
		                                 , CURRENCY_CODE_036_RULE_DETAIL_BL
		                                 , CURRENCY_CODE_036_RULE_DETAIL_AL
		                                 , CURRENCY_CODE_036_RULE_DETAIL_TL
		                                 , CURRENCY_CODE_036_RULE_DETAIL_SEQUENCE
		                                 , CURRENCY_CODE_036_RULE_DETAIL_POINTER
		                                 , CURRENCY_CODE_036_RULE_DETAIL_VALUE
		                                 , CURRENCY_CODE_036_RULE_DETAIL_CU
		                                 , CURRENCY_CODE_036_RULE_DETAIL_CT
		                                 , CURRENCY_CODE_036_RULE_DETAIL_MU
		                                 , CURRENCY_CODE_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField currencyExponentRuleField 	 

		= new DataElementRuleDetailField ( 
									       CURRENCY_EXPONENT_036_RULE_DETAIL_ID
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_FIELD
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_SUBFIELD
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_FIRE
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_TYPE
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_GROUP
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_BL
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_AL
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_TL
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_SEQUENCE
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_POINTER
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_VALUE
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_CU
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_CT
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_MU
		                                 , CURRENCY_EXPONENT_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField amountAuthorizedPerCycleRuleField 	 

		= new DataElementRuleDetailField ( 
									       AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_ID
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_FIELD
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_SUBFIELD
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_FIRE
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_TYPE
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_GROUP
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_BL
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_AL
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_TL
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_SEQUENCE
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_POINTER
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_VALUE
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_CU
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_CT
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_MU
		                                 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField amountRemainingThisCycleRuleField 	 

		= new DataElementRuleDetailField ( 
									       AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_ID
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_FIELD
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_SUBFIELD
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_FIRE
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_TYPE
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_GROUP
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_BL
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_AL
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_TL
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_SEQUENCE
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_POINTER
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_VALUE
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_CU
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_CT
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_MU
		                                 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField cycleBeginRuleField 	 

		= new DataElementRuleDetailField ( 
									       CYCLE_BEGIN_036_RULE_DETAIL_ID
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_FIELD
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_SUBFIELD
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_FIRE
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_TYPE
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_GROUP
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_BL
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_AL
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_TL
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_SEQUENCE
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_POINTER
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_VALUE
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_CU
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_CT
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_MU
		                                 , CYCLE_BEGIN_036_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField cycleLengthRuleField 	 

		= new DataElementRuleDetailField ( 
									       CYCLE_LENGTH_036_RULE_DETAIL_ID
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_FIELD
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_SUBFIELD
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_FIRE
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_TYPE
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_GROUP
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_BL
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_AL
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_TL
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_SEQUENCE
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_POINTER
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_VALUE
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_CU
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_CT
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_MU
		                                 , CYCLE_LENGTH_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField retryCountRuleField 	 

		= new DataElementRuleDetailField ( 
									       RETRY_COUNT_036_RULE_DETAIL_ID
		                                 , RETRY_COUNT_036_RULE_DETAIL_FIELD
		                                 , RETRY_COUNT_036_RULE_DETAIL_SUBFIELD
		                                 , RETRY_COUNT_036_RULE_DETAIL_FIRE
		                                 , RETRY_COUNT_036_RULE_DETAIL_TYPE
		                                 , RETRY_COUNT_036_RULE_DETAIL_GROUP
		                                 , RETRY_COUNT_036_RULE_DETAIL_BL
		                                 , RETRY_COUNT_036_RULE_DETAIL_AL
		                                 , RETRY_COUNT_036_RULE_DETAIL_TL
		                                 , RETRY_COUNT_036_RULE_DETAIL_SEQUENCE
		                                 , RETRY_COUNT_036_RULE_DETAIL_POINTER
		                                 , RETRY_COUNT_036_RULE_DETAIL_VALUE
		                                 , RETRY_COUNT_036_RULE_DETAIL_CU
		                                 , RETRY_COUNT_036_RULE_DETAIL_CT
		                                 , RETRY_COUNT_036_RULE_DETAIL_MU
		                                 , RETRY_COUNT_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField pinControlParametersRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_ID
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_FIELD
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_SUBFIELD
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_FIRE
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_TYPE
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_GROUP
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_BL
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_AL
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_TL
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_SEQUENCE
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_POINTER
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_VALUE
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_CU
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_CT
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_MU
		                                 , PIN_CONTROL_PARAMETERS_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField interchangeControlsRuleField 	 

		= new DataElementRuleDetailField ( 
									       INTERCHANGE_CONTROLS_036_RULE_DETAIL_ID
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_FIELD
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_SUBFIELD
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_FIRE
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_TYPE
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_GROUP
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_BL
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_AL
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_TL
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_SEQUENCE
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_POINTER
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_VALUE
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_CU
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_CT
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_MU
		                                 , INTERCHANGE_CONTROLS_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField panServiceRestrictionRuleField 	 

		= new DataElementRuleDetailField ( 
								           PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_ID
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_BL
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_AL
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_TL
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_CU
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_CT
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_MU
	                                     , PAN_SERVICE_RESTRICTION_036_RULE_DETAIL_MT
  		  	       	                     );


	DataElementRuleDetailField san1ServiceRestrictionRuleField 	 

		= new DataElementRuleDetailField ( 
								       	   SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_ID
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_BL
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_AL
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_TL
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_CU
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_CT
	                                     , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_MU
	                                 	 , SAN_1_SERVICE_RESTRICTION_036_RULE_DETAIL_MT
  		  	       	                     );


	DataElementRuleDetailField san2ServiceRestrictionRuleField 	 

		= new DataElementRuleDetailField ( 
								           SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_ID
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_FIELD
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_SUBFIELD
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_FIRE
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_TYPE
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_GROUP
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_BL
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_AL
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_TL
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_SEQUENCE
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_POINTER
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_VALUE
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_CU
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_CT
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_MU
	                                     , SAN_2_SERVICE_RESTRICTION_036_RULE_DETAIL_MT
  		  	       	                     );
								
	
	DataElementRuleDetailField expirationDateYearRuleField 	 

		= new DataElementRuleDetailField ( 
									       EXPIRATION_DATE_YEAR_036_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_YEAR_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField expirationDateMonthRuleField 	 

		= new DataElementRuleDetailField ( 
									       EXPIRATION_DATE_MONTH_036_RULE_DETAIL_ID
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_FIELD
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_SUBFIELD
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_FIRE
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_TYPE
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_GROUP
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_BL
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_AL
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_TL
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_SEQUENCE
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_POINTER
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_VALUE
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_CU
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_CT
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_MU
		                                 , EXPIRATION_DATE_MONTH_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardSequenceNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_ID
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_FIELD
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_SUBFIELD
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_FIRE
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_TYPE
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_GROUP
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_BL
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_AL
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_TL
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_SEQUENCE
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_POINTER
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_VALUE
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_CU
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_CT
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_MU
		                                 , CARD_SEQUENCE_NUMBER_036_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField cardSecurityNumberRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_SECURITY_NUMBER_036_RULE_DETAIL_ID
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_FIELD
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_SUBFIELD
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_FIRE
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_TYPE
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_GROUP
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_BL
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_AL
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_TL
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_SEQUENCE
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_POINTER
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_VALUE
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_CU
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_CT
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_MU
		                                 , CARD_SECURITY_NUMBER_036_RULE_DETAIL_MT
	  		  	       	                 );	


	DataElementRuleDetailField firstSubsidiaryAcctNbrRuleField 	 

		= new DataElementRuleDetailField ( 
									       FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_ID
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIELD
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SUBFIELD
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIRE
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TYPE
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_GROUP
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_BL
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_AL
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TL
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SEQUENCE
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_POINTER
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_VALUE
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CU
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CT
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MU
		                                 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MT
	  		  	       	                 );	

	DataElementRuleDetailField secondarySubsidiaryAcctNbrRuleField 	 

		= new DataElementRuleDetailField ( 
									       SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_ID
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIELD
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SUBFIELD
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_FIRE
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TYPE
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_GROUP
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_BL
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_AL
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_TL
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_SEQUENCE
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_POINTER
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_VALUE
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CU
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_CT
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MU
		                                 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_DETAIL_MT
	  		  	       	                 );	

	DataElementRuleDetailField relayMarkerRuleField 	 

		= new DataElementRuleDetailField ( 
								           RELAY_MARKER_036_RULE_DETAIL_ID
	                                     , RELAY_MARKER_036_RULE_DETAIL_FIELD
	                                     , RELAY_MARKER_036_RULE_DETAIL_SUBFIELD
	                                     , RELAY_MARKER_036_RULE_DETAIL_FIRE
	                                     , RELAY_MARKER_036_RULE_DETAIL_TYPE
	                                     , RELAY_MARKER_036_RULE_DETAIL_GROUP
	                                     , RELAY_MARKER_036_RULE_DETAIL_BL
	                                     , RELAY_MARKER_036_RULE_DETAIL_AL
	                                     , RELAY_MARKER_036_RULE_DETAIL_TL
	                                     , RELAY_MARKER_036_RULE_DETAIL_SEQUENCE
	                                     , RELAY_MARKER_036_RULE_DETAIL_POINTER
	                                     , RELAY_MARKER_036_RULE_DETAIL_VALUE
	                                     , RELAY_MARKER_036_RULE_DETAIL_CU
	                                     , RELAY_MARKER_036_RULE_DETAIL_CT
	                                     , RELAY_MARKER_036_RULE_DETAIL_MU
	                                     , RELAY_MARKER_036_RULE_DETAIL_MT
  		  	       	                     );	

	DataElementRuleDetailField cryptographicCheckDigitsRuleField 	 

		= new DataElementRuleDetailField ( 
								           CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_ID
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_FIELD
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_SUBFIELD
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_FIRE
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_TYPE
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_GROUP
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_BL
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_AL
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_TL
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_SEQUENCE
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_POINTER
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_VALUE
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_CU
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_CT
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_MU
	                                     , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_DETAIL_MT
  		  	       	                     );	

	
	DataElementRuleDetailField pinValueKeyIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_ID
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_FIELD
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_SUBFIELD
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_FIRE
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_TYPE
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_GROUP
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_BL
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_AL
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_TL
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_SEQUENCE
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_POINTER
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_VALUE
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_CU
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_CT
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_MU
		                                 , PIN_VALUE_KEY_INDICATOR_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField pinVerificationValueRuleField 	 

		= new DataElementRuleDetailField ( 
									       PIN_VERIFICATION_VALUE_036_RULE_DETAIL_ID
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_FIELD
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_SUBFIELD
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_FIRE
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_TYPE
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_GROUP
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_BL
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_AL
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_TL
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_SEQUENCE
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_POINTER
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_VALUE
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_CU
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_CT
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_MU
		                                 , PIN_VERIFICATION_VALUE_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardVerificationValueRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_VERIFICATION_VALUE_036_RULE_DETAIL_ID
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_FIELD
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_SUBFIELD
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_FIRE
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_TYPE
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_GROUP
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_BL
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_AL
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_TL
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_SEQUENCE
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_POINTER
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_VALUE
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_CU
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_CT
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_MU
		                                 , CARD_VERIFICATION_VALUE_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField endSentinelRuleField 	 

		= new DataElementRuleDetailField ( 
									       END_SENTINEL_036_RULE_DETAIL_ID
		                                 , END_SENTINEL_036_RULE_DETAIL_FIELD
		                                 , END_SENTINEL_036_RULE_DETAIL_SUBFIELD
		                                 , END_SENTINEL_036_RULE_DETAIL_FIRE
		                                 , END_SENTINEL_036_RULE_DETAIL_TYPE
		                                 , END_SENTINEL_036_RULE_DETAIL_GROUP
		                                 , END_SENTINEL_036_RULE_DETAIL_BL
		                                 , END_SENTINEL_036_RULE_DETAIL_AL
		                                 , END_SENTINEL_036_RULE_DETAIL_TL
		                                 , END_SENTINEL_036_RULE_DETAIL_SEQUENCE
		                                 , END_SENTINEL_036_RULE_DETAIL_POINTER
		                                 , END_SENTINEL_036_RULE_DETAIL_VALUE
		                                 , END_SENTINEL_036_RULE_DETAIL_CU
		                                 , END_SENTINEL_036_RULE_DETAIL_CT
		                                 , END_SENTINEL_036_RULE_DETAIL_MU
		                                 , END_SENTINEL_036_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField longRedundancyCheckCharRuleField 	 

		= new DataElementRuleDetailField ( 
									       LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_ID
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_FIELD
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_SUBFIELD
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_FIRE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_TYPE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_GROUP
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_BL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_AL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_TL
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_SEQUENCE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_POINTER
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_VALUE
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_CU
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_CT
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_MU
		                                 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE036RuleDetail() {
			
			int id = 36000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(startSentinelRuleField);
			storage.add(formatCodeRuleField);
			
//			storage.add(primaryAccountNumberRuleField);
			
			storage.add(binRuleField);
			storage.add(panRuleField);
			storage.add(checkDigitRuleField);
			
			storage.add(fieldSeparator01RuleField);
			storage.add(countryCodeRuleField);
			storage.add(currencyCodeRuleField);
			storage.add(currencyExponentRuleField);
			storage.add(amountAuthorizedPerCycleRuleField);
			storage.add(amountRemainingThisCycleRuleField);
			storage.add(cycleBeginRuleField);
			storage.add(cycleLengthRuleField);
			storage.add(retryCountRuleField);
			storage.add(pinControlParametersRuleField);
			storage.add(interchangeControlsRuleField);
			storage.add(panServiceRestrictionRuleField);
			storage.add(san1ServiceRestrictionRuleField);
			storage.add(san2ServiceRestrictionRuleField);
			storage.add(expirationDateYearRuleField);
			storage.add(expirationDateMonthRuleField);
			storage.add(cardSequenceNumberRuleField);
			storage.add(cardSecurityNumberRuleField);
			storage.add(firstSubsidiaryAcctNbrRuleField);
			storage.add(secondarySubsidiaryAcctNbrRuleField);
			storage.add(relayMarkerRuleField);
			storage.add(cryptographicCheckDigitsRuleField);
			storage.add(pinValueKeyIndicatorRuleField);
			storage.add(pinVerificationValueRuleField);
			storage.add(cardVerificationValueRuleField);
			storage.add(endSentinelRuleField);
			storage.add(longRedundancyCheckCharRuleField);
			
			DataElementRuleDetail de036RuleDetail = new DE036RuleDetailImpl(id, storage);
			
			return de036RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de036RuleDetail = new CreateDE036RuleDetail().createDE036RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de036RuleDetail, fieldList,codeList );
		
		}
}
