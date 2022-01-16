package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 metres as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public void doMyStartupStuff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doMyCleanUpStuffYoyo() {
		// TODO Auto-generated method stub

	}

}
