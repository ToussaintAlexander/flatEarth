package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE053RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE053RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE053RuleDetail  {

	DataElementRuleDetailField keyManagementSchemeRuleField 	 

		= new DataElementRuleDetailField ( 
									       KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_ID
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_FIELD
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_SUBFIELD
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_FIRE
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_TYPE
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_GROUP
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_BL
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_AL
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_TL
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_SEQUENCE
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_POINTER
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_VALUE
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_CU
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_CT
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_MU
		                                 , KEY_MANAGEMENT_SCHEME_053_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField keySetIdentifierRuleField 	 

		= new DataElementRuleDetailField ( 
									       KEY_SET_IDENTIFIER_053_RULE_DETAIL_ID
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_FIELD
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_SUBFIELD
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_FIRE
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_TYPE
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_GROUP
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_BL
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_AL
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_TL
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_SEQUENCE
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_POINTER
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_VALUE
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_CU
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_CT
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_MU
		                                 , KEY_SET_IDENTIFIER_053_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField encryptionAlgorithmRuleField 	 

		= new DataElementRuleDetailField ( 
									       ENCRYPTION_ALGORITHM_053_RULE_DETAIL_ID
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_FIELD
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_SUBFIELD
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_FIRE
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_TYPE
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_GROUP
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_BL
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_AL
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_TL
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_SEQUENCE
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_POINTER
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_VALUE
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_CU
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_CT
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_MU
		                                 , ENCRYPTION_ALGORITHM_053_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField keyLengthRuleField 	 

		= new DataElementRuleDetailField ( 
									       KEY_LENGTH_053_RULE_DETAIL_ID
		                                 , KEY_LENGTH_053_RULE_DETAIL_FIELD
		                                 , KEY_LENGTH_053_RULE_DETAIL_SUBFIELD
		                                 , KEY_LENGTH_053_RULE_DETAIL_FIRE
		                                 , KEY_LENGTH_053_RULE_DETAIL_TYPE
		                                 , KEY_LENGTH_053_RULE_DETAIL_GROUP
		                                 , KEY_LENGTH_053_RULE_DETAIL_BL
		                                 , KEY_LENGTH_053_RULE_DETAIL_AL
		                                 , KEY_LENGTH_053_RULE_DETAIL_TL
		                                 , KEY_LENGTH_053_RULE_DETAIL_SEQUENCE
		                                 , KEY_LENGTH_053_RULE_DETAIL_POINTER
		                                 , KEY_LENGTH_053_RULE_DETAIL_VALUE
		                                 , KEY_LENGTH_053_RULE_DETAIL_CU
		                                 , KEY_LENGTH_053_RULE_DETAIL_CT
		                                 , KEY_LENGTH_053_RULE_DETAIL_MU
		                                 , KEY_LENGTH_053_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField protectionMechanismRuleField 	 

		= new DataElementRuleDetailField ( 
									       PROTECTION_MECHANISM_053_RULE_DETAIL_ID
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_FIELD
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_SUBFIELD
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_FIRE
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_TYPE
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_GROUP
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_BL
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_AL
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_TL
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_SEQUENCE
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_POINTER
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_VALUE
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_CU
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_CT
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_MU
		                                 , PROTECTION_MECHANISM_053_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField reservedNationalRuleField 	 

		= new DataElementRuleDetailField ( 
									       RESERVED_NATIONAL_053_RULE_DETAIL_ID
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_FIELD
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_SUBFIELD
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_FIRE
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_TYPE
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_GROUP
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_BL
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_AL
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_TL
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_SEQUENCE
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_POINTER
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_VALUE
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_CU
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_CT
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_MU
		                                 , RESERVED_NATIONAL_053_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField reservedPrivateRuleField 	 

		= new DataElementRuleDetailField ( 
									       RESERVED_PRIVATE_053_RULE_DETAIL_ID
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_FIELD
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_SUBFIELD
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_FIRE
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_TYPE
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_GROUP
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_BL
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_AL
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_TL
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_SEQUENCE
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_POINTER
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_VALUE
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_CU
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_CT
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_MU
		                                 , RESERVED_PRIVATE_053_RULE_DETAIL_MT
	  		  	       	                 );
	
		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE053RuleDetail() {
			
			int id = 53000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			storage.add(keyManagementSchemeRuleField);
			storage.add(keySetIdentifierRuleField);
			storage.add(encryptionAlgorithmRuleField);
			storage.add(keyLengthRuleField);
			storage.add(protectionMechanismRuleField);
			storage.add(reservedNationalRuleField);
			storage.add(reservedPrivateRuleField);
			
			DataElementRuleDetail de053RuleDetail = new DE053RuleDetailImpl(id, storage);
			
			return de053RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de053RuleDetail = new CreateDE053RuleDetail().createDE053RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de053RuleDetail, fieldList,codeList );
		
		}
}
