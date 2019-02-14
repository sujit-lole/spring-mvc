package com.luv2code.autowireByConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		FortuneImplementations ft = context.getBean("fstImpl", FortuneImplementations.class);

		ft.display();

		context.close();
	}

}
