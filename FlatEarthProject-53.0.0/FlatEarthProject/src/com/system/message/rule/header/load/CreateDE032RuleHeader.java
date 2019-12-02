package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE032RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE032RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE032RuleHeader  {

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
	public DataElementRuleHeaderField getAcquiringInstitutionIdentificationCodeRule() {
	
		DataElementRuleHeaderField acquiringInstitutionIdentificationCodeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_ID
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FIELD
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_SUBFIELD
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FIRE		
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_FORMAT
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_MINIMUM_LENGTH
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_MAXIMUM_LENGTH
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_ENCODING
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_DATATYPE
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_SOURCE
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_DIRECTION
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_EXISTENCE
											 , ACQUIRING_INSITUTION_IDENTIFICATION_CODE_032_RULE_HEADER_CHANGE
  		  	       	       		             );

		return acquiringInstitutionIdentificationCodeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE032RuleHeader () {
			
			int id = 32000;
			
			DataElementRuleHeaderField acquiringInstitutionIdentificationCodeRule = getAcquiringInstitutionIdentificationCodeRule();
			
			storage.add(acquiringInstitutionIdentificationCodeRule);
			
			DataElementRuleHeader de032HeaderRule = new DE032RuleHeaderImpl(id, storage);
			
			return de032HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de032RuleHeader = new CreateDE032RuleHeader().createDE032RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de032RuleHeader,fieldList,codeList);
		
		}
}
