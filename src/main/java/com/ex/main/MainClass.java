package com.ex.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex.event.EventService;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		EventService eventService = (EventService) applicationContext.getBean("awesomeBean");

		//print name of method
		eventService.shortMethod();
		System.out.println();

//		//print value: Hello World, type: param sent to method
//		eventService.playConcert();
//		System.out.println();
//
//		//print Method Execution Time: seconds
//		eventService.runAmusementPark();



		
		
	}
}
