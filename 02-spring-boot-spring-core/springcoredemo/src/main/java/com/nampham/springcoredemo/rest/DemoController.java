package com.nampham.springcoredemo.rest;

import com.nampham.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    //define constructor
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach myCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;

    }


    // setter injection
    /*@Autowired
    public void setCoach(Coach coach){
        this.myCoach = coach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}

