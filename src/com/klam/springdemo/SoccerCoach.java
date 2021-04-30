package com.klam.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice your free kicks";
	}

}
