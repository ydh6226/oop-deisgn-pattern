package com.example.beancollections.greet;

import com.google.common.base.Preconditions;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class GreetChain {

    private final List<Greet> greets = new ArrayList<>();

    public void say() {
        greets.forEach(Greet::say);
    }

    public void say(Class<?> target) {
        checkArgument(Greet.class.isAssignableFrom(target), "지원하지 않는 타입입니다.");

        greets.stream()
                .filter(g -> g.support(target))
                .findAny()
                .ifPresent(Greet::say);
    }

    public GreetChain register(Greet greet) {
        greets.add(greet);
        return this;
    }
}
