package com.practiceapp.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Pactice 5 times a week..";
    }
}
