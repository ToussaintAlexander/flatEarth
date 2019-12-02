package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE016RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE016RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE016RuleHeader  {

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
	public DataElementRuleHeaderField getConversionDateMonthRule() {
	
		DataElementRuleHeaderField conversionDateMonth 	 
		
			= new DataElementRuleHeaderField ( 
											   CONVERSION_DATE_MONTH_016_RULE_HEADER_ID
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_FIELD
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_SUBFIELD
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_FIRE		
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_FORMAT
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_MINIMUM_LENGTH
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_MAXIMUM_LENGTH
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_ENCODING
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_DATATYPE
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_SOURCE
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_DIRECTION
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_EXISTENCE
											 , CONVERSION_DATE_MONTH_016_RULE_HEADER_CHANGE
  		  	       	       		             );

		return conversionDateMonth;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getConversionDateDayRule() {
	
		DataElementRuleHeaderField conversionDateDay 	 
		
			= new DataElementRuleHeaderField ( 
											   CONVERSION_DATE_DAY_016_RULE_HEADER_ID
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_FIELD
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_SUBFIELD
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_FIRE		
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_FORMAT
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_MINIMUM_LENGTH
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_MAXIMUM_LENGTH
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_ENCODING
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_DATATYPE
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_SOURCE
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_DIRECTION
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_EXISTENCE
											 , CONVERSION_DATE_DAY_016_RULE_HEADER_CHANGE
  		  	       	       		             );

		return conversionDateDay;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE016RuleHeader () {
			
			int id = 16000;
			
			DataElementRuleHeaderField conversionDateMonth = getConversionDateMonthRule();
			DataElementRuleHeaderField conversionDateDay = getConversionDateMonthRule();
			
			storage.add(conversionDateMonth);
			storage.add(conversionDateDay);
			
			DataElementRuleHeader de016HeaderRule = new DE016RuleHeaderImpl(id, storage);
			
			return de016HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de016RuleHeader = new CreateDE016RuleHeader().createDE016RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de016RuleHeader,fieldList,codeList);
		
		}
}
