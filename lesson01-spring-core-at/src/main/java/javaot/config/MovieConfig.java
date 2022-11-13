package javaot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javaot.common.Catalog;
import javaot.service.MovieCatalog;

public class MovieConfig {
	
    // <=> <bean id="mvr" class="MovieRecommender.class"></bean>
//  @Bean
//  public MovieRecommender mvr(){
//      return new MovieRecommender();
//  }
	
	@Bean
//	@Primary => not motivated
	@Scope("prototype")
	public MovieCatalog actionMovie() {
		return new MovieCatalog(Catalog.ACTION);
	}
	
	@Bean
	@Scope("singleton")
	public MovieCatalog adventureMovie() {
		return new MovieCatalog(Catalog.ADVENTURE);
	}
}
