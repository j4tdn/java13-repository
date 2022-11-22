package javaot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MovieLogAspect {
	@Pointcut("execution(* javaot.service.MovieService.add*(..))")
	public void MovieServicePointCut(){};


	@Before("MovieServicePointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("MovieLogAspect - Before ........."  + joinPoint.getSignature().getName());
	}
	
	@After("MovieServicePointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("MovieLogAspect - After ........." + joinPoint.getSignature().getName());
	}
	
}
