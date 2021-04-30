package com.klam.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your free kicks";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
