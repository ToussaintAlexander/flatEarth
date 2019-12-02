package flatearth.internal.domain.element.rule;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import flatearth.external.technical.specifications.Storage;
import flatearth.external.technical.specifications.Usage;
import flatearth.internal.domain.element.mandatory.impl.DE002Impl;
import flatearth.internal.domain.element.response.base.Response;
import flatearth.internal.domain.element.rule.mandatory.DE002Rule;
import flatearth.internal.domain.element.rule.mandatory.impl.DE002RuleImpl;

import static flatearth.common.utilities.BitMap.getBitMap;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestDE002RuleImpl extends DE002RuleImpl  {

	public static DE002Impl				de002Impl 		= new DE002Impl();
	public static DE002Rule				de002RuleImpl 	= new DE002RuleImpl();
	
	public static Usage					usageDb			= new Usage();
	public static Usage					usageTrans		= new Usage();
	
	public static List<Storage>			storageDb		= new ArrayList<Storage>();
	public static List<Storage>			storageTrans	= new ArrayList<Storage>();
	
	public static final int 			PAN_LENGTH		= 16;
	
	public Response 					response		= new Response();
	/***************************************************************
	 ***************************************************************/	
	public Response getResponse() {
		return response;
	}
	
	public void setResponse(Response response) {
		this.response = response;
	}
	/***************************************************************
	 ***************************************************************/
	@BeforeClass
	public static void getElementRuleTest() {

		System.out.println();
		System.out.println("-----> @BeforeClass: getElementRuleTest ()        <-----");
		System.out.println();
		
		int id = 1;
		String tagRule = "PANr";
		String accountNumber = "4501250000000005";
		
		usageDb = new Usage( 1
					       , COURIER_SYSTEM
					       , AMERICAN_REGION
					       , AIRLINE_PLATFORM
					       , MSG_TYPE_0100
					       , MANDATORY_ECHO_STATUS
					       );
		
		assertNotNull("usageDb is null", usageDb);
		
		assertTrue ("hello",usageDb.getId() == id);
		assertTrue (usageDb.getSystem().equalsIgnoreCase("COURIER"));
		assertTrue (usageDb.getRegion().equalsIgnoreCase("AMERICAN"));
		assertTrue (usageDb.getPlatform().equalsIgnoreCase("AIRLINE"));
		assertTrue (usageDb.getMessageType().equalsIgnoreCase("0100"));
		assertTrue (usageDb.getStatus().equalsIgnoreCase("MANDATORY_ECHO"));

/*
	public StorageDE002(  int id
						, String tag
						, int startPosition
						, int endPosition
						, String encoding
						, String dataType
						, String value
						, String startBINRange
						, String endBINRange
						, String checkDigit
						, String pAN
						)  		
 
		
		StorageDE002 storageItem = null; //new StorageDE002( 1
										           , tagRule
										           , PAN_LENGTH
										           , ASCII_ENCODING
										           , NUMBER_DATATYPE
										           , accountNumber
										           ,"450125"
										           ,"450126"
										           ,"3"
										           ,accountNumber
										 		   );
		
		assertNotNull("storageItem is null", storageItem);
		
		assertTrue ("hello",storageItem.getId() == id);
		assertTrue (storageItem.getTag().equalsIgnoreCase("PANr"));
		assertTrue (storageItem.getLength() == PAN_LENGTH);
		assertTrue (storageItem.getEncoding().equalsIgnoreCase("ASCII"));
		assertTrue (storageItem.getDataType().equalsIgnoreCase("NUMBER"));
		assertTrue (storageItem.getValue().equalsIgnoreCase("4501250000000005"));
		
		assertNotNull("storageDb is null", storageDb);
		
		storageDb.add(storageItem);
*/		
		assertTrue("storageDb has 1 item", storageDb.size() == 1);
		
		de002RuleImpl = new DE002RuleImpl(id, usageDb, storageDb);
		
		assertNotNull("DE002 Rule is null", de002RuleImpl);
		
	}
	/***************************************************************
	 ***************************************************************/
	@Before
	public void getTransactionMessageTest() {

		System.out.println();
		System.out.println("-----> @Before:      getTransactionMessageTest () <-----");
		
		int id = 1;
		String tagTrans = "PANt";
		String accountNumber = "4501250000000005";
		
		usageTrans = new Usage( 1
			       		      , COURIER_SYSTEM
			       		      , AMERICAN_REGION
			       		      , AIRLINE_PLATFORM
			       		      , MSG_TYPE_0100
			       		      , MANDATORY_ECHO_STATUS
							  );
		
		 assertNotNull("usageTrans is null", usageTrans);
		
		 assertTrue ("hello",usageTrans.getId() == id);
		 assertTrue (usageTrans.getSystem().equalsIgnoreCase("COURIER"));
		 assertTrue (usageTrans.getRegion().equalsIgnoreCase("AMERICAN"));
		 assertTrue (usageTrans.getPlatform().equalsIgnoreCase("AIRLINE"));
		 assertTrue (usageTrans.getMessageType().equalsIgnoreCase("0100"));
		 assertTrue (usageTrans.getStatus().equalsIgnoreCase("MANDATORY_ECHO"));
/*		 
			StorageDE002 storageItem = new StorageDE002( 1
			           									, tagTrans
			           									, PAN_LENGTH
			           									, ASCII_ENCODING
			           									, NUMBER_DATATYPE
			           									, accountNumber
			           									,"450125"
			           									,"450126"
			           									,"3"
			           									,accountNumber
			 		   									);

		 assertNotNull("storageItem is null", storageItem);
			
		 assertTrue (storageItem.getId() == id);
		 assertTrue (storageItem.getTag().equalsIgnoreCase("PANt"));
		 assertTrue (storageItem.getLength() == PAN_LENGTH);
		 assertTrue (storageItem.getEncoding().equalsIgnoreCase("ASCII"));
		 assertTrue (storageItem.getDataType().equalsIgnoreCase("NUMBER"));
		 assertTrue (storageItem.getValue().equalsIgnoreCase("4501250000000005"));
		 
		 assertNotNull("storageTrans is null", storageTrans);
		 
		 storageTrans.add(storageItem);
*/		
		 assertTrue("storageTrans has 1 item", storageTrans.size() == 1);

/*
		DE002Impl (int id
				 , Usage usage
				 , List<Storage> storage
				 , String startBIN
				 , String endBIN
				 , String pAN
				 , String checkDigit
				 )		 
 
		 
		 de002Impl = new DE002Impl( id
				 				  , usageTrans
				 				  , storageTrans
				 				  , "450125"
				 				  , "450126"
				 				  , accountNumber
				 				  , "3"
				 				  );
		
		 assertNotNull("de002Impl is null", de002Impl);
*/		
	}
	/***************************************************************
	 ***************************************************************/
	@Test
	public void applyElementRuleTest() {
		
		System.out.println("-----> @Test:        applyElementRuleTest ()      <-----");
		
		int id = 1;
		
		assertNotNull("DE002 is null", de002Impl);
		assertNotNull("DE002 Rule is null", de002RuleImpl);
		
		response = de002RuleImpl.validateRules( de002Impl.getUsage()
											  , 0
											  , de002Impl.getStorage() );	// <-- needs to be type DE002
		
		assertNotNull("response is null", response);
		assertNotNull("response.getUsage() is null", response.getUsage());
		assertNotNull("response.getUsage().getSystem() is null", response.getUsage().getSystem());
		
		//System.out.println("System = " + response.getUsage().getSystem());
		
		assertTrue(response.getUsage().getId() == id);
		assertTrue(response.getUsage().getSystem().equalsIgnoreCase("COURIER"));
		assertTrue(response.getUsage().getRegion().equalsIgnoreCase("AMERICAN"));
		assertTrue(response.getUsage().getPlatform().equalsIgnoreCase("AIRLINE"));
		assertTrue(response.getUsage().getMessageType().equalsIgnoreCase("0100"));
		assertTrue(response.getUsage().getStatus().equalsIgnoreCase("MANDATORY_ECHO"));
		
		assertTrue (response.getStorage().getId() == id);
		assertTrue (response.getStorage().getTag().equalsIgnoreCase("PANt"));
		assertTrue (response.getStorage().getLength() == PAN_LENGTH);
		assertTrue (response.getStorage().getEncoding().equalsIgnoreCase("ASCII"));
		assertTrue (response.getStorage().getDataType().equalsIgnoreCase("NUMBER"));
		assertTrue (response.getStorage().getValue().equalsIgnoreCase("4501250000000005"));
		 
		//System.out.println("Code = " + response.getResponseCode());
		 
		//assertTrue (response.getResponseCode() == 10);
		 
		displayResponseTest (response);
			
	}
	/***************************************************************
	 ***************************************************************/	
	@After
	public void noMethodTest1 () {
		
		System.out.println();
		System.out.println("-----> @After:       noMethodTest1 ()             <-----");
		
	}
	/***************************************************************
	 ***************************************************************/	
	public static void displayResponseTest (Response response) {
		
		int index = 0;
		
		System.out.println("-----> Subordinate:  displayResponseTest ()       <-----");
		System.out.println();
		
		BitSet de001 = getBitMap();
			
		assertNotNull("Retrieved bitmap is null", de001);
			
		System.out.println(" Usage ID........................" + index + " = " + response.getUsage().getId());
		System.out.println();
 					
		System.out.println(" Usage System...................." + index + " = " + response.getUsage().getSystem());
		System.out.println(" Usage System Response..........." + index + " = " + response.getUsageRc().getSystemRC());
					
		System.out.println(" Usage Region...................." + index + " = " + response.getUsage().getRegion()); 
		System.out.println(" Usage Region Response..........." + index + " = " + response.getUsageRc().getRegionRC()); 
					
		System.out.println(" Usage Platform.................." + index + " = " + response.getUsage().getPlatform());
		System.out.println(" Usage Platform Response........." + index + " = " + response.getUsageRc().getPlatformRC());
					
		System.out.println(" Usage Msg Type.................." + index + " = " + response.getUsage().getMessageType());
		System.out.println(" Usage Msg Type Response........." + index + " = " + response.getUsageRc().getMessageTypeRC());
					
		System.out.println(" Usage DE Status................." + index + " = " + response.getUsage().getStatus());
		System.out.println(" Usage DE Status Response........" + index + " = " + response.getUsageRc().getStatusRC());
					
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		System.out.println(" Storage ID......................" + index + " = " + response.getStorage().getId());
		System.out.println();				
		System.out.println(" Impl Storage Tag................" + index + " = " + response.getStorage().getTag()); 
		System.out.println(" Impl Storage Tag Response......." + index + " = " + response.getStorageRc().getTagRC());
					
		System.out.println(" Storage Length.................." + index + " = " + response.getStorage().getLength());
		System.out.println(" Storage Length Response........." + index + " = " + response.getStorageRc().getLengthRC());
					
		System.out.println(" Storage Encoding................" + index + " = " + response.getStorage().getEncoding());
		System.out.println(" Storage Encoding Response......." + index + " = " + response.getStorageRc().getEncodingRC());
					
		System.out.println(" Storage Data Type..............." + index + " = " + response.getStorage().getDataType()); 
		System.out.println(" Storage Data Type Response......" + index + " = " + response.getStorageRc().getDataTypeRC()); 
					
		System.out.println(" Storage Value..................." + index + " = " + response.getStorage().getValue());
		System.out.println(" Storage Value Response.........." + index + " = " + response.getStorageRc().getValueRC());

		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
//		response = checkBINRange		(response,usage,index, storageDE002Array);
		
		System.out.println(" DE002 checkBINRange............." + index + " = " + response.getStorage().getValue());
		System.out.println(" DE002 checkBINRange Response...." + index + " = " + response.getStorageRc().getValueRC());
		
//		response = validateCheckDigit	(response,usage,index, storageDE002Array);
		
		System.out.println(" DE002 validateCheckDigit........" + index + " = " + response.getStorage().getValue());
		System.out.println(" DE002 validateCheckDigit Respon." + index + " = " + response.getStorageRc().getValueRC());
		
//		response = checkPAN				(response,usage,index, storageDE002Array);
		
		System.out.println(" DE002 checkPAN.................." + index + " = " + response.getStorage().getValue());
		System.out.println(" DE002 checkPAN Response........." + index + " = " + response.getStorageRc().getValueRC());
		
	}
	/***************************************************************
	 ***************************************************************/	
	@AfterClass
	public static void noMethodTest2 () {
		
		System.out.println();
		System.out.println("-----> @AfterClass:  noMethodTest2 ()             <-----");
		System.out.println();
	}
}
