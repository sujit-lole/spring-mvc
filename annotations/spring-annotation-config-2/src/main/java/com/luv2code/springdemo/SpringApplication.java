package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c = context.getBean("cricketCoach", Coach.class);

		Coach d = context.getBean("cricketCoach", Coach.class);
		c.dailyWorkout();

		boolean flag = c == d;
		System.out.println("Both beans are equal[Y/N] : " + flag);

		System.out.println("Bean c Reference : " + c);
		System.out.println("Bean d Reference : " + d);
		context.close();
	}

}
