package com.system.message.utilties.message;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

import com.system.message.base.rule.detail.DataElementRuleDetail;
import com.system.message.base.rule.detail.DataElementRuleDetailField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.rule.detail.load.CreateDE000RuleDetail;
import com.system.message.rule.detail.load.CreateDE001RuleDetail;
import com.system.message.rule.detail.load.CreateDE002RuleDetail;
import com.system.message.rule.detail.load.CreateDE003RuleDetail;
import com.system.message.rule.detail.load.CreateDE004RuleDetail;
import com.system.message.rule.detail.load.CreateDE005RuleDetail;
import com.system.message.rule.detail.load.CreateDE006RuleDetail;
import com.system.message.rule.detail.load.CreateDE007RuleDetail;
import com.system.message.rule.detail.load.CreateDE008RuleDetail;
import com.system.message.rule.detail.load.CreateDE009RuleDetail;
import com.system.message.rule.detail.load.CreateDE010RuleDetail;
import com.system.message.rule.detail.load.CreateDE011RuleDetail;
import com.system.message.rule.detail.load.CreateDE012RuleDetail;
import com.system.message.rule.detail.load.CreateDE013RuleDetail;
import com.system.message.rule.detail.load.CreateDE014RuleDetail;
import com.system.message.rule.detail.load.CreateDE015RuleDetail;
import com.system.message.rule.detail.load.CreateDE016RuleDetail;
import com.system.message.rule.detail.load.CreateDE017RuleDetail;
import com.system.message.rule.detail.load.CreateDE018RuleDetail;
import com.system.message.rule.detail.load.CreateDE019RuleDetail;
import com.system.message.rule.detail.load.CreateDE020RuleDetail;
import com.system.message.rule.detail.load.CreateDE021RuleDetail;
import com.system.message.rule.detail.load.CreateDE022RuleDetail;
import com.system.message.rule.detail.load.CreateDE023RuleDetail;
import com.system.message.rule.detail.load.CreateDE024RuleDetail;
import com.system.message.rule.detail.load.CreateDE025RuleDetail;
import com.system.message.rule.detail.load.CreateDE026RuleDetail;
import com.system.message.rule.detail.load.CreateDE027RuleDetail;
import com.system.message.rule.detail.load.CreateDE028RuleDetail;
import com.system.message.rule.detail.load.CreateDE029RuleDetail;
import com.system.message.rule.detail.load.CreateDE030RuleDetail;
import com.system.message.rule.detail.load.CreateDE031RuleDetail;
import com.system.message.rule.detail.load.CreateDE032RuleDetail;
import com.system.message.rule.detail.load.CreateDE033RuleDetail;
import com.system.message.rule.detail.load.CreateDE034RuleDetail;
import com.system.message.rule.detail.load.CreateDE035RuleDetail;
import com.system.message.rule.detail.load.CreateDE036RuleDetail;
import com.system.message.rule.detail.load.CreateDE037RuleDetail;
import com.system.message.rule.detail.load.CreateDE038RuleDetail;
import com.system.message.rule.detail.load.CreateDE039RuleDetail;
import com.system.message.rule.detail.load.CreateDE040RuleDetail;
import com.system.message.rule.detail.load.CreateDE041RuleDetail;
import com.system.message.rule.detail.load.CreateDE042RuleDetail;
import com.system.message.rule.detail.load.CreateDE043RuleDetail;
import com.system.message.rule.detail.load.CreateDE044RuleDetail;
import com.system.message.rule.detail.load.CreateDE045RuleDetail;
import com.system.message.rule.detail.load.CreateDE046RuleDetail;
import com.system.message.rule.detail.load.CreateDE047RuleDetail;
import com.system.message.rule.detail.load.CreateDE048RuleDetail;
import com.system.message.rule.detail.load.CreateDE049RuleDetail;
import com.system.message.rule.detail.load.CreateDE050RuleDetail;
import com.system.message.rule.detail.load.CreateDE051RuleDetail;
import com.system.message.rule.detail.load.CreateDE052RuleDetail;
import com.system.message.rule.detail.load.CreateDE053RuleDetail;
import com.system.message.rule.detail.load.CreateDE054RuleDetail;
import com.system.message.rule.detail.load.CreateDE055RuleDetail;
import com.system.message.rule.detail.load.CreateDE056RuleDetail;
import com.system.message.rule.detail.load.CreateDE057RuleDetail;
import com.system.message.rule.detail.load.CreateDE058RuleDetail;
import com.system.message.rule.detail.load.CreateDE059RuleDetail;
import com.system.message.rule.detail.load.CreateDE060RuleDetail;
import com.system.message.rule.detail.load.CreateDE061RuleDetail;
import com.system.message.rule.detail.load.CreateDE062RuleDetail;
import com.system.message.rule.detail.load.CreateDE063RuleDetail;
import com.system.message.rule.detail.load.CreateDE064RuleDetail;
import com.system.message.utilties.codes.CodeTableUtils;

public class RuleDetailUtils {

