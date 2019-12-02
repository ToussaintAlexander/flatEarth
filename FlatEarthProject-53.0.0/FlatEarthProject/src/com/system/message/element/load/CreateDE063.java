package com.system.message.element.load;

import static com.system.message.element.DE063.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE063Impl;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.ElementUtils;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE063  {

	DataElementField bitmapField 
	
		= new DataElementField ( BITMAP_063_ID
					           , BITMAP_063_FIELD
					           , BITMAP_063_SUBFIELD
					           , BITMAP_063_FORMAT
					           , BITMAP_063_LENGTH
					           , BITMAP_063_ENCODING
					           , BITMAP_063_DATATYPE
					           , BITMAP_063_SOURCE
					           , BITMAP_063_DIRECTION
					           , BITMAP_063_EXISTENCE
					           , BITMAP_063_CHANGE
					           , BITMAP_063_VALUE
					   	      );


	DataElementField networkIdCodeField 
	
		= new DataElementField ( NETWORK_ID_CODE_063_ID
					           , NETWORK_ID_CODE_063_FIELD
					           , NETWORK_ID_CODE_063_SUBFIELD
					           , NETWORK_ID_CODE_063_FORMAT
					           , NETWORK_ID_CODE_063_LENGTH
					           , NETWORK_ID_CODE_063_ENCODING
					           , NETWORK_ID_CODE_063_DATATYPE
					           , NETWORK_ID_CODE_063_SOURCE
					           , NETWORK_ID_CODE_063_DIRECTION
					           , NETWORK_ID_CODE_063_EXISTENCE
					           , NETWORK_ID_CODE_063_CHANGE
					           , NETWORK_ID_CODE_063_VALUE
					   	      );
	

	DataElementField preauthTimeLimitField 
	
		= new DataElementField ( PREAUTH_TIME_LIMIT_063_ID
					           , PREAUTH_TIME_LIMIT_063_FIELD
					           , PREAUTH_TIME_LIMIT_063_SUBFIELD
					           , PREAUTH_TIME_LIMIT_063_FORMAT
					           , PREAUTH_TIME_LIMIT_063_LENGTH
					           , PREAUTH_TIME_LIMIT_063_ENCODING
					           , PREAUTH_TIME_LIMIT_063_DATATYPE
					           , PREAUTH_TIME_LIMIT_063_SOURCE
					           , PREAUTH_TIME_LIMIT_063_DIRECTION
					           , PREAUTH_TIME_LIMIT_063_EXISTENCE
					           , PREAUTH_TIME_LIMIT_063_CHANGE
					           , PREAUTH_TIME_LIMIT_063_VALUE
					   	      );
	

	DataElementField messageReasonCodeField 
	
		= new DataElementField ( MESSAGE_REASON_CODE_063_ID
					           , MESSAGE_REASON_CODE_063_FIELD
					           , MESSAGE_REASON_CODE_063_SUBFIELD
					           , MESSAGE_REASON_CODE_063_FORMAT
					           , MESSAGE_REASON_CODE_063_LENGTH
					           , MESSAGE_REASON_CODE_063_ENCODING
					           , MESSAGE_REASON_CODE_063_DATATYPE
					           , MESSAGE_REASON_CODE_063_SOURCE
					           , MESSAGE_REASON_CODE_063_DIRECTION
					           , MESSAGE_REASON_CODE_063_EXISTENCE
					           , MESSAGE_REASON_CODE_063_CHANGE
					           , MESSAGE_REASON_CODE_063_VALUE
					   	      );
	

	DataElementField stipSwitchReasonCodeField 
	
		= new DataElementField ( STIP_SWITCH_REASON_CODE_063_ID
					           , STIP_SWITCH_REASON_CODE_063_FIELD
					           , STIP_SWITCH_REASON_CODE_063_SUBFIELD
					           , STIP_SWITCH_REASON_CODE_063_FORMAT
					           , STIP_SWITCH_REASON_CODE_063_LENGTH
					           , STIP_SWITCH_REASON_CODE_063_ENCODING
					           , STIP_SWITCH_REASON_CODE_063_DATATYPE
					           , STIP_SWITCH_REASON_CODE_063_SOURCE
					           , STIP_SWITCH_REASON_CODE_063_DIRECTION
					           , STIP_SWITCH_REASON_CODE_063_EXISTENCE
					           , STIP_SWITCH_REASON_CODE_063_CHANGE
					           , STIP_SWITCH_REASON_CODE_063_VALUE
					   	      );
	
	public DE063Impl createDE063() {
		
		int id = 63000;
		
		List<DataElementField> storage = new ArrayList<DataElementField>();
		
		storage.add(bitmapField);
		storage.add(networkIdCodeField);
		storage.add(preauthTimeLimitField);
		storage.add(messageReasonCodeField);
		storage.add(stipSwitchReasonCodeField);
		
		DE063Impl de063 = new DE063Impl(id, storage);
		
		return de063;

	}
	/***********************************************************************************
	 ***********************************************************************************
	 */
	public static void main(String[] args) {
	
		CreateDE063 createDE063 = new CreateDE063(); 
		
		DE063Impl de063	= createDE063.createDE063(); 
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display(de063, fieldList,codeList );
	
	}
}
