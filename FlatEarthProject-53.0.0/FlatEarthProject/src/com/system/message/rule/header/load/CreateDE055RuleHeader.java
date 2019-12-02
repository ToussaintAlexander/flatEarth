package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE055RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE055RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE055RuleHeader  {

	public List<DataElementRuleHeaderField> storage = new ArrayList<DataElementRuleHeaderField>();
	
	public List<DataElementRuleHeaderField> getStorage() {
		return storage;
	}
	public void setStorage(List<DataElementRuleHeaderField> storage) {
		this.storage = storage;
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01() {
	
		DataElementRuleHeaderField dataElementField01 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_CURR_CODE_055_5F2A_RULE_HEADER_ID
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FIELD
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_SUBFIELD
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FIRE		
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_FORMAT
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_ENCODING
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_DATATYPE
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_SOURCE
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_DIRECTION
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_EXISTENCE
											 , TRAN_CURR_CODE_055_5F2A_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   ISSUER_SCRIPTS_055_7100_RULE_HEADER_ID
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_FIELD
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_SUBFIELD
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_FIRE		
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_FORMAT
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_MINIMUM_LENGTH
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_MAXIMUM_LENGTH
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_ENCODING
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_DATATYPE
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_SOURCE
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_DIRECTION
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_EXISTENCE
											 , ISSUER_SCRIPTS_055_7100_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   ISSUER_SCRIPTS_055_7200_RULE_HEADER_ID
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_FIELD
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_SUBFIELD
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_FIRE		
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_FORMAT
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_MINIMUM_LENGTH
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_MAXIMUM_LENGTH
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_ENCODING
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_DATATYPE
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_SOURCE
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_DIRECTION
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_EXISTENCE
											 , ISSUER_SCRIPTS_055_7200_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_ID
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FIELD
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_SUBFIELD
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FIRE		
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_FORMAT
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_MINIMUM_LENGTH
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_MAXIMUM_LENGTH
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_ENCODING
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_DATATYPE
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_SOURCE
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_DIRECTION
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_EXISTENCE
											 , APPL_INTER_PROFILE_FLAGS_055_8200_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   DEDICATED_FNAME_055_8400_RULE_HEADER_ID
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_FIELD
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_SUBFIELD
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_FIRE		
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_FORMAT
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_MINIMUM_LENGTH
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_MAXIMUM_LENGTH
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_ENCODING
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_DATATYPE
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_SOURCE
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_DIRECTION
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_EXISTENCE
											 , DEDICATED_FNAME_055_8400_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06 	 
		
			= new DataElementRuleHeaderField ( 
											   ISSUER_ARPC_055_9100_RULE_HEADER_ID
											 , ISSUER_ARPC_055_9100_RULE_HEADER_FIELD
											 , ISSUER_ARPC_055_9100_RULE_HEADER_SUBFIELD
											 , ISSUER_ARPC_055_9100_RULE_HEADER_FIRE		
											 , ISSUER_ARPC_055_9100_RULE_HEADER_FORMAT
											 , ISSUER_ARPC_055_9100_RULE_HEADER_MINIMUM_LENGTH
											 , ISSUER_ARPC_055_9100_RULE_HEADER_MAXIMUM_LENGTH
											 , ISSUER_ARPC_055_9100_RULE_HEADER_ENCODING
											 , ISSUER_ARPC_055_9100_RULE_HEADER_DATATYPE
											 , ISSUER_ARPC_055_9100_RULE_HEADER_SOURCE
											 , ISSUER_ARPC_055_9100_RULE_HEADER_DIRECTION
											 , ISSUER_ARPC_055_9100_RULE_HEADER_EXISTENCE
											 , ISSUER_ARPC_055_9100_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07 	 
		
			= new DataElementRuleHeaderField ( 
											   TVR_FLAGS_055_9500_RULE_HEADER_ID
											 , TVR_FLAGS_055_9500_RULE_HEADER_FIELD
											 , TVR_FLAGS_055_9500_RULE_HEADER_SUBFIELD
											 , TVR_FLAGS_055_9500_RULE_HEADER_FIRE		
											 , TVR_FLAGS_055_9500_RULE_HEADER_FORMAT
											 , TVR_FLAGS_055_9500_RULE_HEADER_MINIMUM_LENGTH
											 , TVR_FLAGS_055_9500_RULE_HEADER_MAXIMUM_LENGTH
											 , TVR_FLAGS_055_9500_RULE_HEADER_ENCODING
											 , TVR_FLAGS_055_9500_RULE_HEADER_DATATYPE
											 , TVR_FLAGS_055_9500_RULE_HEADER_SOURCE
											 , TVR_FLAGS_055_9500_RULE_HEADER_DIRECTION
											 , TVR_FLAGS_055_9500_RULE_HEADER_EXISTENCE
											 , TVR_FLAGS_055_9500_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField08() {
	
		DataElementRuleHeaderField dataElementField08 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_DATE_055_9A_RULE_HEADER_ID
											 , TRAN_DATE_055_9A_RULE_HEADER_FIELD
											 , TRAN_DATE_055_9A_RULE_HEADER_SUBFIELD
											 , TRAN_DATE_055_9A_RULE_HEADER_FIRE		
											 , TRAN_DATE_055_9A_RULE_HEADER_FORMAT
											 , TRAN_DATE_055_9A_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_DATE_055_9A_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_DATE_055_9A_RULE_HEADER_ENCODING
											 , TRAN_DATE_055_9A_RULE_HEADER_DATATYPE
											 , TRAN_DATE_055_9A_RULE_HEADER_SOURCE
											 , TRAN_DATE_055_9A_RULE_HEADER_DIRECTION
											 , TRAN_DATE_055_9A_RULE_HEADER_EXISTENCE
											 , TRAN_DATE_055_9A_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField08;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField09() {
	
		DataElementRuleHeaderField dataElementField09 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_TYPE_055_9C_RULE_HEADER_ID
											 , TRAN_TYPE_055_9C_RULE_HEADER_FIELD
											 , TRAN_TYPE_055_9C_RULE_HEADER_SUBFIELD
											 , TRAN_TYPE_055_9C_RULE_HEADER_FIRE		
											 , TRAN_TYPE_055_9C_RULE_HEADER_FORMAT
											 , TRAN_TYPE_055_9C_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_TYPE_055_9C_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_TYPE_055_9C_RULE_HEADER_ENCODING
											 , TRAN_TYPE_055_9C_RULE_HEADER_DATATYPE
											 , TRAN_TYPE_055_9C_RULE_HEADER_SOURCE
											 , TRAN_TYPE_055_9C_RULE_HEADER_DIRECTION
											 , TRAN_TYPE_055_9C_RULE_HEADER_EXISTENCE
											 , TRAN_TYPE_055_9C_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField09;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField10() {
	
		DataElementRuleHeaderField dataElementField10 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_AMOUNT_055_9F02_RULE_HEADER_ID
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_FIELD
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_SUBFIELD
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_FIRE		
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_FORMAT
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_ENCODING
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_DATATYPE
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_SOURCE
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_DIRECTION
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_EXISTENCE
											 , TRAN_AMOUNT_055_9F02_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField10;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField11() {
	
		DataElementRuleHeaderField dataElementField11 	 
		
			= new DataElementRuleHeaderField ( 
											   OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_ID
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FIELD
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_SUBFIELD
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FIRE		
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_FORMAT
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_MINIMUM_LENGTH
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_MAXIMUM_LENGTH
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_ENCODING
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_DATATYPE
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_SOURCE
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_DIRECTION
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_EXISTENCE
											 , OTHER_CASH_BACK_AMT_055_9F03_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField11;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField12() {
	
		DataElementRuleHeaderField dataElementField12 	 
		
			= new DataElementRuleHeaderField ( 
											   APPL_VERSION_NBR_055_9F09_RULE_HEADER_ID
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_FIELD
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_SUBFIELD
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_FIRE		
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_FORMAT
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_MINIMUM_LENGTH
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_MAXIMUM_LENGTH
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_ENCODING
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_DATATYPE
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_SOURCE
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_DIRECTION
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_EXISTENCE
											 , APPL_VERSION_NBR_055_9F09_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField12;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField13() {
	
		DataElementRuleHeaderField dataElementField13 	 
		
			= new DataElementRuleHeaderField ( 
											   TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_ID
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FIELD
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_SUBFIELD
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FIRE		
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_FORMAT
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_MINIMUM_LENGTH
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_MAXIMUM_LENGTH
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_ENCODING
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_DATATYPE
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_SOURCE
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_DIRECTION
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_EXISTENCE
											 , TERM_COUNTRY_CODE_055_9F1A_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField13;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField14() {
	
		DataElementRuleHeaderField dataElementField14 	 
		
			= new DataElementRuleHeaderField ( 
											   TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_ID
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FIELD
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_SUBFIELD
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FIRE		
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_FORMAT
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_MINIMUM_LENGTH
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_MAXIMUM_LENGTH
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_ENCODING
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_DATATYPE
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_SOURCE
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_DIRECTION
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_EXISTENCE
											 , TERM_SERIAL_NBR_055_9F1E_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField14;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField15() {
	
		DataElementRuleHeaderField dataElementField15 	 
		
			= new DataElementRuleHeaderField ( 
											   CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_ID
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FIELD
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_SUBFIELD
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FIRE		
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_FORMAT
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_MINIMUM_LENGTH
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_MAXIMUM_LENGTH
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_ENCODING
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_DATATYPE
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_SOURCE
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_DIRECTION
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_EXISTENCE
											 , CRYPTO_ARQC_DATA_055_9F26_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField15;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField16() {
	
		DataElementRuleHeaderField dataElementField16 	 
		
			= new DataElementRuleHeaderField ( 
											   TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_ID
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FIELD
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_SUBFIELD
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FIRE		
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_FORMAT
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_MINIMUM_LENGTH
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_MAXIMUM_LENGTH
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_ENCODING
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_DATATYPE
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_SOURCE
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_DIRECTION
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_EXISTENCE
											 , TERMINAL_PROFILE_FLAGS_055_9F33_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField16;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField17() {
	
		DataElementRuleHeaderField dataElementField17 	 
		
			= new DataElementRuleHeaderField ( 
											   TERMINAL_TYPE_055_9F35_RULE_HEADER_ID
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_FIELD
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_SUBFIELD
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_FIRE		
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_FORMAT
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_MINIMUM_LENGTH
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_MAXIMUM_LENGTH
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_ENCODING
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_DATATYPE
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_SOURCE
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_DIRECTION
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_EXISTENCE
											 , TERMINAL_TYPE_055_9F35_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField17;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField18() {
	
		DataElementRuleHeaderField dataElementField18 	 
		
			= new DataElementRuleHeaderField ( 
											   ATC_DATA_055_9F36_RULE_HEADER_ID
											 , ATC_DATA_055_9F36_RULE_HEADER_FIELD
											 , ATC_DATA_055_9F36_RULE_HEADER_SUBFIELD
											 , ATC_DATA_055_9F36_RULE_HEADER_FIRE		
											 , ATC_DATA_055_9F36_RULE_HEADER_FORMAT
											 , ATC_DATA_055_9F36_RULE_HEADER_MINIMUM_LENGTH
											 , ATC_DATA_055_9F36_RULE_HEADER_MAXIMUM_LENGTH
											 , ATC_DATA_055_9F36_RULE_HEADER_ENCODING
											 , ATC_DATA_055_9F36_RULE_HEADER_DATATYPE
											 , ATC_DATA_055_9F36_RULE_HEADER_SOURCE
											 , ATC_DATA_055_9F36_RULE_HEADER_DIRECTION
											 , ATC_DATA_055_9F36_RULE_HEADER_EXISTENCE
											 , ATC_DATA_055_9F36_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField18;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField19() {
	
		DataElementRuleHeaderField dataElementField19 	 
		
			= new DataElementRuleHeaderField ( 
											   UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_ID
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FIELD
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_SUBFIELD
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FIRE		
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_FORMAT
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_MINIMUM_LENGTH
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_MAXIMUM_LENGTH
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_ENCODING
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_DATATYPE
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_SOURCE
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_DIRECTION
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_EXISTENCE
											 , UNPREDICATBLE_NBR_055_9F37_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField19;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField20() {
	
		DataElementRuleHeaderField dataElementField20 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_SEQ_CTR_055_9F41_RULE_HEADER_ID
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FIELD
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_SUBFIELD
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FIRE		
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_FORMAT
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_ENCODING
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_DATATYPE
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_SOURCE
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_DIRECTION
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_EXISTENCE
											 , TRAN_SEQ_CTR_055_9F41_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField20;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField21() {
	
		DataElementRuleHeaderField dataElementField21 	 
		
			= new DataElementRuleHeaderField ( 
											   TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_ID
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FIELD
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_SUBFIELD
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FIRE		
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_FORMAT
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_MINIMUM_LENGTH
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_MAXIMUM_LENGTH
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_ENCODING
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_DATATYPE
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_SOURCE
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_DIRECTION
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_EXISTENCE
											 , TRAN_CATEGORY_CODE_055_9F53_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField21;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField22() {
	
		DataElementRuleHeaderField dataElementField22 	 
		
			= new DataElementRuleHeaderField ( 
											   ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_ID
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FIELD
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_SUBFIELD
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FIRE		
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_FORMAT
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_MINIMUM_LENGTH
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_MAXIMUM_LENGTH
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_ENCODING
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_DATATYPE
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_SOURCE
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_DIRECTION
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_EXISTENCE
											 , ISS_SCRIPT_RESULTS_055_9F5B_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField22;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField23() {
	
		DataElementRuleHeaderField dataElementField23 	 
		
			= new DataElementRuleHeaderField ( 
											   FORM_FACTOR_055_9F6E_RULE_HEADER_ID
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_FIELD
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_SUBFIELD
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_FIRE		
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_FORMAT
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_MINIMUM_LENGTH
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_MAXIMUM_LENGTH
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_ENCODING
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_DATATYPE
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_SOURCE
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_DIRECTION
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_EXISTENCE
											 , FORM_FACTOR_055_9F6E_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField23;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField24() {
	
		DataElementRuleHeaderField dataElementField24 	 
		
			= new DataElementRuleHeaderField ( 
											   ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_ID
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FIELD
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_SUBFIELD
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FIRE		
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_FORMAT
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_MINIMUM_LENGTH
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_MAXIMUM_LENGTH
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_ENCODING
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_DATATYPE
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_SOURCE
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_DIRECTION
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_EXISTENCE
											 , ISS_APPL_DATA_FLAGS_055_BF10_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField24;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField25() {
	
		DataElementRuleHeaderField dataElementField25 	 
		
			= new DataElementRuleHeaderField ( 
											   NEW_PIN_BLOCK_055_HC_RULE_HEADER_ID
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_FIELD
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_SUBFIELD
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_FIRE		
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_FORMAT
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_MINIMUM_LENGTH
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_MAXIMUM_LENGTH
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_ENCODING
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_DATATYPE
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_SOURCE
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_DIRECTION
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_EXISTENCE
											 , NEW_PIN_BLOCK_055_HC_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField25;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
		public DataElementRuleHeader createDE055RuleHeader () {
			
			int id = 55000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			DataElementRuleHeaderField dataElementField06 = getDataElementRuleField06();
			DataElementRuleHeaderField dataElementField07 = getDataElementRuleField07();
			DataElementRuleHeaderField dataElementField08 = getDataElementRuleField08();
			DataElementRuleHeaderField dataElementField09 = getDataElementRuleField09();
			DataElementRuleHeaderField dataElementField10 = getDataElementRuleField10();
			
			DataElementRuleHeaderField dataElementField11 = getDataElementRuleField11();
			DataElementRuleHeaderField dataElementField12 = getDataElementRuleField12();
			DataElementRuleHeaderField dataElementField13 = getDataElementRuleField13();
			DataElementRuleHeaderField dataElementField14 = getDataElementRuleField14();
			DataElementRuleHeaderField dataElementField15 = getDataElementRuleField15();
			DataElementRuleHeaderField dataElementField16 = getDataElementRuleField16();
			DataElementRuleHeaderField dataElementField17 = getDataElementRuleField17();
			DataElementRuleHeaderField dataElementField18 = getDataElementRuleField18();
			DataElementRuleHeaderField dataElementField19 = getDataElementRuleField19();
			DataElementRuleHeaderField dataElementField20 = getDataElementRuleField20();
			
			DataElementRuleHeaderField dataElementField21 = getDataElementRuleField21();
			DataElementRuleHeaderField dataElementField22 = getDataElementRuleField22();
			DataElementRuleHeaderField dataElementField23 = getDataElementRuleField23();
			DataElementRuleHeaderField dataElementField24 = getDataElementRuleField24();
			DataElementRuleHeaderField dataElementField25 = getDataElementRuleField25();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			storage.add(dataElementField06);
			storage.add(dataElementField07);
			storage.add(dataElementField08);
			storage.add(dataElementField09);
			storage.add(dataElementField10);
			
			storage.add(dataElementField11);
			storage.add(dataElementField12);
			storage.add(dataElementField13);
			storage.add(dataElementField14);
			storage.add(dataElementField15);
			storage.add(dataElementField16);
			storage.add(dataElementField17);
			storage.add(dataElementField18);
			storage.add(dataElementField19);
			storage.add(dataElementField20);
			
			storage.add(dataElementField21);
			storage.add(dataElementField22);
			storage.add(dataElementField23);
			storage.add(dataElementField24);
			storage.add(dataElementField25);
			
			DataElementRuleHeader de055HeaderRule = new DE055RuleHeaderImpl(id, storage);
			
			return de055HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
			
			DataElementRuleHeader de055RuleHeader = new CreateDE055RuleHeader().createDE055RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de055RuleHeader,fieldList,codeList);
			
		}
}
