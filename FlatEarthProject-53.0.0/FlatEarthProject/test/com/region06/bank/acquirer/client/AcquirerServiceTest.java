package com.region06.bank.acquirer.client;

//import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.BaseMatcher.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.region06.bank.acquirer.client.config.AcquirerConfig;
import com.region06.bank.acquirer.client.dao.AcquirerDaoImpl;
import com.region06.bank.acquirer.client.model.AcquirerBean;
import com.region06.bank.acquirer.client.service.AcquirerService;

@RunWith(SpringJUnit4ClassRunner.class)

/******************************************************************************************
 * SpringJUnit4ClassRunner
 * 
 * Is a custom extension of JUnit's BlockJUnit4ClassRunner which provides functionality 
 * of the Spring TestContext Framework to standard JUnit tests by means of the 
 * TestContextManager and associated support classes and annotations.
 * 
 * @Autowired
 * 
 * Marks a constructor, field, setter method or config method as to be autowired by 
 * Spring's dependency injection facilities.
 * 
 * - Only one constructor (at max) of any given bean class may carry this annotation, 
 *   indicating the constructor to autowire when used as a Spring bean.
 * - Fields are injected right after construction of a bean, before any config methods 
 *   are invoked.
 * - Config methods may have an arbitrary name and any number of arguments; each of those 
 *   arguments will be autowired with a matching bean in the Spring container. 
 * - In the case of a multi-arg constructor or method, the 'required' parameter is 
 *   applicable to all arguments.
 * - In case of a Collection or Map dependency type, the container autowires all beans 
 *   matching the declared value type.
 * 
 * @ContextConfiguration
 * 
 * Defines class-level metadata that is used to determine how to load and configure an
 * ApplicationContext for integration tests.
 * 
 * Hamcrest Core
 * 
 * Foundation set of matcher implementations for common operations.
******************************************************************************************
*/
@ContextConfiguration(classes=AcquirerConfig.class,loader=AnnotationConfigContextLoader.class)
public class AcquirerServiceTest {
	
	@Autowired
	private AcquirerService acquirerService;
	
	@Autowired
	AcquirerDaoImpl acquirerDao; 

	@BeforeClass
	public static void setUp() {
		System.out.println("-----> @BeforeClass: Setup <-----");
	}
	//------------------------------------------------------------------------------------
	@Test
	public void testAcquirerService() {
		assertEquals("class tst.external.bank.acquirer.service.AcquirerServiceImpl"
				    ,this.acquirerService.getClass().toString());
	}
	//------------------------------------------------------------------------------------
	@Test
	public void testGetAcquirersDao() {
		List<com.region06.bank.acquirer.client.model.AcquirerBean> list = acquirerDao.select();
		assertNotNull(list);
	}
	//------------------------------------------------------------------------------------
	@Test
	public void testAcquirerServiceGetId() {
		assertEquals(acquirerService.getId(), 1234);
	}
	@Test
	public void testAcquirerServiceGetName() {
		assertTrue(acquirerService.getName().contains("Name:"));
	}	
	@Test
	public void testAcquirerServiceGetStreet() {
		assertTrue(acquirerService.getStreet().contains("Street:"));
	}	
	@Test
	public void testAcquirerServiceGetCity() {
		assertTrue(acquirerService.getCity().contains("City:"));
	}	
	@Test
	public void testAcquirerServiceGetState() {
		assertTrue(acquirerService.getState().contains("State:"));
	}	
	@Test
	public void testAcquirerServiceGetCountry() {
		assertTrue(acquirerService.getCountry().contains("Country:"));
	}	
	@Test
	public void testAcquirerServiceGetZipCode() {
		assertTrue(acquirerService.getZipCode().contains("Zip Code:"));
	}	
	@Test
	public void testAcquirerServiceGetPhoneNumber() {
		assertTrue(acquirerService.getPhoneNumber().contains("Phone Number:"));
	}	
	@Test
	public void testAcquirerServiceGetCreateUser() {
		assertTrue(acquirerService.getCreateUser().contains("Create User:"));
	}	
	@Test
	public void testAcquirerServiceGetCreateTimestamp() {
		assertTrue(acquirerService.getCreateTimestamp().contains("Create Timestamp:"));
	}	
	@Test
	public void testAcquirerServiceGetModifyUser() {
		assertTrue(acquirerService.getModifyUser().contains("Modify User:"));
	}	
	@Test
	public void testAcquirerServiceModifyTimestamp() {
		assertTrue(acquirerService.getModifyTimestamp().contains("Modify Timestamp:"));
	}	
	//------------------------------------------------------------------------------------
	@Test
	public void testSampleServiceCreateNewOrder() {
		
		AcquirerBean existingAcquirer = new AcquirerBean();
		
		existingAcquirer.setId(1234);
		existingAcquirer.setName("Visa International");
		existingAcquirer.setStreet("900 Metro Center Blvd");
		existingAcquirer.setCity("Foster City");
		existingAcquirer.setState("CA");
		existingAcquirer.setCountry("840");
		existingAcquirer.setZipCode("94404");
		existingAcquirer.setPhoneNumber("6504323200");
		existingAcquirer.setCreateUser("TALEXAND");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingAcquirer.setCreateTimestamp(timestamp);
		existingAcquirer.setModifyUser("TALEXAND");
		existingAcquirer.setModifyTimestamp(timestamp);
		
		if(existingAcquirer != null) {
			
			assertThat(acquirerService.createAcquirer(existingAcquirer), instanceOf(AcquirerBean.class));
			
			assertNotNull("ID isn't null", existingAcquirer.getId());
			assertNotNull("Name isn't null", existingAcquirer.getName());
			assertNotNull("Street isn't null", existingAcquirer.getStreet());
			assertNotNull("City isn't null", existingAcquirer.getCity());
			assertNotNull("State isn't null", existingAcquirer.getState());
			assertNotNull("Country isn't null", existingAcquirer.getCountry());
			assertNotNull("Zip Code isn't null", existingAcquirer.getZipCode());
			assertNotNull("Phone Number isn't null", existingAcquirer.getPhoneNumber());
			assertNotNull("Create User isn't null", existingAcquirer.getCreateUser());
			assertNotNull("Create Timestamp isn't null", existingAcquirer.getCreateTimestamp());
			assertNotNull("Modify User isn't null", existingAcquirer.getModifyUser());
			assertNotNull("Modify Timestamp isn't null", existingAcquirer.getModifyTimestamp());
		}
		
		assertNotNull("New Order is not null", existingAcquirer);
		
	}
	//------------------------------------------------------------------------------------
	@AfterClass
	public static void afterTest() {
		System.out.println("-----> @AfterClass: Destroy <-----");
	}
}
