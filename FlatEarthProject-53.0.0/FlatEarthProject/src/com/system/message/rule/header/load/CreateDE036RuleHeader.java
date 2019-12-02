package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE036RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE036RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE036RuleHeader  {

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
											   START_SENTINEL_036_RULE_HEADER_ID
											 , START_SENTINEL_036_RULE_HEADER_FIELD
											 , START_SENTINEL_036_RULE_HEADER_SUBFIELD
											 , START_SENTINEL_036_RULE_HEADER_FIRE		
											 , START_SENTINEL_036_RULE_HEADER_FORMAT
											 , START_SENTINEL_036_RULE_HEADER_MINIMUM_LENGTH
											 , START_SENTINEL_036_RULE_HEADER_MAXIMUM_LENGTH
											 , START_SENTINEL_036_RULE_HEADER_ENCODING
											 , START_SENTINEL_036_RULE_HEADER_DATATYPE
											 , START_SENTINEL_036_RULE_HEADER_SOURCE
											 , START_SENTINEL_036_RULE_HEADER_DIRECTION
											 , START_SENTINEL_036_RULE_HEADER_EXISTENCE
											 , START_SENTINEL_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02	 
		
			= new DataElementRuleHeaderField ( 
											   FORMAT_CODE_036_RULE_HEADER_ID
											 , FORMAT_CODE_036_RULE_HEADER_FIELD
											 , FORMAT_CODE_036_RULE_HEADER_SUBFIELD
											 , FORMAT_CODE_036_RULE_HEADER_FIRE		
											 , FORMAT_CODE_036_RULE_HEADER_FORMAT
											 , FORMAT_CODE_036_RULE_HEADER_MINIMUM_LENGTH
											 , FORMAT_CODE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , FORMAT_CODE_036_RULE_HEADER_ENCODING
											 , FORMAT_CODE_036_RULE_HEADER_DATATYPE
											 , FORMAT_CODE_036_RULE_HEADER_SOURCE
											 , FORMAT_CODE_036_RULE_HEADER_DIRECTION
											 , FORMAT_CODE_036_RULE_HEADER_EXISTENCE
											 , FORMAT_CODE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03a() {
	
		DataElementRuleHeaderField dataElementField03a	 
		
			= new DataElementRuleHeaderField ( 
											   BIN_036_RULE_HEADER_ID
											 , BIN_036_RULE_HEADER_FIELD
											 , BIN_036_RULE_HEADER_SUBFIELD
											 , BIN_036_RULE_HEADER_FIRE		
											 , BIN_036_RULE_HEADER_FORMAT
											 , BIN_036_RULE_HEADER_MINIMUM_LENGTH
											 , BIN_036_RULE_HEADER_MAXIMUM_LENGTH
											 , BIN_036_RULE_HEADER_ENCODING
											 , BIN_036_RULE_HEADER_DATATYPE
											 , BIN_036_RULE_HEADER_SOURCE
											 , BIN_036_RULE_HEADER_DIRECTION
											 , BIN_036_RULE_HEADER_EXISTENCE
											 , BIN_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03a;
		
	}	
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03b() {
	
		DataElementRuleHeaderField dataElementField03b	 
		
			= new DataElementRuleHeaderField ( 
										       PAN_036_RULE_HEADER_ID
										     , PAN_036_RULE_HEADER_FIELD
										     , PAN_036_RULE_HEADER_SUBFIELD
										     , PAN_036_RULE_HEADER_FIRE		
										     , PAN_036_RULE_HEADER_FORMAT
										     , PAN_036_RULE_HEADER_MINIMUM_LENGTH
										     , PAN_036_RULE_HEADER_MAXIMUM_LENGTH
										     , PAN_036_RULE_HEADER_ENCODING
										     , PAN_036_RULE_HEADER_DATATYPE
										     , PAN_036_RULE_HEADER_SOURCE
										     , PAN_036_RULE_HEADER_DIRECTION
										     , PAN_036_RULE_HEADER_EXISTENCE
										     , PAN_036_RULE_HEADER_CHANGE
		  	       	       		             );

		return dataElementField03b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03c() {
	
		DataElementRuleHeaderField dataElementField03c	 
		
			= new DataElementRuleHeaderField ( 
									           CHECK_DIGIT_036_RULE_HEADER_ID
									         , CHECK_DIGIT_036_RULE_HEADER_FIELD
									         , CHECK_DIGIT_036_RULE_HEADER_SUBFIELD
									         , CHECK_DIGIT_036_RULE_HEADER_FIRE		
									         , CHECK_DIGIT_036_RULE_HEADER_FORMAT
									         , CHECK_DIGIT_036_RULE_HEADER_MINIMUM_LENGTH
									         , CHECK_DIGIT_036_RULE_HEADER_MAXIMUM_LENGTH
									         , CHECK_DIGIT_036_RULE_HEADER_ENCODING
									         , CHECK_DIGIT_036_RULE_HEADER_DATATYPE
									         , CHECK_DIGIT_036_RULE_HEADER_SOURCE
									         , CHECK_DIGIT_036_RULE_HEADER_DIRECTION
									         , CHECK_DIGIT_036_RULE_HEADER_EXISTENCE
									         , CHECK_DIGIT_036_RULE_HEADER_CHANGE
	  	       	       		             	);

		return dataElementField03c;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04	 
		
			= new DataElementRuleHeaderField ( 
											   FIELD_SEPARATOR_01_036_RULE_HEADER_ID
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_FIELD
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_SUBFIELD
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_FIRE		
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_FORMAT
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_MINIMUM_LENGTH
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_MAXIMUM_LENGTH
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_ENCODING
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_DATATYPE
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_SOURCE
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_DIRECTION
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_EXISTENCE
											 , FIELD_SEPARATOR_01_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05	 
		
			= new DataElementRuleHeaderField ( 
											   COUNTRY_CODE_036_RULE_HEADER_ID
											 , COUNTRY_CODE_036_RULE_HEADER_FIELD
											 , COUNTRY_CODE_036_RULE_HEADER_SUBFIELD
											 , COUNTRY_CODE_036_RULE_HEADER_FIRE		
											 , COUNTRY_CODE_036_RULE_HEADER_FORMAT
											 , COUNTRY_CODE_036_RULE_HEADER_MINIMUM_LENGTH
											 , COUNTRY_CODE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , COUNTRY_CODE_036_RULE_HEADER_ENCODING
											 , COUNTRY_CODE_036_RULE_HEADER_DATATYPE
											 , COUNTRY_CODE_036_RULE_HEADER_SOURCE
											 , COUNTRY_CODE_036_RULE_HEADER_DIRECTION
											 , COUNTRY_CODE_036_RULE_HEADER_EXISTENCE
											 , COUNTRY_CODE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06	 
		
			= new DataElementRuleHeaderField ( 
											   CURRENCY_CODE_036_RULE_HEADER_ID
											 , CURRENCY_CODE_036_RULE_HEADER_FIELD
											 , CURRENCY_CODE_036_RULE_HEADER_SUBFIELD
											 , CURRENCY_CODE_036_RULE_HEADER_FIRE		
											 , CURRENCY_CODE_036_RULE_HEADER_FORMAT
											 , CURRENCY_CODE_036_RULE_HEADER_MINIMUM_LENGTH
											 , CURRENCY_CODE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CURRENCY_CODE_036_RULE_HEADER_ENCODING
											 , CURRENCY_CODE_036_RULE_HEADER_DATATYPE
											 , CURRENCY_CODE_036_RULE_HEADER_SOURCE
											 , CURRENCY_CODE_036_RULE_HEADER_DIRECTION
											 , CURRENCY_CODE_036_RULE_HEADER_EXISTENCE
											 , CURRENCY_CODE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07	 
		
			= new DataElementRuleHeaderField ( 
											   CURRENCY_EXPONENT_036_RULE_HEADER_ID
											 , CURRENCY_EXPONENT_036_RULE_HEADER_FIELD
											 , CURRENCY_EXPONENT_036_RULE_HEADER_SUBFIELD
											 , CURRENCY_EXPONENT_036_RULE_HEADER_FIRE		
											 , CURRENCY_EXPONENT_036_RULE_HEADER_FORMAT
											 , CURRENCY_EXPONENT_036_RULE_HEADER_MINIMUM_LENGTH
											 , CURRENCY_EXPONENT_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CURRENCY_EXPONENT_036_RULE_HEADER_ENCODING
											 , CURRENCY_EXPONENT_036_RULE_HEADER_DATATYPE
											 , CURRENCY_EXPONENT_036_RULE_HEADER_SOURCE
											 , CURRENCY_EXPONENT_036_RULE_HEADER_DIRECTION
											 , CURRENCY_EXPONENT_036_RULE_HEADER_EXISTENCE
											 , CURRENCY_EXPONENT_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField08() {
	
		DataElementRuleHeaderField dataElementField08	 
		
			= new DataElementRuleHeaderField ( 
											   AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_ID
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FIELD
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_SUBFIELD
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FIRE		
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_FORMAT
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_MINIMUM_LENGTH
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_ENCODING
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_DATATYPE
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_SOURCE
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_DIRECTION
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_EXISTENCE
											 , AMOUNT_AUTHORIZED_PER_CYCLE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField08;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField09() {
	
		DataElementRuleHeaderField dataElementField09	 
		
			= new DataElementRuleHeaderField ( 
											   AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_ID
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FIELD
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_SUBFIELD
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FIRE		
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_FORMAT
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_MINIMUM_LENGTH
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_ENCODING
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_DATATYPE
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_SOURCE
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_DIRECTION
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_EXISTENCE
											 , AMOUNT_REMAINING_THIS_CYCLE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField09;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField10() {
	
		DataElementRuleHeaderField dataElementField10	 
		
			= new DataElementRuleHeaderField ( 
											   CYCLE_BEGIN_036_RULE_HEADER_ID
											 , CYCLE_BEGIN_036_RULE_HEADER_FIELD
											 , CYCLE_BEGIN_036_RULE_HEADER_SUBFIELD
											 , CYCLE_BEGIN_036_RULE_HEADER_FIRE		
											 , CYCLE_BEGIN_036_RULE_HEADER_FORMAT
											 , CYCLE_BEGIN_036_RULE_HEADER_MINIMUM_LENGTH
											 , CYCLE_BEGIN_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CYCLE_BEGIN_036_RULE_HEADER_ENCODING
											 , CYCLE_BEGIN_036_RULE_HEADER_DATATYPE
											 , CYCLE_BEGIN_036_RULE_HEADER_SOURCE
											 , CYCLE_BEGIN_036_RULE_HEADER_DIRECTION
											 , CYCLE_BEGIN_036_RULE_HEADER_EXISTENCE
											 , CYCLE_BEGIN_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField10;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField11() {
	
		DataElementRuleHeaderField dataElementField11	 
		
			= new DataElementRuleHeaderField ( 
											   CYCLE_LENGTH_036_RULE_HEADER_ID
											 , CYCLE_LENGTH_036_RULE_HEADER_FIELD
											 , CYCLE_LENGTH_036_RULE_HEADER_SUBFIELD
											 , CYCLE_LENGTH_036_RULE_HEADER_FIRE		
											 , CYCLE_LENGTH_036_RULE_HEADER_FORMAT
											 , CYCLE_LENGTH_036_RULE_HEADER_MINIMUM_LENGTH
											 , CYCLE_LENGTH_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CYCLE_LENGTH_036_RULE_HEADER_ENCODING
											 , CYCLE_LENGTH_036_RULE_HEADER_DATATYPE
											 , CYCLE_LENGTH_036_RULE_HEADER_SOURCE
											 , CYCLE_LENGTH_036_RULE_HEADER_DIRECTION
											 , CYCLE_LENGTH_036_RULE_HEADER_EXISTENCE
											 , CYCLE_LENGTH_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField11;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField12() {
	
		DataElementRuleHeaderField dataElementField12	 
		
			= new DataElementRuleHeaderField ( 
											   RETRY_COUNT_036_RULE_HEADER_ID
											 , RETRY_COUNT_036_RULE_HEADER_FIELD
											 , RETRY_COUNT_036_RULE_HEADER_SUBFIELD
											 , RETRY_COUNT_036_RULE_HEADER_FIRE		
											 , RETRY_COUNT_036_RULE_HEADER_FORMAT
											 , RETRY_COUNT_036_RULE_HEADER_MINIMUM_LENGTH
											 , RETRY_COUNT_036_RULE_HEADER_MAXIMUM_LENGTH
											 , RETRY_COUNT_036_RULE_HEADER_ENCODING
											 , RETRY_COUNT_036_RULE_HEADER_DATATYPE
											 , RETRY_COUNT_036_RULE_HEADER_SOURCE
											 , RETRY_COUNT_036_RULE_HEADER_DIRECTION
											 , RETRY_COUNT_036_RULE_HEADER_EXISTENCE
											 , RETRY_COUNT_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField12;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField13() {
	
		DataElementRuleHeaderField dataElementField13	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_CONTROL_PARAMETERS_036_RULE_HEADER_ID
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FIELD
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_SUBFIELD
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FIRE		
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_FORMAT
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_ENCODING
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_DATATYPE
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_SOURCE
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_DIRECTION
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_EXISTENCE
											 , PIN_CONTROL_PARAMETERS_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField13;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField14() {
	
		DataElementRuleHeaderField dataElementField14	 
		
			= new DataElementRuleHeaderField ( 
											   INTERCHANGE_CONTROLS_036_RULE_HEADER_ID
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_FIELD
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_SUBFIELD
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_FIRE		
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_FORMAT
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_MINIMUM_LENGTH
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_MAXIMUM_LENGTH
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_ENCODING
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_DATATYPE
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_SOURCE
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_DIRECTION
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_EXISTENCE
											 , INTERCHANGE_CONTROLS_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField14;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField15() {
	
		DataElementRuleHeaderField dataElementField15	 
		
			= new DataElementRuleHeaderField ( 
											   PAN_SERVICE_RESTRICTION_036_RULE_HEADER_ID
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE		
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE
											 , PAN_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField15;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField16() {
	
		DataElementRuleHeaderField dataElementField16	 
		
			= new DataElementRuleHeaderField ( 
											   SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_ID
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE		
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE
											 , SAN_1_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField16;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField17() {
	
		DataElementRuleHeaderField dataElementField17	 
		
			= new DataElementRuleHeaderField ( 
											   SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_ID
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FIELD
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_SUBFIELD
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FIRE		
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_FORMAT
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_MINIMUM_LENGTH
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_MAXIMUM_LENGTH
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_ENCODING
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_DATATYPE
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_SOURCE
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_DIRECTION
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_EXISTENCE
											 , SAN_2_SERVICE_RESTRICTION_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField17;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField18() {
	
		DataElementRuleHeaderField dataElementField18	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_YEAR_036_RULE_HEADER_ID
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_YEAR_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField18;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField19() {
	
		DataElementRuleHeaderField dataElementField19	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_MONTH_036_RULE_HEADER_ID
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_MONTH_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField19;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField20() {
	
		DataElementRuleHeaderField dataElementField20	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_SEQUENCE_NUMBER_036_RULE_HEADER_ID
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FIELD
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_SUBFIELD
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FIRE		
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_FORMAT
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_ENCODING
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_DATATYPE
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_SOURCE
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_DIRECTION
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_EXISTENCE
											 , CARD_SEQUENCE_NUMBER_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField20;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField21() {
	
		DataElementRuleHeaderField dataElementField21	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_SECURITY_NUMBER_036_RULE_HEADER_ID
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_FIELD
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_SUBFIELD
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_FIRE		
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_FORMAT
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_ENCODING
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_DATATYPE
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_SOURCE
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_DIRECTION
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_EXISTENCE
											 , CARD_SECURITY_NUMBER_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField21;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField22() {
	
		DataElementRuleHeaderField dataElementField22	 
		
			= new DataElementRuleHeaderField ( 
											   FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ID
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIELD
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SUBFIELD
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIRE		
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FORMAT
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MINIMUM_LENGTH
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MAXIMUM_LENGTH
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ENCODING
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DATATYPE
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SOURCE
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DIRECTION
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_EXISTENCE
											 , FIRST_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField22;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField23() {
	
		DataElementRuleHeaderField dataElementField23	 
		
			= new DataElementRuleHeaderField ( 
											   SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ID
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIELD
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SUBFIELD
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FIRE		
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_FORMAT
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MINIMUM_LENGTH
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_MAXIMUM_LENGTH
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_ENCODING
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DATATYPE
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_SOURCE
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_DIRECTION
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_EXISTENCE
											 , SECONDARY_SUBSIDIARY_ACCT_NBR_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField23;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField24() {
	
		DataElementRuleHeaderField dataElementField24	 
		
			= new DataElementRuleHeaderField ( 
											   RELAY_MARKER_036_RULE_HEADER_ID
											 , RELAY_MARKER_036_RULE_HEADER_FIELD
											 , RELAY_MARKER_036_RULE_HEADER_SUBFIELD
											 , RELAY_MARKER_036_RULE_HEADER_FIRE		
											 , RELAY_MARKER_036_RULE_HEADER_FORMAT
											 , RELAY_MARKER_036_RULE_HEADER_MINIMUM_LENGTH
											 , RELAY_MARKER_036_RULE_HEADER_MAXIMUM_LENGTH
											 , RELAY_MARKER_036_RULE_HEADER_ENCODING
											 , RELAY_MARKER_036_RULE_HEADER_DATATYPE
											 , RELAY_MARKER_036_RULE_HEADER_SOURCE
											 , RELAY_MARKER_036_RULE_HEADER_DIRECTION
											 , RELAY_MARKER_036_RULE_HEADER_EXISTENCE
											 , RELAY_MARKER_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField24;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField25() {
	
		DataElementRuleHeaderField dataElementField25	 
		
			= new DataElementRuleHeaderField ( 
											   CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_ID
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FIELD
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_SUBFIELD
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FIRE		
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_FORMAT
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_MINIMUM_LENGTH
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_ENCODING
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_DATATYPE
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_SOURCE
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_DIRECTION
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_EXISTENCE
											 , CRYPTOGRAPHIC_CHECK_DIGITS_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField25;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField26() {
	
		DataElementRuleHeaderField dataElementField26	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_ID
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FIELD
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_SUBFIELD
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FIRE		
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_FORMAT
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_ENCODING
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_DATATYPE
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_SOURCE
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_DIRECTION
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_EXISTENCE
											 , PIN_VALUE_KEY_INDICATOR_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField26;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField27() {
	
		DataElementRuleHeaderField dataElementField27	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VERIFICATION_VALUE_036_RULE_HEADER_ID
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_FIELD
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_SUBFIELD
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_FIRE		
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_FORMAT
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_ENCODING
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_DATATYPE
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_SOURCE
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_DIRECTION
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_EXISTENCE
											 , PIN_VERIFICATION_VALUE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField27;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField28() {
	
		DataElementRuleHeaderField dataElementField28	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_VERIFICATION_VALUE_036_RULE_HEADER_ID
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_FIELD
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_SUBFIELD
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_FIRE		
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_FORMAT
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_ENCODING
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_DATATYPE
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_SOURCE
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_DIRECTION
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_EXISTENCE
											 , CARD_VERIFICATION_VALUE_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField28;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField29() {
	
		DataElementRuleHeaderField dataElementField29	 
		
			= new DataElementRuleHeaderField ( 
											   END_SENTINEL_036_RULE_HEADER_ID
											 , END_SENTINEL_036_RULE_HEADER_FIELD
											 , END_SENTINEL_036_RULE_HEADER_SUBFIELD
											 , END_SENTINEL_036_RULE_HEADER_FIRE		
											 , END_SENTINEL_036_RULE_HEADER_FORMAT
											 , END_SENTINEL_036_RULE_HEADER_MINIMUM_LENGTH
											 , END_SENTINEL_036_RULE_HEADER_MAXIMUM_LENGTH
											 , END_SENTINEL_036_RULE_HEADER_ENCODING
											 , END_SENTINEL_036_RULE_HEADER_DATATYPE
											 , END_SENTINEL_036_RULE_HEADER_SOURCE
											 , END_SENTINEL_036_RULE_HEADER_DIRECTION
											 , END_SENTINEL_036_RULE_HEADER_EXISTENCE
											 , END_SENTINEL_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField29;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField30() {
	
		DataElementRuleHeaderField dataElementField30	 
		
			= new DataElementRuleHeaderField ( 
											   LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_ID
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_SUBFIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FIRE		
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_FORMAT
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_MINIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_MAXIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_ENCODING
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_DATATYPE
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_SOURCE
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_DIRECTION
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_EXISTENCE
											 , LONG_REDUNDANCY_CHECK_CHAR_036_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField30;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE036RuleHeader () {
			
			int id = 36000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			
			DataElementRuleHeaderField dataElementField03a = getDataElementRuleField03a();
			DataElementRuleHeaderField dataElementField03b = getDataElementRuleField03b();
			DataElementRuleHeaderField dataElementField03c = getDataElementRuleField03c();
			
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
			DataElementRuleHeaderField dataElementField26 = getDataElementRuleField26();
			DataElementRuleHeaderField dataElementField27 = getDataElementRuleField27();
			DataElementRuleHeaderField dataElementField28 = getDataElementRuleField28();
			DataElementRuleHeaderField dataElementField29 = getDataElementRuleField29();
			DataElementRuleHeaderField dataElementField30 = getDataElementRuleField30();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			
			storage.add(dataElementField03a);
			storage.add(dataElementField03b);
			storage.add(dataElementField03c);
			
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
			storage.add(dataElementField26);
			storage.add(dataElementField27);
			storage.add(dataElementField28);
			storage.add(dataElementField29);
			storage.add(dataElementField30);
			
			DataElementRuleHeader de036HeaderRule = new DE036RuleHeaderImpl(id, storage);
			
			return de036HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de036RuleHeader = new CreateDE036RuleHeader().createDE036RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de036RuleHeader,fieldList,codeList);
		
		}
}
