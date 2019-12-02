package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE026RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE026RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE026RuleHeader  {

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
	public DataElementRuleHeaderField getPointOfServicePinCaptureCodeRule() {
	
		DataElementRuleHeaderField pointOfServicePinCaptureCodeRule 	 
		
			= new DataElementRuleHeaderField ( 
											   POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_ID
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_FIELD
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_SUBFIELD
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_FIRE		
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_FORMAT
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_MINIMUM_LENGTH
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_MAXIMUM_LENGTH
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_ENCODING
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_DATATYPE
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_SOURCE
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_DIRECTION
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_EXISTENCE
											 , POINT_OF_SERVICE_PIN_CAPTURE_CODE_026_RULE_HEADER_CHANGE
  		  	       	       		             );

		return pointOfServicePinCaptureCodeRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE026RuleHeader () {
			
			int id = 26000;
			
			DataElementRuleHeaderField PointOfServicePinCaptureCodeRule = getPointOfServicePinCaptureCodeRule();
			
			storage.add(PointOfServicePinCaptureCodeRule);
			
			DataElementRuleHeader de026HeaderRule = new DE026RuleHeaderImpl(id, storage);
			
			return de026HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de026RuleHeader = new CreateDE026RuleHeader().createDE026RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de026RuleHeader,fieldList,codeList);
		
		}
}
