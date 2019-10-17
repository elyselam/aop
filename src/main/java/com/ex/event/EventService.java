package com.ex.event;

import org.omg.CORBA.TIMEOUT;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component(value="awesomeBean")
public class EventService {


	
	public void shortMethod(String string){
		System.out.println("shortMethod");
		System.out.println("");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
//
	public void mediumMethod(String string){
		System.out.println("---------------------");
        System.out.println("mediumMethod");
        System.out.println("");

        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

	public void longMethod(String string){
		System.out.println("---------------------");

		System.out.println("longMethod");
		System.out.println("");

        try {
            TimeUnit.SECONDS.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
}
