package com.practiceapp.springcoredemo.common;

import com.practiceapp.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling 15 minutes daily";
    }
}
