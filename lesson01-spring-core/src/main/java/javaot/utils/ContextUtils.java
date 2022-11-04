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
        System.out.println(Arrays.toString(getBeansName(context)));
    }
}
