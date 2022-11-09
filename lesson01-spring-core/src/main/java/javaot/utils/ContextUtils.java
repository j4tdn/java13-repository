package javaot.utils;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

public class ContextUtils {
	private ContextUtils() {
	}
	
	public static String[] getBeansName(ApplicationContext context) {
		return context.getBeanDefinitionNames();
	}
	
	/**
	 * Show id of beans in current context(container)
	 */
	public static void showBeansName(ApplicationContext context) {
		System.out.println(Arrays.toString(getBeansName(context)));
	}
}
