package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		classPathXmlApplicationContext.close();
	}

}
