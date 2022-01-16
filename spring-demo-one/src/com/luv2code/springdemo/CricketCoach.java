package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddresss;
	private String team;
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public String getEmailAddresss() {
		return emailAddresss;
	}
	public String getTeam() {
		return team;
	}
	public void setEmailAddresss(String emailAddresss) {
		this.emailAddresss = emailAddresss;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("Inside no arg constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
