package com.example.beancollections;

import com.example.beancollections.greet.GreetChain;
import com.example.beancollections.greet.Hello;
import com.example.beancollections.greet.Hi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final GreetChain greetChain;

    @GetMapping("/")
    public void home() {
        greetChain.say(Hi.class);
    }
}
