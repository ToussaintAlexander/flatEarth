package com.system.message.element.load;

import static com.system.message.element.DE053.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE053Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE053  {

	DataElementField keyManagementSchemeField 
	
		= new DataElementField ( KEY_MANAGEMENT_SCHEME_053_ID
					           , KEY_MANAGEMENT_SCHEME_053_FIELD
					           , KEY_MANAGEMENT_SCHEME_053_SUBFIELD
					           , KEY_MANAGEMENT_SCHEME_053_FORMAT
					           , KEY_MANAGEMENT_SCHEME_053_LENGTH
					           , KEY_MANAGEMENT_SCHEME_053_ENCODING
					           , KEY_MANAGEMENT_SCHEME_053_DATATYPE
					           , KEY_MANAGEMENT_SCHEME_053_SOURCE
					           , KEY_MANAGEMENT_SCHEME_053_DIRECTION
					           , KEY_MANAGEMENT_SCHEME_053_EXISTENCE
					           , KEY_MANAGEMENT_SCHEME_053_CHANGE
					           , KEY_MANAGEMENT_SCHEME_053_VALUE
					   	      );


	DataElementField keySetIdentifierField 
	
		= new DataElementField ( KEY_SET_IDENTIFIER_053_ID
					           , KEY_SET_IDENTIFIER_053_FIELD
					           , KEY_SET_IDENTIFIER_053_SUBFIELD
					           , KEY_SET_IDENTIFIER_053_FORMAT
					           , KEY_SET_IDENTIFIER_053_LENGTH
					           , KEY_SET_IDENTIFIER_053_ENCODING
					           , KEY_SET_IDENTIFIER_053_DATATYPE
					           , KEY_SET_IDENTIFIER_053_SOURCE
					           , KEY_SET_IDENTIFIER_053_DIRECTION
					           , KEY_SET_IDENTIFIER_053_EXISTENCE
					           , KEY_SET_IDENTIFIER_053_CHANGE
					           , KEY_SET_IDENTIFIER_053_VALUE
					   	      );
	

	DataElementField encryptionAlgorithmField 
	
		= new DataElementField ( ENCRYPTION_ALGORITHM_053_ID
					           , ENCRYPTION_ALGORITHM_053_FIELD
					           , ENCRYPTION_ALGORITHM_053_SUBFIELD
					           , ENCRYPTION_ALGORITHM_053_FORMAT
					           , ENCRYPTION_ALGORITHM_053_LENGTH
					           , ENCRYPTION_ALGORITHM_053_ENCODING
					           , ENCRYPTION_ALGORITHM_053_DATATYPE
					           , ENCRYPTION_ALGORITHM_053_SOURCE
					           , ENCRYPTION_ALGORITHM_053_DIRECTION
					           , ENCRYPTION_ALGORITHM_053_EXISTENCE
					           , ENCRYPTION_ALGORITHM_053_CHANGE
					           , ENCRYPTION_ALGORITHM_053_VALUE
					   	      );
	

	DataElementField keyLengthField 
	
		= new DataElementField ( KEY_LENGTH_053_ID
					           , KEY_LENGTH_053_FIELD
					           , KEY_LENGTH_053_SUBFIELD
					           , KEY_LENGTH_053_FORMAT
					           , KEY_LENGTH_053_LENGTH
					           , KEY_LENGTH_053_ENCODING
					           , KEY_LENGTH_053_DATATYPE
					           , KEY_LENGTH_053_SOURCE
					           , KEY_LENGTH_053_DIRECTION
					           , KEY_LENGTH_053_EXISTENCE
					           , KEY_LENGTH_053_CHANGE
					           , KEY_LENGTH_053_VALUE
					   	      );
	

	DataElementField protectionMechanismField 
	
		= new DataElementField ( PROTECTION_MECHANISM_053_ID
					           , PROTECTION_MECHANISM_053_FIELD
					           , PROTECTION_MECHANISM_053_SUBFIELD
					           , PROTECTION_MECHANISM_053_FORMAT
					           , PROTECTION_MECHANISM_053_LENGTH
					           , PROTECTION_MECHANISM_053_ENCODING
					           , PROTECTION_MECHANISM_053_DATATYPE
					           , PROTECTION_MECHANISM_053_SOURCE
					           , PROTECTION_MECHANISM_053_DIRECTION
					           , PROTECTION_MECHANISM_053_EXISTENCE
					           , PROTECTION_MECHANISM_053_CHANGE
					           , PROTECTION_MECHANISM_053_VALUE
					   	      );
	

	DataElementField reservedNationalField 
	
		= new DataElementField ( RESERVED_NATIONAL_053_ID
					           , RESERVED_NATIONAL_053_FIELD
					           , RESERVED_NATIONAL_053_SUBFIELD
					           , RESERVED_NATIONAL_053_FORMAT
					           , RESERVED_NATIONAL_053_LENGTH
					           , RESERVED_NATIONAL_053_ENCODING
					           , RESERVED_NATIONAL_053_DATATYPE
					           , RESERVED_NATIONAL_053_SOURCE
					           , RESERVED_NATIONAL_053_DIRECTION
					           , RESERVED_NATIONAL_053_EXISTENCE
					           , RESERVED_NATIONAL_053_CHANGE
					           , RESERVED_NATIONAL_053_VALUE
					   	      );
	

	DataElementField reservedPrivateField 
	
		= new DataElementField ( RESERVED_PRIVATE_053_ID
					           , RESERVED_PRIVATE_053_FIELD
					           , RESERVED_PRIVATE_053_SUBFIELD
					           , RESERVED_PRIVATE_053_FORMAT
					           , RESERVED_PRIVATE_053_LENGTH
					           , RESERVED_PRIVATE_053_ENCODING
					           , RESERVED_PRIVATE_053_DATATYPE
					           , RESERVED_PRIVATE_053_SOURCE
					           , RESERVED_PRIVATE_053_DIRECTION
					           , RESERVED_PRIVATE_053_EXISTENCE
					           , RESERVED_PRIVATE_053_CHANGE
					           , RESERVED_PRIVATE_053_VALUE
					   	      );
	
	
	public DE053Impl createDE053() {
		
		int id = 53000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		storage.add(keyManagementSchemeField);
		storage.add(keySetIdentifierField);
		storage.add(encryptionAlgorithmField);
		storage.add(keyLengthField);
		storage.add(protectionMechanismField);
		storage.add(reservedNationalField);
		storage.add(reservedPrivateField);
		
		DE053Impl de053 = new DE053Impl(id, storage);
		
		return de053;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE053 createDE053 = new CreateDE053(); 
		
		DE053Impl de053	= createDE053.createDE053(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de053, fieldList,codeList );
	
	}
}
