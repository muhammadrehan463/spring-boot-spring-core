package com.practiceapp.springcoredemo.rest;

import com.practiceapp.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach newCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach anotherCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());

        myCoach = theCoach;
        newCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Compairing beans: myCoach == newCoach is: " + (myCoach == newCoach);
    }
}
