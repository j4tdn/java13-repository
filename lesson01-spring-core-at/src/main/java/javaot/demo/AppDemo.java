package javaot.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaot.config.AppConfig;
import javaot.service.MovieRecommender;
import javaot.utils.ContextUtils;

public class AppDemo {
	private static Class<AppConfig> LOCATION = AppConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LOCATION);

		ContextUtils.showBeansName(context);
//        MovieRecommender mr = context.getBean("mvr", MovieRecommender.class);
//        mr.recommend();

		MovieRecommender mr = context.getBean("movieRecommender", MovieRecommender.class);
		mr.getMovieCatalog().showMovie();
		context.close();
	}
}
