package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE002RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE002RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */	
public class CreateDE002RuleHeader  {

	public List<DataElementRuleHeaderField> storage = new ArrayList<DataElementRuleHeaderField>();
	
	public List<DataElementRuleHeaderField> getStorage() {
		return storage;
	}
	public void setStorage(List<DataElementRuleHeaderField> storage) {
		this.storage = storage;
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getBinRuleHeaderField() {
	
		DataElementRuleHeaderField binRuleHeaderField 
	    	
				= new DataElementRuleHeaderField (  
											       BIN_002_RULE_HEADER_ID
										         , BIN_002_RULE_HEADER_FIELD
										         , BIN_002_RULE_HEADER_SUBFIELD
		                                         , BIN_002_RULE_HEADER_FIRE
		                                         , BIN_002_RULE_HEADER_FORMAT
		                                         , BIN_002_RULE_HEADER_MINIMUM_LENGTH
		                                         , BIN_002_RULE_HEADER_MAXIMUM_LENGTH
		                                         , BIN_002_RULE_HEADER_ENCODING
		                                         , BIN_002_RULE_HEADER_DATATYPE
		                                         , BIN_002_RULE_HEADER_SOURCE
		                                         , BIN_002_RULE_HEADER_DIRECTION
		                                         , BIN_002_RULE_HEADER_EXISTENCE
		                                         , BIN_002_RULE_HEADER_CHANGE
						  	                     );

			return binRuleHeaderField;
			
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeaderField getPanRuleHeaderField() {
		
		DataElementRuleHeaderField panRuleHeaderField 
	    	
				= new DataElementRuleHeaderField (  
											       PAN_002_RULE_HEADER_ID
										         , PAN_002_RULE_HEADER_FIELD
										         , PAN_002_RULE_HEADER_SUBFIELD
		                                         , PAN_002_RULE_HEADER_FIRE
		                                         , PAN_002_RULE_HEADER_FORMAT
		                                         , PAN_002_RULE_HEADER_MINIMUM_LENGTH
		                                         , PAN_002_RULE_HEADER_MAXIMUM_LENGTH
		                                         , PAN_002_RULE_HEADER_ENCODING
		                                         , PAN_002_RULE_HEADER_DATATYPE
		                                         , PAN_002_RULE_HEADER_SOURCE
		                                         , PAN_002_RULE_HEADER_DIRECTION
		                                         , PAN_002_RULE_HEADER_EXISTENCE
		                                         , PAN_002_RULE_HEADER_CHANGE
						  	                     );

			return panRuleHeaderField;
			
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeaderField getCheckDigitRuleHeaderField() {
		
		DataElementRuleHeaderField checkDigitRuleHeaderField 
	    	
				= new DataElementRuleHeaderField (  
												   CHECK_DIGIT_002_RULE_HEADER_ID
										         , CHECK_DIGIT_002_RULE_HEADER_FIELD
										         , CHECK_DIGIT_002_RULE_HEADER_SUBFIELD
		                                         , CHECK_DIGIT_002_RULE_HEADER_FIRE
		                                         , CHECK_DIGIT_002_RULE_HEADER_FORMAT
		                                         , CHECK_DIGIT_002_RULE_HEADER_MINIMUM_LENGTH
		                                         , CHECK_DIGIT_002_RULE_HEADER_MAXIMUM_LENGTH
		                                         , CHECK_DIGIT_002_RULE_HEADER_ENCODING
		                                         , CHECK_DIGIT_002_RULE_HEADER_DATATYPE
		                                         , CHECK_DIGIT_002_RULE_HEADER_SOURCE
		                                         , CHECK_DIGIT_002_RULE_HEADER_DIRECTION
		                                         , CHECK_DIGIT_002_RULE_HEADER_EXISTENCE
		                                         , CHECK_DIGIT_002_RULE_HEADER_CHANGE
						  	                     );

			return checkDigitRuleHeaderField;
			
	}	
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public DataElementRuleHeader createDE002RuleHeader() {
			
		int id = 2000;
		
		DataElementRuleHeaderField binRuleHeaderField = getBinRuleHeaderField();
		DataElementRuleHeaderField panRuleHeaderField = getPanRuleHeaderField();
		DataElementRuleHeaderField checkDigitRuleHeaderField = getCheckDigitRuleHeaderField();
		
		storage.add(binRuleHeaderField);
		storage.add(panRuleHeaderField);
		storage.add(checkDigitRuleHeaderField);
		
		DataElementRuleHeader de002RuleHeader = new DE002RuleHeaderImpl(id, storage);
		
		return de002RuleHeader;
	
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
		
		DataElementRuleHeader de002RuleHeader = new CreateDE002RuleHeader().createDE002RuleHeader(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleHeaderUtils().display(de002RuleHeader,fieldList,codeList);
		
	}
}
