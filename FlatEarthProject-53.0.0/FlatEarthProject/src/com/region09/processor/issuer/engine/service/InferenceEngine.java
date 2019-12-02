package com.region09.processor.issuer.engine.service;

import java.util.ArrayList;
import java.util.List;

import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.DisplayUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;
import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.header.DataElementRuleHeader;

import static com.system.configuration.constants.Element.*;

public class InferenceEngine {

	private static int index = 0;
	
	/*********************************************************************
	 *********************************************************************
	 */
	public List<DataElementRuleDetail> markFiredDetailRules ( List<ArrayList<Differentia>> 	validatedDetailList
														    , List<DataElementRuleDetail>	ruleDetailList
														    ) {
		
		index = 0;
		boolean misFired = false;
		
		int element = 0;
		int subElement = 0;
		
		for (int elementIndex = 0; elementIndex < validatedDetailList.size(); elementIndex++) {
			
			int maxSubElements = validatedDetailList.get(elementIndex).size();
			
			for (int subElementIndex = 0; subElementIndex < maxSubElements; subElementIndex++) {
			    
				Differentia attribute	= validatedDetailList.get(elementIndex).get(subElementIndex);
				element = attribute.getElement();
				subElement = attribute.getSubElement();
				
				if ( attribute.getResultItem() % 2 == RULE_HAS_MISFIRED) {
					//new DisplayUtils().display3 ("Miss fired = ",index++, element, subElement, attribute );
					misFired = true;
					break;
				} else {
					//new DisplayUtils().display3 ("Fired    = ",index++, element, subElement, attribute );
					misFired = false;
				}
				
			}
			
			if ( misFired )
			{
				ruleDetailList.get(element).getStorage().get(subElement).setFire(false);
			} else {
				ruleDetailList.get(element).getStorage().get(subElement).setFire(true);
			}

			//System.out.println("-----------------------------------------------------------------------------");
		}
		 
		return ruleDetailList;
		
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public List<ArrayList<Differentia>> validateDetailList (List<ArrayList<Facet>> request ) {
		
		List<ArrayList<Differentia>> validatedDetailList = new ArrayList<ArrayList<Differentia>>();
		
		index = 0;
		
		for (int elementIndex = 0; elementIndex < request.size(); elementIndex++) {
			
			int jMax = request.get(elementIndex).size();
			
			for (int j = 0; elementIndex < jMax; j++) {
			
				Facet 		unvalidatedAttribute	= request.get(elementIndex).get(j);
				Differentia validatedAttribute 		= new BuiltinRoutines().moveActions[index++].move(unvalidatedAttribute);
				
				validatedDetailList.get(j).add(validatedAttribute);
			}
			
		}
			
		return validatedDetailList;
		
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public List<ArrayList<Differentia>> processRuleDetail ( List<ArrayList<Facet>>		requestDetail
								  						  , List<DataElementRuleDetail>	ruleDetailList 
								  						  ) {
		
		// all three detail types combined
		List<ArrayList<Differentia>> validatedDetailList = validateDetailList( requestDetail );
		new DisplayUtils().displayDifferentiaList (true, validatedDetailList);
		
		// validateDetailList is static  & summarize the rule fires after built ins routine execution
		//List<DataElementRuleDetail> markFiredDetailRules = markFiredDetailRules ( validatedDetailList, ruleDetailList );
		//new RuleDetailUtils().display (markFiredDetailRules);
		
		return null;
		
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public List<DataElementRuleHeader> markFiredHeaderRules ( List<ArrayList<Differentia>> 	validatedHeaderList
														    , List<DataElementRuleHeader>	ruleHeaderList
														    ) {
		
		index = 0;
		boolean misFired = false;
		
		int element = 0;
		int subElement = 0;
		
		for (int elementIndex = 0; elementIndex < validatedHeaderList.size(); elementIndex++) {
			
			int maxSubElements = validatedHeaderList.get(elementIndex).size();
			
			for (int subElementIndex = 0; subElementIndex < maxSubElements; subElementIndex++) {
			    
				Differentia attribute	= validatedHeaderList.get(elementIndex).get(subElementIndex);
				element = attribute.getElement();
				subElement = attribute.getSubElement();
				
				if ( attribute.getResultItem() % 2 == RULE_HAS_MISFIRED) {
					 
					misFired = true;
					break;
					
				} else {
					 
					misFired = false;
					
				}
				
			}
			
			if ( misFired )
			{
				ruleHeaderList.get(element).getStorage().get(subElement).setFire(false);
			} else {
				ruleHeaderList.get(element).getStorage().get(subElement).setFire(true);
			}

		}
		 
		return ruleHeaderList;
		
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public List<ArrayList<Differentia>> validateHeaderList (List<ArrayList<Facet>> request ) {
		
		List<ArrayList<Differentia>> validatedHeaderList = new ArrayList<ArrayList<Differentia>>();
		
		index = 0;
		
		for (int elementIndex = 0; elementIndex < request.size(); elementIndex++) {
			
			int maxSubElements = request.get(elementIndex).size();
			
			ArrayList<Differentia> validatedElementEntry = new ArrayList<Differentia>();
			
			for (int subElementIndex = 0; subElementIndex < maxSubElements; subElementIndex++) {
			    
				Facet 		unvalidatedAttribute 	= request.get(elementIndex).get(subElementIndex);
				Differentia validatedAttribute 		= new PrimtiveRoutines().moveActions[index++].move(unvalidatedAttribute);
				
				validatedElementEntry.add(validatedAttribute);
				
				new DisplayUtils().displayFacet(false, unvalidatedAttribute);
				new DisplayUtils().displayDifferentia(false, validatedAttribute);
				
			}

			validatedHeaderList.add(validatedElementEntry);
			
		}
		
		return validatedHeaderList;
		
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public List<ArrayList<Differentia>> processRuleHeader ( List<ArrayList<Facet>>		requestHeader
								    				      , List<DataElementRuleHeader>	ruleHeaderList 
														  ) {
		
		// Now have rule, element, result
		List<ArrayList<Differentia>> validatedHeaderList = validateHeaderList( requestHeader );
		
		// Summarize validatedHeaderList results into ruleHeaderList
		List<DataElementRuleHeader> markFiredHeaderRules = markFiredHeaderRules ( validatedHeaderList, ruleHeaderList );
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleHeaderUtils().display ( markFiredHeaderRules, fieldList,codeList );
		
		return validatedHeaderList;
		
	}
	
}
