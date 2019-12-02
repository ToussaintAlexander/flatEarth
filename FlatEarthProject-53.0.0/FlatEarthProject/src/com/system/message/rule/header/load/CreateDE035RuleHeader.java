package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE035RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE035RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE035RuleHeader  {

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
											   START_SENTINEL_035_RULE_HEADER_ID
											 , START_SENTINEL_035_RULE_HEADER_FIELD
											 , START_SENTINEL_035_RULE_HEADER_SUBFIELD
											 , START_SENTINEL_035_RULE_HEADER_FIRE		
											 , START_SENTINEL_035_RULE_HEADER_FORMAT
											 , START_SENTINEL_035_RULE_HEADER_MINIMUM_LENGTH
											 , START_SENTINEL_035_RULE_HEADER_MAXIMUM_LENGTH
											 , START_SENTINEL_035_RULE_HEADER_ENCODING
											 , START_SENTINEL_035_RULE_HEADER_DATATYPE
											 , START_SENTINEL_035_RULE_HEADER_SOURCE
											 , START_SENTINEL_035_RULE_HEADER_DIRECTION
											 , START_SENTINEL_035_RULE_HEADER_EXISTENCE
											 , START_SENTINEL_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02a() {
	

		DataElementRuleHeaderField dataElementField02a 	 

			= new DataElementRuleHeaderField ( 
										       BIN_035_RULE_HEADER_ID
			                                 , BIN_035_RULE_HEADER_FIELD
			                                 , BIN_035_RULE_HEADER_SUBFIELD
			                                 , BIN_035_RULE_HEADER_FIRE
			                                 , BIN_035_RULE_HEADER_FORMAT
			                                 , BIN_035_RULE_HEADER_MINIMUM_LENGTH
			                                 , BIN_035_RULE_HEADER_MAXIMUM_LENGTH
			                                 , BIN_035_RULE_HEADER_ENCODING
			                                 , BIN_035_RULE_HEADER_DATATYPE
			                                 , BIN_035_RULE_HEADER_SOURCE
			                                 , BIN_035_RULE_HEADER_DIRECTION
			                                 , BIN_035_RULE_HEADER_EXISTENCE
			                                 , BIN_035_RULE_HEADER_CHANGE
		  		  	       	                 );

		return dataElementField02a;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02b() {
	
		DataElementRuleHeaderField dataElementField02b 	 
		
			= new DataElementRuleHeaderField ( 
											   PAN_035_RULE_HEADER_ID
											 , PAN_035_RULE_HEADER_FIELD
											 , PAN_035_RULE_HEADER_SUBFIELD
											 , PAN_035_RULE_HEADER_FIRE
											 , PAN_035_RULE_HEADER_FORMAT
											 , PAN_035_RULE_HEADER_MINIMUM_LENGTH
											 , PAN_035_RULE_HEADER_MAXIMUM_LENGTH
											 , PAN_035_RULE_HEADER_ENCODING
											 , PAN_035_RULE_HEADER_DATATYPE
											 , PAN_035_RULE_HEADER_SOURCE
											 , PAN_035_RULE_HEADER_DIRECTION
											 , PAN_035_RULE_HEADER_EXISTENCE
											 , PAN_035_RULE_HEADER_CHANGE
								             );

		return dataElementField02b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02c() {
	
		DataElementRuleHeaderField dataElementField02c 	 
		
			= new DataElementRuleHeaderField ( 
											   CHECK_DIGIT_035_RULE_HEADER_ID
											 , CHECK_DIGIT_035_RULE_HEADER_FIELD
											 , CHECK_DIGIT_035_RULE_HEADER_SUBFIELD
											 , CHECK_DIGIT_035_RULE_HEADER_FIRE
											 , CHECK_DIGIT_035_RULE_HEADER_FORMAT
											 , CHECK_DIGIT_035_RULE_HEADER_MINIMUM_LENGTH
											 , CHECK_DIGIT_035_RULE_HEADER_MAXIMUM_LENGTH
											 , CHECK_DIGIT_035_RULE_HEADER_ENCODING
											 , CHECK_DIGIT_035_RULE_HEADER_DATATYPE
											 , CHECK_DIGIT_035_RULE_HEADER_SOURCE
											 , CHECK_DIGIT_035_RULE_HEADER_DIRECTION
											 , CHECK_DIGIT_035_RULE_HEADER_EXISTENCE
											 , CHECK_DIGIT_035_RULE_HEADER_CHANGE
											 );

		return dataElementField02c;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   FIELD_SEPARATOR_01_035_RULE_HEADER_ID
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_FIELD
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_SUBFIELD
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_FIRE		
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_FORMAT
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_MINIMUM_LENGTH
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_MAXIMUM_LENGTH
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_ENCODING
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_DATATYPE
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_SOURCE
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_DIRECTION
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_EXISTENCE
											 , FIELD_SEPARATOR_01_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_YEAR_035_RULE_HEADER_ID
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_YEAR_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_MONTH_035_RULE_HEADER_ID
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_FIELD
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_SUBFIELD
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_FIRE		
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_FORMAT
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_MINIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_MAXIMUM_LENGTH
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_ENCODING
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_DATATYPE
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_SOURCE
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_DIRECTION
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_EXISTENCE
											 , EXPIRATION_DATE_MONTH_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06 	 
		
			= new DataElementRuleHeaderField ( 
											   SERVICE_CODE_035_RULE_HEADER_ID
											 , SERVICE_CODE_035_RULE_HEADER_FIELD
											 , SERVICE_CODE_035_RULE_HEADER_SUBFIELD
											 , SERVICE_CODE_035_RULE_HEADER_FIRE		
											 , SERVICE_CODE_035_RULE_HEADER_FORMAT
											 , SERVICE_CODE_035_RULE_HEADER_MINIMUM_LENGTH
											 , SERVICE_CODE_035_RULE_HEADER_MAXIMUM_LENGTH
											 , SERVICE_CODE_035_RULE_HEADER_ENCODING
											 , SERVICE_CODE_035_RULE_HEADER_DATATYPE
											 , SERVICE_CODE_035_RULE_HEADER_SOURCE
											 , SERVICE_CODE_035_RULE_HEADER_DIRECTION
											 , SERVICE_CODE_035_RULE_HEADER_EXISTENCE
											 , SERVICE_CODE_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07 	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_ID
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_FIELD
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_SUBFIELD
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_FIRE		
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_FORMAT
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_ENCODING
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_DATATYPE
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_SOURCE
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_DIRECTION
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_EXISTENCE
											 , PIN_VALUE_KEY_INDICATOR_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField08() {
	
		DataElementRuleHeaderField dataElementField08 	 
		
			= new DataElementRuleHeaderField ( 
											   PIN_VERIFICATION_VALUE_035_RULE_HEADER_ID
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_FIELD
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_SUBFIELD
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_FIRE		
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_FORMAT
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_MINIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_MAXIMUM_LENGTH
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_ENCODING
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_DATATYPE
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_SOURCE
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_DIRECTION
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_EXISTENCE
											 , PIN_VERIFICATION_VALUE_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField08;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField09() {
	
		DataElementRuleHeaderField dataElementField09 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_VERIFICATION_VALUE_035_RULE_HEADER_ID
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_FIELD
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_SUBFIELD
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_FIRE		
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_FORMAT
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_ENCODING
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_DATATYPE
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_SOURCE
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_DIRECTION
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_EXISTENCE
											 , CARD_VERIFICATION_VALUE_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField09;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField10() {
	
		DataElementRuleHeaderField dataElementField10 	 
		
			= new DataElementRuleHeaderField ( 
											   END_SENTINEL_035_RULE_HEADER_ID
											 , END_SENTINEL_035_RULE_HEADER_FIELD
											 , END_SENTINEL_035_RULE_HEADER_SUBFIELD
											 , END_SENTINEL_035_RULE_HEADER_FIRE		
											 , END_SENTINEL_035_RULE_HEADER_FORMAT
											 , END_SENTINEL_035_RULE_HEADER_MINIMUM_LENGTH
											 , END_SENTINEL_035_RULE_HEADER_MAXIMUM_LENGTH
											 , END_SENTINEL_035_RULE_HEADER_ENCODING
											 , END_SENTINEL_035_RULE_HEADER_DATATYPE
											 , END_SENTINEL_035_RULE_HEADER_SOURCE
											 , END_SENTINEL_035_RULE_HEADER_DIRECTION
											 , END_SENTINEL_035_RULE_HEADER_EXISTENCE
											 , END_SENTINEL_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField10;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField11() {
	
		DataElementRuleHeaderField dataElementField11 	 
		
			= new DataElementRuleHeaderField ( 
											   LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_ID
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_FIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_SUBFIELD
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_FIRE		
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_FORMAT
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_MINIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_MAXIMUM_LENGTH
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_ENCODING
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_DATATYPE
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_SOURCE
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_DIRECTION
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_EXISTENCE
											 , LONG_REDUNDANCY_CHECK_CHAR_035_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField11;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE035RuleHeader () {
			
			int id = 35000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			DataElementRuleHeaderField dataElementField02a = getDataElementRuleField02a();
			DataElementRuleHeaderField dataElementField02b = getDataElementRuleField02b();
			DataElementRuleHeaderField dataElementField02c = getDataElementRuleField02c();
			
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			DataElementRuleHeaderField dataElementField06 = getDataElementRuleField06();
			DataElementRuleHeaderField dataElementField07 = getDataElementRuleField07();
			DataElementRuleHeaderField dataElementField08 = getDataElementRuleField08();
			DataElementRuleHeaderField dataElementField09 = getDataElementRuleField09();
			DataElementRuleHeaderField dataElementField10 = getDataElementRuleField10();
			DataElementRuleHeaderField dataElementField11 = getDataElementRuleField11();
			
			storage.add(dataElementField01);
			
			storage.add(dataElementField02a);
			storage.add(dataElementField02b);
			storage.add(dataElementField02c);
			
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			storage.add(dataElementField06);
			storage.add(dataElementField07);
			storage.add(dataElementField08);
			storage.add(dataElementField09);
			storage.add(dataElementField10);
			storage.add(dataElementField11);
			
			DataElementRuleHeader de035HeaderRule = new DE035RuleHeaderImpl(id, storage);
			
			return de035HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de035RuleHeader = new CreateDE035RuleHeader().createDE035RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de035RuleHeader,fieldList,codeList);
		
		}
}
