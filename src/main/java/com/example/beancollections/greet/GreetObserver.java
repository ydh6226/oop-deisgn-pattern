package com.example.beancollections.greet;

public interface GreetObserver {

    boolean support(Class<? extends GreetObserver> greet);

    void say();
}
