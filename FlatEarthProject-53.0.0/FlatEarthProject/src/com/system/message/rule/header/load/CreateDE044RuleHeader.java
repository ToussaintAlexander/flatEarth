package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE044RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE044RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE044RuleHeader  {

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
	public DataElementRuleHeaderField getDataElementRuleField01a() {
	
		DataElementRuleHeaderField dataElementField01a 	 
		
			= new DataElementRuleHeaderField ( 
											   RESPONSE_SOURCE_044_RULE_HEADER_ID
											 , RESPONSE_SOURCE_044_RULE_HEADER_FIELD
											 , RESPONSE_SOURCE_044_RULE_HEADER_SUBFIELD
											 , RESPONSE_SOURCE_044_RULE_HEADER_FIRE		
											 , RESPONSE_SOURCE_044_RULE_HEADER_FORMAT
											 , RESPONSE_SOURCE_044_RULE_HEADER_MINIMUM_LENGTH
											 , RESPONSE_SOURCE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , RESPONSE_SOURCE_044_RULE_HEADER_ENCODING
											 , RESPONSE_SOURCE_044_RULE_HEADER_DATATYPE
											 , RESPONSE_SOURCE_044_RULE_HEADER_SOURCE
											 , RESPONSE_SOURCE_044_RULE_HEADER_DIRECTION
											 , RESPONSE_SOURCE_044_RULE_HEADER_EXISTENCE
											 , RESPONSE_SOURCE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01a;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01b() {
	
		DataElementRuleHeaderField dataElementField01b 	 
		
			= new DataElementRuleHeaderField ( 
											   ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_ID
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FIELD
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_SUBFIELD
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FIRE		
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_FORMAT
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_MINIMUM_LENGTH
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_ENCODING
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_DATATYPE
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_SOURCE
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_DIRECTION
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_EXISTENCE
											 , ADDRESS_VERIFICATION_RESULT_CODE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01b;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01c() {
	
		DataElementRuleHeaderField dataElementField01c 	 
		
			= new DataElementRuleHeaderField ( 
											   CVV_RESULTS_CODE_044_RULE_HEADER_ID
											 , CVV_RESULTS_CODE_044_RULE_HEADER_FIELD
											 , CVV_RESULTS_CODE_044_RULE_HEADER_SUBFIELD
											 , CVV_RESULTS_CODE_044_RULE_HEADER_FIRE		
											 , CVV_RESULTS_CODE_044_RULE_HEADER_FORMAT
											 , CVV_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH
											 , CVV_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , CVV_RESULTS_CODE_044_RULE_HEADER_ENCODING
											 , CVV_RESULTS_CODE_044_RULE_HEADER_DATATYPE
											 , CVV_RESULTS_CODE_044_RULE_HEADER_SOURCE
											 , CVV_RESULTS_CODE_044_RULE_HEADER_DIRECTION
											 , CVV_RESULTS_CODE_044_RULE_HEADER_EXISTENCE
											 , CVV_RESULTS_CODE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01c;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01d() {
	
		DataElementRuleHeaderField dataElementField01d 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_ID
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FIELD
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_SUBFIELD
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FIRE		
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_FORMAT
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_ENCODING
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_DATATYPE
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_SOURCE
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_DIRECTION
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_EXISTENCE
											 , CARD_AUTHENTICATION_RESULTS_CODE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01d;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01e() {
	
		DataElementRuleHeaderField dataElementField01e 	 
		
			= new DataElementRuleHeaderField ( 
											   CVV2_RESULTS_CODE_044_RULE_HEADER_ID
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_FIELD
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_SUBFIELD
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_FIRE		
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_FORMAT
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_ENCODING
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_DATATYPE
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_SOURCE
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_DIRECTION
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_EXISTENCE
											 , CVV2_RESULTS_CODE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01e;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField01f() {
	
		DataElementRuleHeaderField dataElementField01f 	 
		
			= new DataElementRuleHeaderField ( 
											   CAVV_RESULTS_CODE_044_RULE_HEADER_ID
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_FIELD
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_SUBFIELD
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_FIRE		
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_FORMAT
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_MINIMUM_LENGTH
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_MAXIMUM_LENGTH
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_ENCODING
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_DATATYPE
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_SOURCE
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_DIRECTION
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_EXISTENCE
											 , CAVV_RESULTS_CODE_044_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01f;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE044RuleHeader () {
			
			int id = 44000;
			
			DataElementRuleHeaderField dataElementField01a = getDataElementRuleField01a();
			DataElementRuleHeaderField dataElementField01b = getDataElementRuleField01b();
			DataElementRuleHeaderField dataElementField01c = getDataElementRuleField01c();
			DataElementRuleHeaderField dataElementField01d = getDataElementRuleField01d();
			DataElementRuleHeaderField dataElementField01e = getDataElementRuleField01e();
			DataElementRuleHeaderField dataElementField01f = getDataElementRuleField01f();
			
			storage.add(dataElementField01a);
			storage.add(dataElementField01b);
			storage.add(dataElementField01c);
			storage.add(dataElementField01d);
			storage.add(dataElementField01e);
			storage.add(dataElementField01f);
			
			DataElementRuleHeader de044HeaderRule = new DE044RuleHeaderImpl(id, storage);
			
			return de044HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de044RuleHeader = new CreateDE044RuleHeader().createDE044RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de044RuleHeader,fieldList,codeList);
		
		}
}
