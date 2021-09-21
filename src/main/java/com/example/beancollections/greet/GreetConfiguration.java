package com.example.beancollections.greet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfiguration {

    @Bean
    public GreetChain greetchain() {
        return new GreetChain()
                .register(new Hello())
                .register(new Hi());
    }
}
