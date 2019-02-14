package com.luv2code.autowireByConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fstImpl")
public class FortuneImplementations {
	private FortuneService fortuenService;
	// by constructor autowire

	@Autowired
	public FortuneImplementations(FortuneService fortuenService) {
		super();
		this.fortuenService = fortuenService;
	}

	public void display() {
		fortuenService.getDailyFortune();
	}
}
