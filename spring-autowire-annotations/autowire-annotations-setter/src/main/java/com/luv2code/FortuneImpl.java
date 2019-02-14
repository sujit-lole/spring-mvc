package com.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FortuneImpl {

	private FortuneService fs;

	// autowire by setter

	@Autowired
	public void setFs(FortuneService fs) {
		this.fs = fs;
	}

	public void displayFortune() {
		System.out.println(fs.getDailyFortune());
	}

}
