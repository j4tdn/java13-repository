package javaot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javaot.common.Catalog;
import javaot.service.MovieCatalog;

// <beans> --> factory.xml
// place to declare/configure bean
@Configuration
public class MovieConfig {
	// @Primary
	
	@Bean
	@Scope("prototype")
	public MovieCatalog initActionMovie() {
		return new MovieCatalog(Catalog.ACTION);
	}
	
	@Bean
	@Scope("singleton")
	public MovieCatalog initAdventureMovie() {
		return new MovieCatalog(Catalog.ADVENTURE);
	}
	
	// ==> <bean id="mvr" class="...MovieRecommender">
	/*
	@Bean
	public MovieRecommender mvr() {
		return new MovieRecommender();
	}
	*/
}
