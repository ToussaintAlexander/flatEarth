package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE042RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE042RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE042RuleHeader  {

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
	public DataElementRuleHeaderField getDataElementRuleField01() {
	
		DataElementRuleHeaderField dataElementField01 	 
		
			= new DataElementRuleHeaderField ( 
											   CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_ID
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FIELD
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_SUBFIELD
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FIRE		
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_FORMAT
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_MINIMUM_LENGTH
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_MAXIMUM_LENGTH
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_ENCODING
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_DATATYPE
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_SOURCE
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_DIRECTION
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_EXISTENCE
											 , CARD_ACCEPTOR_IDENTIFICATION_CODE_042_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE042RuleHeader () {
			
			int id = 42000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			
			storage.add(dataElementField01);
			
			DataElementRuleHeader de042HeaderRule = new DE042RuleHeaderImpl(id, storage);
			
			return de042HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de042RuleHeader = new CreateDE042RuleHeader().createDE042RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de042RuleHeader,fieldList,codeList);
		
		}
}
