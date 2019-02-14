package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		FortuneServiceImpl ftn = context.getBean("fortuneServiceImpl", FortuneServiceImpl.class);

		ftn.displayFortune();

		context.close();

	}

}
