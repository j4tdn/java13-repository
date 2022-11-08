package javaot.demo;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaot.config.AppConfig;
import javaot.utils.ContextUtils;

public class AppDemo {
	private static Class<AppConfig> LOCATION = AppConfig.class;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LOCATION);
		System.out.println("===============");
		ContextUtils.ShowBeansName(context);
		context.close();
	}
}
