package com.system.message.utilties.message;

import java.util.BitSet;
import java.util.List;
import java.util.ArrayList;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.rule.header.load.CreateDE000RuleHeader;
import com.system.message.rule.header.load.CreateDE001RuleHeader;
import com.system.message.rule.header.load.CreateDE002RuleHeader;
import com.system.message.rule.header.load.CreateDE003RuleHeader;
import com.system.message.rule.header.load.CreateDE004RuleHeader;
import com.system.message.rule.header.load.CreateDE005RuleHeader;
import com.system.message.rule.header.load.CreateDE006RuleHeader;
import com.system.message.rule.header.load.CreateDE007RuleHeader;
import com.system.message.rule.header.load.CreateDE008RuleHeader;
import com.system.message.rule.header.load.CreateDE009RuleHeader;
import com.system.message.rule.header.load.CreateDE010RuleHeader;
import com.system.message.rule.header.load.CreateDE011RuleHeader;
import com.system.message.rule.header.load.CreateDE012RuleHeader;
import com.system.message.rule.header.load.CreateDE013RuleHeader;
import com.system.message.rule.header.load.CreateDE014RuleHeader;
import com.system.message.rule.header.load.CreateDE015RuleHeader;
import com.system.message.rule.header.load.CreateDE016RuleHeader;
import com.system.message.rule.header.load.CreateDE017RuleHeader;
import com.system.message.rule.header.load.CreateDE018RuleHeader;
import com.system.message.rule.header.load.CreateDE019RuleHeader;
import com.system.message.rule.header.load.CreateDE020RuleHeader;
import com.system.message.rule.header.load.CreateDE021RuleHeader;
import com.system.message.rule.header.load.CreateDE022RuleHeader;
import com.system.message.rule.header.load.CreateDE023RuleHeader;
import com.system.message.rule.header.load.CreateDE024RuleHeader;
import com.system.message.rule.header.load.CreateDE025RuleHeader;
import com.system.message.rule.header.load.CreateDE026RuleHeader;
import com.system.message.rule.header.load.CreateDE027RuleHeader;
import com.system.message.rule.header.load.CreateDE028RuleHeader;
import com.system.message.rule.header.load.CreateDE029RuleHeader;
import com.system.message.rule.header.load.CreateDE030RuleHeader;
import com.system.message.rule.header.load.CreateDE031RuleHeader;
import com.system.message.rule.header.load.CreateDE032RuleHeader;
import com.system.message.rule.header.load.CreateDE033RuleHeader;
import com.system.message.rule.header.load.CreateDE034RuleHeader;
import com.system.message.rule.header.load.CreateDE035RuleHeader;
import com.system.message.rule.header.load.CreateDE036RuleHeader;
import com.system.message.rule.header.load.CreateDE037RuleHeader;
import com.system.message.rule.header.load.CreateDE038RuleHeader;
import com.system.message.rule.header.load.CreateDE039RuleHeader;
import com.system.message.rule.header.load.CreateDE040RuleHeader;
import com.system.message.rule.header.load.CreateDE041RuleHeader;
import com.system.message.rule.header.load.CreateDE042RuleHeader;
import com.system.message.rule.header.load.CreateDE043RuleHeader;
import com.system.message.rule.header.load.CreateDE044RuleHeader;
import com.system.message.rule.header.load.CreateDE045RuleHeader;
import com.system.message.rule.header.load.CreateDE046RuleHeader;
import com.system.message.rule.header.load.CreateDE047RuleHeader;
import com.system.message.rule.header.load.CreateDE048RuleHeader;
import com.system.message.rule.header.load.CreateDE049RuleHeader;
import com.system.message.rule.header.load.CreateDE050RuleHeader;
import com.system.message.rule.header.load.CreateDE051RuleHeader;
import com.system.message.rule.header.load.CreateDE052RuleHeader;
import com.system.message.rule.header.load.CreateDE053RuleHeader;
import com.system.message.rule.header.load.CreateDE054RuleHeader;
import com.system.message.rule.header.load.CreateDE055RuleHeader;
import com.system.message.rule.header.load.CreateDE056RuleHeader;
import com.system.message.rule.header.load.CreateDE057RuleHeader;
import com.system.message.rule.header.load.CreateDE058RuleHeader;
import com.system.message.rule.header.load.CreateDE059RuleHeader;
import com.system.message.rule.header.load.CreateDE060RuleHeader;
import com.system.message.rule.header.load.CreateDE061RuleHeader;
import com.system.message.rule.header.load.CreateDE062RuleHeader;
import com.system.message.rule.header.load.CreateDE063RuleHeader;
import com.system.message.rule.header.load.CreateDE064RuleHeader;
import com.system.message.utilties.codes.CodeTableUtils;

