package com.ex.event;

import org.springframework.stereotype.Component;

@Component(value="awesomeBean")
public class EventService {


	
	public void shortMethod(){
		System.out.println("shortMethod");
		System.out.println("");

	}
//
	public void mediumMethod(){
		System.out.println("---------------------");
        System.out.println("mediumMethod");
        System.out.println("");

	}

	public void longMethod(){
		System.out.println("---------------------");

		System.out.println("longMethod");
		System.out.println("");
	}
	
}
