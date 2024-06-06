package com.nampham.springcoredemo.config;

import com.nampham.springcoredemo.common.Coach;
import com.nampham.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
