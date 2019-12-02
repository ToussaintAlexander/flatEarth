package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE062RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE062RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE062RuleHeader  {

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
											   FIELD_BITMAP_062_RULE_HEADER_ID
											 , FIELD_BITMAP_062_RULE_HEADER_FIELD
											 , FIELD_BITMAP_062_RULE_HEADER_SUBFIELD
											 , FIELD_BITMAP_062_RULE_HEADER_FIRE		
											 , FIELD_BITMAP_062_RULE_HEADER_FORMAT
											 , FIELD_BITMAP_062_RULE_HEADER_MINIMUM_LENGTH
											 , FIELD_BITMAP_062_RULE_HEADER_MAXIMUM_LENGTH
											 , FIELD_BITMAP_062_RULE_HEADER_ENCODING
											 , FIELD_BITMAP_062_RULE_HEADER_DATATYPE
											 , FIELD_BITMAP_062_RULE_HEADER_SOURCE
											 , FIELD_BITMAP_062_RULE_HEADER_DIRECTION
											 , FIELD_BITMAP_062_RULE_HEADER_EXISTENCE
											 , FIELD_BITMAP_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   AUTH_CHAR_INDICATOR_062_RULE_HEADER_ID
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_FIELD
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_SUBFIELD
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_FIRE		
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_FORMAT
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_MINIMUM_LENGTH
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_MAXIMUM_LENGTH
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_ENCODING
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_DATATYPE
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_SOURCE
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_DIRECTION
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_EXISTENCE
											 , AUTH_CHAR_INDICATOR_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   TRANS_IDENTIFIER_062_RULE_HEADER_ID
											 , TRANS_IDENTIFIER_062_RULE_HEADER_FIELD
											 , TRANS_IDENTIFIER_062_RULE_HEADER_SUBFIELD
											 , TRANS_IDENTIFIER_062_RULE_HEADER_FIRE		
											 , TRANS_IDENTIFIER_062_RULE_HEADER_FORMAT
											 , TRANS_IDENTIFIER_062_RULE_HEADER_MINIMUM_LENGTH
											 , TRANS_IDENTIFIER_062_RULE_HEADER_MAXIMUM_LENGTH
											 , TRANS_IDENTIFIER_062_RULE_HEADER_ENCODING
											 , TRANS_IDENTIFIER_062_RULE_HEADER_DATATYPE
											 , TRANS_IDENTIFIER_062_RULE_HEADER_SOURCE
											 , TRANS_IDENTIFIER_062_RULE_HEADER_DIRECTION
											 , TRANS_IDENTIFIER_062_RULE_HEADER_EXISTENCE
											 , TRANS_IDENTIFIER_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_ID
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FIELD
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_SUBFIELD
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FIRE		
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_FORMAT
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_MINIMUM_LENGTH
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_MAXIMUM_LENGTH
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_ENCODING
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_DATATYPE
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_SOURCE
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_DIRECTION
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_EXISTENCE
											 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   MERCHANT_VV_062_RULE_HEADER_ID
											 , MERCHANT_VV_062_RULE_HEADER_FIELD
											 , MERCHANT_VV_062_RULE_HEADER_SUBFIELD
											 , MERCHANT_VV_062_RULE_HEADER_FIRE		
											 , MERCHANT_VV_062_RULE_HEADER_FORMAT
											 , MERCHANT_VV_062_RULE_HEADER_MINIMUM_LENGTH
											 , MERCHANT_VV_062_RULE_HEADER_MAXIMUM_LENGTH
											 , MERCHANT_VV_062_RULE_HEADER_ENCODING
											 , MERCHANT_VV_062_RULE_HEADER_DATATYPE
											 , MERCHANT_VV_062_RULE_HEADER_SOURCE
											 , MERCHANT_VV_062_RULE_HEADER_DIRECTION
											 , MERCHANT_VV_062_RULE_HEADER_EXISTENCE
											 , MERCHANT_VV_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_LEVEL_RESULTS_062_RULE_HEADER_ID
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_FIELD
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_SUBFIELD
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_FIRE		
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_FORMAT
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_ENCODING
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_DATATYPE
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_SOURCE
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_DIRECTION
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_EXISTENCE
											 , CARD_LEVEL_RESULTS_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07 	 
		
			= new DataElementRuleHeaderField ( 
											   PROGRAM_IDENTIFIER_062_RULE_HEADER_ID
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_FIELD
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_SUBFIELD
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_FIRE		
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_FORMAT
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_MINIMUM_LENGTH
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_MAXIMUM_LENGTH
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_ENCODING
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_DATATYPE
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_SOURCE
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_DIRECTION
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_EXISTENCE
											 , PROGRAM_IDENTIFIER_062_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE062RuleHeader () {
			
			int id = 62000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			DataElementRuleHeaderField dataElementField06 = getDataElementRuleField06();
			DataElementRuleHeaderField dataElementField07 = getDataElementRuleField07();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			storage.add(dataElementField06);
			storage.add(dataElementField07);
			
			DataElementRuleHeader de062HeaderRule = new DE062RuleHeaderImpl(id, storage);
			
			return de062HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de062RuleHeader = new CreateDE062RuleHeader().createDE062RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de062RuleHeader,fieldList,codeList);
		
		}
}
		
