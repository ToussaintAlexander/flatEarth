package com.system.message.utilties.message;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

import com.system.message.base.validate.detail.DataElementValidateRuleDetail;
import com.system.message.base.validate.detail.DataElementValidateRuleDetailField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.utilties.codes.CodeTableUtils;

public class ValidateDetailUtils {

	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void parseField (DataElementValidateRuleDetailField ruleDetail, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		
		
		String fieldName = fieldList.get(ruleDetail.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(ruleDetail.getField()).getSubFieldName() != null 
			? fieldList.get(ruleDetail.getField()).getSubFieldName().get(ruleDetail.getSubField()) : "null";
			
	//--------------------------------------------------------------------------------------------------------------------
		
		System.out.println();
		
		System.out.println("Valid Detail Object ID...........: " + ruleDetail.getId()	);
		
		System.out.format ("Valid Detail Object Field....... : %6s %s %s\n" , ruleDetail.getField()     , ": " , fieldName    			);
		System.out.format ("Valid Detail Object Subfield.... : %6s %s %s\n" , ruleDetail.getSubField()  , ": " , subfieldName 			);
		
		System.out.format ("Valid Detail Object Rule Fire... : %6s %s %s\n" , ruleDetail.isFire()   	, ": " , ruleDetail.isFire() 	);
		System.out.format ("Valid Detail Object Rule Type... : %6s %s %s\n" , ruleDetail.getType()   	, ": " , ruleDetail.getType() 	);
		System.out.format ("Valid Detail Object Rule Group.. : %6s %s %s\n" , ruleDetail.getGroup()  	, ": " , ruleDetail.getGroup() 	);

		System.out.format ("Valid Detail Object BIN Level... : %6s %s %s\n" , ruleDetail.getbLevel()  	, ": " , ruleDetail.getbLevel() );
		System.out.format ("Valid Detail Object Acct Level.. : %6s %s %s\n" , ruleDetail.getaLevel()   	, ": " , ruleDetail.getaLevel() );
		System.out.format ("Valid Detail Object Trans Level. : %6s %s %s\n" , ruleDetail.gettLevel()  	, ": " , ruleDetail.gettLevel() );
		
		System.out.format ("Valid Detail Object Sequence.... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getSequence() 					);
		System.out.format ("Valid Detail Object Pointer..... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getPointer() 					);
		System.out.format ("Valid Detail Object Value....... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getValue() 						);
		
		System.out.format ("Valid Detail Object C User...... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getCreateUser() 				);
		System.out.format ("Valid Detail Object C Time...... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getCreateTimestamp() 			);
		System.out.format ("Valid Detail Object M User...... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getModifyUser() 				);
		System.out.format ("Valid Detail Object M Time...... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getModifyTimestamp() 			);
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void display (List<DataElementValidateRuleDetail> validateRuleDetailList, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		BitSet bitMap = new DE001Impl().getBitMap();
		
		for (int dataElement = 0; dataElement < validateRuleDetailList.size() - 54; dataElement++) {	 
			
			if (bitMap.get(dataElement)) {

				int maximumSubfields = validateRuleDetailList.get(dataElement).getStorage().size();
				
				for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {
					 
					parseField (validateRuleDetailList.get(dataElement).getStorage().get(subfieldIndex), fieldList, codeList);
	
				}
			}
		}
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void display (DataElementValidateRuleDetail validateRuleDetail, List<FieldBean> fieldList, List<CodeBean> codeList) {

		int maximumSubfields = validateRuleDetail.getStorage().size();
				
		for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {
					 
			parseField (validateRuleDetail.getStorage().get(subfieldIndex), fieldList, codeList);
	
		}
			 
	}
	/*****************************************************************************************
	 *****************************************************************************************
	 */
	public List<DataElementValidateRuleDetail> buildRuleDetails () {
		
		List <DataElementValidateRuleDetail> validateRuleDetailList = new LinkedList<DataElementValidateRuleDetail>();
		
		//validateRuleDetailList.add(new CreateDE000ValidateRuleDetail().createDE000ValidateRuleDetail());
		
		return validateRuleDetailList;
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	
	public static void main(String[] args) {

		List <DataElementValidateRuleDetail> ruleKeyList = new ValidateDetailUtils().buildRuleDetails();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ValidateDetailUtils().display (ruleKeyList, fieldList, codeList);
		
	}
}
