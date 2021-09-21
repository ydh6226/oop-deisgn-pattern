package com.example.beancollections.greet;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Hello implements Greet {


    @Override
    public boolean support(Class<?> greet) {
        return Hello.class.isAssignableFrom(greet);
    }

    @Override
    public void say() {
        log.info("hello");
    }
}