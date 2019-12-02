package com.system.message.element.load;

import static com.system.message.element.DE044.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE044Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE044  {

	DataElementField responseSourceField 
	
		= new DataElementField ( RESPONSE_SOURCE_044_ID	
						       , RESPONSE_SOURCE_044_FIELD						 	 
						       , RESPONSE_SOURCE_044_SUBFIELD					 
						       , RESPONSE_SOURCE_044_FORMAT						 	
						       , RESPONSE_SOURCE_044_LENGTH						   	 
						       , RESPONSE_SOURCE_044_ENCODING					 
						       , RESPONSE_SOURCE_044_DATATYPE					 
						       , RESPONSE_SOURCE_044_SOURCE						 
						       , RESPONSE_SOURCE_044_DIRECTION					 
						       , RESPONSE_SOURCE_044_EXISTENCE					 
						       , RESPONSE_SOURCE_044_CHANGE						 
						       , RESPONSE_SOURCE_044_VALUE	
							   );

	//----------------------------------------------------------------------------------------------

	DataElementField addressVerificationResultCodeField 
	
		= new DataElementField ( ADDRESS_VERIFICATION_RESULT_CODE_044_ID	
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_FIELD		 	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_SUBFIELD	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_FORMAT		 	
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_LENGTH		    	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_ENCODING	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_DATATYPE	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_SOURCE		 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_DIRECTION	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_EXISTENCE	 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_CHANGE		 
						       , ADDRESS_VERIFICATION_RESULT_CODE_044_VALUE		 
							   );

	//----------------------------------------------------------------------------------------------

	DataElementField cvvResultsCodeField 
	
		= new DataElementField ( CVV_RESULTS_CODE_044_ID	
							   , CVV_RESULTS_CODE_044_FIELD						 	 
							   , CVV_RESULTS_CODE_044_SUBFIELD					 
							   , CVV_RESULTS_CODE_044_FORMAT						 	
							   , CVV_RESULTS_CODE_044_LENGTH						    	 
							   , CVV_RESULTS_CODE_044_ENCODING					 
							   , CVV_RESULTS_CODE_044_DATATYPE					 
							   , CVV_RESULTS_CODE_044_SOURCE						 
							   , CVV_RESULTS_CODE_044_DIRECTION					 
							   , CVV_RESULTS_CODE_044_EXISTENCE					 
							   , CVV_RESULTS_CODE_044_CHANGE						 
							   , CVV_RESULTS_CODE_044_VALUE						 
							   );

	//----------------------------------------------------------------------------------------------

	DataElementField cardAuthenticationResultsCodeField 
	
		= new DataElementField ( CARD_AUTHENTICATION_RESULTS_CODE_044_ID	
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_FIELD		 	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_SUBFIELD	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_FORMAT		 	
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_LENGTH		    	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_ENCODING	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_DATATYPE	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_SOURCE		 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_DIRECTION	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_EXISTENCE	 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_CHANGE		 
							   , CARD_AUTHENTICATION_RESULTS_CODE_044_VALUE		 
							   );

	//----------------------------------------------------------------------------------------------

	DataElementField cvv2REsultsCodeField 
	
		= new DataElementField ( CVV2_RESULTS_CODE_044_ID	
							   , CVV2_RESULTS_CODE_044_FIELD						 	 
							   , CVV2_RESULTS_CODE_044_SUBFIELD					 
							   , CVV2_RESULTS_CODE_044_FORMAT					 	
							   , CVV2_RESULTS_CODE_044_LENGTH					    	 
							   , CVV2_RESULTS_CODE_044_ENCODING					 
							   , CVV2_RESULTS_CODE_044_DATATYPE					 
							   , CVV2_RESULTS_CODE_044_SOURCE					 
							   , CVV2_RESULTS_CODE_044_DIRECTION					 
							   , CVV2_RESULTS_CODE_044_EXISTENCE					 
							   , CVV2_RESULTS_CODE_044_CHANGE					 
							   , CVV2_RESULTS_CODE_044_VALUE						 
						       );
	
	//----------------------------------------------------------------------------------------------

	DataElementField cavvResultsCodeField 
	
		= new DataElementField ( CAVV_RESULTS_CODE_044_ID	
						       , CAVV_RESULTS_CODE_044_FIELD						 	 
						       , CAVV_RESULTS_CODE_044_SUBFIELD					 
						       , CAVV_RESULTS_CODE_044_FORMAT					 	
						       , CAVV_RESULTS_CODE_044_LENGTH					    	 
						       , CAVV_RESULTS_CODE_044_ENCODING					 
						       , CAVV_RESULTS_CODE_044_DATATYPE					 
						       , CAVV_RESULTS_CODE_044_SOURCE					 
						       , CAVV_RESULTS_CODE_044_DIRECTION					 
						       , CAVV_RESULTS_CODE_044_EXISTENCE					 
						       , CAVV_RESULTS_CODE_044_CHANGE					 
						       , CAVV_RESULTS_CODE_044_VALUE						 
							   );
	
	public DE044Impl createDE044() {
		
		int id = 44000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		
		storage.add(responseSourceField);
		storage.add(addressVerificationResultCodeField);
		storage.add(cvvResultsCodeField);
		storage.add(cardAuthenticationResultsCodeField);
		storage.add(cvv2REsultsCodeField);
		storage.add(cavvResultsCodeField);
		
		DE044Impl de044 = new DE044Impl(id, storage);
		
		return de044;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE044 createDE044 = new CreateDE044(); 
		
		DE044Impl de044	= createDE044.createDE044(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de044, fieldList,codeList );
	
	}
}
