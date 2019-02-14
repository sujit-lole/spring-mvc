package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		FortuneImpl ftn = context.getBean("fortuneImpl", FortuneImpl.class);

		ftn.displayFortune();

		context.close();

	}

}
