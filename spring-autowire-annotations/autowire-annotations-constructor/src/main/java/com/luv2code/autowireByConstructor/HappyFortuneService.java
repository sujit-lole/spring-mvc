package com.luv2code.autowireByConstructor;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public void getDailyFortune() {
		System.out.println("Have nice day to you...");
	}

}
