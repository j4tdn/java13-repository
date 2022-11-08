package javaot.utils;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

public class ContextUtils {

	public ContextUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static String[] getBeansName(ApplicationContext context) {
		return context.getBeanDefinitionNames();
	}
	
//	show ids of beans in current context(container)
	public static void ShowBeansName(ApplicationContext context) {
		System.out.println(Arrays.toString(getBeansName(context)));
	}
}
