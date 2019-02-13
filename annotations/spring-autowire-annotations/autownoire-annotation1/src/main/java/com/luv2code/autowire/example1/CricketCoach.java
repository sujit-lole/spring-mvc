package com.luv2code.autowire.example1;

import org.springframework.beans.factory.annotation.Autowired;

public class CricketCoach implements Coach {

	FortuneService fortune;

	@Autowired
	public CricketCoach(FortuneService fortune) {
		super();
		System.out.println("I am inside cricket constructor");
		this.fortune = fortune;
	}

	@Override
	public void getDailyWorkOut() {
		System.out.println("You have work hard buddy!");

		System.out.println(fortune.getDailyFortune());
	}

}
