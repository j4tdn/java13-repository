package javaot.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// Step 2: Create Advice 
// Advice invoked during a method is invoked. 
public class MovieAspectAroundAdvice implements MethodInterceptor{
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("..............");
		System.out.println(">>>>>>>>>>>>> Advice Before # " + invocation.getMethod().getName());
		System.out.println("..............");
		
		Object result = invocation.proceed(); // call join point
		
		System.out.println("..............");
		System.out.println(">>>>>>>>>>>>> Advice After # " + invocation.getMethod().getName());
		System.out.println("..............");
		
		return result;
		
	}
	
}
