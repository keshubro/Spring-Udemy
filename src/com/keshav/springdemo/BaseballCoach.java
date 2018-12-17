package com.keshav.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach()
	{
		
	}
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout()
	{
		return "Spend 30 mins for baseball practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
