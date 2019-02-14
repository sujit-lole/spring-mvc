package com.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl {

	private FortuneService fs;

	// autowire by any method with any name

	@Autowired
	public void anyMethodName(FortuneService fs) {
		this.fs = fs;
	}

	public void displayFortune() {
		System.out.println(fs.getDailyFortune());
	}

}
