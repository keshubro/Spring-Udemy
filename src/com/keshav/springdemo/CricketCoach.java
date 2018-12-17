package com.keshav.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		
	}
	
	
	//Create a setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
