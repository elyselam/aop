package com.ex.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EventAspect {
	
	@Before("execution(* com.ex.event.EventService.short*(..))")
	public void setup(JoinPoint jp){

		long start = System.nanoTime();
		long finish = System.nanoTime();
		long executionTime = finish - start;

		System.out.println("shortMethod");
		System.out.println("type: "+ getClass().getName());
		System.out.println("Method Execution Time: " + executionTime + " seconds");
	}
	
//	@Around("execution(* com.ex.event.EventService.run*(..))")
//	public void testAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
//
//		System.out.println("Set up rides");
//
//		pjp.proceed(); //method runs
//
//		System.out.println("Clean up rides");
//
//	}
	
	
	
}
