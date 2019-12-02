package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE055RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE055RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE055RuleDetail  {

	DataElementRuleDetailField issuerScripts7100RuleField 	 

		= new DataElementRuleDetailField ( 
									       ISSUER_SCRIPTS_055_7100_RULE_DETAIL_ID
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_FIELD
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_SUBFIELD
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_FIRE
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_TYPE
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_GROUP
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_BL
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_AL
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_TL
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_SEQUENCE
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_POINTER
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_VALUE
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_CU
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_CT
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_MU
		                                 , ISSUER_SCRIPTS_055_7100_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField issuerScripts7200RuleField 	 

		= new DataElementRuleDetailField ( 
									       ISSUER_SCRIPTS_055_7200_RULE_DETAIL_ID
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_FIELD
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_SUBFIELD
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_FIRE
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_TYPE
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_GROUP
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_BL
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_AL
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_TL
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_SEQUENCE
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_POINTER
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_VALUE
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_CU
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_CT
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_MU
		                                 , ISSUER_SCRIPTS_055_7200_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField applInterProfileFlags8200RuleField 	 

		= new DataElementRuleDetailField ( 
									       APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_ID
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_FIELD
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_SUBFIELD
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_FIRE
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_TYPE
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_GROUP
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_BL
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_AL
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_TL
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_SEQUENCE
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_POINTER
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_VALUE
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_CU
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_CT
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_MU
		                                 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField dedicatedFname8400RuleField 	 

		= new DataElementRuleDetailField ( 
									       DEDICATED_FNAME_055_8400_RULE_DETAIL_ID
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_FIELD
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_SUBFIELD
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_FIRE
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_TYPE
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_GROUP
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_BL
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_AL
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_TL
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_SEQUENCE
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_POINTER
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_VALUE
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_CU
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_CT
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_MU
		                                 , DEDICATED_FNAME_055_8400_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField issuerArpc9100RuleField 	 

		= new DataElementRuleDetailField ( 
									       ISSUER_ARPC_055_9100_RULE_DETAIL_ID
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_FIELD
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_SUBFIELD
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_FIRE
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_TYPE
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_GROUP
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_BL
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_AL
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_TL
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_SEQUENCE
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_POINTER
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_VALUE
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_CU
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_CT
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_MU
		                                 , ISSUER_ARPC_055_9100_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tvrFlags9500RuleField 	 

		= new DataElementRuleDetailField ( 
									       TVR_FLAGS_055_9500_RULE_DETAIL_ID
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_FIELD
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_SUBFIELD
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_FIRE
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_TYPE
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_GROUP
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_BL
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_AL
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_TL
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_SEQUENCE
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_POINTER
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_VALUE
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_CU
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_CT
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_MU
		                                 , TVR_FLAGS_055_9500_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranDate9ARuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_DATE_055_9A_RULE_DETAIL_ID
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_FIELD
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_SUBFIELD
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_FIRE
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_TYPE
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_GROUP
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_BL
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_AL
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_TL
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_SEQUENCE
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_POINTER
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_VALUE
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_CU
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_CT
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_MU
		                                 , TRAN_DATE_055_9A_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranType9CRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_TYPE_055_9C_RULE_DETAIL_ID
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_FIELD
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_SUBFIELD
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_FIRE
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_TYPE
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_GROUP
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_BL
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_AL
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_TL
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_SEQUENCE
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_POINTER
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_VALUE
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_CU
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_CT
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_MU
		                                 , TRAN_TYPE_055_9C_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField newPinBlockHCRuleField 	 

		= new DataElementRuleDetailField ( 
									       NEW_PIN_BLOCK_055_HC_RULE_DETAIL_ID
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_FIELD
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_SUBFIELD
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_FIRE
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_TYPE
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_GROUP
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_BL
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_AL
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_TL
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_SEQUENCE
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_POINTER
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_VALUE
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_CU
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_CT
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_MU
		                                 , NEW_PIN_BLOCK_055_HC_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranCurrCode5F2ARuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_ID
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_FIELD
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_SUBFIELD
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_FIRE
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_TYPE
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_GROUP
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_BL
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_AL
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_TL
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_SEQUENCE
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_POINTER
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_VALUE
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_CU
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_CT
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_MU
		                                 , TRAN_CURR_CODE_055_5F2A_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranAmount9F02RuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_AMOUNT_055_9F02_RULE_DETAIL_ID
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_FIELD
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_SUBFIELD
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_FIRE
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_TYPE
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_GROUP
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_BL
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_AL
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_TL
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_SEQUENCE
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_POINTER
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_VALUE
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_CU
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_CT
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_MU
		                                 , TRAN_AMOUNT_055_9F02_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField otherCashBackAmt9F03RuleField 	 

		= new DataElementRuleDetailField ( 
									       OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_ID
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_FIELD
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_SUBFIELD
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_FIRE
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_TYPE
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_GROUP
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_BL
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_AL
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_TL
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_SEQUENCE
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_POINTER
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_VALUE
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_CU
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_CT
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_MU
		                                 , OTHER_CASH_BACK_AMT_055_9F03_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField applVersionNbr9F09RuleField 	 

		= new DataElementRuleDetailField ( 
									       APPL_VERSION_NBR_055_9F09_RULE_DETAIL_ID
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_FIELD
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_SUBFIELD
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_FIRE
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_TYPE
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_GROUP
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_BL
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_AL
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_TL
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_SEQUENCE
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_POINTER
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_VALUE
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_CU
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_CT
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_MU
		                                 , APPL_VERSION_NBR_055_9F09_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField issApplDataFlagsBF10RuleField 	 

		= new DataElementRuleDetailField ( 
									       ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_ID
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_FIELD
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_SUBFIELD
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_FIRE
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_TYPE
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_GROUP
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_BL
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_AL
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_TL
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_SEQUENCE
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_POINTER
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_VALUE
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_CU
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_CT
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_MU
		                                 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField termCountryCode9F1ARuleField 	 

		= new DataElementRuleDetailField ( 
									       TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_ID
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_FIELD
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_SUBFIELD
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_FIRE
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_TYPE
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_GROUP
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_BL
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_AL
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_TL
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_SEQUENCE
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_POINTER
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_VALUE
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_CU
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_CT
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_MU
		                                 , TERM_COUNTRY_CODE_055_9F1A_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField termSerialNbr9F1ERuleField 	 

		= new DataElementRuleDetailField ( 
									       TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_ID
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_FIELD
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_SUBFIELD
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_FIRE
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_TYPE
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_GROUP
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_BL
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_AL
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_TL
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_SEQUENCE
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_POINTER
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_VALUE
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_CU
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_CT
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_MU
		                                 , TERM_SERIAL_NBR_055_9F1E_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cryptoArqcData9F26RuleField 	 

		= new DataElementRuleDetailField ( 
									       CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_ID
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_FIELD
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_SUBFIELD
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_FIRE
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_TYPE
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_GROUP
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_BL
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_AL
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_TL
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_SEQUENCE
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_POINTER
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_VALUE
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_CU
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_CT
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_MU
		                                 , CRYPTO_ARQC_DATA_055_9F26_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField terminalProfileFlags9F33RuleField 	 

		= new DataElementRuleDetailField ( 
									       TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_ID
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_FIELD
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_SUBFIELD
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_FIRE
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_TYPE
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_GROUP
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_BL
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_AL
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_TL
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_SEQUENCE
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_POINTER
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_VALUE
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_CU
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_CT
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_MU
		                                 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField terminalType9F35RuleField 	 

		= new DataElementRuleDetailField ( 
									       TERMINAL_TYPE_055_9F35_RULE_DETAIL_ID
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_FIELD
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_SUBFIELD
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_FIRE
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_TYPE
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_GROUP
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_BL
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_AL
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_TL
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_SEQUENCE
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_POINTER
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_VALUE
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_CU
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_CT
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_MU
		                                 , TERMINAL_TYPE_055_9F35_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField atcData9F36RuleField 	 

		= new DataElementRuleDetailField ( 
									       ATC_DATA_055_9F36_RULE_DETAIL_ID
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_FIELD
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_SUBFIELD
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_FIRE
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_TYPE
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_GROUP
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_BL
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_AL
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_TL
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_SEQUENCE
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_POINTER
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_VALUE
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_CU
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_CT
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_MU
		                                 , ATC_DATA_055_9F36_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField unpredictableNbr9F37RuleField 	 

		= new DataElementRuleDetailField ( 
									       UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_ID
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_FIELD
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_SUBFIELD
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_FIRE
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_TYPE
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_GROUP
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_BL
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_AL
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_TL
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_SEQUENCE
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_POINTER
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_VALUE
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_CU
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_CT
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_MU
		                                 , UNPREDICATBLE_NBR_055_9F37_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranSeqCtr9F41RuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_ID
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_FIELD
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_SUBFIELD
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_FIRE
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_TYPE
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_GROUP
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_BL
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_AL
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_TL
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_SEQUENCE
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_POINTER
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_VALUE
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_CU
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_CT
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_MU
		                                 , TRAN_SEQ_CTR_055_9F41_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField tranCategoryCode9F53RuleField 	 

		= new DataElementRuleDetailField ( 
									       TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_ID
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_FIELD
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_SUBFIELD
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_FIRE
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_TYPE
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_GROUP
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_BL
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_AL
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_TL
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_SEQUENCE
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_POINTER
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_VALUE
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_CU
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_CT
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_MU
		                                 , TRAN_CATEGORY_CODE_055_9F53_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField issScriptResults9F5BRuleField 	 

		= new DataElementRuleDetailField ( 
									       ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_ID
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_FIELD
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_SUBFIELD
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_FIRE
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_TYPE
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_GROUP
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_BL
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_AL
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_TL
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_SEQUENCE
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_POINTER
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_VALUE
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_CU
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_CT
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_MU
		                                 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField formFactor9F6ERuleField 	 

		= new DataElementRuleDetailField ( 
									       FORM_FACTOR_055_9F6E_RULE_DETAIL_ID
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_FIELD
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_SUBFIELD
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_FIRE
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_TYPE
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_GROUP
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_BL
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_AL
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_TL
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_SEQUENCE
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_POINTER
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_VALUE
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_CU
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_CT
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_MU
		                                 , FORM_FACTOR_055_9F6E_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE055RuleDetail() {
			
			int id = 55000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(issuerScripts7100RuleField);
			storage.add(issuerScripts7200RuleField);
			storage.add(applInterProfileFlags8200RuleField);
			storage.add(dedicatedFname8400RuleField);
			storage.add(issuerArpc9100RuleField);
			storage.add(tvrFlags9500RuleField);
			storage.add(tranDate9ARuleField);
			storage.add(tranType9CRuleField);
			storage.add(newPinBlockHCRuleField);
			storage.add(tranCurrCode5F2ARuleField);
			storage.add(tranAmount9F02RuleField);
			storage.add(otherCashBackAmt9F03RuleField);
			storage.add(applVersionNbr9F09RuleField);
			storage.add(issApplDataFlagsBF10RuleField);
			storage.add(termCountryCode9F1ARuleField);
			storage.add(termSerialNbr9F1ERuleField);
			storage.add(cryptoArqcData9F26RuleField);
			storage.add(terminalProfileFlags9F33RuleField);
			storage.add(terminalType9F35RuleField);
			storage.add(atcData9F36RuleField);
			storage.add(unpredictableNbr9F37RuleField);
			storage.add(tranSeqCtr9F41RuleField);
			storage.add(tranCategoryCode9F53RuleField);
			storage.add(issScriptResults9F5BRuleField);
			storage.add(formFactor9F6ERuleField);
			
			DataElementRuleDetail de055RuleDetail = new DE055RuleDetailImpl(id, storage);
			
			return de055RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de055RuleDetail = new CreateDE055RuleDetail().createDE055RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de055RuleDetail, fieldList,codeList );
		
		}
}
