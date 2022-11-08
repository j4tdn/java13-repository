package javaot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javaot.service.MovieRecommender;

@Configuration
public class AppConfig {
//// ==> metabean.xml
//	
//	
//	// ==> <bean id="mvr" class="...MovieRecommender">
	@Bean("recommend")
	public MovieRecommender mvr() {
		return new MovieRecommender();
	}
}
