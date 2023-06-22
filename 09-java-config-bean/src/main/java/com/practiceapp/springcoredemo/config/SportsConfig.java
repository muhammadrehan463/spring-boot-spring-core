package com.practiceapp.springcoredemo.config;

import com.practiceapp.springcoredemo.common.SwimCoach;
import com.practiceapp.springcoredemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    //Giving custom bean id
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
