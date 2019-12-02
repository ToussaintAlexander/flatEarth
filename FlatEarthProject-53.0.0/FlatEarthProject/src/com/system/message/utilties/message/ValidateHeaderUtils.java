package com.system.message.utilties.message;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import com.system.message.base.validate.header.DataElementValidateRuleHeader;
import com.system.message.base.validate.header.DataElementValidateRuleHeaderField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.utilties.codes.CodeTableUtils;

public class ValidateHeaderUtils {
	
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void parseField (DataElementValidateRuleHeaderField validateRuleHeader, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		String fieldName = fieldList.get(validateRuleHeader.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(validateRuleHeader.getField()).getSubFieldName() != null 
			? fieldList.get(validateRuleHeader.getField()).getSubFieldName().get(validateRuleHeader.getSubField()) : "null";
			
			String format 		= new CodeTableUtils().convertFormatCode 	(validateRuleHeader.getFormat()	);
			String encoding 	= new CodeTableUtils().convertEncodingCode 	(validateRuleHeader.getEncoding()	);	
			String dataType 	= new CodeTableUtils().convertDataTypeCode 	(validateRuleHeader.getDataType()	);	
			String source 		= new CodeTableUtils().convertSourceCode 	(validateRuleHeader.getSource()	);	
			String direction 	= new CodeTableUtils().convertDirectionCode (validateRuleHeader.getDirection()	);	
			String existence 	= new CodeTableUtils().convertExistenceCode (validateRuleHeader.getExistence()	);	
			String change 		= new CodeTableUtils().convertChangeCode 	(validateRuleHeader.getChange()	);	

		//------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("Validate Rule Header ID.............: " + validateRuleHeader.getId());
		
		System.out.format("Validate Rule Header Field......... : %6s %s %s\n" , validateRuleHeader.getField()     	, ": " , fieldName     					);
		System.out.format("Validate Rule Header Sub Field..... : %6s %s %s\n" , validateRuleHeader.getSubField()   	, ": " , subfieldName   				);

		System.out.format("Validate Rule Header Fire.......... : %6s %s %s\n" , validateRuleHeader.getFire()  		, ": " , validateRuleHeader.getFire()  	);
	
		System.out.format("Validate Rule Header Format........ : %6s %s %s\n" , validateRuleHeader.getFormat()  	, ": " , format  						);

		System.out.format("Validate Rule Header Minimum Length.: %6d %s %s\n" , validateRuleHeader.getMinimumLength(), ": " , validateRuleHeader.getMinimumLength()  );
		System.out.format("Validate Rule Header Maximum Length.: %6d %s %s\n" , validateRuleHeader.getMaximumLength(), ": " , validateRuleHeader.getMaximumLength()  );
	
		System.out.format("Validate Rule Header Encoding.......: %6s %s %s\n" , validateRuleHeader.getEncoding()  	, ": " , encoding  						);
		System.out.format("Validate Rule Header Data Type......: %6s %s %s\n" , validateRuleHeader.getDataType()  	, ": " , dataType  						);
	
		System.out.format("Validate Rule Header Source.........: %6s %s %s\n" , validateRuleHeader.getSource()    	, ": " , source							);
		System.out.format("Validate Rule Header Direction......: %6s %s %s\n" , validateRuleHeader.getDirection() 	, ": " , direction 						);
		System.out.format("Validate Rule Header Existence......: %6s %s %s\n" , validateRuleHeader.getExistence() 	, ": " , existence 						);
		System.out.format("Validate Rule Header Change.........: %6s %s %s\n" , validateRuleHeader.getChange()    	, ": " , change    						);
		
	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void display( List<DataElementValidateRuleHeader> ruleHeaders, List<FieldBean> fieldList, List<CodeBean> codeList )
	{
			BitSet bitMap = new DE001Impl().getBitMap();
		
			for (int dataElement = 0; dataElement < ruleHeaders.size(); dataElement++) {	 
			
				if (bitMap.get(dataElement)) {
				
					int maximumSubfields = ruleHeaders.get(dataElement).getStorage().size();
				
					for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {

						parseField (ruleHeaders.get(dataElement).getStorage().get(subfieldIndex), fieldList, codeList);
						
					}	
				}
			}
	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void display( DataElementValidateRuleHeader ruleHeaders, List<FieldBean> fieldList, List<CodeBean> codeList )
	{
		int maximumSubfields = ruleHeaders.getStorage().size();
				
		for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {

			parseField (ruleHeaders.getStorage().get(subfieldIndex), fieldList, codeList);
						
		}	

	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public List<DataElementValidateRuleHeader> buildValidHeaders() {
		
		List<DataElementValidateRuleHeader> validateRuleHeaderList = new ArrayList<DataElementValidateRuleHeader>();
		
		//validateRuleHeaderList.add(new CreateDE000ValidateRuleHeader().createDE000ValidateRuleHeader());		// Reserved
		
		return validateRuleHeaderList;
		
	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public static void main(String[] args) {
		
		List<DataElementValidateRuleHeader> validateRuleHeaders = new ValidateHeaderUtils().buildValidHeaders();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ValidateHeaderUtils().display (validateRuleHeaders, fieldList, codeList);

	}
}

