package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FourtuneService fortuneService;

	public BaseballCoach(FourtuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public void getFortune() {
		fortuneService.myFourtuneService();
	}
	
	
}
