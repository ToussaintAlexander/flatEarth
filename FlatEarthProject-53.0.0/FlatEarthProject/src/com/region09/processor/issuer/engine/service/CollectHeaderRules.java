package com.region09.processor.issuer.engine.service;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import com.system.message.base.element.DataElement;
import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.element.impl.DE001Impl;

import static com.system.configuration.constants.Element.*;

public class CollectHeaderRules {

	private ArrayList<ArrayList<Facet>> ruleCollection = new ArrayList<ArrayList<Facet>>(); 
	
	private static int idSequence = 0;
	
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
//	public int convertValueString( String valueString ) {
		
//		if (valueString == null || valueString.length() > 12) valueString = "0";
		
//		return Integer.parseInt(valueString);
		
//	}
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
	public List<ArrayList<Facet>> collectRules ( List<DataElementRuleHeader> 	ruleHeaderList
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
					int ruleId 							= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
					int ruleField 						= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
					int ruleSubfield 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
					boolean ruleFire 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getFire();
					int ruleFormat 						= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getFormat();
					int ruleMinLength 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getMinimumLength();
					int ruleMaxLength 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getMaximumLength();
					int ruleEncoding 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getEncoding();
					int ruleDataType 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getDataType();
					int ruleSource 						= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getSource();
					int ruleDirection 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getDirection();
					int ruleExistence 					= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getExistence();
					int ruleChange 						= ruleHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getChange();
//					-----------------------------------------------------------------------------------------------------------------------------
//					Rule Detail Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
//					int ruleId 							= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getId();
//					int ruleField 						= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getField();
//					int ruleSubfield 					= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getSubField();
//					int ruleFire 						= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getFire();
//					int ruleType 						= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getType();
//					int ruleGroup 						= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getGroup();
//					int ruleSequence  					= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getSequence();
//					int rulePointer 					= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getPointer();	
//					int ruleValue 						= ruleDetailList.get(dataElement).getStorage().get(subfieldIndex).getValue();
//					-----------------------------------------------------------------------------------------------------------------------------	
//					Request Elements Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
					int id 								= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
					int field 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
					int subfield 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
					int format 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getFormat();
					int length 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getLength();
					int encoding 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getEncoding();
					int dataType 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getDataType();
					int source 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getSource();
					int direction 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getDirection();
					int existence 						= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getExistence();
					int change 							= dataElementList.get(fieldIndex).getStorage().get(subfieldIndex).getChange();
//					String value 						= dataElementList.get(dataElement).getStorage().get(subfieldIndex).getValue();
//					-----------------------------------------------------------------------------------------------------------------------------	
//					Result Header Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
//					int validateRuleId 					= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getId();
//					int validateRuleField 				= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getField();
//					int validateRuleSubfield 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getSubField();
//					int validateRuleFire 				= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getFire();
//					int validateRuleFormat 				= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getFormat();
//					int validateRuleMinLength 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getMinimumLength();
//					int validateRuleMaxLength 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getMaximumLength();
//					int validateRuleEncoding 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getEncoding();
//					int validateRuleDataType 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getDataType();
//					int validateRuleSource 				= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getSource();
//					int validateRuleDirection 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getDirection();
//					int validateRuleExistence 			= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getExistence();
//					int validateRuleChange 				= validateHeaderList.get(fieldIndex).getStorage().get(subfieldIndex).getChange();
//					-----------------------------------------------------------------------------------------------------------------------------
//					Result Detail Attributes						
//					-----------------------------------------------------------------------------------------------------------------------------
//					int validateRuleId 					= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getId();
//					int validateRuleField 				= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getField();
//					int validateRuleSubfield 			= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getSubField();
//					int validateRuleFire 				= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getFire();
//					int validateRuleType 				= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getType();
//					int validateRuleGroup 				= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getGroup();
//					int validateRuleSequence 			= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getSequence();									
//					int validateRulePointer 			= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getPointer();		
//					int validateRuleValue 				= validateDetailList.get(dataElement).getStorage().get(subfieldIndex).getValue();	
//					-----------------------------------------------------------------------------------------------------------------------------
//					int valueNbr 						= new CollectHeaderRules().convertValueString(value);	
					int ruleFireNbr 					= new CollectHeaderRules().convertFireBoolean(ruleFire);
//					-----------------------------------------------------------------------------------------------------------------------------
					row = new ArrayList<Facet>();
//					-----------------------------------------------------------------------------------------------------------------------------
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleId			, id		)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleField		, field		)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleSubfield	, subfield	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleFireNbr		, 0			)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleId			, id		)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleField		, field		)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleSubfield	, subfield	)	);					
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleFire		, 0			)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleType		, 0			)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleGroup		, 0			)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleFormat		, format	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleMinLength	, length	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleMaxLength	, length	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleEncoding	, encoding	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleDataType	, dataType	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleSource		, source	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleDirection	, direction	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleExistence	, existence	)	);
					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleChange		, change	)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleSequence	, 0			)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	rulePointer		, 0			)	);
//					row.add(new Facet(idSequence++, fieldIndex, subfieldIndex,	ruleValue		, value		)	);
//					-----------------------------------------------------------------------------------------------------------------------------
				
					ruleCollection.add(row);
				} 				
			}  
		}  
		return ruleCollection;
	}
}
