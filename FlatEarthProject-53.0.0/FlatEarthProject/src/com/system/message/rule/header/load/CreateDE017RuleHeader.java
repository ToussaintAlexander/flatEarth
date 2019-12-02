package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE017RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE017RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE017RuleHeader  {

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
	public DataElementRuleHeaderField getCaptureDateMonthRule() {
	
		DataElementRuleHeaderField captureDateMonthRule 	 
		
			= new DataElementRuleHeaderField ( 
											   CAPTURE_DATE_MONTH_017_RULE_HEADER_ID
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_FIELD
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_SUBFIELD
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_FIRE		
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_FORMAT
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_MINIMUM_LENGTH
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_MAXIMUM_LENGTH
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_ENCODING
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_DATATYPE
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_SOURCE
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_DIRECTION
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_EXISTENCE
											 , CAPTURE_DATE_MONTH_017_RULE_HEADER_CHANGE
  		  	       	       		             );

		return captureDateMonthRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getCaptureDateDayRule() {
	
		DataElementRuleHeaderField captureDateDayRule 	 
		
			= new DataElementRuleHeaderField ( 
											   CAPTURE_DATE_DAY_017_RULE_HEADER_ID
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_FIELD
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_SUBFIELD
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_FIRE		
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_FORMAT
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_MINIMUM_LENGTH
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_MAXIMUM_LENGTH
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_ENCODING
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_DATATYPE
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_SOURCE
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_DIRECTION
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_EXISTENCE
											 , CAPTURE_DATE_DAY_017_RULE_HEADER_CHANGE
  		  	       	       		             );

		return captureDateDayRule;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE017RuleHeader () {
			
			int id = 17000;
			
			DataElementRuleHeaderField captureDateMonthRule = getCaptureDateMonthRule();
			DataElementRuleHeaderField captureDateDayRule = getCaptureDateDayRule();
			
			storage.add(captureDateMonthRule);
			storage.add(captureDateDayRule);
			
			DataElementRuleHeader de017HeaderRule = new DE017RuleHeaderImpl(id, storage);
			
			return de017HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de017RuleHeader = new CreateDE017RuleHeader().createDE017RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de017RuleHeader,fieldList,codeList);
		
		}
}