public class RuleHeaderUtils {

	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void parseField (DataElementRuleHeaderField ruleHeader, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		String fieldName = fieldList.get(ruleHeader.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(ruleHeader.getField()).getSubFieldName() != null 
			? fieldList.get(ruleHeader.getField()).getSubFieldName().get(ruleHeader.getSubField()) : "null";
			
		String format 		= new CodeTableUtils().convertFormatCode 	(ruleHeader.getFormat()	);
		String encoding 	= new CodeTableUtils().convertEncodingCode 	(ruleHeader.getEncoding()	);	
		String dataType 	= new CodeTableUtils().convertDataTypeCode 	(ruleHeader.getDataType()	);	
		String source 		= new CodeTableUtils().convertSourceCode 	(ruleHeader.getSource()	);	
		String direction 	= new CodeTableUtils().convertDirectionCode (ruleHeader.getDirection()	);	
		String existence 	= new CodeTableUtils().convertExistenceCode (ruleHeader.getExistence()	);	
		String change 		= new CodeTableUtils().convertChangeCode 	(ruleHeader.getChange()	);	

		//------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("Rule Header ID.............: " + ruleHeader.getId()																);
		
		System.out.format("Rule Header Field......... : %6s %s %s\n" , ruleHeader.getField()     	, ": " , fieldName     					);
		System.out.format("Rule Header Sub Field..... : %6s %s %s\n" , ruleHeader.getSubField()   	, ": " , subfieldName   				);

		System.out.format("Rule Header Fire.......... : %6s %s %s\n" , ruleHeader.getFire()  		, ": " , ruleHeader.getFire()  			);
	
		System.out.format("Rule Header Format........ : %6s %s %s\n" , ruleHeader.getFormat()  		, ": " , format  						);

		System.out.format("Rule Header Minimum Length.: %6d %s %s\n" , ruleHeader.getMinimumLength(), ": " , ruleHeader.getMinimumLength()  );
		System.out.format("Rule Header Maximum Length.: %6d %s %s\n" , ruleHeader.getMaximumLength(), ": " , ruleHeader.getMaximumLength()  );
	
		System.out.format("Rule Header Encoding.......: %6s %s %s\n" , ruleHeader.getEncoding()  	, ": " , encoding  						);
		System.out.format("Rule Header Data Type......: %6s %s %s\n" , ruleHeader.getDataType()  	, ": " , dataType  						);
	
		System.out.format("Rule Header Source.........: %6s %s %s\n" , ruleHeader.getSource()    	, ": " , source							);
		System.out.format("Rule Header Direction......: %6s %s %s\n" , ruleHeader.getDirection() 	, ": " , direction 						);
		System.out.format("Rule Header Existence......: %6s %s %s\n" , ruleHeader.getExistence() 	, ": " , existence 						);
		System.out.format("Rule Header Change.........: %6s %s %s\n" , ruleHeader.getChange()    	, ": " , change    						);
		
	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void display( List<DataElementRuleHeader> ruleHeaders, List<FieldBean> fieldList, List<CodeBean> codeList )
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
	public void display( DataElementRuleHeader ruleHeaders, List<FieldBean> fieldList, List<CodeBean> codeList )
	{
		int maximumSubfields = ruleHeaders.getStorage().size();
				
		for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {

			parseField (ruleHeaders.getStorage().get(subfieldIndex), fieldList, codeList);
						
		}	

	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public List<DataElementRuleHeader> buildRuleHeaders() {
		
		List<DataElementRuleHeader> ruleHeaderList = new ArrayList<DataElementRuleHeader>();
		
		ruleHeaderList.add(new CreateDE000RuleHeader().createDE000RuleHeader());		// Reserved
		ruleHeaderList.add(new CreateDE001RuleHeader().createDE001RuleHeader());		// Bitmap 
		ruleHeaderList.add(new CreateDE002RuleHeader().createDE002RuleHeader());		// Primary account number (PAN)
		ruleHeaderList.add(new CreateDE003RuleHeader().createDE003RuleHeader());		// Processing Code 
		ruleHeaderList.add(new CreateDE004RuleHeader().createDE004RuleHeader());	 	// Transaction Amount  	
		ruleHeaderList.add(new CreateDE005RuleHeader().createDE005RuleHeader());		// Settlement Amount  
		ruleHeaderList.add(new CreateDE006RuleHeader().createDE006RuleHeader());		// Cardholder Billing Amount  
		ruleHeaderList.add(new CreateDE007RuleHeader().createDE007RuleHeader());		// Transmission date & time 
		ruleHeaderList.add(new CreateDE008RuleHeader().createDE008RuleHeader());		// Amount, cardholder billing fee 
		ruleHeaderList.add(new CreateDE009RuleHeader().createDE009RuleHeader());		// Conversion rate, settlement
		
		ruleHeaderList.add(new CreateDE010RuleHeader().createDE010RuleHeader());		// Conversion rate, cardholder billing
		ruleHeaderList.add(new CreateDE011RuleHeader().createDE011RuleHeader());		// System trace audit number (STAN)
		ruleHeaderList.add(new CreateDE012RuleHeader().createDE012RuleHeader());		// Local transaction time (hhmmss)
		ruleHeaderList.add(new CreateDE013RuleHeader().createDE013RuleHeader());		// Local transaction date (MMDD)
		ruleHeaderList.add(new CreateDE014RuleHeader().createDE014RuleHeader());		// Expiration date
		ruleHeaderList.add(new CreateDE015RuleHeader().createDE015RuleHeader());		// Settlement date
		ruleHeaderList.add(new CreateDE016RuleHeader().createDE016RuleHeader());		// Currency conversion date
		ruleHeaderList.add(new CreateDE017RuleHeader().createDE017RuleHeader());		// Capture date
		ruleHeaderList.add(new CreateDE018RuleHeader().createDE018RuleHeader());		// Merchant type, or merchant category code
		ruleHeaderList.add(new CreateDE019RuleHeader().createDE019RuleHeader());		// Acquiring institution (country code)
		
		ruleHeaderList.add(new CreateDE020RuleHeader().createDE020RuleHeader());		// PAN extended (country code)
		ruleHeaderList.add(new CreateDE021RuleHeader().createDE021RuleHeader());		// Forwarding institution (country code)
		ruleHeaderList.add(new CreateDE022RuleHeader().createDE022RuleHeader());		// Point of service entry mode
		ruleHeaderList.add(new CreateDE023RuleHeader().createDE023RuleHeader());		// Application PAN sequence number
		ruleHeaderList.add(new CreateDE024RuleHeader().createDE024RuleHeader());		// Function code (ISO 8583:1993), or network international identifier (NII)
		ruleHeaderList.add(new CreateDE025RuleHeader().createDE025RuleHeader());		// Point of service condition code
		ruleHeaderList.add(new CreateDE026RuleHeader().createDE026RuleHeader());		// Point of service capture code
		ruleHeaderList.add(new CreateDE027RuleHeader().createDE027RuleHeader());		// Authorizing identification response length
		ruleHeaderList.add(new CreateDE028RuleHeader().createDE028RuleHeader());		// Amount, transaction fee
		ruleHeaderList.add(new CreateDE029RuleHeader().createDE029RuleHeader());		// Amount, settlement fee
		
		ruleHeaderList.add(new CreateDE030RuleHeader().createDE030RuleHeader());		// Amount, transaction processing fee
		ruleHeaderList.add(new CreateDE031RuleHeader().createDE031RuleHeader());		// Amount, settlement processing fee
		ruleHeaderList.add(new CreateDE032RuleHeader().createDE032RuleHeader());		// Acquiring institution identification code
		ruleHeaderList.add(new CreateDE033RuleHeader().createDE033RuleHeader());		// Forwarding institution identification code
		ruleHeaderList.add(new CreateDE034RuleHeader().createDE034RuleHeader());		// Primary account number, extended
		ruleHeaderList.add(new CreateDE035RuleHeader().createDE035RuleHeader());		// Track 2 data
		ruleHeaderList.add(new CreateDE036RuleHeader().createDE036RuleHeader());		// Track 3 data
		ruleHeaderList.add(new CreateDE037RuleHeader().createDE037RuleHeader());		// Retrieval reference number
		ruleHeaderList.add(new CreateDE038RuleHeader().createDE038RuleHeader());		// Authorization identification response
		ruleHeaderList.add(new CreateDE039RuleHeader().createDE039RuleHeader());		// Response code
		
		ruleHeaderList.add(new CreateDE040RuleHeader().createDE040RuleHeader());		// Service restriction code
		ruleHeaderList.add(new CreateDE041RuleHeader().createDE041RuleHeader());		// Card acceptor terminal identification
		ruleHeaderList.add(new CreateDE042RuleHeader().createDE042RuleHeader());		// Card acceptor identification code
		ruleHeaderList.add(new CreateDE043RuleHeader().createDE043RuleHeader());		// Card acceptor name/location (1-23 street address, 24-36 city, 37-38 state, 39-40 country)
		ruleHeaderList.add(new CreateDE044RuleHeader().createDE044RuleHeader());		// Additional response data
		ruleHeaderList.add(new CreateDE045RuleHeader().createDE045RuleHeader());		// Track 1 data
		ruleHeaderList.add(new CreateDE046RuleHeader().createDE046RuleHeader());		// Additional data (ISO)
		ruleHeaderList.add(new CreateDE047RuleHeader().createDE047RuleHeader());		// Additional data (national)
		ruleHeaderList.add(new CreateDE048RuleHeader().createDE048RuleHeader());		// Additional data (private)
		ruleHeaderList.add(new CreateDE049RuleHeader().createDE049RuleHeader());		// Currency code, transaction
		
		ruleHeaderList.add(new CreateDE050RuleHeader().createDE050RuleHeader());		// Currency code, settlement
		ruleHeaderList.add(new CreateDE051RuleHeader().createDE051RuleHeader());		// Currency code, cardholder billing
		ruleHeaderList.add(new CreateDE052RuleHeader().createDE052RuleHeader());		// Personal identification number data
		ruleHeaderList.add(new CreateDE053RuleHeader().createDE053RuleHeader());		// Security related control information
		ruleHeaderList.add(new CreateDE054RuleHeader().createDE054RuleHeader());		// Additional amounts
		ruleHeaderList.add(new CreateDE055RuleHeader().createDE055RuleHeader());		// ICC data – EMV having multiple tags
		ruleHeaderList.add(new CreateDE056RuleHeader().createDE056RuleHeader());		// Reserved (ISO)
		ruleHeaderList.add(new CreateDE057RuleHeader().createDE057RuleHeader());		// Reserved (national)
		ruleHeaderList.add(new CreateDE058RuleHeader().createDE058RuleHeader());		// Reserved (national)
		ruleHeaderList.add(new CreateDE059RuleHeader().createDE059RuleHeader());		// Reserved (national)
		
		ruleHeaderList.add(new CreateDE060RuleHeader().createDE060RuleHeader());		// Reserved (national)
		ruleHeaderList.add(new CreateDE061RuleHeader().createDE061RuleHeader());		// Reserved (private) (e.g. CVV2/service code   transactions)
		ruleHeaderList.add(new CreateDE062RuleHeader().createDE062RuleHeader());		// Reserved (private) (e.g. transactions: invoice number, key exchange transactions: TPK key, etc.)
		ruleHeaderList.add(new CreateDE063RuleHeader().createDE063RuleHeader());		// Reserved (private)
		ruleHeaderList.add(new CreateDE064RuleHeader().createDE064RuleHeader());		// Message authentication code (MAC)
		
		return ruleHeaderList;
		
	}
	/************************************************************************* 
	 ************************************************************************* 
	 */
	public static void main(String[] args) {
		
		List<DataElementRuleHeader> knowledgeBase = new RuleHeaderUtils().buildRuleHeaders();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleHeaderUtils().display ( knowledgeBase, fieldList, codeList);

	}
}

