package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE063RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE063RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */
public class CreateDE063RuleHeader  {

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
											   BITMAP_063_RULE_HEADER_ID
											 , BITMAP_063_RULE_HEADER_FIELD
											 , BITMAP_063_RULE_HEADER_SUBFIELD
											 , BITMAP_063_RULE_HEADER_FIRE		
											 , BITMAP_063_RULE_HEADER_FORMAT
											 , BITMAP_063_RULE_HEADER_MINIMUM_LENGTH
											 , BITMAP_063_RULE_HEADER_MAXIMUM_LENGTH
											 , BITMAP_063_RULE_HEADER_ENCODING
											 , BITMAP_063_RULE_HEADER_DATATYPE
											 , BITMAP_063_RULE_HEADER_SOURCE
											 , BITMAP_063_RULE_HEADER_DIRECTION
											 , BITMAP_063_RULE_HEADER_EXISTENCE
											 , BITMAP_063_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField01;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField02() {
	
		DataElementRuleHeaderField dataElementField02 	 
		
			= new DataElementRuleHeaderField ( 
											   NETWORK_ID_CODE_063_RULE_HEADER_ID
											 , NETWORK_ID_CODE_063_RULE_HEADER_FIELD
											 , NETWORK_ID_CODE_063_RULE_HEADER_SUBFIELD
											 , NETWORK_ID_CODE_063_RULE_HEADER_FIRE		
											 , NETWORK_ID_CODE_063_RULE_HEADER_FORMAT
											 , NETWORK_ID_CODE_063_RULE_HEADER_MINIMUM_LENGTH
											 , NETWORK_ID_CODE_063_RULE_HEADER_MAXIMUM_LENGTH
											 , NETWORK_ID_CODE_063_RULE_HEADER_ENCODING
											 , NETWORK_ID_CODE_063_RULE_HEADER_DATATYPE
											 , NETWORK_ID_CODE_063_RULE_HEADER_SOURCE
											 , NETWORK_ID_CODE_063_RULE_HEADER_DIRECTION
											 , NETWORK_ID_CODE_063_RULE_HEADER_EXISTENCE
											 , NETWORK_ID_CODE_063_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField02;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField03() {
	
		DataElementRuleHeaderField dataElementField03 	 
		
			= new DataElementRuleHeaderField ( 
											   PREAUTH_TIME_LIMIT_063_RULE_HEADER_ID
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_FIELD
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_SUBFIELD
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_FIRE		
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_FORMAT
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_MINIMUM_LENGTH
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_MAXIMUM_LENGTH
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_ENCODING
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_DATATYPE
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_SOURCE
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_DIRECTION
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_EXISTENCE
											 , PREAUTH_TIME_LIMIT_063_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField03;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField04() {
	
		DataElementRuleHeaderField dataElementField04 	 
		
			= new DataElementRuleHeaderField ( 
											   MESSAGE_REASON_CODE_063_RULE_HEADER_ID
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_FIELD
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_SUBFIELD
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_FIRE		
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_FORMAT
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_MINIMUM_LENGTH
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_MAXIMUM_LENGTH
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_ENCODING
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_DATATYPE
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_SOURCE
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_DIRECTION
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_EXISTENCE
											 , MESSAGE_REASON_CODE_063_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField04;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */	
	public DataElementRuleHeaderField getDataElementRuleField05() {
	
		DataElementRuleHeaderField dataElementField05 	 
		
			= new DataElementRuleHeaderField ( 
											   STIP_SWITCH_REASON_CODE_063_RULE_HEADER_ID
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FIELD
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_SUBFIELD
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FIRE		
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_FORMAT
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_MINIMUM_LENGTH
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_MAXIMUM_LENGTH
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_ENCODING
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_DATATYPE
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_SOURCE
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_DIRECTION
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_EXISTENCE
											 , STIP_SWITCH_REASON_CODE_063_RULE_HEADER_CHANGE
  		  	       	       		             );

		return dataElementField05;
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
		public DataElementRuleHeader createDE063RuleHeader () {
			
			int id = 63000;
			
			DataElementRuleHeaderField dataElementField01 = getDataElementRuleField01();
			DataElementRuleHeaderField dataElementField02 = getDataElementRuleField02();
			DataElementRuleHeaderField dataElementField03 = getDataElementRuleField03();
			DataElementRuleHeaderField dataElementField04 = getDataElementRuleField04();
			DataElementRuleHeaderField dataElementField05 = getDataElementRuleField05();
			
			storage.add(dataElementField01);
			storage.add(dataElementField02);
			storage.add(dataElementField03);
			storage.add(dataElementField04);
			storage.add(dataElementField05);
			
			DataElementRuleHeader de063HeaderRule = new DE063RuleHeaderImpl(id, storage);
			
			return de063HeaderRule;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de063RuleHeader = new CreateDE063RuleHeader().createDE063RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de063RuleHeader,fieldList,codeList);
		
		}
}
		
