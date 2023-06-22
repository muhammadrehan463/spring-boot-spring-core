package com.practiceapp.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    public BasketBallCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice basket ball evrey evening 1 hr..";
    }
}
