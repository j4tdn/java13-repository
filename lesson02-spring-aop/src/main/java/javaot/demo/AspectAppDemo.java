package javaot.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaot.service.MovieService;

public class AspectAppDemo {

	private static final String LOCATION = "aspect-auto-proxy.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);

		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.printName();

		context.close();
	}

}