	/************************************************************************* 
	 ************************************************************************* 
	 */
	public void parseField (DataElementRuleDetailField ruleDetail, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		
		
		String fieldName = fieldList.get(ruleDetail.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(ruleDetail.getField()).getSubFieldName() != null 
			? fieldList.get(ruleDetail.getField()).getSubFieldName().get(ruleDetail.getSubField()) : "null";
			
	//--------------------------------------------------------------------------------------------------------------------
		
		System.out.println();
		
		System.out.println("Rule Detail Object ID...........: " + ruleDetail.getId()	);
		
		System.out.format ("Rule Detail Object Field....... : %6s %s %s\n" , ruleDetail.getField()     , ": " , fieldName    			);
		System.out.format ("Rule Detail Object Subfield.... : %6s %s %s\n" , ruleDetail.getSubField()  , ": " , subfieldName 			);
		
		System.out.format ("Rule Detail Object Rule Fire... : %6s %s %s\n" , ruleDetail.isFire()   		, ": " , ruleDetail.isFire() 	);
		System.out.format ("Rule Detail Object Rule Type... : %6s %s %s\n" , ruleDetail.getType()   	, ": " , ruleDetail.getType() 	);
		System.out.format ("Rule Detail Object Rule Group.. : %6s %s %s\n" , ruleDetail.getGroup()  	, ": " , ruleDetail.getGroup() 	);

		System.out.format ("Rule Detail Object BIN Level... : %6s %s %s\n" , ruleDetail.getbLevel()  	, ": " , ruleDetail.getbLevel() );
		System.out.format ("Rule Detail Object Acct Level.. : %6s %s %s\n" , ruleDetail.getaLevel()   	, ": " , ruleDetail.getaLevel() );
		System.out.format ("Rule Detail Object Trans Level. : %6s %s %s\n" , ruleDetail.gettLevel()  	, ": " , ruleDetail.gettLevel() );
		
		System.out.format ("Rule Detail Object Sequence.... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getSequence() 					);
		System.out.format ("Rule Detail Object Pointer..... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getPointer() 					);
		System.out.format ("Rule Detail Object Value....... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getValue() 						);
		
		System.out.format ("Rule Detail Object C User...... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getCreateUser() 				);
		System.out.format ("Rule Detail Object C Time...... : %6s %s %s\n" , ""   	, ": " , ruleDetail.getCreateTimestamp() 			);
		System.out.format ("Rule Detail Object M User...... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getModifyUser() 				);
		System.out.format ("Rule Detail Object M Time...... : %6s %s %s\n" , ""  	, ": " , ruleDetail.getModifyTimestamp() 			);
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void display (List<DataElementRuleDetail> ruleDetailList, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		BitSet bitMap = new DE001Impl().getBitMap();
		
		for (int dataElement = 0; dataElement < ruleDetailList.size() - 54; dataElement++) {	 
			
			if (bitMap.get(dataElement)) {

				int maximumSubfields = ruleDetailList.get(dataElement).getStorage().size();
				
				for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {
					 
					parseField (ruleDetailList.get(dataElement).getStorage().get(subfieldIndex), fieldList, codeList);
	
				}
			}
		}
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void display (DataElementRuleDetail ruleDetail, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		int maximumSubfields = ruleDetail.getStorage().size();
			
		for (int subfieldIndex = 0; subfieldIndex < maximumSubfields; subfieldIndex++ ) {
					 
			parseField (ruleDetail.getStorage().get(subfieldIndex)   , fieldList, codeList);
	
		}
		
	}
	/*****************************************************************************************
	 *****************************************************************************************
	 */
	public List<DataElementRuleDetail> buildRuleDetails () {
		
		List <DataElementRuleDetail> ruleDetailList = new LinkedList<DataElementRuleDetail>();
		
		ruleDetailList.add(new CreateDE000RuleDetail().createDE000RuleDetail());
		ruleDetailList.add(new CreateDE001RuleDetail().createDE001RuleDetail());
		ruleDetailList.add(new CreateDE002RuleDetail().createDE002RuleDetail());
		ruleDetailList.add(new CreateDE003RuleDetail().createDE003RuleDetail());
		ruleDetailList.add(new CreateDE004RuleDetail().createDE004RuleDetail());
		ruleDetailList.add(new CreateDE005RuleDetail().createDE005RuleDetail());
		ruleDetailList.add(new CreateDE006RuleDetail().createDE006RuleDetail());
		ruleDetailList.add(new CreateDE007RuleDetail().createDE007RuleDetail());
		ruleDetailList.add(new CreateDE008RuleDetail().createDE008RuleDetail());
		ruleDetailList.add(new CreateDE009RuleDetail().createDE009RuleDetail());
		
		ruleDetailList.add(new CreateDE010RuleDetail().createDE010RuleDetail());
		ruleDetailList.add(new CreateDE011RuleDetail().createDE011RuleDetail());
		ruleDetailList.add(new CreateDE012RuleDetail().createDE012RuleDetail());
		ruleDetailList.add(new CreateDE013RuleDetail().createDE013RuleDetail());
		ruleDetailList.add(new CreateDE014RuleDetail().createDE014RuleDetail());
		ruleDetailList.add(new CreateDE015RuleDetail().createDE015RuleDetail());
		ruleDetailList.add(new CreateDE016RuleDetail().createDE016RuleDetail());
		ruleDetailList.add(new CreateDE017RuleDetail().createDE017RuleDetail());
		ruleDetailList.add(new CreateDE018RuleDetail().createDE018RuleDetail());
		ruleDetailList.add(new CreateDE019RuleDetail().createDE019RuleDetail());		
		
		ruleDetailList.add(new CreateDE020RuleDetail().createDE020RuleDetail());
		ruleDetailList.add(new CreateDE021RuleDetail().createDE021RuleDetail());
		ruleDetailList.add(new CreateDE022RuleDetail().createDE022RuleDetail());
		ruleDetailList.add(new CreateDE023RuleDetail().createDE023RuleDetail());
		ruleDetailList.add(new CreateDE024RuleDetail().createDE024RuleDetail());
		ruleDetailList.add(new CreateDE025RuleDetail().createDE025RuleDetail());
		ruleDetailList.add(new CreateDE026RuleDetail().createDE026RuleDetail());
		ruleDetailList.add(new CreateDE027RuleDetail().createDE027RuleDetail());
		ruleDetailList.add(new CreateDE028RuleDetail().createDE028RuleDetail());
		ruleDetailList.add(new CreateDE029RuleDetail().createDE029RuleDetail());		
		
		ruleDetailList.add(new CreateDE030RuleDetail().createDE030RuleDetail());
		ruleDetailList.add(new CreateDE031RuleDetail().createDE031RuleDetail());
		ruleDetailList.add(new CreateDE032RuleDetail().createDE032RuleDetail());
		ruleDetailList.add(new CreateDE033RuleDetail().createDE033RuleDetail());
		ruleDetailList.add(new CreateDE034RuleDetail().createDE034RuleDetail());
		ruleDetailList.add(new CreateDE035RuleDetail().createDE035RuleDetail());
		ruleDetailList.add(new CreateDE036RuleDetail().createDE036RuleDetail());
		ruleDetailList.add(new CreateDE037RuleDetail().createDE037RuleDetail());
		ruleDetailList.add(new CreateDE038RuleDetail().createDE038RuleDetail());
		ruleDetailList.add(new CreateDE039RuleDetail().createDE039RuleDetail());		
		
		ruleDetailList.add(new CreateDE040RuleDetail().createDE040RuleDetail());
		ruleDetailList.add(new CreateDE041RuleDetail().createDE041RuleDetail());
		ruleDetailList.add(new CreateDE042RuleDetail().createDE042RuleDetail());
		ruleDetailList.add(new CreateDE043RuleDetail().createDE043RuleDetail());
		ruleDetailList.add(new CreateDE044RuleDetail().createDE044RuleDetail());
		ruleDetailList.add(new CreateDE045RuleDetail().createDE045RuleDetail());
		ruleDetailList.add(new CreateDE046RuleDetail().createDE046RuleDetail());
		ruleDetailList.add(new CreateDE047RuleDetail().createDE047RuleDetail());
		ruleDetailList.add(new CreateDE048RuleDetail().createDE048RuleDetail());
		ruleDetailList.add(new CreateDE049RuleDetail().createDE049RuleDetail());		
		
		ruleDetailList.add(new CreateDE050RuleDetail().createDE050RuleDetail());
		ruleDetailList.add(new CreateDE051RuleDetail().createDE051RuleDetail());
		ruleDetailList.add(new CreateDE052RuleDetail().createDE052RuleDetail());
		ruleDetailList.add(new CreateDE053RuleDetail().createDE053RuleDetail());
		ruleDetailList.add(new CreateDE054RuleDetail().createDE054RuleDetail());
		ruleDetailList.add(new CreateDE055RuleDetail().createDE055RuleDetail());
		ruleDetailList.add(new CreateDE056RuleDetail().createDE056RuleDetail());
		ruleDetailList.add(new CreateDE057RuleDetail().createDE057RuleDetail());
		ruleDetailList.add(new CreateDE058RuleDetail().createDE058RuleDetail());
		ruleDetailList.add(new CreateDE059RuleDetail().createDE059RuleDetail());		
		
		ruleDetailList.add(new CreateDE060RuleDetail().createDE060RuleDetail());
		ruleDetailList.add(new CreateDE061RuleDetail().createDE061RuleDetail());
		ruleDetailList.add(new CreateDE062RuleDetail().createDE062RuleDetail());
		ruleDetailList.add(new CreateDE063RuleDetail().createDE063RuleDetail());
		ruleDetailList.add(new CreateDE064RuleDetail().createDE064RuleDetail());
		
		return ruleDetailList;
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	
	public static void main(String[] args) {

		List <DataElementRuleDetail> ruleKeyList = new RuleDetailUtils().buildRuleDetails();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new RuleDetailUtils().display (ruleKeyList, fieldList, codeList);
		
	}
}
