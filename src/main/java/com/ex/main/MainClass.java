package com.ex.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex.event.EventService;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		EventService eventService = (EventService) applicationContext.getBean("awesomeBean");

		//print name of method
		eventService.shortMethod("Elyse is sick");
		System.out.println();

		eventService.mediumMethod("She needs a doctor");
		System.out.println();

		eventService.longMethod("haha she dead");


		
		
	}
}
