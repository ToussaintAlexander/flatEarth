package com.system.message.element.load;

import static com.system.message.element.DE055.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE055Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE055  {

	DataElementField issuerScripts1Field 
	
		= new DataElementField ( ISSUER_SCRIPTS_055_7100_ID
					           , ISSUER_SCRIPTS_055_7100_FIELD
					           , ISSUER_SCRIPTS_055_7100_SUBFIELD
					           , ISSUER_SCRIPTS_055_7100_FORMAT
					           , ISSUER_SCRIPTS_055_7100_LENGTH
					           , ISSUER_SCRIPTS_055_7100_ENCODING
					           , ISSUER_SCRIPTS_055_7100_DATATYPE
					           , ISSUER_SCRIPTS_055_7100_SOURCE
					           , ISSUER_SCRIPTS_055_7100_DIRECTION
					           , ISSUER_SCRIPTS_055_7100_EXISTENCE
					           , ISSUER_SCRIPTS_055_7100_CHANGE
					           , ISSUER_SCRIPTS_055_7100_VALUE
					   	      );
	

	DataElementField issuerScripts2Field 
	
		= new DataElementField ( ISSUER_SCRIPTS_055_7200_ID
					           , ISSUER_SCRIPTS_055_7200_FIELD
					           , ISSUER_SCRIPTS_055_7200_SUBFIELD
					           , ISSUER_SCRIPTS_055_7200_FORMAT
					           , ISSUER_SCRIPTS_055_7200_LENGTH
					           , ISSUER_SCRIPTS_055_7200_ENCODING
					           , ISSUER_SCRIPTS_055_7200_DATATYPE
					           , ISSUER_SCRIPTS_055_7200_SOURCE
					           , ISSUER_SCRIPTS_055_7200_DIRECTION
					           , ISSUER_SCRIPTS_055_7200_EXISTENCE
					           , ISSUER_SCRIPTS_055_7200_CHANGE
					           , ISSUER_SCRIPTS_055_7200_VALUE
					   	      );
	

	DataElementField applInterProfileFlagsField 
	
		= new DataElementField ( APPL_INTER_PROFILE_FLAGS_055_8200_ID
					           , APPL_INTER_PROFILE_FLAGS_055_8200_FIELD
					           , APPL_INTER_PROFILE_FLAGS_055_8200_SUBFIELD
					           , APPL_INTER_PROFILE_FLAGS_055_8200_FORMAT
					           , APPL_INTER_PROFILE_FLAGS_055_8200_LENGTH
					           , APPL_INTER_PROFILE_FLAGS_055_8200_ENCODING
					           , APPL_INTER_PROFILE_FLAGS_055_8200_DATATYPE
					           , APPL_INTER_PROFILE_FLAGS_055_8200_SOURCE
					           , APPL_INTER_PROFILE_FLAGS_055_8200_DIRECTION
					           , APPL_INTER_PROFILE_FLAGS_055_8200_EXISTENCE
					           , APPL_INTER_PROFILE_FLAGS_055_8200_CHANGE
					           , APPL_INTER_PROFILE_FLAGS_055_8200_VALUE
					   	      );
	

	DataElementField dedicatedFnameField 
	
		= new DataElementField ( DEDICATED_FNAME_055_8400_ID
					           , DEDICATED_FNAME_055_8400_FIELD
					           , DEDICATED_FNAME_055_8400_SUBFIELD
					           , DEDICATED_FNAME_055_8400_FORMAT
					           , DEDICATED_FNAME_055_8400_LENGTH
					           , DEDICATED_FNAME_055_8400_ENCODING
					           , DEDICATED_FNAME_055_8400_DATATYPE
					           , DEDICATED_FNAME_055_8400_SOURCE
					           , DEDICATED_FNAME_055_8400_DIRECTION
					           , DEDICATED_FNAME_055_8400_EXISTENCE
					           , DEDICATED_FNAME_055_8400_CHANGE
					           , DEDICATED_FNAME_055_8400_VALUE
					   	      );
	

	DataElementField issuerArpcField 
	
		= new DataElementField ( ISSUER_ARPC_055_9100_ID
					           , ISSUER_ARPC_055_9100_FIELD
					           , ISSUER_ARPC_055_9100_SUBFIELD
					           , ISSUER_ARPC_055_9100_FORMAT
					           , ISSUER_ARPC_055_9100_LENGTH
					           , ISSUER_ARPC_055_9100_ENCODING
					           , ISSUER_ARPC_055_9100_DATATYPE
					           , ISSUER_ARPC_055_9100_SOURCE
					           , ISSUER_ARPC_055_9100_DIRECTION
					           , ISSUER_ARPC_055_9100_EXISTENCE
					           , ISSUER_ARPC_055_9100_CHANGE
					           , ISSUER_ARPC_055_9100_VALUE
					   	      );
	

	DataElementField tvrFlagsField 
	
		= new DataElementField ( TVR_FLAGS_055_9500_ID
					           , TVR_FLAGS_055_9500_FIELD
					           , TVR_FLAGS_055_9500_SUBFIELD
					           , TVR_FLAGS_055_9500_FORMAT
					           , TVR_FLAGS_055_9500_LENGTH
					           , TVR_FLAGS_055_9500_ENCODING
					           , TVR_FLAGS_055_9500_DATATYPE
					           , TVR_FLAGS_055_9500_SOURCE
					           , TVR_FLAGS_055_9500_DIRECTION
					           , TVR_FLAGS_055_9500_EXISTENCE
					           , TVR_FLAGS_055_9500_CHANGE
					           , TVR_FLAGS_055_9500_VALUE
					   	      );
	

	DataElementField tranDateField 
	
		= new DataElementField ( TRAN_DATE_055_9A_ID
					           , TRAN_DATE_055_9A_FIELD
					           , TRAN_DATE_055_9A_SUBFIELD
					           , TRAN_DATE_055_9A_FORMAT
					           , TRAN_DATE_055_9A_LENGTH
					           , TRAN_DATE_055_9A_ENCODING
					           , TRAN_DATE_055_9A_DATATYPE
					           , TRAN_DATE_055_9A_SOURCE
					           , TRAN_DATE_055_9A_DIRECTION
					           , TRAN_DATE_055_9A_EXISTENCE
					           , TRAN_DATE_055_9A_CHANGE
					           , TRAN_DATE_055_9A_VALUE
					   	      );
	

	DataElementField tranTypeField 
	
		= new DataElementField ( TRAN_TYPE_055_9C_ID
					           , TRAN_TYPE_055_9C_FIELD
					           , TRAN_TYPE_055_9C_SUBFIELD
					           , TRAN_TYPE_055_9C_FORMAT
					           , TRAN_TYPE_055_9C_LENGTH
					           , TRAN_TYPE_055_9C_ENCODING
					           , TRAN_TYPE_055_9C_DATATYPE
					           , TRAN_TYPE_055_9C_SOURCE
					           , TRAN_TYPE_055_9C_DIRECTION
					           , TRAN_TYPE_055_9C_EXISTENCE
					           , TRAN_TYPE_055_9C_CHANGE
					           , TRAN_TYPE_055_9C_VALUE
					   	      );
	

	DataElementField newPinBlockField 
	
		= new DataElementField ( NEW_PIN_BLOCK_055_HC_ID
					           , NEW_PIN_BLOCK_055_HC_FIELD
					           , NEW_PIN_BLOCK_055_HC_SUBFIELD
					           , NEW_PIN_BLOCK_055_HC_FORMAT
					           , NEW_PIN_BLOCK_055_HC_LENGTH
					           , NEW_PIN_BLOCK_055_HC_ENCODING
					           , NEW_PIN_BLOCK_055_HC_DATATYPE
					           , NEW_PIN_BLOCK_055_HC_SOURCE
					           , NEW_PIN_BLOCK_055_HC_DIRECTION
					           , NEW_PIN_BLOCK_055_HC_EXISTENCE
					           , NEW_PIN_BLOCK_055_HC_CHANGE
					           , NEW_PIN_BLOCK_055_HC_VALUE
					   	      );
	

	DataElementField tranCurrCodeField 
	
		= new DataElementField ( TRAN_CURR_CODE_055_5F2A_ID
					           , TRAN_CURR_CODE_055_5F2A_FIELD
					           , TRAN_CURR_CODE_055_5F2A_SUBFIELD
					           , TRAN_CURR_CODE_055_5F2A_FORMAT
					           , TRAN_CURR_CODE_055_5F2A_LENGTH
					           , TRAN_CURR_CODE_055_5F2A_ENCODING
					           , TRAN_CURR_CODE_055_5F2A_DATATYPE
					           , TRAN_CURR_CODE_055_5F2A_SOURCE
					           , TRAN_CURR_CODE_055_5F2A_DIRECTION
					           , TRAN_CURR_CODE_055_5F2A_EXISTENCE
					           , TRAN_CURR_CODE_055_5F2A_CHANGE
					           , TRAN_CURR_CODE_055_5F2A_VALUE
					   	      );
	

	DataElementField tranAmountField 
	
		= new DataElementField ( TRAN_AMOUNT_055_9F02_ID
					           , TRAN_AMOUNT_055_9F02_FIELD
					           , TRAN_AMOUNT_055_9F02_SUBFIELD
					           , TRAN_AMOUNT_055_9F02_FORMAT
					           , TRAN_AMOUNT_055_9F02_LENGTH
					           , TRAN_AMOUNT_055_9F02_ENCODING
					           , TRAN_AMOUNT_055_9F02_DATATYPE
					           , TRAN_AMOUNT_055_9F02_SOURCE
					           , TRAN_AMOUNT_055_9F02_DIRECTION
					           , TRAN_AMOUNT_055_9F02_EXISTENCE
					           , TRAN_AMOUNT_055_9F02_CHANGE
					           , TRAN_AMOUNT_055_9F02_VALUE
					   	      );
	

	DataElementField otherCashBackAmtField 
	
		= new DataElementField ( OTHER_CASH_BACK_AMT_055_9F03_ID
					           , OTHER_CASH_BACK_AMT_055_9F03_FIELD
					           , OTHER_CASH_BACK_AMT_055_9F03_SUBFIELD
					           , OTHER_CASH_BACK_AMT_055_9F03_FORMAT
					           , OTHER_CASH_BACK_AMT_055_9F03_LENGTH
					           , OTHER_CASH_BACK_AMT_055_9F03_ENCODING
					           , OTHER_CASH_BACK_AMT_055_9F03_DATATYPE
					           , OTHER_CASH_BACK_AMT_055_9F03_SOURCE
					           , OTHER_CASH_BACK_AMT_055_9F03_DIRECTION
					           , OTHER_CASH_BACK_AMT_055_9F03_EXISTENCE
					           , OTHER_CASH_BACK_AMT_055_9F03_CHANGE
					           , OTHER_CASH_BACK_AMT_055_9F03_VALUE
					   	      );
	

	DataElementField applVersionNbrField 
	
		= new DataElementField ( APPL_VERSION_NBR_055_9F09_ID
					           , APPL_VERSION_NBR_055_9F09_FIELD
					           , APPL_VERSION_NBR_055_9F09_SUBFIELD
					           , APPL_VERSION_NBR_055_9F09_FORMAT
					           , APPL_VERSION_NBR_055_9F09_LENGTH
					           , APPL_VERSION_NBR_055_9F09_ENCODING
					           , APPL_VERSION_NBR_055_9F09_DATATYPE
					           , APPL_VERSION_NBR_055_9F09_SOURCE
					           , APPL_VERSION_NBR_055_9F09_DIRECTION
					           , APPL_VERSION_NBR_055_9F09_EXISTENCE
					           , APPL_VERSION_NBR_055_9F09_CHANGE
					           , APPL_VERSION_NBR_055_9F09_VALUE
					   	      );
	

	DataElementField issApplDataFlagsField 
	
		= new DataElementField ( ISS_APPL_DATA_FLAGS_055_BF10_ID
					           , ISS_APPL_DATA_FLAGS_055_BF10_FIELD
					           , ISS_APPL_DATA_FLAGS_055_BF10_SUBFIELD
					           , ISS_APPL_DATA_FLAGS_055_BF10_FORMAT
					           , ISS_APPL_DATA_FLAGS_055_BF10_LENGTH
					           , ISS_APPL_DATA_FLAGS_055_BF10_ENCODING
					           , ISS_APPL_DATA_FLAGS_055_BF10_DATATYPE
					           , ISS_APPL_DATA_FLAGS_055_BF10_SOURCE
					           , ISS_APPL_DATA_FLAGS_055_BF10_DIRECTION
					           , ISS_APPL_DATA_FLAGS_055_BF10_EXISTENCE
					           , ISS_APPL_DATA_FLAGS_055_BF10_CHANGE
					           , ISS_APPL_DATA_FLAGS_055_BF10_VALUE
					   	      );
	
	

	DataElementField termCountryCodeField 
	
		= new DataElementField ( TERM_COUNTRY_CODE_055_9F1A_ID
					           , TERM_COUNTRY_CODE_055_9F1A_FIELD
					           , TERM_COUNTRY_CODE_055_9F1A_SUBFIELD
					           , TERM_COUNTRY_CODE_055_9F1A_FORMAT
					           , TERM_COUNTRY_CODE_055_9F1A_LENGTH
					           , TERM_COUNTRY_CODE_055_9F1A_ENCODING
					           , TERM_COUNTRY_CODE_055_9F1A_DATATYPE
					           , TERM_COUNTRY_CODE_055_9F1A_SOURCE
					           , TERM_COUNTRY_CODE_055_9F1A_DIRECTION
					           , TERM_COUNTRY_CODE_055_9F1A_EXISTENCE
					           , TERM_COUNTRY_CODE_055_9F1A_CHANGE
					           , TERM_COUNTRY_CODE_055_9F1A_VALUE
					   	      );
	

	DataElementField termSerialNbrField 
	
		= new DataElementField ( TERM_SERIAL_NBR_055_9F1E_ID
					           , TERM_SERIAL_NBR_055_9F1E_FIELD
					           , TERM_SERIAL_NBR_055_9F1E_SUBFIELD
					           , TERM_SERIAL_NBR_055_9F1E_FORMAT
					           , TERM_SERIAL_NBR_055_9F1E_LENGTH
					           , TERM_SERIAL_NBR_055_9F1E_ENCODING
					           , TERM_SERIAL_NBR_055_9F1E_DATATYPE
					           , TERM_SERIAL_NBR_055_9F1E_SOURCE
					           , TERM_SERIAL_NBR_055_9F1E_DIRECTION
					           , TERM_SERIAL_NBR_055_9F1E_EXISTENCE
					           , TERM_SERIAL_NBR_055_9F1E_CHANGE
					           , TERM_SERIAL_NBR_055_9F1E_VALUE
					   	      );
	

	DataElementField cyrptoArqcDataField 
	
		= new DataElementField ( CRYPTO_ARQC_DATA_055_9F26_ID
					           , CRYPTO_ARQC_DATA_055_9F26_FIELD
					           , CRYPTO_ARQC_DATA_055_9F26_SUBFIELD
					           , CRYPTO_ARQC_DATA_055_9F26_FORMAT
					           , CRYPTO_ARQC_DATA_055_9F26_LENGTH
					           , CRYPTO_ARQC_DATA_055_9F26_ENCODING
					           , CRYPTO_ARQC_DATA_055_9F26_DATATYPE
					           , CRYPTO_ARQC_DATA_055_9F26_SOURCE
					           , CRYPTO_ARQC_DATA_055_9F26_DIRECTION
					           , CRYPTO_ARQC_DATA_055_9F26_EXISTENCE
					           , CRYPTO_ARQC_DATA_055_9F26_CHANGE
					           , CRYPTO_ARQC_DATA_055_9F26_VALUE
					   	      );
	

	DataElementField terminalProfileFlagsField 
	
		= new DataElementField ( TERMINAL_PROFILE_FLAGS_055_9F33_ID
					           , TERMINAL_PROFILE_FLAGS_055_9F33_FIELD
					           , TERMINAL_PROFILE_FLAGS_055_9F33_SUBFIELD
					           , TERMINAL_PROFILE_FLAGS_055_9F33_FORMAT
					           , TERMINAL_PROFILE_FLAGS_055_9F33_LENGTH
					           , TERMINAL_PROFILE_FLAGS_055_9F33_ENCODING
					           , TERMINAL_PROFILE_FLAGS_055_9F33_DATATYPE
					           , TERMINAL_PROFILE_FLAGS_055_9F33_SOURCE
					           , TERMINAL_PROFILE_FLAGS_055_9F33_DIRECTION
					           , TERMINAL_PROFILE_FLAGS_055_9F33_EXISTENCE
					           , TERMINAL_PROFILE_FLAGS_055_9F33_CHANGE
					           , TERMINAL_PROFILE_FLAGS_055_9F33_VALUE
					   	      );
	

	DataElementField terminalTypeField 
	
		= new DataElementField ( TERMINAL_TYPE_055_9F35_ID
					           , TERMINAL_TYPE_055_9F35_FIELD
					           , TERMINAL_TYPE_055_9F35_SUBFIELD
					           , TERMINAL_TYPE_055_9F35_FORMAT
					           , TERMINAL_TYPE_055_9F35_LENGTH
					           , TERMINAL_TYPE_055_9F35_ENCODING
					           , TERMINAL_TYPE_055_9F35_DATATYPE
					           , TERMINAL_TYPE_055_9F35_SOURCE
					           , TERMINAL_TYPE_055_9F35_DIRECTION
					           , TERMINAL_TYPE_055_9F35_EXISTENCE
					           , TERMINAL_TYPE_055_9F35_CHANGE
					           , TERMINAL_TYPE_055_9F35_VALUE
					   	      );
	

	DataElementField atcDataField 
	
		= new DataElementField ( ATC_DATA_055_9F36_ID
					           , ATC_DATA_055_9F36_FIELD
					           , ATC_DATA_055_9F36_SUBFIELD
					           , ATC_DATA_055_9F36_FORMAT
					           , ATC_DATA_055_9F36_LENGTH
					           , ATC_DATA_055_9F36_ENCODING
					           , ATC_DATA_055_9F36_DATATYPE
					           , ATC_DATA_055_9F36_SOURCE
					           , ATC_DATA_055_9F36_DIRECTION
					           , ATC_DATA_055_9F36_EXISTENCE
					           , ATC_DATA_055_9F36_CHANGE
					           , ATC_DATA_055_9F36_VALUE
					   	      );
	

	DataElementField unpredicatbleNbrField 
	
		= new DataElementField ( UNPREDICATBLE_NBR_055_9F37_ID
					           , UNPREDICATBLE_NBR_055_9F37_FIELD
					           , UNPREDICATBLE_NBR_055_9F37_SUBFIELD
					           , UNPREDICATBLE_NBR_055_9F37_FORMAT
					           , UNPREDICATBLE_NBR_055_9F37_LENGTH
					           , UNPREDICATBLE_NBR_055_9F37_ENCODING
					           , UNPREDICATBLE_NBR_055_9F37_DATATYPE
					           , UNPREDICATBLE_NBR_055_9F37_SOURCE
					           , UNPREDICATBLE_NBR_055_9F37_DIRECTION
					           , UNPREDICATBLE_NBR_055_9F37_EXISTENCE
					           , UNPREDICATBLE_NBR_055_9F37_CHANGE
					           , UNPREDICATBLE_NBR_055_9F37_VALUE
					   	      );
	

	DataElementField tranSeqCtrField 
	
		= new DataElementField ( TRAN_SEQ_CTR_055_9F41_ID
					           , TRAN_SEQ_CTR_055_9F41_FIELD
					           , TRAN_SEQ_CTR_055_9F41_SUBFIELD
					           , TRAN_SEQ_CTR_055_9F41_FORMAT
					           , TRAN_SEQ_CTR_055_9F41_LENGTH
					           , TRAN_SEQ_CTR_055_9F41_ENCODING
					           , TRAN_SEQ_CTR_055_9F41_DATATYPE
					           , TRAN_SEQ_CTR_055_9F41_SOURCE
					           , TRAN_SEQ_CTR_055_9F41_DIRECTION
					           , TRAN_SEQ_CTR_055_9F41_EXISTENCE
					           , TRAN_SEQ_CTR_055_9F41_CHANGE
					           , TRAN_SEQ_CTR_055_9F41_VALUE
					   	      );
	

	DataElementField tranCategoryCodeField 
	
		= new DataElementField ( TRAN_CATEGORY_CODE_055_9F53_ID
					           , TRAN_CATEGORY_CODE_055_9F53_FIELD
					           , TRAN_CATEGORY_CODE_055_9F53_SUBFIELD
					           , TRAN_CATEGORY_CODE_055_9F53_FORMAT
					           , TRAN_CATEGORY_CODE_055_9F53_LENGTH
					           , TRAN_CATEGORY_CODE_055_9F53_ENCODING
					           , TRAN_CATEGORY_CODE_055_9F53_DATATYPE
					           , TRAN_CATEGORY_CODE_055_9F53_SOURCE
					           , TRAN_CATEGORY_CODE_055_9F53_DIRECTION
					           , TRAN_CATEGORY_CODE_055_9F53_EXISTENCE
					           , TRAN_CATEGORY_CODE_055_9F53_CHANGE
					           , TRAN_CATEGORY_CODE_055_9F53_VALUE
					   	      );
	

	DataElementField issScriptResultsField 
	
		= new DataElementField ( ISS_SCRIPT_RESULTS_055_9F5B_ID
					           , ISS_SCRIPT_RESULTS_055_9F5B_FIELD
					           , ISS_SCRIPT_RESULTS_055_9F5B_SUBFIELD
					           , ISS_SCRIPT_RESULTS_055_9F5B_FORMAT
					           , ISS_SCRIPT_RESULTS_055_9F5B_LENGTH
					           , ISS_SCRIPT_RESULTS_055_9F5B_ENCODING
					           , ISS_SCRIPT_RESULTS_055_9F5B_DATATYPE
					           , ISS_SCRIPT_RESULTS_055_9F5B_SOURCE
					           , ISS_SCRIPT_RESULTS_055_9F5B_DIRECTION
					           , ISS_SCRIPT_RESULTS_055_9F5B_EXISTENCE
					           , ISS_SCRIPT_RESULTS_055_9F5B_CHANGE
					           , ISS_SCRIPT_RESULTS_055_9F5B_VALUE
					   	      );
	

	DataElementField formFactorField 
	
		= new DataElementField ( FORM_FACTOR_055_9F6E_ID
					           , FORM_FACTOR_055_9F6E_FIELD
					           , FORM_FACTOR_055_9F6E_SUBFIELD
					           , FORM_FACTOR_055_9F6E_FORMAT
					           , FORM_FACTOR_055_9F6E_LENGTH
					           , FORM_FACTOR_055_9F6E_ENCODING
					           , FORM_FACTOR_055_9F6E_DATATYPE
					           , FORM_FACTOR_055_9F6E_SOURCE
					           , FORM_FACTOR_055_9F6E_DIRECTION
					           , FORM_FACTOR_055_9F6E_EXISTENCE
					           , FORM_FACTOR_055_9F6E_CHANGE
					           , FORM_FACTOR_055_9F6E_VALUE
					   	      );
	
	
	public DE055Impl createDE055() {
		
		int id = 55000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		
		storage.add(tranCurrCodeField);				// 5F2A
		storage.add(issuerScripts1Field);			// 7100
		storage.add(issuerScripts2Field);			// 7200
		storage.add(applInterProfileFlagsField);	// 8200
		storage.add(dedicatedFnameField);			// 8400
		storage.add(issuerArpcField);				// 9100
		storage.add(tvrFlagsField);					// 9500
		storage.add(tranDateField);					// 9A
		storage.add(tranTypeField);					// 9C
		storage.add(tranAmountField);				// 9F02
		
		storage.add(otherCashBackAmtField);			// 9F03
		storage.add(applVersionNbrField);			// 9F09
		storage.add(termCountryCodeField);			// 9F1A
		storage.add(termSerialNbrField);			// 9F1E
		storage.add(cyrptoArqcDataField);			// 9F26
		storage.add(terminalProfileFlagsField);		// 9F33
		storage.add(terminalTypeField);				// 9F35
		storage.add(atcDataField);					// 9F36
		storage.add(unpredicatbleNbrField);			// 9F37
		storage.add(tranSeqCtrField);				// 9F41
		
		storage.add(tranCategoryCodeField);			// 9F53
		storage.add(issScriptResultsField);			// 9F5B
		storage.add(formFactorField);				// 9F6E
		storage.add(issApplDataFlagsField);			// BF10
		storage.add(newPinBlockField);				// HC
		
		DE055Impl de055 = new DE055Impl(id, storage);
		
		return de055;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE055 createDE055 = new CreateDE055(); 
		
		DE055Impl de055	= createDE055.createDE055(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de055, fieldList,codeList );
	
	}
}
