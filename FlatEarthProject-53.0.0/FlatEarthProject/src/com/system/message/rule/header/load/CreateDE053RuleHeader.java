package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE053RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE053RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE053RuleHeader  {

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
											   KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_ID
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FIELD
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_SUBFIELD
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FIRE		
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_FORMAT
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_MINIMUM_LENGTH
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_MAXIMUM_LENGTH
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_ENCODING
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_DATATYPE
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_SOURCE
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_DIRECTION
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_EXISTENCE
											 , KEY_MANAGEMENT_SCHEME_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   KEY_SET_IDENTIFIER_053_RULE_HEADER_ID
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_FIELD
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_SUBFIELD
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_FIRE		
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_FORMAT
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_MINIMUM_LENGTH
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_MAXIMUM_LENGTH
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_ENCODING
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_DATATYPE
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_SOURCE
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_DIRECTION
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_EXISTENCE
											 , KEY_SET_IDENTIFIER_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   ENCRYPTION_ALGORITHM_053_RULE_HEADER_ID
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_FIELD
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_SUBFIELD
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_FIRE		
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_FORMAT
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_MINIMUM_LENGTH
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_MAXIMUM_LENGTH
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_ENCODING
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_DATATYPE
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_SOURCE
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_DIRECTION
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_EXISTENCE
											 , ENCRYPTION_ALGORITHM_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   KEY_LENGTH_053_RULE_HEADER_ID
											 , KEY_LENGTH_053_RULE_HEADER_FIELD
											 , KEY_LENGTH_053_RULE_HEADER_SUBFIELD
											 , KEY_LENGTH_053_RULE_HEADER_FIRE		
											 , KEY_LENGTH_053_RULE_HEADER_FORMAT
											 , KEY_LENGTH_053_RULE_HEADER_MINIMUM_LENGTH
											 , KEY_LENGTH_053_RULE_HEADER_MAXIMUM_LENGTH
											 , KEY_LENGTH_053_RULE_HEADER_ENCODING
											 , KEY_LENGTH_053_RULE_HEADER_DATATYPE
											 , KEY_LENGTH_053_RULE_HEADER_SOURCE
											 , KEY_LENGTH_053_RULE_HEADER_DIRECTION
											 , KEY_LENGTH_053_RULE_HEADER_EXISTENCE
											 , KEY_LENGTH_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   PROTECTION_MECHANISM_053_RULE_HEADER_ID
											 , PROTECTION_MECHANISM_053_RULE_HEADER_FIELD
											 , PROTECTION_MECHANISM_053_RULE_HEADER_SUBFIELD
											 , PROTECTION_MECHANISM_053_RULE_HEADER_FIRE		
											 , PROTECTION_MECHANISM_053_RULE_HEADER_FORMAT
											 , PROTECTION_MECHANISM_053_RULE_HEADER_MINIMUM_LENGTH
											 , PROTECTION_MECHANISM_053_RULE_HEADER_MAXIMUM_LENGTH
											 , PROTECTION_MECHANISM_053_RULE_HEADER_ENCODING
											 , PROTECTION_MECHANISM_053_RULE_HEADER_DATATYPE
											 , PROTECTION_MECHANISM_053_RULE_HEADER_SOURCE
											 , PROTECTION_MECHANISM_053_RULE_HEADER_DIRECTION
											 , PROTECTION_MECHANISM_053_RULE_HEADER_EXISTENCE
											 , PROTECTION_MECHANISM_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField06() {
	
		DataElementRuleHeaderField dataElementField06 	 
		
			= new DataElementRuleHeaderField ( 
											   RESERVED_NATIONAL_053_RULE_HEADER_ID
											 , RESERVED_NATIONAL_053_RULE_HEADER_FIELD
											 , RESERVED_NATIONAL_053_RULE_HEADER_SUBFIELD
											 , RESERVED_NATIONAL_053_RULE_HEADER_FIRE		
											 , RESERVED_NATIONAL_053_RULE_HEADER_FORMAT
											 , RESERVED_NATIONAL_053_RULE_HEADER_MINIMUM_LENGTH
											 , RESERVED_NATIONAL_053_RULE_HEADER_MAXIMUM_LENGTH
											 , RESERVED_NATIONAL_053_RULE_HEADER_ENCODING
											 , RESERVED_NATIONAL_053_RULE_HEADER_DATATYPE
											 , RESERVED_NATIONAL_053_RULE_HEADER_SOURCE
											 , RESERVED_NATIONAL_053_RULE_HEADER_DIRECTION
											 , RESERVED_NATIONAL_053_RULE_HEADER_EXISTENCE
											 , RESERVED_NATIONAL_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField06;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField07() {
	
		DataElementRuleHeaderField dataElementField07 	 
		
			= new DataElementRuleHeaderField ( 
											   RESERVED_PRIVATE_053_RULE_HEADER_ID
											 , RESERVED_PRIVATE_053_RULE_HEADER_FIELD
											 , RESERVED_PRIVATE_053_RULE_HEADER_SUBFIELD
											 , RESERVED_PRIVATE_053_RULE_HEADER_FIRE		
											 , RESERVED_PRIVATE_053_RULE_HEADER_FORMAT
											 , RESERVED_PRIVATE_053_RULE_HEADER_MINIMUM_LENGTH
											 , RESERVED_PRIVATE_053_RULE_HEADER_MAXIMUM_LENGTH
											 , RESERVED_PRIVATE_053_RULE_HEADER_ENCODING
											 , RESERVED_PRIVATE_053_RULE_HEADER_DATATYPE
											 , RESERVED_PRIVATE_053_RULE_HEADER_SOURCE
											 , RESERVED_PRIVATE_053_RULE_HEADER_DIRECTION
											 , RESERVED_PRIVATE_053_RULE_HEADER_EXISTENCE
											 , RESERVED_PRIVATE_053_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField07;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE053RuleHeader () {
			
			int id = 53000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			DataElementRuleHeaderField dataElementField06 = getDataElementRuleField06();
			DataElementRuleHeaderField dataElementField07 = getDataElementRuleField07();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			storage.add(dataElementField06);
			storage.add(dataElementField07);
			
			DataElementRuleHeader de053HeaderRule = new DE053RuleHeaderImpl(id, storage);
			
			return de053HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de053RuleHeader = new CreateDE053RuleHeader().createDE053RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de053RuleHeader,fieldList,codeList);
		
		}
}
