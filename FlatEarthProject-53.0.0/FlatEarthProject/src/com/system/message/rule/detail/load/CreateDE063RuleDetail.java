package com.system.message.rule.detail.load;

import static com.system.message.rule.detail.DE063RuleDetail.*;

import java.util.ArrayList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.rule.detail.impl.DE063RuleDetailImpl;
import com.system.message.utilties.message.RuleDetailUtils;
import com.system.message.utilties.codes.CodeTableUtils;
import com.system.message.utilties.message.CodeBean;
import com.system.message.utilties.message.FieldBean;
import com.system.message.utilties.message.FieldTableUtils;

public class CreateDE063RuleDetail  {

	DataElementRuleDetailField bitmapRuleField 	 

		= new DataElementRuleDetailField ( 
									       BITMAP_063_RULE_DETAIL_ID
		                                 , BITMAP_063_RULE_DETAIL_FIELD
		                                 , BITMAP_063_RULE_DETAIL_SUBFIELD
		                                 , BITMAP_063_RULE_DETAIL_FIRE
		                                 , BITMAP_063_RULE_DETAIL_TYPE
		                                 , BITMAP_063_RULE_DETAIL_GROUP
		                                 , BITMAP_063_RULE_DETAIL_BL
		                                 , BITMAP_063_RULE_DETAIL_AL
		                                 , BITMAP_063_RULE_DETAIL_TL
		                                 , BITMAP_063_RULE_DETAIL_SEQUENCE
		                                 , BITMAP_063_RULE_DETAIL_POINTER
		                                 , BITMAP_063_RULE_DETAIL_VALUE
		                                 , BITMAP_063_RULE_DETAIL_CU
		                                 , BITMAP_063_RULE_DETAIL_CT
		                                 , BITMAP_063_RULE_DETAIL_MU
		                                 , BITMAP_063_RULE_DETAIL_MT
	  		  	       	                 );


	DataElementRuleDetailField networkIdCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       NETWORK_ID_CODE_063_RULE_DETAIL_ID
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_FIELD
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_SUBFIELD
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_FIRE
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_TYPE
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_GROUP
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_BL
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_AL
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_TL
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_SEQUENCE
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_POINTER
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_VALUE
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_CU
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_CT
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_MU
		                                 , NETWORK_ID_CODE_063_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField preauthTimeLimitRuleField 	 

		= new DataElementRuleDetailField ( 
									       PREAUTH_TIME_LIMIT_063_RULE_DETAIL_ID
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_FIELD
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_SUBFIELD
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_FIRE
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_TYPE
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_GROUP
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_BL
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_AL
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_TL
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_SEQUENCE
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_POINTER
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_VALUE
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_CU
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_CT
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_MU
		                                 , PREAUTH_TIME_LIMIT_063_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField messageReasonCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       MESSAGE_REASON_CODE_063_RULE_DETAIL_ID
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_FIELD
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_SUBFIELD
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_FIRE
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_TYPE
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_GROUP
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_BL
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_AL
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_TL
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_SEQUENCE
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_POINTER
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_VALUE
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_CU
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_CT
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_MU
		                                 , MESSAGE_REASON_CODE_063_RULE_DETAIL_MT
	  		  	       	                 );
	

	DataElementRuleDetailField stipSwitchReasonCodeRuleField 	 

		= new DataElementRuleDetailField ( 
									       STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_ID
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_FIELD
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_SUBFIELD
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_FIRE
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_TYPE
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_GROUP
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_BL
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_AL
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_TL
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_SEQUENCE
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_POINTER
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_VALUE
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_CU
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_CT
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_MU
		                                 , STIP_SWITCH_REASON_CODE_063_RULE_DETAIL_MT
	  		  	       	                 );
	

		/***********************************************************************************
		 ***********************************************************************************
		 */			
		public DataElementRuleDetail createDE063RuleDetail() {
			
			int id = 63000;
			
			List<DataElementRuleDetailField> storage = new ArrayList<DataElementRuleDetailField>();
			
			storage.add(bitmapRuleField);
			storage.add(networkIdCodeRuleField);
			storage.add(preauthTimeLimitRuleField);
			storage.add(messageReasonCodeRuleField);
			storage.add(stipSwitchReasonCodeRuleField);
			
			DataElementRuleDetail de063RuleDetail = new DE063RuleDetailImpl(id, storage);
			
			return de063RuleDetail;
	
		}
		/***********************************************************************************
		 ***********************************************************************************
		 */
		public static void main(String[] args) {
		
			DataElementRuleDetail de063RuleDetail = new CreateDE063RuleDetail().createDE063RuleDetail(); 
			
			List<FieldBean> fieldList =  new FieldTableUtils().createFields();
			
			List<CodeBean> codeList =  new CodeTableUtils().createCodes();
			
			new RuleDetailUtils().display(de063RuleDetail, fieldList,codeList );
		
		}
}
