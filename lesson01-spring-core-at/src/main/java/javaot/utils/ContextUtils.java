package javaot.utils;

import org.springframework.context.ApplicationContext;

import java.util.Arrays;

public class ContextUtils {
    private ContextUtils(){

    }

    public static String[] getBeansName(ApplicationContext context){
        return context.getBeanDefinitionNames();
    }

    public static void showBeansName(ApplicationContext context){
        Arrays.stream(getBeansName(context)).forEach(System.out::println);
    }
}
