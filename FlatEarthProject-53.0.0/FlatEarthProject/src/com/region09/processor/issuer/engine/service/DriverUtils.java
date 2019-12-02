package com.region09.processor.issuer.engine.service;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElement;
import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.utilties.message.DisplayUtils;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

public class DriverUtils {
	
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public static void main(String[] args) {

		List<DataElement> 				dataElementList		= new ElementUtils().buildTransaction();
		
		List<DataElementRuleHeader> 	ruleHeaderList 		= new RuleHeaderUtils().buildRuleHeaders();
		List<DataElementRuleDetail> 	ruleDetailList 		= new RuleDetailUtils().buildRuleDetails();
		
		List<ArrayList<Facet>> 			requestHeader 		= null;
		List<ArrayList<Differentia>> 	responseHeader 		= null;
		List<ArrayList<Facet>> 			requestDetail 		= null;
//		List<ArrayList<Differentia>> 	responseDetail 		= null;
		//------------------------------------------------------------
		//------------------------------------------------------------
		requestHeader 
		 
			= new CollectHeaderRules().collectRules ( ruleHeaderList
							                        , dataElementList
							   		                ); 
			
		new DisplayUtils().displayFacetList(false, requestHeader);
		//------------------------------------------------------------
		//------------------------------------------------------------
		responseHeader 
		
			= new InferenceEngine().processRuleHeader ( requestHeader
										              , ruleHeaderList
										   	   	      );
			
		new DisplayUtils().displayDifferentiaList(false, responseHeader);
		//------------------------------------------------------------
		//------------------------------------------------------------
		requestDetail 
		 
			= new CollectDetailRules().collectRules ( ruleDetailList
						                            , dataElementList
						   		                	); 
			
		new DisplayUtils().displayFacetList(true, requestDetail);
		//------------------------------------------------------------
		//------------------------------------------------------------
//		responseDetail 
	
//			= new InferenceEngine().processRuleDetail ( requestDetail
//									                  , ruleDetailList
//													  );
			
//		new DisplayUtils().displayDifferentiaList(false, responseDetail);
	}
}