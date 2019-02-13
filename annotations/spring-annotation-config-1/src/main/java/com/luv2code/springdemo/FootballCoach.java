package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("football")
public class FootballCoach implements Coach {
	private String name = "Sujit Lole";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dailyWorkout() {
		System.out.println("Do the heavy Excercise for Mr." + getName() + " !");
	}

}
