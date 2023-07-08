package javaot.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaot.config.AppConfig;
import javaot.service.MovieService;

public class AspectAppDemo {
	
	private static final Class<?> LOCATION = AppConfig.class;
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LOCATION);
		
		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.addMovie();
		
		context.close();
	}
}
