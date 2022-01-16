package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	

	public TrackCoach() {
	}
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it "+fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Track coach: Inside doMyStartupStuff method");
	}
	
	//add a destroy method
	public void doMyCleanUpStuffYoyo() {
		System.out.println("Track coach: Inside doMyCleanUpStuffYoyo method");
	}
}
