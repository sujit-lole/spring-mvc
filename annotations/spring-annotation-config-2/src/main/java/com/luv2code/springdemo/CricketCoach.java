package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton") // default
public class CricketCoach implements Coach {

	public CricketCoach() {
		super();
		System.out.println("This method calls when beans created...");
	}

	@Override
	public void dailyWorkout() {
		System.out.println("Do the daily practice..");
	}

//	@pre
	public void initMethod() {
		System.out.println("init method");
	}

	public void destroyMethod() {
		System.out.println("destroy method");
	}

}
