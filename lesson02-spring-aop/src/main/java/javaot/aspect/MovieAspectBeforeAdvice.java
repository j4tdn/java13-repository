package javaot.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Step 2: Create Advice 
// Advice invoked before a method is invoked. 
// Such advice cannot prevent the method call proceeding, unless they throw a Throwable.
public class MovieAspectBeforeAdvice implements MethodBeforeAdvice{

	/**
	 * method --> join point method  info
	 * args   --> list args of join point
	 * target --> proxy ..
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(".................");
		System.out.println(">>>>>>>>>>> MovieAspectBeforeAdvice#before " + method.getName());
		System.out.println(".................");
	}
	
}
