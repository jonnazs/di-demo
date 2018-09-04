package com.jonnazs.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryEglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the primary greeting service";
    }
}
