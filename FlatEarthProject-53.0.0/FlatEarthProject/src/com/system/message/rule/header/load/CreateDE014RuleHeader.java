package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE014RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE014RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE014RuleHeader  {

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
	public DataElementRuleHeaderField getExpirationDateYearRule() {
	
		DataElementRuleHeaderField expirationDateYearRuleField 	 
		
			= new DataElementRuleHeaderField ( 
				                               EXPIRATION_DATE_YEAR_014_RULE_HEADER_ID
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_FIELD
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_SUBFIELD
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_FIRE
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_FORMAT
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_MINIMUM_LENGTH
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_MAXIMUM_LENGTH
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_ENCODING
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_DATATYPE
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_SOURCE
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_DIRECTION
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_EXISTENCE
			                                 , EXPIRATION_DATE_YEAR_014_RULE_HEADER_CHANGE
  		  	       	       		             );

		return expirationDateYearRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getExpirationDateMonthRule() {
	
		DataElementRuleHeaderField expirationDateMonthRuleField 	 
		
			= new DataElementRuleHeaderField ( 
											   EXPIRATION_DATE_MONTH_014_RULE_HEADER_ID
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_FIELD
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_SUBFIELD
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_FIRE
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_FORMAT
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_MINIMUM_LENGTH
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_MAXIMUM_LENGTH
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_ENCODING
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_DATATYPE
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_SOURCE
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_DIRECTION
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_EXISTENCE
			           					     , EXPIRATION_DATE_MONTH_014_RULE_HEADER_CHANGE
  		  	       	       		             );

		return expirationDateMonthRuleField;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE014RuleHeader () {
			
			int id = 14000;
			
			DataElementRuleHeaderField expirationDateYearRuleField = getExpirationDateYearRule();
			DataElementRuleHeaderField expirationDateMonthRuleField = getExpirationDateMonthRule();
			
			storage.add(expirationDateYearRuleField);
			storage.add(expirationDateMonthRuleField);
			
			DataElementRuleHeader de014HeaderRule = new DE014RuleHeaderImpl(id, storage);
			
			return de014HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de014RuleHeader = new CreateDE014RuleHeader().createDE014RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de014RuleHeader,fieldList,codeList);
		
		}
}
