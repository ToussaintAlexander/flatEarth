package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE045RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE045RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE045RuleHeader  {

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
											   START_SENTINEL_045_RULE_HEADER_ID
											 , START_SENTINEL_045_RULE_HEADER_FIELD
											 , START_SENTINEL_045_RULE_HEADER_SUBFIELD
											 , START_SENTINEL_045_RULE_HEADER_FIRE		
											 , START_SENTINEL_045_RULE_HEADER_FORMAT
											 , START_SENTINEL_045_RULE_HEADER_MINIMUM_LENGTH
											 , START_SENTINEL_045_RULE_HEADER_MAXIMUM_LENGTH
											 , START_SENTINEL_045_RULE_HEADER_ENCODING
											 , START_SENTINEL_045_RULE_HEADER_DATATYPE
											 , START_SENTINEL_045_RULE_HEADER_SOURCE
											 , START_SENTINEL_045_RULE_HEADER_DIRECTION
											 , START_SENTINEL_045_RULE_HEADER_EXISTENCE
											 , START_SENTINEL_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   FORMAT_CODE_045_RULE_HEADER_ID
											 , FORMAT_CODE_045_RULE_HEADER_FIELD
											 , FORMAT_CODE_045_RULE_HEADER_SUBFIELD
											 , FORMAT_CODE_045_RULE_HEADER_FIRE		
											 , FORMAT_CODE_045_RULE_HEADER_FORMAT
											 , FORMAT_CODE_045_RULE_HEADER_MINIMUM_LENGTH
											 , FORMAT_CODE_045_RULE_HEADER_MAXIMUM_LENGTH
											 , FORMAT_CODE_045_RULE_HEADER_ENCODING
											 , FORMAT_CODE_045_RULE_HEADER_DATATYPE
											 , FORMAT_CODE_045_RULE_HEADER_SOURCE
											 , FORMAT_CODE_045_RULE_HEADER_DIRECTION
											 , FORMAT_CODE_045_RULE_HEADER_EXISTENCE
											 , FORMAT_CODE_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03a() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   BIN_045_RULE_HEADER_ID
											 , BIN_045_RULE_HEADER_FIELD
											 , BIN_045_RULE_HEADER_SUBFIELD
											 , BIN_045_RULE_HEADER_FIRE		
											 , BIN_045_RULE_HEADER_FORMAT
											 , BIN_045_RULE_HEADER_MINIMUM_LENGTH
											 , BIN_045_RULE_HEADER_MAXIMUM_LENGTH
											 , BIN_045_RULE_HEADER_ENCODING
											 , BIN_045_RULE_HEADER_DATATYPE
											 , BIN_045_RULE_HEADER_SOURCE
											 , BIN_045_RULE_HEADER_DIRECTION
											 , BIN_045_RULE_HEADER_EXISTENCE
											 , BIN_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03b() {
	
		DataElementRuleHeaderField dataElementField03b 	 
		
			= new DataElementRuleHeaderField ( 
											   PAN_045_RULE_HEADER_ID
											 , PAN_045_RULE_HEADER_FIELD
											 , PAN_045_RULE_HEADER_SUBFIELD
											 , PAN_045_RULE_HEADER_FIRE		
											 , PAN_045_RULE_HEADER_FORMAT
											 , PAN_045_RULE_HEADER_MINIMUM_LENGTH
											 , PAN_045_RULE_HEADER_MAXIMUM_LENGTH
											 , PAN_045_RULE_HEADER_ENCODING
											 , PAN_045_RULE_HEADER_DATATYPE
											 , PAN_045_RULE_HEADER_SOURCE
											 , PAN_045_RULE_HEADER_DIRECTION
											 , PAN_045_RULE_HEADER_EXISTENCE
											 , PAN_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03c() {
	
		DataElementRuleHeaderField dataElementField03c 	 
		
			= new DataElementRuleHeaderField ( 
											   CHECK_DIGIT_045_RULE_HEADER_ID
											 , CHECK_DIGIT_045_RULE_HEADER_FIELD
											 , CHECK_DIGIT_045_RULE_HEADER_SUBFIELD
											 , CHECK_DIGIT_045_RULE_HEADER_FIRE		
											 , CHECK_DIGIT_045_RULE_HEADER_FORMAT
											 , CHECK_DIGIT_045_RULE_HEADER_MINIMUM_LENGTH
											 , CHECK_DIGIT_045_RULE_HEADER_MAXIMUM_LENGTH
											 , CHECK_DIGIT_045_RULE_HEADER_ENCODING
											 , CHECK_DIGIT_045_RULE_HEADER_DATATYPE
											 , CHECK_DIGIT_045_RULE_HEADER_SOURCE
											 , CHECK_DIGIT_045_RULE_HEADER_DIRECTION
											 , CHECK_DIGIT_045_RULE_HEADER_EXISTENCE
											 , CHECK_DIGIT_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03c;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   FIELD_SEPARATOR_01_045_RULE_HEADER_ID
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_FIELD
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_SUBFIELD
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_FIRE		
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_FORMAT
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_MINIMUM_LENGTH
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_MAXIMUM_LENGTH
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_ENCODING
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_DATATYPE
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_SOURCE
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_DIRECTION
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_EXISTENCE
											 , FIELD_SEPARATOR_01_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   FULL_NAME_045_RULE_HEADER_ID
											 , FULL_NAME_045_RULE_HEADER_FIELD
											 , FULL_NAME_045_RULE_HEADER_SUBFIELD
											 , FULL_NAME_045_RULE_HEADER_FIRE		
											 , FULL_NAME_045_RULE_HEADER_FORMAT
											 , FULL_NAME_045_RULE_HEADER_MINIMUM_LENGTH
											 , FULL_NAME_045_RULE_HEADER_MAXIMUM_LENGTH
											 , FULL_NAME_045_RULE_HEADER_ENCODING
											 , FULL_NAME_045_RULE_HEADER_DATATYPE
											 , FULL_NAME_045_RULE_HEADER_SOURCE
											 , FULL_NAME_045_RULE_HEADER_DIRECTION
											 , FULL_NAME_045_RULE_HEADER_EXISTENCE
											 , FULL_NAME_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06 	 
		
			= new DataElementRuleHeaderField ( 
											   FIELD_SEPARATOR_02_045_RULE_HEADER_ID
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_FIELD
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_SUBFIELD
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_FIRE		
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_FORMAT
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_MINIMUM_LENGTH
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_MAXIMUM_LENGTH
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_ENCODING
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_DATATYPE
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_SOURCE
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_DIRECTION
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_EXISTENCE
											 , FIELD_SEPARATOR_02_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07 	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_YEAR_045_RULE_HEADER_ID
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_YEAR_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField08() {
	
		DataElementRuleHeaderField dataElementField08 	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_MONTH_045_RULE_HEADER_ID
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_MONTH_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField08;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField09() {
	
		DataElementRuleHeaderField dataElementField09 	 
		
			= new DataElementRuleHeaderField ( 
											   SERVICE_CODE_045_RULE_HEADER_ID
											 , SERVICE_CODE_045_RULE_HEADER_FIELD
											 , SERVICE_CODE_045_RULE_HEADER_SUBFIELD
											 , SERVICE_CODE_045_RULE_HEADER_FIRE		
											 , SERVICE_CODE_045_RULE_HEADER_FORMAT
											 , SERVICE_CODE_045_RULE_HEADER_MINIMUM_LENGTH
											 , SERVICE_CODE_045_RULE_HEADER_MAXIMUM_LENGTH
											 , SERVICE_CODE_045_RULE_HEADER_ENCODING
											 , SERVICE_CODE_045_RULE_HEADER_DATATYPE
											 , SERVICE_CODE_045_RULE_HEADER_SOURCE
											 , SERVICE_CODE_045_RULE_HEADER_DIRECTION
											 , SERVICE_CODE_045_RULE_HEADER_EXISTENCE
											 , SERVICE_CODE_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField09;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField10() {
	
		DataElementRuleHeaderField dataElementField10 	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_ID
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_FIELD
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_SUBFIELD
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_FIRE		
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_FORMAT
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_ENCODING
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_DATATYPE
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_SOURCE
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_DIRECTION
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_EXISTENCE
											 , PIN_VALUE_KEY_INDICATOR_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField10;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField11() {
	
		DataElementRuleHeaderField dataElementField11 	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VERIFICATION_VALUE_045_RULE_HEADER_ID
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_FIELD
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_SUBFIELD
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_FIRE		
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_FORMAT
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_ENCODING
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_DATATYPE
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_SOURCE
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_DIRECTION
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_EXISTENCE
											 , PIN_VERIFICATION_VALUE_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField11;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField12() {
	
		DataElementRuleHeaderField dataElementField12 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_VERIFICATION_VALUE_045_RULE_HEADER_ID
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_FIELD
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_SUBFIELD
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_FIRE		
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_FORMAT
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_ENCODING
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_DATATYPE
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_SOURCE
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_DIRECTION
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_EXISTENCE
											 , CARD_VERIFICATION_VALUE_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField12;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField13() {
	
		DataElementRuleHeaderField dataElementField13 	 
		
			= new DataElementRuleHeaderField ( 
											   END_SENTINEL_045_RULE_HEADER_ID
											 , END_SENTINEL_045_RULE_HEADER_FIELD
											 , END_SENTINEL_045_RULE_HEADER_SUBFIELD
											 , END_SENTINEL_045_RULE_HEADER_FIRE		
											 , END_SENTINEL_045_RULE_HEADER_FORMAT
											 , END_SENTINEL_045_RULE_HEADER_MINIMUM_LENGTH
											 , END_SENTINEL_045_RULE_HEADER_MAXIMUM_LENGTH
											 , END_SENTINEL_045_RULE_HEADER_ENCODING
											 , END_SENTINEL_045_RULE_HEADER_DATATYPE
											 , END_SENTINEL_045_RULE_HEADER_SOURCE
											 , END_SENTINEL_045_RULE_HEADER_DIRECTION
											 , END_SENTINEL_045_RULE_HEADER_EXISTENCE
											 , END_SENTINEL_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField13;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField14() {
	
		DataElementRuleHeaderField dataElementField14 	 
		
			= new DataElementRuleHeaderField ( 
											   LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_ID
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_FIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_SUBFIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_FIRE		
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_FORMAT
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_MINIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_MAXIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_ENCODING
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_DATATYPE
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_SOURCE
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_DIRECTION
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_EXISTENCE
											 , LONG_REDUNDANCY_CHECK_CHAR_045_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField14;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE045RuleHeader () {
			
			int id = 45000;
			
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
			
			DataElementRuleHeader de045HeaderRule = new DE045RuleHeaderImpl(id, storage);
			
			return de045HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de045RuleHeader = new CreateDE045RuleHeader().createDE045RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de045RuleHeader,fieldList,codeList);
		
		}
}
