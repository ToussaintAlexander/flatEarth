package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE018RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE018RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE018RuleHeader  {

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
	public DataElementRuleHeaderField getMerchantTypeRule() {
	
		DataElementRuleHeaderField merchantTypeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   MERCHANT_TYPE_018_RULE_HEADER_ID
											 , MERCHANT_TYPE_018_RULE_HEADER_FIELD
											 , MERCHANT_TYPE_018_RULE_HEADER_SUBFIELD
											 , MERCHANT_TYPE_018_RULE_HEADER_FIRE		
											 , MERCHANT_TYPE_018_RULE_HEADER_FORMAT
											 , MERCHANT_TYPE_018_RULE_HEADER_MINIMUM_LENGTH
											 , MERCHANT_TYPE_018_RULE_HEADER_MAXIMUM_LENGTH
											 , MERCHANT_TYPE_018_RULE_HEADER_ENCODING
											 , MERCHANT_TYPE_018_RULE_HEADER_DATATYPE
											 , MERCHANT_TYPE_018_RULE_HEADER_SOURCE
											 , MERCHANT_TYPE_018_RULE_HEADER_DIRECTION
											 , MERCHANT_TYPE_018_RULE_HEADER_EXISTENCE
											 , MERCHANT_TYPE_018_RULE_HEADER_CHANGE
  		  	       	       		             );

		return merchantTypeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE018RuleHeader () {
			
			int id = 18000;
			
			DataElementRuleHeaderField merchantTypeRule = getMerchantTypeRule();
			
			storage.add(merchantTypeRule);
			
			DataElementRuleHeader de018HeaderRule = new DE018RuleHeaderImpl(id, storage);
			
			return de018HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de018RuleHeader = new CreateDE018RuleHeader().createDE018RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de018RuleHeader,fieldList,codeList);
		
		}
}
