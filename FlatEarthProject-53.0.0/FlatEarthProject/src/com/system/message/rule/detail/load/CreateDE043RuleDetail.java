package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE043RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE043RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE043RuleDetail  {

	DataElementRuleDetailField cardAcceptorNameLocationAddressRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_ADDRESS_043_RULE_DETAIL_MT
	  		  	       	                 );

	DataElementRuleDetailField cardAcceptorNameLocationCityRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_CITY_043_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardAcceptorNameLocationStateRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_STATE_043_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardAcceptorNameLocationCountryRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_ID
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_FIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_SUBFIELD
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_FIRE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_TYPE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_GROUP
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_BL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_AL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_TL
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_SEQUENCE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_POINTER
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_VALUE
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_CU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_CT
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_MU
		                                 , CARD_ACCEPTOR_NAME_LOCATION_COUNTRY_043_RULE_DETAIL_MT
	  		  	       	                 );
	
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE043RuleDetail() {
			
			int id = 43000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(cardAcceptorNameLocationAddressRuleField);
			storage.add(cardAcceptorNameLocationCityRuleField);
			storage.add(cardAcceptorNameLocationStateRuleField);
			storage.add(cardAcceptorNameLocationCountryRuleField);
			
			DataElementRuleDetail de043RuleDetail = new DE043RuleDetailImpl(id, storage);
			
			return de043RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de043RuleDetail = new CreateDE043RuleDetail().createDE043RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de043RuleDetail, fieldList,codeList );
		
		}
}
