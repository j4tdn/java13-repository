package javaot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javaot.aspect.MovieLogAspect;
import javaot.service.MovieService;
import javaot.service.MovieServiceImpl;

@Configuration
public class MovieAspectConfig {
	
	@Bean
	public MovieService movieService() {
		// JoinPoint
		return new MovieServiceImpl();
	}
	
	@Bean
	public MovieLogAspect movieLogAspect() {
		// Advisor(Advice, PointCut)
		return new MovieLogAspect();
	}
	
}
