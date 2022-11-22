package javaot.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MovieAspectAroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("...................");
		System.out.println(">>>>>>>>>> Advice Before #" + invocation.getMethod().getName());
		System.out.println("...................");
		
		Object res = invocation.proceed();
	
		System.out.println("...................");
		System.out.println(">>>>>>>>>> Advice After #" + invocation.getMethod().getName());
		System.out.println("...................");
		
		return res;
	}
	
}
