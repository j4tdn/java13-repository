package javaot.config;

import org.springframework.context.annotation.Bean;

import javaot.aspect.MovieLogAspect;
import javaot.service.MovieService;
import javaot.service.MovieServiceImpl;

public class MovieAspectConfig {
	@Bean
	public MovieService movieService() {
		return new MovieServiceImpl();
	}
	
	@Bean
	public MovieLogAspect movieLogAspect() {
		return new MovieLogAspect();
	}

}
