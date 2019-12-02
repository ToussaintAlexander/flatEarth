package com.region08.association.scheme;

//import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.BaseMatcher.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.region08.association.scheme.config.SchemeConfig;
import com.region08.association.scheme.model.SchemeBean;
import com.region08.association.scheme.service.SchemeService;

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
@ContextConfiguration(classes=SchemeConfig.class,loader=AnnotationConfigContextLoader.class)
public class SchemeServiceTest {
	
	@Autowired
	private SchemeService schemeService;

	@BeforeClass
	public static void setUp() {
		System.out.println("-----> @BeforeClass: Setup <-----");
	}
	//------------------------------------------------------------------------------------
	@Test
	public void testSampleService() {
		assertEquals("class com.region08.association.scheme.service.SchemeServiceImpl"
				    ,this.schemeService.getClass().toString());
	}
	//------------------------------------------------------------------------------------
	@Test
	public void testSchemeServiceGetId() {
		assertEquals(schemeService.getId(), 1234);
	}
	@Test
	public void testSchemeServiceGetName() {
		assertTrue(schemeService.getName().contains("Name:"));
	}	
	@Test
	public void testSchemeServiceGetIndustry() {
		assertTrue(schemeService.getIndustry().contains("Street:"));
	}	
	@Test
	public void testSchemeServiceGetCity() {
		assertTrue(schemeService.getCity().contains("City:"));
	}	
	@Test
	public void testSchemeServiceGetState() {
		assertTrue(schemeService.getState().contains("State:"));
	}	
	@Test
	public void testSchemeServiceGetCountry() {
		assertTrue(schemeService.getCountry().contains("Country:"));
	}	
	@Test
	public void testSchemeServiceGetZipCode() {
		assertTrue(schemeService.getZipCode().contains("Zip Code:"));
	}	
	@Test
	public void testSchemeServiceGetPhoneNumber() {
		assertTrue(schemeService.getPhoneNumber().contains("Phone Number:"));
	}	
	@Test
	public void testSchemeServiceGetCreateUser() {
		assertTrue(schemeService.getCreateUser().contains("Create User:"));
	}	
	@Test
	public void testSchemeServiceGetCreateTimestamp() {
		assertTrue(schemeService.getCreateTimestamp().contains("Create Timestamp:"));
	}	
	@Test
	public void testSchemeServiceGetModifyUser() {
		assertTrue(schemeService.getModifyUser().contains("Modify User:"));
	}	
	@Test
	public void testSchemeServiceModifyTimestamp() {
		assertTrue(schemeService.getModifyTimestamp().contains("Modify Timestamp:"));
	}	
	//------------------------------------------------------------------------------------
	@Test
	public void testSampleServiceCreateNewOrder() {
		
		SchemeBean existingScheme = new SchemeBean();
		
		existingScheme.setId(1234);
		existingScheme.setCompany("Visa International");
		existingScheme.setIndustry("900 Metro Center Blvd");
		existingScheme.setCity("Foster City");
		existingScheme.setState("CA");
		existingScheme.setCountry("840");
		existingScheme.setProducts("94404");
		existingScheme.setWebsite("6504323200");
		existingScheme.setCreateUser("TALEXAND");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		existingScheme.setCreateTimestamp(timestamp);
		existingScheme.setModifyUser("TALEXAND");
		existingScheme.setModifyTimestamp(timestamp);
		
		if(existingScheme != null) {
			
			assertThat(schemeService.createScheme(existingScheme), instanceOf(SchemeBean.class));
			
			assertNotNull("ID isn't null", existingScheme.getId());
			assertNotNull("Name isn't null", existingScheme.getCompany());
			assertNotNull("Street isn't null", existingScheme.getIndustry());
			assertNotNull("City isn't null", existingScheme.getCity());
			assertNotNull("State isn't null", existingScheme.getState());
			assertNotNull("Country isn't null", existingScheme.getCountry());
			assertNotNull("Zip Code isn't null", existingScheme.getProducts());
			assertNotNull("Phone Number isn't null", existingScheme.getWebsite());
			assertNotNull("Create User isn't null", existingScheme.getCreateUser());
			assertNotNull("Create Timestamp isn't null", existingScheme.getCreateTimestamp());
			assertNotNull("Modify User isn't null", existingScheme.getModifyUser());
			assertNotNull("Modify Timestamp isn't null", existingScheme.getModifyTimestamp());
		}
		
		assertNotNull("New Order is not null", existingScheme);
		
	}
	//------------------------------------------------------------------------------------
	@AfterClass
	public static void afterTest() {
		System.out.println("-----> @AfterClass: Destroy <-----");
	}
}
