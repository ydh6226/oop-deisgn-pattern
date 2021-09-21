package com.example.beancollections.greet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfiguration {

    @Bean
    public GreetObservable greetObservable() {
        return new GreetObservable()
                .subscribe(new Hello())
                .subscribe(new Hi());
    }
}
