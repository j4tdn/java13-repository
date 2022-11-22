package javaot.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// step 2: create advice
public class MovieAspectBeforeAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("...........................");
		System.out.println(">>>>>>>>>>>>>> MovieAspectBeforeAdvice#before " + method.getName());
		System.out.println("...........................");
	}

	
}
