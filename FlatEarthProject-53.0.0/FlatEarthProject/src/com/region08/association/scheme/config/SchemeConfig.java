package com.region08.association.scheme.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.region08.association.scheme.service.SchemeService;
import com.region08.association.scheme.service.SchemeServiceImpl;

/**************************************************************************
 * Spring JavaConfig
 * 
 * The central artifact in Spring JavaConfig is the @Configuration-annotated 
 * class. These classes consist principally of @Bean-annotated methods that 
 * define instantiation, configuration, and initialization logic for objects 
 * that will be managed by the Spring IoC container.
 * 
 * @Configuration
 * 
 * Annotating a class with the @Configuration indicates that the class may 
 * be used by JavaConfig as a source of bean definitions.
 **************************************************************************
 */

@Configuration
public class SchemeConfig {
	@Bean
	public SchemeService getSampleService() {
		return new SchemeServiceImpl();
	}
}
