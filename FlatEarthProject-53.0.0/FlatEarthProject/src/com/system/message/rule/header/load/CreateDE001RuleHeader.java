package com.system.message.rule.header.load;

import static com.system.message.rule.header.DE001RuleHeader.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.header.DataElementRuleHeader;
import com.system.message.base.rule.header.DataElementRuleHeaderField;
import com.system.message.rule.header.impl.DE001RuleHeaderImpl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;
import com.system.message.utilties.message.RuleHeaderUtils;

/***********************************************************************************
 ***********************************************************************************
 */	
public class CreateDE001RuleHeader {

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
	public DataElementRuleHeaderField getPrimaryBitmap001RuleHeaderField() {
		
		DataElementRuleHeaderField primaryBitmap001RuleHeaderField 
		
			= new DataElementRuleHeaderField (  
									           PRIMARY_BITMAP_001_RULE_HEADER_ID
									         , PRIMARY_BITMAP_001_RULE_HEADER_FIELD
									         , PRIMARY_BITMAP_001_RULE_HEADER_SUBFIELD
									         , PRIMARY_BITMAP_001_RULE_HEADER_FIRE
									         , PRIMARY_BITMAP_001_RULE_HEADER_FORMAT
									         , PRIMARY_BITMAP_001_RULE_HEADER_MINIMUM_LENGTH
									         , PRIMARY_BITMAP_001_RULE_HEADER_MINIMUM_LENGTH
									         , PRIMARY_BITMAP_001_RULE_HEADER_ENCODING
									         , PRIMARY_BITMAP_001_RULE_HEADER_DATATYPE
									         , PRIMARY_BITMAP_001_RULE_HEADER_SOURCE
									         , PRIMARY_BITMAP_001_RULE_HEADER_DIRECTION
									         , PRIMARY_BITMAP_001_RULE_HEADER_EXISTENCE
									         , PRIMARY_BITMAP_001_RULE_HEADER_CHANGE
							          	     );
		
		return primaryBitmap001RuleHeaderField;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
		public DataElementRuleHeader createDE001RuleHeader() {
			
			int id = 1000;
			
			DataElementRuleHeaderField primaryBitmap001RuleHeaderField = getPrimaryBitmap001RuleHeaderField();
			
			storage.add(primaryBitmap001RuleHeaderField);
			
			DataElementRuleHeader de001RuleHeader = new DE001RuleHeaderImpl(id, storage);
			
			return de001RuleHeader;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleHeader de001RuleHeader	= new CreateDE001RuleHeader().createDE001RuleHeader(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleHeaderUtils().display(de001RuleHeader,fieldList,codeList);
		
		}
}