package com.keshav.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{}
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it :" + fortuneService.getFortune();
	}
	
	//Add an init method
	public void doMyStartupStuff(){
		System.out.println("Inside init method");
	}
	

	
	//Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("Inside destroy method");
	}
	
}
