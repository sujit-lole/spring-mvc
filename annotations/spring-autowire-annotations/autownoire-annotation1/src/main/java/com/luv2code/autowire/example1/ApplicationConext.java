package com.luv2code.autowire.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationConext {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c = context.getBean("coach", CricketCoach.class);
		c.getDailyWorkOut();
		context.close();
	}

}
