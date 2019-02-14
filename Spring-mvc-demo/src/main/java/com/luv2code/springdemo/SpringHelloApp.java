package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load spring config. file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from container
		Coach c = context.getBean("myCouch", Coach.class);
		// call methods on beans

		System.out.println(c.getDailyWorkout());
		c.getFortune();
		// cse the context

		context.close();
	}

}
