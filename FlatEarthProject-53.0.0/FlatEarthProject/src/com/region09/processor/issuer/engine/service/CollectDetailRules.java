package com.region09.processor.issuer.engine.service;

import static com.system.configuration.constants.Element.*;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import com.system.message.base.element.DataElement;
import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.element.impl.DE001Impl;

public class CollectDetailRules {

	private ArrayList<ArrayList<Facet>> ruleCollection = new ArrayList<ArrayList<Facet>>(); 
	
	private static int idSequence = 0;
	
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public int convertValueString( String valueString ) {
		
		if (valueString == null || valueString.length() > 12) valueString = "0";
		
		return Integer.parseInt(valueString);
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public int convertFireBoolean( boolean ruleFire ) {
		
		if ( ruleFire )
			return RULE_FIRED;
		else
			return RULE_NOT_FIRED;
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public List<ArrayList<Facet>> collectRules ( List<DataElementRuleDetail> 	ruleDetailList
							 		           , List<DataElement> 				dataElementList
							 		  		   ) {
		
		BitSet bitMap = new DE001Impl().getBitMap();
		
		ArrayList<Facet> row = null;
 
		for (int fieldIndex = 0; fieldIndex < dataElementList.size(); fieldIndex++) {	 
			
			if (bitMap.get(fieldIndex)) {

				int numberOfSubfields = dataElementList.get(fieldIndex).getStorage().size();
				
				for (int subfieldIndex = 0; subfieldIndex < numberOfSubfields; subfieldIndex++ ) {
					 
//					-----------------------------------------------------------------------------------------------------------------------------
//					Rule Header Attributes					
//					-----------------------------------------------------------------------------------------------------------------------------
//					int ruleId 							= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getId();
//					int ruleField 						= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getField();
//					int ruleSubfield 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getSubField();
//					int ruleFire 						= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getFire();
//					int ruleFormat 						= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getFormat();
//					int ruleMinLength 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getMinimumLength();
//					int ruleMaxLength 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getMaximumLength();
//					int ruleEncoding 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getEncoding();
//					int ruleDataType 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getDataType();
//					int ruleSource 						= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getSource();
//					int ruleDirection 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getDirection();
//					int ruleExistence 					= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getExistence();
//					int ruleChange 						= ruleHeaderList.get(dataElement).getStorage().get(subfieldIndex).getChange();
//					-----------------------------------------------------------------------------------------------------------------------------
//					Rule Detail Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
					int ruleId 							= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
					int ruleField 						= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
					int ruleSubfield 					= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
					boolean ruleFire 					= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).isFire();
					int ruleType 						= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getType();
					int ruleGroup 						= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getGroup();
					int ruleSequence  					= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getSequence();
					int rulePointer 					= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getPointer();	
					int ruleValue 						= ruleDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getValue();
//					-----------------------------------------------------------------------------------------------------------------------------	
//					Request Elements Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
					int id 								= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
					int field 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
					int subfield 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
//					int format 							= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getFormat();
//					int length 							= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getLength();
//					int encoding 						= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getEncoding();
//					int dataType 						= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getDataType();
//					int source 							= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getSource();
//					int direction 						= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getDirection();
//					int existence 						= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getExistence();
//					int change 							= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getChange();
					String value 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getValue();
//					-----------------------------------------------------------------------------------------------------------------------------	
//					Result Header Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
//					int validateRuleId 					= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getId();
//					int validateRuleField 				= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getField();
//					int validateRuleSubfield 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getSubField();
//					int validateRuleFire 				= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getFire();
//					int validateRuleFormat 				= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getFormat();
//					int validateRuleMinLength 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getMinimumLength();
//					int validateRuleMaxLength 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getMaximumLength();
//					int validateRuleEncoding 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getEncoding();
//					int validateRuleDataType 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getDataType();
//					int validateRuleSource 				= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getSource();
//					int validateRuleDirection 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getDirection();
//					int validateRuleExistence 			= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getExistence();
//					int validateRuleChange 				= validateHeaderList.get(dataElement).getStorage().get(subfieldIndex).getChange();
//					-----------------------------------------------------------------------------------------------------------------------------
//					Result Detail Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
//					int validateRuleId 					= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
//					int validateRuleField 				= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
//					int validateRuleSubfield 			= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
//					int validateRuleFire 				= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getFire();
//					int validateRuleType 				= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getType();
//					int validateRuleGroup 				= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getGroup();
//					int validateRuleSequence 			= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getSequence();									
//					int validateRulePointer 			= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getPointer();		
//					int validateRuleValue 				= validateDetailList.get(fieldIndex).getStorage().get(subfieldIndex).getValue();	
//					-----------------------------------------------------------------------------------------------------------------------------
					int valueNbr 						= new CollectDetailRules().convertValueString(value);	
					int ruleFireNbr 					= new CollectDetailRules().convertFireBoolean(ruleFire);
//					-----------------------------------------------------------------------------------------------------------------------------
					row = new ArrayList<Facet>();
//					-----------------------------------------------------------------------------------------------------------------------------
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleId		, id		)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleField		, field		)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleSubfield	, subfield	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleFire		, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleId		, id		)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleField		, field		)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleSubfield	, subfield	)	);					
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleFireNbr	, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleType		, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleGroup		, 0			)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleFormat	, format	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleMinLength	, length	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleMaxLength	, length	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleEncoding	, encoding	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleDataType	, dataType	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleSource	, source	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleDirection	, direction	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleExistence	, existence	)	);
//					row.add(new Attribute(idSequence++, fieldIndex, subfieldIndex,ruleChange	, change	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleSequence	, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,rulePointer	, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,ruleValue		, valueNbr	)	);
//					-----------------------------------------------------------------------------------------------------------------------------
					
					ruleCollection.add(row);
					
				} 				
			}  
		}  
		return ruleCollection;
	}
}
