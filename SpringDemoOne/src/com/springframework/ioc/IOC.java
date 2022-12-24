package com.springframework.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * configuring spring container 
 * 
 * XML configuration
 * Java Annotations
 * Java Source Code
 * 
 */

public class IOC {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext  =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cricket coach = applicationContext.getBean("myCoach",Cricket.class);
			coach.practice();
		 System.out.println(coach.getDailyFortune());	
		 System.out.println(coach.getEmail());
		 System.out.println(coach.getTeam());
	 
	 
	 Tennis coach1 = applicationContext.getBean("mySetterCoach",Tennis.class);
		 coach1.practice();
		 System.out.println(coach1.getDailyFortune());
		 System.out.println(coach1.getEmailAdress());
		 System.out.println(coach1.getTeam());
		
		 
		applicationContext.close();
	}

}
