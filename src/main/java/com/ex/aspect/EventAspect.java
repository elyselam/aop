package com.ex.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EventAspect {
	
//	@Before("execution(* com.ex.event.EventService.short*(..))")
//	public void setup(JoinPoint jp){
//
//		long start = System.currentTimeMillis();
//		long finish = System.currentTimeMillis();
//		long executionTime = finish - start;
//
//		System.out.println("shortMethod");
//		System.out.println("type: "+ getClass().getName());
//
//		System.out.println("Method Execution Time: " + executionTime + " seconds");
//	}
	
	@Around("execution(* com.ex.event.EventService.*(..))")
	public void testAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{


		Object[] args = pjp.getArgs();
		System.out.println(args);


		long start = System.currentTimeMillis();

		pjp.proceed(); //method runs

		System.out.println(pjp.getSignature().getName());




		System.out.println("type: "+ args);
		long finish = System.currentTimeMillis();
		long executionTime = finish - start;
		System.out.println("Method Execution Time: " + executionTime + " seconds");

	}
	
	
	
}
