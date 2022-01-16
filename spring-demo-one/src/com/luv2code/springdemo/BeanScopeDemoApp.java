package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
		Coach alphaCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
		
		//check if they are the same
		
		boolean result = (theCoach == alphaCoach) ? true: false;  
		System.out.println("Pointing to the same object: " + result);  
		
		System.out.println("Memory location for theCoach"+theCoach);
		System.out.println("Memory location for alphaCoach"+alphaCoach);
		
		classPathXmlApplicationContext.close();
	}

}
