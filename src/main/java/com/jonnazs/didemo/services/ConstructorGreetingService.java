package com.jonnazs.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hi, I was injected using a constructor";
    }
}
