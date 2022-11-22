package javaot.demo;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaot.service.MovieService;

public class AspectAppDemo {
	private static final String LOCATION = "aspect-auto-proxy.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		MovieService movieService = context.getBean("movieService", MovieService.class);

//		movieService.printCatalog();
		movieService.printName();

//		context.close();
	}

}
