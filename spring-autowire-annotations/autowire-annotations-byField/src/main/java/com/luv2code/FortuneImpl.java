package com.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FortuneImpl {

	// autowire by field
	@Autowired
	private FortuneService fs;

	public void displayFortune() {
		System.out.println(fs.getDailyFortune());
	}

}
