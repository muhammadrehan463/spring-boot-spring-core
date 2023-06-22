package com.practiceapp.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice base ball evrey morning.. ";
    }
}
