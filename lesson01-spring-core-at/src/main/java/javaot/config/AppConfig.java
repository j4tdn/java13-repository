package javaot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javaot.service.MovieRecommender;


//==> meta-beans.xml
//==> default --> scan in current package
@Configuration
public class AppConfig {
	// ==> <bean id="mvr" class="...MovieRecommender">
		@Bean("recommend")
		public MovieRecommender mvr() {
			return new MovieRecommender();
		}
	
}
