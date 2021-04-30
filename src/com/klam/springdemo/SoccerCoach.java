package com.klam.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class SoccerCoach implements Coach {
	
	
	//Field level injection
	//@Autowired
	//@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: inside default constructor");
	
	}
	
	//define a setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> SoccerCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/	
	
	
	/* Constructor Injection
	@Autowired
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your free kicks";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
