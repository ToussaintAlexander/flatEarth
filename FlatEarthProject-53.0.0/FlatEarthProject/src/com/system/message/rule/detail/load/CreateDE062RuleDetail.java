package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE062RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE062RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE062RuleDetail  {

	DataElementRuleDetailField fieldBitmapRuleField 	 

		= new DataElementRuleDetailField ( 
									       FIELD_BITMAP_062_RULE_DETAIL_ID
		                                 , FIELD_BITMAP_062_RULE_DETAIL_FIELD
		                                 , FIELD_BITMAP_062_RULE_DETAIL_SUBFIELD
		                                 , FIELD_BITMAP_062_RULE_DETAIL_FIRE
		                                 , FIELD_BITMAP_062_RULE_DETAIL_TYPE
		                                 , FIELD_BITMAP_062_RULE_DETAIL_GROUP
		                                 , FIELD_BITMAP_062_RULE_DETAIL_BL
		                                 , FIELD_BITMAP_062_RULE_DETAIL_AL
		                                 , FIELD_BITMAP_062_RULE_DETAIL_TL
		                                 , FIELD_BITMAP_062_RULE_DETAIL_SEQUENCE
		                                 , FIELD_BITMAP_062_RULE_DETAIL_POINTER
		                                 , FIELD_BITMAP_062_RULE_DETAIL_VALUE
		                                 , FIELD_BITMAP_062_RULE_DETAIL_CU
		                                 , FIELD_BITMAP_062_RULE_DETAIL_CT
		                                 , FIELD_BITMAP_062_RULE_DETAIL_MU
		                                 , FIELD_BITMAP_062_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField authCharIndicatorRuleField 	 

		= new DataElementRuleDetailField ( 
									       AUTH_CHAR_INDICATOR_062_RULE_DETAIL_ID
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_FIELD
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_SUBFIELD
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_FIRE
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_TYPE
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_GROUP
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_BL
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_AL
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_TL
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_SEQUENCE
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_POINTER
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_VALUE
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_CU
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_CT
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_MU
		                                 , AUTH_CHAR_INDICATOR_062_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField transIdentifierRuleField 	 

		= new DataElementRuleDetailField ( 
									       TRANS_IDENTIFIER_062_RULE_DETAIL_ID
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_FIELD
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_SUBFIELD
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_FIRE
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_TYPE
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_GROUP
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_BL
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_AL
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_TL
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_SEQUENCE
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_POINTER
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_VALUE
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_CU
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_CT
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_MU
		                                 , TRANS_IDENTIFIER_062_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField marketSpecificDataIdtfrRuleField 	 

		= new DataElementRuleDetailField ( 
									       MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_ID
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_FIELD
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_SUBFIELD
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_FIRE
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_TYPE
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_GROUP
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_BL
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_AL
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_TL
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_SEQUENCE
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_POINTER
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_VALUE
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_CU
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_CT
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_MU
		                                 , MARKET_SPECIFIC_DATA_IDTFR_062_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField merchantVVRuleField 	 

		= new DataElementRuleDetailField ( 
									       MERCHANT_VV_062_RULE_DETAIL_ID
		                                 , MERCHANT_VV_062_RULE_DETAIL_FIELD
		                                 , MERCHANT_VV_062_RULE_DETAIL_SUBFIELD
		                                 , MERCHANT_VV_062_RULE_DETAIL_FIRE
		                                 , MERCHANT_VV_062_RULE_DETAIL_TYPE
		                                 , MERCHANT_VV_062_RULE_DETAIL_GROUP
		                                 , MERCHANT_VV_062_RULE_DETAIL_BL
		                                 , MERCHANT_VV_062_RULE_DETAIL_AL
		                                 , MERCHANT_VV_062_RULE_DETAIL_TL
		                                 , MERCHANT_VV_062_RULE_DETAIL_SEQUENCE
		                                 , MERCHANT_VV_062_RULE_DETAIL_POINTER
		                                 , MERCHANT_VV_062_RULE_DETAIL_VALUE
		                                 , MERCHANT_VV_062_RULE_DETAIL_CU
		                                 , MERCHANT_VV_062_RULE_DETAIL_CT
		                                 , MERCHANT_VV_062_RULE_DETAIL_MU
		                                 , MERCHANT_VV_062_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField cardLevelResultsRuleField 	 

		= new DataElementRuleDetailField ( 
									       CARD_LEVEL_RESULTS_062_RULE_DETAIL_ID
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_FIELD
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_SUBFIELD
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_FIRE
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_TYPE
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_GROUP
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_BL
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_AL
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_TL
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_SEQUENCE
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_POINTER
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_VALUE
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_CU
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_CT
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_MU
		                                 , CARD_LEVEL_RESULTS_062_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField programIdentifierRuleField 	 

		= new DataElementRuleDetailField ( 
									       PROGRAM_IDENTIFIER_062_RULE_DETAIL_ID
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_FIELD
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_SUBFIELD
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_FIRE
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_TYPE
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_GROUP
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_BL
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_AL
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_TL
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_SEQUENCE
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_POINTER
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_VALUE
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_CU
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_CT
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_MU
		                                 , PROGRAM_IDENTIFIER_062_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE062RuleDetail() {
			
			int id = 62000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(fieldBitmapRuleField);
			storage.add(authCharIndicatorRuleField);
			storage.add(transIdentifierRuleField);
			storage.add(marketSpecificDataIdtfrRuleField);
			storage.add(merchantVVRuleField);
			storage.add(cardLevelResultsRuleField);
			storage.add(programIdentifierRuleField);
			
			DataElementRuleDetail de062RuleDetail = new DE062RuleDetailImpl(id, storage);
			
			return de062RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de062RuleDetail = new CreateDE062RuleDetail().createDE062RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de062RuleDetail, fieldList,codeList );
		
		}
}
