package com.luv2code.autowire.example1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("hfs")
public class HappyFortuneService implements FortuneService {

	private String[] fortune = { "You are lucky man!", "Have nice day sir!", "Extermly happy to meet you sir!",
			"Fantastic! You are looking gogious", "Oh! dear you are looking very beautiful.." };
	private Random random = new Random();

	@Override
	public String getDailyFortune() {
		return fortune[random.nextInt(fortune.length) + 0];
	}

}
